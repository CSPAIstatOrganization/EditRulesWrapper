//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicaldataproduct._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ddi.dataset._3_1.DataSetType;
import ddi.physicaldataproduct_proprietary._3_1.ProprietaryRecordLayoutType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.MaintainableType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.SchemeReferenceType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * a maintainable scheme describing physical structures.
 * 
 * <p>Java class for RecordLayoutSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordLayoutSchemeType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}MaintainableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}RecordLayoutSchemeName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}RecordLayoutSchemeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}BaseRecordLayout" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordLayoutSchemeType", propOrder = {
    "recordLayoutSchemeName",
    "label",
    "description",
    "recordLayoutSchemeReference",
    "baseRecordLayout"
})
public class RecordLayoutSchemeType
    extends MaintainableType
{

    @XmlElement(name = "RecordLayoutSchemeName")
    protected List<NameType> recordLayoutSchemeName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "RecordLayoutSchemeReference")
    protected List<SchemeReferenceType> recordLayoutSchemeReference;
    @XmlElementRef(name = "BaseRecordLayout", namespace = "ddi:physicaldataproduct:3_1", type = JAXBElement.class)
    protected List<JAXBElement<? extends BaseRecordLayoutType>> baseRecordLayout;

    /**
     * Gets the value of the recordLayoutSchemeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLayoutSchemeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLayoutSchemeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getRecordLayoutSchemeName() {
        if (recordLayoutSchemeName == null) {
            recordLayoutSchemeName = new ArrayList<NameType>();
        }
        return this.recordLayoutSchemeName;
    }

    /**
     * A display label for the record layout scheme.Gets the value of the label property.
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
     * A description of the use of the record layout scheme.Gets the value of the description property.
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
     * Provides for inclusion by reference of external record layout schemes.Gets the value of the recordLayoutSchemeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLayoutSchemeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLayoutSchemeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeReferenceType }
     * 
     * 
     */
    public List<SchemeReferenceType> getRecordLayoutSchemeReference() {
        if (recordLayoutSchemeReference == null) {
            recordLayoutSchemeReference = new ArrayList<SchemeReferenceType>();
        }
        return this.recordLayoutSchemeReference;
    }

    /**
     * Describes the number and type of records in a data structure. Note that this element is abstract, and only serves as the head of a substitution group containing all the various types of record layouts.Gets the value of the baseRecordLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseRecordLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseRecordLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ddi.physicaldataproduct_ncube_inline._3_1.RecordLayoutType }{@code >}
     * {@link JAXBElement }{@code <}{@link ddi.physicaldataproduct_ncube_tabular._3_1.RecordLayoutType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ddi.physicaldataproduct_ncube_normal._3_1.RecordLayoutType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseRecordLayoutType }{@code >}
     * {@link JAXBElement }{@code <}{@link ddi.physicaldataproduct._3_1.RecordLayoutType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProprietaryRecordLayoutType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseRecordLayoutType>> getBaseRecordLayout() {
        if (baseRecordLayout == null) {
            baseRecordLayout = new ArrayList<JAXBElement<? extends BaseRecordLayoutType>>();
        }
        return this.baseRecordLayout;
    }

}