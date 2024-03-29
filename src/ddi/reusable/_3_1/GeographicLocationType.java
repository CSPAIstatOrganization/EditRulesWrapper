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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * References or describes specific geographic codes/values.
 * 
 * <p>Java class for GeographicLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{ddi:reusable:3_1}Values"/>
 *           &lt;element ref="{ddi:reusable:3_1}GeographicLocationReference"/>
 *         &lt;/choice>
 *         &lt;element ref="{ddi:reusable:3_1}AuthorityOrganizationReference"/>
 *         &lt;choice>
 *           &lt;element ref="{ddi:reusable:3_1}GeographicLevelReference"/>
 *           &lt;element ref="{ddi:reusable:3_1}GeographicLevelDescription" maxOccurs="unbounded"/>
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
@XmlType(name = "GeographicLocationType", propOrder = {
    "valuesOrGeographicLocationReference",
    "authorityOrganizationReference",
    "geographicLevelReference",
    "geographicLevelDescription"
})
public class GeographicLocationType
    extends VersionableType
{

    @XmlElements({
        @XmlElement(name = "Values", type = GeographyValuesType.class),
        @XmlElement(name = "GeographicLocationReference", type = ReferenceType.class)
    })
    protected List<Object> valuesOrGeographicLocationReference;
    @XmlElement(name = "AuthorityOrganizationReference", required = true)
    protected ReferenceType authorityOrganizationReference;
    @XmlElement(name = "GeographicLevelReference")
    protected ReferenceType geographicLevelReference;
    @XmlElement(name = "GeographicLevelDescription")
    protected List<StructuredStringType> geographicLevelDescription;

    /**
     * Gets the value of the valuesOrGeographicLocationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuesOrGeographicLocationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuesOrGeographicLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographyValuesType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getValuesOrGeographicLocationReference() {
        if (valuesOrGeographicLocationReference == null) {
            valuesOrGeographicLocationReference = new ArrayList<Object>();
        }
        return this.valuesOrGeographicLocationReference;
    }

    /**
     * Reference to an organization or individual, defined in the organization scheme, responsible for the code.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAuthorityOrganizationReference() {
        return authorityOrganizationReference;
    }

    /**
     * Sets the value of the authorityOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAuthorityOrganizationReference(ReferenceType value) {
        this.authorityOrganizationReference = value;
    }

    /**
     * Reference to a Geographic Level.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGeographicLevelReference() {
        return geographicLevelReference;
    }

    /**
     * Sets the value of the geographicLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGeographicLevelReference(ReferenceType value) {
        this.geographicLevelReference = value;
    }

    /**
     * Human-readable description of a geographic level, when there is no formal DDI description of it.Gets the value of the geographicLevelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicLevelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredStringType }
     * 
     * 
     */
    public List<StructuredStringType> getGeographicLevelDescription() {
        if (geographicLevelDescription == null) {
            geographicLevelDescription = new ArrayList<StructuredStringType>();
        }
        return this.geographicLevelDescription;
    }

}
