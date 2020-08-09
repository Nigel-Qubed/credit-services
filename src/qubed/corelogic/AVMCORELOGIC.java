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
 * <p>Java class for AVM_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVM_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeAVMConfidenceScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVMHistoryType" type="{http://globalgateway.corelogic.com/order/2015}AVMHistoryEnum" minOccurs="0"/>
 *         &lt;element name="AVMMeanValueRangeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVMPassedAcceptanceCriteriaIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AVMReportIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVMReportRunDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AVMToEstimatedValuePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVRValueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalibratorScoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CascadingAVMReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CascadingAVMReportType" type="{http://globalgateway.corelogic.com/order/2015}CascadingAVMReportEnum" minOccurs="0"/>
 *         &lt;element name="CascadingAVMReportTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollateralScoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompValueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfidenceVarianceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FraudScoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLAValueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndexValueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LTVPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpotValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationCommentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVM_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "alternativeAVMConfidenceScoreValue",
    "avmHistoryType",
    "avmMeanValueRangeAmount",
    "avmPassedAcceptanceCriteriaIndicator",
    "avmReportIdentifier",
    "avmReportRunDate",
    "avmToEstimatedValuePercent",
    "avrValueAmount",
    "calibratorScoreIdentifier",
    "cascadingAVMReferenceIdentifier",
    "cascadingAVMReportType",
    "cascadingAVMReportTypeOtherDescription",
    "collateralScoreIdentifier",
    "compValueAmount",
    "confidenceVarianceAmount",
    "forecastValue",
    "fraudIndicator",
    "fraudScoreIdentifier",
    "glaValueAmount",
    "indexValueAmount",
    "ltvPercent",
    "spotValue",
    "valuationCommentIdentifier"
})
public class AVMCORELOGIC {

    @XmlElement(name = "AlternativeAVMConfidenceScoreValue")
    protected String alternativeAVMConfidenceScoreValue;
    @XmlElement(name = "AVMHistoryType")
    protected AVMHistoryEnum avmHistoryType;
    @XmlElement(name = "AVMMeanValueRangeAmount")
    protected String avmMeanValueRangeAmount;
    @XmlElement(name = "AVMPassedAcceptanceCriteriaIndicator")
    protected MISMOIndicator avmPassedAcceptanceCriteriaIndicator;
    @XmlElement(name = "AVMReportIdentifier")
    protected String avmReportIdentifier;
    @XmlElement(name = "AVMReportRunDate")
    protected MISMODate avmReportRunDate;
    @XmlElement(name = "AVMToEstimatedValuePercent")
    protected String avmToEstimatedValuePercent;
    @XmlElement(name = "AVRValueAmount")
    protected String avrValueAmount;
    @XmlElement(name = "CalibratorScoreIdentifier")
    protected String calibratorScoreIdentifier;
    @XmlElement(name = "CascadingAVMReferenceIdentifier")
    protected String cascadingAVMReferenceIdentifier;
    @XmlElement(name = "CascadingAVMReportType")
    protected CascadingAVMReportEnum cascadingAVMReportType;
    @XmlElement(name = "CascadingAVMReportTypeOtherDescription")
    protected String cascadingAVMReportTypeOtherDescription;
    @XmlElement(name = "CollateralScoreIdentifier")
    protected String collateralScoreIdentifier;
    @XmlElement(name = "CompValueAmount")
    protected String compValueAmount;
    @XmlElement(name = "ConfidenceVarianceAmount")
    protected String confidenceVarianceAmount;
    @XmlElement(name = "ForecastValue")
    protected String forecastValue;
    @XmlElement(name = "FraudIndicator")
    protected MISMOIndicator fraudIndicator;
    @XmlElement(name = "FraudScoreIdentifier")
    protected String fraudScoreIdentifier;
    @XmlElement(name = "GLAValueAmount")
    protected String glaValueAmount;
    @XmlElement(name = "IndexValueAmount")
    protected String indexValueAmount;
    @XmlElement(name = "LTVPercent")
    protected String ltvPercent;
    @XmlElement(name = "SpotValue")
    protected String spotValue;
    @XmlElement(name = "ValuationCommentIdentifier")
    protected String valuationCommentIdentifier;

    /**
     * Gets the value of the alternativeAVMConfidenceScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeAVMConfidenceScoreValue() {
        return alternativeAVMConfidenceScoreValue;
    }

    /**
     * Sets the value of the alternativeAVMConfidenceScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeAVMConfidenceScoreValue(String value) {
        this.alternativeAVMConfidenceScoreValue = value;
    }

    /**
     * Gets the value of the avmHistoryType property.
     * 
     * @return
     *     possible object is
     *     {@link AVMHistoryEnum }
     *     
     */
    public AVMHistoryEnum getAVMHistoryType() {
        return avmHistoryType;
    }

    /**
     * Sets the value of the avmHistoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVMHistoryEnum }
     *     
     */
    public void setAVMHistoryType(AVMHistoryEnum value) {
        this.avmHistoryType = value;
    }

