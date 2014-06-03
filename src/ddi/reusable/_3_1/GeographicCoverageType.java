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


/**
 * Describes the geographic coverage of the data documented in a particular DDI module.
 * 
 * <p>Java class for GeographicCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicCoverageType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}BoundingBox" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographyStructureVariable" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}SpatialObject" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographicStructureReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographicLocationReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}SummaryDataReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}TopLevelReference"/>
 *         &lt;element ref="{ddi:reusable:3_1}LowestLevelReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicCoverageType", propOrder = {
    "boundingBox",
    "description",
    "geographyStructureVariable",
    "spatialObject",
    "geographicStructureReference",
    "geographicLocationReference",
    "summaryDataReference",
    "topLevelReference",
    "lowestLevelReference"
})
public class GeographicCoverageType
    extends IdentifiableType
{

    @XmlElement(name = "BoundingBox")
    protected BoundingBoxType boundingBox;
    @XmlElement(name = "Description")
    protected List<StructuredStringType> description;
    @XmlElement(name = "GeographyStructureVariable")
    protected ReferenceType geographyStructureVariable;
    @XmlElement(name = "SpatialObject")
    protected GeographicDescriptionCodeType spatialObject;
    @XmlElement(name = "GeographicStructureReference")
    protected List<ReferenceType> geographicStructureReference;
    @XmlElement(name = "GeographicLocationReference")
    protected List<ReferenceType> geographicLocationReference;
    @XmlElement(name = "SummaryDataReference")
    protected List<ReferenceType> summaryDataReference;
    @XmlElement(name = "TopLevelReference", required = true)
    protected LevelReferenceType topLevelReference;
    @XmlElement(name = "LowestLevelReference", required = true)
    protected LevelReferenceType lowestLevelReference;

    /**
     * The Bounding Box is a 'rectangle, oriented to the x and y axes, which bounds a geographic feature or a geographic dataset. It is specified by two coordinates: xmin, ymin and xmax,ymax.' [FGDC]. In the DDI, it describes the full extent of the geographic coverage, and is designed to be used by systems that search for geography by coordinates. It is compatible with the description and structure found in FGDC and other geographic metadata structures.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBoxType }
     *     
     */
    public BoundingBoxType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBoxType }
     *     
     */
    public void setBoundingBox(BoundingBoxType value) {
        this.boundingBox = value;
    }

    /**
     * Provides a human-readable summary of the information included in Geography and Geography Reference. It may include information on all levels of spatial coverage, in addition to the overall coverage. This field can map to Dublin Core Coverage, which does not support structured strings. Therefore, if there is intent to map to Dublin Core, the text should not be marked up with XHTML.Gets the value of the description property.
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
     * References a variable describing the geographic levels available in the data such as the variable "Summary Level" in U.S. Census data.  This reference is needed for assistance in programming.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGeographyStructureVariable() {
        return geographyStructureVariable;
    }

    /**
     * Sets the value of the geographyStructureVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGeographyStructureVariable(ReferenceType value) {
        this.geographyStructureVariable = value;
    }

    /**
     * Contains information on the most discrete type of spatial representation to which data in this file can be attached (point, line, polygon, linear ring). For example, a raw data file with an address attached to each case is 'point'. When the microdata file is anonymized and the geographic information is for a state or other defined area, it is 'polygon'. Some data, such as traffic or criminal incidence data may have a street range identification or 'line', and some such as communications data have a point with a radius or 'linear ring'. 
     * 
     * @return
     *     possible object is
     *     {@link GeographicDescriptionCodeType }
     *     
     */
    public GeographicDescriptionCodeType getSpatialObject() {
        return spatialObject;
    }

    /**
     * Sets the value of the spatialObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicDescriptionCodeType }
     *     
     */
    public void setSpatialObject(GeographicDescriptionCodeType value) {
        this.spatialObject = value;
    }

    /**
     * Contains information on the hierarchy of the geographic structure. The structure can be defined within the DDI or an external structure can be referenced.Gets the value of the geographicStructureReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicStructureReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicStructureReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getGeographicStructureReference() {
        if (geographicStructureReference == null) {
            geographicStructureReference = new ArrayList<ReferenceType>();
        }
        return this.geographicStructureReference;
    }

    /**
     * Contains information on the specific geographic areas defined in the dataset such as cities, countries, or states. The areas can be defined within the DDI or an external structure can be referenced.Gets the value of the geographicLocationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicLocationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getGeographicLocationReference() {
        if (geographicLocationReference == null) {
            geographicLocationReference = new ArrayList<ReferenceType>();
        }
        return this.geographicLocationReference;
    }

    /**
     * May be repeated to reference each geography (geographic level) for which there is summary data.Gets the value of the summaryDataReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryDataReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryDataReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getSummaryDataReference() {
        if (summaryDataReference == null) {
            summaryDataReference = new ArrayList<ReferenceType>();
        }
        return this.summaryDataReference;
    }

    /**
     * Reference to the top-level geography.
     * 
     * @return
     *     possible object is
     *     {@link LevelReferenceType }
     *     
     */
    public LevelReferenceType getTopLevelReference() {
        return topLevelReference;
    }

    /**
     * Sets the value of the topLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelReferenceType }
     *     
     */
    public void setTopLevelReference(LevelReferenceType value) {
        this.topLevelReference = value;
    }

    /**
     * Reference to the lowest-level geography.
     * 
     * @return
     *     possible object is
     *     {@link LevelReferenceType }
     *     
     */
    public LevelReferenceType getLowestLevelReference() {
        return lowestLevelReference;
    }

    /**
     * Sets the value of the lowestLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelReferenceType }
     *     
     */
    public void setLowestLevelReference(LevelReferenceType value) {
        this.lowestLevelReference = value;
    }

}