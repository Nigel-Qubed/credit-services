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
@XmlRootElement(name = "MORTGAGE_TERMS")
public class MORTGAGETERMS {

    @XmlAttribute(name = "AgencyCaseIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String agencyCaseIdentifier;
    @XmlAttribute(name = "ARMTypeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String armTypeDescription;
    @XmlAttribute(name = "BaseLoanAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseLoanAmount;
    @XmlAttribute(name = "BorrowerRequestedLoanAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String borrowerRequestedLoanAmount;
    @XmlAttribute(name = "LenderCaseIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lenderCaseIdentifier;
    @XmlAttribute(name = "LoanAmortizationTermMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String loanAmortizationTermMonths;
    @XmlAttribute(name = "LoanAmortizationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loanAmortizationType;
    @XmlAttribute(name = "MortgageType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mortgageType;
    @XmlAttribute(name = "OtherMortgageTypeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String otherMortgageTypeDescription;
    @XmlAttribute(name = "OtherAmortizationTypeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String otherAmortizationTypeDescription;
    @XmlAttribute(name = "RequestedInterestRatePercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String requestedInterestRatePercent;

    /**
     * Gets the value of the agencyCaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCaseIdentifier() {
        return agencyCaseIdentifier;
    }

    /**
     * Sets the value of the agencyCaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCaseIdentifier(String value) {
        this.agencyCaseIdentifier = value;
    }

    /**
     * Gets the value of the armTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARMTypeDescription() {
        return armTypeDescription;
    }

    /**
     * Sets the value of the armTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARMTypeDescription(String value) {
        this.armTypeDescription = value;
    }

    /**
     * Gets the value of the baseLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLoanAmount() {
        return baseLoanAmount;
    }

    /**
     * Sets the value of the baseLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLoanAmount(String value) {
        this.baseLoanAmount = value;
    }

    /**
     * Gets the value of the borrowerRequestedLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerRequestedLoanAmount() {
        return borrowerRequestedLoanAmount;
    }

    /**
     * Sets the value of the borrowerRequestedLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerRequestedLoanAmount(String value) {
        this.borrowerRequestedLoanAmount = value;
    }

    /**
     * Gets the value of the lenderCaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderCaseIdentifier() {
        return lenderCaseIdentifier;
    }

    /**
     * Sets the value of the lenderCaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderCaseIdentifier(String value) {
        this.lenderCaseIdentifier = value;
    }

    /**
     * Gets the value of the loanAmortizationTermMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmortizationTermMonths() {
        return loanAmortizationTermMonths;
    }

    /**
     * Sets the value of the loanAmortizationTermMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmortizationTermMonths(String value) {
        this.loanAmortizationTermMonths = value;
    }

    /**
     * Gets the value of the loanAmortizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmortizationType() {
        return loanAmortizationType;
    }

    /**
     * Sets the value of the loanAmortizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmortizationType(String value) {
        this.loanAmortizationType = value;
    }

    /**
     * Gets the value of the mortgageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageType() {
        return mortgageType;
    }

    /**
     * Sets the value of the mortgageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageType(String value) {
        this.mortgageType = value;
    }

    /**
     * Gets the value of the otherMortgageTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherMortgageTypeDescription() {
        return otherMortgageTypeDescription;
    }

    /**
     * Sets the value of the otherMortgageTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherMortgageTypeDescription(String value) {
        this.otherMortgageTypeDescription = value;
    }

    /**
     * Gets the value of the otherAmortizationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAmortizationTypeDescription() {
        return otherAmortizationTypeDescription;
    }

    /**
     * Sets the value of the otherAmortizationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAmortizationTypeDescription(String value) {
        this.otherAmortizationTypeDescription = value;
    }

    /**
     * Gets the value of the requestedInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedInterestRatePercent() {
        return requestedInterestRatePercent;
    }

    /**
     * Sets the value of the requestedInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedInterestRatePercent(String value) {
        this.requestedInterestRatePercent = value;
    }

}
