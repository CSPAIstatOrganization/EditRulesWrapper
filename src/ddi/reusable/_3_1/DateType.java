//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ddi.datacollection._3_1.DataCollectionFrequencyType;


/**
 * Provides the structure of a Date element, which allows a choice between single, simple dates (of BaseDateType) or date ranges. If the Date element contains a range, Cycle may be used to indicate occurrence of this range within a series of ranges as an integer identifying the cycle. ISO-formatted dates are required for all fields; a historically-formatted date may be provided in addition to the ISO-formatted date.
 * 
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{ddi:reusable:3_1}SimpleDate"/>
 *           &lt;sequence>
 *             &lt;element ref="{ddi:reusable:3_1}StartDate"/>
 *             &lt;element ref="{ddi:reusable:3_1}HistoricalStartDate" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}EndDate" minOccurs="0"/>
 *             &lt;element ref="{ddi:reusable:3_1}HistoricalEndDate" minOccurs="0"/>
 *             &lt;element name="Cycle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{ddi:reusable:3_1}HistoricalDate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "simpleDate",
    "startDate",
    "historicalStartDate",
    "endDate",
    "historicalEndDate",
    "cycle",
    "historicalDate"
})
@XmlSeeAlso({
    AccessRestrictionDateType.class,
    DataCollectionFrequencyType.class
})
public class DateType {

    @XmlElement(name = "SimpleDate")
    protected String simpleDate;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "HistoricalStartDate")
    protected HistoricalDateType historicalStartDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "HistoricalEndDate")
    protected HistoricalDateType historicalEndDate;
    @XmlElement(name = "Cycle")
    protected BigInteger cycle;
    @XmlElement(name = "HistoricalDate")
    protected HistoricalDateType historicalDate;
    @XmlAttribute(name = "calendar")
    protected String calendar;

    /**
     * A single point in time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleDate() {
        return simpleDate;
    }

    /**
     * Sets the value of the simpleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleDate(String value) {
        this.simpleDate = value;
    }

    /**
     * Start of a date range.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Start of a date range, expressed in a historical date format, according to a system specified in the historicalDateFormat attribute.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalDateType }
     *     
     */
    public HistoricalDateType getHistoricalStartDate() {
        return historicalStartDate;
    }

    /**
     * Sets the value of the historicalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalDateType }
     *     
     */
    public void setHistoricalStartDate(HistoricalDateType value) {
        this.historicalStartDate = value;
    }

    /**
     * End of a date range. If range is continuing on, end date can be blank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * End of a date range, expressed in a historical date format, according to a system specified in the historicalDateFormat attribute.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalDateType }
     *     
     */
    public HistoricalDateType getHistoricalEndDate() {
        return historicalEndDate;
    }

    /**
     * Sets the value of the historicalEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalDateType }
     *     
     */
    public void setHistoricalEndDate(HistoricalDateType value) {
        this.historicalEndDate = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycle(BigInteger value) {
        this.cycle = value;
    }

    /**
     * A date expressed in a historical date format, according to a system specified in the historicalDateFormat attribute.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalDateType }
     *     
     */
    public HistoricalDateType getHistoricalDate() {
        return historicalDate;
    }

    /**
     * Sets the value of the historicalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalDateType }
     *     
     */
    public void setHistoricalDate(HistoricalDateType value) {
        this.historicalDate = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
    }

}