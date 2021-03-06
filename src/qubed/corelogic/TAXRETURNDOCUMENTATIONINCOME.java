//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAX_RETURN_DOCUMENTATION_INCOME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_RETURN_DOCUMENTATION_INCOME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WagesSalariesTipsEtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WagesTipsAndOtherCompensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableInterestIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableInterestIncomeScheduleB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessIncomeOrLossScheduleC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapitalGainsOrLossesScheduleD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherGainsOrLossesForm4797" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RentLoyaltyPartnershipEstateScheduleE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnemploymentCompensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonEmployeeCompensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FishingIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Royalties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PensionsAndAnnuities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalIRADistributions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPensionsAndAnnuities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FarmIncomeOrLossScheduleF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialSecurityBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_RETURN_DOCUMENTATION_INCOME", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "wagesSalariesTipsEtc",
    "wagesTipsAndOtherCompensation",
    "taxableInterestIncome",
    "taxableInterestIncomeScheduleB",
    "taxExemptInterest",
    "businessIncomeOrLossScheduleC",
    "capitalGainsOrLossesScheduleD",
    "otherGainsOrLossesForm4797",
    "rentLoyaltyPartnershipEstateScheduleE",
    "otherIncome",
    "totalIncome",
    "unemploymentCompensation",
    "nonEmployeeCompensation",
    "fishingIncome",
    "royalties",
    "pensionsAndAnnuities",
    "totalIRADistributions",
    "totalPensionsAndAnnuities",
    "farmIncomeOrLossScheduleF",
    "socialSecurityBenefits"
})
public class TAXRETURNDOCUMENTATIONINCOME {

    @XmlElement(name = "WagesSalariesTipsEtc")
    protected String wagesSalariesTipsEtc;
    @XmlElement(name = "WagesTipsAndOtherCompensation")
    protected String wagesTipsAndOtherCompensation;
    @XmlElement(name = "TaxableInterestIncome")
    protected String taxableInterestIncome;
    @XmlElement(name = "TaxableInterestIncomeScheduleB")
    protected String taxableInterestIncomeScheduleB;
    @XmlElement(name = "TaxExemptInterest")
    protected String taxExemptInterest;
    @XmlElement(name = "BusinessIncomeOrLossScheduleC")
    protected String businessIncomeOrLossScheduleC;
    @XmlElement(name = "CapitalGainsOrLossesScheduleD")
    protected String capitalGainsOrLossesScheduleD;
    @XmlElement(name = "OtherGainsOrLossesForm4797")
    protected String otherGainsOrLossesForm4797;
    @XmlElement(name = "RentLoyaltyPartnershipEstateScheduleE")
    protected String rentLoyaltyPartnershipEstateScheduleE;
    @XmlElement(name = "OtherIncome")
    protected String otherIncome;
    @XmlElement(name = "TotalIncome")
    protected String totalIncome;
    @XmlElement(name = "UnemploymentCompensation")
    protected String unemploymentCompensation;
    @XmlElement(name = "NonEmployeeCompensation")
    protected String nonEmployeeCompensation;
    @XmlElement(name = "FishingIncome")
    protected String fishingIncome;
    @XmlElement(name = "Royalties")
    protected String royalties;
    @XmlElement(name = "PensionsAndAnnuities")
    protected String pensionsAndAnnuities;
    @XmlElement(name = "TotalIRADistributions")
    protected String totalIRADistributions;
    @XmlElement(name = "TotalPensionsAndAnnuities")
    protected String totalPensionsAndAnnuities;
    @XmlElement(name = "FarmIncomeOrLossScheduleF")
    protected String farmIncomeOrLossScheduleF;
    @XmlElement(name = "SocialSecurityBenefits")
    protected String socialSecurityBenefits;

