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
 * <p>Java class for TAXPAYER_IDENTIFIER_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXPAYER_IDENTIFIER_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxpayerIdentifierValueDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXPAYER_IDENTIFIER_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxpayerIdentifierValueDescription"
})
public class TAXPAYERIDENTIFIERCORELOGIC {

    @XmlElement(name = "TaxpayerIdentifierValueDescription")
    protected MISMOString taxpayerIdentifierValueDescription;

    /**
     * Gets the value of the taxpayerIdentifierValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getTaxpayerIdentifierValueDescription() {
        return taxpayerIdentifierValueDescription;
    }

    /**
     * Sets the value of the taxpayerIdentifierValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setTaxpayerIdentifierValueDescription(MISMOString value) {
        this.taxpayerIdentifierValueDescription = value;
    }

}
