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
 * Contains information about a projected loan payment or a component of a projected loan payment.
 * 
 * <p>Java class for PROJECTED_PAYMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECTED_PAYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentFrequencyType" type="{http://www.mismo.org/residential/2009/schemas}PaymentFrequencyEnum" minOccurs="0"/>
 *         &lt;element name="PaymentFrequencyTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentCalculationPeriodEndNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentCalculationPeriodStartNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentCalculationPeriodTermType" type="{http://www.mismo.org/residential/2009/schemas}ProjectedPaymentCalculationPeriodTermEnum" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentCalculationPeriodTermTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentEstimatedEscrowPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentEstimatedTotalMaximumPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentEstimatedTotalMinimumPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentMIPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentPrincipalAndInterestMaximumPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectedPaymentPrincipalAndInterestMinimumPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROJECTED_PAYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROJECTED_PAYMENT", propOrder = {
    "paymentFrequencyType",
    "paymentFrequencyTypeOtherDescription",
    "projectedPaymentCalculationPeriodEndNumber",
    "projectedPaymentCalculationPeriodStartNumber",
    "projectedPaymentCalculationPeriodTermType",
    "projectedPaymentCalculationPeriodTermTypeOtherDescription",
    "projectedPaymentEstimatedEscrowPaymentAmount",
    "projectedPaymentEstimatedTotalMaximumPaymentAmount",
    "projectedPaymentEstimatedTotalMinimumPaymentAmount",
    "projectedPaymentMIPaymentAmount",
    "projectedPaymentPrincipalAndInterestMaximumPaymentAmount",
    "projectedPaymentPrincipalAndInterestMinimumPaymentAmount",
    "extension"
})
public class PROJECTEDPAYMENT {

