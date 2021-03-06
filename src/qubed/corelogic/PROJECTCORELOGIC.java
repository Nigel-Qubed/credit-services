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
 * <p>Java class for PROJECT_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}LEGAL_ENTITY" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}PROPERTY_UNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}STRUCTURE" minOccurs="0"/>
 *         &lt;element name="PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "address",
    "legalentity",
    "propertyunit",
    "structure",
    "projectcommercialnonresidentialunits"
})
public class PROJECTCORELOGIC {

    @XmlElement(name = "ADDRESS", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected ADDRESS address;
    @XmlElement(name = "LEGAL_ENTITY", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected LEGALENTITY legalentity;
    @XmlElement(name = "PROPERTY_UNIT", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected PROPERTYUNIT propertyunit;
    @XmlElement(name = "STRUCTURE", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected STRUCTURE structure;
    @XmlElement(name = "PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS")
    protected PROJECTCOMMERCIALNONRESIDENTIALUNITS projectcommercialnonresidentialunits;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the legalentity property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALENTITY }
     *     
     */
    public LEGALENTITY getLEGALENTITY() {
        return legalentity;
    }

    /**
     * Sets the value of the legalentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALENTITY }
     *     
     */
    public void setLEGALENTITY(LEGALENTITY value) {
        this.legalentity = value;
    }

    /**
     * Gets the value of the propertyunit property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYUNIT }
     *     
     */
    public PROPERTYUNIT getPROPERTYUNIT() {
        return propertyunit;
    }

    /**
     * Sets the value of the propertyunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYUNIT }
     *     
     */
    public void setPROPERTYUNIT(PROPERTYUNIT value) {
        this.propertyunit = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link STRUCTURE }
     *     
     */
    public STRUCTURE getSTRUCTURE() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTURE }
     *     
     */
    public void setSTRUCTURE(STRUCTURE value) {
        this.structure = value;
    }

    /**
     * Gets the value of the projectcommercialnonresidentialunits property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTCOMMERCIALNONRESIDENTIALUNITS }
     *     
     */
    public PROJECTCOMMERCIALNONRESIDENTIALUNITS getPROJECTCOMMERCIALNONRESIDENTIALUNITS() {
        return projectcommercialnonresidentialunits;
    }

    /**
     * Sets the value of the projectcommercialnonresidentialunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTCOMMERCIALNONRESIDENTIALUNITS }
     *     
     */
    public void setPROJECTCOMMERCIALNONRESIDENTIALUNITS(PROJECTCOMMERCIALNONRESIDENTIALUNITS value) {
        this.projectcommercialnonresidentialunits = value;
    }

}
