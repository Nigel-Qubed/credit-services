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
 * <p>Java class for SALE_AND_FORECLOSURE_TRENDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SALE_AND_FORECLOSURE_TRENDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SALE_AND_FORECLOSURE_TRENDS_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}SALE_AND_FORECLOSURE_TRENDS_DETAIL" minOccurs="0"/>
 *         &lt;element name="QUARTER_STATISTICS" type="{http://globalgateway.corelogic.com/order/2015}QUARTER_STATISTICS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALE_AND_FORECLOSURE_TRENDS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "saleandforeclosuretrendsdetail",
    "quarterstatistics"
})
public class SALEANDFORECLOSURETRENDS {

    @XmlElement(name = "SALE_AND_FORECLOSURE_TRENDS_DETAIL")
    protected SALEANDFORECLOSURETRENDSDETAIL saleandforeclosuretrendsdetail;
    @XmlElement(name = "QUARTER_STATISTICS")
    protected QUARTERSTATISTICS quarterstatistics;

    /**
     * Gets the value of the saleandforeclosuretrendsdetail property.
     * 
     * @return
     *     possible object is
     *     {@link SALEANDFORECLOSURETRENDSDETAIL }
     *     
     */
    public SALEANDFORECLOSURETRENDSDETAIL getSALEANDFORECLOSURETRENDSDETAIL() {
        return saleandforeclosuretrendsdetail;
    }

    /**
     * Sets the value of the saleandforeclosuretrendsdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALEANDFORECLOSURETRENDSDETAIL }
     *     
     */
    public void setSALEANDFORECLOSURETRENDSDETAIL(SALEANDFORECLOSURETRENDSDETAIL value) {
        this.saleandforeclosuretrendsdetail = value;
    }

    /**
     * Gets the value of the quarterstatistics property.
     * 
     * @return
     *     possible object is
     *     {@link QUARTERSTATISTICS }
     *     
     */
    public QUARTERSTATISTICS getQUARTERSTATISTICS() {
        return quarterstatistics;
    }

    /**
     * Sets the value of the quarterstatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUARTERSTATISTICS }
     *     
     */
    public void setQUARTERSTATISTICS(QUARTERSTATISTICS value) {
        this.quarterstatistics = value;
    }

}