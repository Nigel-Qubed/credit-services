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
 * <p>Java class for VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LongitudeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALUATION_REQUEST_COMPARABLE_SEARCH_POLYGON_COORDINATE", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "latitudeIdentifier",
    "longitudeIdentifier"
})
public class VALUATIONREQUESTCOMPARABLESEARCHPOLYGONCOORDINATE {

    @XmlElement(name = "LatitudeIdentifier")
    protected MISMOString latitudeIdentifier;
    @XmlElement(name = "LongitudeIdentifier")
    protected MISMOString longitudeIdentifier;

    /**
     * Gets the value of the latitudeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getLatitudeIdentifier() {
        return latitudeIdentifier;
    }

    /**
     * Sets the value of the latitudeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setLatitudeIdentifier(MISMOString value) {
        this.latitudeIdentifier = value;
    }

    /**
     * Gets the value of the longitudeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getLongitudeIdentifier() {
        return longitudeIdentifier;
    }

    /**
     * Sets the value of the longitudeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setLongitudeIdentifier(MISMOString value) {
        this.longitudeIdentifier = value;
    }

}
