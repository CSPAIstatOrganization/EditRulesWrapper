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
import ddi.reusable._3_1.CommandType;
import ddi.reusable._3_1.OtherMaterialType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * Generation/derivation details of the category.
 * 
 * <p>Java class for GenerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}ComponentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Command" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}OtherMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isDerived" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="qualification" type="{http://www.w3.org/2001/XMLSchema}string" default="optional" />
 *       &lt;attribute name="formalLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerationType", propOrder = {
    "componentReference",
    "description",
    "command",
    "otherMaterial"
})
public class GenerationType {

    @XmlElement(name = "ComponentReference")
    protected List<ReferenceType> componentReference;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "Command", namespace = "ddi:reusable:3_1")
    protected List<CommandType> command;
    @XmlElement(name = "OtherMaterial", namespace = "ddi:reusable:3_1")
    protected List<OtherMaterialType> otherMaterial;
    @XmlAttribute(name = "isDerived")
    protected Boolean isDerived;
    @XmlAttribute(name = "qualification")
    protected String qualification;
    @XmlAttribute(name = "formalLanguage")
    protected String formalLanguage;

    /**
     * Reference to a category used for the generation.Gets the value of the componentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getComponentReference() {
        if (componentReference == null) {
            componentReference = new ArrayList<ReferenceType>();
        }
        return this.componentReference;
    }

    /**
     * Description of the generation.Gets the value of the description property.
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
     * Command for creating the generation. This part is intended to be machine-actionable.Gets the value of the command property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the command property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommandType }
     * 
     * 
     */
    public List<CommandType> getCommand() {
        if (command == null) {
            command = new ArrayList<CommandType>();
        }
        return this.command;
    }

    /**
     * External documentation required for creating the generation - for example, a chart or table for defining poverty.Gets the value of the otherMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherMaterialType }
     * 
     * 
     */
    public List<OtherMaterialType> getOtherMaterial() {
        if (otherMaterial == null) {
            otherMaterial = new ArrayList<OtherMaterialType>();
        }
        return this.otherMaterial;
    }

    /**
     * Gets the value of the isDerived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDerived() {
        if (isDerived == null) {
            return true;
        } else {
            return isDerived;
        }
    }

    /**
     * Sets the value of the isDerived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDerived(Boolean value) {
        this.isDerived = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualification() {
        if (qualification == null) {
            return "optional";
        } else {
            return qualification;
        }
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualification(String value) {
        this.qualification = value;
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
