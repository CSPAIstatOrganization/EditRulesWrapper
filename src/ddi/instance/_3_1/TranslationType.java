//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.instance._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ddi.reusable._3_1.StructuredStringType;


/**
 * Describes the translation process of data and metadata.
 * 
 * <p>Java class for TranslationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="I18n-text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I18n-catalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationType", propOrder = {
    "language",
    "i18NText",
    "i18NCatalog",
    "description"
})
public class TranslationType {

    @XmlElement(name = "Language", required = true)
    protected List<String> language;
    @XmlElement(name = "I18n-text", required = true)
    protected String i18NText;
    @XmlElement(name = "I18n-catalog")
    protected String i18NCatalog;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected StructuredStringType description;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Gets the value of the i18NText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI18NText() {
        return i18NText;
    }

    /**
     * Sets the value of the i18NText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI18NText(String value) {
        this.i18NText = value;
    }

    /**
     * Gets the value of the i18NCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI18NCatalog() {
        return i18NCatalog;
    }

    /**
     * Sets the value of the i18NCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI18NCatalog(String value) {
        this.i18NCatalog = value;
    }

    /**
     * Describes the translation process of data and metadata.
     * 
     * @return
     *     possible object is
     *     {@link StructuredStringType }
     *     
     */
    public StructuredStringType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredStringType }
     *     
     */
    public void setDescription(StructuredStringType value) {
        this.description = value;
    }

    /**
     * Indicates language of tag content
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}