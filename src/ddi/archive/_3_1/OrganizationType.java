//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.archive._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.CodeValueType;
import ddi.reusable._3_1.EmailType;
import ddi.reusable._3_1.ImageType;
import ddi.reusable._3_1.InternationalStringType;
import ddi.reusable._3_1.NoteType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;
import ddi.reusable._3_1.VersionableType;


/**
 * Describes an organization. All agencies must be defined as an Organization in an Archive module (which can be defined inline or resolved externally). 
 * 
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{ddi:archive:3_1}OrganizationReference"/>
 *           &lt;sequence>
 *             &lt;element ref="{ddi:archive:3_1}OrganizationName" maxOccurs="unbounded"/>
 *             &lt;element ref="{ddi:archive:3_1}Nickname" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}DDIMaintenanceAgencyID" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Keyword" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Location" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Telephone" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}URL" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Email" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}InstantMessaging" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}RegionalCoverage" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}Note" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Individual" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}Relation" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}Image" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{ddi:archive:3_1}VersionDistinction" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{ddi:archive:3_1}PRIVACY"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "organizationReference",
    "organizationName",
    "nickname",
    "ddiMaintenanceAgencyID",
    "description",
    "keyword",
    "location",
    "telephone",
    "url",
    "email",
    "instantMessaging",
    "regionalCoverage",
    "note",
    "individual",
    "relation",
    "image",
    "versionDistinction"
})
public class OrganizationType
    extends VersionableType
{

    @XmlElement(name = "OrganizationReference")
    protected ReferenceType organizationReference;
    @XmlElement(name = "OrganizationName")
    protected List<InternationalStringType> organizationName;
    @XmlElement(name = "Nickname")
    protected List<InternationalStringType> nickname;
    @XmlElement(name = "DDIMaintenanceAgencyID")
    protected List<DDIMaintenanceAgencyIDType> ddiMaintenanceAgencyID;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "Keyword")
    protected List<InternationalStringType> keyword;
    @XmlElement(name = "Location")
    protected List<LocationType> location;
    @XmlElement(name = "Telephone")
    protected List<TelephoneType> telephone;
    @XmlElement(name = "URL")
    protected List<URLType> url;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "InstantMessaging")
    protected List<InstantMessagingType> instantMessaging;
    @XmlElement(name = "RegionalCoverage")
    protected CodeValueType regionalCoverage;
    @XmlElement(name = "Note", namespace = "ddi:reusable:3_1")
    protected List<NoteType> note;
    @XmlElement(name = "Individual")
    protected List<IndividualType> individual;
    @XmlElement(name = "Relation")
    protected List<RelationType> relation;
    @XmlElement(name = "Image", namespace = "ddi:reusable:3_1")
    protected List<ImageType> image;
    @XmlElement(name = "VersionDistinction")
    protected List<VersionDistinctionType> versionDistinction;
    @XmlAttribute(name = "privacy")
    protected String privacy;

    /**
     * Reference to an organization described externally.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOrganizationReference(ReferenceType value) {
        this.organizationReference = value;
    }

    /**
     * The official name of the organization. This may be repeated for multiple languages. Alternate names should be placed in Nickname.Gets the value of the organizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getOrganizationName() {
        if (organizationName == null) {
            organizationName = new ArrayList<InternationalStringType>();
        }
        return this.organizationName;
    }

    /**
     * An abbreviation or a brief name for an organization.Gets the value of the nickname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nickname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNickname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getNickname() {
        if (nickname == null) {
            nickname = new ArrayList<InternationalStringType>();
        }
        return this.nickname;
    }

    /**
     * Contains the official DDI ID of the maintence agency as registered with the DDI registry by the parent organization or individual. A single organization or individual may have one or more DDI Maintenance Agency IDs registered within the DDI registry (i.e., an organization may have a DDI Maintenance Agency ID for each project managed by the organization) The structure of this string is described by Part I of the Technical Documentation and the content is registered within the DDI registry as a unique identifer.Gets the value of the ddiMaintenanceAgencyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ddiMaintenanceAgencyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDIMaintenanceAgencyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDIMaintenanceAgencyIDType }
     * 
     * 
     */
    public List<DDIMaintenanceAgencyIDType> getDDIMaintenanceAgencyID() {
        if (ddiMaintenanceAgencyID == null) {
            ddiMaintenanceAgencyID = new ArrayList<DDIMaintenanceAgencyIDType>();
        }
        return this.ddiMaintenanceAgencyID;
    }

    /**
     * Description of the organization.Gets the value of the description property.
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

    /**
     * Keyword used to classify the organization or its activities.Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalStringType }
     * 
     * 
     */
    public List<InternationalStringType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<InternationalStringType>();
        }
        return this.keyword;
    }

    /**
     * A physical (or virtual) location.Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * Telephone number of an organization.Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneType }
     * 
     * 
     */
    public List<TelephoneType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneType>();
        }
        return this.telephone;
    }

    /**
     * URL of organization's Web site Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLType }
     * 
     * 
     */
    public List<URLType> getURL() {
        if (url == null) {
            url = new ArrayList<URLType>();
        }
        return this.url;
    }

    /**
     * Generic email address of organization Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * IMessaging identification for the organization (can be used for live technical support, sales, etc.) Gets the value of the instantMessaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantMessaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantMessagingType }
     * 
     * 
     */
    public List<InstantMessagingType> getInstantMessaging() {
        if (instantMessaging == null) {
            instantMessaging = new ArrayList<InstantMessagingType>();
        }
        return this.instantMessaging;
    }

    /**
     * The geographic coverage for the activity and/or jurisdiction of the organization
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getRegionalCoverage() {
        return regionalCoverage;
    }

    /**
     * Sets the value of the regionalCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setRegionalCoverage(CodeValueType value) {
        this.regionalCoverage = value;
    }

    /**
     * Generic note about the organization.Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Provides flexibility to define individuals directly within an organization (i.e. staff).Gets the value of the individual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualType }
     * 
     * 
     */
    public List<IndividualType> getIndividual() {
        if (individual == null) {
            individual = new ArrayList<IndividualType>();
        }
        return this.individual;
    }

    /**
     * Describes relations between actors in the context of the organization.Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
    }

    /**
     * Provides an external link to images associated with the organization (logos, etc.).Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public List<ImageType> getImage() {
        if (image == null) {
            image = new ArrayList<ImageType>();
        }
        return this.image;
    }

    /**
     * Describes the data versioning scheme(s) used by an organization. If more than one, Name should differentiate between a standard versioning structure used by the oranization and special structures used by specific projects or studies. Information on what drives and major and minor change and how they are structured.Gets the value of the versionDistinction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionDistinction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionDistinction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionDistinctionType }
     * 
     * 
     */
    public List<VersionDistinctionType> getVersionDistinction() {
        if (versionDistinction == null) {
            versionDistinction = new ArrayList<VersionDistinctionType>();
        }
        return this.versionDistinction;
    }

    /**
     * Gets the value of the privacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * Sets the value of the privacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacy(String value) {
        this.privacy = value;
    }

}