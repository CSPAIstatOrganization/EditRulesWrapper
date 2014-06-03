//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ddi.archive._3_1.ArchiveType;
import ddi.archive._3_1.OrganizationSchemeType;
import ddi.comparative._3_1.ComparisonType;
import ddi.conceptualcomponent._3_1.ConceptSchemeType;
import ddi.conceptualcomponent._3_1.ConceptualComponentType;
import ddi.conceptualcomponent._3_1.GeographicLocationSchemeType;
import ddi.conceptualcomponent._3_1.GeographicStructureSchemeType;
import ddi.conceptualcomponent._3_1.UniverseSchemeType;
import ddi.datacollection._3_1.ControlConstructSchemeType;
import ddi.datacollection._3_1.DataCollectionType;
import ddi.datacollection._3_1.InstrumentType;
import ddi.datacollection._3_1.InterviewerInstructionSchemeType;
import ddi.datacollection._3_1.QuestionSchemeType;
import ddi.ddiprofile._3_1.DDIProfileType;
import ddi.group._3_1.GroupType;
import ddi.group._3_1.LocalHoldingPackageType;
import ddi.group._3_1.ResourcePackageType;
import ddi.instance._3_1.DDIInstanceType;
import ddi.logicalproduct._3_1.BaseLogicalProductType;
import ddi.logicalproduct._3_1.CategorySchemeType;
import ddi.logicalproduct._3_1.CodeSchemeType;
import ddi.logicalproduct._3_1.NCubeSchemeType;
import ddi.logicalproduct._3_1.VariableSchemeType;
import ddi.physicaldataproduct._3_1.PhysicalDataProductType;
import ddi.physicaldataproduct._3_1.PhysicalStructureSchemeType;
import ddi.physicaldataproduct._3_1.RecordLayoutSchemeType;
import ddi.physicalinstance._3_1.PhysicalInstanceType;
import ddi.studyunit._3_1.StudyUnitType;


/**
 * <p>Java class for MaintainableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainableType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}AbstractMaintainableType">
 *       &lt;attribute name="isMaintainable" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainableType")
@XmlSeeAlso({
    DDIInstanceType.class,
    ArchiveType.class,
    OrganizationSchemeType.class,
    ComparisonType.class,
    InterviewerInstructionSchemeType.class,
    DataCollectionType.class,
    QuestionSchemeType.class,
    ControlConstructSchemeType.class,
    InstrumentType.class,
    BaseLogicalProductType.class,
    CategorySchemeType.class,
    NCubeSchemeType.class,
    CodeSchemeType.class,
    VariableSchemeType.class,
    GeographicStructureSchemeType.class,
    GeographicLocationSchemeType.class,
    ConceptSchemeType.class,
    UniverseSchemeType.class,
    ConceptualComponentType.class,
    PhysicalStructureSchemeType.class,
    PhysicalDataProductType.class,
    RecordLayoutSchemeType.class,
    DDIProfileType.class,
    ResourcePackageType.class,
    LocalHoldingPackageType.class,
    GroupType.class,
    StudyUnitType.class,
    PhysicalInstanceType.class
})
public abstract class MaintainableType
    extends AbstractMaintainableType
{

    @XmlAttribute(name = "isMaintainable")
    protected Boolean isMaintainable;

    /**
     * Gets the value of the isMaintainable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMaintainable() {
        if (isMaintainable == null) {
            return true;
        } else {
            return isMaintainable;
        }
    }

    /**
     * Sets the value of the isMaintainable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMaintainable(Boolean value) {
        this.isMaintainable = value;
    }

}