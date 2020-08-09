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
 * <p>Java class for CONSTRUCTION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONSTRUCTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstructionImprovementCostsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ConstructionLoanEstimatedInterestCalculationMethodType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionLoanEstimatedInterestCalculationMethodEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionLoanInterestReserveAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ConstructionLoanTotalTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ConstructionLoanType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionLoanEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionPeriodInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConstructionPeriodNumberOfMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentFrequencyType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionPhaseInterestPaymentFrequencyEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentFrequencyTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentMethodType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionPhaseInterestPaymentMethodEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionPhaseInterestPaymentEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionPhaseInterestPaymentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentClosingFeatureType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionToPermanentClosingFeatureEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentClosingFeatureTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentClosingType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionToPermanentClosingEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentClosingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentFirstPaymentDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentRecertificationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ConstructionToPermanentRecertificationValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LandAppraisedValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LandEstimatedValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LandOriginalCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CONSTRUCTION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CONSTRUCTION", propOrder = {
    "constructionImprovementCostsAmount",
    "constructionLoanEstimatedInterestCalculationMethodType",
    "constructionLoanInterestReserveAmount",
    "constructionLoanTotalTermMonthsCount",
    "constructionLoanType",
    "constructionPeriodInterestRatePercent",
    "constructionPeriodNumberOfMonthsCount",
    "constructionPhaseInterestPaymentFrequencyType",
    "constructionPhaseInterestPaymentFrequencyTypeOtherDescription",
    "constructionPhaseInterestPaymentMethodType",
    "constructionPhaseInterestPaymentMethodTypeOtherDescription",
    "constructionPhaseInterestPaymentType",
    "constructionPhaseInterestPaymentTypeOtherDescription",
    "constructionToPermanentClosingFeatureType",
    "constructionToPermanentClosingFeatureTypeOtherDescription",
    "constructionToPermanentClosingType",
    "constructionToPermanentClosingTypeOtherDescription",
    "constructionToPermanentFirstPaymentDueDate",
    "constructionToPermanentRecertificationDate",
    "constructionToPermanentRecertificationValueAmount",
    "landAppraisedValueAmount",
    "landEstimatedValueAmount",
    "landOriginalCostAmount",
    "extension"
})
public class CONSTRUCTION {

