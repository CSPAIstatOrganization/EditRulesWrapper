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
import ddi.reusable._3_1.VersionableType;


/**
 * Structures a group of question items.
 * 
 * <p>Java class for QuestionGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{ddi:datacollection:3_1}QuestionItem"/>
 *           &lt;element ref="{ddi:datacollection:3_1}MultipleQuestionItem"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionGroupType", propOrder = {
    "questionItemOrMultipleQuestionItem"
})
public class QuestionGroupType {

    @XmlElements({
        @XmlElement(name = "QuestionItem", type = QuestionItemType.class),
        @XmlElement(name = "MultipleQuestionItem", type = MultipleQuestionItemType.class)
    })
    protected List<VersionableType> questionItemOrMultipleQuestionItem;

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
