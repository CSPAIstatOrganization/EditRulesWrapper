//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.archive._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.DateType;
import ddi.reusable._3_1.InternationalStringType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * Describes a relation between actors (organizations and/or individuals)
 * 
 * <p>Java class for RelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{ddi:archive:3_1}OrganizationReference"/>
 *           &lt;element ref="{ddi:archive:3_1}IndividualReference"/>
 *         &lt;/choice>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded"/>
 *         &lt;element ref="{ddi:archive:3_1}Keyword" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:archive:3_1}Period" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{ddi:archive:3_1}PRIVACY"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationType", propOrder = {
    "organizationReferenceOrIndividualReference",
    "description",
    "keyword",
    "period",
    "note"
})
public class RelationType {

    @XmlElementRefs({
        @XmlElementRef(name = "IndividualReference", namespace = "ddi:archive:3_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganizationReference", namespace = "ddi:archive:3_1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<ReferenceType>> organizationReferenceOrIndividualReference;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1", required = true)
    protected List<StructuredStringType> description;
    @XmlElement(name = "Keyword")
    protected List<InternationalStringType> keyword;
    @XmlElement(name = "Period")
    protected List<DateType> period;
    @XmlElement(name = "Note")
    protected List<String> note;
    @XmlAttribute(name = "privacy")
    protected String privacy;

    /**
     * Gets the value of the organizationReferenceOrIndividualReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationReferenceOrIndividualReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationReferenceOrIndividualReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ReferenceType>> getOrganizationReferenceOrIndividualReference() {
        if (organizationReferenceOrIndividualReference == null) {
            organizationReferenceOrIndividualReference = new ArrayList<JAXBElement<ReferenceType>>();
        }
        return this.organizationReferenceOrIndividualReference;
    }

    /**
     * Description of the relationship Gets the value of the description property.
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
     * Keyword used to classify the relationship Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<InternationalStringType>();
        }
        return this.keyword;
    }

    /**
     * Time period during which this relationship is valid.Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getPeriod() {
        if (period == null) {
            period = new ArrayList<DateType>();
        }
        return this.period;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

    /**
     * Gets the value of the privacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * Sets the value of the privacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacy(String value) {
        this.privacy = value;
    }

}
