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
 * <p>Java class for URLA_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="URLA_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalBorrowerAssetsConsideredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AdditionalBorrowerAssetsNotConsideredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AlterationsImprovementsAndRepairsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ApplicationSignedByLoanOriginatorDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ApplicationTakenMethodType" type="{http://www.mismo.org/residential/2009/schemas}ApplicationTakenMethodEnum" minOccurs="0"/>
 *         &lt;element name="ARMTypeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BorrowerPaidDiscountPointsTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="BorrowerRequestedInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="BorrowerRequestedLoanAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EstimatedClosingCostsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LenderRegistrationIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MIAndFundingFeeFinancedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIAndFundingFeeTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemsEstimatedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PurchasePriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PurchasePriceNetAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="RefinanceImprovementCostsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="RefinanceImprovementsType" type="{http://www.mismo.org/residential/2009/schemas}RefinanceImprovementsEnum" minOccurs="0"/>
 *         &lt;element name="RefinanceIncludingDebtsToBePaidOffAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="RefinanceProposedImprovementsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RefundableApplicationFeeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RequiredDepositIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SellerPaidClosingCostsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLAStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="URLAStatusType" type="{http://www.mismo.org/residential/2009/schemas}URLAStatusEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}URLA_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "URLA_DETAIL", propOrder = {
    "additionalBorrowerAssetsConsideredIndicator",
    "additionalBorrowerAssetsNotConsideredIndicator",
    "alterationsImprovementsAndRepairsAmount",
    "applicationSignedByLoanOriginatorDate",
    "applicationTakenMethodType",
    "armTypeDescription",
    "borrowerPaidDiscountPointsTotalAmount",
    "borrowerRequestedInterestRatePercent",
    "borrowerRequestedLoanAmount",
    "estimatedClosingCostsAmount",
    "lenderRegistrationIdentifier",
    "miAndFundingFeeFinancedAmount",
    "miAndFundingFeeTotalAmount",
    "prepaidItemsEstimatedAmount",
    "purchasePriceAmount",
    "purchasePriceNetAmount",
    "refinanceImprovementCostsAmount",
    "refinanceImprovementsType",
    "refinanceIncludingDebtsToBePaidOffAmount",
    "refinanceProposedImprovementsDescription",
    "refundableApplicationFeeIndicator",
    "requiredDepositIndicator",
    "sellerPaidClosingCostsAmount",
    "urlaStatusDate",
    "urlaStatusType",
    "extension"
})
public class URLADETAIL {

