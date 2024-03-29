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
 * <p>Java class for DateTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="MonthDay"/>
 *     &lt;enumeration value="YearMonth"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Timespan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateTypeCodeType")
@XmlEnum
public enum DateTypeCodeType {


    /**
     * Contains both the date and time as  dateTtime. A time datatype corresponding to W3C XML Schema's xs:dateTime datatype.
     * 
     */
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),

    /**
     * Contains the full date from the Gregorian calender YYYY-MM-DD unless an alternative format is provided. A time datatype corresponding to W3C XML Schema's xs:date datatype.
     * 
     */
    @XmlEnumValue("Date")
    DATE("Date"),

    /**
     * Contains the full time on a 24-hour clock system unless alternative format is provided. hh:mm:ss. Precision can be dropped resulting in hh:mm or hh.  A time zone can be added timeZ using the standard time zone designation +-hh:mm or +-hh. A time datatype corresponding to W3C XML Schema's xs:time datatype.
     * 
     */
    @XmlEnumValue("Time")
    TIME("Time"),

    /**
     * Contains the 4 digit year YYYY. A time datatype corresponding to W3C XML Schema's xs:gYear datatype.
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * Contains the 2 digit month MM. A time datatype corresponding to W3C XML Schema's xs:gMonth datatype.
     * 
     */
    @XmlEnumValue("Month")
    MONTH("Month"),

    /**
     * Contains the 2 digit day DD. A time datatype corresponding to W3C XML Schema's xs:gDay datatype.
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),

    /**
     * Contains the 2 digit month followed by the 2 digit day as MM-DD unless an alternative format is provided. A time datatype corresponding to W3C XML Schema's xs:gMonthDay datatype.
     * 
     */
    @XmlEnumValue("MonthDay")
    MONTH_DAY("MonthDay"),

    /**
     * Contains the 4 digit year followed by the 2 digit month as YYYY-MM unless an alternative format is provided. A time datatype corresponding to W3C XML Schema's xs:gYearMonth datatype.
     * 
     */
    @XmlEnumValue("YearMonth")
    YEAR_MONTH("YearMonth"),

    /**
     * Provides a duration of time represetned by one of the following formats (specific format must be declared) PnnYnnMnnDTnnHnnMnnS where n is replaced with the number of unit types for example "P3Y6M4DT12H30M0S" defines "a period of three years, six months, four days, twelve hours, thirty minutes, and zero seconds". Elements may be omitted if their value is zero. T is used to separate date and time elements so that P3M is 3 months and PT3M is three minutes. Alternative format PdateTtime  "P0003-06-04T12:30:00". A time datatype corresponding to W3C XML Schema's xs:duration datatype.
     * 
     */
    @XmlEnumValue("Duration")
    DURATION("Duration"),

    /**
     * This is not allowed as a date type when describing an NCube dimension as it represents two dimensions. Complex structure containing start/end, start/duration, or duration/end. Start and end can follow any of the designated datetime structures and should be declared in format. star>/end example: "2007-03-01T13:00:00/2008-05-11T15:30:00" start/duration example:  "2007-03-01T13:00:00/P1Y2M10DT2H30M" duration/end example "P1Y2M10DT2H30M/2008-05-11T15:30:00" For start/end expressions, if any elment are missing from the end valude, they are assumed to be the same as for the start value including the time zone if used. For example a 2 hour meeting "2007-12-14T13:30/15:30". A complex datatype specifying a start date (xs:dateTime) and a duration (xs:duration). Note that this is not allowed as thre text type representing a dimension.
     * 
     */
    @XmlEnumValue("Timespan")
    TIMESPAN("Timespan");
    private final String value;

    DateTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTypeCodeType fromValue(String v) {
        for (DateTypeCodeType c: DateTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
