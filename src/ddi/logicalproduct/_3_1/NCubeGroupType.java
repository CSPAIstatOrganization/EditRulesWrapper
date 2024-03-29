//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.CodeValueType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;
import ddi.reusable._3_1.VersionableType;


/**
 * Describes a group of NCubes.
 * 
 * <p>Java class for NCubeGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NCubeGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}GroupType"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}NCubeGroupName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}UniverseReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}ConceptReference" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}NCubeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}NCubeGroupReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NCubeGroupType", propOrder = {
    "groupType",
    "nCubeGroupName",
    "label",
    "description",
    "universeReference",
    "conceptReference",
    "nCubeReference",
    "nCubeGroupReference"
})
public class NCubeGroupType
    extends VersionableType
{

    @XmlElementRef(name = "GroupType", namespace = "ddi:logicalproduct:3_1", type = JAXBElement.class)
    protected JAXBElement<? extends CodeValueType> groupType;
    @XmlElement(name = "NCubeGroupName")
    protected List<NameType> nCubeGroupName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "UniverseReference", namespace = "ddi:reusable:3_1")
    protected List<ReferenceType> universeReference;
    @XmlElement(name = "ConceptReference")
    protected ReferenceType conceptReference;
    @XmlElement(name = "NCubeReference")
    protected List<ReferenceType> nCubeReference;
    @XmlElement(name = "NCubeGroupReference")
    protected List<ReferenceType> nCubeGroupReference;

    /**
     * A generic element for specifying a reason for a variable or nCube group. Note that this element can contain either a term from a controlled vocabulary list or a textual description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupTypeCodedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeValueType }{@code >}
     *     
     */
    public JAXBElement<? extends CodeValueType> getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupTypeCodedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeValueType }{@code >}
     *     
     */
    public void setGroupType(JAXBElement<? extends CodeValueType> value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the nCubeGroupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nCubeGroupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNCubeGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getNCubeGroupName() {
        if (nCubeGroupName == null) {
            nCubeGroupName = new ArrayList<NameType>();
        }
        return this.nCubeGroupName;
    }

    /**
     * A display label for the NCube group.Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelType }
     * 
     * 
     */
    public List<LabelType> getLabel() {
        if (label == null) {
            label = new ArrayList<LabelType>();
        }
        return this.label;
    }

    /**
     * Additional textual descriptions of the NCube group.Gets the value of the description property.
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
     * Reference to the universe statement describing the persons or other elements that are covered by the data, and to which any analytic results refer.Gets the value of the universeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniverseReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getUniverseReference() {
        if (universeReference == null) {
            universeReference = new ArrayList<ReferenceType>();
        }
        return this.universeReference;
    }

    /**
     * Reference to the concept measured by the NCubes in this group.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getConceptReference() {
        return conceptReference;
    }

    /**
     * Sets the value of the conceptReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setConceptReference(ReferenceType value) {
        this.conceptReference = value;
    }

    /**
     * Reference to a constituent NCube.Gets the value of the nCubeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nCubeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNCubeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getNCubeReference() {
        if (nCubeReference == null) {
            nCubeReference = new ArrayList<ReferenceType>();
        }
        return this.nCubeReference;
    }

    /**
     * Reference to a constituent NCube group. This allows for nesting of NCube groups.Gets the value of the nCubeGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nCubeGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNCubeGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getNCubeGroupReference() {
        if (nCubeGroupReference == null) {
            nCubeGroupReference = new ArrayList<ReferenceType>();
        }
        return this.nCubeGroupReference;
    }

}
