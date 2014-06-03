//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.physicaldataproduct_ncube_normal._3_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ddi.reusable._3_1.ReferenceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ddi.physicaldataproduct_ncube_normal._3_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NCubeInstance_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "NCubeInstance");
    private final static QName _Measure_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "Measure");
    private final static QName _RecordLayout_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "RecordLayout");
    private final static QName _NCubeReference_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "NCubeReference");
    private final static QName _VariableReference_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "VariableReference");
    private final static QName _MeasureReference_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "MeasureReference");
    private final static QName _Dimension_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "Dimension");
    private final static QName _Attribute_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "Attribute");
    private final static QName _DataItem_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "DataItem");
    private final static QName _AttributeReference_QNAME = new QName("ddi:physicaldataproduct_ncube_normal:3_1", "AttributeReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ddi.physicaldataproduct_ncube_normal._3_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NCubeInstanceType }
     * 
     */
    public NCubeInstanceType createNCubeInstanceType() {
        return new NCubeInstanceType();
    }

    /**
     * Create an instance of {@link MeasureReferenceType }
     * 
     */
    public MeasureReferenceType createMeasureReferenceType() {
        return new MeasureReferenceType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link RecordLayoutType }
     * 
     */
    public RecordLayoutType createRecordLayoutType() {
        return new RecordLayoutType();
    }

    /**
     * Create an instance of {@link DataItemType }
     * 
     */
    public DataItemType createDataItemType() {
        return new DataItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NCubeInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "NCubeInstance")
    public JAXBElement<NCubeInstanceType> createNCubeInstance(NCubeInstanceType value) {
        return new JAXBElement<NCubeInstanceType>(_NCubeInstance_QNAME, NCubeInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "Measure")
    public JAXBElement<MeasureType> createMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_Measure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordLayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "RecordLayout", substitutionHeadNamespace = "ddi:physicaldataproduct:3_1", substitutionHeadName = "BaseRecordLayout")
    public JAXBElement<RecordLayoutType> createRecordLayout(RecordLayoutType value) {
        return new JAXBElement<RecordLayoutType>(_RecordLayout_QNAME, RecordLayoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "NCubeReference")
    public JAXBElement<ReferenceType> createNCubeReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_NCubeReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "VariableReference")
    public JAXBElement<ReferenceType> createVariableReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_VariableReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "MeasureReference")
    public JAXBElement<MeasureReferenceType> createMeasureReference(MeasureReferenceType value) {
        return new JAXBElement<MeasureReferenceType>(_MeasureReference_QNAME, MeasureReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "Dimension")
    public JAXBElement<DimensionType> createDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_Dimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "Attribute")
    public JAXBElement<AttributeType> createAttribute(AttributeType value) {
        return new JAXBElement<AttributeType>(_Attribute_QNAME, AttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "DataItem")
    public JAXBElement<DataItemType> createDataItem(DataItemType value) {
        return new JAXBElement<DataItemType>(_DataItem_QNAME, DataItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ddi:physicaldataproduct_ncube_normal:3_1", name = "AttributeReference")
    public JAXBElement<ReferenceType> createAttributeReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_AttributeReference_QNAME, ReferenceType.class, null, value);
    }

}
