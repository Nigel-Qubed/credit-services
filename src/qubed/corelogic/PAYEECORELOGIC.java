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
 * Information about the parcel tax line payee. 
 * 
 * <p>Java class for PAYEE_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYEE_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}LEGAL_ENTITY" minOccurs="0"/>
 *         &lt;element name="PAYEE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}PAYEE_DETAIL_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYEE_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "address",
    "legalentity",
    "payeedetail"
})
public class PAYEECORELOGIC {

    @XmlElement(name = "ADDRESS", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected ADDRESS address;
    @XmlElement(name = "LEGAL_ENTITY", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected LEGALENTITY legalentity;
    @XmlElement(name = "PAYEE_DETAIL")
    protected PAYEEDETAILCORELOGIC payeedetail;

    /**
     * Information about the parcel tax line payee address. 
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Information about the parcel tax line payee as a legal entity. 
     * 
     * @return
     *     possible object is
     *     {@link LEGALENTITY }
     *     
     */
    public LEGALENTITY getLEGALENTITY() {
        return legalentity;
    }

    /**
     * Sets the value of the legalentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALENTITY }
     *     
     */
    public void setLEGALENTITY(LEGALENTITY value) {
        this.legalentity = value;
    }

    /**
     * Gets the value of the payeedetail property.
     * 
     * @return
     *     possible object is
     *     {@link PAYEEDETAILCORELOGIC }
     *     
     */
    public PAYEEDETAILCORELOGIC getPAYEEDETAIL() {
        return payeedetail;
    }

    /**
     * Sets the value of the payeedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYEEDETAILCORELOGIC }
     *     
     */
    public void setPAYEEDETAIL(PAYEEDETAILCORELOGIC value) {
        this.payeedetail = value;
    }

}
