//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * References a file which contains commands.
 * 
 * <p>Java class for CommandFileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandFileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="formalLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandFileType", propOrder = {
    "location",
    "path",
    "uri"
})
public class CommandFileType {

    @XmlElement(name = "Location")
    protected List<String> location;
    @XmlElement(name = "Path")
    protected List<String> path;
    @XmlElement(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected List<String> uri;
    @XmlAttribute(name = "formalLanguage")
    protected String formalLanguage;

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocation() {
        if (location == null) {
            location = new ArrayList<String>();
        }
        return this.location;
    }

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
    }

    /**
     * Gets the value of the uri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURI() {
        if (uri == null) {
            uri = new ArrayList<String>();
        }
        return this.uri;
    }

    /**
     * Gets the value of the formalLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalLanguage() {
        return formalLanguage;
    }

    /**
     * Sets the value of the formalLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalLanguage(String value) {
        this.formalLanguage = value;
    }

}