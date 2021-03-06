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
 * <p>Java class for PROPERTY_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARCELS" type="{http://globalgateway.corelogic.com/order/2015}PARCELS_CORELOGIC" minOccurs="0"/>
 *         &lt;element name="MORTGAGE_HISTORIES" type="{http://globalgateway.corelogic.com/order/2015}MORTGAGE_HISTORIES" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROPERTY_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "parcels",
    "mortgagehistories",
    "parties"
})
public class PROPERTYCORELOGIC {

    @XmlElement(name = "PARCELS")
    protected PARCELSCORELOGIC parcels;
    @XmlElement(name = "MORTGAGE_HISTORIES")
    protected MORTGAGEHISTORIES mortgagehistories;
    @XmlElement(name = "PARTIES", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected PARTIES parties;

    /**
     * Gets the value of the parcels property.
     * 
     * @return
     *     possible object is
     *     {@link PARCELSCORELOGIC }
     *     
     */
    public PARCELSCORELOGIC getPARCELS() {
        return parcels;
    }

    /**
     * Sets the value of the parcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARCELSCORELOGIC }
     *     
     */
    public void setPARCELS(PARCELSCORELOGIC value) {
        this.parcels = value;
    }

    /**
     * Gets the value of the mortgagehistories property.
     * 
     * @return
     *     possible object is
     *     {@link MORTGAGEHISTORIES }
     *     
     */
    public MORTGAGEHISTORIES getMORTGAGEHISTORIES() {
        return mortgagehistories;
    }

    /**
     * Sets the value of the mortgagehistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link MORTGAGEHISTORIES }
     *     
     */
    public void setMORTGAGEHISTORIES(MORTGAGEHISTORIES value) {
        this.mortgagehistories = value;
    }

    /**
     * Gets the value of the parties property.
     * 
     * @return
     *     possible object is
     *     {@link PARTIES }
     *     
     */
    public PARTIES getPARTIES() {
        return parties;
    }

    /**
     * Sets the value of the parties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTIES }
     *     
     */
    public void setPARTIES(PARTIES value) {
        this.parties = value;
    }

}
