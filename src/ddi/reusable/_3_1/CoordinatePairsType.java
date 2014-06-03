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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Field to capture coordinate pairs as individual pairs or as an array of pairs.
 * 
 * <p>Java class for CoordinatePairsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordinatePairsType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}TextDomainType">
 *       &lt;attribute name="maxArray" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="arraySeparator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinatePairsType")
public class CoordinatePairsType
    extends TextDomainType
{

    @XmlAttribute(name = "maxArray")
    protected BigInteger maxArray;
    @XmlAttribute(name = "arraySeparator")
    protected String arraySeparator;

    /**
     * Gets the value of the maxArray property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxArray() {
        if (maxArray == null) {
            return new BigInteger("1");
        } else {
            return maxArray;
        }
    }

    /**
     * Sets the value of the maxArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxArray(BigInteger value) {
        this.maxArray = value;
    }

    /**
     * Gets the value of the arraySeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArraySeparator() {
        return arraySeparator;
    }

    /**
     * Sets the value of the arraySeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArraySeparator(String value) {
        this.arraySeparator = value;
    }

}
