//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Structures a response domain based on categorization.
 * 
 * <p>Java class for ExternalCategoryRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalCategoryRepresentationType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}RepresentationType">
 *       &lt;sequence>
 *         &lt;element name="ExternalCategoryReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalCategoryRepresentationType", propOrder = {
    "externalCategoryReference",
    "description"
})
public class ExternalCategoryRepresentationType
    extends RepresentationType
{

    @XmlElement(name = "ExternalCategoryReference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String externalCategoryReference;
    @XmlElement(name = "Description")
    protected List<StructuredStringType> description;

    /**
     * Gets the value of the externalCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCategoryReference() {
        return externalCategoryReference;
    }

    /**
     * Sets the value of the externalCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCategoryReference(String value) {
        this.externalCategoryReference = value;
    }

    /**
     * A description of the use of the external category file.Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredStringType }
     * 
     * 
     */
    public List<StructuredStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<StructuredStringType>();
        }
        return this.description;
    }

}
