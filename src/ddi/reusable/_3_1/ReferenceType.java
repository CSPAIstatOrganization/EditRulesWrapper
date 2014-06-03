//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ddi.conceptualcomponent._3_1.ConceptReferenceType;
import ddi.datacollection._3_1.InterviewerInstructionReferenceType;
import ddi.datacollection._3_1.SourceReferenceType;
import ddi.logicalproduct._3_1.CodeSchemeReferenceType;
import ddi.logicalproduct._3_1.VariableUsedReferenceType;
import ddi.physicaldataproduct._3_1.KeyVariableReferenceType;
import ddi.physicaldataproduct._3_1.PhysicalStructureReferenceType;


/**
 * Used for referencing an identified entity expressed in DDI XML, either by a URN and/or an ID. If both are supplied, the URN takes precedence. At a minimum, one or the other is required. The lateBound attribute has a boolean value, which - if set to true - indicates that the latest version should be used.
 * 
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}Module" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Scheme" minOccurs="0"/>
 *         &lt;choice maxOccurs="2">
 *           &lt;element ref="{ddi:reusable:3_1}URN"/>
 *           &lt;sequence>
 *             &lt;element ref="{ddi:reusable:3_1}ID"/>
 *             &lt;element name="IdentifyingAgency" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}Version" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="isExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="isReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *       &lt;attribute name="lateBound" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="objectLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="sourceContext" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", propOrder = {
    "module",
    "scheme",
    "urnOrIDAndIdentifyingAgency"
})
@XmlSeeAlso({
    SchemeReferenceType.class,
    ParentGeographyType.class,
    SourceReferenceType.class,
    InterviewerInstructionReferenceType.class,
    VariableUsedReferenceType.class,
    CodeSchemeReferenceType.class,
    ConceptReferenceType.class,
    PhysicalStructureReferenceType.class,
    KeyVariableReferenceType.class,
    ddi.physicaldataproduct_ncube_inline._3_1.MeasureReferenceType.class,
    ddi.physicaldataproduct_ncube_normal._3_1.MeasureReferenceType.class,
    ddi.physicaldataproduct_ncube_tabular._3_1.MeasureReferenceType.class
})
public class ReferenceType {

    @XmlElement(name = "Module")
    protected ReferenceType module;
    @XmlElement(name = "Scheme")
    protected ReferenceType scheme;
    @XmlElementRefs({
        @XmlElementRef(name = "IdentifyingAgency", namespace = "ddi:reusable:3_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ID", namespace = "ddi:reusable:3_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URN", namespace = "ddi:reusable:3_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Version", namespace = "ddi:reusable:3_1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> urnOrIDAndIdentifyingAgency;
    @XmlAttribute(name = "isExternal")
    protected Boolean isExternal;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "isReference")
    protected Boolean isReference;
    @XmlAttribute(name = "lateBound")
    protected Boolean lateBound;
    @XmlAttribute(name = "objectLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String objectLanguage;
    @XmlAttribute(name = "sourceContext")
    @XmlSchemaType(name = "anyURI")
    protected String sourceContext;

    /**
     * References the module of the entity that is being referenced, in cases where there have been local modifications.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setModule(ReferenceType value) {
        this.module = value;
    }

    /**
     * Containing scheme of the entity that is being referenced.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setScheme(ReferenceType value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the urnOrIDAndIdentifyingAgency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urnOrIDAndIdentifyingAgency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURNOrIDAndIdentifyingAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link IDType }{@code >}
     * {@link JAXBElement }{@code <}{@link URNType }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getURNOrIDAndIdentifyingAgency() {
        if (urnOrIDAndIdentifyingAgency == null) {
            urnOrIDAndIdentifyingAgency = new ArrayList<JAXBElement<?>>();
        }
        return this.urnOrIDAndIdentifyingAgency;
    }

    /**
     * Gets the value of the isExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsExternal() {
        if (isExternal == null) {
            return false;
        } else {
            return isExternal;
        }
    }

    /**
     * Sets the value of the isExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the isReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsReference() {
        if (isReference == null) {
            return true;
        } else {
            return isReference;
        }
    }

    /**
     * Sets the value of the isReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReference(Boolean value) {
        this.isReference = value;
    }

    /**
     * Gets the value of the lateBound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLateBound() {
        if (lateBound == null) {
            return false;
        } else {
            return lateBound;
        }
    }

    /**
     * Sets the value of the lateBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateBound(Boolean value) {
        this.lateBound = value;
    }

    /**
     * Gets the value of the objectLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectLanguage() {
        return objectLanguage;
    }

    /**
     * Sets the value of the objectLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectLanguage(String value) {
        this.objectLanguage = value;
    }

    /**
     * Gets the value of the sourceContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContext() {
        return sourceContext;
    }

    /**
     * Sets the value of the sourceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContext(String value) {
        this.sourceContext = value;
    }

}