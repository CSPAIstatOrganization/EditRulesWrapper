//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.datacollection._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.CodeValueType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Describes the aggregation of a generation instruction.
 * 
 * <p>Java class for AggregationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:datacollection:3_1}Method"/>
 *         &lt;choice>
 *           &lt;element ref="{ddi:datacollection:3_1}VariableSet"/>
 *           &lt;element ref="{ddi:datacollection:3_1}VariableSetReference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregationType", propOrder = {
    "method",
    "variableSet",
    "variableSetReference"
})
public class AggregationType {

    @XmlElement(name = "Method", required = true)
    protected CodeValueType method;
    @XmlElement(name = "VariableSet")
    protected VariableSetType variableSet;
    @XmlElement(name = "VariableSetReference")
    protected ReferenceType variableSetReference;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setMethod(CodeValueType value) {
        this.method = value;
    }

    /**
     * Provides detail on a variable set of dependent and independent variables.
     * 
     * @return
     *     possible object is
     *     {@link VariableSetType }
     *     
     */
    public VariableSetType getVariableSet() {
        return variableSet;
    }

    /**
     * Sets the value of the variableSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableSetType }
     *     
     */
    public void setVariableSet(VariableSetType value) {
        this.variableSet = value;
    }

    /**
     * A reference to a variable set of dependent and independent variables.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVariableSetReference() {
        return variableSetReference;
    }

    /**
     * Sets the value of the variableSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVariableSetReference(ReferenceType value) {
        this.variableSetReference = value;
    }

}
