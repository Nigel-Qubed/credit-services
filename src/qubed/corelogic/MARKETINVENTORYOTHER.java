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
 * <p>Java class for MARKET_INVENTORY_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARKET_INVENTORY_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MARKET_INVENTORY" type="{http://globalgateway.corelogic.com/order/2015}MARKET_INVENTORY_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARKET_INVENTORY_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "marketinventory"
})
public class MARKETINVENTORYOTHER {

    @XmlElement(name = "MARKET_INVENTORY")
    protected MARKETINVENTORYCORELOGIC marketinventory;

    /**
     * Gets the value of the marketinventory property.
     * 
     * @return
     *     possible object is
     *     {@link MARKETINVENTORYCORELOGIC }
     *     
     */
    public MARKETINVENTORYCORELOGIC getMARKETINVENTORY() {
        return marketinventory;
    }

    /**
     * Sets the value of the marketinventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKETINVENTORYCORELOGIC }
     *     
     */
    public void setMARKETINVENTORY(MARKETINVENTORYCORELOGIC value) {
        this.marketinventory = value;
    }

}
