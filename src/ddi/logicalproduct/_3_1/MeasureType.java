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
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}VariableReference"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}AggregationDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "variableReference",
    "aggregationDefinition"
})
public class MeasureType
    extends IdentifiableType
{

    @XmlElement(name = "VariableReference", required = true)
    protected ReferenceType variableReference;
    @XmlElement(name = "AggregationDefinition")
    protected AggregationDefinitionType aggregationDefinition;

    /**
     * This is used in the case where the content of the cell is defined by a variable description, e.g., FLAG where the content is a single character flag and its definition is provided by the category label.
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
     * Identifies the independent (denominator) and dependent (numerator) dimensions for calculating aggregate measures such as percent. When two or more independent or dependent dimensions are listed here, the value is defined as the intersection of the listed dimensions.
     * 
     * @return
     *     possible object is
     *     {@link AggregationDefinitionType }
     *     
     */
    public AggregationDefinitionType getAggregationDefinition() {
        return aggregationDefinition;
    }

    /**
     * Sets the value of the aggregationDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationDefinitionType }
     *     
     */
    public void setAggregationDefinition(AggregationDefinitionType value) {
        this.aggregationDefinition = value;
    }

}
