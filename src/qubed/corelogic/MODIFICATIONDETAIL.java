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
 * <p>Java class for MODIFICATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODIFICATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BorrowerModificationClosingCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ForbearancePrincipalReductionAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InterestBearingUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InterestForgivenessAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanModificationActionType" type="{http://www.mismo.org/residential/2009/schemas}LoanModificationActionEnum" minOccurs="0"/>
 *         &lt;element name="LoanModificationActionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanModificationEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationAdditionalEndorsementIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ModificationAgreementAcceptanceCutoffDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationAgreementReceivedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ModificationEstimatedRequestProcessingDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ModificationSignedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationSubmissionCutoffDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationTrialPlanEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationTrialPlanEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ModificationTrialPlanReturnOfDocumentsCutoffDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NonInterestBearingUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PreModificationInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="PreModificationPrincipalAndInterestPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PreModificationTotalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PreModificationUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrincipalForgivenessAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrincipalReductionOfUnsecuredAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReimbursableServicerModificationCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServicerAttestsOnSubmissionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ServicerOfficerModificationSignatureDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TotalForgivenessAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TotalStepCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MODIFICATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MODIFICATION_DETAIL", propOrder = {
    "borrowerModificationClosingCostAmount",
    "forbearancePrincipalReductionAmount",
    "interestBearingUPBAmount",
    "interestForgivenessAmount",
    "loanModificationActionType",
    "loanModificationActionTypeOtherDescription",
    "loanModificationEffectiveDate",
    "modificationAdditionalEndorsementIndicator",
    "modificationAgreementAcceptanceCutoffDate",
    "modificationAgreementReceivedIndicator",
    "modificationEstimatedRequestProcessingDaysCount",
    "modificationSignedDate",
    "modificationSubmissionCutoffDate",
    "modificationTrialPlanEffectiveDate",
    "modificationTrialPlanEndDate",
    "modificationTrialPlanReturnOfDocumentsCutoffDate",
    "nonInterestBearingUPBAmount",
    "preModificationInterestRatePercent",
    "preModificationPrincipalAndInterestPaymentAmount",
    "preModificationTotalPaymentAmount",
    "preModificationUPBAmount",
    "principalForgivenessAmount",
    "principalReductionOfUnsecuredAmount",
    "reimbursableServicerModificationCostAmount",
    "servicerAttestsOnSubmissionIndicator",
    "servicerOfficerModificationSignatureDate",
    "totalForgivenessAmount",
    "totalStepCount",
    "extension"
})
public class MODIFICATIONDETAIL {

