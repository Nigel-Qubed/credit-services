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
 * <p>Java class for VALUATION_REQUEST_SEARCH_CRITERIA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_REQUEST_SEARCH_CRITERIA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALUATION_REQUEST_COMPARABLE_SEARCH" type="{http://globalgateway.corelogic.com/order/2015}VALUATION_REQUEST_COMPARABLE_SEARCH" minOccurs="0"/>
 *         &lt;element name="VALUATION_REQUEST_COMPARABLE_SEARCH_LAND_USE" type="{http://globalgateway.corelogic.com/order/2015}VALUATION_REQUEST_COMPARABLE_SEARCH_LAND_USE" minOccurs="0"/>
 *         &lt;element name="VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATES" type="{http://globalgateway.corelogic.com/order/2015}VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALUATION_REQUEST_SEARCH_CRITERIA", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "valuationrequestcomparablesearch",
    "valuationrequestcomparablesearchlanduse",
    "valuationrequestcomparablesearchpolygoncoordinates"
})
public class VALUATIONREQUESTSEARCHCRITERIA {

    @XmlElement(name = "VALUATION_REQUEST_COMPARABLE_SEARCH")
    protected VALUATIONREQUESTCOMPARABLESEARCH valuationrequestcomparablesearch;
    @XmlElement(name = "VALUATION_REQUEST_COMPARABLE_SEARCH_LAND_USE")
    protected VALUATIONREQUESTCOMPARABLESEARCHLANDUSE valuationrequestcomparablesearchlanduse;
    @XmlElement(name = "VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATES")
    protected VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES valuationrequestcomparablesearchpolygoncoordinates;

    /**
     * Gets the value of the valuationrequestcomparablesearch property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCH }
     *     
     */
    public VALUATIONREQUESTCOMPARABLESEARCH getVALUATIONREQUESTCOMPARABLESEARCH() {
        return valuationrequestcomparablesearch;
    }

    /**
     * Sets the value of the valuationrequestcomparablesearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCH }
     *     
     */
    public void setVALUATIONREQUESTCOMPARABLESEARCH(VALUATIONREQUESTCOMPARABLESEARCH value) {
        this.valuationrequestcomparablesearch = value;
    }

    /**
     * Gets the value of the valuationrequestcomparablesearchlanduse property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCHLANDUSE }
     *     
     */
    public VALUATIONREQUESTCOMPARABLESEARCHLANDUSE getVALUATIONREQUESTCOMPARABLESEARCHLANDUSE() {
        return valuationrequestcomparablesearchlanduse;
    }

    /**
     * Sets the value of the valuationrequestcomparablesearchlanduse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCHLANDUSE }
     *     
     */
    public void setVALUATIONREQUESTCOMPARABLESEARCHLANDUSE(VALUATIONREQUESTCOMPARABLESEARCHLANDUSE value) {
        this.valuationrequestcomparablesearchlanduse = value;
    }

    /**
     * Gets the value of the valuationrequestcomparablesearchpolygoncoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES }
     *     
     */
    public VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES getVALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES() {
        return valuationrequestcomparablesearchpolygoncoordinates;
    }

    /**
     * Sets the value of the valuationrequestcomparablesearchpolygoncoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES }
     *     
     */
    public void setVALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES(VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATES value) {
        this.valuationrequestcomparablesearchpolygoncoordinates = value;
    }

}
