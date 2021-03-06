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
@XmlRootElement(name = "CONSTRUCTION_REFINANCE_DATA")
public class CONSTRUCTIONREFINANCEDATA {

    @XmlAttribute(name = "ConstructionImprovementCostsAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String constructionImprovementCostsAmount;
    @XmlAttribute(name = "ConstructionPurposeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String constructionPurposeType;
    @XmlAttribute(name = "FRECashOutAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String freCashOutAmount;
    @XmlAttribute(name = "GSERefinancePurposeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gseRefinancePurposeType;
    @XmlAttribute(name = "LandEstimatedValueAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String landEstimatedValueAmount;
    @XmlAttribute(name = "LandOriginalCostAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String landOriginalCostAmount;
    @XmlAttribute(name = "PropertyAcquiredYear")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String propertyAcquiredYear;
    @XmlAttribute(name = "PropertyExistingLienAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String propertyExistingLienAmount;
    @XmlAttribute(name = "PropertyOriginalCostAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String propertyOriginalCostAmount;
    @XmlAttribute(name = "RefinanceImprovementCostsAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String refinanceImprovementCostsAmount;
    @XmlAttribute(name = "RefinanceImprovementsType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refinanceImprovementsType;
    @XmlAttribute(name = "RefinanceProposedImprovementsDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String refinanceProposedImprovementsDescription;
    @XmlAttribute(name = "SecondaryFinancingRefinanceIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String secondaryFinancingRefinanceIndicator;
    @XmlAttribute(name = "FNMSecondMortgageFinancingOriginalPropertyIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fnmSecondMortgageFinancingOriginalPropertyIndicator;
    @XmlAttribute(name = "StructuralAlterationsConventionalAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String structuralAlterationsConventionalAmount;
    @XmlAttribute(name = "NonStructuralAlterationsConventionalAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nonStructuralAlterationsConventionalAmount;

    /**
     * Gets the value of the constructionImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionImprovementCostsAmount() {
        return constructionImprovementCostsAmount;
    }

    /**
     * Sets the value of the constructionImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionImprovementCostsAmount(String value) {
        this.constructionImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the constructionPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionPurposeType() {
        return constructionPurposeType;
    }

    /**
     * Sets the value of the constructionPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionPurposeType(String value) {
        this.constructionPurposeType = value;
    }

    /**
     * Gets the value of the freCashOutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRECashOutAmount() {
        return freCashOutAmount;
    }

    /**
     * Sets the value of the freCashOutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRECashOutAmount(String value) {
        this.freCashOutAmount = value;
    }

    /**
     * Gets the value of the gseRefinancePurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSERefinancePurposeType() {
        return gseRefinancePurposeType;
    }

    /**
     * Sets the value of the gseRefinancePurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSERefinancePurposeType(String value) {
        this.gseRefinancePurposeType = value;
    }

    /**
     * Gets the value of the landEstimatedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandEstimatedValueAmount() {
        return landEstimatedValueAmount;
    }

    /**
     * Sets the value of the landEstimatedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandEstimatedValueAmount(String value) {
        this.landEstimatedValueAmount = value;
    }

    /**
     * Gets the value of the landOriginalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandOriginalCostAmount() {
        return landOriginalCostAmount;
    }

    /**
     * Sets the value of the landOriginalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandOriginalCostAmount(String value) {
        this.landOriginalCostAmount = value;
    }

    /**
     * Gets the value of the propertyAcquiredYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAcquiredYear() {
        return propertyAcquiredYear;
    }

    /**
     * Sets the value of the propertyAcquiredYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAcquiredYear(String value) {
        this.propertyAcquiredYear = value;
    }

    /**
     * Gets the value of the propertyExistingLienAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyExistingLienAmount() {
        return propertyExistingLienAmount;
    }

    /**
     * Sets the value of the propertyExistingLienAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyExistingLienAmount(String value) {
        this.propertyExistingLienAmount = value;
    }

    /**
     * Gets the value of the propertyOriginalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyOriginalCostAmount() {
        return propertyOriginalCostAmount;
    }

    /**
     * Sets the value of the propertyOriginalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyOriginalCostAmount(String value) {
        this.propertyOriginalCostAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinanceImprovementCostsAmount() {
        return refinanceImprovementCostsAmount;
    }

    /**
     * Sets the value of the refinanceImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinanceImprovementCostsAmount(String value) {
        this.refinanceImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinanceImprovementsType() {
        return refinanceImprovementsType;
    }

    /**
     * Sets the value of the refinanceImprovementsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinanceImprovementsType(String value) {
        this.refinanceImprovementsType = value;
    }

    /**
     * Gets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinanceProposedImprovementsDescription() {
        return refinanceProposedImprovementsDescription;
    }

    /**
     * Sets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinanceProposedImprovementsDescription(String value) {
        this.refinanceProposedImprovementsDescription = value;
    }

    /**
     * Gets the value of the secondaryFinancingRefinanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryFinancingRefinanceIndicator() {
        return secondaryFinancingRefinanceIndicator;
    }

    /**
     * Sets the value of the secondaryFinancingRefinanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryFinancingRefinanceIndicator(String value) {
        this.secondaryFinancingRefinanceIndicator = value;
    }

    /**
     * Gets the value of the fnmSecondMortgageFinancingOriginalPropertyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMSecondMortgageFinancingOriginalPropertyIndicator() {
        return fnmSecondMortgageFinancingOriginalPropertyIndicator;
    }

    /**
     * Sets the value of the fnmSecondMortgageFinancingOriginalPropertyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMSecondMortgageFinancingOriginalPropertyIndicator(String value) {
        this.fnmSecondMortgageFinancingOriginalPropertyIndicator = value;
    }

    /**
     * Gets the value of the structuralAlterationsConventionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructuralAlterationsConventionalAmount() {
        return structuralAlterationsConventionalAmount;
    }

    /**
     * Sets the value of the structuralAlterationsConventionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructuralAlterationsConventionalAmount(String value) {
        this.structuralAlterationsConventionalAmount = value;
    }

    /**
     * Gets the value of the nonStructuralAlterationsConventionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStructuralAlterationsConventionalAmount() {
        return nonStructuralAlterationsConventionalAmount;
    }

    /**
     * Sets the value of the nonStructuralAlterationsConventionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStructuralAlterationsConventionalAmount(String value) {
        this.nonStructuralAlterationsConventionalAmount = value;
    }

}
