//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartCharOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EndCharOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterParameterType", propOrder = {
    "startCharOffset",
    "endCharOffset"
})
public class CharacterParameterType {

    @XmlElement(name = "StartCharOffset", required = true)
    protected BigInteger startCharOffset;
    @XmlElement(name = "EndCharOffset", required = true)
    protected BigInteger endCharOffset;

    /**
     * Gets the value of the startCharOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartCharOffset() {
        return startCharOffset;
    }

    /**
     * Sets the value of the startCharOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartCharOffset(BigInteger value) {
        this.startCharOffset = value;
    }

    /**
     * Gets the value of the endCharOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndCharOffset() {
        return endCharOffset;
    }

    /**
     * Sets the value of the endCharOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndCharOffset(BigInteger value) {
        this.endCharOffset = value;
    }

}
