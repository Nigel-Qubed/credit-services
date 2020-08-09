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
 * <p>Java class for CREDIT_INQUIRY_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_INQUIRY_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditBusinessType" type="{http://www.mismo.org/residential/2009/schemas}CreditBusinessEnum" minOccurs="0"/>
 *         &lt;element name="CreditInquiryDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditInquiryResultType" type="{http://www.mismo.org/residential/2009/schemas}CreditInquiryResultEnum" minOccurs="0"/>
 *         &lt;element name="CreditLoanType" type="{http://www.mismo.org/residential/2009/schemas}CreditLoanEnum" minOccurs="0"/>
 *         &lt;element name="CreditLoanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DetailCreditBusinessType" type="{http://www.mismo.org/residential/2009/schemas}DetailCreditBusinessEnum" minOccurs="0"/>
 *         &lt;element name="DuplicateGroupIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PrimaryRecordIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_INQUIRY_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_INQUIRY_DETAIL", propOrder = {
    "creditBusinessType",
    "creditInquiryDate",
    "creditInquiryResultType",
    "creditLoanType",
    "creditLoanTypeOtherDescription",
    "detailCreditBusinessType",
    "duplicateGroupIdentifier",
    "primaryRecordIndicator",
    "extension"
})
public class CREDITINQUIRYDETAIL {

    @XmlElementRef(name = "CreditBusinessType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditBusinessEnum> creditBusinessType;
    @XmlElementRef(name = "CreditInquiryDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditInquiryDate;
    @XmlElementRef(name = "CreditInquiryResultType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditInquiryResultEnum> creditInquiryResultType;
    @XmlElementRef(name = "CreditLoanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditLoanEnum> creditLoanType;
    @XmlElementRef(name = "CreditLoanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditLoanTypeOtherDescription;
    @XmlElementRef(name = "DetailCreditBusinessType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DetailCreditBusinessEnum> detailCreditBusinessType;
    @XmlElementRef(name = "DuplicateGroupIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> duplicateGroupIdentifier;
    @XmlElementRef(name = "PrimaryRecordIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> primaryRecordIndicator;
    @XmlElement(name = "EXTENSION")
    protected CREDITINQUIRYDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditBusinessEnum }{@code >}
     *     
     */
    public JAXBElement<CreditBusinessEnum> getCreditBusinessType() {
        return creditBusinessType;
    }

    /**
     * Sets the value of the creditBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditBusinessEnum }{@code >}
     *     
     */
    public void setCreditBusinessType(JAXBElement<CreditBusinessEnum> value) {
        this.creditBusinessType = value;
    }

    /**
     * Gets the value of the creditInquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditInquiryDate() {
        return creditInquiryDate;
    }

    /**
     * Sets the value of the creditInquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditInquiryDate(JAXBElement<MISMODate> value) {
        this.creditInquiryDate = value;
    }

    /**
     * Gets the value of the creditInquiryResultType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditInquiryResultEnum }{@code >}
     *     
     */
    public JAXBElement<CreditInquiryResultEnum> getCreditInquiryResultType() {
        return creditInquiryResultType;
    }

    /**
     * Sets the value of the creditInquiryResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditInquiryResultEnum }{@code >}
     *     
     */
    public void setCreditInquiryResultType(JAXBElement<CreditInquiryResultEnum> value) {
        this.creditInquiryResultType = value;
    }

    /**
     * Gets the value of the creditLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditLoanEnum }{@code >}
     *     
     */
    public JAXBElement<CreditLoanEnum> getCreditLoanType() {
        return creditLoanType;
    }

    /**
     * Sets the value of the creditLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditLoanEnum }{@code >}
     *     
     */
    public void setCreditLoanType(JAXBElement<CreditLoanEnum> value) {
        this.creditLoanType = value;
    }

    /**
     * Gets the value of the creditLoanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditLoanTypeOtherDescription() {
        return creditLoanTypeOtherDescription;
    }

    /**
     * Sets the value of the creditLoanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditLoanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditLoanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the detailCreditBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DetailCreditBusinessEnum }{@code >}
     *     
     */
    public JAXBElement<DetailCreditBusinessEnum> getDetailCreditBusinessType() {
        return detailCreditBusinessType;
    }

    /**
     * Sets the value of the detailCreditBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DetailCreditBusinessEnum }{@code >}
     *     
     */
    public void setDetailCreditBusinessType(JAXBElement<DetailCreditBusinessEnum> value) {
        this.detailCreditBusinessType = value;
    }

    /**
     * Gets the value of the duplicateGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDuplicateGroupIdentifier() {
        return duplicateGroupIdentifier;
    }

    /**
     * Sets the value of the duplicateGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDuplicateGroupIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.duplicateGroupIdentifier = value;
    }

    /**
     * Gets the value of the primaryRecordIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPrimaryRecordIndicator() {
        return primaryRecordIndicator;
    }

    /**
     * Sets the value of the primaryRecordIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPrimaryRecordIndicator(JAXBElement<MISMOIndicator> value) {
        this.primaryRecordIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITINQUIRYDETAILEXTENSION }
     *     
     */
    public CREDITINQUIRYDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITINQUIRYDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITINQUIRYDETAILEXTENSION value) {
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