    /**
     * Gets the value of the avmMeanValueRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVMMeanValueRangeAmount() {
        return avmMeanValueRangeAmount;
    }

    /**
     * Sets the value of the avmMeanValueRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVMMeanValueRangeAmount(String value) {
        this.avmMeanValueRangeAmount = value;
    }

    /**
     * Gets the value of the avmPassedAcceptanceCriteriaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getAVMPassedAcceptanceCriteriaIndicator() {
        return avmPassedAcceptanceCriteriaIndicator;
    }

    /**
     * Sets the value of the avmPassedAcceptanceCriteriaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setAVMPassedAcceptanceCriteriaIndicator(MISMOIndicator value) {
        this.avmPassedAcceptanceCriteriaIndicator = value;
    }

    /**
     * Gets the value of the avmReportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVMReportIdentifier() {
        return avmReportIdentifier;
    }

    /**
     * Sets the value of the avmReportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVMReportIdentifier(String value) {
        this.avmReportIdentifier = value;
    }

    /**
     * Gets the value of the avmReportRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getAVMReportRunDate() {
        return avmReportRunDate;
    }

    /**
     * Sets the value of the avmReportRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setAVMReportRunDate(MISMODate value) {
        this.avmReportRunDate = value;
    }

    /**
     * Gets the value of the avmToEstimatedValuePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVMToEstimatedValuePercent() {
        return avmToEstimatedValuePercent;
    }

    /**
     * Sets the value of the avmToEstimatedValuePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVMToEstimatedValuePercent(String value) {
        this.avmToEstimatedValuePercent = value;
    }

    /**
     * Gets the value of the avrValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVRValueAmount() {
        return avrValueAmount;
    }

    /**
     * Sets the value of the avrValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVRValueAmount(String value) {
        this.avrValueAmount = value;
    }

    /**
     * Gets the value of the calibratorScoreIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibratorScoreIdentifier() {
        return calibratorScoreIdentifier;
    }

    /**
     * Sets the value of the calibratorScoreIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibratorScoreIdentifier(String value) {
        this.calibratorScoreIdentifier = value;
    }

    /**
     * Gets the value of the cascadingAVMReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascadingAVMReferenceIdentifier() {
        return cascadingAVMReferenceIdentifier;
    }

    /**
     * Sets the value of the cascadingAVMReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascadingAVMReferenceIdentifier(String value) {
        this.cascadingAVMReferenceIdentifier = value;
    }

    /**
     * Gets the value of the cascadingAVMReportType property.
     * 
     * @return
     *     possible object is
     *     {@link CascadingAVMReportEnum }
     *     
     */
    public CascadingAVMReportEnum getCascadingAVMReportType() {
        return cascadingAVMReportType;
    }

    /**
     * Sets the value of the cascadingAVMReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadingAVMReportEnum }
     *     
     */
    public void setCascadingAVMReportType(CascadingAVMReportEnum value) {
        this.cascadingAVMReportType = value;
    }

    /**
     * Gets the value of the cascadingAVMReportTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascadingAVMReportTypeOtherDescription() {
        return cascadingAVMReportTypeOtherDescription;
    }

    /**
     * Sets the value of the cascadingAVMReportTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascadingAVMReportTypeOtherDescription(String value) {
        this.cascadingAVMReportTypeOtherDescription = value;
    }

    /**
     * Gets the value of the collateralScoreIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralScoreIdentifier() {
        return collateralScoreIdentifier;
    }

    /**
     * Sets the value of the collateralScoreIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralScoreIdentifier(String value) {
        this.collateralScoreIdentifier = value;
    }

    /**
     * Gets the value of the compValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompValueAmount() {
        return compValueAmount;
    }

    /**
     * Sets the value of the compValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompValueAmount(String value) {
        this.compValueAmount = value;
    }

    /**
     * Gets the value of the confidenceVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceVarianceAmount() {
        return confidenceVarianceAmount;
    }

    /**
     * Sets the value of the confidenceVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceVarianceAmount(String value) {
        this.confidenceVarianceAmount = value;
    }

    /**
     * Gets the value of the forecastValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastValue() {
        return forecastValue;
    }

    /**
     * Sets the value of the forecastValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastValue(String value) {
        this.forecastValue = value;
    }

    /**
     * Gets the value of the fraudIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * Sets the value of the fraudIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setFraudIndicator(MISMOIndicator value) {
        this.fraudIndicator = value;
    }

    /**
     * Gets the value of the fraudScoreIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudScoreIdentifier() {
        return fraudScoreIdentifier;
    }

    /**
     * Sets the value of the fraudScoreIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudScoreIdentifier(String value) {
        this.fraudScoreIdentifier = value;
    }

    /**
     * Gets the value of the glaValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLAValueAmount() {
        return glaValueAmount;
    }

    /**
     * Sets the value of the glaValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLAValueAmount(String value) {
        this.glaValueAmount = value;
    }

    /**
     * Gets the value of the indexValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexValueAmount() {
        return indexValueAmount;
    }

    /**
     * Sets the value of the indexValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexValueAmount(String value) {
        this.indexValueAmount = value;
    }

    /**
     * Gets the value of the ltvPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTVPercent() {
        return ltvPercent;
    }

    /**
     * Sets the value of the ltvPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTVPercent(String value) {
        this.ltvPercent = value;
    }

    /**
     * Gets the value of the spotValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpotValue() {
        return spotValue;
    }

    /**
     * Sets the value of the spotValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpotValue(String value) {
        this.spotValue = value;
    }

    /**
     * Gets the value of the valuationCommentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationCommentIdentifier() {
        return valuationCommentIdentifier;
    }

    /**
     * Sets the value of the valuationCommentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationCommentIdentifier(String value) {
        this.valuationCommentIdentifier = value;
    }

}