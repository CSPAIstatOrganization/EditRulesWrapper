//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicaldataproduct._3_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.IdentifiableType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Describes characteristics of the physical storage of a logical record, as described in the DataRelationship section of the logical product.
 * 
 * <p>Java class for GrossRecordStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrossRecordStructureType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}LogicalRecordReference"/>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}PhysicalRecordSegment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfPhysicalSegments" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossRecordStructureType", propOrder = {
    "logicalRecordReference",
    "physicalRecordSegment"
})
public class GrossRecordStructureType
    extends IdentifiableType
{

    @XmlElement(name = "LogicalRecordReference", required = true)
    protected ReferenceType logicalRecordReference;
    @XmlElement(name = "PhysicalRecordSegment", required = true)
    protected List<PhysicalRecordSegmentType> physicalRecordSegment;
    @XmlAttribute(name = "numberOfPhysicalSegments")
    protected BigInteger numberOfPhysicalSegments;

    /**
     * Reference to the LogicalProduct:DataRelationship:LogicalRecord:RecordType:Idenfication.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLogicalRecordReference() {
        return logicalRecordReference;
    }

    /**
     * Sets the value of the logicalRecordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLogicalRecordReference(ReferenceType value) {
        this.logicalRecordReference = value;
    }

    /**
     * A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment.Gets the value of the physicalRecordSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalRecordSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalRecordSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalRecordSegmentType }
     * 
     * 
     */
    public List<PhysicalRecordSegmentType> getPhysicalRecordSegment() {
        if (physicalRecordSegment == null) {
            physicalRecordSegment = new ArrayList<PhysicalRecordSegmentType>();
        }
        return this.physicalRecordSegment;
    }

    /**
     * Gets the value of the numberOfPhysicalSegments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPhysicalSegments() {
        if (numberOfPhysicalSegments == null) {
            return new BigInteger("1");
        } else {
            return numberOfPhysicalSegments;
        }
    }

    /**
     * Sets the value of the numberOfPhysicalSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPhysicalSegments(BigInteger value) {
        this.numberOfPhysicalSegments = value;
    }

}