    @XmlElementRef(name = "ConstructionImprovementCostsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> constructionImprovementCostsAmount;
    @XmlElementRef(name = "ConstructionLoanEstimatedInterestCalculationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionLoanEstimatedInterestCalculationMethodEnum> constructionLoanEstimatedInterestCalculationMethodType;
    @XmlElementRef(name = "ConstructionLoanInterestReserveAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> constructionLoanInterestReserveAmount;
    @XmlElementRef(name = "ConstructionLoanTotalTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> constructionLoanTotalTermMonthsCount;
    @XmlElementRef(name = "ConstructionLoanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionLoanEnum> constructionLoanType;
    @XmlElementRef(name = "ConstructionPeriodInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> constructionPeriodInterestRatePercent;
    @XmlElementRef(name = "ConstructionPeriodNumberOfMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> constructionPeriodNumberOfMonthsCount;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentFrequencyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionPhaseInterestPaymentFrequencyEnum> constructionPhaseInterestPaymentFrequencyType;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentFrequencyTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionPhaseInterestPaymentFrequencyTypeOtherDescription;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionPhaseInterestPaymentMethodEnum> constructionPhaseInterestPaymentMethodType;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionPhaseInterestPaymentMethodTypeOtherDescription;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionPhaseInterestPaymentEnum> constructionPhaseInterestPaymentType;
    @XmlElementRef(name = "ConstructionPhaseInterestPaymentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionPhaseInterestPaymentTypeOtherDescription;
    @XmlElementRef(name = "ConstructionToPermanentClosingFeatureType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionToPermanentClosingFeatureEnum> constructionToPermanentClosingFeatureType;
    @XmlElementRef(name = "ConstructionToPermanentClosingFeatureTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionToPermanentClosingFeatureTypeOtherDescription;
    @XmlElementRef(name = "ConstructionToPermanentClosingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionToPermanentClosingEnum> constructionToPermanentClosingType;
    @XmlElementRef(name = "ConstructionToPermanentClosingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionToPermanentClosingTypeOtherDescription;
    @XmlElementRef(name = "ConstructionToPermanentFirstPaymentDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> constructionToPermanentFirstPaymentDueDate;
    @XmlElementRef(name = "ConstructionToPermanentRecertificationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> constructionToPermanentRecertificationDate;
    @XmlElementRef(name = "ConstructionToPermanentRecertificationValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> constructionToPermanentRecertificationValueAmount;
    @XmlElementRef(name = "LandAppraisedValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> landAppraisedValueAmount;
    @XmlElementRef(name = "LandEstimatedValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> landEstimatedValueAmount;
    @XmlElementRef(name = "LandOriginalCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> landOriginalCostAmount;
    @XmlElement(name = "EXTENSION")
    protected CONSTRUCTIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the constructionImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getConstructionImprovementCostsAmount() {
        return constructionImprovementCostsAmount;
    }

    /**
     * Sets the value of the constructionImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setConstructionImprovementCostsAmount(JAXBElement<MISMOAmount> value) {
        this.constructionImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the constructionLoanEstimatedInterestCalculationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionLoanEstimatedInterestCalculationMethodEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionLoanEstimatedInterestCalculationMethodEnum> getConstructionLoanEstimatedInterestCalculationMethodType() {
        return constructionLoanEstimatedInterestCalculationMethodType;
    }

    /**
     * Sets the value of the constructionLoanEstimatedInterestCalculationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionLoanEstimatedInterestCalculationMethodEnum }{@code >}
     *     
     */
    public void setConstructionLoanEstimatedInterestCalculationMethodType(JAXBElement<ConstructionLoanEstimatedInterestCalculationMethodEnum> value) {
        this.constructionLoanEstimatedInterestCalculationMethodType = value;
    }

    /**
     * Gets the value of the constructionLoanInterestReserveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getConstructionLoanInterestReserveAmount() {
        return constructionLoanInterestReserveAmount;
    }

    /**
     * Sets the value of the constructionLoanInterestReserveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setConstructionLoanInterestReserveAmount(JAXBElement<MISMOAmount> value) {
        this.constructionLoanInterestReserveAmount = value;
    }

    /**
     * Gets the value of the constructionLoanTotalTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getConstructionLoanTotalTermMonthsCount() {
        return constructionLoanTotalTermMonthsCount;
    }

    /**
     * Sets the value of the constructionLoanTotalTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setConstructionLoanTotalTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.constructionLoanTotalTermMonthsCount = value;
    }

    /**
     * Gets the value of the constructionLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionLoanEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionLoanEnum> getConstructionLoanType() {
        return constructionLoanType;
    }

    /**
     * Sets the value of the constructionLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionLoanEnum }{@code >}
     *     
     */
    public void setConstructionLoanType(JAXBElement<ConstructionLoanEnum> value) {
        this.constructionLoanType = value;
    }

    /**
     * Gets the value of the constructionPeriodInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConstructionPeriodInterestRatePercent() {
        return constructionPeriodInterestRatePercent;
    }

    /**
     * Sets the value of the constructionPeriodInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConstructionPeriodInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.constructionPeriodInterestRatePercent = value;
    }

    /**
     * Gets the value of the constructionPeriodNumberOfMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getConstructionPeriodNumberOfMonthsCount() {
        return constructionPeriodNumberOfMonthsCount;
    }

    /**
     * Sets the value of the constructionPeriodNumberOfMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setConstructionPeriodNumberOfMonthsCount(JAXBElement<MISMOCount> value) {
        this.constructionPeriodNumberOfMonthsCount = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentFrequencyEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionPhaseInterestPaymentFrequencyEnum> getConstructionPhaseInterestPaymentFrequencyType() {
        return constructionPhaseInterestPaymentFrequencyType;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentFrequencyEnum }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentFrequencyType(JAXBElement<ConstructionPhaseInterestPaymentFrequencyEnum> value) {
        this.constructionPhaseInterestPaymentFrequencyType = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentFrequencyTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConstructionPhaseInterestPaymentFrequencyTypeOtherDescription() {
        return constructionPhaseInterestPaymentFrequencyTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentFrequencyTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentFrequencyTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionPhaseInterestPaymentFrequencyTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentMethodEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionPhaseInterestPaymentMethodEnum> getConstructionPhaseInterestPaymentMethodType() {
        return constructionPhaseInterestPaymentMethodType;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentMethodEnum }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentMethodType(JAXBElement<ConstructionPhaseInterestPaymentMethodEnum> value) {
        this.constructionPhaseInterestPaymentMethodType = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConstructionPhaseInterestPaymentMethodTypeOtherDescription() {
        return constructionPhaseInterestPaymentMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionPhaseInterestPaymentMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionPhaseInterestPaymentEnum> getConstructionPhaseInterestPaymentType() {
        return constructionPhaseInterestPaymentType;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionPhaseInterestPaymentEnum }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentType(JAXBElement<ConstructionPhaseInterestPaymentEnum> value) {
        this.constructionPhaseInterestPaymentType = value;
    }

    /**
     * Gets the value of the constructionPhaseInterestPaymentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConstructionPhaseInterestPaymentTypeOtherDescription() {
        return constructionPhaseInterestPaymentTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionPhaseInterestPaymentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConstructionPhaseInterestPaymentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionPhaseInterestPaymentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionToPermanentClosingFeatureEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionToPermanentClosingFeatureEnum> getConstructionToPermanentClosingFeatureType() {
        return constructionToPermanentClosingFeatureType;
    }

    /**
     * Sets the value of the constructionToPermanentClosingFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionToPermanentClosingFeatureEnum }{@code >}
     *     
     */
    public void setConstructionToPermanentClosingFeatureType(JAXBElement<ConstructionToPermanentClosingFeatureEnum> value) {
        this.constructionToPermanentClosingFeatureType = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingFeatureTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConstructionToPermanentClosingFeatureTypeOtherDescription() {
        return constructionToPermanentClosingFeatureTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionToPermanentClosingFeatureTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConstructionToPermanentClosingFeatureTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionToPermanentClosingFeatureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionToPermanentClosingEnum }{@code >}
     *     
     */
    public JAXBElement<ConstructionToPermanentClosingEnum> getConstructionToPermanentClosingType() {
        return constructionToPermanentClosingType;
    }

    /**
     * Sets the value of the constructionToPermanentClosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionToPermanentClosingEnum }{@code >}
     *     
     */
    public void setConstructionToPermanentClosingType(JAXBElement<ConstructionToPermanentClosingEnum> value) {
        this.constructionToPermanentClosingType = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConstructionToPermanentClosingTypeOtherDescription() {
        return constructionToPermanentClosingTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionToPermanentClosingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConstructionToPermanentClosingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionToPermanentClosingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionToPermanentFirstPaymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getConstructionToPermanentFirstPaymentDueDate() {
        return constructionToPermanentFirstPaymentDueDate;
    }

    /**
     * Sets the value of the constructionToPermanentFirstPaymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setConstructionToPermanentFirstPaymentDueDate(JAXBElement<MISMODate> value) {
        this.constructionToPermanentFirstPaymentDueDate = value;
    }

    /**
     * Gets the value of the constructionToPermanentRecertificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getConstructionToPermanentRecertificationDate() {
        return constructionToPermanentRecertificationDate;
    }

    /**
     * Sets the value of the constructionToPermanentRecertificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setConstructionToPermanentRecertificationDate(JAXBElement<MISMODate> value) {
        this.constructionToPermanentRecertificationDate = value;
    }

    /**
     * Gets the value of the constructionToPermanentRecertificationValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getConstructionToPermanentRecertificationValueAmount() {
        return constructionToPermanentRecertificationValueAmount;
    }

    /**
     * Sets the value of the constructionToPermanentRecertificationValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setConstructionToPermanentRecertificationValueAmount(JAXBElement<MISMOAmount> value) {
        this.constructionToPermanentRecertificationValueAmount = value;
    }

    /**
     * Gets the value of the landAppraisedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLandAppraisedValueAmount() {
        return landAppraisedValueAmount;
    }

    /**
     * Sets the value of the landAppraisedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLandAppraisedValueAmount(JAXBElement<MISMOAmount> value) {
        this.landAppraisedValueAmount = value;
    }

    /**
     * Gets the value of the landEstimatedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLandEstimatedValueAmount() {
        return landEstimatedValueAmount;
    }

    /**
     * Sets the value of the landEstimatedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLandEstimatedValueAmount(JAXBElement<MISMOAmount> value) {
        this.landEstimatedValueAmount = value;
    }

    /**
     * Gets the value of the landOriginalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLandOriginalCostAmount() {
        return landOriginalCostAmount;
    }

    /**
     * Sets the value of the landOriginalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLandOriginalCostAmount(JAXBElement<MISMOAmount> value) {
        this.landOriginalCostAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CONSTRUCTIONEXTENSION }
     *     
     */
    public CONSTRUCTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTRUCTIONEXTENSION }
     *     
     */
    public void setEXTENSION(CONSTRUCTIONEXTENSION value) {
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
