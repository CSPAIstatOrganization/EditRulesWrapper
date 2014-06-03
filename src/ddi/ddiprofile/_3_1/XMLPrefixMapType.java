//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.ddiprofile._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For each XML namespace used in the profile's XPath expressions, the XML namespaces must have their prefix specified using this element.
 * 
 * <p>Java class for XMLPrefixMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLPrefixMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XMLNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLPrefixMapType", propOrder = {
    "xmlPrefix",
    "xmlNamespace"
})
public class XMLPrefixMapType {

    @XmlElement(name = "XMLPrefix", required = true)
    protected String xmlPrefix;
    @XmlElement(name = "XMLNamespace", required = true)
    protected String xmlNamespace;

    /**
     * Gets the value of the xmlPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLPrefix() {
        return xmlPrefix;
    }

    /**
     * Sets the value of the xmlPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLPrefix(String value) {
        this.xmlPrefix = value;
    }

    /**
     * Gets the value of the xmlNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLNamespace() {
        return xmlNamespace;
    }

    /**
     * Sets the value of the xmlNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLNamespace(String value) {
        this.xmlNamespace = value;
    }

}