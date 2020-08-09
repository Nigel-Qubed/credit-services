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
 * <p>Java class for MI_APPLICATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_APPLICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MIApplicationType" type="{http://www.mismo.org/residential/2009/schemas}MIApplicationEnum" minOccurs="0"/>
 *         &lt;element name="MIApplicationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MICertificateIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MILenderIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MIServiceType" type="{http://www.mismo.org/residential/2009/schemas}MIServiceEnum" minOccurs="0"/>
 *         &lt;element name="MIServiceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MITransactionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_APPLICATION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_APPLICATION", propOrder = {
    "miApplicationType",
    "miApplicationTypeOtherDescription",
    "miCertificateIdentifier",
    "miLenderIdentifier",
    "miServiceType",
    "miServiceTypeOtherDescription",
    "miTransactionIdentifier",
    "extension"
})
public class MIAPPLICATION {

    @XmlElementRef(name = "MIApplicationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIApplicationEnum> miApplicationType;
    @XmlElementRef(name = "MIApplicationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miApplicationTypeOtherDescription;
    @XmlElementRef(name = "MICertificateIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miCertificateIdentifier;
    @XmlElementRef(name = "MILenderIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miLenderIdentifier;
    @XmlElementRef(name = "MIServiceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIServiceEnum> miServiceType;
    @XmlElementRef(name = "MIServiceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miServiceTypeOtherDescription;
    @XmlElementRef(name = "MITransactionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miTransactionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected MIAPPLICATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miApplicationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIApplicationEnum }{@code >}
     *     
     */
    public JAXBElement<MIApplicationEnum> getMIApplicationType() {
        return miApplicationType;
    }

    /**
     * Sets the value of the miApplicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIApplicationEnum }{@code >}
     *     
     */
    public void setMIApplicationType(JAXBElement<MIApplicationEnum> value) {
        this.miApplicationType = value;
    }

    /**
     * Gets the value of the miApplicationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIApplicationTypeOtherDescription() {
        return miApplicationTypeOtherDescription;
    }

    /**
     * Sets the value of the miApplicationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIApplicationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miApplicationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miCertificateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMICertificateIdentifier() {
        return miCertificateIdentifier;
    }

    /**
     * Sets the value of the miCertificateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMICertificateIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miCertificateIdentifier = value;
    }

    /**
     * Gets the value of the miLenderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMILenderIdentifier() {
        return miLenderIdentifier;
    }

    /**
     * Sets the value of the miLenderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMILenderIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miLenderIdentifier = value;
    }

    /**
     * Gets the value of the miServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIServiceEnum }{@code >}
     *     
     */
    public JAXBElement<MIServiceEnum> getMIServiceType() {
        return miServiceType;
    }

    /**
     * Sets the value of the miServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIServiceEnum }{@code >}
     *     
     */
    public void setMIServiceType(JAXBElement<MIServiceEnum> value) {
        this.miServiceType = value;
    }

    /**
     * Gets the value of the miServiceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIServiceTypeOtherDescription() {
        return miServiceTypeOtherDescription;
    }

    /**
     * Sets the value of the miServiceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIServiceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miServiceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMITransactionIdentifier() {
        return miTransactionIdentifier;
    }

    /**
     * Sets the value of the miTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMITransactionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miTransactionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIAPPLICATIONEXTENSION }
     *     
     */
    public MIAPPLICATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIAPPLICATIONEXTENSION }
     *     
     */
    public void setEXTENSION(MIAPPLICATIONEXTENSION value) {
        this.extension = value;
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
