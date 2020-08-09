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
 * Information specific to any hazard insurance policy on the property that secures the loan. There may be multiple policies, such as homeowners, fire and extended coverage, flood, wind, or earthquake insurance.
 * 
 * <p>Java class for HAZARD_INSURANCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HAZARD_INSURANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FloodContractFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceCoverageAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceCoverageType" type="{http://www.mismo.org/residential/2009/schemas}HazardInsuranceCoverageEnum" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceCoverageTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceEscrowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceNextPremiumDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceNonStandardPolicyType" type="{http://www.mismo.org/residential/2009/schemas}HazardInsuranceNonStandardPolicyEnum" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceNonStandardPolicyTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HazardInsurancePolicyCancellationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HazardInsurancePolicyIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="HazardInsurancePremiumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HazardInsurancePremiumMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="HazardInsuranceReplacementValueIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InsuranceRequiredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HAZARD_INSURANCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HAZARD_INSURANCE", propOrder = {
    "floodContractFeeAmount",
    "hazardInsuranceCoverageAmount",
    "hazardInsuranceCoverageType",
    "hazardInsuranceCoverageTypeOtherDescription",
    "hazardInsuranceEffectiveDate",
    "hazardInsuranceEscrowedIndicator",
    "hazardInsuranceExpirationDate",
    "hazardInsuranceNextPremiumDueDate",
    "hazardInsuranceNonStandardPolicyType",
    "hazardInsuranceNonStandardPolicyTypeOtherDescription",
    "hazardInsurancePolicyCancellationDate",
    "hazardInsurancePolicyIdentifier",
    "hazardInsurancePremiumAmount",
    "hazardInsurancePremiumMonthsCount",
    "hazardInsuranceReplacementValueIndicator",
    "insuranceRequiredIndicator",
    "extension"
})
public class HAZARDINSURANCE {

