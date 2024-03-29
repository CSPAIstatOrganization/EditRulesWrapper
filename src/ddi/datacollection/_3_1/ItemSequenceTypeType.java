//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.datacollection._3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSequenceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSequenceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InOrderOfAppearance"/>
 *     &lt;enumeration value="Random"/>
 *     &lt;enumeration value="Rotate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSequenceTypeType")
@XmlEnum
public enum ItemSequenceTypeType {


    /**
     * In the order of appearance per the DDI instance, for each use.
     * 
     */
    @XmlEnumValue("InOrderOfAppearance")
    IN_ORDER_OF_APPEARANCE("InOrderOfAppearance"),

    /**
     * Randomly resorts sequence for each use.
     * 
     */
    @XmlEnumValue("Random")
    RANDOM("Random"),

    /**
     * Rotates order of sequence for each use where first use is 1 2 3 4, second use is 2 3 4 1, third use is 3 4 1 2 etc.
     * 
     */
    @XmlEnumValue("Rotate")
    ROTATE("Rotate"),

    /**
     * Any other means of reordering sequence. When value is Other, AlterativeSequenceType must be specified to describe the resequencing process.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ItemSequenceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSequenceTypeType fromValue(String v) {
        for (ItemSequenceTypeType c: ItemSequenceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
