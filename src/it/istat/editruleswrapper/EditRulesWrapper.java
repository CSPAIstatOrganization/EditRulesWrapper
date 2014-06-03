package it.istat.editruleswrapper;

import ddi.group._3_1.LogicalProductType;
import ddi.instance._3_1.DDIInstanceType;
import ddi.logicalproduct._3_1.VariableSchemeType;
import ddi.logicalproduct._3_1.VariableType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

public class EditRulesWrapper {
    
    public int invocaScript(String fileMetadataPath, String fileDataPath, String fileRulesPath, String outputFilePath){
        
        //******************************************************************************************
        //      controllo l'effettiva esistenza dei file passati in input
        //******************************************************************************************
        
        List<String> listaFileDaControllare = new ArrayList<String>();
        listaFileDaControllare.add(fileMetadataPath);
        listaFileDaControllare.add(fileDataPath);
        listaFileDaControllare.add(fileRulesPath);
        boolean areFileEsistenti = areFileEsistenti(listaFileDaControllare);
        if (!areFileEsistenti){
            System.err.println("One or more files submitted don't exist");
            return Costanti.FILE_INESISTENTI;
        }
        String fileDataWithHeaderPath = creaFileDataWithHeaderPath(fileDataPath);
        String fileOutputPath = "";
        if (outputFilePath == null){
            fileOutputPath = creaFileOutputPath(fileDataPath);
        }else{
            fileOutputPath = outputFilePath;
        }
        
        //******************************************************************************************
        //      creo sul FS una copia dello script R (contenuto nel jar) da richiamare
        //******************************************************************************************
        
        String fileScriptRPath = creaCopiaScriptR(fileDataPath);
        
        //******************************************************************************************
        //      parserizza il file ddi xml di metadati in modo da estrarre i nomi delle colonne
        //******************************************************************************************

        String context = "ddi.instance._3_1:org.w3._1999.xhtml:org.purl.dc.elements._1";
        File fileMetadata = new File(fileMetadataPath);
        JAXBContext jaxbContext;            
        try {
            jaxbContext = JAXBContext.newInstance(context);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement jaxbElement = (JAXBElement) jaxbUnmarshaller.unmarshal(fileMetadata);                 
            DDIInstanceType ddiInstance = (DDIInstanceType) jaxbElement.getValue();
                
//            SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Source sorgente = new JAXBSource(jaxbContext, ddiInstance);
//            Schema schema = sf.newSchema(sorgente);
//            jaxbUnmarshaller.setSchema(schema);
//            jaxbUnmarshaller.setEventHandler(new DefaultValidationEventHandler());
                
            LogicalProductType lpt = ddiInstance.getResourcePackage().get(0).getLogicalProduct().get(0);
            ddi.logicalproduct._3_1.LogicalProductType lpInterno=(ddi.logicalproduct._3_1.LogicalProductType)lpt.getBaseLogicalProduct().getValue();
            VariableSchemeType vst = (VariableSchemeType) lpInterno.getVariableSchemeOrVariableSchemeReference().get(0);
            List<VariableType> listaVt = (List<VariableType>) (List<?>) vst.getVariableOrVariableReference();
            String primaRigaFileData = "";
            String separatore = ";";
            for(VariableType nt : listaVt){
                if (primaRigaFileData.equals("")){
                    primaRigaFileData = primaRigaFileData + nt.getVariableName().get(0).getValue();
                }else{
                    primaRigaFileData = primaRigaFileData + separatore + nt.getVariableName().get(0).getValue();
                }                    
            }
                
            //******************************************************************************************
            //      aggiorna il file di dati aggiungendo la prima riga contenente i nomi delle colonne
            //******************************************************************************************

            //In Java non è possibile modificare un file aggiungendo una riga in testa, il FileSystem non lo permette,
            //per ottenere un effetto equivalente si può:
            //creare un nuovo file
            //scrivere su di esso la "nuova prima riga"
            //copiare il contenuto del vecchio file in append sul nuovo
            //spostare o cancellare il vecchio file
            //copiare il nuovo file nella cartella dove era il vecchio
                
            File fileDataWithHeader = new File(fileDataWithHeaderPath);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDataWithHeader)));
            bw.write(primaRigaFileData);
            File fileData=new File(fileDataPath); 
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileData), "UTF-8"));
            String rigaLetta = null;
            while ((rigaLetta = br.readLine()) != null){
                bw.write("\n");
                bw.write(rigaLetta);                           
            }
            br.close();
            bw.flush();
            bw.close();
            
            //******************************************************************************************
            //      invoca lo script editRules di R
            //******************************************************************************************
           
            Process process = invocaR(fileScriptRPath, fileDataWithHeaderPath, fileRulesPath, fileOutputPath);
            
            File scriptFile = new File(fileScriptRPath);
            scriptFile.delete();
            File dataWithHeaderFile = new File(fileDataWithHeaderPath);
            dataWithHeaderFile.delete();
                
            if (process == null){
                System.err.println("R invocation failed");
                return Costanti.INVOCAZIONE_R_NON_RIUSCITA;
            }
                        
            int exitCode = process.waitFor();
            if(exitCode != 0){   
                System.err.println("Invalid data file and/or rules file submitted or bad R environment config");
                return Costanti.INVALID_DATA_OR_RULES_FILE;
            } 
        
        } catch (UnmarshalException ux) {
            System.err.println("Invalid metadata file submitted");
            //ux.printStackTrace();
            return Costanti.INVALID_METADATA_SET;
        } catch (Exception ex) {
            //ex.printStackTrace();
            return Costanti.ESITO_NEGATIVO;
        }
        
        return Costanti.ESITO_POSITIVO;
        
    }
    
    private Process invocaR(String fileScriptRPath, String fileDataWithHeaderPath, String fileRulesPath, String fileOutputPath) {
        String s;
        try {
            //Process p = Runtime.getRuntime().exec("Rscript C:\\ErrorLocalization.R C:\\dataWithHeader.csv C:\\edit.csv C:\\out.csv"); 
            
            List<String> commandLine = new ArrayList<String>();
            commandLine.add("Rscript");
            commandLine.add(fileScriptRPath);
            commandLine.add(fileDataWithHeaderPath);
            commandLine.add(fileRulesPath);
            commandLine.add(fileOutputPath); 
//            commandLine.add("C:\\ErrorLocalization.R");
//            commandLine.add("C:\\dataWithHeader.csv");
//            commandLine.add("C:\\edit.csv");
//            commandLine.add("C:\\out.csv"); 
            ProcessBuilder pb = new ProcessBuilder(commandLine);
            Process p = pb.start();
            
            // read from the process's stdout
            BufferedReader stdout = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = stdout.readLine()) != null) { 
                System.out.println(s); 
            }
            
            // read from the process's stderr
            BufferedReader stderr = new BufferedReader (new InputStreamReader(p.getErrorStream()));
            while ((s = stderr.readLine()) != null) { 
                //System.err.println(s); 
            }
            
            p.getInputStream().close();
            p.getOutputStream().close();
            p.getErrorStream().close();
            System.err.println("R invocation exit value: " + p.waitFor());
            return p;
        }
        catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }

    private boolean areFileEsistenti(List<String> listaFileDaControllare) {
        int numFileInesistenti = 0;
        for(String pathDelfile : listaFileDaControllare){
            if(!new File(pathDelfile).exists()){
                numFileInesistenti = numFileInesistenti + 1;
            }
        }
        if (numFileInesistenti != 0){
            return false;
        }
        return true;
    }

    private String creaFileDataWithHeaderPath(String fileDataPath) {
        //il file di dati con l'aggiunta dell'header verrà creato nella stessa
        //cartella del file di dati senza l'header
        File f = new File(fileDataPath);
        String path = f.getParent();
        String fileDataWithHeaderPath = path + File.separator + f.getName() + "_WithHeader";
        return fileDataWithHeaderPath;
    }

    private String creaFileOutputPath(String fileDataPath) {
        //il file di output verrà creato nella stessa cartella
        //del file di dati sottomesso dall'utente
        File f = new File(fileDataPath);
        String path = f.getParent();
        String fileOutputPath = path + File.separator + "out.csv";
        return fileOutputPath;
    }
    
    private String creaCopiaScriptR(String fileDataPath){
        String fileScriptRPath="";
	InputStream inputStream = null;
	OutputStream outputStream = null;
 
	try {
            File f = new File(fileDataPath);
            String path = f.getParent();
            inputStream = this.getClass().getResourceAsStream("/ErrorLocalization.R");
            outputStream = new FileOutputStream(new File(path + File.separator + "script.R"));
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
            }
            fileScriptRPath = path + File.separator + "script.R";
            return fileScriptRPath;
	} catch (IOException e) {
            //e.printStackTrace();
            return null;
	} finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }

            }
	}
    
    }
}