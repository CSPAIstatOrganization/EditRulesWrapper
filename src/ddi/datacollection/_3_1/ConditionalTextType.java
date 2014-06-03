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
import ddi.reusable._3_1.CodeType;


/**
 * Text which has a changeable value, based on a condition expressed in Code.
 * 
 * <p>Java class for ConditionalTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionalTextType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:datacollection:3_1}TextType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:datacollection:3_1}Expression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionalTextType", propOrder = {
    "expression"
})
public class ConditionalTextType
    extends TextType
{

    @XmlElement(name = "Expression", required = true)
    protected CodeType expression;

    /**
     * The condition on which the associated text varies. 
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExpression(CodeType value) {
        this.expression = value;
    }

}