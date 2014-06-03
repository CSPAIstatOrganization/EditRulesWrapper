//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicaldataproduct_ncube_normal._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.physicaldataproduct._3_1.PhysicalLocationType;


/**
 * When individual measures are stored in separately identifiable locations repeat Measure to define each measure and storage location. When multiple measures are stored as an ordered array in a single location list each measure in the array as a MeasureReference with its specified arrayOrder within a single Measure definition.
 * 
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:physicaldataproduct_ncube_normal:3_1}MeasureReference" maxOccurs="unbounded"/>
 *         &lt;element ref="{ddi:physicaldataproduct:3_1}PhysicalLocation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "measureReference",
    "physicalLocation"
})
public class MeasureType {

    @XmlElement(name = "MeasureReference", required = true)
    protected List<MeasureReferenceType> measureReference;
    @XmlElement(name = "PhysicalLocation", namespace = "ddi:physicaldataproduct:3_1", required = true)
    protected PhysicalLocationType physicalLocation;

    /**
     * Reference to a measure description.Gets the value of the measureReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureReferenceType }
     * 
     * 
     */
    public List<MeasureReferenceType> getMeasureReference() {
        if (measureReference == null) {
            measureReference = new ArrayList<MeasureReferenceType>();
        }
        return this.measureReference;
    }

    /**
     * Describes physical characteristics of the data item related to location and its data type/format.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalLocationType }
     *     
     */
    public PhysicalLocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalLocationType }
     *     
     */
    public void setPhysicalLocation(PhysicalLocationType value) {
        this.physicalLocation = value;
    }

}
