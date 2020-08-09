//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VERIFICATION_OF_INCOME_RESPONSE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VERIFICATION_OF_INCOME_RESPONSE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportFirstIssuedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReportIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportLastUpdatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReportTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERIFICATION_OF_INCOME_RESPONSE_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "reportFirstIssuedDatetime",
    "reportIdentifier",
    "reportLastUpdatedDatetime",
    "reportTransactionIdentifier",
    "reportType",
    "reportTypeOtherDescription"
})
public class VERIFICATIONOFINCOMERESPONSEDETAIL {

    @XmlElementRef(name = "ReportFirstIssuedDatetime", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportFirstIssuedDatetime;
    @XmlElementRef(name = "ReportIdentifier", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportIdentifier;
    @XmlElementRef(name = "ReportLastUpdatedDatetime", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportLastUpdatedDatetime;
    @XmlElementRef(name = "ReportTransactionIdentifier", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportTransactionIdentifier;
    @XmlElementRef(name = "ReportType", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportType;
    @XmlElementRef(name = "ReportTypeOtherDescription", namespace = "http://globalgateway.corelogic.com/order/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportTypeOtherDescription;

    /**
     * Gets the value of the reportFirstIssuedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportFirstIssuedDatetime() {
        return reportFirstIssuedDatetime;
    }

    /**
     * Sets the value of the reportFirstIssuedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportFirstIssuedDatetime(JAXBElement<XMLGregorianCalendar> value) {
        this.reportFirstIssuedDatetime = value;
    }

    /**
     * Gets the value of the reportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportIdentifier() {
        return reportIdentifier;
    }

    /**
     * Sets the value of the reportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportIdentifier(JAXBElement<String> value) {
        this.reportIdentifier = value;
    }

    /**
     * Gets the value of the reportLastUpdatedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportLastUpdatedDatetime() {
        return reportLastUpdatedDatetime;
    }

    /**
     * Sets the value of the reportLastUpdatedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportLastUpdatedDatetime(JAXBElement<XMLGregorianCalendar> value) {
        this.reportLastUpdatedDatetime = value;
    }

    /**
     * Gets the value of the reportTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportTransactionIdentifier() {
        return reportTransactionIdentifier;
    }

    /**
     * Sets the value of the reportTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportTransactionIdentifier(JAXBElement<String> value) {
        this.reportTransactionIdentifier = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportType(JAXBElement<String> value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the reportTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportTypeOtherDescription() {
        return reportTypeOtherDescription;
    }

    /**
     * Sets the value of the reportTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportTypeOtherDescription(JAXBElement<String> value) {
        this.reportTypeOtherDescription = value;
    }

}