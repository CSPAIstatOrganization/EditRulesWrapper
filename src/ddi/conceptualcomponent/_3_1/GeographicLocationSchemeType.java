//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.conceptualcomponent._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.GeographicLocationType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.MaintainableType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.SchemeReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * This scheme contains a set of geographic locations, each for a single Geography type, e.g., States OR Counties, OR Countries, etc. The geographic location element has to be repeated for each geography structure type described.
 * 
 * <p>Java class for GeographicLocationSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocationSchemeType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}MaintainableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}GeographicLocationSchemeName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}GeographicLocationSchemeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{ddi:reusable:3_1}GeographicLocation"/>
 *           &lt;element ref="{ddi:reusable:3_1}GeographicLocationReference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocationSchemeType", propOrder = {
    "geographicLocationSchemeName",
    "label",
    "description",
    "geographicLocationSchemeReference",
    "geographicLocationOrGeographicLocationReference"
})
public class GeographicLocationSchemeType
    extends MaintainableType
{

    @XmlElement(name = "GeographicLocationSchemeName")
    protected List<NameType> geographicLocationSchemeName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "GeographicLocationSchemeReference")
    protected List<SchemeReferenceType> geographicLocationSchemeReference;
    @XmlElements({
        @XmlElement(name = "GeographicLocation", namespace = "ddi:reusable:3_1", type = GeographicLocationType.class),
        @XmlElement(name = "GeographicLocationReference", namespace = "ddi:reusable:3_1", type = ReferenceType.class)
    })
    protected List<Object> geographicLocationOrGeographicLocationReference;

    /**
     * Gets the value of the geographicLocationSchemeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicLocationSchemeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicLocationSchemeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getGeographicLocationSchemeName() {
        if (geographicLocationSchemeName == null) {
            geographicLocationSchemeName = new ArrayList<NameType>();
        }
        return this.geographicLocationSchemeName;
    }

    /**
     * A display label for the geography location scheme.Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelType }
     * 
     * 
     */
    public List<LabelType> getLabel() {
        if (label == null) {
            label = new ArrayList<LabelType>();
        }
        return this.label;
    }

    /**
     * A description of the use of the geography location scheme.Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredStringType }
     * 
     * 
     */
    public List<StructuredStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<StructuredStringType>();
        }
        return this.description;
    }

    /**
     * Allows for inclusion by reference of another geographic location scheme.Gets the value of the geographicLocationSchemeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicLocationSchemeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicLocationSchemeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeReferenceType }
     * 
     * 
     */
    public List<SchemeReferenceType> getGeographicLocationSchemeReference() {
        if (geographicLocationSchemeReference == null) {
            geographicLocationSchemeReference = new ArrayList<SchemeReferenceType>();
        }
        return this.geographicLocationSchemeReference;
    }

    /**
     * Gets the value of the geographicLocationOrGeographicLocationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicLocationOrGeographicLocationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicLocationOrGeographicLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicLocationType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getGeographicLocationOrGeographicLocationReference() {
        if (geographicLocationOrGeographicLocationReference == null) {
            geographicLocationOrGeographicLocationReference = new ArrayList<Object>();
        }
        return this.geographicLocationOrGeographicLocationReference;
    }

}