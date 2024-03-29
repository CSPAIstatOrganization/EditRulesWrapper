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
 * <p>Java class for LineParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartLine" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StartOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EndLine" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EndOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineParameterType", propOrder = {
    "startLine",
    "startOffset",
    "endLine",
    "endOffset"
})
public class LineParameterType {

    @XmlElement(name = "StartLine", required = true)
    protected BigInteger startLine;
    @XmlElement(name = "StartOffset", required = true)
    protected BigInteger startOffset;
    @XmlElement(name = "EndLine", required = true)
    protected BigInteger endLine;
    @XmlElement(name = "EndOffset", required = true)
    protected BigInteger endOffset;

    /**
     * Gets the value of the startLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartLine() {
        return startLine;
    }

    /**
     * Sets the value of the startLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartLine(BigInteger value) {
        this.startLine = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartOffset(BigInteger value) {
        this.startOffset = value;
    }

    /**
     * Gets the value of the endLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndLine() {
        return endLine;
    }

    /**
     * Sets the value of the endLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndLine(BigInteger value) {
        this.endLine = value;
    }

    /**
     * Gets the value of the endOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndOffset() {
        return endOffset;
    }

    /**
     * Sets the value of the endOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndOffset(BigInteger value) {
        this.endOffset = value;
    }

}
