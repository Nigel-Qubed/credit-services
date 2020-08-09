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
 * The data in this element provides the values for Rate, Principle and Interest Payment, etc that are effective as the result of applying the adjustment that went into effect on the EffectiveDueDate or close to that time. Example, for a 30 year annually adjusting mortgage there would be 29 individual occurrences of this container over the life of the loan.
 * 
 * <p>Java class for RATE_OR_PAYMENT_CHANGE_OCCURRENCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RATE_OR_PAYMENT_CHANGE_OCCURRENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentChangeEffectiveDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeIndexRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeOccurrenceExtendedTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeOccurrencePassThroughRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeOccurrenceType" type="{http://www.mismo.org/residential/2009/schemas}AdjustmentChangeOccurrenceEnum" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeOccurrenceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangePrincipalAndInterestPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeProjectedPrincipalBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeServiceFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustmentChangeServiceFeeRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AdjustmentRuleType" type="{http://www.mismo.org/residential/2009/schemas}AdjustmentRuleEnum" minOccurs="0"/>
 *         &lt;element name="BalloonResetDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CarryoverRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConvertibleStatusType" type="{http://www.mismo.org/residential/2009/schemas}ConvertibleStatusEnum" minOccurs="0"/>
 *         &lt;element name="LastRateChangeNotificationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LatestConversionEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextConversionOptionEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextConversionOptionNoticeDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextDemandConversionOptionNoticeDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextIgnoreRateAdjustmentCapsDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextPrincipalAndInterestPaymentChangeEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextRateAdjustmentEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NextRateAdjustmentEffectiveNoticeDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RateAdjustmentPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ServicerARMPlanIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RATE_OR_PAYMENT_CHANGE_OCCURRENCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RATE_OR_PAYMENT_CHANGE_OCCURRENCE", propOrder = {
    "adjustmentChangeEffectiveDueDate",
    "adjustmentChangeIndexRatePercent",
    "adjustmentChangeInterestRatePercent",
    "adjustmentChangeOccurrenceExtendedTermMonthsCount",
    "adjustmentChangeOccurrencePassThroughRatePercent",
    "adjustmentChangeOccurrenceType",
    "adjustmentChangeOccurrenceTypeOtherDescription",
    "adjustmentChangePrincipalAndInterestPaymentAmount",
    "adjustmentChangeProjectedPrincipalBalanceAmount",
    "adjustmentChangeServiceFeeAmount",
    "adjustmentChangeServiceFeeRatePercent",
    "adjustmentRuleType",
    "balloonResetDate",
    "carryoverRatePercent",
    "convertibleStatusType",
    "lastRateChangeNotificationDate",
    "latestConversionEffectiveDate",
    "nextConversionOptionEffectiveDate",
    "nextConversionOptionNoticeDate",
    "nextDemandConversionOptionNoticeDate",
    "nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate",
    "nextIgnoreRateAdjustmentCapsDate",
    "nextPrincipalAndInterestPaymentChangeEffectiveDate",
    "nextRateAdjustmentEffectiveDate",
    "nextRateAdjustmentEffectiveNoticeDate",
    "rateAdjustmentPercent",
    "servicerARMPlanIdentifier",
    "extension"
})
public class RATEORPAYMENTCHANGEOCCURRENCE {

