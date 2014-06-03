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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Describes the information needed to identify a type of record. Repeating the field will allow referencing multiple variables.
 * 
 * <p>Java class for VariableSpecificationReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableSpecificationReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}VariableReference"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}CaseSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableSpecificationReferenceType", propOrder = {
    "variableReference",
    "caseSpecification"
})
public class VariableSpecificationReferenceType {

    @XmlElement(name = "VariableReference", required = true)
    protected ReferenceType variableReference;
    @XmlElement(name = "CaseSpecification")
    protected List<CaseSpecificationType> caseSpecification;

    /**
     * Reference to the variable containing the record type locator.
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
     * Value of variable indicating this record type, multiple entries allow for multiple valid values or ranges.Gets the value of the caseSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseSpecificationType }
     * 
     * 
     */
    public List<CaseSpecificationType> getCaseSpecification() {
        if (caseSpecification == null) {
            caseSpecification = new ArrayList<CaseSpecificationType>();
        }
        return this.caseSpecification;
    }

}
