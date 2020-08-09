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
 * Describes the parameters and method for calculating the dollar amount of interest due for a particular purpose as defined in the Interest Calculation Purpose Type. This container can be used for both fixed and adjustable rate loans; it does not relate to calculating the value of the Interest Rate.
 * 
 * <p>Java class for INTEREST_CALCULATION_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTEREST_CALCULATION_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialUnearnedInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InterestAccrualType" type="{http://www.mismo.org/residential/2009/schemas}InterestAccrualEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationBasisDaysInPeriodType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationBasisDaysInPeriodEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationBasisDaysInPeriodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InterestCalculationBasisDaysInYearCountType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationBasisDaysInYearCountEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationBasisType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationBasisEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationBasisTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InterestCalculationEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InterestCalculationEffectiveMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="InterestCalculationExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InterestCalculationPeriodAdjustmentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InterestCalculationPeriodType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationPeriodEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationPurposeType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationPurposeEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationPurposeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InterestCalculationType" type="{http://www.mismo.org/residential/2009/schemas}InterestCalculationEnum" minOccurs="0"/>
 *         &lt;element name="InterestCalculationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InterestInAdvanceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LoanInterestAccrualStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INTEREST_CALCULATION_RULE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INTEREST_CALCULATION_RULE", propOrder = {
    "initialUnearnedInterestAmount",
    "interestAccrualType",
    "interestCalculationBasisDaysInPeriodType",
    "interestCalculationBasisDaysInPeriodTypeOtherDescription",
    "interestCalculationBasisDaysInYearCountType",
    "interestCalculationBasisType",
    "interestCalculationBasisTypeOtherDescription",
    "interestCalculationEffectiveDate",
    "interestCalculationEffectiveMonthsCount",
    "interestCalculationExpirationDate",
    "interestCalculationPeriodAdjustmentIndicator",
    "interestCalculationPeriodType",
    "interestCalculationPurposeType",
    "interestCalculationPurposeTypeOtherDescription",
    "interestCalculationType",
    "interestCalculationTypeOtherDescription",
    "interestInAdvanceIndicator",
    "loanInterestAccrualStartDate",
    "extension"
})
public class INTERESTCALCULATIONRULE {

