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
 * <p>Java class for DOCUMENT_MANAGEMENT_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_MANAGEMENT_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOCUMENT_MANAGEMENT_REQUEST" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_REQUEST" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_MANAGEMENT_RESPONSE" type="{http://globalgateway.corelogic.com/order/2015}DOCUMENT_MANAGEMENT_RESPONSE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENT_MANAGEMENT_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "documentmanagementrequest",
    "documentmanagementresponse"
})
public class DOCUMENTMANAGEMENTCORELOGIC {

    @XmlElement(name = "DOCUMENT_MANAGEMENT_REQUEST")
    protected DOCUMENTMANAGEMENTREQUEST documentmanagementrequest;
    @XmlElement(name = "DOCUMENT_MANAGEMENT_RESPONSE")
    protected DOCUMENTMANAGEMENTRESPONSE documentmanagementresponse;

    /**
     * Gets the value of the documentmanagementrequest property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTREQUEST }
     *     
     */
    public DOCUMENTMANAGEMENTREQUEST getDOCUMENTMANAGEMENTREQUEST() {
        return documentmanagementrequest;
    }

    /**
     * Sets the value of the documentmanagementrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTREQUEST }
     *     
     */
    public void setDOCUMENTMANAGEMENTREQUEST(DOCUMENTMANAGEMENTREQUEST value) {
        this.documentmanagementrequest = value;
    }

    /**
     * Gets the value of the documentmanagementresponse property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTMANAGEMENTRESPONSE }
     *     
     */
    public DOCUMENTMANAGEMENTRESPONSE getDOCUMENTMANAGEMENTRESPONSE() {
        return documentmanagementresponse;
    }

    /**
     * Sets the value of the documentmanagementresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTMANAGEMENTRESPONSE }
     *     
     */
    public void setDOCUMENTMANAGEMENTRESPONSE(DOCUMENTMANAGEMENTRESPONSE value) {
        this.documentmanagementresponse = value;
    }

}
