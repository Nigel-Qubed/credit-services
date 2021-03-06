//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LOAN_FEATURES")
public class LOANFEATURES {

    @XmlAttribute(name = "NameDocumentsDrawnInType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameDocumentsDrawnInType;
    @XmlAttribute(name = "AssumabilityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assumabilityIndicator;
    @XmlAttribute(name = "BalloonIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String balloonIndicator;
    @XmlAttribute(name = "BalloonLoanMaturityTermMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String balloonLoanMaturityTermMonths;
    @XmlAttribute(name = "BuydownTemporarySubsidyIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buydownTemporarySubsidyIndicator;
    @XmlAttribute(name = "CounselingConfirmationIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String counselingConfirmationIndicator;
    @XmlAttribute(name = "DownPaymentOptionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String downPaymentOptionType;
    @XmlAttribute(name = "EscrowWaiverIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String escrowWaiverIndicator;
    @XmlAttribute(name = "FREOfferingIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String freOfferingIdentifier;
    @XmlAttribute(name = "FNMProductPlanIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmProductPlanIdentifier;
    @XmlAttribute(name = "FNMProductPlanIndentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmProductPlanIndentifier;
    @XmlAttribute(name = "GSEProjectClassificationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gseProjectClassificationType;
    @XmlAttribute(name = "GSEPropertyType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gsePropertyType;
    @XmlAttribute(name = "HELOCMaximumBalanceAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String helocMaximumBalanceAmount;
    @XmlAttribute(name = "HELOCInitialAdvanceAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String helocInitialAdvanceAmount;
    @XmlAttribute(name = "InterestOnlyTerm")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String interestOnlyTerm;
    @XmlAttribute(name = "LenderSelfInsuredIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lenderSelfInsuredIndicator;
    @XmlAttribute(name = "LienPriorityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lienPriorityType;
    @XmlAttribute(name = "LoanDocumentationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loanDocumentationType;
    @XmlAttribute(name = "LoanRepaymentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loanRepaymentType;
    @XmlAttribute(name = "LoanScheduledClosingDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String loanScheduledClosingDate;
    @XmlAttribute(name = "MICertificationStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String miCertificationStatusType;
    @XmlAttribute(name = "MICoveragePercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String miCoveragePercent;
    @XmlAttribute(name = "MICompanyNameType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String miCompanyNameType;
    @XmlAttribute(name = "NegativeAmortizationLimitPercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String negativeAmortizationLimitPercent;
    @XmlAttribute(name = "PaymentFrequencyType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentFrequencyType;
    @XmlAttribute(name = "PrepaymentPenaltyIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prepaymentPenaltyIndicator;
    @XmlAttribute(name = "FullPrepaymentPenaltyOptionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fullPrepaymentPenaltyOptionType;
    @XmlAttribute(name = "PrepaymentPenaltyTermMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prepaymentPenaltyTermMonths;
    @XmlAttribute(name = "PrepaymentRestrictionIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prepaymentRestrictionIndicator;
    @XmlAttribute(name = "ProductDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productDescription;
    @XmlAttribute(name = "ProductName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productName;
    @XmlAttribute(name = "ScheduledFirstPaymentDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scheduledFirstPaymentDate;
    @XmlAttribute(name = "LoanClosingStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loanClosingStatusType;
    @XmlAttribute(name = "ServicingTransferStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String servicingTransferStatusType;

    /**
     * Gets the value of the nameDocumentsDrawnInType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDocumentsDrawnInType() {
        return nameDocumentsDrawnInType;
    }

    /**
     * Sets the value of the nameDocumentsDrawnInType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDocumentsDrawnInType(String value) {
        this.nameDocumentsDrawnInType = value;
    }

    /**
     * Gets the value of the assumabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssumabilityIndicator() {
        return assumabilityIndicator;
    }

    /**
     * Sets the value of the assumabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssumabilityIndicator(String value) {
        this.assumabilityIndicator = value;
    }

    /**
     * Gets the value of the balloonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalloonIndicator() {
        return balloonIndicator;
    }

    /**
     * Sets the value of the balloonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalloonIndicator(String value) {
        this.balloonIndicator = value;
    }

    /**
     * Gets the value of the balloonLoanMaturityTermMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalloonLoanMaturityTermMonths() {
        return balloonLoanMaturityTermMonths;
    }

    /**
     * Sets the value of the balloonLoanMaturityTermMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalloonLoanMaturityTermMonths(String value) {
        this.balloonLoanMaturityTermMonths = value;
    }

    /**
     * Gets the value of the buydownTemporarySubsidyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuydownTemporarySubsidyIndicator() {
        return buydownTemporarySubsidyIndicator;
    }

    /**
     * Sets the value of the buydownTemporarySubsidyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuydownTemporarySubsidyIndicator(String value) {
        this.buydownTemporarySubsidyIndicator = value;
    }

    /**
     * Gets the value of the counselingConfirmationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounselingConfirmationIndicator() {
        return counselingConfirmationIndicator;
    }

    /**
     * Sets the value of the counselingConfirmationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounselingConfirmationIndicator(String value) {
        this.counselingConfirmationIndicator = value;
    }

    /**
     * Gets the value of the downPaymentOptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPaymentOptionType() {
        return downPaymentOptionType;
    }

    /**
     * Sets the value of the downPaymentOptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPaymentOptionType(String value) {
        this.downPaymentOptionType = value;
    }

    /**
     * Gets the value of the escrowWaiverIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscrowWaiverIndicator() {
        return escrowWaiverIndicator;
    }

    /**
     * Sets the value of the escrowWaiverIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscrowWaiverIndicator(String value) {
        this.escrowWaiverIndicator = value;
    }

    /**
     * Gets the value of the freOfferingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREOfferingIdentifier() {
        return freOfferingIdentifier;
    }

    /**
     * Sets the value of the freOfferingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREOfferingIdentifier(String value) {
        this.freOfferingIdentifier = value;
    }

    /**
     * Gets the value of the fnmProductPlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMProductPlanIdentifier() {
        return fnmProductPlanIdentifier;
    }

    /**
     * Sets the value of the fnmProductPlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMProductPlanIdentifier(String value) {
        this.fnmProductPlanIdentifier = value;
    }

    /**
     * Gets the value of the fnmProductPlanIndentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMProductPlanIndentifier() {
        return fnmProductPlanIndentifier;
    }

    /**
     * Sets the value of the fnmProductPlanIndentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMProductPlanIndentifier(String value) {
        this.fnmProductPlanIndentifier = value;
    }

    /**
     * Gets the value of the gseProjectClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSEProjectClassificationType() {
        return gseProjectClassificationType;
    }

    /**
     * Sets the value of the gseProjectClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSEProjectClassificationType(String value) {
        this.gseProjectClassificationType = value;
    }

    /**
     * Gets the value of the gsePropertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSEPropertyType() {
        return gsePropertyType;
    }

    /**
     * Sets the value of the gsePropertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSEPropertyType(String value) {
        this.gsePropertyType = value;
    }

    /**
     * Gets the value of the helocMaximumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHELOCMaximumBalanceAmount() {
        return helocMaximumBalanceAmount;
    }

    /**
     * Sets the value of the helocMaximumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHELOCMaximumBalanceAmount(String value) {
        this.helocMaximumBalanceAmount = value;
    }

    /**
     * Gets the value of the helocInitialAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHELOCInitialAdvanceAmount() {
        return helocInitialAdvanceAmount;
    }

    /**
     * Sets the value of the helocInitialAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHELOCInitialAdvanceAmount(String value) {
        this.helocInitialAdvanceAmount = value;
    }

    /**
     * Gets the value of the interestOnlyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestOnlyTerm() {
        return interestOnlyTerm;
    }

    /**
     * Sets the value of the interestOnlyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestOnlyTerm(String value) {
        this.interestOnlyTerm = value;
    }

    /**
     * Gets the value of the lenderSelfInsuredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderSelfInsuredIndicator() {
        return lenderSelfInsuredIndicator;
    }

    /**
     * Sets the value of the lenderSelfInsuredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderSelfInsuredIndicator(String value) {
        this.lenderSelfInsuredIndicator = value;
    }

    /**
     * Gets the value of the lienPriorityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienPriorityType() {
        return lienPriorityType;
    }

    /**
     * Sets the value of the lienPriorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienPriorityType(String value) {
        this.lienPriorityType = value;
    }

    /**
     * Gets the value of the loanDocumentationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDocumentationType() {
        return loanDocumentationType;
    }

    /**
     * Sets the value of the loanDocumentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDocumentationType(String value) {
        this.loanDocumentationType = value;
    }

    /**
     * Gets the value of the loanRepaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanRepaymentType() {
        return loanRepaymentType;
    }

    /**
     * Sets the value of the loanRepaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanRepaymentType(String value) {
        this.loanRepaymentType = value;
    }

    /**
     * Gets the value of the loanScheduledClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanScheduledClosingDate() {
        return loanScheduledClosingDate;
    }

    /**
     * Sets the value of the loanScheduledClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanScheduledClosingDate(String value) {
        this.loanScheduledClosingDate = value;
    }

    /**
     * Gets the value of the miCertificationStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICertificationStatusType() {
        return miCertificationStatusType;
    }

    /**
     * Sets the value of the miCertificationStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICertificationStatusType(String value) {
        this.miCertificationStatusType = value;
    }

    /**
     * Gets the value of the miCoveragePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICoveragePercent() {
        return miCoveragePercent;
    }

    /**
     * Sets the value of the miCoveragePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICoveragePercent(String value) {
        this.miCoveragePercent = value;
    }

    /**
     * Gets the value of the miCompanyNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICompanyNameType() {
        return miCompanyNameType;
    }

    /**
     * Sets the value of the miCompanyNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICompanyNameType(String value) {
        this.miCompanyNameType = value;
    }

    /**
     * Gets the value of the negativeAmortizationLimitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeAmortizationLimitPercent() {
        return negativeAmortizationLimitPercent;
    }

    /**
     * Sets the value of the negativeAmortizationLimitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeAmortizationLimitPercent(String value) {
        this.negativeAmortizationLimitPercent = value;
    }

    /**
     * Gets the value of the paymentFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFrequencyType() {
        return paymentFrequencyType;
    }

    /**
     * Sets the value of the paymentFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFrequencyType(String value) {
        this.paymentFrequencyType = value;
    }

    /**
     * Gets the value of the prepaymentPenaltyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaymentPenaltyIndicator() {
        return prepaymentPenaltyIndicator;
    }

    /**
     * Sets the value of the prepaymentPenaltyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaymentPenaltyIndicator(String value) {
        this.prepaymentPenaltyIndicator = value;
    }

    /**
     * Gets the value of the fullPrepaymentPenaltyOptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPrepaymentPenaltyOptionType() {
        return fullPrepaymentPenaltyOptionType;
    }

    /**
     * Sets the value of the fullPrepaymentPenaltyOptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPrepaymentPenaltyOptionType(String value) {
        this.fullPrepaymentPenaltyOptionType = value;
    }

    /**
     * Gets the value of the prepaymentPenaltyTermMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaymentPenaltyTermMonths() {
        return prepaymentPenaltyTermMonths;
    }

    /**
     * Sets the value of the prepaymentPenaltyTermMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaymentPenaltyTermMonths(String value) {
        this.prepaymentPenaltyTermMonths = value;
    }

    /**
     * Gets the value of the prepaymentRestrictionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaymentRestrictionIndicator() {
        return prepaymentRestrictionIndicator;
    }

    /**
     * Sets the value of the prepaymentRestrictionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaymentRestrictionIndicator(String value) {
        this.prepaymentRestrictionIndicator = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the scheduledFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledFirstPaymentDate() {
        return scheduledFirstPaymentDate;
    }

    /**
     * Sets the value of the scheduledFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledFirstPaymentDate(String value) {
        this.scheduledFirstPaymentDate = value;
    }

    /**
     * Gets the value of the loanClosingStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanClosingStatusType() {
        return loanClosingStatusType;
    }

    /**
     * Sets the value of the loanClosingStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanClosingStatusType(String value) {
        this.loanClosingStatusType = value;
    }

    /**
     * Gets the value of the servicingTransferStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicingTransferStatusType() {
        return servicingTransferStatusType;
    }

    /**
     * Sets the value of the servicingTransferStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicingTransferStatusType(String value) {
        this.servicingTransferStatusType = value;
    }

}
