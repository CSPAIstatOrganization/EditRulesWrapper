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
import ddi.reusable._3_1.StructuredStringType;


/**
 * Literal (static) text to be used in the instrument.
 * 
 * <p>Java class for LiteralTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiteralTextType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:datacollection:3_1}TextType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{ddi:reusable:3_1}StructuredStringType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralTextType", propOrder = {
    "text"
})
public class LiteralTextType
    extends TextType
{

    @XmlElement(name = "Text", required = true)
    protected StructuredStringType text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredStringType }
     *     
     */
    public StructuredStringType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredStringType }
     *     
     */
    public void setText(StructuredStringType value) {
        this.text = value;
    }

}