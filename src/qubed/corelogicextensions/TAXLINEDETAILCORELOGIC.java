//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the parcel tax line. 
 * 
 * <p>Java class for TAX_LINE_DETAIL_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_LINE_DETAIL_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxAuthorityParcelIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="TaxBillAnnualTotalTaxAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TaxBillEstimatedNextReleaseDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TaxBillFrequencyType" type="{http://globalgateway.corelogic.com/order/2015}TaxBillFrequencyTypeEnum" minOccurs="0"/>
 *         &lt;element name="TaxBillIncludesOtherPropertyDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="TaxBillIncludesOtherPropertyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TaxBillLastPaidInstallmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TaxBillLastPaidInstallmentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TaxBillNewOwnerFirstInstallmentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TaxBillReleasedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TaxBillTotalInstallmentsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="VendorTaxIdentifer" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="VendorTaxTypeCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="VendorTaxTypeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_LINE_DETAIL_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxAuthorityParcelIdentifier",
    "taxBillAnnualTotalTaxAmount",
    "taxBillEstimatedNextReleaseDate",
    "taxBillFrequencyType",
    "taxBillIncludesOtherPropertyDescription",
    "taxBillIncludesOtherPropertyIndicator",
    "taxBillLastPaidInstallmentAmount",
    "taxBillLastPaidInstallmentDate",
    "taxBillNewOwnerFirstInstallmentDate",
    "taxBillReleasedIndicator",
    "taxBillTotalInstallmentsCount",
    "vendorTaxIdentifer",
    "vendorTaxTypeCode",
    "vendorTaxTypeDescription"
})
public class TAXLINEDETAILCORELOGIC {

    @XmlElement(name = "TaxAuthorityParcelIdentifier")
    protected MISMOIdentifier taxAuthorityParcelIdentifier;
    @XmlElement(name = "TaxBillAnnualTotalTaxAmount")
    protected MISMOAmount taxBillAnnualTotalTaxAmount;
    @XmlElement(name = "TaxBillEstimatedNextReleaseDate")
    protected MISMODate taxBillEstimatedNextReleaseDate;
    @XmlElement(name = "TaxBillFrequencyType")
    protected TaxBillFrequencyTypeEnum taxBillFrequencyType;
    @XmlElement(name = "TaxBillIncludesOtherPropertyDescription")
    protected MISMOString taxBillIncludesOtherPropertyDescription;
    @XmlElement(name = "TaxBillIncludesOtherPropertyIndicator")
    protected MISMOIndicator taxBillIncludesOtherPropertyIndicator;
    @XmlElement(name = "TaxBillLastPaidInstallmentAmount")
    protected MISMOAmount taxBillLastPaidInstallmentAmount;
    @XmlElement(name = "TaxBillLastPaidInstallmentDate")
    protected MISMODate taxBillLastPaidInstallmentDate;
    @XmlElement(name = "TaxBillNewOwnerFirstInstallmentDate")
    protected MISMODate taxBillNewOwnerFirstInstallmentDate;
    @XmlElement(name = "TaxBillReleasedIndicator")
    protected MISMOIndicator taxBillReleasedIndicator;
    @XmlElement(name = "TaxBillTotalInstallmentsCount")
    protected MISMOCount taxBillTotalInstallmentsCount;
    @XmlElement(name = "VendorTaxIdentifer")
    protected MISMOIdentifier vendorTaxIdentifer;
    @XmlElement(name = "VendorTaxTypeCode")
    protected MISMOCode vendorTaxTypeCode;
    @XmlElement(name = "VendorTaxTypeDescription")
    protected MISMOString vendorTaxTypeDescription;

    /**
     * Gets the value of the taxAuthorityParcelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIdentifier }
     *     
     */
    public MISMOIdentifier getTaxAuthorityParcelIdentifier() {
        return taxAuthorityParcelIdentifier;
    }

    /**
     * Sets the value of the taxAuthorityParcelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIdentifier }
     *     
     */
    public void setTaxAuthorityParcelIdentifier(MISMOIdentifier value) {
        this.taxAuthorityParcelIdentifier = value;
    }

    /**
     * Gets the value of the taxBillAnnualTotalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOAmount }
     *     
     */
    public MISMOAmount getTaxBillAnnualTotalTaxAmount() {
        return taxBillAnnualTotalTaxAmount;
    }

    /**
     * Sets the value of the taxBillAnnualTotalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOAmount }
     *     
     */
    public void setTaxBillAnnualTotalTaxAmount(MISMOAmount value) {
        this.taxBillAnnualTotalTaxAmount = value;
    }

