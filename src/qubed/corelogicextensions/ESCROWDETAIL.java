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
 * Information about the servicing escrow account including initial setup, minimum balance, current escrow account balance, escrow interest amounts and other pertinent escrow account data.
 * 
 * <p>Java class for ESCROW_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESCROW_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EscrowAccountInitialBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowAccountMinimumBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowAccountRolloverAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowAccountShortageAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowAccountShortageRepaymentPeriodYearsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EscrowAggregateAccountingAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowCushionNumberOfMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="GFEDisclosedInitialEscrowBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InitialEscrowDepositIncludesAllInsuranceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InitialEscrowDepositIncludesAllPropertyTaxesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InitialEscrowDepositIncludesOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InitialEscrowProjectionStatementDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InterestOnEscrowAccruedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InterestOnEscrowAccruedThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InterestOnEscrowBackupWithholdingIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InterestOnEscrowIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InterestOnEscrowYearToDatePostedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InterestOnRestrictedEscrowIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LastEscrowAnalysisDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LastInterestOnEscrowPostedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MIEscrowIncludedInAggregateIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RestrictedEscrowBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ESCROW_DETAIL", propOrder = {
    "escrowAccountInitialBalanceAmount",
    "escrowAccountMinimumBalanceAmount",
    "escrowAccountRolloverAmount",
    "escrowAccountShortageAmount",
    "escrowAccountShortageRepaymentPeriodYearsCount",
    "escrowAggregateAccountingAdjustmentAmount",
    "escrowBalanceAmount",
    "escrowCushionNumberOfMonthsCount",
    "gfeDisclosedInitialEscrowBalanceAmount",
    "initialEscrowDepositIncludesAllInsuranceIndicator",
    "initialEscrowDepositIncludesAllPropertyTaxesIndicator",
    "initialEscrowDepositIncludesOtherDescription",
    "initialEscrowProjectionStatementDate",
    "interestOnEscrowAccruedAmount",
    "interestOnEscrowAccruedThroughDate",
    "interestOnEscrowBackupWithholdingIndicator",
    "interestOnEscrowIndicator",
    "interestOnEscrowYearToDatePostedAmount",
    "interestOnRestrictedEscrowIndicator",
    "lastEscrowAnalysisDate",
    "lastInterestOnEscrowPostedDate",
    "miEscrowIncludedInAggregateIndicator",
    "restrictedEscrowBalanceAmount",
    "extension"
})
public class ESCROWDETAIL {

