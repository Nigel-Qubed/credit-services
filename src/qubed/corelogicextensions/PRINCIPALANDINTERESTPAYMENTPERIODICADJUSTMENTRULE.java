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
 * <p>Java class for PRINCIPAL_AND_INTEREST_PAYMENT_PERIODIC_ADJUSTMENT_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRINCIPAL_AND_INTEREST_PAYMENT_PERIODIC_ADJUSTMENT_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentRuleType" type="{http://www.mismo.org/residential/2009/schemas}AdjustmentRuleEnum" minOccurs="0"/>
 *         &lt;element name="PeriodicEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PeriodicEffectiveMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PrincipalAndInterestPaymentAnnualCapAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrincipalAndInterestRecastMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRINCIPAL_AND_INTEREST_PAYMENT_PERIODIC_ADJUSTMENT_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PRINCIPAL_AND_INTEREST_PAYMENT_PERIODIC_ADJUSTMENT_RULE", propOrder = {
    "adjustmentRuleType",
    "periodicEffectiveDate",
    "periodicEffectiveMonthsCount",
    "principalAndInterestPaymentAnnualCapAmount",
    "principalAndInterestRecastMonthsCount",
    "extension"
})
public class PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULE {

    @XmlElementRef(name = "AdjustmentRuleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AdjustmentRuleEnum> adjustmentRuleType;
    @XmlElementRef(name = "PeriodicEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> periodicEffectiveDate;
    @XmlElementRef(name = "PeriodicEffectiveMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> periodicEffectiveMonthsCount;
    @XmlElementRef(name = "PrincipalAndInterestPaymentAnnualCapAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> principalAndInterestPaymentAnnualCapAmount;
    @XmlElementRef(name = "PrincipalAndInterestRecastMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> principalAndInterestRecastMonthsCount;
    @XmlElement(name = "EXTENSION")
    protected PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adjustmentRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentRuleEnum }{@code >}
     *     
     */
    public JAXBElement<AdjustmentRuleEnum> getAdjustmentRuleType() {
        return adjustmentRuleType;
    }

    /**
     * Sets the value of the adjustmentRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentRuleEnum }{@code >}
     *     
     */
    public void setAdjustmentRuleType(JAXBElement<AdjustmentRuleEnum> value) {
        this.adjustmentRuleType = value;
    }

    /**
     * Gets the value of the periodicEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getPeriodicEffectiveDate() {
        return periodicEffectiveDate;
    }

    /**
     * Sets the value of the periodicEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setPeriodicEffectiveDate(JAXBElement<MISMODate> value) {
        this.periodicEffectiveDate = value;
    }

    /**
     * Gets the value of the periodicEffectiveMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPeriodicEffectiveMonthsCount() {
        return periodicEffectiveMonthsCount;
    }

    /**
     * Sets the value of the periodicEffectiveMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPeriodicEffectiveMonthsCount(JAXBElement<MISMOCount> value) {
        this.periodicEffectiveMonthsCount = value;
    }

    /**
     * Gets the value of the principalAndInterestPaymentAnnualCapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrincipalAndInterestPaymentAnnualCapAmount() {
        return principalAndInterestPaymentAnnualCapAmount;
    }

    /**
     * Sets the value of the principalAndInterestPaymentAnnualCapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrincipalAndInterestPaymentAnnualCapAmount(JAXBElement<MISMOAmount> value) {
        this.principalAndInterestPaymentAnnualCapAmount = value;
    }

    /**
     * Gets the value of the principalAndInterestRecastMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPrincipalAndInterestRecastMonthsCount() {
        return principalAndInterestRecastMonthsCount;
    }

    /**
     * Sets the value of the principalAndInterestRecastMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPrincipalAndInterestRecastMonthsCount(JAXBElement<MISMOCount> value) {
        this.principalAndInterestRecastMonthsCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULEEXTENSION }
     *     
     */
    public PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULEEXTENSION }
     *     
     */
    public void setEXTENSION(PRINCIPALANDINTERESTPAYMENTPERIODICADJUSTMENTRULEEXTENSION value) {
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