    @XmlElementRef(name = "InitialUnearnedInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> initialUnearnedInterestAmount;
    @XmlElementRef(name = "InterestAccrualType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestAccrualEnum> interestAccrualType;
    @XmlElementRef(name = "InterestCalculationBasisDaysInPeriodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationBasisDaysInPeriodEnum> interestCalculationBasisDaysInPeriodType;
    @XmlElementRef(name = "InterestCalculationBasisDaysInPeriodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> interestCalculationBasisDaysInPeriodTypeOtherDescription;
    @XmlElementRef(name = "InterestCalculationBasisDaysInYearCountType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationBasisDaysInYearCountEnum> interestCalculationBasisDaysInYearCountType;
    @XmlElementRef(name = "InterestCalculationBasisType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationBasisEnum> interestCalculationBasisType;
    @XmlElementRef(name = "InterestCalculationBasisTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> interestCalculationBasisTypeOtherDescription;
    @XmlElementRef(name = "InterestCalculationEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> interestCalculationEffectiveDate;
    @XmlElementRef(name = "InterestCalculationEffectiveMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> interestCalculationEffectiveMonthsCount;
    @XmlElementRef(name = "InterestCalculationExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> interestCalculationExpirationDate;
    @XmlElementRef(name = "InterestCalculationPeriodAdjustmentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> interestCalculationPeriodAdjustmentIndicator;
    @XmlElementRef(name = "InterestCalculationPeriodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationPeriodEnum> interestCalculationPeriodType;
    @XmlElementRef(name = "InterestCalculationPurposeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationPurposeEnum> interestCalculationPurposeType;
    @XmlElementRef(name = "InterestCalculationPurposeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> interestCalculationPurposeTypeOtherDescription;
    @XmlElementRef(name = "InterestCalculationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InterestCalculationEnum> interestCalculationType;
    @XmlElementRef(name = "InterestCalculationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> interestCalculationTypeOtherDescription;
    @XmlElementRef(name = "InterestInAdvanceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> interestInAdvanceIndicator;
    @XmlElementRef(name = "LoanInterestAccrualStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanInterestAccrualStartDate;
    @XmlElement(name = "EXTENSION")
    protected INTERESTCALCULATIONRULEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the initialUnearnedInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInitialUnearnedInterestAmount() {
        return initialUnearnedInterestAmount;
    }

    /**
     * Sets the value of the initialUnearnedInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInitialUnearnedInterestAmount(JAXBElement<MISMOAmount> value) {
        this.initialUnearnedInterestAmount = value;
    }

    /**
     * Gets the value of the interestAccrualType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestAccrualEnum }{@code >}
     *     
     */
    public JAXBElement<InterestAccrualEnum> getInterestAccrualType() {
        return interestAccrualType;
    }

    /**
     * Sets the value of the interestAccrualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestAccrualEnum }{@code >}
     *     
     */
    public void setInterestAccrualType(JAXBElement<InterestAccrualEnum> value) {
        this.interestAccrualType = value;
    }

    /**
     * Gets the value of the interestCalculationBasisDaysInPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisDaysInPeriodEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationBasisDaysInPeriodEnum> getInterestCalculationBasisDaysInPeriodType() {
        return interestCalculationBasisDaysInPeriodType;
    }

    /**
     * Sets the value of the interestCalculationBasisDaysInPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisDaysInPeriodEnum }{@code >}
     *     
     */
    public void setInterestCalculationBasisDaysInPeriodType(JAXBElement<InterestCalculationBasisDaysInPeriodEnum> value) {
        this.interestCalculationBasisDaysInPeriodType = value;
    }

    /**
     * Gets the value of the interestCalculationBasisDaysInPeriodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInterestCalculationBasisDaysInPeriodTypeOtherDescription() {
        return interestCalculationBasisDaysInPeriodTypeOtherDescription;
    }

    /**
     * Sets the value of the interestCalculationBasisDaysInPeriodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInterestCalculationBasisDaysInPeriodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.interestCalculationBasisDaysInPeriodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the interestCalculationBasisDaysInYearCountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisDaysInYearCountEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationBasisDaysInYearCountEnum> getInterestCalculationBasisDaysInYearCountType() {
        return interestCalculationBasisDaysInYearCountType;
    }

    /**
     * Sets the value of the interestCalculationBasisDaysInYearCountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisDaysInYearCountEnum }{@code >}
     *     
     */
    public void setInterestCalculationBasisDaysInYearCountType(JAXBElement<InterestCalculationBasisDaysInYearCountEnum> value) {
        this.interestCalculationBasisDaysInYearCountType = value;
    }

    /**
     * Gets the value of the interestCalculationBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationBasisEnum> getInterestCalculationBasisType() {
        return interestCalculationBasisType;
    }

    /**
     * Sets the value of the interestCalculationBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationBasisEnum }{@code >}
     *     
     */
    public void setInterestCalculationBasisType(JAXBElement<InterestCalculationBasisEnum> value) {
        this.interestCalculationBasisType = value;
    }

    /**
     * Gets the value of the interestCalculationBasisTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInterestCalculationBasisTypeOtherDescription() {
        return interestCalculationBasisTypeOtherDescription;
    }

    /**
     * Sets the value of the interestCalculationBasisTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInterestCalculationBasisTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.interestCalculationBasisTypeOtherDescription = value;
    }

    /**
     * Gets the value of the interestCalculationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInterestCalculationEffectiveDate() {
        return interestCalculationEffectiveDate;
    }

    /**
     * Sets the value of the interestCalculationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInterestCalculationEffectiveDate(JAXBElement<MISMODate> value) {
        this.interestCalculationEffectiveDate = value;
    }

    /**
     * Gets the value of the interestCalculationEffectiveMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getInterestCalculationEffectiveMonthsCount() {
        return interestCalculationEffectiveMonthsCount;
    }

    /**
     * Sets the value of the interestCalculationEffectiveMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setInterestCalculationEffectiveMonthsCount(JAXBElement<MISMOCount> value) {
        this.interestCalculationEffectiveMonthsCount = value;
    }

    /**
     * Gets the value of the interestCalculationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInterestCalculationExpirationDate() {
        return interestCalculationExpirationDate;
    }

    /**
     * Sets the value of the interestCalculationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInterestCalculationExpirationDate(JAXBElement<MISMODate> value) {
        this.interestCalculationExpirationDate = value;
    }

    /**
     * Gets the value of the interestCalculationPeriodAdjustmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInterestCalculationPeriodAdjustmentIndicator() {
        return interestCalculationPeriodAdjustmentIndicator;
    }

    /**
     * Sets the value of the interestCalculationPeriodAdjustmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInterestCalculationPeriodAdjustmentIndicator(JAXBElement<MISMOIndicator> value) {
        this.interestCalculationPeriodAdjustmentIndicator = value;
    }

    /**
     * Gets the value of the interestCalculationPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationPeriodEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationPeriodEnum> getInterestCalculationPeriodType() {
        return interestCalculationPeriodType;
    }

    /**
     * Sets the value of the interestCalculationPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationPeriodEnum }{@code >}
     *     
     */
    public void setInterestCalculationPeriodType(JAXBElement<InterestCalculationPeriodEnum> value) {
        this.interestCalculationPeriodType = value;
    }

    /**
     * Gets the value of the interestCalculationPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationPurposeEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationPurposeEnum> getInterestCalculationPurposeType() {
        return interestCalculationPurposeType;
    }

    /**
     * Sets the value of the interestCalculationPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationPurposeEnum }{@code >}
     *     
     */
    public void setInterestCalculationPurposeType(JAXBElement<InterestCalculationPurposeEnum> value) {
        this.interestCalculationPurposeType = value;
    }

    /**
     * Gets the value of the interestCalculationPurposeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInterestCalculationPurposeTypeOtherDescription() {
        return interestCalculationPurposeTypeOtherDescription;
    }

    /**
     * Sets the value of the interestCalculationPurposeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInterestCalculationPurposeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.interestCalculationPurposeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the interestCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationEnum }{@code >}
     *     
     */
    public JAXBElement<InterestCalculationEnum> getInterestCalculationType() {
        return interestCalculationType;
    }

    /**
     * Sets the value of the interestCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterestCalculationEnum }{@code >}
     *     
     */
    public void setInterestCalculationType(JAXBElement<InterestCalculationEnum> value) {
        this.interestCalculationType = value;
    }

    /**
     * Gets the value of the interestCalculationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInterestCalculationTypeOtherDescription() {
        return interestCalculationTypeOtherDescription;
    }

    /**
     * Sets the value of the interestCalculationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInterestCalculationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.interestCalculationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the interestInAdvanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInterestInAdvanceIndicator() {
        return interestInAdvanceIndicator;
    }

    /**
     * Sets the value of the interestInAdvanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInterestInAdvanceIndicator(JAXBElement<MISMOIndicator> value) {
        this.interestInAdvanceIndicator = value;
    }

    /**
     * Gets the value of the loanInterestAccrualStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanInterestAccrualStartDate() {
        return loanInterestAccrualStartDate;
    }

    /**
     * Sets the value of the loanInterestAccrualStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanInterestAccrualStartDate(JAXBElement<MISMODate> value) {
        this.loanInterestAccrualStartDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INTERESTCALCULATIONRULEEXTENSION }
     *     
     */
    public INTERESTCALCULATIONRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERESTCALCULATIONRULEEXTENSION }
     *     
     */
    public void setEXTENSION(INTERESTCALCULATIONRULEEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