    @XmlElementRef(name = "EscrowAccountInitialBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowAccountInitialBalanceAmount;
    @XmlElementRef(name = "EscrowAccountMinimumBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowAccountMinimumBalanceAmount;
    @XmlElementRef(name = "EscrowAccountRolloverAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowAccountRolloverAmount;
    @XmlElementRef(name = "EscrowAccountShortageAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowAccountShortageAmount;
    @XmlElementRef(name = "EscrowAccountShortageRepaymentPeriodYearsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> escrowAccountShortageRepaymentPeriodYearsCount;
    @XmlElementRef(name = "EscrowAggregateAccountingAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowAggregateAccountingAdjustmentAmount;
    @XmlElementRef(name = "EscrowBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowBalanceAmount;
    @XmlElementRef(name = "EscrowCushionNumberOfMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> escrowCushionNumberOfMonthsCount;
    @XmlElementRef(name = "GFEDisclosedInitialEscrowBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> gfeDisclosedInitialEscrowBalanceAmount;
    @XmlElementRef(name = "InitialEscrowDepositIncludesAllInsuranceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> initialEscrowDepositIncludesAllInsuranceIndicator;
    @XmlElementRef(name = "InitialEscrowDepositIncludesAllPropertyTaxesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> initialEscrowDepositIncludesAllPropertyTaxesIndicator;
    @XmlElementRef(name = "InitialEscrowDepositIncludesOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> initialEscrowDepositIncludesOtherDescription;
    @XmlElementRef(name = "InitialEscrowProjectionStatementDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> initialEscrowProjectionStatementDate;
    @XmlElementRef(name = "InterestOnEscrowAccruedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> interestOnEscrowAccruedAmount;
    @XmlElementRef(name = "InterestOnEscrowAccruedThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> interestOnEscrowAccruedThroughDate;
    @XmlElementRef(name = "InterestOnEscrowBackupWithholdingIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> interestOnEscrowBackupWithholdingIndicator;
    @XmlElementRef(name = "InterestOnEscrowIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> interestOnEscrowIndicator;
    @XmlElementRef(name = "InterestOnEscrowYearToDatePostedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> interestOnEscrowYearToDatePostedAmount;
    @XmlElementRef(name = "InterestOnRestrictedEscrowIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> interestOnRestrictedEscrowIndicator;
    @XmlElementRef(name = "LastEscrowAnalysisDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> lastEscrowAnalysisDate;
    @XmlElementRef(name = "LastInterestOnEscrowPostedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> lastInterestOnEscrowPostedDate;
    @XmlElementRef(name = "MIEscrowIncludedInAggregateIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> miEscrowIncludedInAggregateIndicator;
    @XmlElementRef(name = "RestrictedEscrowBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> restrictedEscrowBalanceAmount;
    @XmlElement(name = "EXTENSION")
    protected ESCROWDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the escrowAccountInitialBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowAccountInitialBalanceAmount() {
        return escrowAccountInitialBalanceAmount;
    }

    /**
     * Sets the value of the escrowAccountInitialBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowAccountInitialBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.escrowAccountInitialBalanceAmount = value;
    }

    /**
     * Gets the value of the escrowAccountMinimumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowAccountMinimumBalanceAmount() {
        return escrowAccountMinimumBalanceAmount;
    }

    /**
     * Sets the value of the escrowAccountMinimumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowAccountMinimumBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.escrowAccountMinimumBalanceAmount = value;
    }

    /**
     * Gets the value of the escrowAccountRolloverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowAccountRolloverAmount() {
        return escrowAccountRolloverAmount;
    }

    /**
     * Sets the value of the escrowAccountRolloverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowAccountRolloverAmount(JAXBElement<MISMOAmount> value) {
        this.escrowAccountRolloverAmount = value;
    }

    /**
     * Gets the value of the escrowAccountShortageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowAccountShortageAmount() {
        return escrowAccountShortageAmount;
    }

    /**
     * Sets the value of the escrowAccountShortageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowAccountShortageAmount(JAXBElement<MISMOAmount> value) {
        this.escrowAccountShortageAmount = value;
    }

    /**
     * Gets the value of the escrowAccountShortageRepaymentPeriodYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEscrowAccountShortageRepaymentPeriodYearsCount() {
        return escrowAccountShortageRepaymentPeriodYearsCount;
    }

    /**
     * Sets the value of the escrowAccountShortageRepaymentPeriodYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEscrowAccountShortageRepaymentPeriodYearsCount(JAXBElement<MISMOCount> value) {
        this.escrowAccountShortageRepaymentPeriodYearsCount = value;
    }

    /**
     * Gets the value of the escrowAggregateAccountingAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowAggregateAccountingAdjustmentAmount() {
        return escrowAggregateAccountingAdjustmentAmount;
    }

    /**
     * Sets the value of the escrowAggregateAccountingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowAggregateAccountingAdjustmentAmount(JAXBElement<MISMOAmount> value) {
        this.escrowAggregateAccountingAdjustmentAmount = value;
    }

    /**
     * Gets the value of the escrowBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowBalanceAmount() {
        return escrowBalanceAmount;
    }

    /**
     * Sets the value of the escrowBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.escrowBalanceAmount = value;
    }

    /**
     * Gets the value of the escrowCushionNumberOfMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEscrowCushionNumberOfMonthsCount() {
        return escrowCushionNumberOfMonthsCount;
    }

    /**
     * Sets the value of the escrowCushionNumberOfMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEscrowCushionNumberOfMonthsCount(JAXBElement<MISMOCount> value) {
        this.escrowCushionNumberOfMonthsCount = value;
    }

    /**
     * Gets the value of the gfeDisclosedInitialEscrowBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getGFEDisclosedInitialEscrowBalanceAmount() {
        return gfeDisclosedInitialEscrowBalanceAmount;
    }

    /**
     * Sets the value of the gfeDisclosedInitialEscrowBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setGFEDisclosedInitialEscrowBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.gfeDisclosedInitialEscrowBalanceAmount = value;
    }

    /**
     * Gets the value of the initialEscrowDepositIncludesAllInsuranceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInitialEscrowDepositIncludesAllInsuranceIndicator() {
        return initialEscrowDepositIncludesAllInsuranceIndicator;
    }

    /**
     * Sets the value of the initialEscrowDepositIncludesAllInsuranceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInitialEscrowDepositIncludesAllInsuranceIndicator(JAXBElement<MISMOIndicator> value) {
        this.initialEscrowDepositIncludesAllInsuranceIndicator = value;
    }

    /**
     * Gets the value of the initialEscrowDepositIncludesAllPropertyTaxesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInitialEscrowDepositIncludesAllPropertyTaxesIndicator() {
        return initialEscrowDepositIncludesAllPropertyTaxesIndicator;
    }

    /**
     * Sets the value of the initialEscrowDepositIncludesAllPropertyTaxesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInitialEscrowDepositIncludesAllPropertyTaxesIndicator(JAXBElement<MISMOIndicator> value) {
        this.initialEscrowDepositIncludesAllPropertyTaxesIndicator = value;
    }

    /**
     * Gets the value of the initialEscrowDepositIncludesOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInitialEscrowDepositIncludesOtherDescription() {
        return initialEscrowDepositIncludesOtherDescription;
    }

    /**
     * Sets the value of the initialEscrowDepositIncludesOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInitialEscrowDepositIncludesOtherDescription(JAXBElement<MISMOString> value) {
        this.initialEscrowDepositIncludesOtherDescription = value;
    }

    /**
     * Gets the value of the initialEscrowProjectionStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInitialEscrowProjectionStatementDate() {
        return initialEscrowProjectionStatementDate;
    }

    /**
     * Sets the value of the initialEscrowProjectionStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInitialEscrowProjectionStatementDate(JAXBElement<MISMODate> value) {
        this.initialEscrowProjectionStatementDate = value;
    }

    /**
     * Gets the value of the interestOnEscrowAccruedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInterestOnEscrowAccruedAmount() {
        return interestOnEscrowAccruedAmount;
    }

    /**
     * Sets the value of the interestOnEscrowAccruedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInterestOnEscrowAccruedAmount(JAXBElement<MISMOAmount> value) {
        this.interestOnEscrowAccruedAmount = value;
    }

    /**
     * Gets the value of the interestOnEscrowAccruedThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInterestOnEscrowAccruedThroughDate() {
        return interestOnEscrowAccruedThroughDate;
    }

    /**
     * Sets the value of the interestOnEscrowAccruedThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInterestOnEscrowAccruedThroughDate(JAXBElement<MISMODate> value) {
        this.interestOnEscrowAccruedThroughDate = value;
    }

    /**
     * Gets the value of the interestOnEscrowBackupWithholdingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInterestOnEscrowBackupWithholdingIndicator() {
        return interestOnEscrowBackupWithholdingIndicator;
    }

    /**
     * Sets the value of the interestOnEscrowBackupWithholdingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInterestOnEscrowBackupWithholdingIndicator(JAXBElement<MISMOIndicator> value) {
        this.interestOnEscrowBackupWithholdingIndicator = value;
    }

    /**
     * Gets the value of the interestOnEscrowIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInterestOnEscrowIndicator() {
        return interestOnEscrowIndicator;
    }

    /**
     * Sets the value of the interestOnEscrowIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInterestOnEscrowIndicator(JAXBElement<MISMOIndicator> value) {
        this.interestOnEscrowIndicator = value;
    }

    /**
     * Gets the value of the interestOnEscrowYearToDatePostedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInterestOnEscrowYearToDatePostedAmount() {
        return interestOnEscrowYearToDatePostedAmount;
    }

    /**
     * Sets the value of the interestOnEscrowYearToDatePostedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInterestOnEscrowYearToDatePostedAmount(JAXBElement<MISMOAmount> value) {
        this.interestOnEscrowYearToDatePostedAmount = value;
    }

    /**
     * Gets the value of the interestOnRestrictedEscrowIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInterestOnRestrictedEscrowIndicator() {
        return interestOnRestrictedEscrowIndicator;
    }

    /**
     * Sets the value of the interestOnRestrictedEscrowIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInterestOnRestrictedEscrowIndicator(JAXBElement<MISMOIndicator> value) {
        this.interestOnRestrictedEscrowIndicator = value;
    }

    /**
     * Gets the value of the lastEscrowAnalysisDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLastEscrowAnalysisDate() {
        return lastEscrowAnalysisDate;
    }

    /**
     * Sets the value of the lastEscrowAnalysisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLastEscrowAnalysisDate(JAXBElement<MISMODate> value) {
        this.lastEscrowAnalysisDate = value;
    }

    /**
     * Gets the value of the lastInterestOnEscrowPostedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLastInterestOnEscrowPostedDate() {
        return lastInterestOnEscrowPostedDate;
    }

    /**
     * Sets the value of the lastInterestOnEscrowPostedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLastInterestOnEscrowPostedDate(JAXBElement<MISMODate> value) {
        this.lastInterestOnEscrowPostedDate = value;
    }

    /**
     * Gets the value of the miEscrowIncludedInAggregateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMIEscrowIncludedInAggregateIndicator() {
        return miEscrowIncludedInAggregateIndicator;
    }

    /**
     * Sets the value of the miEscrowIncludedInAggregateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMIEscrowIncludedInAggregateIndicator(JAXBElement<MISMOIndicator> value) {
        this.miEscrowIncludedInAggregateIndicator = value;
    }

    /**
     * Gets the value of the restrictedEscrowBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getRestrictedEscrowBalanceAmount() {
        return restrictedEscrowBalanceAmount;
    }

    /**
     * Sets the value of the restrictedEscrowBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setRestrictedEscrowBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.restrictedEscrowBalanceAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWDETAILEXTENSION }
     *     
     */
    public ESCROWDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(ESCROWDETAILEXTENSION value) {
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
