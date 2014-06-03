//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Combines the features of IdentifedStringType and StructuredStringType, providing both identification and XHTML structured content.
 * 
 * <p>Java class for IdentifiedStructuredStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedStructuredStringType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}Content"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedStructuredStringType", propOrder = {
    "content"
})
public class IdentifiedStructuredStringType
    extends IdentifiableType
{

    @XmlElement(name = "Content", required = true)
    protected StructuredStringType content;

    /**
     * Contains a structured string that may be marked up in XHTML.
     * 
     * @return
     *     possible object is
     *     {@link StructuredStringType }
     *     
     */
    public StructuredStringType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredStringType }
     *     
     */
    public void setContent(StructuredStringType value) {
        this.content = value;
    }

}