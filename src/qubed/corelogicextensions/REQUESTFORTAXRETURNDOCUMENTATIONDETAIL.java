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
 * This container holds detailed data specific to requesting IRS income verifications. This includes request details and data that is unique to the form(s) that accompany a request.
 * 
 * <p>Java class for REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfReturnsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="RefundToThirdPartyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TaxpayerIdentityTheftIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TotalCostForReturnsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TranscriptCertifiedCopyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="VerificationServicerDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL", propOrder = {
    "numberOfReturnsCount",
    "refundToThirdPartyIndicator",
    "taxpayerIdentityTheftIndicator",
    "totalCostForReturnsAmount",
    "transcriptCertifiedCopyIndicator",
    "verificationServicerDescription",
    "extension"
})
public class REQUESTFORTAXRETURNDOCUMENTATIONDETAIL {

    @XmlElementRef(name = "NumberOfReturnsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> numberOfReturnsCount;
    @XmlElementRef(name = "RefundToThirdPartyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> refundToThirdPartyIndicator;
    @XmlElementRef(name = "TaxpayerIdentityTheftIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> taxpayerIdentityTheftIndicator;
    @XmlElementRef(name = "TotalCostForReturnsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> totalCostForReturnsAmount;
    @XmlElementRef(name = "TranscriptCertifiedCopyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> transcriptCertifiedCopyIndicator;
    @XmlElementRef(name = "VerificationServicerDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> verificationServicerDescription;
    @XmlElement(name = "EXTENSION")
    protected REQUESTFORTAXRETURNDOCUMENTATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the numberOfReturnsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getNumberOfReturnsCount() {
        return numberOfReturnsCount;
    }

    /**
     * Sets the value of the numberOfReturnsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setNumberOfReturnsCount(JAXBElement<MISMOCount> value) {
        this.numberOfReturnsCount = value;
    }

    /**
     * Gets the value of the refundToThirdPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRefundToThirdPartyIndicator() {
        return refundToThirdPartyIndicator;
    }

    /**
     * Sets the value of the refundToThirdPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRefundToThirdPartyIndicator(JAXBElement<MISMOIndicator> value) {
        this.refundToThirdPartyIndicator = value;
    }

    /**
     * Gets the value of the taxpayerIdentityTheftIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTaxpayerIdentityTheftIndicator() {
        return taxpayerIdentityTheftIndicator;
    }

    /**
     * Sets the value of the taxpayerIdentityTheftIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTaxpayerIdentityTheftIndicator(JAXBElement<MISMOIndicator> value) {
        this.taxpayerIdentityTheftIndicator = value;
    }

    /**
     * Gets the value of the totalCostForReturnsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTotalCostForReturnsAmount() {
        return totalCostForReturnsAmount;
    }

    /**
     * Sets the value of the totalCostForReturnsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTotalCostForReturnsAmount(JAXBElement<MISMOAmount> value) {
        this.totalCostForReturnsAmount = value;
    }

    /**
     * Gets the value of the transcriptCertifiedCopyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getTranscriptCertifiedCopyIndicator() {
        return transcriptCertifiedCopyIndicator;
    }

    /**
     * Sets the value of the transcriptCertifiedCopyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setTranscriptCertifiedCopyIndicator(JAXBElement<MISMOIndicator> value) {
        this.transcriptCertifiedCopyIndicator = value;
    }

    /**
     * Gets the value of the verificationServicerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getVerificationServicerDescription() {
        return verificationServicerDescription;
    }

    /**
     * Sets the value of the verificationServicerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setVerificationServicerDescription(JAXBElement<MISMOString> value) {
        this.verificationServicerDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONDETAILEXTENSION }
     *     
     */
    public REQUESTFORTAXRETURNDOCUMENTATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(REQUESTFORTAXRETURNDOCUMENTATIONDETAILEXTENSION value) {
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