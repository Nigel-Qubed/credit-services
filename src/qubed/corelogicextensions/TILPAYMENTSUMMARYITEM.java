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
 * Represents details of a loan payment as reflected on the TIL Disclosure document.
 * 
 * <p>Java class for TIL_PAYMENT_SUMMARY_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIL_PAYMENT_SUMMARY_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TILEstimatedTotalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TILInterestPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TILInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="TILNegativeAmortizationFullPrincipalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TILNegativeAmortizationMinimumPrincipalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TILPaymentAdjustmentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TILPaymentSummaryItemType" type="{http://www.mismo.org/residential/2009/schemas}TILPaymentSummaryItemEnum" minOccurs="0"/>
 *         &lt;element name="TILPaymentSummaryItemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="TILPeriodDurationCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="TILPeriodDurationType" type="{http://www.mismo.org/residential/2009/schemas}TILPeriodDurationEnum" minOccurs="0"/>
 *         &lt;element name="TILPrincipalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TILTaxesAndInsuranceEscrowPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TIL_PAYMENT_SUMMARY_ITEM_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "TIL_PAYMENT_SUMMARY_ITEM", propOrder = {
    "tilEstimatedTotalPaymentAmount",
    "tilInterestPaymentAmount",
    "tilInterestRatePercent",
    "tilNegativeAmortizationFullPrincipalPaymentAmount",
    "tilNegativeAmortizationMinimumPrincipalPaymentAmount",
    "tilPaymentAdjustmentDate",
    "tilPaymentSummaryItemType",
    "tilPaymentSummaryItemTypeOtherDescription",
    "tilPeriodDurationCount",
    "tilPeriodDurationType",
    "tilPrincipalPaymentAmount",
    "tilTaxesAndInsuranceEscrowPaymentAmount",
    "extension"
})
public class TILPAYMENTSUMMARYITEM {

