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
 * <p>Java class for SERVICE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderStatusType" type="{http://globalgateway.corelogic.com/order/2015}OrderStatusTypeEnum" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://globalgateway.corelogic.com/order/2015}OrderTypeEnum" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://globalgateway.corelogic.com/order/2015}RequestTypeEnum" minOccurs="0"/>
 *         &lt;element name="TaxServiceResponseTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "orderStatusType",
    "orderType",
    "requestType",
    "taxServiceResponseTypeDescription"
})
public class SERVICEDETAIL {

    @XmlElement(name = "OrderStatusType")
    protected OrderStatusTypeEnum orderStatusType;
    @XmlElement(name = "OrderType")
    protected OrderTypeEnum orderType;
    @XmlElement(name = "RequestType")
    protected RequestTypeEnum requestType;
    @XmlElement(name = "TaxServiceResponseTypeDescription")
    protected String taxServiceResponseTypeDescription;

    /**
     * Gets the value of the orderStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusTypeEnum }
     *     
     */
    public OrderStatusTypeEnum getOrderStatusType() {
        return orderStatusType;
    }

    /**
     * Sets the value of the orderStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusTypeEnum }
     *     
     */
    public void setOrderStatusType(OrderStatusTypeEnum value) {
        this.orderStatusType = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTypeEnum }
     *     
     */
    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTypeEnum }
     *     
     */
    public void setOrderType(OrderTypeEnum value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the taxServiceResponseTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxServiceResponseTypeDescription() {
        return taxServiceResponseTypeDescription;
    }

    /**
     * Sets the value of the taxServiceResponseTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxServiceResponseTypeDescription(String value) {
        this.taxServiceResponseTypeDescription = value;
    }

}
