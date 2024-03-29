//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * References a parent geography and describes whether the geographic level completely fills its parent level.
 * 
 * <p>Java class for ParentGeographyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentGeographyType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:reusable:3_1}ReferenceType">
 *       &lt;attribute name="isExhaustiveCoverage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentGeographyType")
public class ParentGeographyType
    extends ReferenceType
{

    @XmlAttribute(name = "isExhaustiveCoverage", required = true)
    protected boolean isExhaustiveCoverage;

    /**
     * Gets the value of the isExhaustiveCoverage property.
     * 
     */
    public boolean isIsExhaustiveCoverage() {
        return isExhaustiveCoverage;
    }

    /**
     * Sets the value of the isExhaustiveCoverage property.
     * 
     */
    public void setIsExhaustiveCoverage(boolean value) {
        this.isExhaustiveCoverage = value;
    }

}
