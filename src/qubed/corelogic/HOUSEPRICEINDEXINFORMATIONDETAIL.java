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
 * <p>Java class for HOUSE_PRICE_INDEX_INFORMATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOUSE_PRICE_INDEX_INFORMATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LargestHPITrendPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPITrendStartMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPITrendStartYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOUSE_PRICE_INDEX_INFORMATION_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "largestHPITrendPercentage",
    "hpiTrendStartMonth",
    "hpiTrendStartYear"
})
public class HOUSEPRICEINDEXINFORMATIONDETAIL {

    @XmlElement(name = "LargestHPITrendPercentage")
    protected String largestHPITrendPercentage;
    @XmlElement(name = "HPITrendStartMonth")
    protected String hpiTrendStartMonth;
    @XmlElement(name = "HPITrendStartYear")
    protected String hpiTrendStartYear;

    /**
     * Gets the value of the largestHPITrendPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargestHPITrendPercentage() {
        return largestHPITrendPercentage;
    }

    /**
     * Sets the value of the largestHPITrendPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargestHPITrendPercentage(String value) {
        this.largestHPITrendPercentage = value;
    }

    /**
     * Gets the value of the hpiTrendStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPITrendStartMonth() {
        return hpiTrendStartMonth;
    }

    /**
     * Sets the value of the hpiTrendStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPITrendStartMonth(String value) {
        this.hpiTrendStartMonth = value;
    }

    /**
     * Gets the value of the hpiTrendStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPITrendStartYear() {
        return hpiTrendStartYear;
    }

    /**
     * Sets the value of the hpiTrendStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPITrendStartYear(String value) {
        this.hpiTrendStartYear = value;
    }

}