    /**
     * Gets the value of the taxBillEstimatedNextReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getTaxBillEstimatedNextReleaseDate() {
        return taxBillEstimatedNextReleaseDate;
    }

    /**
     * Sets the value of the taxBillEstimatedNextReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setTaxBillEstimatedNextReleaseDate(MISMODate value) {
        this.taxBillEstimatedNextReleaseDate = value;
    }

    /**
     * Gets the value of the taxBillFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBillFrequencyTypeEnum }
     *     
     */
    public TaxBillFrequencyTypeEnum getTaxBillFrequencyType() {
        return taxBillFrequencyType;
    }

    /**
     * Sets the value of the taxBillFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBillFrequencyTypeEnum }
     *     
     */
    public void setTaxBillFrequencyType(TaxBillFrequencyTypeEnum value) {
        this.taxBillFrequencyType = value;
    }

    /**
     * Gets the value of the taxBillIncludesOtherPropertyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getTaxBillIncludesOtherPropertyDescription() {
        return taxBillIncludesOtherPropertyDescription;
    }

    /**
     * Sets the value of the taxBillIncludesOtherPropertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setTaxBillIncludesOtherPropertyDescription(MISMOString value) {
        this.taxBillIncludesOtherPropertyDescription = value;
    }

    /**
     * Gets the value of the taxBillIncludesOtherPropertyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getTaxBillIncludesOtherPropertyIndicator() {
        return taxBillIncludesOtherPropertyIndicator;
    }

    /**
     * Sets the value of the taxBillIncludesOtherPropertyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setTaxBillIncludesOtherPropertyIndicator(MISMOIndicator value) {
        this.taxBillIncludesOtherPropertyIndicator = value;
    }

    /**
     * Gets the value of the taxBillLastPaidInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOAmount }
     *     
     */
    public MISMOAmount getTaxBillLastPaidInstallmentAmount() {
        return taxBillLastPaidInstallmentAmount;
    }

    /**
     * Sets the value of the taxBillLastPaidInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOAmount }
     *     
     */
    public void setTaxBillLastPaidInstallmentAmount(MISMOAmount value) {
        this.taxBillLastPaidInstallmentAmount = value;
    }

    /**
     * Gets the value of the taxBillLastPaidInstallmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getTaxBillLastPaidInstallmentDate() {
        return taxBillLastPaidInstallmentDate;
    }

    /**
     * Sets the value of the taxBillLastPaidInstallmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setTaxBillLastPaidInstallmentDate(MISMODate value) {
        this.taxBillLastPaidInstallmentDate = value;
    }

    /**
     * Gets the value of the taxBillNewOwnerFirstInstallmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getTaxBillNewOwnerFirstInstallmentDate() {
        return taxBillNewOwnerFirstInstallmentDate;
    }

    /**
     * Sets the value of the taxBillNewOwnerFirstInstallmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setTaxBillNewOwnerFirstInstallmentDate(MISMODate value) {
        this.taxBillNewOwnerFirstInstallmentDate = value;
    }

    /**
     * Gets the value of the taxBillReleasedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getTaxBillReleasedIndicator() {
        return taxBillReleasedIndicator;
    }

    /**
     * Sets the value of the taxBillReleasedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setTaxBillReleasedIndicator(MISMOIndicator value) {
        this.taxBillReleasedIndicator = value;
    }

    /**
     * Gets the value of the taxBillTotalInstallmentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOCount }
     *     
     */
    public MISMOCount getTaxBillTotalInstallmentsCount() {
        return taxBillTotalInstallmentsCount;
    }

    /**
     * Sets the value of the taxBillTotalInstallmentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOCount }
     *     
     */
    public void setTaxBillTotalInstallmentsCount(MISMOCount value) {
        this.taxBillTotalInstallmentsCount = value;
    }

    /**
     * Gets the value of the vendorTaxIdentifer property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIdentifier }
     *     
     */
    public MISMOIdentifier getVendorTaxIdentifer() {
        return vendorTaxIdentifer;
    }

    /**
     * Sets the value of the vendorTaxIdentifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIdentifier }
     *     
     */
    public void setVendorTaxIdentifer(MISMOIdentifier value) {
        this.vendorTaxIdentifer = value;
    }

    /**
     * Gets the value of the vendorTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOCode }
     *     
     */
    public MISMOCode getVendorTaxTypeCode() {
        return vendorTaxTypeCode;
    }

    /**
     * Sets the value of the vendorTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOCode }
     *     
     */
    public void setVendorTaxTypeCode(MISMOCode value) {
        this.vendorTaxTypeCode = value;
    }

    /**
     * Gets the value of the vendorTaxTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getVendorTaxTypeDescription() {
        return vendorTaxTypeDescription;
    }

    /**
     * Sets the value of the vendorTaxTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setVendorTaxTypeDescription(MISMOString value) {
        this.vendorTaxTypeDescription = value;
    }

}