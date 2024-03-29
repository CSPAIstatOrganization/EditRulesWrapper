//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumericTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NumericTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="BigInteger"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Short"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Float"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Count"/>
 *     &lt;enumeration value="Incremental"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NumericTypeCodeType")
@XmlEnum
public enum NumericTypeCodeType {


    /**
     * An integer of unlimited size. An integer datatype corresponding to W3C XML Schema's xs:integer datatype.
     * 
     */
    @XmlEnumValue("BigInteger")
    BIG_INTEGER("BigInteger"),

    /**
     * An integer number can hold a whole number, but no fraction. Integers may be either signed (allowing negative values) or unsigned (nonnegative values only). An integer datatype corresponding to W3C XML Schema's xs:int datatype.
     * 
     */
    @XmlEnumValue("Integer")
    INTEGER("Integer"),

    /**
     * An integer of up to 32 bits in size (corresponding to an unsigned range of 0 to 4,294,967,295 or a signed range of -2,147,483,648 to +2,147,483,647).  A numeric datatype corresponding to W3C XML Schema's xs:long datatype.
     * 
     */
    @XmlEnumValue("Long")
    LONG("Long"),

    /**
     * An integer of up to 16 bits in size (corresponding to an unsigned range of 0 to 65,535 or a signed range of -32,768 to +32,767), A numeric datatype corresponding to W3C XML Schema's xs:short datatype.
     * 
     */
    @XmlEnumValue("Short")
    SHORT("Short"),

    /**
     * A real number (allows fractions expressed as decimals). A numeric datatype corresponding to W3C XML Schema's xs:decimal datatype.
     * 
     */
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),

    /**
     * Real numbers that may be stored in scientific notation (example: 20.0005, 99.9, -5000.12, 6.02e23). A numeric datatype corresponding to W3C XML Schema's xs:float datatype.
     * 
     */
    @XmlEnumValue("Float")
    FLOAT("Float"),

    /**
     * Float of up to 32 bits. A numeric datatype corresponding to W3C XML Schema's xs:double datatype.
     * 
     */
    @XmlEnumValue("Double")
    DOUBLE("Double"),

    /**
     * Ordinal number of objects in a finite set, discrete. A simple incrementing Integer type. The isSequence facet must be set to true, and the interval facet must be set to "1".
     * 
     */
    @XmlEnumValue("Count")
    COUNT("Count"),

    /**
     * A value that is continuous and infinite can be interval or ratio. This value indicates that the value increments according to the value provided in the interval facet, and has a true value for the isSequence facet.
     * 
     */
    @XmlEnumValue("Incremental")
    INCREMENTAL("Incremental");
    private final String value;

    NumericTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumericTypeCodeType fromValue(String v) {
        for (NumericTypeCodeType c: NumericTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
