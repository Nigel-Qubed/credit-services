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
 * Contains information and characteristics pertaining to a specific mortgage insurance product.
 * 
 * <p>Java class for MI_PRODUCT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_PRODUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MICoveragePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MIDurationType" type="{http://www.mismo.org/residential/2009/schemas}MIDurationEnum" minOccurs="0"/>
 *         &lt;element name="MIDurationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIInitialPremiumAtClosingType" type="{http://www.mismo.org/residential/2009/schemas}MIInitialPremiumAtClosingEnum" minOccurs="0"/>
 *         &lt;element name="MIInitialPremiumAtClosingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MILenderSpecialProgramDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumCalculationType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumCalculationEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumCalculationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumFinancedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="MIPremiumPaymentType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumPaymentEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumPaymentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumRatePlanType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumRatePlanEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumRatePlanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumRefundableEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumSourceEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumUpfrontPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MISpecialPricingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MISubPrimeProgramType" type="{http://www.mismo.org/residential/2009/schemas}MISubPrimeProgramEnum" minOccurs="0"/>
 *         &lt;element name="MISubPrimeProgramTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_PRODUCT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_PRODUCT", propOrder = {
    "miCoveragePercent",
    "miDurationType",
    "miDurationTypeOtherDescription",
    "miInitialPremiumAtClosingType",
    "miInitialPremiumAtClosingTypeOtherDescription",
    "miLenderSpecialProgramDescription",
    "miPremiumCalculationType",
    "miPremiumCalculationTypeOtherDescription",
    "miPremiumFinancedIndicator",
    "miPremiumPaymentType",
    "miPremiumPaymentTypeOtherDescription",
    "miPremiumRatePlanType",
    "miPremiumRatePlanTypeOtherDescription",
    "miPremiumRefundableType",
    "miPremiumRefundableTypeOtherDescription",
    "miPremiumSourceType",
    "miPremiumSourceTypeOtherDescription",
    "miPremiumUpfrontPercent",
    "miSpecialPricingDescription",
    "miSubPrimeProgramType",
    "miSubPrimeProgramTypeOtherDescription",
    "extension"
})
public class MIPRODUCT {

    @XmlElementRef(name = "MICoveragePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miCoveragePercent;
    @XmlElementRef(name = "MIDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIDurationEnum> miDurationType;
    @XmlElementRef(name = "MIDurationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miDurationTypeOtherDescription;
    @XmlElementRef(name = "MIInitialPremiumAtClosingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIInitialPremiumAtClosingEnum> miInitialPremiumAtClosingType;
    @XmlElementRef(name = "MIInitialPremiumAtClosingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miInitialPremiumAtClosingTypeOtherDescription;
    @XmlElementRef(name = "MILenderSpecialProgramDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miLenderSpecialProgramDescription;
    @XmlElementRef(name = "MIPremiumCalculationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumCalculationEnum> miPremiumCalculationType;
    @XmlElementRef(name = "MIPremiumCalculationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumCalculationTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumFinancedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> miPremiumFinancedIndicator;
    @XmlElementRef(name = "MIPremiumPaymentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumPaymentEnum> miPremiumPaymentType;
    @XmlElementRef(name = "MIPremiumPaymentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumPaymentTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumRatePlanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumRatePlanEnum> miPremiumRatePlanType;
    @XmlElementRef(name = "MIPremiumRatePlanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumRatePlanTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumRefundableType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumRefundableEnum> miPremiumRefundableType;
    @XmlElementRef(name = "MIPremiumRefundableTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumRefundableTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumSourceEnum> miPremiumSourceType;
    @XmlElementRef(name = "MIPremiumSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumSourceTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumUpfrontPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miPremiumUpfrontPercent;
    @XmlElementRef(name = "MISpecialPricingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miSpecialPricingDescription;
    @XmlElementRef(name = "MISubPrimeProgramType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISubPrimeProgramEnum> miSubPrimeProgramType;
    @XmlElementRef(name = "MISubPrimeProgramTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miSubPrimeProgramTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected MIPRODUCTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miCoveragePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMICoveragePercent() {
        return miCoveragePercent;
    }

    /**
     * Sets the value of the miCoveragePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMICoveragePercent(JAXBElement<MISMOPercent> value) {
        this.miCoveragePercent = value;
    }

    /**
     * Gets the value of the miDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public JAXBElement<MIDurationEnum> getMIDurationType() {
        return miDurationType;
    }

    /**
     * Sets the value of the miDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public void setMIDurationType(JAXBElement<MIDurationEnum> value) {
        this.miDurationType = value;
    }

    /**
     * Gets the value of the miDurationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIDurationTypeOtherDescription() {
        return miDurationTypeOtherDescription;
    }

    /**
     * Sets the value of the miDurationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIDurationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miDurationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miInitialPremiumAtClosingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIInitialPremiumAtClosingEnum }{@code >}
     *     
     */
    public JAXBElement<MIInitialPremiumAtClosingEnum> getMIInitialPremiumAtClosingType() {
        return miInitialPremiumAtClosingType;
    }

    /**
     * Sets the value of the miInitialPremiumAtClosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIInitialPremiumAtClosingEnum }{@code >}
     *     
     */
    public void setMIInitialPremiumAtClosingType(JAXBElement<MIInitialPremiumAtClosingEnum> value) {
        this.miInitialPremiumAtClosingType = value;
    }

    /**
     * Gets the value of the miInitialPremiumAtClosingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIInitialPremiumAtClosingTypeOtherDescription() {
        return miInitialPremiumAtClosingTypeOtherDescription;
    }

    /**
     * Sets the value of the miInitialPremiumAtClosingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIInitialPremiumAtClosingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miInitialPremiumAtClosingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miLenderSpecialProgramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMILenderSpecialProgramDescription() {
        return miLenderSpecialProgramDescription;
    }

    /**
     * Sets the value of the miLenderSpecialProgramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMILenderSpecialProgramDescription(JAXBElement<MISMOString> value) {
        this.miLenderSpecialProgramDescription = value;
    }

    /**
     * Gets the value of the miPremiumCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumCalculationEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumCalculationEnum> getMIPremiumCalculationType() {
        return miPremiumCalculationType;
    }

    /**
     * Sets the value of the miPremiumCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumCalculationEnum }{@code >}
     *     
     */
    public void setMIPremiumCalculationType(JAXBElement<MIPremiumCalculationEnum> value) {
        this.miPremiumCalculationType = value;
    }

    /**
     * Gets the value of the miPremiumCalculationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumCalculationTypeOtherDescription() {
        return miPremiumCalculationTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumCalculationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumCalculationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumCalculationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumFinancedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMIPremiumFinancedIndicator() {
        return miPremiumFinancedIndicator;
    }

    /**
     * Sets the value of the miPremiumFinancedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMIPremiumFinancedIndicator(JAXBElement<MISMOIndicator> value) {
        this.miPremiumFinancedIndicator = value;
    }

    /**
     * Gets the value of the miPremiumPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumPaymentEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumPaymentEnum> getMIPremiumPaymentType() {
        return miPremiumPaymentType;
    }

    /**
     * Sets the value of the miPremiumPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumPaymentEnum }{@code >}
     *     
     */
    public void setMIPremiumPaymentType(JAXBElement<MIPremiumPaymentEnum> value) {
        this.miPremiumPaymentType = value;
    }

    /**
     * Gets the value of the miPremiumPaymentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumPaymentTypeOtherDescription() {
        return miPremiumPaymentTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumPaymentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumPaymentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumPaymentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumRatePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRatePlanEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumRatePlanEnum> getMIPremiumRatePlanType() {
        return miPremiumRatePlanType;
    }

    /**
     * Sets the value of the miPremiumRatePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRatePlanEnum }{@code >}
     *     
     */
    public void setMIPremiumRatePlanType(JAXBElement<MIPremiumRatePlanEnum> value) {
        this.miPremiumRatePlanType = value;
    }

    /**
     * Gets the value of the miPremiumRatePlanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumRatePlanTypeOtherDescription() {
        return miPremiumRatePlanTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumRatePlanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumRatePlanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumRatePlanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumRefundableType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumRefundableEnum> getMIPremiumRefundableType() {
        return miPremiumRefundableType;
    }

    /**
     * Sets the value of the miPremiumRefundableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public void setMIPremiumRefundableType(JAXBElement<MIPremiumRefundableEnum> value) {
        this.miPremiumRefundableType = value;
    }

    /**
     * Gets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumRefundableTypeOtherDescription() {
        return miPremiumRefundableTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumRefundableTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumRefundableTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumSourceEnum> getMIPremiumSourceType() {
        return miPremiumSourceType;
    }

    /**
     * Sets the value of the miPremiumSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public void setMIPremiumSourceType(JAXBElement<MIPremiumSourceEnum> value) {
        this.miPremiumSourceType = value;
    }

    /**
     * Gets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumSourceTypeOtherDescription() {
        return miPremiumSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumUpfrontPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMIPremiumUpfrontPercent() {
        return miPremiumUpfrontPercent;
    }

    /**
     * Sets the value of the miPremiumUpfrontPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMIPremiumUpfrontPercent(JAXBElement<MISMOPercent> value) {
        this.miPremiumUpfrontPercent = value;
    }

    /**
     * Gets the value of the miSpecialPricingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMISpecialPricingDescription() {
        return miSpecialPricingDescription;
    }

    /**
     * Sets the value of the miSpecialPricingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMISpecialPricingDescription(JAXBElement<MISMOString> value) {
        this.miSpecialPricingDescription = value;
    }

    /**
     * Gets the value of the miSubPrimeProgramType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISubPrimeProgramEnum }{@code >}
     *     
     */
    public JAXBElement<MISubPrimeProgramEnum> getMISubPrimeProgramType() {
        return miSubPrimeProgramType;
    }

    /**
     * Sets the value of the miSubPrimeProgramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISubPrimeProgramEnum }{@code >}
     *     
     */
    public void setMISubPrimeProgramType(JAXBElement<MISubPrimeProgramEnum> value) {
        this.miSubPrimeProgramType = value;
    }

    /**
     * Gets the value of the miSubPrimeProgramTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMISubPrimeProgramTypeOtherDescription() {
        return miSubPrimeProgramTypeOtherDescription;
    }

    /**
     * Sets the value of the miSubPrimeProgramTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMISubPrimeProgramTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miSubPrimeProgramTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIPRODUCTEXTENSION }
     *     
     */
    public MIPRODUCTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPRODUCTEXTENSION }
     *     
     */
    public void setEXTENSION(MIPRODUCTEXTENSION value) {
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
