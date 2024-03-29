//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.archive._3_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ddi.reusable._3_1.AccessRestrictionDateType;
import ddi.reusable._3_1.CodeValueType;
import ddi.reusable._3_1.CountryType;
import ddi.reusable._3_1.DateType;
import ddi.reusable._3_1.EmailType;
import ddi.reusable._3_1.InternationalStringType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.PointType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.SchemeReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ddi.archive._3_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Address_QNAME = new QName("ddi:archive:3_1", "Address");
    private final static QName _DepositRequirement_QNAME = new QName("ddi:archive:3_1", "DepositRequirement");
    private final static QName _ContactOrganizationReference_QNAME = new QName("ddi:archive:3_1", "ContactOrganizationReference");
    private final static QName _Telephone_QNAME = new QName("ddi:archive:3_1", "Telephone");
    private final static QName _VersionDistinction_QNAME = new QName("ddi:archive:3_1", "VersionDistinction");
    private final static QName _ClassDescription_QNAME = new QName("ddi:archive:3_1", "ClassDescription");
    private final static QName _OriginalArchiveOrganizationReference_QNAME = new QName("ddi:archive:3_1", "OriginalArchiveOrganizationReference");
    private final static QName _Location_QNAME = new QName("ddi:archive:3_1", "Location");
    private final static QName _AccessTypeName_QNAME = new QName("ddi:archive:3_1", "AccessTypeName");
    private final static QName _LocationReference_QNAME = new QName("ddi:archive:3_1", "LocationReference");
    private final static QName _InstantMessaging_QNAME = new QName("ddi:archive:3_1", "InstantMessaging");
    private final static QName _ArchiveOrganizationReference_QNAME = new QName("ddi:archive:3_1", "ArchiveOrganizationReference");
    private final static QName _Role_QNAME = new QName("ddi:archive:3_1", "Role");
    private final static QName _Disclaimer_QNAME = new QName("ddi:archive:3_1", "Disclaimer");
    private final static QName _Period_QNAME = new QName("ddi:archive:3_1", "Period");
    private final static QName _Email_QNAME = new QName("ddi:archive:3_1", "Email");
    private final static QName _AccessConditions_QNAME = new QName("ddi:archive:3_1", "AccessConditions");
    private final static QName _Country_QNAME = new QName("ddi:archive:3_1", "Country");
    private final static QName _LocationName_QNAME = new QName("ddi:archive:3_1", "LocationName");
    private final static QName _Position_QNAME = new QName("ddi:archive:3_1", "Position");
    private final static QName _Archive_QNAME = new QName("ddi:archive:3_1", "Archive");
    private final static QName _Keyword_QNAME = new QName("ddi:archive:3_1", "Keyword");
    private final static QName _EntityReference_QNAME = new QName("ddi:archive:3_1", "EntityReference");
    private final static QName _Collection_QNAME = new QName("ddi:archive:3_1", "Collection");
    private final static QName _ConfidentialityStatement_QNAME = new QName("ddi:archive:3_1", "ConfidentialityStatement");
    private final static QName _URL_QNAME = new QName("ddi:archive:3_1", "URL");
    private final static QName _Access_QNAME = new QName("ddi:archive:3_1", "Access");
    private final static QName _OrganizationName_QNAME = new QName("ddi:archive:3_1", "OrganizationName");
    private final static QName _Name_QNAME = new QName("ddi:archive:3_1", "Name");
    private final static QName _ArchiveModuleName_QNAME = new QName("ddi:archive:3_1", "ArchiveModuleName");
    private final static QName _OrganizationSchemeName_QNAME = new QName("ddi:archive:3_1", "OrganizationSchemeName");
    private final static QName _CollectionCompleteness_QNAME = new QName("ddi:archive:3_1", "CollectionCompleteness");
    private final static QName _Relation_QNAME = new QName("ddi:archive:3_1", "Relation");
    private final static QName _AvailabilityStatus_QNAME = new QName("ddi:archive:3_1", "AvailabilityStatus");
    private final static QName _ClassType_QNAME = new QName("ddi:archive:3_1", "ClassType");
    private final static QName _CitationRequirement_QNAME = new QName("ddi:archive:3_1", "CitationRequirement");
    private final static QName _OrganizationReference_QNAME = new QName("ddi:archive:3_1", "OrganizationReference");
    private final static QName _RegionalCoverage_QNAME = new QName("ddi:archive:3_1", "RegionalCoverage");
    private final static QName _GeographicLocation_QNAME = new QName("ddi:archive:3_1", "GeographicLocation");
    private final static QName _AccessRestrictionDate_QNAME = new QName("ddi:archive:3_1", "AccessRestrictionDate");
    private final static QName _VersionDistinctionName_QNAME = new QName("ddi:archive:3_1", "VersionDistinctionName");
    private final static QName _Organization_QNAME = new QName("ddi:archive:3_1", "Organization");
    private final static QName _DefaultAccess_QNAME = new QName("ddi:archive:3_1", "DefaultAccess");
    private final static QName _IndividualName_QNAME = new QName("ddi:archive:3_1", "IndividualName");
    private final static QName _Restrictions_QNAME = new QName("ddi:archive:3_1", "Restrictions");
    private final static QName _Language_QNAME = new QName("ddi:archive:3_1", "Language");
    private final static QName _StudyClass_QNAME = new QName("ddi:archive:3_1", "StudyClass");
    private final static QName _DDIMaintenanceAgencyID_QNAME = new QName("ddi:archive:3_1", "DDIMaintenanceAgencyID");
    private final static QName _ArchiveSpecific_QNAME = new QName("ddi:archive:3_1", "ArchiveSpecific");
    private final static QName _IndividualReference_QNAME = new QName("ddi:archive:3_1", "IndividualReference");
    private final static QName _Item_QNAME = new QName("ddi:archive:3_1", "Item");
    private final static QName _Format_QNAME = new QName("ddi:archive:3_1", "Format");
    private final static QName _AccessPermission_QNAME = new QName("ddi:archive:3_1", "AccessPermission");
    private final static QName _OrganizationScheme_QNAME = new QName("ddi:archive:3_1", "OrganizationScheme");
    private final static QName _Individual_QNAME = new QName("ddi:archive:3_1", "Individual");
    private final static QName _Nickname_QNAME = new QName("ddi:archive:3_1", "Nickname");
    private final static QName _ResearcherID_QNAME = new QName("ddi:archive:3_1", "ResearcherID");
    private final static QName _LocationInArchive_QNAME = new QName("ddi:archive:3_1", "LocationInArchive");
    private final static QName _OrganizationSchemeReference_QNAME = new QName("ddi:archive:3_1", "OrganizationSchemeReference");
    private final static QName _Statement_QNAME = new QName("ddi:archive:3_1", "Statement");
    private final static QName _Media_QNAME = new QName("ddi:archive:3_1", "Media");
    private final static QName _AddressTypePostal_QNAME = new QName("ddi:archive:3_1", "Postal");
    private final static QName _AddressTypeState_QNAME = new QName("ddi:archive:3_1", "State");
    private final static QName _AddressTypeCity_QNAME = new QName("ddi:archive:3_1", "City");
    private final static QName _AddressTypeLine_QNAME = new QName("ddi:archive:3_1", "Line");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ddi.archive._3_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormType }
     * 
     */
    public FormType createFormType() {
        return new FormType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link InstantMessagingType }
     * 
     */
    public InstantMessagingType createInstantMessagingType() {
        return new InstantMessagingType();
    }

    /**
     * Create an instance of {@link VersionDistinctionType }
     * 
     */
    public VersionDistinctionType createVersionDistinctionType() {
        return new VersionDistinctionType();
    }

    /**
     * Create an instance of {@link AccessType }
     * 
     */
    public AccessType createAccessType() {
        return new AccessType();
    }

    /**
     * Create an instance of {@link ArchiveSpecificType }
     * 
     */
    public ArchiveSpecificType createArchiveSpecificType() {
        return new ArchiveSpecificType();
    }

    /**
     * Create an instance of {@link TelephoneType }
     * 
     */
    public TelephoneType createTelephoneType() {
        return new TelephoneType();
    }

    /**
     * Create an instance of {@link DDIMaintenanceAgencyIDType }
     * 
     */
    public DDIMaintenanceAgencyIDType createDDIMaintenanceAgencyIDType() {
        return new DDIMaintenanceAgencyIDType();
    }

    /**
     * Create an instance of {@link ResearcherIDType }
     * 
     */
    public ResearcherIDType createResearcherIDType() {
        return new ResearcherIDType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link ArchiveType }
     * 
     */
    public ArchiveType createArchiveType() {
        return new ArchiveType();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link OrganizationSchemeType }
     * 
     */
    public OrganizationSchemeType createOrganizationSchemeType() {
        return new OrganizationSchemeType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link IndividualNameType }
     * 
     */
    public IndividualNameType createIndividualNameType() {
        return new IndividualNameType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link IndividualLanguageType }
     * 
     */
    public IndividualLanguageType createIndividualLanguageType() {
        return new IndividualLanguageType();
    }

    /**
     * Create an instance of {@link StudyClassType }
     * 
     */
    public StudyClassType createStudyClassType() {
        return new StudyClassType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "DepositRequirement")
    public JAXBElement<StructuredStringType> createDepositRequirement(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_DepositRequirement_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ContactOrganizationReference")
    public JAXBElement<ReferenceType> createContactOrganizationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_ContactOrganizationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Telephone")
    public JAXBElement<TelephoneType> createTelephone(TelephoneType value) {
        return new JAXBElement<TelephoneType>(_Telephone_QNAME, TelephoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionDistinctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "VersionDistinction")
    public JAXBElement<VersionDistinctionType> createVersionDistinction(VersionDistinctionType value) {
        return new JAXBElement<VersionDistinctionType>(_VersionDistinction_QNAME, VersionDistinctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ClassDescription")
    public JAXBElement<InternationalStringType> createClassDescription(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_ClassDescription_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OriginalArchiveOrganizationReference")
    public JAXBElement<ReferenceType> createOriginalArchiveOrganizationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_OriginalArchiveOrganizationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "AccessTypeName")
    public JAXBElement<NameType> createAccessTypeName(NameType value) {
        return new JAXBElement<NameType>(_AccessTypeName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "LocationReference")
    public JAXBElement<ReferenceType> createLocationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_LocationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstantMessagingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "InstantMessaging")
    public JAXBElement<InstantMessagingType> createInstantMessaging(InstantMessagingType value) {
        return new JAXBElement<InstantMessagingType>(_InstantMessaging_QNAME, InstantMessagingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ArchiveOrganizationReference")
    public JAXBElement<ReferenceType> createArchiveOrganizationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_ArchiveOrganizationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Role")
    public JAXBElement<RoleType> createRole(RoleType value) {
        return new JAXBElement<RoleType>(_Role_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Disclaimer")
    public JAXBElement<StructuredStringType> createDisclaimer(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_Disclaimer_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Period")
    public JAXBElement<DateType> createPeriod(DateType value) {
        return new JAXBElement<DateType>(_Period_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "AccessConditions")
    public JAXBElement<StructuredStringType> createAccessConditions(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_AccessConditions_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "LocationName")
    public JAXBElement<NameType> createLocationName(NameType value) {
        return new JAXBElement<NameType>(_LocationName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Position")
    public JAXBElement<PositionType> createPosition(PositionType value) {
        return new JAXBElement<PositionType>(_Position_QNAME, PositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Archive")
    public JAXBElement<ArchiveType> createArchive(ArchiveType value) {
        return new JAXBElement<ArchiveType>(_Archive_QNAME, ArchiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Keyword")
    public JAXBElement<InternationalStringType> createKeyword(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Keyword_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "EntityReference")
    public JAXBElement<ReferenceType> createEntityReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_EntityReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Collection")
    public JAXBElement<CollectionType> createCollection(CollectionType value) {
        return new JAXBElement<CollectionType>(_Collection_QNAME, CollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ConfidentialityStatement")
    public JAXBElement<StructuredStringType> createConfidentialityStatement(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_ConfidentialityStatement_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "URL")
    public JAXBElement<URLType> createURL(URLType value) {
        return new JAXBElement<URLType>(_URL_QNAME, URLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Access")
    public JAXBElement<AccessType> createAccess(AccessType value) {
        return new JAXBElement<AccessType>(_Access_QNAME, AccessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OrganizationName")
    public JAXBElement<InternationalStringType> createOrganizationName(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_OrganizationName_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Name")
    public JAXBElement<InternationalStringType> createName(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Name_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ArchiveModuleName")
    public JAXBElement<NameType> createArchiveModuleName(NameType value) {
        return new JAXBElement<NameType>(_ArchiveModuleName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OrganizationSchemeName")
    public JAXBElement<NameType> createOrganizationSchemeName(NameType value) {
        return new JAXBElement<NameType>(_OrganizationSchemeName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "CollectionCompleteness")
    public JAXBElement<StructuredStringType> createCollectionCompleteness(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_CollectionCompleteness_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Relation")
    public JAXBElement<RelationType> createRelation(RelationType value) {
        return new JAXBElement<RelationType>(_Relation_QNAME, RelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "AvailabilityStatus")
    public JAXBElement<StructuredStringType> createAvailabilityStatus(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_AvailabilityStatus_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ClassType")
    public JAXBElement<CodeValueType> createClassType(CodeValueType value) {
        return new JAXBElement<CodeValueType>(_ClassType_QNAME, CodeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "CitationRequirement")
    public JAXBElement<StructuredStringType> createCitationRequirement(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_CitationRequirement_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OrganizationReference")
    public JAXBElement<ReferenceType> createOrganizationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_OrganizationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "RegionalCoverage")
    public JAXBElement<CodeValueType> createRegionalCoverage(CodeValueType value) {
        return new JAXBElement<CodeValueType>(_RegionalCoverage_QNAME, CodeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "GeographicLocation")
    public JAXBElement<PointType> createGeographicLocation(PointType value) {
        return new JAXBElement<PointType>(_GeographicLocation_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessRestrictionDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "AccessRestrictionDate")
    public JAXBElement<AccessRestrictionDateType> createAccessRestrictionDate(AccessRestrictionDateType value) {
        return new JAXBElement<AccessRestrictionDateType>(_AccessRestrictionDate_QNAME, AccessRestrictionDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "VersionDistinctionName")
    public JAXBElement<NameType> createVersionDistinctionName(NameType value) {
        return new JAXBElement<NameType>(_VersionDistinctionName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "DefaultAccess")
    public JAXBElement<AccessType> createDefaultAccess(AccessType value) {
        return new JAXBElement<AccessType>(_DefaultAccess_QNAME, AccessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "IndividualName")
    public JAXBElement<IndividualNameType> createIndividualName(IndividualNameType value) {
        return new JAXBElement<IndividualNameType>(_IndividualName_QNAME, IndividualNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Restrictions")
    public JAXBElement<StructuredStringType> createRestrictions(StructuredStringType value) {
        return new JAXBElement<StructuredStringType>(_Restrictions_QNAME, StructuredStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualLanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Language")
    public JAXBElement<IndividualLanguageType> createLanguage(IndividualLanguageType value) {
        return new JAXBElement<IndividualLanguageType>(_Language_QNAME, IndividualLanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudyClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "StudyClass")
    public JAXBElement<StudyClassType> createStudyClass(StudyClassType value) {
        return new JAXBElement<StudyClassType>(_StudyClass_QNAME, StudyClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DDIMaintenanceAgencyIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "DDIMaintenanceAgencyID")
    public JAXBElement<DDIMaintenanceAgencyIDType> createDDIMaintenanceAgencyID(DDIMaintenanceAgencyIDType value) {
        return new JAXBElement<DDIMaintenanceAgencyIDType>(_DDIMaintenanceAgencyID_QNAME, DDIMaintenanceAgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveSpecificType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ArchiveSpecific")
    public JAXBElement<ArchiveSpecificType> createArchiveSpecific(ArchiveSpecificType value) {
        return new JAXBElement<ArchiveSpecificType>(_ArchiveSpecific_QNAME, ArchiveSpecificType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "IndividualReference")
    public JAXBElement<ReferenceType> createIndividualReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_IndividualReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Format")
    public JAXBElement<InternationalStringType> createFormat(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Format_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "AccessPermission")
    public JAXBElement<FormType> createAccessPermission(FormType value) {
        return new JAXBElement<FormType>(_AccessPermission_QNAME, FormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OrganizationScheme")
    public JAXBElement<OrganizationSchemeType> createOrganizationScheme(OrganizationSchemeType value) {
        return new JAXBElement<OrganizationSchemeType>(_OrganizationScheme_QNAME, OrganizationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Individual")
    public JAXBElement<IndividualType> createIndividual(IndividualType value) {
        return new JAXBElement<IndividualType>(_Individual_QNAME, IndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Nickname")
    public JAXBElement<InternationalStringType> createNickname(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Nickname_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResearcherIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "ResearcherID")
    public JAXBElement<ResearcherIDType> createResearcherID(ResearcherIDType value) {
        return new JAXBElement<ResearcherIDType>(_ResearcherID_QNAME, ResearcherIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "LocationInArchive")
    public JAXBElement<InternationalStringType> createLocationInArchive(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_LocationInArchive_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchemeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "OrganizationSchemeReference")
    public JAXBElement<SchemeReferenceType> createOrganizationSchemeReference(SchemeReferenceType value) {
        return new JAXBElement<SchemeReferenceType>(_OrganizationSchemeReference_QNAME, SchemeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Statement")
    public JAXBElement<InternationalStringType> createStatement(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Statement_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Media")
    public JAXBElement<InternationalStringType> createMedia(InternationalStringType value) {
        return new JAXBElement<InternationalStringType>(_Media_QNAME, InternationalStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Postal", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePostal(String value) {
        return new JAXBElement<String>(_AddressTypePostal_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "State", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeState(String value) {
        return new JAXBElement<String>(_AddressTypeState_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "City", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:archive:3_1", name = "Line", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeLine(String value) {
        return new JAXBElement<String>(_AddressTypeLine_QNAME, String.class, AddressType.class, value);
    }

}
