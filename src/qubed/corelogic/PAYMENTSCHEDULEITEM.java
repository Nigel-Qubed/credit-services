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
 * PAYMENT SCHEDULE element contains the data fields necessary to reflect the payment stream on the TIL Disclosure document.
 * 
 * <p>Java class for PAYMENT_SCHEDULE_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_SCHEDULE_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentSchedulePaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PaymentSchedulePaymentsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PaymentSchedulePaymentStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PaymentSchedulePaymentVaryingToAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PaymentSchedulePrincipalAndInterestPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_SCHEDULE_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PAYMENT_SCHEDULE_ITEM", propOrder = {
    "paymentSchedulePaymentAmount",
    "paymentSchedulePaymentsCount",
    "paymentSchedulePaymentStartDate",
    "paymentSchedulePaymentVaryingToAmount",
    "paymentSchedulePrincipalAndInterestPaymentAmount",
    "extension"
})
public class PAYMENTSCHEDULEITEM {

    @XmlElementRef(name = "PaymentSchedulePaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> paymentSchedulePaymentAmount;
    @XmlElementRef(name = "PaymentSchedulePaymentsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> paymentSchedulePaymentsCount;
    @XmlElementRef(name = "PaymentSchedulePaymentStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> paymentSchedulePaymentStartDate;
    @XmlElementRef(name = "PaymentSchedulePaymentVaryingToAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> paymentSchedulePaymentVaryingToAmount;
    @XmlElementRef(name = "PaymentSchedulePrincipalAndInterestPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> paymentSchedulePrincipalAndInterestPaymentAmount;
    @XmlElement(name = "EXTENSION")
    protected PAYMENTSCHEDULEITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the paymentSchedulePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPaymentSchedulePaymentAmount() {
        return paymentSchedulePaymentAmount;
    }

    /**
     * Sets the value of the paymentSchedulePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPaymentSchedulePaymentAmount(JAXBElement<MISMOAmount> value) {
        this.paymentSchedulePaymentAmount = value;
    }

    /**
     * Gets the value of the paymentSchedulePaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPaymentSchedulePaymentsCount() {
        return paymentSchedulePaymentsCount;
    }

    /**
     * Sets the value of the paymentSchedulePaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPaymentSchedulePaymentsCount(JAXBElement<MISMOCount> value) {
        this.paymentSchedulePaymentsCount = value;
    }

    /**
     * Gets the value of the paymentSchedulePaymentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getPaymentSchedulePaymentStartDate() {
        return paymentSchedulePaymentStartDate;
    }

    /**
     * Sets the value of the paymentSchedulePaymentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setPaymentSchedulePaymentStartDate(JAXBElement<MISMODate> value) {
        this.paymentSchedulePaymentStartDate = value;
    }

    /**
     * Gets the value of the paymentSchedulePaymentVaryingToAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPaymentSchedulePaymentVaryingToAmount() {
        return paymentSchedulePaymentVaryingToAmount;
    }

    /**
     * Sets the value of the paymentSchedulePaymentVaryingToAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPaymentSchedulePaymentVaryingToAmount(JAXBElement<MISMOAmount> value) {
        this.paymentSchedulePaymentVaryingToAmount = value;
    }

    /**
     * Gets the value of the paymentSchedulePrincipalAndInterestPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPaymentSchedulePrincipalAndInterestPaymentAmount() {
        return paymentSchedulePrincipalAndInterestPaymentAmount;
    }

    /**
     * Sets the value of the paymentSchedulePrincipalAndInterestPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPaymentSchedulePrincipalAndInterestPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.paymentSchedulePrincipalAndInterestPaymentAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSCHEDULEITEMEXTENSION }
     *     
     */
    public PAYMENTSCHEDULEITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSCHEDULEITEMEXTENSION }
     *     
     */
    public void setEXTENSION(PAYMENTSCHEDULEITEMEXTENSION value) {
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
