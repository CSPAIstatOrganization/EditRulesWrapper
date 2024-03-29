//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicalinstance._3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ddi.reusable._3_1.ReferenceType;


/**
 * Provides for a filter on the category statistics. Filter values must be the same type as those for the category statistic.
 * 
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:physicalinstance:3_1}FilterVariableReference" minOccurs="0"/>
 *         &lt;element ref="{ddi:physicalinstance:3_1}FilterCategoryStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "filterVariableReference",
    "filterCategoryStatistics"
})
public class FilterType {

    @XmlElement(name = "FilterVariableReference")
    protected ReferenceType filterVariableReference;
    @XmlElement(name = "FilterCategoryStatistics")
    protected FilterCategoryStatisticsType filterCategoryStatistics;

    /**
     * A filter value allows for a crosstabulation of one variable by another. For example variable may be crossed with country as is done in the Eurobarometer when reporting category statistics.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFilterVariableReference() {
        return filterVariableReference;
    }

    /**
     * Sets the value of the filterVariableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFilterVariableReference(ReferenceType value) {
        this.filterVariableReference = value;
    }

    /**
     * Provides filtered category statistics.
     * 
     * @return
     *     possible object is
     *     {@link FilterCategoryStatisticsType }
     *     
     */
    public FilterCategoryStatisticsType getFilterCategoryStatistics() {
        return filterCategoryStatistics;
    }

    /**
     * Sets the value of the filterCategoryStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCategoryStatisticsType }
     *     
     */
    public void setFilterCategoryStatistics(FilterCategoryStatisticsType value) {
        this.filterCategoryStatistics = value;
    }

}
