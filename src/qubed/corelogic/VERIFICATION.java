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
 * Information around the verification of a particular item (e.g. asset, income, employment, rent, etc).
 * 
 * <p>Java class for VERIFICATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VERIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerificationByName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="VerificationCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="VerificationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="VerificationMethodType" type="{http://www.mismo.org/residential/2009/schemas}VerificationMethodEnum" minOccurs="0"/>
 *         &lt;element name="VerificationMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="VerificationStatusType" type="{http://www.mismo.org/residential/2009/schemas}VerificationStatusEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERIFICATION", propOrder = {
    "verificationByName",
    "verificationCommentDescription",
    "verificationDate",
    "verificationMethodType",
    "verificationMethodTypeOtherDescription",
    "verificationStatusType",
    "extension"
})
public class VERIFICATION {

    @XmlElementRef(name = "VerificationByName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> verificationByName;
    @XmlElementRef(name = "VerificationCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> verificationCommentDescription;
    @XmlElementRef(name = "VerificationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> verificationDate;
    @XmlElementRef(name = "VerificationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<VerificationMethodEnum> verificationMethodType;
    @XmlElementRef(name = "VerificationMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> verificationMethodTypeOtherDescription;
    @XmlElementRef(name = "VerificationStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<VerificationStatusEnum> verificationStatusType;
    @XmlElement(name = "EXTENSION")
    protected VERIFICATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the verificationByName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getVerificationByName() {
        return verificationByName;
    }

    /**
     * Sets the value of the verificationByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setVerificationByName(JAXBElement<MISMOString> value) {
        this.verificationByName = value;
    }

    /**
     * Gets the value of the verificationCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getVerificationCommentDescription() {
        return verificationCommentDescription;
    }

    /**
     * Sets the value of the verificationCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setVerificationCommentDescription(JAXBElement<MISMOString> value) {
        this.verificationCommentDescription = value;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getVerificationDate() {
        return verificationDate;
    }

    /**
     * Sets the value of the verificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setVerificationDate(JAXBElement<MISMODate> value) {
        this.verificationDate = value;
    }

    /**
     * Gets the value of the verificationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerificationMethodEnum }{@code >}
     *     
     */
    public JAXBElement<VerificationMethodEnum> getVerificationMethodType() {
        return verificationMethodType;
    }

    /**
     * Sets the value of the verificationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerificationMethodEnum }{@code >}
     *     
     */
    public void setVerificationMethodType(JAXBElement<VerificationMethodEnum> value) {
        this.verificationMethodType = value;
    }

    /**
     * Gets the value of the verificationMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getVerificationMethodTypeOtherDescription() {
        return verificationMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the verificationMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setVerificationMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.verificationMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the verificationStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerificationStatusEnum }{@code >}
     *     
     */
    public JAXBElement<VerificationStatusEnum> getVerificationStatusType() {
        return verificationStatusType;
    }

    /**
     * Sets the value of the verificationStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerificationStatusEnum }{@code >}
     *     
     */
    public void setVerificationStatusType(JAXBElement<VerificationStatusEnum> value) {
        this.verificationStatusType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONEXTENSION }
     *     
     */
    public VERIFICATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONEXTENSION }
     *     
     */
    public void setEXTENSION(VERIFICATIONEXTENSION value) {
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