    @XmlElementRef(name = "BorrowerModificationClosingCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> borrowerModificationClosingCostAmount;
    @XmlElementRef(name = "ForbearancePrincipalReductionAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> forbearancePrincipalReductionAmount;
    @XmlElementRef(name = "InterestBearingUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> interestBearingUPBAmount;
    @XmlElementRef(name = "InterestForgivenessAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> interestForgivenessAmount;
    @XmlElementRef(name = "LoanModificationActionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanModificationActionEnum> loanModificationActionType;
    @XmlElementRef(name = "LoanModificationActionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanModificationActionTypeOtherDescription;
    @XmlElementRef(name = "LoanModificationEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanModificationEffectiveDate;
    @XmlElementRef(name = "ModificationAdditionalEndorsementIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> modificationAdditionalEndorsementIndicator;
    @XmlElementRef(name = "ModificationAgreementAcceptanceCutoffDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationAgreementAcceptanceCutoffDate;
    @XmlElementRef(name = "ModificationAgreementReceivedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> modificationAgreementReceivedIndicator;
    @XmlElementRef(name = "ModificationEstimatedRequestProcessingDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> modificationEstimatedRequestProcessingDaysCount;
    @XmlElementRef(name = "ModificationSignedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationSignedDate;
    @XmlElementRef(name = "ModificationSubmissionCutoffDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationSubmissionCutoffDate;
    @XmlElementRef(name = "ModificationTrialPlanEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationTrialPlanEffectiveDate;
    @XmlElementRef(name = "ModificationTrialPlanEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationTrialPlanEndDate;
    @XmlElementRef(name = "ModificationTrialPlanReturnOfDocumentsCutoffDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> modificationTrialPlanReturnOfDocumentsCutoffDate;
    @XmlElementRef(name = "NonInterestBearingUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> nonInterestBearingUPBAmount;
    @XmlElementRef(name = "PreModificationInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> preModificationInterestRatePercent;
    @XmlElementRef(name = "PreModificationPrincipalAndInterestPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> preModificationPrincipalAndInterestPaymentAmount;
    @XmlElementRef(name = "PreModificationTotalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> preModificationTotalPaymentAmount;
    @XmlElementRef(name = "PreModificationUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> preModificationUPBAmount;
    @XmlElementRef(name = "PrincipalForgivenessAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> principalForgivenessAmount;
    @XmlElementRef(name = "PrincipalReductionOfUnsecuredAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> principalReductionOfUnsecuredAmount;
    @XmlElementRef(name = "ReimbursableServicerModificationCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reimbursableServicerModificationCostAmount;
    @XmlElementRef(name = "ServicerAttestsOnSubmissionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> servicerAttestsOnSubmissionIndicator;
    @XmlElementRef(name = "ServicerOfficerModificationSignatureDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> servicerOfficerModificationSignatureDate;
    @XmlElementRef(name = "TotalForgivenessAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> totalForgivenessAmount;
    @XmlElementRef(name = "TotalStepCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> totalStepCount;
    @XmlElement(name = "EXTENSION")
    protected MODIFICATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the borrowerModificationClosingCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBorrowerModificationClosingCostAmount() {
        return borrowerModificationClosingCostAmount;
    }

    /**
     * Sets the value of the borrowerModificationClosingCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBorrowerModificationClosingCostAmount(JAXBElement<MISMOAmount> value) {
        this.borrowerModificationClosingCostAmount = value;
    }

    /**
     * Gets the value of the forbearancePrincipalReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getForbearancePrincipalReductionAmount() {
        return forbearancePrincipalReductionAmount;
    }

    /**
     * Sets the value of the forbearancePrincipalReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setForbearancePrincipalReductionAmount(JAXBElement<MISMOAmount> value) {
        this.forbearancePrincipalReductionAmount = value;
    }

    /**
     * Gets the value of the interestBearingUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInterestBearingUPBAmount() {
        return interestBearingUPBAmount;
    }

    /**
     * Sets the value of the interestBearingUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInterestBearingUPBAmount(JAXBElement<MISMOAmount> value) {
        this.interestBearingUPBAmount = value;
    }

    /**
     * Gets the value of the interestForgivenessAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInterestForgivenessAmount() {
        return interestForgivenessAmount;
    }

    /**
     * Sets the value of the interestForgivenessAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInterestForgivenessAmount(JAXBElement<MISMOAmount> value) {
        this.interestForgivenessAmount = value;
    }

    /**
     * Gets the value of the loanModificationActionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanModificationActionEnum }{@code >}
     *     
     */
    public JAXBElement<LoanModificationActionEnum> getLoanModificationActionType() {
        return loanModificationActionType;
    }

    /**
     * Sets the value of the loanModificationActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanModificationActionEnum }{@code >}
     *     
     */
    public void setLoanModificationActionType(JAXBElement<LoanModificationActionEnum> value) {
        this.loanModificationActionType = value;
    }

    /**
     * Gets the value of the loanModificationActionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanModificationActionTypeOtherDescription() {
        return loanModificationActionTypeOtherDescription;
    }

    /**
     * Sets the value of the loanModificationActionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanModificationActionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanModificationActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanModificationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanModificationEffectiveDate() {
        return loanModificationEffectiveDate;
    }

    /**
     * Sets the value of the loanModificationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanModificationEffectiveDate(JAXBElement<MISMODate> value) {
        this.loanModificationEffectiveDate = value;
    }

    /**
     * Gets the value of the modificationAdditionalEndorsementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getModificationAdditionalEndorsementIndicator() {
        return modificationAdditionalEndorsementIndicator;
    }

    /**
     * Sets the value of the modificationAdditionalEndorsementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setModificationAdditionalEndorsementIndicator(JAXBElement<MISMOIndicator> value) {
        this.modificationAdditionalEndorsementIndicator = value;
    }

    /**
     * Gets the value of the modificationAgreementAcceptanceCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationAgreementAcceptanceCutoffDate() {
        return modificationAgreementAcceptanceCutoffDate;
    }

    /**
     * Sets the value of the modificationAgreementAcceptanceCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationAgreementAcceptanceCutoffDate(JAXBElement<MISMODate> value) {
        this.modificationAgreementAcceptanceCutoffDate = value;
    }

    /**
     * Gets the value of the modificationAgreementReceivedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getModificationAgreementReceivedIndicator() {
        return modificationAgreementReceivedIndicator;
    }

    /**
     * Sets the value of the modificationAgreementReceivedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setModificationAgreementReceivedIndicator(JAXBElement<MISMOIndicator> value) {
        this.modificationAgreementReceivedIndicator = value;
    }

    /**
     * Gets the value of the modificationEstimatedRequestProcessingDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getModificationEstimatedRequestProcessingDaysCount() {
        return modificationEstimatedRequestProcessingDaysCount;
    }

    /**
     * Sets the value of the modificationEstimatedRequestProcessingDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setModificationEstimatedRequestProcessingDaysCount(JAXBElement<MISMOCount> value) {
        this.modificationEstimatedRequestProcessingDaysCount = value;
    }

    /**
     * Gets the value of the modificationSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationSignedDate() {
        return modificationSignedDate;
    }

    /**
     * Sets the value of the modificationSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationSignedDate(JAXBElement<MISMODate> value) {
        this.modificationSignedDate = value;
    }

    /**
     * Gets the value of the modificationSubmissionCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationSubmissionCutoffDate() {
        return modificationSubmissionCutoffDate;
    }

    /**
     * Sets the value of the modificationSubmissionCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationSubmissionCutoffDate(JAXBElement<MISMODate> value) {
        this.modificationSubmissionCutoffDate = value;
    }

    /**
     * Gets the value of the modificationTrialPlanEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationTrialPlanEffectiveDate() {
        return modificationTrialPlanEffectiveDate;
    }

    /**
     * Sets the value of the modificationTrialPlanEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationTrialPlanEffectiveDate(JAXBElement<MISMODate> value) {
        this.modificationTrialPlanEffectiveDate = value;
    }

    /**
     * Gets the value of the modificationTrialPlanEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationTrialPlanEndDate() {
        return modificationTrialPlanEndDate;
    }

    /**
     * Sets the value of the modificationTrialPlanEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationTrialPlanEndDate(JAXBElement<MISMODate> value) {
        this.modificationTrialPlanEndDate = value;
    }

    /**
     * Gets the value of the modificationTrialPlanReturnOfDocumentsCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getModificationTrialPlanReturnOfDocumentsCutoffDate() {
        return modificationTrialPlanReturnOfDocumentsCutoffDate;
    }

    /**
     * Sets the value of the modificationTrialPlanReturnOfDocumentsCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setModificationTrialPlanReturnOfDocumentsCutoffDate(JAXBElement<MISMODate> value) {
        this.modificationTrialPlanReturnOfDocumentsCutoffDate = value;
    }

    /**
     * Gets the value of the nonInterestBearingUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getNonInterestBearingUPBAmount() {
        return nonInterestBearingUPBAmount;
    }

    /**
     * Sets the value of the nonInterestBearingUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setNonInterestBearingUPBAmount(JAXBElement<MISMOAmount> value) {
        this.nonInterestBearingUPBAmount = value;
    }

    /**
     * Gets the value of the preModificationInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getPreModificationInterestRatePercent() {
        return preModificationInterestRatePercent;
    }

    /**
     * Sets the value of the preModificationInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setPreModificationInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.preModificationInterestRatePercent = value;
    }

    /**
     * Gets the value of the preModificationPrincipalAndInterestPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPreModificationPrincipalAndInterestPaymentAmount() {
        return preModificationPrincipalAndInterestPaymentAmount;
    }

    /**
     * Sets the value of the preModificationPrincipalAndInterestPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPreModificationPrincipalAndInterestPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.preModificationPrincipalAndInterestPaymentAmount = value;
    }

    /**
     * Gets the value of the preModificationTotalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPreModificationTotalPaymentAmount() {
        return preModificationTotalPaymentAmount;
    }

    /**
     * Sets the value of the preModificationTotalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPreModificationTotalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.preModificationTotalPaymentAmount = value;
    }

    /**
     * Gets the value of the preModificationUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPreModificationUPBAmount() {
        return preModificationUPBAmount;
    }

    /**
     * Sets the value of the preModificationUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPreModificationUPBAmount(JAXBElement<MISMOAmount> value) {
        this.preModificationUPBAmount = value;
    }

    /**
     * Gets the value of the principalForgivenessAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrincipalForgivenessAmount() {
        return principalForgivenessAmount;
    }

    /**
     * Sets the value of the principalForgivenessAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrincipalForgivenessAmount(JAXBElement<MISMOAmount> value) {
        this.principalForgivenessAmount = value;
    }

    /**
     * Gets the value of the principalReductionOfUnsecuredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrincipalReductionOfUnsecuredAmount() {
        return principalReductionOfUnsecuredAmount;
    }

    /**
     * Sets the value of the principalReductionOfUnsecuredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrincipalReductionOfUnsecuredAmount(JAXBElement<MISMOAmount> value) {
        this.principalReductionOfUnsecuredAmount = value;
    }

    /**
     * Gets the value of the reimbursableServicerModificationCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReimbursableServicerModificationCostAmount() {
        return reimbursableServicerModificationCostAmount;
    }

    /**
     * Sets the value of the reimbursableServicerModificationCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReimbursableServicerModificationCostAmount(JAXBElement<MISMOAmount> value) {
        this.reimbursableServicerModificationCostAmount = value;
    }

    /**
     * Gets the value of the servicerAttestsOnSubmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getServicerAttestsOnSubmissionIndicator() {
        return servicerAttestsOnSubmissionIndicator;
    }

    /**
     * Sets the value of the servicerAttestsOnSubmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setServicerAttestsOnSubmissionIndicator(JAXBElement<MISMOIndicator> value) {
        this.servicerAttestsOnSubmissionIndicator = value;
    }

    /**
     * Gets the value of the servicerOfficerModificationSignatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServicerOfficerModificationSignatureDate() {
        return servicerOfficerModificationSignatureDate;
    }

    /**
     * Sets the value of the servicerOfficerModificationSignatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServicerOfficerModificationSignatureDate(JAXBElement<MISMODate> value) {
        this.servicerOfficerModificationSignatureDate = value;
    }

    /**
     * Gets the value of the totalForgivenessAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTotalForgivenessAmount() {
        return totalForgivenessAmount;
    }

    /**
     * Sets the value of the totalForgivenessAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTotalForgivenessAmount(JAXBElement<MISMOAmount> value) {
        this.totalForgivenessAmount = value;
    }

    /**
     * Gets the value of the totalStepCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getTotalStepCount() {
        return totalStepCount;
    }

    /**
     * Sets the value of the totalStepCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setTotalStepCount(JAXBElement<MISMOCount> value) {
        this.totalStepCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MODIFICATIONDETAILEXTENSION }
     *     
     */
    public MODIFICATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODIFICATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MODIFICATIONDETAILEXTENSION value) {
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
