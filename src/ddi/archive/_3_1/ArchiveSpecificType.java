//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.archive._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.FundingInformationType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Contains metadata specific to a particular archive's holding.
 * 
 * <p>Java class for ArchiveSpecificType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveSpecificType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:archive:3_1}ArchiveOrganizationReference"/>
 *         &lt;element ref="{ddi:archive:3_1}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:archive:3_1}Collection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:archive:3_1}DefaultAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}FundingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveSpecificType", propOrder = {
    "archiveOrganizationReference",
    "item",
    "collection",
    "defaultAccess",
    "fundingInformation"
})
public class ArchiveSpecificType {

    @XmlElement(name = "ArchiveOrganizationReference", required = true)
    protected ReferenceType archiveOrganizationReference;
    @XmlElement(name = "Item")
    protected List<ItemType> item;
    @XmlElement(name = "Collection")
    protected List<CollectionType> collection;
    @XmlElement(name = "DefaultAccess")
    protected List<AccessType> defaultAccess;
    @XmlElement(name = "FundingInformation", namespace = "ddi:reusable:3_1")
    protected List<FundingInformationType> fundingInformation;

    /**
     * A reference to the organization or an individual acting as the archive.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getArchiveOrganizationReference() {
        return archiveOrganizationReference;
    }

    /**
     * Sets the value of the archiveOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setArchiveOrganizationReference(ReferenceType value) {
        this.archiveOrganizationReference = value;
    }

    /**
     * Describes the subject of the DDI metadata as viewed by the archive (e.g., as a single item which has been archived). This may be a Group, Element, or StudyUnit.Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
    }

    /**
     * Describes the archive's collections.Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionType }
     * 
     * 
     */
    public List<CollectionType> getCollection() {
        if (collection == null) {
            collection = new ArrayList<CollectionType>();
        }
        return this.collection;
    }

    /**
     * Describes access to the archive in general. The restrictions noted at this level apply to all holdings of the archive unless overridden for specified collections or items.Gets the value of the defaultAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessType }
     * 
     * 
     */
    public List<AccessType> getDefaultAccess() {
        if (defaultAccess == null) {
            defaultAccess = new ArrayList<AccessType>();
        }
        return this.defaultAccess;
    }

    /**
     * Describes the archive's sources of funding (grants, etc.) Gets the value of the fundingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingInformationType }
     * 
     * 
     */
    public List<FundingInformationType> getFundingInformation() {
        if (fundingInformation == null) {
            fundingInformation = new ArrayList<FundingInformationType>();
        }
        return this.fundingInformation;
    }

}
