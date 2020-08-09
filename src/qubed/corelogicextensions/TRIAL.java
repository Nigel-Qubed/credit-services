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
 * Information about the trail associated with a workout.
 * 
 * <p>Java class for TRIAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRIAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HardshipAffidavitWaivedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PriorToTrialPlanExpectedPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServicerAttestedLastTrialPaymentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPaymentCurrentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPeriodTotalPrincipalAppliedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TrialPlanAgreementSignedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TrialPlanCommitmentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TrialPlanEstimatedPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TrialPlanExtendableIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPlanExtendedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPlanExtendedMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="TrialPlanExtensionAdditionalPaymentRequiredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPlanFirstPaymentReceivedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TrialPlanIncomeVerificationWaivedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TrialPlanInterestAppliedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TrialPlanPaymentRemainingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TrialPlanPaymentsReceivedCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="TrialPlanScheduledPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TrialPlanUnsuccessfulReasonType" type="{http://www.mismo.org/residential/2009/schemas}TrialPlanUnsuccessfulReasonEnum" minOccurs="0"/>
 *         &lt;element name="TrialPlanUnsuccessfulReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TRIAL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TRIAL", propOrder = {
    "hardshipAffidavitWaivedIndicator",
    "priorToTrialPlanExpectedPaymentAmount",
    "servicerAttestedLastTrialPaymentIndicator",
    "trialPaymentCurrentIndicator",
    "trialPeriodTotalPrincipalAppliedAmount",
    "trialPlanAgreementSignedDate",
    "trialPlanCommitmentDate",
    "trialPlanEstimatedPaymentAmount",
    "trialPlanExtendableIndicator",
    "trialPlanExtendedIndicator",
    "trialPlanExtendedMonthsCount",
    "trialPlanExtensionAdditionalPaymentRequiredIndicator",
    "trialPlanFirstPaymentReceivedDate",
    "trialPlanIncomeVerificationWaivedIndicator",
    "trialPlanInterestAppliedAmount",
    "trialPlanPaymentRemainingAmount",
    "trialPlanPaymentsReceivedCount",
    "trialPlanScheduledPaymentAmount",
    "trialPlanUnsuccessfulReasonType",
    "trialPlanUnsuccessfulReasonTypeOtherDescription",
    "extension"
})
public class TRIAL {

