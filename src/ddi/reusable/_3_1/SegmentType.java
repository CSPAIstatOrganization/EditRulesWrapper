//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 02:00:24 PM CEST 
//


package ddi.reusable._3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:reusable:3_1}Textual" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Audio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}Video" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:reusable:3_1}ImageArea" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {
    "textual",
    "audio",
    "video",
    "xml",
    "imageArea"
})
public class SegmentType {

    @XmlElement(name = "Textual")
    protected List<TextualType> textual;
    @XmlElement(name = "Audio")
    protected List<AudioType> audio;
    @XmlElement(name = "Video")
    protected List<VideoType> video;
    @XmlElement(name = "XML")
    protected List<String> xml;
    @XmlElement(name = "ImageArea")
    protected List<ImageAreaType> imageArea;

    /**
     * Gets the value of the textual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualType }
     * 
     * 
     */
    public List<TextualType> getTextual() {
        if (textual == null) {
            textual = new ArrayList<TextualType>();
        }
        return this.textual;
    }

    /**
     * Gets the value of the audio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioType }
     * 
     * 
     */
    public List<AudioType> getAudio() {
        if (audio == null) {
            audio = new ArrayList<AudioType>();
        }
        return this.audio;
    }

    /**
     * Gets the value of the video property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the video property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoType }
     * 
     * 
     */
    public List<VideoType> getVideo() {
        if (video == null) {
            video = new ArrayList<VideoType>();
        }
        return this.video;
    }

    /**
     * Gets the value of the xml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXML().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXML() {
        if (xml == null) {
            xml = new ArrayList<String>();
        }
        return this.xml;
    }

    /**
     * Gets the value of the imageArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageAreaType }
     * 
     * 
     */
    public List<ImageAreaType> getImageArea() {
        if (imageArea == null) {
            imageArea = new ArrayList<ImageAreaType>();
        }
        return this.imageArea;
    }

}
