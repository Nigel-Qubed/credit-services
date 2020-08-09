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
 * Information about insurance claim proceeds associated with the loan or subject property.
 * 
 * <p>Java class for INSURANCE_CLAIM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSURANCE_CLAIM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualInsuranceClaimAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ActualInsuranceProceedsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EstimatedInsuranceClaimAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EstimatedInsuranceProceedsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimEligibilityDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimFiledDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimPaidDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimPendingIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimType" type="{http://www.mismo.org/residential/2009/schemas}InsuranceClaimEnum" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InsurancePartialClaimIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INSURANCE_CLAIM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INSURANCE_CLAIM", propOrder = {
    "actualInsuranceClaimAmount",
    "actualInsuranceProceedsAmount",
    "estimatedInsuranceClaimAmount",
    "estimatedInsuranceProceedsAmount",
    "insuranceClaimEligibilityDate",
    "insuranceClaimFiledDate",
    "insuranceClaimPaidDate",
    "insuranceClaimPendingIndicator",
    "insuranceClaimType",
    "insuranceClaimTypeOtherDescription",
    "insurancePartialClaimIndicator",
    "extension"
})
public class INSURANCECLAIM {

    @XmlElementRef(name = "ActualInsuranceClaimAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> actualInsuranceClaimAmount;
    @XmlElementRef(name = "ActualInsuranceProceedsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> actualInsuranceProceedsAmount;
    @XmlElementRef(name = "EstimatedInsuranceClaimAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> estimatedInsuranceClaimAmount;
    @XmlElementRef(name = "EstimatedInsuranceProceedsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> estimatedInsuranceProceedsAmount;
    @XmlElementRef(name = "InsuranceClaimEligibilityDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> insuranceClaimEligibilityDate;
    @XmlElementRef(name = "InsuranceClaimFiledDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> insuranceClaimFiledDate;
    @XmlElementRef(name = "InsuranceClaimPaidDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> insuranceClaimPaidDate;
    @XmlElementRef(name = "InsuranceClaimPendingIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> insuranceClaimPendingIndicator;
    @XmlElementRef(name = "InsuranceClaimType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuranceClaimEnum> insuranceClaimType;
    @XmlElementRef(name = "InsuranceClaimTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> insuranceClaimTypeOtherDescription;
    @XmlElementRef(name = "InsurancePartialClaimIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> insurancePartialClaimIndicator;
    @XmlElement(name = "EXTENSION")
    protected INSURANCECLAIMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the actualInsuranceClaimAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getActualInsuranceClaimAmount() {
        return actualInsuranceClaimAmount;
    }

    /**
     * Sets the value of the actualInsuranceClaimAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setActualInsuranceClaimAmount(JAXBElement<MISMOAmount> value) {
        this.actualInsuranceClaimAmount = value;
    }

    /**
     * Gets the value of the actualInsuranceProceedsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getActualInsuranceProceedsAmount() {
        return actualInsuranceProceedsAmount;
    }

    /**
     * Sets the value of the actualInsuranceProceedsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setActualInsuranceProceedsAmount(JAXBElement<MISMOAmount> value) {
        this.actualInsuranceProceedsAmount = value;
    }

    /**
     * Gets the value of the estimatedInsuranceClaimAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEstimatedInsuranceClaimAmount() {
        return estimatedInsuranceClaimAmount;
    }

    /**
     * Sets the value of the estimatedInsuranceClaimAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEstimatedInsuranceClaimAmount(JAXBElement<MISMOAmount> value) {
        this.estimatedInsuranceClaimAmount = value;
    }

    /**
     * Gets the value of the estimatedInsuranceProceedsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEstimatedInsuranceProceedsAmount() {
        return estimatedInsuranceProceedsAmount;
    }

    /**
     * Sets the value of the estimatedInsuranceProceedsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEstimatedInsuranceProceedsAmount(JAXBElement<MISMOAmount> value) {
        this.estimatedInsuranceProceedsAmount = value;
    }

    /**
     * Gets the value of the insuranceClaimEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInsuranceClaimEligibilityDate() {
        return insuranceClaimEligibilityDate;
    }

    /**
     * Sets the value of the insuranceClaimEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInsuranceClaimEligibilityDate(JAXBElement<MISMODate> value) {
        this.insuranceClaimEligibilityDate = value;
    }

    /**
     * Gets the value of the insuranceClaimFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInsuranceClaimFiledDate() {
        return insuranceClaimFiledDate;
    }

    /**
     * Sets the value of the insuranceClaimFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInsuranceClaimFiledDate(JAXBElement<MISMODate> value) {
        this.insuranceClaimFiledDate = value;
    }

    /**
     * Gets the value of the insuranceClaimPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInsuranceClaimPaidDate() {
        return insuranceClaimPaidDate;
    }

    /**
     * Sets the value of the insuranceClaimPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInsuranceClaimPaidDate(JAXBElement<MISMODate> value) {
        this.insuranceClaimPaidDate = value;
    }

    /**
     * Gets the value of the insuranceClaimPendingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInsuranceClaimPendingIndicator() {
        return insuranceClaimPendingIndicator;
    }

    /**
     * Sets the value of the insuranceClaimPendingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInsuranceClaimPendingIndicator(JAXBElement<MISMOIndicator> value) {
        this.insuranceClaimPendingIndicator = value;
    }

    /**
     * Gets the value of the insuranceClaimType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuranceClaimEnum }{@code >}
     *     
     */
    public JAXBElement<InsuranceClaimEnum> getInsuranceClaimType() {
        return insuranceClaimType;
    }

    /**
     * Sets the value of the insuranceClaimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuranceClaimEnum }{@code >}
     *     
     */
    public void setInsuranceClaimType(JAXBElement<InsuranceClaimEnum> value) {
        this.insuranceClaimType = value;
    }

    /**
     * Gets the value of the insuranceClaimTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInsuranceClaimTypeOtherDescription() {
        return insuranceClaimTypeOtherDescription;
    }

    /**
     * Sets the value of the insuranceClaimTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInsuranceClaimTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.insuranceClaimTypeOtherDescription = value;
    }

    /**
     * Gets the value of the insurancePartialClaimIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInsurancePartialClaimIndicator() {
        return insurancePartialClaimIndicator;
    }

    /**
     * Sets the value of the insurancePartialClaimIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInsurancePartialClaimIndicator(JAXBElement<MISMOIndicator> value) {
        this.insurancePartialClaimIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INSURANCECLAIMEXTENSION }
     *     
     */
    public INSURANCECLAIMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSURANCECLAIMEXTENSION }
     *     
     */
    public void setEXTENSION(INSURANCECLAIMEXTENSION value) {
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
