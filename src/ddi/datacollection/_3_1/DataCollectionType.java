//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.datacollection._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.CoverageType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.MaintainableType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.NoteType;
import ddi.reusable._3_1.OtherMaterialType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * Includes information about the data collection and post-collection processing.
 * 
 * <p>Java class for DataCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}MaintainableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:datacollection:3_1}DataCollectionModuleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Coverage" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}OtherMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}Methodology" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}CollectionEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}QuestionScheme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}ControlConstructScheme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}InterviewerInstructionScheme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}Instrument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}ProcessingEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataCollectionType", propOrder = {
    "dataCollectionModuleName",
    "label",
    "description",
    "coverage",
    "otherMaterial",
    "note",
    "methodology",
    "collectionEvent",
    "questionScheme",
    "controlConstructScheme",
    "interviewerInstructionScheme",
    "instrument",
    "processingEvent"
})
public class DataCollectionType
    extends MaintainableType
{

    @XmlElement(name = "DataCollectionModuleName")
    protected List<NameType> dataCollectionModuleName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "Coverage", namespace = "ddi:reusable:3_1")
    protected CoverageType coverage;
    @XmlElement(name = "OtherMaterial", namespace = "ddi:reusable:3_1")
    protected List<OtherMaterialType> otherMaterial;
    @XmlElement(name = "Note", namespace = "ddi:reusable:3_1")
    protected List<NoteType> note;
    @XmlElement(name = "Methodology")
    protected MethodologyType methodology;
    @XmlElement(name = "CollectionEvent")
    protected List<CollectionEventType> collectionEvent;
    @XmlElement(name = "QuestionScheme")
    protected List<QuestionSchemeType> questionScheme;
    @XmlElement(name = "ControlConstructScheme")
    protected List<ControlConstructSchemeType> controlConstructScheme;
    @XmlElement(name = "InterviewerInstructionScheme")
    protected List<InterviewerInstructionSchemeType> interviewerInstructionScheme;
    @XmlElement(name = "Instrument")
    protected List<InstrumentType> instrument;
    @XmlElement(name = "ProcessingEvent")
    protected List<ProcessingType> processingEvent;

    /**
     * Gets the value of the dataCollectionModuleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCollectionModuleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCollectionModuleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getDataCollectionModuleName() {
        if (dataCollectionModuleName == null) {
            dataCollectionModuleName = new ArrayList<NameType>();
        }
        return this.dataCollectionModuleName;
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
     * Describes the coverage of the data collection activity.
     * 
     * @return
     *     possible object is
     *     {@link CoverageType }
     *     
     */
    public CoverageType getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageType }
     *     
     */
    public void setCoverage(CoverageType value) {
        this.coverage = value;
    }

    /**
     * Other materials related to the data collection.Gets the value of the otherMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherMaterialType }
     * 
     * 
     */
    public List<OtherMaterialType> getOtherMaterial() {
        if (otherMaterial == null) {
            otherMaterial = new ArrayList<OtherMaterialType>();
        }
        return this.otherMaterial;
    }

    /**
     * Notes regarding the data collection metadata.Gets the value of the note property.
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
     * Methodological metadata for the data collection.
     * 
     * @return
     *     possible object is
     *     {@link MethodologyType }
     *     
     */
    public MethodologyType getMethodology() {
        return methodology;
    }

    /**
     * Sets the value of the methodology property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodologyType }
     *     
     */
    public void setMethodology(MethodologyType value) {
        this.methodology = value;
    }

    /**
     * A set of metadata describing a data collection event. Several events may be described in a single data collection activity.Gets the value of the collectionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionEventType }
     * 
     * 
     */
    public List<CollectionEventType> getCollectionEvent() {
        if (collectionEvent == null) {
            collectionEvent = new ArrayList<CollectionEventType>();
        }
        return this.collectionEvent;
    }

    /**
     * Describes a set of questions used in the data collection. Several sets of questions may be used. A single scheme always is maintained by a single agency.Gets the value of the questionScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionSchemeType }
     * 
     * 
     */
    public List<QuestionSchemeType> getQuestionScheme() {
        if (questionScheme == null) {
            questionScheme = new ArrayList<QuestionSchemeType>();
        }
        return this.questionScheme;
    }

    /**
     * A collection of control constructs used in data collection by one or more instruments.Gets the value of the controlConstructScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlConstructScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlConstructScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlConstructSchemeType }
     * 
     * 
     */
    public List<ControlConstructSchemeType> getControlConstructScheme() {
        if (controlConstructScheme == null) {
            controlConstructScheme = new ArrayList<ControlConstructSchemeType>();
        }
        return this.controlConstructScheme;
    }

    /**
     * A collection of interviewer instructions used in data collection by instruments.Gets the value of the interviewerInstructionScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interviewerInstructionScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterviewerInstructionScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterviewerInstructionSchemeType }
     * 
     * 
     */
    public List<InterviewerInstructionSchemeType> getInterviewerInstructionScheme() {
        if (interviewerInstructionScheme == null) {
            interviewerInstructionScheme = new ArrayList<InterviewerInstructionSchemeType>();
        }
        return this.interviewerInstructionScheme;
    }

    /**
     * A description of an instrument used in the data collection activity.Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentType }
     * 
     * 
     */
    public List<InstrumentType> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<InstrumentType>();
        }
        return this.instrument;
    }

    /**
     * Metadata regarding a processing event occurring as part of the data collection or data file preparation.Gets the value of the processingEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingType }
     * 
     * 
     */
    public List<ProcessingType> getProcessingEvent() {
        if (processingEvent == null) {
            processingEvent = new ArrayList<ProcessingType>();
        }
        return this.processingEvent;
    }

}