    @XmlElementRef(name = "PaymentFrequencyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentFrequencyEnum> paymentFrequencyType;
    @XmlElementRef(name = "PaymentFrequencyTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> paymentFrequencyTypeOtherDescription;
    @XmlElementRef(name = "ProjectedPaymentCalculationPeriodEndNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> projectedPaymentCalculationPeriodEndNumber;
    @XmlElementRef(name = "ProjectedPaymentCalculationPeriodStartNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> projectedPaymentCalculationPeriodStartNumber;
    @XmlElementRef(name = "ProjectedPaymentCalculationPeriodTermType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectedPaymentCalculationPeriodTermEnum> projectedPaymentCalculationPeriodTermType;
    @XmlElementRef(name = "ProjectedPaymentCalculationPeriodTermTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectedPaymentCalculationPeriodTermTypeOtherDescription;
    @XmlElementRef(name = "ProjectedPaymentEstimatedEscrowPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentEstimatedEscrowPaymentAmount;
    @XmlElementRef(name = "ProjectedPaymentEstimatedTotalMaximumPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentEstimatedTotalMaximumPaymentAmount;
    @XmlElementRef(name = "ProjectedPaymentEstimatedTotalMinimumPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentEstimatedTotalMinimumPaymentAmount;
    @XmlElementRef(name = "ProjectedPaymentMIPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentMIPaymentAmount;
    @XmlElementRef(name = "ProjectedPaymentPrincipalAndInterestMaximumPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentPrincipalAndInterestMaximumPaymentAmount;
    @XmlElementRef(name = "ProjectedPaymentPrincipalAndInterestMinimumPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectedPaymentPrincipalAndInterestMinimumPaymentAmount;
    @XmlElement(name = "EXTENSION")
    protected PROJECTEDPAYMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the paymentFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentFrequencyEnum }{@code >}
     *     
     */
    public JAXBElement<PaymentFrequencyEnum> getPaymentFrequencyType() {
        return paymentFrequencyType;
    }

    /**
     * Sets the value of the paymentFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentFrequencyEnum }{@code >}
     *     
     */
    public void setPaymentFrequencyType(JAXBElement<PaymentFrequencyEnum> value) {
        this.paymentFrequencyType = value;
    }

    /**
     * Gets the value of the paymentFrequencyTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPaymentFrequencyTypeOtherDescription() {
        return paymentFrequencyTypeOtherDescription;
    }

    /**
     * Sets the value of the paymentFrequencyTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPaymentFrequencyTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.paymentFrequencyTypeOtherDescription = value;
    }

    /**
     * Gets the value of the projectedPaymentCalculationPeriodEndNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getProjectedPaymentCalculationPeriodEndNumber() {
        return projectedPaymentCalculationPeriodEndNumber;
    }

    /**
     * Sets the value of the projectedPaymentCalculationPeriodEndNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setProjectedPaymentCalculationPeriodEndNumber(JAXBElement<MISMONumeric> value) {
        this.projectedPaymentCalculationPeriodEndNumber = value;
    }

    /**
     * Gets the value of the projectedPaymentCalculationPeriodStartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getProjectedPaymentCalculationPeriodStartNumber() {
        return projectedPaymentCalculationPeriodStartNumber;
    }

    /**
     * Sets the value of the projectedPaymentCalculationPeriodStartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setProjectedPaymentCalculationPeriodStartNumber(JAXBElement<MISMONumeric> value) {
        this.projectedPaymentCalculationPeriodStartNumber = value;
    }

    /**
     * Gets the value of the projectedPaymentCalculationPeriodTermType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectedPaymentCalculationPeriodTermEnum }{@code >}
     *     
     */
    public JAXBElement<ProjectedPaymentCalculationPeriodTermEnum> getProjectedPaymentCalculationPeriodTermType() {
        return projectedPaymentCalculationPeriodTermType;
    }

    /**
     * Sets the value of the projectedPaymentCalculationPeriodTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectedPaymentCalculationPeriodTermEnum }{@code >}
     *     
     */
    public void setProjectedPaymentCalculationPeriodTermType(JAXBElement<ProjectedPaymentCalculationPeriodTermEnum> value) {
        this.projectedPaymentCalculationPeriodTermType = value;
    }

    /**
     * Gets the value of the projectedPaymentCalculationPeriodTermTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectedPaymentCalculationPeriodTermTypeOtherDescription() {
        return projectedPaymentCalculationPeriodTermTypeOtherDescription;
    }

    /**
     * Sets the value of the projectedPaymentCalculationPeriodTermTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectedPaymentCalculationPeriodTermTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.projectedPaymentCalculationPeriodTermTypeOtherDescription = value;
    }

    /**
     * Gets the value of the projectedPaymentEstimatedEscrowPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentEstimatedEscrowPaymentAmount() {
        return projectedPaymentEstimatedEscrowPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentEstimatedEscrowPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentEstimatedEscrowPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentEstimatedEscrowPaymentAmount = value;
    }

    /**
     * Gets the value of the projectedPaymentEstimatedTotalMaximumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentEstimatedTotalMaximumPaymentAmount() {
        return projectedPaymentEstimatedTotalMaximumPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentEstimatedTotalMaximumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentEstimatedTotalMaximumPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentEstimatedTotalMaximumPaymentAmount = value;
    }

    /**
     * Gets the value of the projectedPaymentEstimatedTotalMinimumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentEstimatedTotalMinimumPaymentAmount() {
        return projectedPaymentEstimatedTotalMinimumPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentEstimatedTotalMinimumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentEstimatedTotalMinimumPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentEstimatedTotalMinimumPaymentAmount = value;
    }

    /**
     * Gets the value of the projectedPaymentMIPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentMIPaymentAmount() {
        return projectedPaymentMIPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentMIPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentMIPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentMIPaymentAmount = value;
    }

    /**
     * Gets the value of the projectedPaymentPrincipalAndInterestMaximumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentPrincipalAndInterestMaximumPaymentAmount() {
        return projectedPaymentPrincipalAndInterestMaximumPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentPrincipalAndInterestMaximumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentPrincipalAndInterestMaximumPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentPrincipalAndInterestMaximumPaymentAmount = value;
    }

    /**
     * Gets the value of the projectedPaymentPrincipalAndInterestMinimumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectedPaymentPrincipalAndInterestMinimumPaymentAmount() {
        return projectedPaymentPrincipalAndInterestMinimumPaymentAmount;
    }

    /**
     * Sets the value of the projectedPaymentPrincipalAndInterestMinimumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectedPaymentPrincipalAndInterestMinimumPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.projectedPaymentPrincipalAndInterestMinimumPaymentAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTEDPAYMENTEXTENSION }
     *     
     */
    public PROJECTEDPAYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTEDPAYMENTEXTENSION }
     *     
     */
    public void setEXTENSION(PROJECTEDPAYMENTEXTENSION value) {
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