    @XmlElementRef(name = "HardshipAffidavitWaivedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hardshipAffidavitWaivedIndicator;
    @XmlElementRef(name = "PriorToTrialPlanExpectedPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> priorToTrialPlanExpectedPaymentAmount;
    @XmlElementRef(name = "ServicerAttestedLastTrialPaymentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> servicerAttestedLastTrialPaymentIndicator;
    @XmlElementRef(name = "TrialPaymentCurrentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> trialPaymentCurrentIndicator;
    @XmlElementRef(name = "TrialPeriodTotalPrincipalAppliedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> trialPeriodTotalPrincipalAppliedAmount;
    @XmlElementRef(name = "TrialPlanAgreementSignedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> trialPlanAgreementSignedDate;
    @XmlElementRef(name = "TrialPlanCommitmentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> trialPlanCommitmentDate;
    @XmlElementRef(name = "TrialPlanEstimatedPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> trialPlanEstimatedPaymentAmount;
    @XmlElementRef(name = "TrialPlanExtendableIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> trialPlanExtendableIndicator;
    @XmlElementRef(name = "TrialPlanExtendedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> trialPlanExtendedIndicator;
    @XmlElementRef(name = "TrialPlanExtendedMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> trialPlanExtendedMonthsCount;
    @XmlElementRef(name = "TrialPlanExtensionAdditionalPaymentRequiredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> trialPlanExtensionAdditionalPaymentRequiredIndicator;
    @XmlElementRef(name = "TrialPlanFirstPaymentReceivedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> trialPlanFirstPaymentReceivedDate;
    @XmlElementRef(name = "TrialPlanIncomeVerificationWaivedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> trialPlanIncomeVerificationWaivedIndicator;
    @XmlElementRef(name = "TrialPlanInterestAppliedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> trialPlanInterestAppliedAmount;
    @XmlElementRef(name = "TrialPlanPaymentRemainingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> trialPlanPaymentRemainingAmount;
    @XmlElementRef(name = "TrialPlanPaymentsReceivedCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> trialPlanPaymentsReceivedCount;
    @XmlElementRef(name = "TrialPlanScheduledPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> trialPlanScheduledPaymentAmount;
    @XmlElementRef(name = "TrialPlanUnsuccessfulReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<TrialPlanUnsuccessfulReasonEnum> trialPlanUnsuccessfulReasonType;
    @XmlElementRef(name = "TrialPlanUnsuccessfulReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> trialPlanUnsuccessfulReasonTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected TRIALEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the hardshipAffidavitWaivedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHardshipAffidavitWaivedIndicator() {
        return hardshipAffidavitWaivedIndicator;
    }

    /**
     * Sets the value of the hardshipAffidavitWaivedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHardshipAffidavitWaivedIndicator(JAXBElement<MISMOIndicator> value) {
        this.hardshipAffidavitWaivedIndicator = value;
    }

    /**
     * Gets the value of the priorToTrialPlanExpectedPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPriorToTrialPlanExpectedPaymentAmount() {
        return priorToTrialPlanExpectedPaymentAmount;
    }

    /**
     * Sets the value of the priorToTrialPlanExpectedPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPriorToTrialPlanExpectedPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.priorToTrialPlanExpectedPaymentAmount = value;
    }

    /**
     * Gets the value of the servicerAttestedLastTrialPaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getServicerAttestedLastTrialPaymentIndicator() {
        return servicerAttestedLastTrialPaymentIndicator;
    }

    /**
     * Sets the value of the servicerAttestedLastTrialPaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setServicerAttestedLastTrialPaymentIndicator(JAXBElement<MISMOIndicator> value) {
        this.servicerAttestedLastTrialPaymentIndicator = value;
    }

    /**
     * Gets the value of the trialPaymentCurrentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTrialPaymentCurrentIndicator() {
        return trialPaymentCurrentIndicator;
    }

    /**
     * Sets the value of the trialPaymentCurrentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTrialPaymentCurrentIndicator(JAXBElement<MISMOIndicator> value) {
        this.trialPaymentCurrentIndicator = value;
    }

    /**
     * Gets the value of the trialPeriodTotalPrincipalAppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTrialPeriodTotalPrincipalAppliedAmount() {
        return trialPeriodTotalPrincipalAppliedAmount;
    }

    /**
     * Sets the value of the trialPeriodTotalPrincipalAppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTrialPeriodTotalPrincipalAppliedAmount(JAXBElement<MISMOAmount> value) {
        this.trialPeriodTotalPrincipalAppliedAmount = value;
    }

    /**
     * Gets the value of the trialPlanAgreementSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getTrialPlanAgreementSignedDate() {
        return trialPlanAgreementSignedDate;
    }

    /**
     * Sets the value of the trialPlanAgreementSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setTrialPlanAgreementSignedDate(JAXBElement<MISMODate> value) {
        this.trialPlanAgreementSignedDate = value;
    }

    /**
     * Gets the value of the trialPlanCommitmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getTrialPlanCommitmentDate() {
        return trialPlanCommitmentDate;
    }

    /**
     * Sets the value of the trialPlanCommitmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setTrialPlanCommitmentDate(JAXBElement<MISMODate> value) {
        this.trialPlanCommitmentDate = value;
    }

    /**
     * Gets the value of the trialPlanEstimatedPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTrialPlanEstimatedPaymentAmount() {
        return trialPlanEstimatedPaymentAmount;
    }

    /**
     * Sets the value of the trialPlanEstimatedPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTrialPlanEstimatedPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.trialPlanEstimatedPaymentAmount = value;
    }

    /**
     * Gets the value of the trialPlanExtendableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTrialPlanExtendableIndicator() {
        return trialPlanExtendableIndicator;
    }

    /**
     * Sets the value of the trialPlanExtendableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTrialPlanExtendableIndicator(JAXBElement<MISMOIndicator> value) {
        this.trialPlanExtendableIndicator = value;
    }

    /**
     * Gets the value of the trialPlanExtendedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTrialPlanExtendedIndicator() {
        return trialPlanExtendedIndicator;
    }

    /**
     * Sets the value of the trialPlanExtendedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTrialPlanExtendedIndicator(JAXBElement<MISMOIndicator> value) {
        this.trialPlanExtendedIndicator = value;
    }

    /**
     * Gets the value of the trialPlanExtendedMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getTrialPlanExtendedMonthsCount() {
        return trialPlanExtendedMonthsCount;
    }

    /**
     * Sets the value of the trialPlanExtendedMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setTrialPlanExtendedMonthsCount(JAXBElement<MISMOCount> value) {
        this.trialPlanExtendedMonthsCount = value;
    }

    /**
     * Gets the value of the trialPlanExtensionAdditionalPaymentRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTrialPlanExtensionAdditionalPaymentRequiredIndicator() {
        return trialPlanExtensionAdditionalPaymentRequiredIndicator;
    }

    /**
     * Sets the value of the trialPlanExtensionAdditionalPaymentRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTrialPlanExtensionAdditionalPaymentRequiredIndicator(JAXBElement<MISMOIndicator> value) {
        this.trialPlanExtensionAdditionalPaymentRequiredIndicator = value;
    }

    /**
     * Gets the value of the trialPlanFirstPaymentReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getTrialPlanFirstPaymentReceivedDate() {
        return trialPlanFirstPaymentReceivedDate;
    }

    /**
     * Sets the value of the trialPlanFirstPaymentReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setTrialPlanFirstPaymentReceivedDate(JAXBElement<MISMODate> value) {
        this.trialPlanFirstPaymentReceivedDate = value;
    }

    /**
     * Gets the value of the trialPlanIncomeVerificationWaivedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTrialPlanIncomeVerificationWaivedIndicator() {
        return trialPlanIncomeVerificationWaivedIndicator;
    }

    /**
     * Sets the value of the trialPlanIncomeVerificationWaivedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTrialPlanIncomeVerificationWaivedIndicator(JAXBElement<MISMOIndicator> value) {
        this.trialPlanIncomeVerificationWaivedIndicator = value;
    }

    /**
     * Gets the value of the trialPlanInterestAppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTrialPlanInterestAppliedAmount() {
        return trialPlanInterestAppliedAmount;
    }

    /**
     * Sets the value of the trialPlanInterestAppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTrialPlanInterestAppliedAmount(JAXBElement<MISMOAmount> value) {
        this.trialPlanInterestAppliedAmount = value;
    }

    /**
     * Gets the value of the trialPlanPaymentRemainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTrialPlanPaymentRemainingAmount() {
        return trialPlanPaymentRemainingAmount;
    }

    /**
     * Sets the value of the trialPlanPaymentRemainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTrialPlanPaymentRemainingAmount(JAXBElement<MISMOAmount> value) {
        this.trialPlanPaymentRemainingAmount = value;
    }

    /**
     * Gets the value of the trialPlanPaymentsReceivedCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getTrialPlanPaymentsReceivedCount() {
        return trialPlanPaymentsReceivedCount;
    }

    /**
     * Sets the value of the trialPlanPaymentsReceivedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setTrialPlanPaymentsReceivedCount(JAXBElement<MISMOCount> value) {
        this.trialPlanPaymentsReceivedCount = value;
    }

    /**
     * Gets the value of the trialPlanScheduledPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTrialPlanScheduledPaymentAmount() {
        return trialPlanScheduledPaymentAmount;
    }

    /**
     * Sets the value of the trialPlanScheduledPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTrialPlanScheduledPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.trialPlanScheduledPaymentAmount = value;
    }

    /**
     * Gets the value of the trialPlanUnsuccessfulReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrialPlanUnsuccessfulReasonEnum }{@code >}
     *     
     */
    public JAXBElement<TrialPlanUnsuccessfulReasonEnum> getTrialPlanUnsuccessfulReasonType() {
        return trialPlanUnsuccessfulReasonType;
    }

    /**
     * Sets the value of the trialPlanUnsuccessfulReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrialPlanUnsuccessfulReasonEnum }{@code >}
     *     
     */
    public void setTrialPlanUnsuccessfulReasonType(JAXBElement<TrialPlanUnsuccessfulReasonEnum> value) {
        this.trialPlanUnsuccessfulReasonType = value;
    }

    /**
     * Gets the value of the trialPlanUnsuccessfulReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTrialPlanUnsuccessfulReasonTypeOtherDescription() {
        return trialPlanUnsuccessfulReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the trialPlanUnsuccessfulReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTrialPlanUnsuccessfulReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.trialPlanUnsuccessfulReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TRIALEXTENSION }
     *     
     */
    public TRIALEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIALEXTENSION }
     *     
     */
    public void setEXTENSION(TRIALEXTENSION value) {
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
