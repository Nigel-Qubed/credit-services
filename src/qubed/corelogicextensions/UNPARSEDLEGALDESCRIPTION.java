//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * A legal description of a parcel of real property that is represented in a free-form text field. While it contains all the necessary components of a legal description, those components are not distinctly identified for processing or storage in a database.
 * 
 * <p>Java class for UNPARSED_LEGAL_DESCRIPTION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNPARSED_LEGAL_DESCRIPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnparsedLegalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UnparsedLegalDescriptionType" type="{http://www.mismo.org/residential/2009/schemas}UnparsedLegalDescriptionEnum" minOccurs="0"/>
 *         &lt;element name="UnparsedLegalDescriptionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}UNPARSED_LEGAL_DESCRIPTION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "UNPARSED_LEGAL_DESCRIPTION", propOrder = {
    "unparsedLegalDescription",
    "unparsedLegalDescriptionType",
    "unparsedLegalDescriptionTypeOtherDescription",
    "extension"
})
public class UNPARSEDLEGALDESCRIPTION {

    @XmlElementRef(name = "UnparsedLegalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> unparsedLegalDescription;
    @XmlElementRef(name = "UnparsedLegalDescriptionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnparsedLegalDescriptionEnum> unparsedLegalDescriptionType;
    @XmlElementRef(name = "UnparsedLegalDescriptionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> unparsedLegalDescriptionTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected UNPARSEDLEGALDESCRIPTIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the unparsedLegalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getUnparsedLegalDescription() {
        return unparsedLegalDescription;
    }

    /**
     * Sets the value of the unparsedLegalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setUnparsedLegalDescription(JAXBElement<MISMOString> value) {
        this.unparsedLegalDescription = value;
    }

    /**
     * Gets the value of the unparsedLegalDescriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnparsedLegalDescriptionEnum }{@code >}
     *     
     */
    public JAXBElement<UnparsedLegalDescriptionEnum> getUnparsedLegalDescriptionType() {
        return unparsedLegalDescriptionType;
    }

    /**
     * Sets the value of the unparsedLegalDescriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnparsedLegalDescriptionEnum }{@code >}
     *     
     */
    public void setUnparsedLegalDescriptionType(JAXBElement<UnparsedLegalDescriptionEnum> value) {
        this.unparsedLegalDescriptionType = value;
    }

    /**
     * Gets the value of the unparsedLegalDescriptionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getUnparsedLegalDescriptionTypeOtherDescription() {
        return unparsedLegalDescriptionTypeOtherDescription;
    }

    /**
     * Sets the value of the unparsedLegalDescriptionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setUnparsedLegalDescriptionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.unparsedLegalDescriptionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link UNPARSEDLEGALDESCRIPTIONEXTENSION }
     *     
     */
    public UNPARSEDLEGALDESCRIPTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNPARSEDLEGALDESCRIPTIONEXTENSION }
     *     
     */
    public void setEXTENSION(UNPARSEDLEGALDESCRIPTIONEXTENSION value) {
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
