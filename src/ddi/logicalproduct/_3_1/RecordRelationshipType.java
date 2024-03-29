//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.IdentifiableType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * All relationships are described pairwise. Multiple pairwise relationships may be needed to clarify all relationships within a logical product.
 * 
 * <p>Java class for RecordRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}RecordRelationshipName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}RecordReferenceSource"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}RecordReferenceTarget"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{ddi:logicalproduct:3_1}ValueTypeCodeType" default="Equal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordRelationshipType", propOrder = {
    "recordRelationshipName",
    "label",
    "description",
    "recordReferenceSource",
    "recordReferenceTarget"
})
public class RecordRelationshipType
    extends IdentifiableType
{

    @XmlElement(name = "RecordRelationshipName")
    protected List<NameType> recordRelationshipName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "RecordReferenceSource", required = true)
    protected RecordReferenceSourceType recordReferenceSource;
    @XmlElement(name = "RecordReferenceTarget", required = true)
    protected ReferenceType recordReferenceTarget;
    @XmlAttribute(name = "type")
    protected ValueTypeCodeType type;

    /**
     * Gets the value of the recordRelationshipName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordRelationshipName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordRelationshipName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getRecordRelationshipName() {
        if (recordRelationshipName == null) {
            recordRelationshipName = new ArrayList<NameType>();
        }
        return this.recordRelationshipName;
    }

    /**
     * Gets the value of the label property.
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
     * Gets the value of the description property.
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
     * Reference to the Source Record.
     * 
     * @return
     *     possible object is
     *     {@link RecordReferenceSourceType }
     *     
     */
    public RecordReferenceSourceType getRecordReferenceSource() {
        return recordReferenceSource;
    }

    /**
     * Sets the value of the recordReferenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordReferenceSourceType }
     *     
     */
    public void setRecordReferenceSource(RecordReferenceSourceType value) {
        this.recordReferenceSource = value;
    }

    /**
     * Reference to the Target Record.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRecordReferenceTarget() {
        return recordReferenceTarget;
    }

    /**
     * Sets the value of the recordReferenceTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRecordReferenceTarget(ReferenceType value) {
        this.recordReferenceTarget = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public ValueTypeCodeType getType() {
        if (type == null) {
            return ValueTypeCodeType.EQUAL;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public void setType(ValueTypeCodeType value) {
        this.type = value;
    }

}
