//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.IdentifiableType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Defines a variable that describes an attribute of all or coordinate sections of the NCube.
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{ddi:logicalproduct:3_1}VariableReference"/>
 *           &lt;element name="AttachmentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{ddi:logicalproduct:3_1}AttachmentLevel"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}AttachmentGroupReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "variableReference",
    "attachmentValue",
    "attachmentLevel",
    "attachmentGroupReference"
})
public class AttributeType
    extends IdentifiableType
{

    @XmlElement(name = "VariableReference")
    protected ReferenceType variableReference;
    @XmlElement(name = "AttachmentValue")
    protected String attachmentValue;
    @XmlElement(name = "AttachmentLevel", required = true)
    protected AttachmentLevelCodeType attachmentLevel;
    @XmlElement(name = "AttachmentGroupReference")
    protected ReferenceType attachmentGroupReference;

    /**
     * A reference to a variable that describes the attribute.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVariableReference() {
        return variableReference;
    }

    /**
     * Sets the value of the variableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVariableReference(ReferenceType value) {
        this.variableReference = value;
    }

    /**
     * Gets the value of the attachmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentValue() {
        return attachmentValue;
    }

    /**
     * Sets the value of the attachmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentValue(String value) {
        this.attachmentValue = value;
    }

    /**
     * Describes the level of attachment of the attribute.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentLevelCodeType }
     *     
     */
    public AttachmentLevelCodeType getAttachmentLevel() {
        return attachmentLevel;
    }

    /**
     * Sets the value of the attachmentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentLevelCodeType }
     *     
     */
    public void setAttachmentLevel(AttachmentLevelCodeType value) {
        this.attachmentLevel = value;
    }

    /**
     * References the coordinate group to which the attribute attaches.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAttachmentGroupReference() {
        return attachmentGroupReference;
    }

    /**
     * Sets the value of the attachmentGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAttachmentGroupReference(ReferenceType value) {
        this.attachmentGroupReference = value;
    }

}
