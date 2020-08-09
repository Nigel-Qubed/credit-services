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
 * <p>Java class for CREDIT_RESPONSE_ALERT_MESSAGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_RESPONSE_ALERT_MESSAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditRepositorySourceType" type="{http://www.mismo.org/residential/2009/schemas}CreditRepositorySourceEnum" minOccurs="0"/>
 *         &lt;element name="CreditRepositorySourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageAdverseIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageCategoryType" type="{http://www.mismo.org/residential/2009/schemas}CreditResponseAlertMessageCategoryEnum" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageCategoryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageCodeSourceType" type="{http://www.mismo.org/residential/2009/schemas}CreditResponseAlertMessageCodeSourceEnum" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageCodeSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageType" type="{http://www.mismo.org/residential/2009/schemas}CreditResponseAlertMessageEnum" minOccurs="0"/>
 *         &lt;element name="CreditResponseAlertMessageTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_RESPONSE_ALERT_MESSAGE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "CREDIT_RESPONSE_ALERT_MESSAGE", propOrder = {
    "creditRepositorySourceType",
    "creditRepositorySourceTypeOtherDescription",
    "creditResponseAlertMessageAdverseIndicator",
    "creditResponseAlertMessageCategoryType",
    "creditResponseAlertMessageCategoryTypeOtherDescription",
    "creditResponseAlertMessageCode",
    "creditResponseAlertMessageCodeSourceType",
    "creditResponseAlertMessageCodeSourceTypeOtherDescription",
    "creditResponseAlertMessageText",
    "creditResponseAlertMessageType",
    "creditResponseAlertMessageTypeOtherDescription",
    "extension"
})
public class CREDITRESPONSEALERTMESSAGE {

    @XmlElementRef(name = "CreditRepositorySourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditRepositorySourceEnum> creditRepositorySourceType;
    @XmlElementRef(name = "CreditRepositorySourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditRepositorySourceTypeOtherDescription;
    @XmlElementRef(name = "CreditResponseAlertMessageAdverseIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> creditResponseAlertMessageAdverseIndicator;
    @XmlElementRef(name = "CreditResponseAlertMessageCategoryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditResponseAlertMessageCategoryEnum> creditResponseAlertMessageCategoryType;
    @XmlElementRef(name = "CreditResponseAlertMessageCategoryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditResponseAlertMessageCategoryTypeOtherDescription;
    @XmlElementRef(name = "CreditResponseAlertMessageCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> creditResponseAlertMessageCode;
    @XmlElementRef(name = "CreditResponseAlertMessageCodeSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditResponseAlertMessageCodeSourceEnum> creditResponseAlertMessageCodeSourceType;
    @XmlElementRef(name = "CreditResponseAlertMessageCodeSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditResponseAlertMessageCodeSourceTypeOtherDescription;
    @XmlElementRef(name = "CreditResponseAlertMessageText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditResponseAlertMessageText;
    @XmlElementRef(name = "CreditResponseAlertMessageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditResponseAlertMessageEnum> creditResponseAlertMessageType;
    @XmlElementRef(name = "CreditResponseAlertMessageTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditResponseAlertMessageTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CREDITRESPONSEALERTMESSAGEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditRepositorySourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditRepositorySourceEnum }{@code >}
     *     
     */
    public JAXBElement<CreditRepositorySourceEnum> getCreditRepositorySourceType() {
        return creditRepositorySourceType;
    }

    /**
     * Sets the value of the creditRepositorySourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditRepositorySourceEnum }{@code >}
     *     
     */
    public void setCreditRepositorySourceType(JAXBElement<CreditRepositorySourceEnum> value) {
        this.creditRepositorySourceType = value;
    }

    /**
     * Gets the value of the creditRepositorySourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditRepositorySourceTypeOtherDescription() {
        return creditRepositorySourceTypeOtherDescription;
    }

    /**
     * Sets the value of the creditRepositorySourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditRepositorySourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditRepositorySourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageAdverseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCreditResponseAlertMessageAdverseIndicator() {
        return creditResponseAlertMessageAdverseIndicator;
    }

    /**
     * Sets the value of the creditResponseAlertMessageAdverseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageAdverseIndicator(JAXBElement<MISMOIndicator> value) {
        this.creditResponseAlertMessageAdverseIndicator = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageCategoryEnum }{@code >}
     *     
     */
    public JAXBElement<CreditResponseAlertMessageCategoryEnum> getCreditResponseAlertMessageCategoryType() {
        return creditResponseAlertMessageCategoryType;
    }

    /**
     * Sets the value of the creditResponseAlertMessageCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageCategoryEnum }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageCategoryType(JAXBElement<CreditResponseAlertMessageCategoryEnum> value) {
        this.creditResponseAlertMessageCategoryType = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditResponseAlertMessageCategoryTypeOtherDescription() {
        return creditResponseAlertMessageCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the creditResponseAlertMessageCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageCategoryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditResponseAlertMessageCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCreditResponseAlertMessageCode() {
        return creditResponseAlertMessageCode;
    }

    /**
     * Sets the value of the creditResponseAlertMessageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageCode(JAXBElement<MISMOCode> value) {
        this.creditResponseAlertMessageCode = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageCodeSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageCodeSourceEnum }{@code >}
     *     
     */
    public JAXBElement<CreditResponseAlertMessageCodeSourceEnum> getCreditResponseAlertMessageCodeSourceType() {
        return creditResponseAlertMessageCodeSourceType;
    }

    /**
     * Sets the value of the creditResponseAlertMessageCodeSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageCodeSourceEnum }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageCodeSourceType(JAXBElement<CreditResponseAlertMessageCodeSourceEnum> value) {
        this.creditResponseAlertMessageCodeSourceType = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageCodeSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditResponseAlertMessageCodeSourceTypeOtherDescription() {
        return creditResponseAlertMessageCodeSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the creditResponseAlertMessageCodeSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageCodeSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditResponseAlertMessageCodeSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditResponseAlertMessageText() {
        return creditResponseAlertMessageText;
    }

    /**
     * Sets the value of the creditResponseAlertMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageText(JAXBElement<MISMOString> value) {
        this.creditResponseAlertMessageText = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageEnum }{@code >}
     *     
     */
    public JAXBElement<CreditResponseAlertMessageEnum> getCreditResponseAlertMessageType() {
        return creditResponseAlertMessageType;
    }

    /**
     * Sets the value of the creditResponseAlertMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditResponseAlertMessageEnum }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageType(JAXBElement<CreditResponseAlertMessageEnum> value) {
        this.creditResponseAlertMessageType = value;
    }

    /**
     * Gets the value of the creditResponseAlertMessageTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditResponseAlertMessageTypeOtherDescription() {
        return creditResponseAlertMessageTypeOtherDescription;
    }

    /**
     * Sets the value of the creditResponseAlertMessageTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditResponseAlertMessageTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditResponseAlertMessageTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITRESPONSEALERTMESSAGEEXTENSION }
     *     
     */
    public CREDITRESPONSEALERTMESSAGEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITRESPONSEALERTMESSAGEEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITRESPONSEALERTMESSAGEEXTENSION value) {
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
