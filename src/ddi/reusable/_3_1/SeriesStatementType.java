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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Series statement contains information about the series to which a study unit or group of study units belongs. You may point to the URL of a series repository and then use the Name field to indicate the series itself as identified in that repository. Fields also exist for describing the series and providing abbreviations.
 * 
 * <p>Java class for SeriesStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeriesStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeriesRepositoryLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}SeriesName" maxOccurs="unbounded"/>
 *         &lt;element name="Abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}SeriesDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeriesStatementType", propOrder = {
    "seriesRepositoryLocation",
    "seriesName",
    "abbreviation",
    "seriesDescription"
})
public class SeriesStatementType {

    @XmlElement(name = "SeriesRepositoryLocation")
    @XmlSchemaType(name = "anyURI")
    protected String seriesRepositoryLocation;
    @XmlElement(name = "SeriesName", required = true)
    protected List<NameType> seriesName;
    @XmlElement(name = "Abbreviation")
    protected List<String> abbreviation;
    @XmlElement(name = "SeriesDescription")
    protected List<StructuredStringType> seriesDescription;

    /**
     * Gets the value of the seriesRepositoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesRepositoryLocation() {
        return seriesRepositoryLocation;
    }

    /**
     * Sets the value of the seriesRepositoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesRepositoryLocation(String value) {
        this.seriesRepositoryLocation = value;
    }

    /**
     * Series name Gets the value of the seriesName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getSeriesName() {
        if (seriesName == null) {
            seriesName = new ArrayList<NameType>();
        }
        return this.seriesName;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAbbreviation() {
        if (abbreviation == null) {
            abbreviation = new ArrayList<String>();
        }
        return this.abbreviation;
    }

    /**
     * Human-readable description of the series.Gets the value of the seriesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredStringType }
     * 
     * 
     */
    public List<StructuredStringType> getSeriesDescription() {
        if (seriesDescription == null) {
            seriesDescription = new ArrayList<StructuredStringType>();
        }
        return this.seriesDescription;
    }

}
