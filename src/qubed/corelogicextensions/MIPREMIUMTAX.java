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
 * <p>Java class for MI_PREMIUM_TAX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_PREMIUM_TAX">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MIPremiumTaxCodeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIPremiumTaxCodePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MIPremiumTaxCodeType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumTaxCodeEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumTaxingAuthorityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PaymentIncludedInAPRIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PaymentIncludedInJurisdictionHighCostIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RegulationZPointsAndFeesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUM_TAX_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_PREMIUM_TAX", propOrder = {
    "miPremiumTaxCodeAmount",
    "miPremiumTaxCodePercent",
    "miPremiumTaxCodeType",
    "miPremiumTaxingAuthorityName",
    "paymentIncludedInAPRIndicator",
    "paymentIncludedInJurisdictionHighCostIndicator",
    "regulationZPointsAndFeesIndicator",
    "extension"
})
public class MIPREMIUMTAX {

    @XmlElementRef(name = "MIPremiumTaxCodeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miPremiumTaxCodeAmount;
    @XmlElementRef(name = "MIPremiumTaxCodePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miPremiumTaxCodePercent;
    @XmlElementRef(name = "MIPremiumTaxCodeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumTaxCodeEnum> miPremiumTaxCodeType;
    @XmlElementRef(name = "MIPremiumTaxingAuthorityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumTaxingAuthorityName;
    @XmlElementRef(name = "PaymentIncludedInAPRIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> paymentIncludedInAPRIndicator;
    @XmlElementRef(name = "PaymentIncludedInJurisdictionHighCostIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> paymentIncludedInJurisdictionHighCostIndicator;
    @XmlElementRef(name = "RegulationZPointsAndFeesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> regulationZPointsAndFeesIndicator;
    @XmlElement(name = "EXTENSION")
    protected MIPREMIUMTAXEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miPremiumTaxCodeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIPremiumTaxCodeAmount() {
        return miPremiumTaxCodeAmount;
    }

    /**
     * Sets the value of the miPremiumTaxCodeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIPremiumTaxCodeAmount(JAXBElement<MISMOAmount> value) {
        this.miPremiumTaxCodeAmount = value;
    }

    /**
     * Gets the value of the miPremiumTaxCodePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMIPremiumTaxCodePercent() {
        return miPremiumTaxCodePercent;
    }

    /**
     * Sets the value of the miPremiumTaxCodePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMIPremiumTaxCodePercent(JAXBElement<MISMOPercent> value) {
        this.miPremiumTaxCodePercent = value;
    }

    /**
     * Gets the value of the miPremiumTaxCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumTaxCodeEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumTaxCodeEnum> getMIPremiumTaxCodeType() {
        return miPremiumTaxCodeType;
    }

    /**
     * Sets the value of the miPremiumTaxCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumTaxCodeEnum }{@code >}
     *     
     */
    public void setMIPremiumTaxCodeType(JAXBElement<MIPremiumTaxCodeEnum> value) {
        this.miPremiumTaxCodeType = value;
    }

    /**
     * Gets the value of the miPremiumTaxingAuthorityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumTaxingAuthorityName() {
        return miPremiumTaxingAuthorityName;
    }

    /**
     * Sets the value of the miPremiumTaxingAuthorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumTaxingAuthorityName(JAXBElement<MISMOString> value) {
        this.miPremiumTaxingAuthorityName = value;
    }

    /**
     * Gets the value of the paymentIncludedInAPRIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPaymentIncludedInAPRIndicator() {
        return paymentIncludedInAPRIndicator;
    }

    /**
     * Sets the value of the paymentIncludedInAPRIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPaymentIncludedInAPRIndicator(JAXBElement<MISMOIndicator> value) {
        this.paymentIncludedInAPRIndicator = value;
    }

    /**
     * Gets the value of the paymentIncludedInJurisdictionHighCostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPaymentIncludedInJurisdictionHighCostIndicator() {
        return paymentIncludedInJurisdictionHighCostIndicator;
    }

    /**
     * Sets the value of the paymentIncludedInJurisdictionHighCostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPaymentIncludedInJurisdictionHighCostIndicator(JAXBElement<MISMOIndicator> value) {
        this.paymentIncludedInJurisdictionHighCostIndicator = value;
    }

    /**
     * Gets the value of the regulationZPointsAndFeesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRegulationZPointsAndFeesIndicator() {
        return regulationZPointsAndFeesIndicator;
    }

    /**
     * Sets the value of the regulationZPointsAndFeesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRegulationZPointsAndFeesIndicator(JAXBElement<MISMOIndicator> value) {
        this.regulationZPointsAndFeesIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIPREMIUMTAXEXTENSION }
     *     
     */
    public MIPREMIUMTAXEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMTAXEXTENSION }
     *     
     */
    public void setEXTENSION(MIPREMIUMTAXEXTENSION value) {
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
