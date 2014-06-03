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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.ReferenceType;


/**
 * References concepts to be included in concept groups.
 * 
 * <p>Java class for ConceptReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}ReferenceType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:conceptualcomponent:3_1}ConceptReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptReferenceType", propOrder = {
    "conceptReference"
})
public class ConceptReferenceType
    extends ReferenceType
{

    @XmlElement(name = "ConceptReference")
    protected List<ConceptReferenceType> conceptReference;

    /**
     * A reference to a concept included in a concept group.Gets the value of the conceptReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptReferenceType }
     * 
     * 
     */
    public List<ConceptReferenceType> getConceptReference() {
        if (conceptReference == null) {
            conceptReference = new ArrayList<ConceptReferenceType>();
        }
        return this.conceptReference;
    }

}