    /**
     * Gets the value of the wagesSalariesTipsEtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWagesSalariesTipsEtc() {
        return wagesSalariesTipsEtc;
    }

    /**
     * Sets the value of the wagesSalariesTipsEtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWagesSalariesTipsEtc(String value) {
        this.wagesSalariesTipsEtc = value;
    }

    /**
     * Gets the value of the wagesTipsAndOtherCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWagesTipsAndOtherCompensation() {
        return wagesTipsAndOtherCompensation;
    }

    /**
     * Sets the value of the wagesTipsAndOtherCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWagesTipsAndOtherCompensation(String value) {
        this.wagesTipsAndOtherCompensation = value;
    }

    /**
     * Gets the value of the taxableInterestIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableInterestIncome() {
        return taxableInterestIncome;
    }

    /**
     * Sets the value of the taxableInterestIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableInterestIncome(String value) {
        this.taxableInterestIncome = value;
    }

    /**
     * Gets the value of the taxableInterestIncomeScheduleB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableInterestIncomeScheduleB() {
        return taxableInterestIncomeScheduleB;
    }

    /**
     * Sets the value of the taxableInterestIncomeScheduleB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableInterestIncomeScheduleB(String value) {
        this.taxableInterestIncomeScheduleB = value;
    }

    /**
     * Gets the value of the taxExemptInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptInterest() {
        return taxExemptInterest;
    }

    /**
     * Sets the value of the taxExemptInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptInterest(String value) {
        this.taxExemptInterest = value;
    }

    /**
     * Gets the value of the businessIncomeOrLossScheduleC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessIncomeOrLossScheduleC() {
        return businessIncomeOrLossScheduleC;
    }

    /**
     * Sets the value of the businessIncomeOrLossScheduleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessIncomeOrLossScheduleC(String value) {
        this.businessIncomeOrLossScheduleC = value;
    }

    /**
     * Gets the value of the capitalGainsOrLossesScheduleD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalGainsOrLossesScheduleD() {
        return capitalGainsOrLossesScheduleD;
    }

    /**
     * Sets the value of the capitalGainsOrLossesScheduleD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalGainsOrLossesScheduleD(String value) {
        this.capitalGainsOrLossesScheduleD = value;
    }

    /**
     * Gets the value of the otherGainsOrLossesForm4797 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherGainsOrLossesForm4797() {
        return otherGainsOrLossesForm4797;
    }

    /**
     * Sets the value of the otherGainsOrLossesForm4797 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherGainsOrLossesForm4797(String value) {
        this.otherGainsOrLossesForm4797 = value;
    }

    /**
     * Gets the value of the rentLoyaltyPartnershipEstateScheduleE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentLoyaltyPartnershipEstateScheduleE() {
        return rentLoyaltyPartnershipEstateScheduleE;
    }

    /**
     * Sets the value of the rentLoyaltyPartnershipEstateScheduleE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentLoyaltyPartnershipEstateScheduleE(String value) {
        this.rentLoyaltyPartnershipEstateScheduleE = value;
    }

    /**
     * Gets the value of the otherIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIncome() {
        return otherIncome;
    }

    /**
     * Sets the value of the otherIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIncome(String value) {
        this.otherIncome = value;
    }

    /**
     * Gets the value of the totalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the value of the totalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalIncome(String value) {
        this.totalIncome = value;
    }

    /**
     * Gets the value of the unemploymentCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnemploymentCompensation() {
        return unemploymentCompensation;
    }

    /**
     * Sets the value of the unemploymentCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnemploymentCompensation(String value) {
        this.unemploymentCompensation = value;
    }

    /**
     * Gets the value of the nonEmployeeCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEmployeeCompensation() {
        return nonEmployeeCompensation;
    }

    /**
     * Sets the value of the nonEmployeeCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEmployeeCompensation(String value) {
        this.nonEmployeeCompensation = value;
    }

    /**
     * Gets the value of the fishingIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFishingIncome() {
        return fishingIncome;
    }

    /**
     * Sets the value of the fishingIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFishingIncome(String value) {
        this.fishingIncome = value;
    }

    /**
     * Gets the value of the royalties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoyalties() {
        return royalties;
    }

    /**
     * Sets the value of the royalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoyalties(String value) {
        this.royalties = value;
    }

    /**
     * Gets the value of the pensionsAndAnnuities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionsAndAnnuities() {
        return pensionsAndAnnuities;
    }

    /**
     * Sets the value of the pensionsAndAnnuities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionsAndAnnuities(String value) {
        this.pensionsAndAnnuities = value;
    }

    /**
     * Gets the value of the totalIRADistributions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalIRADistributions() {
        return totalIRADistributions;
    }

    /**
     * Sets the value of the totalIRADistributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalIRADistributions(String value) {
        this.totalIRADistributions = value;
    }

    /**
     * Gets the value of the totalPensionsAndAnnuities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPensionsAndAnnuities() {
        return totalPensionsAndAnnuities;
    }

    /**
     * Sets the value of the totalPensionsAndAnnuities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPensionsAndAnnuities(String value) {
        this.totalPensionsAndAnnuities = value;
    }

    /**
     * Gets the value of the farmIncomeOrLossScheduleF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmIncomeOrLossScheduleF() {
        return farmIncomeOrLossScheduleF;
    }

    /**
     * Sets the value of the farmIncomeOrLossScheduleF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmIncomeOrLossScheduleF(String value) {
        this.farmIncomeOrLossScheduleF = value;
    }

    /**
     * Gets the value of the socialSecurityBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityBenefits() {
        return socialSecurityBenefits;
    }

    /**
     * Sets the value of the socialSecurityBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityBenefits(String value) {
        this.socialSecurityBenefits = value;
    }

}
