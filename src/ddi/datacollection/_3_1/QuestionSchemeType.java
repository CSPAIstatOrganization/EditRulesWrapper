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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.LabelType;
import ddi.reusable._3_1.MaintainableType;
import ddi.reusable._3_1.NameType;
import ddi.reusable._3_1.SchemeReferenceType;
import ddi.reusable._3_1.StructuredStringType;
import ddi.reusable._3_1.VersionableType;


/**
 * A set of questions maintained by an agency, and used in the instrument. 
 * 
 * <p>Java class for QuestionSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionSchemeType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}MaintainableType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:datacollection:3_1}QuestionSchemeName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:datacollection:3_1}QuestionSchemeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{ddi:datacollection:3_1}QuestionItem"/>
 *           &lt;element ref="{ddi:datacollection:3_1}MultipleQuestionItem"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionSchemeType", propOrder = {
    "questionSchemeName",
    "label",
    "description",
    "questionSchemeReference",
    "questionItemOrMultipleQuestionItem"
})
public class QuestionSchemeType
    extends MaintainableType
{

    @XmlElement(name = "QuestionSchemeName")
    protected List<NameType> questionSchemeName;
    @XmlElement(name = "Label", namespace = "ddi:reusable:3_1")
    protected List<LabelType> label;
    @XmlElement(name = "Description", namespace = "ddi:reusable:3_1")
    protected List<StructuredStringType> description;
    @XmlElement(name = "QuestionSchemeReference")
    protected List<SchemeReferenceType> questionSchemeReference;
    @XmlElements({
        @XmlElement(name = "QuestionItem", type = QuestionItemType.class),
        @XmlElement(name = "MultipleQuestionItem", type = MultipleQuestionItemType.class)
    })
    protected List<VersionableType> questionItemOrMultipleQuestionItem;

    /**
     * Gets the value of the questionSchemeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionSchemeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionSchemeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getQuestionSchemeName() {
        if (questionSchemeName == null) {
            questionSchemeName = new ArrayList<NameType>();
        }
        return this.questionSchemeName;
    }

    /**
     * A display label for the question scheme.Gets the value of the label property.
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
     * A description of the use of the question scheme.Gets the value of the description property.
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
     * Provides for inclusion by reference of external question schemes.Gets the value of the questionSchemeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionSchemeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionSchemeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeReferenceType }
     * 
     * 
     */
    public List<SchemeReferenceType> getQuestionSchemeReference() {
        if (questionSchemeReference == null) {
            questionSchemeReference = new ArrayList<SchemeReferenceType>();
        }
        return this.questionSchemeReference;
    }

    /**
     * Gets the value of the questionItemOrMultipleQuestionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionItemOrMultipleQuestionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionItemOrMultipleQuestionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionItemType }
     * {@link MultipleQuestionItemType }
     * 
     * 
     */
    public List<VersionableType> getQuestionItemOrMultipleQuestionItem() {
        if (questionItemOrMultipleQuestionItem == null) {
            questionItemOrMultipleQuestionItem = new ArrayList<VersionableType>();
        }
        return this.questionItemOrMultipleQuestionItem;
    }

}
