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
 * <p>Java class for OWNED_PROPERTY_DETAIL_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OWNED_PROPERTY_DETAIL_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnedPropertyDispositionRentalIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OWNED_PROPERTY_DETAIL_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "ownedPropertyDispositionRentalIndicator"
})
public class OWNEDPROPERTYDETAILCORELOGIC {

    @XmlElement(name = "OwnedPropertyDispositionRentalIndicator")
    protected MISMOIndicator ownedPropertyDispositionRentalIndicator;

    /**
     * Gets the value of the ownedPropertyDispositionRentalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getOwnedPropertyDispositionRentalIndicator() {
        return ownedPropertyDispositionRentalIndicator;
    }

    /**
     * Sets the value of the ownedPropertyDispositionRentalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setOwnedPropertyDispositionRentalIndicator(MISMOIndicator value) {
        this.ownedPropertyDispositionRentalIndicator = value;
    }

}
