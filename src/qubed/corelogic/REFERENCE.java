//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * REFERENCE is a pointer to an XML structure that satisfies the XML type required within this context. The referenced structure may exist internally or externally to the document. A REFERENCE is resolved by replacing its parent container with the referenced XML structure.
 * 
 * <p>Java class for REFERENCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFERENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationURL" type="{http://www.mismo.org/residential/2009/schemas}MISMOURL" minOccurs="0"/>
 *         &lt;element name="LocationLabelValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="OriginalCreatorDigestValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attribute name="ReferenceSigningType" type="{http://www.mismo.org/residential/2009/schemas}ReferenceSigningBase" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFERENCE", propOrder = {
    "locationURL",
    "locationLabelValue",
    "originalCreatorDigestValue"
})
public class REFERENCE {

    @XmlElementRef(name = "LocationURL", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOURL> locationURL;
    @XmlElementRef(name = "LocationLabelValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> locationLabelValue;
    @XmlElementRef(name = "OriginalCreatorDigestValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> originalCreatorDigestValue;
    @XmlAttribute(name = "ReferenceSigningType")
    protected ReferenceSigningBase referenceSigningType;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the locationURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public JAXBElement<MISMOURL> getLocationURL() {
        return locationURL;
    }

    /**
     * Sets the value of the locationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public void setLocationURL(JAXBElement<MISMOURL> value) {
        this.locationURL = value;
    }

    /**
     * Gets the value of the locationLabelValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getLocationLabelValue() {
        return locationLabelValue;
    }

    /**
     * Sets the value of the locationLabelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setLocationLabelValue(JAXBElement<MISMOValue> value) {
        this.locationLabelValue = value;
    }

    /**
     * Gets the value of the originalCreatorDigestValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getOriginalCreatorDigestValue() {
        return originalCreatorDigestValue;
    }

    /**
     * Sets the value of the originalCreatorDigestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setOriginalCreatorDigestValue(JAXBElement<MISMOValue> value) {
        this.originalCreatorDigestValue = value;
    }

    /**
     * Gets the value of the referenceSigningType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSigningBase }
     *     
     */
    public ReferenceSigningBase getReferenceSigningType() {
        return referenceSigningType;
    }

    /**
     * Sets the value of the referenceSigningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSigningBase }
     *     
     */
    public void setReferenceSigningType(ReferenceSigningBase value) {
        this.referenceSigningType = value;
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
