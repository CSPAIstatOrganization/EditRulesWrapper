//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.ReferenceType;


/**
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryReference" type="{ddi:reusable:3_1}ReferenceType"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}Code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isDiscrete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="levelNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="isComprehensive" type="{ddi:logicalproduct:3_1}IsComprehensiveType" default="Unknown" />
 *       &lt;attribute name="isTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "categoryReference",
    "value",
    "code"
})
public class CodeType {

    @XmlElement(name = "CategoryReference", required = true)
    protected ReferenceType categoryReference;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Code")
    protected List<CodeType> code;
    @XmlAttribute(name = "isDiscrete")
    protected Boolean isDiscrete;
    @XmlAttribute(name = "levelNumber")
    protected BigInteger levelNumber;
    @XmlAttribute(name = "isComprehensive")
    protected IsComprehensiveType isComprehensive;
    @XmlAttribute(name = "isTotal")
    protected Boolean isTotal;

    /**
     * Gets the value of the categoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCategoryReference() {
        return categoryReference;
    }

    /**
     * Sets the value of the categoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCategoryReference(ReferenceType value) {
        this.categoryReference = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Allows for nesting of codes.Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCode() {
        if (code == null) {
            code = new ArrayList<CodeType>();
        }
        return this.code;
    }

    /**
     * Gets the value of the isDiscrete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDiscrete() {
        if (isDiscrete == null) {
            return true;
        } else {
            return isDiscrete;
        }
    }

    /**
     * Sets the value of the isDiscrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscrete(Boolean value) {
        this.isDiscrete = value;
    }

    /**
     * Gets the value of the levelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelNumber(BigInteger value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the isComprehensive property.
     * 
     * @return
     *     possible object is
     *     {@link IsComprehensiveType }
     *     
     */
    public IsComprehensiveType getIsComprehensive() {
        if (isComprehensive == null) {
            return IsComprehensiveType.UNKNOWN;
        } else {
            return isComprehensive;
        }
    }

    /**
     * Sets the value of the isComprehensive property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsComprehensiveType }
     *     
     */
    public void setIsComprehensive(IsComprehensiveType value) {
        this.isComprehensive = value;
    }

    /**
     * Gets the value of the isTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsTotal() {
        if (isTotal == null) {
            return false;
        } else {
            return isTotal;
        }
    }

    /**
     * Sets the value of the isTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTotal(Boolean value) {
        this.isTotal = value;
    }

}
