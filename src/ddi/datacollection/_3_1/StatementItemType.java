//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.datacollection._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.StructuredStringType;


/**
 * A textual statement used in the Instrument.
 * 
 * <p>Java class for StatementItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:datacollection:3_1}ControlConstructType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:datacollection:3_1}DisplayText" maxOccurs="unbounded"/>
 *         &lt;element ref="{ddi:reusable:3_1}Description" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementItemType", propOrder = {
    "rest"
})
public class StatementItemType
    extends ControlConstructType
{

    @XmlElementRefs({
        @XmlElementRef(name = "Description", namespace = "ddi:reusable:3_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DisplayText", namespace = "ddi:datacollection:3_1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Description" is used by two different parts of a schema. See: 
     * line 869 of file:/G:/Documenti%20Utente/donato.summa/NetBeansProjects/EditRulesWrapper/src/ddiXmlSchema/datacollection.xsd
     * line 655 of file:/G:/Documenti%20Utente/donato.summa/NetBeansProjects/EditRulesWrapper/src/ddiXmlSchema/datacollection.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StructuredStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicTextType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
