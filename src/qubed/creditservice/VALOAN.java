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
@XmlRootElement(name = "VA_LOAN")
public class VALOAN {

    @XmlAttribute(name = "VABorrowerCoBorrowerMarriedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vaBorrowerCoBorrowerMarriedIndicator;
    @XmlAttribute(name = "BorrowerFundingFeePercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String borrowerFundingFeePercent;
    @XmlAttribute(name = "VAEntitlementAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaEntitlementAmount;
    @XmlAttribute(name = "VAMaintenanceExpenseMonthlyAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaMaintenanceExpenseMonthlyAmount;
    @XmlAttribute(name = "VAResidualIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaResidualIncomeAmount;
    @XmlAttribute(name = "VAUtilityExpenseMonthlyAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaUtilityExpenseMonthlyAmount;

    /**
     * Gets the value of the vaBorrowerCoBorrowerMarriedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVABorrowerCoBorrowerMarriedIndicator() {
        return vaBorrowerCoBorrowerMarriedIndicator;
    }

    /**
     * Sets the value of the vaBorrowerCoBorrowerMarriedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVABorrowerCoBorrowerMarriedIndicator(String value) {
        this.vaBorrowerCoBorrowerMarriedIndicator = value;
    }

    /**
     * Gets the value of the borrowerFundingFeePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerFundingFeePercent() {
        return borrowerFundingFeePercent;
    }

    /**
     * Sets the value of the borrowerFundingFeePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerFundingFeePercent(String value) {
        this.borrowerFundingFeePercent = value;
    }

    /**
     * Gets the value of the vaEntitlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAEntitlementAmount() {
        return vaEntitlementAmount;
    }

    /**
     * Sets the value of the vaEntitlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAEntitlementAmount(String value) {
        this.vaEntitlementAmount = value;
    }

    /**
     * Gets the value of the vaMaintenanceExpenseMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAMaintenanceExpenseMonthlyAmount() {
        return vaMaintenanceExpenseMonthlyAmount;
    }

    /**
     * Sets the value of the vaMaintenanceExpenseMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAMaintenanceExpenseMonthlyAmount(String value) {
        this.vaMaintenanceExpenseMonthlyAmount = value;
    }

    /**
     * Gets the value of the vaResidualIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAResidualIncomeAmount() {
        return vaResidualIncomeAmount;
    }

    /**
     * Sets the value of the vaResidualIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAResidualIncomeAmount(String value) {
        this.vaResidualIncomeAmount = value;
    }

    /**
     * Gets the value of the vaUtilityExpenseMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAUtilityExpenseMonthlyAmount() {
        return vaUtilityExpenseMonthlyAmount;
    }

    /**
     * Sets the value of the vaUtilityExpenseMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAUtilityExpenseMonthlyAmount(String value) {
        this.vaUtilityExpenseMonthlyAmount = value;
    }

}
