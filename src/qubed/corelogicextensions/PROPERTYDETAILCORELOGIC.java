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
 * <p>Java class for PROPERTY_DETAIL_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_DETAIL_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropertyType" type="{http://globalgateway.corelogic.com/order/2015}PropertyEnum" minOccurs="0"/>
 *         &lt;element name="PropertyTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveYearBuiltDateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorPropertyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROPERTY_DETAIL_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "propertyType",
    "propertyTypeOtherDescription",
    "effectiveYearBuiltDateIdentifier",
    "flipDescription",
    "vendorPropertyIdentifier"
})
public class PROPERTYDETAILCORELOGIC {

    @XmlElement(name = "PropertyType")
    protected PropertyEnum propertyType;
    @XmlElement(name = "PropertyTypeOtherDescription")
    protected String propertyTypeOtherDescription;
    @XmlElement(name = "EffectiveYearBuiltDateIdentifier")
    protected String effectiveYearBuiltDateIdentifier;
    @XmlElement(name = "FlipDescription")
    protected String flipDescription;
    @XmlElement(name = "VendorPropertyIdentifier")
    protected String vendorPropertyIdentifier;

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyEnum }
     *     
     */
    public PropertyEnum getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyEnum }
     *     
     */
    public void setPropertyType(PropertyEnum value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the propertyTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTypeOtherDescription() {
        return propertyTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTypeOtherDescription(String value) {
        this.propertyTypeOtherDescription = value;
    }

    /**
     * Gets the value of the effectiveYearBuiltDateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveYearBuiltDateIdentifier() {
        return effectiveYearBuiltDateIdentifier;
    }

    /**
     * Sets the value of the effectiveYearBuiltDateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveYearBuiltDateIdentifier(String value) {
        this.effectiveYearBuiltDateIdentifier = value;
    }

    /**
     * Gets the value of the flipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlipDescription() {
        return flipDescription;
    }

    /**
     * Sets the value of the flipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlipDescription(String value) {
        this.flipDescription = value;
    }

    /**
     * Gets the value of the vendorPropertyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorPropertyIdentifier() {
        return vendorPropertyIdentifier;
    }

    /**
     * Sets the value of the vendorPropertyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorPropertyIdentifier(String value) {
        this.vendorPropertyIdentifier = value;
    }

}
