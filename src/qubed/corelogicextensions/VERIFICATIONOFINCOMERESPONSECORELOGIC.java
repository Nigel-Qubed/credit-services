//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VERIFICATION_OF_INCOME_RESPONSE_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VERIFICATION_OF_INCOME_RESPONSE_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VERIFICATION_OF_INCOME_RESPONSE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}VERIFICATION_OF_INCOME_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="VERIFICATION_OF_INCOME_RESPONSE_PRICES" type="{http://globalgateway.corelogic.com/order/2015}VERIFICATION_OF_INCOME_RESPONSE_PRICES" minOccurs="0"/>
 *         &lt;element name="RESPONSE_FOR_TAX_RETURN_DOCUMENTATION" type="{http://globalgateway.corelogic.com/order/2015}RESPONSE_FOR_TAX_RETURN_DOCUMENTATION" minOccurs="0"/>
 *         &lt;element name="TAX_RETURN_TRANSCRIPTS" type="{http://globalgateway.corelogic.com/order/2015}TAX_RETURN_TRANSCRIPTS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERIFICATION_OF_INCOME_RESPONSE_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "verificationofincomeresponsedetail",
    "verificationofincomeresponseprices",
    "responsefortaxreturndocumentation",
    "taxreturntranscripts"
})
public class VERIFICATIONOFINCOMERESPONSECORELOGIC {

    @XmlElement(name = "VERIFICATION_OF_INCOME_RESPONSE_DETAIL")
    protected VERIFICATIONOFINCOMERESPONSEDETAIL verificationofincomeresponsedetail;
    @XmlElement(name = "VERIFICATION_OF_INCOME_RESPONSE_PRICES")
    protected VERIFICATIONOFINCOMERESPONSEPRICES verificationofincomeresponseprices;
    @XmlElement(name = "RESPONSE_FOR_TAX_RETURN_DOCUMENTATION")
    protected RESPONSEFORTAXRETURNDOCUMENTATION responsefortaxreturndocumentation;
    @XmlElement(name = "TAX_RETURN_TRANSCRIPTS")
    protected TAXRETURNTRANSCRIPTS taxreturntranscripts;

    /**
     * Gets the value of the verificationofincomeresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONOFINCOMERESPONSEDETAIL }
     *     
     */
    public VERIFICATIONOFINCOMERESPONSEDETAIL getVERIFICATIONOFINCOMERESPONSEDETAIL() {
        return verificationofincomeresponsedetail;
    }

    /**
     * Sets the value of the verificationofincomeresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONOFINCOMERESPONSEDETAIL }
     *     
     */
    public void setVERIFICATIONOFINCOMERESPONSEDETAIL(VERIFICATIONOFINCOMERESPONSEDETAIL value) {
        this.verificationofincomeresponsedetail = value;
    }

    /**
     * Gets the value of the verificationofincomeresponseprices property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONOFINCOMERESPONSEPRICES }
     *     
     */
    public VERIFICATIONOFINCOMERESPONSEPRICES getVERIFICATIONOFINCOMERESPONSEPRICES() {
        return verificationofincomeresponseprices;
    }

    /**
     * Sets the value of the verificationofincomeresponseprices property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONOFINCOMERESPONSEPRICES }
     *     
     */
    public void setVERIFICATIONOFINCOMERESPONSEPRICES(VERIFICATIONOFINCOMERESPONSEPRICES value) {
        this.verificationofincomeresponseprices = value;
    }

    /**
     * Gets the value of the responsefortaxreturndocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSEFORTAXRETURNDOCUMENTATION }
     *     
     */
    public RESPONSEFORTAXRETURNDOCUMENTATION getRESPONSEFORTAXRETURNDOCUMENTATION() {
        return responsefortaxreturndocumentation;
    }

    /**
     * Sets the value of the responsefortaxreturndocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSEFORTAXRETURNDOCUMENTATION }
     *     
     */
    public void setRESPONSEFORTAXRETURNDOCUMENTATION(RESPONSEFORTAXRETURNDOCUMENTATION value) {
        this.responsefortaxreturndocumentation = value;
    }

    /**
     * Gets the value of the taxreturntranscripts property.
     * 
     * @return
     *     possible object is
     *     {@link TAXRETURNTRANSCRIPTS }
     *     
     */
    public TAXRETURNTRANSCRIPTS getTAXRETURNTRANSCRIPTS() {
        return taxreturntranscripts;
    }

    /**
     * Sets the value of the taxreturntranscripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXRETURNTRANSCRIPTS }
     *     
     */
    public void setTAXRETURNTRANSCRIPTS(TAXRETURNTRANSCRIPTS value) {
        this.taxreturntranscripts = value;
    }

}