    @XmlElementRef(name = "TILEstimatedTotalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilEstimatedTotalPaymentAmount;
    @XmlElementRef(name = "TILInterestPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilInterestPaymentAmount;
    @XmlElementRef(name = "TILInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> tilInterestRatePercent;
    @XmlElementRef(name = "TILNegativeAmortizationFullPrincipalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilNegativeAmortizationFullPrincipalPaymentAmount;
    @XmlElementRef(name = "TILNegativeAmortizationMinimumPrincipalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilNegativeAmortizationMinimumPrincipalPaymentAmount;
    @XmlElementRef(name = "TILPaymentAdjustmentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> tilPaymentAdjustmentDate;
    @XmlElementRef(name = "TILPaymentSummaryItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<TILPaymentSummaryItemEnum> tilPaymentSummaryItemType;
    @XmlElementRef(name = "TILPaymentSummaryItemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> tilPaymentSummaryItemTypeOtherDescription;
    @XmlElementRef(name = "TILPeriodDurationCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> tilPeriodDurationCount;
    @XmlElementRef(name = "TILPeriodDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<TILPeriodDurationEnum> tilPeriodDurationType;
    @XmlElementRef(name = "TILPrincipalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilPrincipalPaymentAmount;
    @XmlElementRef(name = "TILTaxesAndInsuranceEscrowPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> tilTaxesAndInsuranceEscrowPaymentAmount;
    @XmlElement(name = "EXTENSION")
    protected TILPAYMENTSUMMARYITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the tilEstimatedTotalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILEstimatedTotalPaymentAmount() {
        return tilEstimatedTotalPaymentAmount;
    }

    /**
     * Sets the value of the tilEstimatedTotalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILEstimatedTotalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilEstimatedTotalPaymentAmount = value;
    }

    /**
     * Gets the value of the tilInterestPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILInterestPaymentAmount() {
        return tilInterestPaymentAmount;
    }

    /**
     * Sets the value of the tilInterestPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILInterestPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilInterestPaymentAmount = value;
    }

    /**
     * Gets the value of the tilInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getTILInterestRatePercent() {
        return tilInterestRatePercent;
    }

    /**
     * Sets the value of the tilInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setTILInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.tilInterestRatePercent = value;
    }

    /**
     * Gets the value of the tilNegativeAmortizationFullPrincipalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILNegativeAmortizationFullPrincipalPaymentAmount() {
        return tilNegativeAmortizationFullPrincipalPaymentAmount;
    }

    /**
     * Sets the value of the tilNegativeAmortizationFullPrincipalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILNegativeAmortizationFullPrincipalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilNegativeAmortizationFullPrincipalPaymentAmount = value;
    }

    /**
     * Gets the value of the tilNegativeAmortizationMinimumPrincipalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILNegativeAmortizationMinimumPrincipalPaymentAmount() {
        return tilNegativeAmortizationMinimumPrincipalPaymentAmount;
    }

    /**
     * Sets the value of the tilNegativeAmortizationMinimumPrincipalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILNegativeAmortizationMinimumPrincipalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilNegativeAmortizationMinimumPrincipalPaymentAmount = value;
    }

    /**
     * Gets the value of the tilPaymentAdjustmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getTILPaymentAdjustmentDate() {
        return tilPaymentAdjustmentDate;
    }

    /**
     * Sets the value of the tilPaymentAdjustmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setTILPaymentAdjustmentDate(JAXBElement<MISMODate> value) {
        this.tilPaymentAdjustmentDate = value;
    }

    /**
     * Gets the value of the tilPaymentSummaryItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TILPaymentSummaryItemEnum }{@code >}
     *     
     */
    public JAXBElement<TILPaymentSummaryItemEnum> getTILPaymentSummaryItemType() {
        return tilPaymentSummaryItemType;
    }

    /**
     * Sets the value of the tilPaymentSummaryItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TILPaymentSummaryItemEnum }{@code >}
     *     
     */
    public void setTILPaymentSummaryItemType(JAXBElement<TILPaymentSummaryItemEnum> value) {
        this.tilPaymentSummaryItemType = value;
    }

    /**
     * Gets the value of the tilPaymentSummaryItemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTILPaymentSummaryItemTypeOtherDescription() {
        return tilPaymentSummaryItemTypeOtherDescription;
    }

    /**
     * Sets the value of the tilPaymentSummaryItemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTILPaymentSummaryItemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.tilPaymentSummaryItemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the tilPeriodDurationCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getTILPeriodDurationCount() {
        return tilPeriodDurationCount;
    }

    /**
     * Sets the value of the tilPeriodDurationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setTILPeriodDurationCount(JAXBElement<MISMOCount> value) {
        this.tilPeriodDurationCount = value;
    }

    /**
     * Gets the value of the tilPeriodDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TILPeriodDurationEnum }{@code >}
     *     
     */
    public JAXBElement<TILPeriodDurationEnum> getTILPeriodDurationType() {
        return tilPeriodDurationType;
    }

    /**
     * Sets the value of the tilPeriodDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TILPeriodDurationEnum }{@code >}
     *     
     */
    public void setTILPeriodDurationType(JAXBElement<TILPeriodDurationEnum> value) {
        this.tilPeriodDurationType = value;
    }

    /**
     * Gets the value of the tilPrincipalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILPrincipalPaymentAmount() {
        return tilPrincipalPaymentAmount;
    }

    /**
     * Sets the value of the tilPrincipalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILPrincipalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilPrincipalPaymentAmount = value;
    }

    /**
     * Gets the value of the tilTaxesAndInsuranceEscrowPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTILTaxesAndInsuranceEscrowPaymentAmount() {
        return tilTaxesAndInsuranceEscrowPaymentAmount;
    }

    /**
     * Sets the value of the tilTaxesAndInsuranceEscrowPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTILTaxesAndInsuranceEscrowPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.tilTaxesAndInsuranceEscrowPaymentAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TILPAYMENTSUMMARYITEMEXTENSION }
     *     
     */
    public TILPAYMENTSUMMARYITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TILPAYMENTSUMMARYITEMEXTENSION }
     *     
     */
    public void setEXTENSION(TILPAYMENTSUMMARYITEMEXTENSION value) {
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
