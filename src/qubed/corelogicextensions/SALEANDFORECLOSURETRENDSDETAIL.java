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
 * <p>Java class for SALE_AND_FORECLOSURE_TRENDS_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SALE_AND_FORECLOSURE_TRENDS_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxDistanceFromSubjectPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighborhoodPropertyCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatisticsMaxCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALE_AND_FORECLOSURE_TRENDS_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "maxDistanceFromSubjectPropertyValue",
    "neighborhoodPropertyCount",
    "statisticsMaxCount"
})
public class SALEANDFORECLOSURETRENDSDETAIL {

    @XmlElement(name = "MaxDistanceFromSubjectPropertyValue")
    protected String maxDistanceFromSubjectPropertyValue;
    @XmlElement(name = "NeighborhoodPropertyCount")
    protected String neighborhoodPropertyCount;
    @XmlElement(name = "StatisticsMaxCount")
    protected String statisticsMaxCount;

    /**
     * Gets the value of the maxDistanceFromSubjectPropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDistanceFromSubjectPropertyValue() {
        return maxDistanceFromSubjectPropertyValue;
    }

    /**
     * Sets the value of the maxDistanceFromSubjectPropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDistanceFromSubjectPropertyValue(String value) {
        this.maxDistanceFromSubjectPropertyValue = value;
    }

    /**
     * Gets the value of the neighborhoodPropertyCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhoodPropertyCount() {
        return neighborhoodPropertyCount;
    }

    /**
     * Sets the value of the neighborhoodPropertyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhoodPropertyCount(String value) {
        this.neighborhoodPropertyCount = value;
    }

    /**
     * Gets the value of the statisticsMaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsMaxCount() {
        return statisticsMaxCount;
    }

    /**
     * Sets the value of the statisticsMaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsMaxCount(String value) {
        this.statisticsMaxCount = value;
    }

}
