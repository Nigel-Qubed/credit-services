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
 * <p>Java class for TAX_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAX_REQUEST" type="{http://globalgateway.corelogic.com/order/2015}TAX_REQUEST" minOccurs="0"/>
 *         &lt;element name="TAX_RESPONSE" type="{http://globalgateway.corelogic.com/order/2015}TAX_RESPONSE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxrequest",
    "taxresponse"
})
public class TAXCORELOGIC {

    @XmlElement(name = "TAX_REQUEST")
    protected TAXREQUEST taxrequest;
    @XmlElement(name = "TAX_RESPONSE")
    protected TAXRESPONSE taxresponse;

    /**
     * Gets the value of the taxrequest property.
     * 
     * @return
     *     possible object is
     *     {@link TAXREQUEST }
     *     
     */
    public TAXREQUEST getTAXREQUEST() {
        return taxrequest;
    }

    /**
     * Sets the value of the taxrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXREQUEST }
     *     
     */
    public void setTAXREQUEST(TAXREQUEST value) {
        this.taxrequest = value;
    }

    /**
     * Gets the value of the taxresponse property.
     * 
     * @return
     *     possible object is
     *     {@link TAXRESPONSE }
     *     
     */
    public TAXRESPONSE getTAXRESPONSE() {
        return taxresponse;
    }

    /**
     * Sets the value of the taxresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXRESPONSE }
     *     
     */
    public void setTAXRESPONSE(TAXRESPONSE value) {
        this.taxresponse = value;
    }

}