    @XmlElementRef(name = "FloodContractFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> floodContractFeeAmount;
    @XmlElementRef(name = "HazardInsuranceCoverageAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> hazardInsuranceCoverageAmount;
    @XmlElementRef(name = "HazardInsuranceCoverageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HazardInsuranceCoverageEnum> hazardInsuranceCoverageType;
    @XmlElementRef(name = "HazardInsuranceCoverageTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hazardInsuranceCoverageTypeOtherDescription;
    @XmlElementRef(name = "HazardInsuranceEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hazardInsuranceEffectiveDate;
    @XmlElementRef(name = "HazardInsuranceEscrowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hazardInsuranceEscrowedIndicator;
    @XmlElementRef(name = "HazardInsuranceExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hazardInsuranceExpirationDate;
    @XmlElementRef(name = "HazardInsuranceNextPremiumDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hazardInsuranceNextPremiumDueDate;
    @XmlElementRef(name = "HazardInsuranceNonStandardPolicyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HazardInsuranceNonStandardPolicyEnum> hazardInsuranceNonStandardPolicyType;
    @XmlElementRef(name = "HazardInsuranceNonStandardPolicyTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hazardInsuranceNonStandardPolicyTypeOtherDescription;
    @XmlElementRef(name = "HazardInsurancePolicyCancellationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hazardInsurancePolicyCancellationDate;
    @XmlElementRef(name = "HazardInsurancePolicyIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> hazardInsurancePolicyIdentifier;
    @XmlElementRef(name = "HazardInsurancePremiumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> hazardInsurancePremiumAmount;
    @XmlElementRef(name = "HazardInsurancePremiumMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> hazardInsurancePremiumMonthsCount;
    @XmlElementRef(name = "HazardInsuranceReplacementValueIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hazardInsuranceReplacementValueIndicator;
    @XmlElementRef(name = "InsuranceRequiredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> insuranceRequiredIndicator;
    @XmlElement(name = "EXTENSION")
    protected HAZARDINSURANCEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the floodContractFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getFloodContractFeeAmount() {
        return floodContractFeeAmount;
    }

    /**
     * Sets the value of the floodContractFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setFloodContractFeeAmount(JAXBElement<MISMOAmount> value) {
        this.floodContractFeeAmount = value;
    }

    /**
     * Gets the value of the hazardInsuranceCoverageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHazardInsuranceCoverageAmount() {
        return hazardInsuranceCoverageAmount;
    }

    /**
     * Sets the value of the hazardInsuranceCoverageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHazardInsuranceCoverageAmount(JAXBElement<MISMOAmount> value) {
        this.hazardInsuranceCoverageAmount = value;
    }

    /**
     * Gets the value of the hazardInsuranceCoverageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HazardInsuranceCoverageEnum }{@code >}
     *     
     */
    public JAXBElement<HazardInsuranceCoverageEnum> getHazardInsuranceCoverageType() {
        return hazardInsuranceCoverageType;
    }

    /**
     * Sets the value of the hazardInsuranceCoverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HazardInsuranceCoverageEnum }{@code >}
     *     
     */
    public void setHazardInsuranceCoverageType(JAXBElement<HazardInsuranceCoverageEnum> value) {
        this.hazardInsuranceCoverageType = value;
    }

    /**
     * Gets the value of the hazardInsuranceCoverageTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHazardInsuranceCoverageTypeOtherDescription() {
        return hazardInsuranceCoverageTypeOtherDescription;
    }

    /**
     * Sets the value of the hazardInsuranceCoverageTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHazardInsuranceCoverageTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hazardInsuranceCoverageTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hazardInsuranceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHazardInsuranceEffectiveDate() {
        return hazardInsuranceEffectiveDate;
    }

    /**
     * Sets the value of the hazardInsuranceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHazardInsuranceEffectiveDate(JAXBElement<MISMODate> value) {
        this.hazardInsuranceEffectiveDate = value;
    }

    /**
     * Gets the value of the hazardInsuranceEscrowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHazardInsuranceEscrowedIndicator() {
        return hazardInsuranceEscrowedIndicator;
    }

    /**
     * Sets the value of the hazardInsuranceEscrowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHazardInsuranceEscrowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.hazardInsuranceEscrowedIndicator = value;
    }

    /**
     * Gets the value of the hazardInsuranceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHazardInsuranceExpirationDate() {
        return hazardInsuranceExpirationDate;
    }

    /**
     * Sets the value of the hazardInsuranceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHazardInsuranceExpirationDate(JAXBElement<MISMODate> value) {
        this.hazardInsuranceExpirationDate = value;
    }

    /**
     * Gets the value of the hazardInsuranceNextPremiumDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHazardInsuranceNextPremiumDueDate() {
        return hazardInsuranceNextPremiumDueDate;
    }

    /**
     * Sets the value of the hazardInsuranceNextPremiumDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHazardInsuranceNextPremiumDueDate(JAXBElement<MISMODate> value) {
        this.hazardInsuranceNextPremiumDueDate = value;
    }

    /**
     * Gets the value of the hazardInsuranceNonStandardPolicyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HazardInsuranceNonStandardPolicyEnum }{@code >}
     *     
     */
    public JAXBElement<HazardInsuranceNonStandardPolicyEnum> getHazardInsuranceNonStandardPolicyType() {
        return hazardInsuranceNonStandardPolicyType;
    }

    /**
     * Sets the value of the hazardInsuranceNonStandardPolicyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HazardInsuranceNonStandardPolicyEnum }{@code >}
     *     
     */
    public void setHazardInsuranceNonStandardPolicyType(JAXBElement<HazardInsuranceNonStandardPolicyEnum> value) {
        this.hazardInsuranceNonStandardPolicyType = value;
    }

    /**
     * Gets the value of the hazardInsuranceNonStandardPolicyTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHazardInsuranceNonStandardPolicyTypeOtherDescription() {
        return hazardInsuranceNonStandardPolicyTypeOtherDescription;
    }

    /**
     * Sets the value of the hazardInsuranceNonStandardPolicyTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHazardInsuranceNonStandardPolicyTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hazardInsuranceNonStandardPolicyTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hazardInsurancePolicyCancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHazardInsurancePolicyCancellationDate() {
        return hazardInsurancePolicyCancellationDate;
    }

    /**
     * Sets the value of the hazardInsurancePolicyCancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHazardInsurancePolicyCancellationDate(JAXBElement<MISMODate> value) {
        this.hazardInsurancePolicyCancellationDate = value;
    }

    /**
     * Gets the value of the hazardInsurancePolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getHazardInsurancePolicyIdentifier() {
        return hazardInsurancePolicyIdentifier;
    }

    /**
     * Sets the value of the hazardInsurancePolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setHazardInsurancePolicyIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.hazardInsurancePolicyIdentifier = value;
    }

    /**
     * Gets the value of the hazardInsurancePremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHazardInsurancePremiumAmount() {
        return hazardInsurancePremiumAmount;
    }

    /**
     * Sets the value of the hazardInsurancePremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHazardInsurancePremiumAmount(JAXBElement<MISMOAmount> value) {
        this.hazardInsurancePremiumAmount = value;
    }

    /**
     * Gets the value of the hazardInsurancePremiumMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getHazardInsurancePremiumMonthsCount() {
        return hazardInsurancePremiumMonthsCount;
    }

    /**
     * Sets the value of the hazardInsurancePremiumMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setHazardInsurancePremiumMonthsCount(JAXBElement<MISMOCount> value) {
        this.hazardInsurancePremiumMonthsCount = value;
    }

    /**
     * Gets the value of the hazardInsuranceReplacementValueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHazardInsuranceReplacementValueIndicator() {
        return hazardInsuranceReplacementValueIndicator;
    }

    /**
     * Sets the value of the hazardInsuranceReplacementValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHazardInsuranceReplacementValueIndicator(JAXBElement<MISMOIndicator> value) {
        this.hazardInsuranceReplacementValueIndicator = value;
    }

    /**
     * Gets the value of the insuranceRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInsuranceRequiredIndicator() {
        return insuranceRequiredIndicator;
    }

    /**
     * Sets the value of the insuranceRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInsuranceRequiredIndicator(JAXBElement<MISMOIndicator> value) {
        this.insuranceRequiredIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HAZARDINSURANCEEXTENSION }
     *     
     */
    public HAZARDINSURANCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HAZARDINSURANCEEXTENSION }
     *     
     */
    public void setEXTENSION(HAZARDINSURANCEEXTENSION value) {
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
