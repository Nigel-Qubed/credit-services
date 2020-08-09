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
@XmlRootElement(name = "AFFORDABLE_LENDING")
public class AFFORDABLELENDING {

    @XmlAttribute(name = "FNMCommunityLendingProductName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmCommunityLendingProductName;
    @XmlAttribute(name = "FNMCommunityLendingProductType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fnmCommunityLendingProductType;
    @XmlAttribute(name = "FNMCommunityLendingProductTypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmCommunityLendingProductTypeOtherDescription;
    @XmlAttribute(name = "FNMCommunitySecondsIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fnmCommunitySecondsIndicator;
    @XmlAttribute(name = "FNMNeighborsMortgageEligibilityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fnmNeighborsMortgageEligibilityIndicator;
    @XmlAttribute(name = "FREAffordableProgramIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String freAffordableProgramIdentifier;
    @XmlAttribute(name = "HUDIncomeLimitAdjustmentFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hudIncomeLimitAdjustmentFactor;
    @XmlAttribute(name = "HUDLendingIncomeLimitAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hudLendingIncomeLimitAmount;
    @XmlAttribute(name = "HUDMedianIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hudMedianIncomeAmount;
    @XmlAttribute(name = "MSAIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String msaIdentifier;

    /**
     * Gets the value of the fnmCommunityLendingProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMCommunityLendingProductName() {
        return fnmCommunityLendingProductName;
    }

    /**
     * Sets the value of the fnmCommunityLendingProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMCommunityLendingProductName(String value) {
        this.fnmCommunityLendingProductName = value;
    }

    /**
     * Gets the value of the fnmCommunityLendingProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMCommunityLendingProductType() {
        return fnmCommunityLendingProductType;
    }

    /**
     * Sets the value of the fnmCommunityLendingProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMCommunityLendingProductType(String value) {
        this.fnmCommunityLendingProductType = value;
    }

    /**
     * Gets the value of the fnmCommunityLendingProductTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMCommunityLendingProductTypeOtherDescription() {
        return fnmCommunityLendingProductTypeOtherDescription;
    }

    /**
     * Sets the value of the fnmCommunityLendingProductTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMCommunityLendingProductTypeOtherDescription(String value) {
        this.fnmCommunityLendingProductTypeOtherDescription = value;
    }

    /**
     * Gets the value of the fnmCommunitySecondsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMCommunitySecondsIndicator() {
        return fnmCommunitySecondsIndicator;
    }

    /**
     * Sets the value of the fnmCommunitySecondsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMCommunitySecondsIndicator(String value) {
        this.fnmCommunitySecondsIndicator = value;
    }

    /**
     * Gets the value of the fnmNeighborsMortgageEligibilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMNeighborsMortgageEligibilityIndicator() {
        return fnmNeighborsMortgageEligibilityIndicator;
    }

    /**
     * Sets the value of the fnmNeighborsMortgageEligibilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMNeighborsMortgageEligibilityIndicator(String value) {
        this.fnmNeighborsMortgageEligibilityIndicator = value;
    }

    /**
     * Gets the value of the freAffordableProgramIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREAffordableProgramIdentifier() {
        return freAffordableProgramIdentifier;
    }

    /**
     * Sets the value of the freAffordableProgramIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREAffordableProgramIdentifier(String value) {
        this.freAffordableProgramIdentifier = value;
    }

    /**
     * Gets the value of the hudIncomeLimitAdjustmentFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDIncomeLimitAdjustmentFactor() {
        return hudIncomeLimitAdjustmentFactor;
    }

    /**
     * Sets the value of the hudIncomeLimitAdjustmentFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDIncomeLimitAdjustmentFactor(String value) {
        this.hudIncomeLimitAdjustmentFactor = value;
    }

    /**
     * Gets the value of the hudLendingIncomeLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDLendingIncomeLimitAmount() {
        return hudLendingIncomeLimitAmount;
    }

    /**
     * Sets the value of the hudLendingIncomeLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDLendingIncomeLimitAmount(String value) {
        this.hudLendingIncomeLimitAmount = value;
    }

    /**
     * Gets the value of the hudMedianIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDMedianIncomeAmount() {
        return hudMedianIncomeAmount;
    }

    /**
     * Sets the value of the hudMedianIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDMedianIncomeAmount(String value) {
        this.hudMedianIncomeAmount = value;
    }

    /**
     * Gets the value of the msaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSAIdentifier() {
        return msaIdentifier;
    }

    /**
     * Sets the value of the msaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSAIdentifier(String value) {
        this.msaIdentifier = value;
    }

}
