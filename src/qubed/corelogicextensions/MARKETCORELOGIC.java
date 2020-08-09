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
 * <p>Java class for MARKET_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARKET_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SALE_AND_FORECLOSURE_TRENDS" type="{http://globalgateway.corelogic.com/order/2015}SALE_AND_FORECLOSURE_TRENDS" minOccurs="0"/>
 *         &lt;element name="HOUSE_PRICE_INDEX_INFORMATION" type="{http://globalgateway.corelogic.com/order/2015}HOUSE_PRICE_INDEX_INFORMATION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARKET_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "saleandforeclosuretrends",
    "housepriceindexinformation"
})
public class MARKETCORELOGIC {

    @XmlElement(name = "SALE_AND_FORECLOSURE_TRENDS")
    protected SALEANDFORECLOSURETRENDS saleandforeclosuretrends;
    @XmlElement(name = "HOUSE_PRICE_INDEX_INFORMATION")
    protected HOUSEPRICEINDEXINFORMATION housepriceindexinformation;

    /**
     * Gets the value of the saleandforeclosuretrends property.
     * 
     * @return
     *     possible object is
     *     {@link SALEANDFORECLOSURETRENDS }
     *     
     */
    public SALEANDFORECLOSURETRENDS getSALEANDFORECLOSURETRENDS() {
        return saleandforeclosuretrends;
    }

    /**
     * Sets the value of the saleandforeclosuretrends property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALEANDFORECLOSURETRENDS }
     *     
     */
    public void setSALEANDFORECLOSURETRENDS(SALEANDFORECLOSURETRENDS value) {
        this.saleandforeclosuretrends = value;
    }

    /**
     * Gets the value of the housepriceindexinformation property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSEPRICEINDEXINFORMATION }
     *     
     */
    public HOUSEPRICEINDEXINFORMATION getHOUSEPRICEINDEXINFORMATION() {
        return housepriceindexinformation;
    }

    /**
     * Sets the value of the housepriceindexinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSEPRICEINDEXINFORMATION }
     *     
     */
    public void setHOUSEPRICEINDEXINFORMATION(HOUSEPRICEINDEXINFORMATION value) {
        this.housepriceindexinformation = value;
    }

}