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
 * Describes the behavior of the loan when a skip payment feature is exercised.
 * 
 * <p>Java class for SKIP_PAYMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKIP_PAYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SkipPaymentActionType" type="{http://www.mismo.org/residential/2009/schemas}SkipPaymentActionEnum" minOccurs="0"/>
 *         &lt;element name="SkipPaymentActionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SkipPaymentInitialRestrictionTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="SkippedPaymentCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SKIP_PAYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SKIP_PAYMENT", propOrder = {
    "skipPaymentActionType",
    "skipPaymentActionTypeOtherDescription",
    "skipPaymentInitialRestrictionTermMonthsCount",
    "skippedPaymentCount",
    "extension"
})
public class SKIPPAYMENT {

    @XmlElementRef(name = "SkipPaymentActionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SkipPaymentActionEnum> skipPaymentActionType;
    @XmlElementRef(name = "SkipPaymentActionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> skipPaymentActionTypeOtherDescription;
    @XmlElementRef(name = "SkipPaymentInitialRestrictionTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> skipPaymentInitialRestrictionTermMonthsCount;
    @XmlElementRef(name = "SkippedPaymentCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> skippedPaymentCount;
    @XmlElement(name = "EXTENSION")
    protected SKIPPAYMENTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the skipPaymentActionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SkipPaymentActionEnum }{@code >}
     *     
     */
    public JAXBElement<SkipPaymentActionEnum> getSkipPaymentActionType() {
        return skipPaymentActionType;
    }

    /**
     * Sets the value of the skipPaymentActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SkipPaymentActionEnum }{@code >}
     *     
     */
    public void setSkipPaymentActionType(JAXBElement<SkipPaymentActionEnum> value) {
        this.skipPaymentActionType = value;
    }

    /**
     * Gets the value of the skipPaymentActionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSkipPaymentActionTypeOtherDescription() {
        return skipPaymentActionTypeOtherDescription;
    }

    /**
     * Sets the value of the skipPaymentActionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSkipPaymentActionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.skipPaymentActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the skipPaymentInitialRestrictionTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getSkipPaymentInitialRestrictionTermMonthsCount() {
        return skipPaymentInitialRestrictionTermMonthsCount;
    }

    /**
     * Sets the value of the skipPaymentInitialRestrictionTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setSkipPaymentInitialRestrictionTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.skipPaymentInitialRestrictionTermMonthsCount = value;
    }

    /**
     * Gets the value of the skippedPaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getSkippedPaymentCount() {
        return skippedPaymentCount;
    }

    /**
     * Sets the value of the skippedPaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setSkippedPaymentCount(JAXBElement<MISMOCount> value) {
        this.skippedPaymentCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SKIPPAYMENTEXTENSION }
     *     
     */
    public SKIPPAYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKIPPAYMENTEXTENSION }
     *     
     */
    public void setEXTENSION(SKIPPAYMENTEXTENSION value) {
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
