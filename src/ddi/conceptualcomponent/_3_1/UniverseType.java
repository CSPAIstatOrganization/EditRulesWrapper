//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.conceptualcomponent._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.CodeType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.StructuredStringType;
import ddi.reusable._3_1.VersionableType;


/**
 * Universe statement associated with the data.
 * 
 * <p>Java class for UniverseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniverseType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}UniverseName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}HumanReadable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}MachineReadable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}SubUniverse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniverseType", propOrder = {
    "universeName",
    "label",
    "humanReadable",
    "machineReadable",
    "subUniverse"
})
public class UniverseType
    extends VersionableType
{

    @XmlElement(name = "UniverseName")
    protected List<NameType> universeName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "HumanReadable")
    protected List<StructuredStringType> humanReadable;
    @XmlElement(name = "MachineReadable")
    protected List<CodeType> machineReadable;
    @XmlElement(name = "SubUniverse")
    protected List<UniverseType> subUniverse;
    @XmlAttribute(name = "isInclusive")
    protected Boolean isInclusive;

    /**
     * Gets the value of the universeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniverseName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getUniverseName() {
        if (universeName == null) {
            universeName = new ArrayList<NameType>();
        }
        return this.universeName;
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
     * A human-readable description of the Universe.Gets the value of the humanReadable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humanReadable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumanReadable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredStringType }
     * 
     * 
     */
    public List<StructuredStringType> getHumanReadable() {
        if (humanReadable == null) {
            humanReadable = new ArrayList<StructuredStringType>();
        }
        return this.humanReadable;
    }

    /**
     * A machine-readable statement of the universe, expressed as a Coding.Gets the value of the machineReadable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machineReadable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachineReadable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getMachineReadable() {
        if (machineReadable == null) {
            machineReadable = new ArrayList<CodeType>();
        }
        return this.machineReadable;
    }

    /**
     * A subset of the parent universe, for example the universe "females" is a subset of the universe "all persons".Gets the value of the subUniverse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subUniverse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubUniverse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniverseType }
     * 
     * 
     */
    public List<UniverseType> getSubUniverse() {
        if (subUniverse == null) {
            subUniverse = new ArrayList<UniverseType>();
        }
        return this.subUniverse;
    }

    /**
     * Gets the value of the isInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInclusive() {
        if (isInclusive == null) {
            return true;
        } else {
            return isInclusive;
        }
    }

    /**
     * Sets the value of the isInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInclusive(Boolean value) {
        this.isInclusive = value;
    }

}
