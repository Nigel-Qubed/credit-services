//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAX_RETURN_TRANSCRIPT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_RETURN_TRANSCRIPT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSNProvided" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxPeriodEnding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EINProvided" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DuplicateAmendmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_RETURN_TRANSCRIPT_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxYear",
    "requestDate",
    "responseDate",
    "trackingNumber",
    "ssnProvided",
    "taxPeriodEnding",
    "einProvided",
    "duplicateAmendmentNumber"
})
public class TAXRETURNTRANSCRIPTDETAIL {

    @XmlElement(name = "TaxYear")
    protected String taxYear;
    @XmlElement(name = "RequestDate")
    protected String requestDate;
    @XmlElement(name = "ResponseDate")
    protected String responseDate;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "SSNProvided")
    protected String ssnProvided;
    @XmlElement(name = "TaxPeriodEnding")
    protected String taxPeriodEnding;
    @XmlElement(name = "EINProvided")
    protected String einProvided;
    @XmlElement(name = "DuplicateAmendmentNumber")
    protected String duplicateAmendmentNumber;

    /**
     * Gets the value of the taxYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxYear() {
        return taxYear;
    }

    /**
     * Sets the value of the taxYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxYear(String value) {
        this.taxYear = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDate(String value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the ssnProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNProvided() {
        return ssnProvided;
    }

    /**
     * Sets the value of the ssnProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNProvided(String value) {
        this.ssnProvided = value;
    }

    /**
     * Gets the value of the taxPeriodEnding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPeriodEnding() {
        return taxPeriodEnding;
    }

    /**
     * Sets the value of the taxPeriodEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPeriodEnding(String value) {
        this.taxPeriodEnding = value;
    }

    /**
     * Gets the value of the einProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEINProvided() {
        return einProvided;
    }

    /**
     * Sets the value of the einProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEINProvided(String value) {
        this.einProvided = value;
    }

    /**
     * Gets the value of the duplicateAmendmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateAmendmentNumber() {
        return duplicateAmendmentNumber;
    }

    /**
     * Sets the value of the duplicateAmendmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateAmendmentNumber(String value) {
        this.duplicateAmendmentNumber = value;
    }

}
