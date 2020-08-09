//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Contains or points to a series of instructions for populating the view based on the data and template provided in the document or for generating the view from scratch based only on the data. The behavior of the TRANSFORM depends upon the presence of the TEMPLATE element. If a TEMPLATE element is provided, then the TRANSFORM merges the data in the DATA element with the TEMPLATE to produce a new populated view. If the TEMPLATE element is not provided, then the TRANSFORM generates the complete view from scratch based on provided data. A TRANSFORM element may contain either TRANSFORM_PAGES or TRANSFORM_FILES. Use TRANSFORM_PAGES for page-based file formats and TRANSFORM_FILES when all pages are contained in a single object.
 * 
 * <p>Java class for TRANSFORM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRANSFORM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="TRANSFORM_FILES" type="{http://www.mismo.org/residential/2009/schemas}TRANSFORM_FILES" minOccurs="0"/>
 *           &lt;element name="TRANSFORM_PAGES" type="{http://www.mismo.org/residential/2009/schemas}TRANSFORM_PAGES" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TRANSFORM_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRANSFORM", propOrder = {
    "transformfiles",
    "transformpages",
    "extension"
})
public class TRANSFORM {

    @XmlElement(name = "TRANSFORM_FILES")
    protected TRANSFORMFILES transformfiles;
    @XmlElement(name = "TRANSFORM_PAGES")
    protected TRANSFORMPAGES transformpages;
    @XmlElement(name = "EXTENSION")
    protected TRANSFORMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the transformfiles property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMFILES }
     *     
     */
    public TRANSFORMFILES getTRANSFORMFILES() {
        return transformfiles;
    }

    /**
     * Sets the value of the transformfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMFILES }
     *     
     */
    public void setTRANSFORMFILES(TRANSFORMFILES value) {
        this.transformfiles = value;
    }

    /**
     * Gets the value of the transformpages property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMPAGES }
     *     
     */
    public TRANSFORMPAGES getTRANSFORMPAGES() {
        return transformpages;
    }

    /**
     * Sets the value of the transformpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMPAGES }
     *     
     */
    public void setTRANSFORMPAGES(TRANSFORMPAGES value) {
        this.transformpages = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMEXTENSION }
     *     
     */
    public TRANSFORMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMEXTENSION }
     *     
     */
    public void setEXTENSION(TRANSFORMEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}