//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information on the hierarchy of the geographic structure. The structure can be defined within the DDI, or an external structure can be referenced.
 * 
 * <p>Java class for GeographicStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicStructureType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}VersionableType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{ddi:reusable:3_1}Geography"/>
 *         &lt;element ref="{ddi:reusable:3_1}GeographyReference"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicStructureType", propOrder = {
    "geographyOrGeographyReference"
})
public class GeographicStructureType
    extends VersionableType
{

    @XmlElements({
        @XmlElement(name = "Geography", type = GeographyType.class),
        @XmlElement(name = "GeographyReference", type = ReferenceType.class)
    })
    protected List<Object> geographyOrGeographyReference;

    /**
     * Gets the value of the geographyOrGeographyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographyOrGeographyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographyOrGeographyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographyType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getGeographyOrGeographyReference() {
        if (geographyOrGeographyReference == null) {
            geographyOrGeographyReference = new ArrayList<Object>();
        }
        return this.geographyOrGeographyReference;
    }

}