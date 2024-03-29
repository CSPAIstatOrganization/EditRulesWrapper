//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicaldataproduct._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ddi.reusable._3_1.ReferenceType;


/**
 * References a physical data product and the ID of the physical record segment from that is described by this record layout.
 * 
 * <p>Java class for PhysicalStructureReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalStructureReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalRecordSegmentUsed" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalStructureReferenceType", propOrder = {
    "physicalRecordSegmentUsed"
})
public class PhysicalStructureReferenceType
    extends ReferenceType
{

    @XmlElement(name = "PhysicalRecordSegmentUsed", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String physicalRecordSegmentUsed;

    /**
     * Gets the value of the physicalRecordSegmentUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalRecordSegmentUsed() {
        return physicalRecordSegmentUsed;
    }

    /**
     * Sets the value of the physicalRecordSegmentUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalRecordSegmentUsed(String value) {
        this.physicalRecordSegmentUsed = value;
    }

}
