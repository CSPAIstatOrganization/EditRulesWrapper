//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.logicalproduct._3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HierarchyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Irregular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HierarchyCodeType")
@XmlEnum
public enum HierarchyCodeType {

    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Irregular")
    IRREGULAR("Irregular");
    private final String value;

    HierarchyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HierarchyCodeType fromValue(String v) {
        for (HierarchyCodeType c: HierarchyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
