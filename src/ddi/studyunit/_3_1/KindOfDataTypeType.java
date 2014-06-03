//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.studyunit._3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KindOfDataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KindOfDataTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Qualitative"/>
 *     &lt;enumeration value="Quantitative"/>
 *     &lt;enumeration value="Mixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KindOfDataTypeType")
@XmlEnum
public enum KindOfDataTypeType {


    /**
     * Narrative or descriptive accounts that may be subjected to interpretive analysis
     * 
     */
    @XmlEnumValue("Qualitative")
    QUALITATIVE("Qualitative"),

    /**
     * Numerical or coded data that may be subjected to statistical analysis
     * 
     */
    @XmlEnumValue("Quantitative")
    QUANTITATIVE("Quantitative"),

    /**
     * Both qualitative and quantitative data within the same collection.
     * 
     */
    @XmlEnumValue("Mixed")
    MIXED("Mixed");
    private final String value;

    KindOfDataTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KindOfDataTypeType fromValue(String v) {
        for (KindOfDataTypeType c: KindOfDataTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}