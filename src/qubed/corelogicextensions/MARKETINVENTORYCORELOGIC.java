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
 * <p>Java class for MARKET_INVENTORY_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARKET_INVENTORY_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketInventoryChangeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketInventoryTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARKET_INVENTORY_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "marketInventoryChangeAmount",
    "marketInventoryTypeOtherDescription"
})
public class MARKETINVENTORYCORELOGIC {

    @XmlElement(name = "MarketInventoryChangeAmount")
    protected String marketInventoryChangeAmount;
    @XmlElement(name = "MarketInventoryTypeOtherDescription")
    protected String marketInventoryTypeOtherDescription;

    /**
     * Gets the value of the marketInventoryChangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketInventoryChangeAmount() {
        return marketInventoryChangeAmount;
    }

    /**
     * Sets the value of the marketInventoryChangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketInventoryChangeAmount(String value) {
        this.marketInventoryChangeAmount = value;
    }

    /**
     * Gets the value of the marketInventoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketInventoryTypeOtherDescription() {
        return marketInventoryTypeOtherDescription;
    }

    /**
     * Sets the value of the marketInventoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketInventoryTypeOtherDescription(String value) {
        this.marketInventoryTypeOtherDescription = value;
    }

}
