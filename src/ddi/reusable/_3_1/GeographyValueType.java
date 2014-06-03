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
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a geographic value.
 * 
 * <p>Java class for GeographyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}GeographyCode"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographyName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographicTime"/>
 *         &lt;element ref="{ddi:reusable:3_1}BoundingPolygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}ExcludingPolygon" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographyValueType", propOrder = {
    "geographyCode",
    "geographyName",
    "geographicTime",
    "boundingPolygon",
    "excludingPolygon"
})
public class GeographyValueType {

    @XmlElement(name = "GeographyCode", required = true)
    protected GeographyCodeType geographyCode;
    @XmlElement(name = "GeographyName")
    protected List<InternationalStringType> geographyName;
    @XmlElement(name = "GeographicTime", required = true)
    protected DateType geographicTime;
    @XmlElement(name = "BoundingPolygon")
    protected List<PolygonType> boundingPolygon;
    @XmlElement(name = "ExcludingPolygon")
    protected List<PolygonType> excludingPolygon;

    /**
     * Container for a standard geography code
     * 
     * @return
     *     possible object is
     *     {@link GeographyCodeType }
     *     
     */
    public GeographyCodeType getGeographyCode() {
        return geographyCode;
    }

    /**
     * Sets the value of the geographyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographyCodeType }
     *     
     */
    public void setGeographyCode(GeographyCodeType value) {
        this.geographyCode = value;
    }

    /**
     * Textual description of the particular geographic entity/code.Gets the value of the geographyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getGeographyName() {
        if (geographyName == null) {
            geographyName = new ArrayList<InternationalStringType>();
        }
        return this.geographyName;
    }

    /**
     * The date (and, optionally, time) of a specific geographic value (code). This is necessary because geographic boundaries change over time.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getGeographicTime() {
        return geographicTime;
    }

    /**
     * Sets the value of the geographicTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setGeographicTime(DateType value) {
        this.geographicTime = value;
    }

    /**
     * A closed plane figure bounded by three or more line segments representing the described geographic area.Gets the value of the boundingPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonType }
     * 
     * 
     */
    public List<PolygonType> getBoundingPolygon() {
        if (boundingPolygon == null) {
            boundingPolygon = new ArrayList<PolygonType>();
        }
        return this.boundingPolygon;
    }

    /**
     * A closed plane figure bounded by three or more line segments representing an area excluded from the described geographical area.Gets the value of the excludingPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludingPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludingPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonType }
     * 
     * 
     */
    public List<PolygonType> getExcludingPolygon() {
        if (excludingPolygon == null) {
            excludingPolygon = new ArrayList<PolygonType>();
        }
        return this.excludingPolygon;
    }

}