    @XmlElementRef(name = "AdditionalBorrowerAssetsConsideredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> additionalBorrowerAssetsConsideredIndicator;
    @XmlElementRef(name = "AdditionalBorrowerAssetsNotConsideredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> additionalBorrowerAssetsNotConsideredIndicator;
    @XmlElementRef(name = "AlterationsImprovementsAndRepairsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> alterationsImprovementsAndRepairsAmount;
    @XmlElementRef(name = "ApplicationSignedByLoanOriginatorDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> applicationSignedByLoanOriginatorDate;
    @XmlElementRef(name = "ApplicationTakenMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicationTakenMethodEnum> applicationTakenMethodType;
    @XmlElementRef(name = "ARMTypeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> armTypeDescription;
    @XmlElementRef(name = "BorrowerPaidDiscountPointsTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> borrowerPaidDiscountPointsTotalAmount;
    @XmlElementRef(name = "BorrowerRequestedInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> borrowerRequestedInterestRatePercent;
    @XmlElementRef(name = "BorrowerRequestedLoanAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> borrowerRequestedLoanAmount;
    @XmlElementRef(name = "EstimatedClosingCostsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> estimatedClosingCostsAmount;
    @XmlElementRef(name = "LenderRegistrationIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> lenderRegistrationIdentifier;
    @XmlElementRef(name = "MIAndFundingFeeFinancedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miAndFundingFeeFinancedAmount;
    @XmlElementRef(name = "MIAndFundingFeeTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miAndFundingFeeTotalAmount;
    @XmlElementRef(name = "PrepaidItemsEstimatedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemsEstimatedAmount;
    @XmlElementRef(name = "PurchasePriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> purchasePriceAmount;
    @XmlElementRef(name = "PurchasePriceNetAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> purchasePriceNetAmount;
    @XmlElementRef(name = "RefinanceImprovementCostsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> refinanceImprovementCostsAmount;
    @XmlElementRef(name = "RefinanceImprovementsType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RefinanceImprovementsEnum> refinanceImprovementsType;
    @XmlElementRef(name = "RefinanceIncludingDebtsToBePaidOffAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> refinanceIncludingDebtsToBePaidOffAmount;
    @XmlElementRef(name = "RefinanceProposedImprovementsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> refinanceProposedImprovementsDescription;
    @XmlElementRef(name = "RefundableApplicationFeeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> refundableApplicationFeeIndicator;
    @XmlElementRef(name = "RequiredDepositIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> requiredDepositIndicator;
    @XmlElementRef(name = "SellerPaidClosingCostsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> sellerPaidClosingCostsAmount;
    @XmlElementRef(name = "URLAStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> urlaStatusDate;
    @XmlElementRef(name = "URLAStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<URLAStatusEnum> urlaStatusType;
    @XmlElement(name = "EXTENSION")
    protected URLADETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the additionalBorrowerAssetsConsideredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAdditionalBorrowerAssetsConsideredIndicator() {
        return additionalBorrowerAssetsConsideredIndicator;
    }

    /**
     * Sets the value of the additionalBorrowerAssetsConsideredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAdditionalBorrowerAssetsConsideredIndicator(JAXBElement<MISMOIndicator> value) {
        this.additionalBorrowerAssetsConsideredIndicator = value;
    }

    /**
     * Gets the value of the additionalBorrowerAssetsNotConsideredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAdditionalBorrowerAssetsNotConsideredIndicator() {
        return additionalBorrowerAssetsNotConsideredIndicator;
    }

    /**
     * Sets the value of the additionalBorrowerAssetsNotConsideredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAdditionalBorrowerAssetsNotConsideredIndicator(JAXBElement<MISMOIndicator> value) {
        this.additionalBorrowerAssetsNotConsideredIndicator = value;
    }

    /**
     * Gets the value of the alterationsImprovementsAndRepairsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAlterationsImprovementsAndRepairsAmount() {
        return alterationsImprovementsAndRepairsAmount;
    }

    /**
     * Sets the value of the alterationsImprovementsAndRepairsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAlterationsImprovementsAndRepairsAmount(JAXBElement<MISMOAmount> value) {
        this.alterationsImprovementsAndRepairsAmount = value;
    }

    /**
     * Gets the value of the applicationSignedByLoanOriginatorDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getApplicationSignedByLoanOriginatorDate() {
        return applicationSignedByLoanOriginatorDate;
    }

    /**
     * Sets the value of the applicationSignedByLoanOriginatorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setApplicationSignedByLoanOriginatorDate(JAXBElement<MISMODate> value) {
        this.applicationSignedByLoanOriginatorDate = value;
    }

    /**
     * Gets the value of the applicationTakenMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicationTakenMethodEnum }{@code >}
     *     
     */
    public JAXBElement<ApplicationTakenMethodEnum> getApplicationTakenMethodType() {
        return applicationTakenMethodType;
    }

    /**
     * Sets the value of the applicationTakenMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicationTakenMethodEnum }{@code >}
     *     
     */
    public void setApplicationTakenMethodType(JAXBElement<ApplicationTakenMethodEnum> value) {
        this.applicationTakenMethodType = value;
    }

    /**
     * Gets the value of the armTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getARMTypeDescription() {
        return armTypeDescription;
    }

    /**
     * Sets the value of the armTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setARMTypeDescription(JAXBElement<MISMOString> value) {
        this.armTypeDescription = value;
    }

    /**
     * Gets the value of the borrowerPaidDiscountPointsTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBorrowerPaidDiscountPointsTotalAmount() {
        return borrowerPaidDiscountPointsTotalAmount;
    }

    /**
     * Sets the value of the borrowerPaidDiscountPointsTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBorrowerPaidDiscountPointsTotalAmount(JAXBElement<MISMOAmount> value) {
        this.borrowerPaidDiscountPointsTotalAmount = value;
    }

    /**
     * Gets the value of the borrowerRequestedInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getBorrowerRequestedInterestRatePercent() {
        return borrowerRequestedInterestRatePercent;
    }

    /**
     * Sets the value of the borrowerRequestedInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setBorrowerRequestedInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.borrowerRequestedInterestRatePercent = value;
    }

    /**
     * Gets the value of the borrowerRequestedLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBorrowerRequestedLoanAmount() {
        return borrowerRequestedLoanAmount;
    }

    /**
     * Sets the value of the borrowerRequestedLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBorrowerRequestedLoanAmount(JAXBElement<MISMOAmount> value) {
        this.borrowerRequestedLoanAmount = value;
    }

    /**
     * Gets the value of the estimatedClosingCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEstimatedClosingCostsAmount() {
        return estimatedClosingCostsAmount;
    }

    /**
     * Sets the value of the estimatedClosingCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEstimatedClosingCostsAmount(JAXBElement<MISMOAmount> value) {
        this.estimatedClosingCostsAmount = value;
    }

    /**
     * Gets the value of the lenderRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getLenderRegistrationIdentifier() {
        return lenderRegistrationIdentifier;
    }

    /**
     * Sets the value of the lenderRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setLenderRegistrationIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.lenderRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the miAndFundingFeeFinancedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIAndFundingFeeFinancedAmount() {
        return miAndFundingFeeFinancedAmount;
    }

    /**
     * Sets the value of the miAndFundingFeeFinancedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIAndFundingFeeFinancedAmount(JAXBElement<MISMOAmount> value) {
        this.miAndFundingFeeFinancedAmount = value;
    }

    /**
     * Gets the value of the miAndFundingFeeTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIAndFundingFeeTotalAmount() {
        return miAndFundingFeeTotalAmount;
    }

    /**
     * Sets the value of the miAndFundingFeeTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIAndFundingFeeTotalAmount(JAXBElement<MISMOAmount> value) {
        this.miAndFundingFeeTotalAmount = value;
    }

    /**
     * Gets the value of the prepaidItemsEstimatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemsEstimatedAmount() {
        return prepaidItemsEstimatedAmount;
    }

    /**
     * Sets the value of the prepaidItemsEstimatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemsEstimatedAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemsEstimatedAmount = value;
    }

    /**
     * Gets the value of the purchasePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPurchasePriceAmount() {
        return purchasePriceAmount;
    }

    /**
     * Sets the value of the purchasePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPurchasePriceAmount(JAXBElement<MISMOAmount> value) {
        this.purchasePriceAmount = value;
    }

    /**
     * Gets the value of the purchasePriceNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPurchasePriceNetAmount() {
        return purchasePriceNetAmount;
    }

    /**
     * Sets the value of the purchasePriceNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPurchasePriceNetAmount(JAXBElement<MISMOAmount> value) {
        this.purchasePriceNetAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getRefinanceImprovementCostsAmount() {
        return refinanceImprovementCostsAmount;
    }

    /**
     * Sets the value of the refinanceImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setRefinanceImprovementCostsAmount(JAXBElement<MISMOAmount> value) {
        this.refinanceImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementsType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefinanceImprovementsEnum }{@code >}
     *     
     */
    public JAXBElement<RefinanceImprovementsEnum> getRefinanceImprovementsType() {
        return refinanceImprovementsType;
    }

    /**
     * Sets the value of the refinanceImprovementsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefinanceImprovementsEnum }{@code >}
     *     
     */
    public void setRefinanceImprovementsType(JAXBElement<RefinanceImprovementsEnum> value) {
        this.refinanceImprovementsType = value;
    }

    /**
     * Gets the value of the refinanceIncludingDebtsToBePaidOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getRefinanceIncludingDebtsToBePaidOffAmount() {
        return refinanceIncludingDebtsToBePaidOffAmount;
    }

    /**
     * Sets the value of the refinanceIncludingDebtsToBePaidOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setRefinanceIncludingDebtsToBePaidOffAmount(JAXBElement<MISMOAmount> value) {
        this.refinanceIncludingDebtsToBePaidOffAmount = value;
    }

    /**
     * Gets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRefinanceProposedImprovementsDescription() {
        return refinanceProposedImprovementsDescription;
    }

    /**
     * Sets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRefinanceProposedImprovementsDescription(JAXBElement<MISMOString> value) {
        this.refinanceProposedImprovementsDescription = value;
    }

    /**
     * Gets the value of the refundableApplicationFeeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRefundableApplicationFeeIndicator() {
        return refundableApplicationFeeIndicator;
    }

    /**
     * Sets the value of the refundableApplicationFeeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRefundableApplicationFeeIndicator(JAXBElement<MISMOIndicator> value) {
        this.refundableApplicationFeeIndicator = value;
    }

    /**
     * Gets the value of the requiredDepositIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRequiredDepositIndicator() {
        return requiredDepositIndicator;
    }

    /**
     * Sets the value of the requiredDepositIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRequiredDepositIndicator(JAXBElement<MISMOIndicator> value) {
        this.requiredDepositIndicator = value;
    }

    /**
     * Gets the value of the sellerPaidClosingCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSellerPaidClosingCostsAmount() {
        return sellerPaidClosingCostsAmount;
    }

    /**
     * Sets the value of the sellerPaidClosingCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSellerPaidClosingCostsAmount(JAXBElement<MISMOAmount> value) {
        this.sellerPaidClosingCostsAmount = value;
    }

    /**
     * Gets the value of the urlaStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getURLAStatusDate() {
        return urlaStatusDate;
    }

    /**
     * Sets the value of the urlaStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setURLAStatusDate(JAXBElement<MISMODate> value) {
        this.urlaStatusDate = value;
    }

    /**
     * Gets the value of the urlaStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link URLAStatusEnum }{@code >}
     *     
     */
    public JAXBElement<URLAStatusEnum> getURLAStatusType() {
        return urlaStatusType;
    }

    /**
     * Sets the value of the urlaStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link URLAStatusEnum }{@code >}
     *     
     */
    public void setURLAStatusType(JAXBElement<URLAStatusEnum> value) {
        this.urlaStatusType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link URLADETAILEXTENSION }
     *     
     */
    public URLADETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLADETAILEXTENSION }
     *     
     */
    public void setEXTENSION(URLADETAILEXTENSION value) {
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
