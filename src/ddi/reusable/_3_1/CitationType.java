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
import javax.xml.bind.annotation.XmlType;
import ddi.dcelements._3_1.DCElementsType;


/**
 * Provides bibliographic citation information for a DDI instance, a group of studies, a study unit, or a physical instance. Note that a native DDI citation is required - the citation information may be repeated using DCElements if desired, but a citation must not consist only of DCElements.
 * 
 * <p>Java class for CitationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}Title" maxOccurs="unbounded"/>
 *         &lt;element ref="{ddi:reusable:3_1}SubTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}AlternateTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Creator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Publisher" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Contributor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}PublicationDate" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}InternationalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Copyright" minOccurs="0"/>
 *         &lt;element ref="{ddi:dcelements:3_1}DCElements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitationType", propOrder = {
    "title",
    "subTitle",
    "alternateTitle",
    "creator",
    "publisher",
    "contributor",
    "publicationDate",
    "language",
    "internationalIdentifier",
    "copyright",
    "dcElements"
})
public class CitationType {

    @XmlElement(name = "Title", required = true)
    protected List<InternationalStringType> title;
    @XmlElement(name = "SubTitle")
    protected List<InternationalStringType> subTitle;
    @XmlElement(name = "AlternateTitle")
    protected List<InternationalStringType> alternateTitle;
    @XmlElement(name = "Creator")
    protected List<CreatorType> creator;
    @XmlElement(name = "Publisher")
    protected List<InternationalStringType> publisher;
    @XmlElement(name = "Contributor")
    protected List<ContributorType> contributor;
    @XmlElement(name = "PublicationDate")
    protected DateType publicationDate;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "InternationalIdentifier")
    protected List<TypedStringType> internationalIdentifier;
    @XmlElement(name = "Copyright")
    protected InternationalStringType copyright;
    @XmlElement(name = "DCElements", namespace = "ddi:dcelements:3_1")
    protected DCElementsType dcElements;

    /**
     * Full authoritative title. Field may be repeated to document multiple languages.Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getTitle() {
        if (title == null) {
            title = new ArrayList<InternationalStringType>();
        }
        return this.title;
    }

    /**
     * Secondary or explanatory title.Gets the value of the subTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getSubTitle() {
        if (subTitle == null) {
            subTitle = new ArrayList<InternationalStringType>();
        }
        return this.subTitle;
    }

    /**
     * An alternative title by which a data collection is commonly referred, or an abbreviation  for the title.Gets the value of the alternateTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getAlternateTitle() {
        if (alternateTitle == null) {
            alternateTitle = new ArrayList<InternationalStringType>();
        }
        return this.alternateTitle;
    }

    /**
     * Person, corporate body, or agency responsible for the substantive and intellectual content of the described object.Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatorType }
     * 
     * 
     */
    public List<CreatorType> getCreator() {
        if (creator == null) {
            creator = new ArrayList<CreatorType>();
        }
        return this.creator;
    }

    /**
     * Person or organization responsible for making the resource available in its present form.Gets the value of the publisher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publisher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublisher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getPublisher() {
        if (publisher == null) {
            publisher = new ArrayList<InternationalStringType>();
        }
        return this.publisher;
    }

    /**
     * The name of a contributing author or creator, who worked in support of the primary creator given above.Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorType }
     * 
     * 
     */
    public List<ContributorType> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<ContributorType>();
        }
        return this.contributor;
    }

    /**
     * The date of publication.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPublicationDate(DateType value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * ISBN, ISSN or similar designator.Gets the value of the internationalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypedStringType }
     * 
     * 
     */
    public List<TypedStringType> getInternationalIdentifier() {
        if (internationalIdentifier == null) {
            internationalIdentifier = new ArrayList<TypedStringType>();
        }
        return this.internationalIdentifier;
    }

    /**
     * The copyright statement.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *     
     */
    public InternationalStringType getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *     
     */
    public void setCopyright(InternationalStringType value) {
        this.copyright = value;
    }

    /**
     * Element including a sequence of Dublin Core fields that may be used to supplement - but not replace - the DDI citation.
     * 
     * @return
     *     possible object is
     *     {@link DCElementsType }
     *     
     */
    public DCElementsType getDCElements() {
        return dcElements;
    }

    /**
     * Sets the value of the dcElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCElementsType }
     *     
     */
    public void setDCElements(DCElementsType value) {
        this.dcElements = value;
    }

}