    @XmlElementRef(name = "AdjustmentChangeEffectiveDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> adjustmentChangeEffectiveDueDate;
    @XmlElementRef(name = "AdjustmentChangeIndexRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> adjustmentChangeIndexRatePercent;
    @XmlElementRef(name = "AdjustmentChangeInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> adjustmentChangeInterestRatePercent;
    @XmlElementRef(name = "AdjustmentChangeOccurrenceExtendedTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> adjustmentChangeOccurrenceExtendedTermMonthsCount;
    @XmlElementRef(name = "AdjustmentChangeOccurrencePassThroughRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> adjustmentChangeOccurrencePassThroughRatePercent;
    @XmlElementRef(name = "AdjustmentChangeOccurrenceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AdjustmentChangeOccurrenceEnum> adjustmentChangeOccurrenceType;
    @XmlElementRef(name = "AdjustmentChangeOccurrenceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> adjustmentChangeOccurrenceTypeOtherDescription;
    @XmlElementRef(name = "AdjustmentChangePrincipalAndInterestPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustmentChangePrincipalAndInterestPaymentAmount;
    @XmlElementRef(name = "AdjustmentChangeProjectedPrincipalBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustmentChangeProjectedPrincipalBalanceAmount;
    @XmlElementRef(name = "AdjustmentChangeServiceFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustmentChangeServiceFeeAmount;
    @XmlElementRef(name = "AdjustmentChangeServiceFeeRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> adjustmentChangeServiceFeeRatePercent;
    @XmlElementRef(name = "AdjustmentRuleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AdjustmentRuleEnum> adjustmentRuleType;
    @XmlElementRef(name = "BalloonResetDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> balloonResetDate;
    @XmlElementRef(name = "CarryoverRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> carryoverRatePercent;
    @XmlElementRef(name = "ConvertibleStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvertibleStatusEnum> convertibleStatusType;
    @XmlElementRef(name = "LastRateChangeNotificationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> lastRateChangeNotificationDate;
    @XmlElementRef(name = "LatestConversionEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> latestConversionEffectiveDate;
    @XmlElementRef(name = "NextConversionOptionEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextConversionOptionEffectiveDate;
    @XmlElementRef(name = "NextConversionOptionNoticeDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextConversionOptionNoticeDate;
    @XmlElementRef(name = "NextDemandConversionOptionNoticeDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextDemandConversionOptionNoticeDate;
    @XmlElementRef(name = "NextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate;
    @XmlElementRef(name = "NextIgnoreRateAdjustmentCapsDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextIgnoreRateAdjustmentCapsDate;
    @XmlElementRef(name = "NextPrincipalAndInterestPaymentChangeEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextPrincipalAndInterestPaymentChangeEffectiveDate;
    @XmlElementRef(name = "NextRateAdjustmentEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextRateAdjustmentEffectiveDate;
    @XmlElementRef(name = "NextRateAdjustmentEffectiveNoticeDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> nextRateAdjustmentEffectiveNoticeDate;
    @XmlElementRef(name = "RateAdjustmentPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> rateAdjustmentPercent;
    @XmlElementRef(name = "ServicerARMPlanIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicerARMPlanIdentifier;
    @XmlElement(name = "EXTENSION")
    protected RATEORPAYMENTCHANGEOCCURRENCEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adjustmentChangeEffectiveDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAdjustmentChangeEffectiveDueDate() {
        return adjustmentChangeEffectiveDueDate;
    }

    /**
     * Sets the value of the adjustmentChangeEffectiveDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAdjustmentChangeEffectiveDueDate(JAXBElement<MISMODate> value) {
        this.adjustmentChangeEffectiveDueDate = value;
    }

    /**
     * Gets the value of the adjustmentChangeIndexRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAdjustmentChangeIndexRatePercent() {
        return adjustmentChangeIndexRatePercent;
    }

    /**
     * Sets the value of the adjustmentChangeIndexRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAdjustmentChangeIndexRatePercent(JAXBElement<MISMOPercent> value) {
        this.adjustmentChangeIndexRatePercent = value;
    }

    /**
     * Gets the value of the adjustmentChangeInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAdjustmentChangeInterestRatePercent() {
        return adjustmentChangeInterestRatePercent;
    }

    /**
     * Sets the value of the adjustmentChangeInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAdjustmentChangeInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.adjustmentChangeInterestRatePercent = value;
    }

    /**
     * Gets the value of the adjustmentChangeOccurrenceExtendedTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getAdjustmentChangeOccurrenceExtendedTermMonthsCount() {
        return adjustmentChangeOccurrenceExtendedTermMonthsCount;
    }

    /**
     * Sets the value of the adjustmentChangeOccurrenceExtendedTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setAdjustmentChangeOccurrenceExtendedTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.adjustmentChangeOccurrenceExtendedTermMonthsCount = value;
    }

    /**
     * Gets the value of the adjustmentChangeOccurrencePassThroughRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAdjustmentChangeOccurrencePassThroughRatePercent() {
        return adjustmentChangeOccurrencePassThroughRatePercent;
    }

    /**
     * Sets the value of the adjustmentChangeOccurrencePassThroughRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAdjustmentChangeOccurrencePassThroughRatePercent(JAXBElement<MISMOPercent> value) {
        this.adjustmentChangeOccurrencePassThroughRatePercent = value;
    }

    /**
     * Gets the value of the adjustmentChangeOccurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentChangeOccurrenceEnum }{@code >}
     *     
     */
    public JAXBElement<AdjustmentChangeOccurrenceEnum> getAdjustmentChangeOccurrenceType() {
        return adjustmentChangeOccurrenceType;
    }

    /**
     * Sets the value of the adjustmentChangeOccurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentChangeOccurrenceEnum }{@code >}
     *     
     */
    public void setAdjustmentChangeOccurrenceType(JAXBElement<AdjustmentChangeOccurrenceEnum> value) {
        this.adjustmentChangeOccurrenceType = value;
    }

    /**
     * Gets the value of the adjustmentChangeOccurrenceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAdjustmentChangeOccurrenceTypeOtherDescription() {
        return adjustmentChangeOccurrenceTypeOtherDescription;
    }

    /**
     * Sets the value of the adjustmentChangeOccurrenceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAdjustmentChangeOccurrenceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.adjustmentChangeOccurrenceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the adjustmentChangePrincipalAndInterestPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustmentChangePrincipalAndInterestPaymentAmount() {
        return adjustmentChangePrincipalAndInterestPaymentAmount;
    }

    /**
     * Sets the value of the adjustmentChangePrincipalAndInterestPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustmentChangePrincipalAndInterestPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.adjustmentChangePrincipalAndInterestPaymentAmount = value;
    }

    /**
     * Gets the value of the adjustmentChangeProjectedPrincipalBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustmentChangeProjectedPrincipalBalanceAmount() {
        return adjustmentChangeProjectedPrincipalBalanceAmount;
    }

    /**
     * Sets the value of the adjustmentChangeProjectedPrincipalBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustmentChangeProjectedPrincipalBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.adjustmentChangeProjectedPrincipalBalanceAmount = value;
    }

    /**
     * Gets the value of the adjustmentChangeServiceFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustmentChangeServiceFeeAmount() {
        return adjustmentChangeServiceFeeAmount;
    }

    /**
     * Sets the value of the adjustmentChangeServiceFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustmentChangeServiceFeeAmount(JAXBElement<MISMOAmount> value) {
        this.adjustmentChangeServiceFeeAmount = value;
    }

    /**
     * Gets the value of the adjustmentChangeServiceFeeRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAdjustmentChangeServiceFeeRatePercent() {
        return adjustmentChangeServiceFeeRatePercent;
    }

    /**
     * Sets the value of the adjustmentChangeServiceFeeRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAdjustmentChangeServiceFeeRatePercent(JAXBElement<MISMOPercent> value) {
        this.adjustmentChangeServiceFeeRatePercent = value;
    }

    /**
     * Gets the value of the adjustmentRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentRuleEnum }{@code >}
     *     
     */
    public JAXBElement<AdjustmentRuleEnum> getAdjustmentRuleType() {
        return adjustmentRuleType;
    }

    /**
     * Sets the value of the adjustmentRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentRuleEnum }{@code >}
     *     
     */
    public void setAdjustmentRuleType(JAXBElement<AdjustmentRuleEnum> value) {
        this.adjustmentRuleType = value;
    }

    /**
     * Gets the value of the balloonResetDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBalloonResetDate() {
        return balloonResetDate;
    }

    /**
     * Sets the value of the balloonResetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBalloonResetDate(JAXBElement<MISMODate> value) {
        this.balloonResetDate = value;
    }

    /**
     * Gets the value of the carryoverRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getCarryoverRatePercent() {
        return carryoverRatePercent;
    }

    /**
     * Sets the value of the carryoverRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setCarryoverRatePercent(JAXBElement<MISMOPercent> value) {
        this.carryoverRatePercent = value;
    }

    /**
     * Gets the value of the convertibleStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvertibleStatusEnum }{@code >}
     *     
     */
    public JAXBElement<ConvertibleStatusEnum> getConvertibleStatusType() {
        return convertibleStatusType;
    }

    /**
     * Sets the value of the convertibleStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvertibleStatusEnum }{@code >}
     *     
     */
    public void setConvertibleStatusType(JAXBElement<ConvertibleStatusEnum> value) {
        this.convertibleStatusType = value;
    }

    /**
     * Gets the value of the lastRateChangeNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLastRateChangeNotificationDate() {
        return lastRateChangeNotificationDate;
    }

    /**
     * Sets the value of the lastRateChangeNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLastRateChangeNotificationDate(JAXBElement<MISMODate> value) {
        this.lastRateChangeNotificationDate = value;
    }

    /**
     * Gets the value of the latestConversionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLatestConversionEffectiveDate() {
        return latestConversionEffectiveDate;
    }

    /**
     * Sets the value of the latestConversionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLatestConversionEffectiveDate(JAXBElement<MISMODate> value) {
        this.latestConversionEffectiveDate = value;
    }

    /**
     * Gets the value of the nextConversionOptionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextConversionOptionEffectiveDate() {
        return nextConversionOptionEffectiveDate;
    }

    /**
     * Sets the value of the nextConversionOptionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextConversionOptionEffectiveDate(JAXBElement<MISMODate> value) {
        this.nextConversionOptionEffectiveDate = value;
    }

    /**
     * Gets the value of the nextConversionOptionNoticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextConversionOptionNoticeDate() {
        return nextConversionOptionNoticeDate;
    }

    /**
     * Sets the value of the nextConversionOptionNoticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextConversionOptionNoticeDate(JAXBElement<MISMODate> value) {
        this.nextConversionOptionNoticeDate = value;
    }

    /**
     * Gets the value of the nextDemandConversionOptionNoticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextDemandConversionOptionNoticeDate() {
        return nextDemandConversionOptionNoticeDate;
    }

    /**
     * Sets the value of the nextDemandConversionOptionNoticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextDemandConversionOptionNoticeDate(JAXBElement<MISMODate> value) {
        this.nextDemandConversionOptionNoticeDate = value;
    }

    /**
     * Gets the value of the nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate() {
        return nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate;
    }

    /**
     * Sets the value of the nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate(JAXBElement<MISMODate> value) {
        this.nextIgnorePrincipalAndInterestPaymentAdjustmentCapsDate = value;
    }

    /**
     * Gets the value of the nextIgnoreRateAdjustmentCapsDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextIgnoreRateAdjustmentCapsDate() {
        return nextIgnoreRateAdjustmentCapsDate;
    }

    /**
     * Sets the value of the nextIgnoreRateAdjustmentCapsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextIgnoreRateAdjustmentCapsDate(JAXBElement<MISMODate> value) {
        this.nextIgnoreRateAdjustmentCapsDate = value;
    }

    /**
     * Gets the value of the nextPrincipalAndInterestPaymentChangeEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextPrincipalAndInterestPaymentChangeEffectiveDate() {
        return nextPrincipalAndInterestPaymentChangeEffectiveDate;
    }

    /**
     * Sets the value of the nextPrincipalAndInterestPaymentChangeEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextPrincipalAndInterestPaymentChangeEffectiveDate(JAXBElement<MISMODate> value) {
        this.nextPrincipalAndInterestPaymentChangeEffectiveDate = value;
    }

    /**
     * Gets the value of the nextRateAdjustmentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextRateAdjustmentEffectiveDate() {
        return nextRateAdjustmentEffectiveDate;
    }

    /**
     * Sets the value of the nextRateAdjustmentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextRateAdjustmentEffectiveDate(JAXBElement<MISMODate> value) {
        this.nextRateAdjustmentEffectiveDate = value;
    }

    /**
     * Gets the value of the nextRateAdjustmentEffectiveNoticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNextRateAdjustmentEffectiveNoticeDate() {
        return nextRateAdjustmentEffectiveNoticeDate;
    }

    /**
     * Sets the value of the nextRateAdjustmentEffectiveNoticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNextRateAdjustmentEffectiveNoticeDate(JAXBElement<MISMODate> value) {
        this.nextRateAdjustmentEffectiveNoticeDate = value;
    }

    /**
     * Gets the value of the rateAdjustmentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getRateAdjustmentPercent() {
        return rateAdjustmentPercent;
    }

    /**
     * Sets the value of the rateAdjustmentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setRateAdjustmentPercent(JAXBElement<MISMOPercent> value) {
        this.rateAdjustmentPercent = value;
    }

    /**
     * Gets the value of the servicerARMPlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getServicerARMPlanIdentifier() {
        return servicerARMPlanIdentifier;
    }

    /**
     * Sets the value of the servicerARMPlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setServicerARMPlanIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicerARMPlanIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RATEORPAYMENTCHANGEOCCURRENCEEXTENSION }
     *     
     */
    public RATEORPAYMENTCHANGEOCCURRENCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RATEORPAYMENTCHANGEOCCURRENCEEXTENSION }
     *     
     */
    public void setEXTENSION(RATEORPAYMENTCHANGEOCCURRENCEEXTENSION value) {
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
