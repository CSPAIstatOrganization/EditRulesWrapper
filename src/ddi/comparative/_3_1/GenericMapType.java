//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.comparative._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.ReferenceType;
import ddi.reusable._3_1.StructuredStringType;
import ddi.reusable._3_1.VersionableType;


/**
 * Maps comparable items from two different schemes.
 * 
 * <p>Java class for GenericMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericMapType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:comparative:3_1}MapName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:comparative:3_1}SourceSchemeReference"/>
 *         &lt;element ref="{ddi:comparative:3_1}TargetSchemeReference"/>
 *         &lt;element ref="{ddi:comparative:3_1}Correspondence"/>
 *         &lt;element ref="{ddi:comparative:3_1}ItemMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericMapType", propOrder = {
    "mapName",
    "label",
    "description",
    "sourceSchemeReference",
    "targetSchemeReference",
    "correspondence",
    "itemMap"
})
public class GenericMapType
    extends VersionableType
{

    @XmlElement(name = "MapName")
    protected List<NameType> mapName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "SourceSchemeReference", required = true)
    protected ReferenceType sourceSchemeReference;
    @XmlElement(name = "TargetSchemeReference", required = true)
    protected ReferenceType targetSchemeReference;
    @XmlElement(name = "Correspondence", required = true)
    protected CorrespondenceType correspondence;
    @XmlElement(name = "ItemMap")
    protected List<ItemMapType> itemMap;

    /**
     * Gets the value of the mapName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getMapName() {
        if (mapName == null) {
            mapName = new ArrayList<NameType>();
        }
        return this.mapName;
    }

    /**
     * Gets the value of the label property.
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
     * Gets the value of the description property.
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
     * References the scheme that is the source for the mapping.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSourceSchemeReference() {
        return sourceSchemeReference;
    }

    /**
     * Sets the value of the sourceSchemeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSourceSchemeReference(ReferenceType value) {
        this.sourceSchemeReference = value;
    }

    /**
     * References the scheme that is the target for the mapping.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTargetSchemeReference() {
        return targetSchemeReference;
    }

    /**
     * Sets the value of the targetSchemeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTargetSchemeReference(ReferenceType value) {
        this.targetSchemeReference = value;
    }

    /**
     * Describes the correspondence between the target and source schemes.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceType }
     *     
     */
    public CorrespondenceType getCorrespondence() {
        return correspondence;
    }

    /**
     * Sets the value of the correspondence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceType }
     *     
     */
    public void setCorrespondence(CorrespondenceType value) {
        this.correspondence = value;
    }

    /**
     * Maps an individual item in the source scheme to an item in the target scheme. Gets the value of the itemMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemMapType }
     * 
     * 
     */
    public List<ItemMapType> getItemMap() {
        if (itemMap == null) {
            itemMap = new ArrayList<ItemMapType>();
        }
        return this.itemMap;
    }

}
