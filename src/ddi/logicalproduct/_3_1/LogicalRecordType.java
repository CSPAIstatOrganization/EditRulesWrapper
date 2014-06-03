//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.IdentifiableType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * Describes the logical record in terms of identification of its type, case identification, its relationship with other records, and support for multiple storage segments. Required to link a description of a physical record structure to its logical record.
 * 
 * <p>Java class for LogicalRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:logicalproduct:3_1}LogicalRecordName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}VariableValueReference" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}SupportForMultipleSegments" minOccurs="0"/>
 *         &lt;element ref="{ddi:logicalproduct:3_1}CaseIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{ddi:logicalproduct:3_1}VariablesInRecord"/>
 *           &lt;element ref="{ddi:logicalproduct:3_1}NCubesInRecord"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="hasLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="variableQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalRecordType", propOrder = {
    "logicalRecordName",
    "label",
    "description",
    "variableValueReference",
    "supportForMultipleSegments",
    "caseIdentification",
    "variablesInRecord",
    "nCubesInRecord"
})
public class LogicalRecordType
    extends IdentifiableType
{

    @XmlElement(name = "LogicalRecordName")
    protected List<NameType> logicalRecordName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "VariableValueReference")
    protected VariableValueReferenceType variableValueReference;
    @XmlElement(name = "SupportForMultipleSegments")
    protected VariableValueReferenceType supportForMultipleSegments;
    @XmlElement(name = "CaseIdentification")
    protected List<CaseIdentificationType> caseIdentification;
    @XmlElement(name = "VariablesInRecord")
    protected VariablesInRecordType variablesInRecord;
    @XmlElement(name = "NCubesInRecord")
    protected NCubesInRecordType nCubesInRecord;
    @XmlAttribute(name = "hasLocator", required = true)
    protected boolean hasLocator;
    @XmlAttribute(name = "variableQuantity")
    protected BigInteger variableQuantity;

    /**
     * Gets the value of the logicalRecordName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalRecordName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalRecordName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getLogicalRecordName() {
        if (logicalRecordName == null) {
            logicalRecordName = new ArrayList<NameType>();
        }
        return this.logicalRecordName;
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
     * Description of the logical record.Gets the value of the description property.
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
     * Reference to the variable containing the record type locator.
     * 
     * @return
     *     possible object is
     *     {@link VariableValueReferenceType }
     *     
     */
    public VariableValueReferenceType getVariableValueReference() {
        return variableValueReference;
    }

    /**
     * Sets the value of the variableValueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableValueReferenceType }
     *     
     */
    public void setVariableValueReference(VariableValueReferenceType value) {
        this.variableValueReference = value;
    }

    /**
     * Information concerning support for breaking the logical record into segments for storage purposes. Some files may be broken into record segments for storage but lack variables to support identification of specific segments. In this case segments are identified by their physical order within the storage file.
     * 
     * @return
     *     possible object is
     *     {@link VariableValueReferenceType }
     *     
     */
    public VariableValueReferenceType getSupportForMultipleSegments() {
        return supportForMultipleSegments;
    }

    /**
     * Sets the value of the supportForMultipleSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableValueReferenceType }
     *     
     */
    public void setSupportForMultipleSegments(VariableValueReferenceType value) {
        this.supportForMultipleSegments = value;
    }

    /**
     * There may be more than one means of identifying a record. For example a US Census Summary File has a LogicalRecordIdentifer that is unique to the original file within which it was published. A specific geography has a set of fields that identify it uniquely.Gets the value of the caseIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseIdentificationType }
     * 
     * 
     */
    public List<CaseIdentificationType> getCaseIdentification() {
        if (caseIdentification == null) {
            caseIdentification = new ArrayList<CaseIdentificationType>();
        }
        return this.caseIdentification;
    }

    /**
     * List of all variables used in the record, either directly or as found in a defined VariableGroup; note that a variable can be used in multiple records. The variables in the logical record can be noted by inclusion or exclusion to facilitate listing. The attribute allVariablesInLogicalProduct, when set to 'true', includes all variables in the LogicalProduct. VariableSchemeReference can then be used to exclude individual Variables schemes or include schemes from other logical products. In the same way VariableReference can be used to exclude specific variables from the previously defined variable set or include variables not already included. The  simplest LogicalProduct descriptions with a single LogicalRecord can be described using only the attribute allVariablesInLogicalProduct with a value of true.
     * 
     * @return
     *     possible object is
     *     {@link VariablesInRecordType }
     *     
     */
    public VariablesInRecordType getVariablesInRecord() {
        return variablesInRecord;
    }

    /**
     * Sets the value of the variablesInRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariablesInRecordType }
     *     
     */
    public void setVariablesInRecord(VariablesInRecordType value) {
        this.variablesInRecord = value;
    }

    /**
     * List of all NCubes used in the record, either directly or as found in a defined NCubeGroup; note that an NCube can be used in multiple records. The NCubes in the logical record can be noted by inclusion or exclusion to facilitate listing. The attribute allNCubesInLogicalProduct, when set to 'true', includes all NCubes in the LogicalProduct. NCubeSchemeReference can then be used to exclude individual NCubes schemes or include schemes from other logical products. In the same way NCubeReference can be used to exclude specific variables from the previously defined variable set or include variables not already included. The  simplest LogicalProduct descriptions with a single LogicalRecord can be described using only the attribute allNCubesInLogicalProduct with a value of true.
     * 
     * @return
     *     possible object is
     *     {@link NCubesInRecordType }
     *     
     */
    public NCubesInRecordType getNCubesInRecord() {
        return nCubesInRecord;
    }

    /**
     * Sets the value of the nCubesInRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCubesInRecordType }
     *     
     */
    public void setNCubesInRecord(NCubesInRecordType value) {
        this.nCubesInRecord = value;
    }

    /**
     * Gets the value of the hasLocator property.
     * 
     */
    public boolean isHasLocator() {
        return hasLocator;
    }

    /**
     * Sets the value of the hasLocator property.
     * 
     */
    public void setHasLocator(boolean value) {
        this.hasLocator = value;
    }

    /**
     * Gets the value of the variableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVariableQuantity() {
        return variableQuantity;
    }

    /**
     * Sets the value of the variableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVariableQuantity(BigInteger value) {
        this.variableQuantity = value;
    }

}
