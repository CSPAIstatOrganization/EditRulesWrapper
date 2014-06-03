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
 * <p>Java class for ValueTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="GreaterThanOrEqual"/>
 *     &lt;enumeration value="LessThanOrEqual"/>
 *     &lt;enumeration value="NotEqual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueTypeCodeType")
@XmlEnum
public enum ValueTypeCodeType {


    /**
     * Greater Than
     * 
     */
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),

    /**
     * Less Than
     * 
     */
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),

    /**
     * Equal
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * Greater Than or Equal
     * 
     */
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),

    /**
     * Less Than or Equal
     * 
     */
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),

    /**
     * Not Equal
     * 
     */
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual");
    private final String value;

    ValueTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypeCodeType fromValue(String v) {
        for (ValueTypeCodeType c: ValueTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
