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
 * <p>Java class for DOCUMENT_MANAGEMENT_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_MANAGEMENT_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FRAUD_ALERTS" type="{http://globalgateway.corelogic.com/order/2015}FRAUD_ALERTS" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_MANAGEMENT_RESPONSE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_DETAIL" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SUPPLEMENTARY_DATA" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SUPPLEMENTARY_DATA" minOccurs="0"/>
 *         &lt;element name="QUESTIONNAIRE" type="{http://globalgateway.corelogic.com/order/2015}QUESTIONNAIRE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENT_MANAGEMENT_RESPONSE", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "fraudalerts",
    "documentmanagementresponsedetail",
    "documentmanagementresponseproductdetail",
    "documentmanagementresponseproductsectioncomments",
    "documentmanagementresponseproductsupplementarydata",
    "questionnaire"
})
public class DOCUMENTMANAGEMENTRESPONSE {

    @XmlElement(name = "FRAUD_ALERTS")
    protected FRAUDALERTS fraudalerts;
    @XmlElement(name = "DOCUMENT_MANAGEMENT_RESPONSE_DETAIL")
    protected DOCUMENTMANAGEMENTRESPONSEDETAIL documentmanagementresponsedetail;
    @XmlElement(name = "DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_DETAIL")
    protected DOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL documentmanagementresponseproductdetail;
    @XmlElement(name = "DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS")
    protected DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS documentmanagementresponseproductsectioncomments;
    @XmlElement(name = "DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SUPPLEMENTARY_DATA")
    protected DOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA documentmanagementresponseproductsupplementarydata;
    @XmlElement(name = "QUESTIONNAIRE")
    protected QUESTIONNAIRE questionnaire;

    /**
     * Gets the value of the fraudalerts property.
     * 
     * @return
     *     possible object is
     *     {@link FRAUDALERTS }
     *     
     */
    public FRAUDALERTS getFRAUDALERTS() {
        return fraudalerts;
    }

    /**
     * Sets the value of the fraudalerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRAUDALERTS }
     *     
     */
    public void setFRAUDALERTS(FRAUDALERTS value) {
        this.fraudalerts = value;
    }

    /**
     * Gets the value of the documentmanagementresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEDETAIL }
     *     
     */
    public DOCUMENTMANAGEMENTRESPONSEDETAIL getDOCUMENTMANAGEMENTRESPONSEDETAIL() {
        return documentmanagementresponsedetail;
    }

    /**
     * Sets the value of the documentmanagementresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEDETAIL }
     *     
     */
    public void setDOCUMENTMANAGEMENTRESPONSEDETAIL(DOCUMENTMANAGEMENTRESPONSEDETAIL value) {
        this.documentmanagementresponsedetail = value;
    }

    /**
     * Gets the value of the documentmanagementresponseproductdetail property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL }
     *     
     */
    public DOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL getDOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL() {
        return documentmanagementresponseproductdetail;
    }

    /**
     * Sets the value of the documentmanagementresponseproductdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL }
     *     
     */
    public void setDOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL(DOCUMENTMANAGEMENTRESPONSEPRODUCTDETAIL value) {
        this.documentmanagementresponseproductdetail = value;
    }

    /**
     * Gets the value of the documentmanagementresponseproductsectioncomments property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS }
     *     
     */
    public DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS getDOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS() {
        return documentmanagementresponseproductsectioncomments;
    }

    /**
     * Sets the value of the documentmanagementresponseproductsectioncomments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS }
     *     
     */
    public void setDOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS(DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS value) {
        this.documentmanagementresponseproductsectioncomments = value;
    }

    /**
     * Gets the value of the documentmanagementresponseproductsupplementarydata property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA }
     *     
     */
    public DOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA getDOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA() {
        return documentmanagementresponseproductsupplementarydata;
    }

    /**
     * Sets the value of the documentmanagementresponseproductsupplementarydata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA }
     *     
     */
    public void setDOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA(DOCUMENTMANAGEMENTRESPONSEPRODUCTSUPPLEMENTARYDATA value) {
        this.documentmanagementresponseproductsupplementarydata = value;
    }

    /**
     * Gets the value of the questionnaire property.
     * 
     * @return
     *     possible object is
     *     {@link QUESTIONNAIRE }
     *     
     */
    public QUESTIONNAIRE getQUESTIONNAIRE() {
        return questionnaire;
    }

    /**
     * Sets the value of the questionnaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUESTIONNAIRE }
     *     
     */
    public void setQUESTIONNAIRE(QUESTIONNAIRE value) {
        this.questionnaire = value;
    }

}
