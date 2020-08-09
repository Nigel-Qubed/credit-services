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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information about the type and description of the servitude.
 * 
 * <p>Java class for SERVITUDE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVITUDE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndividualPropertyServitudeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PrivatelyCreatedServitudeType" type="{http://www.mismo.org/residential/2009/schemas}PrivatelyCreatedServitudeEnum" minOccurs="0"/>
 *         &lt;element name="PrivatelyCreatedServitudeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServitudeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServitudeType" type="{http://www.mismo.org/residential/2009/schemas}ServitudeEnum" minOccurs="0"/>
 *         &lt;element name="ServitudeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVITUDE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVITUDE_DETAIL", propOrder = {
    "individualPropertyServitudeDescription",
    "privatelyCreatedServitudeType",
    "privatelyCreatedServitudeTypeOtherDescription",
    "servitudeDescription",
    "servitudeType",
    "servitudeTypeOtherDescription",
    "extension"
})
public class SERVITUDEDETAIL {

    @XmlElementRef(name = "IndividualPropertyServitudeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> individualPropertyServitudeDescription;
    @XmlElementRef(name = "PrivatelyCreatedServitudeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PrivatelyCreatedServitudeEnum> privatelyCreatedServitudeType;
    @XmlElementRef(name = "PrivatelyCreatedServitudeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> privatelyCreatedServitudeTypeOtherDescription;
    @XmlElementRef(name = "ServitudeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servitudeDescription;
    @XmlElementRef(name = "ServitudeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServitudeEnum> servitudeType;
    @XmlElementRef(name = "ServitudeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servitudeTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected SERVITUDEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the individualPropertyServitudeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIndividualPropertyServitudeDescription() {
        return individualPropertyServitudeDescription;
    }

    /**
     * Sets the value of the individualPropertyServitudeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIndividualPropertyServitudeDescription(JAXBElement<MISMOString> value) {
        this.individualPropertyServitudeDescription = value;
    }

    /**
     * Gets the value of the privatelyCreatedServitudeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrivatelyCreatedServitudeEnum }{@code >}
     *     
     */
    public JAXBElement<PrivatelyCreatedServitudeEnum> getPrivatelyCreatedServitudeType() {
        return privatelyCreatedServitudeType;
    }

    /**
     * Sets the value of the privatelyCreatedServitudeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrivatelyCreatedServitudeEnum }{@code >}
     *     
     */
    public void setPrivatelyCreatedServitudeType(JAXBElement<PrivatelyCreatedServitudeEnum> value) {
        this.privatelyCreatedServitudeType = value;
    }

    /**
     * Gets the value of the privatelyCreatedServitudeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPrivatelyCreatedServitudeTypeOtherDescription() {
        return privatelyCreatedServitudeTypeOtherDescription;
    }

    /**
     * Sets the value of the privatelyCreatedServitudeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPrivatelyCreatedServitudeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.privatelyCreatedServitudeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the servitudeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getServitudeDescription() {
        return servitudeDescription;
    }

    /**
     * Sets the value of the servitudeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setServitudeDescription(JAXBElement<MISMOString> value) {
        this.servitudeDescription = value;
    }

    /**
     * Gets the value of the servitudeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServitudeEnum }{@code >}
     *     
     */
    public JAXBElement<ServitudeEnum> getServitudeType() {
        return servitudeType;
    }

    /**
     * Sets the value of the servitudeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServitudeEnum }{@code >}
     *     
     */
    public void setServitudeType(JAXBElement<ServitudeEnum> value) {
        this.servitudeType = value;
    }

    /**
     * Gets the value of the servitudeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getServitudeTypeOtherDescription() {
        return servitudeTypeOtherDescription;
    }

    /**
     * Sets the value of the servitudeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setServitudeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.servitudeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SERVITUDEDETAILEXTENSION }
     *     
     */
    public SERVITUDEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVITUDEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(SERVITUDEDETAILEXTENSION value) {
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
