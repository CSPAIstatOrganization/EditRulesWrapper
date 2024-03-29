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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a geographic level. The level can be identified by a code, or a descriptive name, or both.
 * 
 * <p>Java class for GeographicLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="2">
 *           &lt;sequence>
 *             &lt;element name="Code" type="{ddi:reusable:3_1}CodeValueType"/>
 *             &lt;element ref="{ddi:reusable:3_1}AuthorityOrganizationReference"/>
 *           &lt;/sequence>
 *           &lt;element ref="{ddi:reusable:3_1}Name" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{ddi:reusable:3_1}CoverageLimitation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLevelType", propOrder = {
    "codeAndAuthorityOrganizationReferenceOrName",
    "coverageLimitation",
    "description"
})
public class GeographicLevelType {

    @XmlElements({
        @XmlElement(name = "Code", type = CodeValueType.class),
        @XmlElement(name = "AuthorityOrganizationReference", type = ReferenceType.class),
        @XmlElement(name = "Name", type = InternationalStringType.class)
    })
    protected List<Object> codeAndAuthorityOrganizationReferenceOrName;
    @XmlElement(name = "CoverageLimitation")
    protected List<InternationalStringType> coverageLimitation;
    @XmlElement(name = "Description")
    protected List<StructuredStringType> description;

    /**
     * Gets the value of the codeAndAuthorityOrganizationReferenceOrName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeAndAuthorityOrganizationReferenceOrName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeAndAuthorityOrganizationReferenceOrName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeValueType }
     * {@link ReferenceType }
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<Object> getCodeAndAuthorityOrganizationReferenceOrName() {
        if (codeAndAuthorityOrganizationReferenceOrName == null) {
            codeAndAuthorityOrganizationReferenceOrName = new ArrayList<Object>();
        }
        return this.codeAndAuthorityOrganizationReferenceOrName;
    }

    /**
     * Describes limitations of coverage within the parent geography (for example only places with a population of over 10,000).Gets the value of the coverageLimitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageLimitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageLimitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getCoverageLimitation() {
        if (coverageLimitation == null) {
            coverageLimitation = new ArrayList<InternationalStringType>();
        }
        return this.coverageLimitation;
    }

    /**
     * A human-readable description of the geographic level.Gets the value of the description property.
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
