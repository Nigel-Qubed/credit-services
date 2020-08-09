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
 * <p>Java class for HOUSING_UNIT_INVENTORY_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOUSING_UNIT_INVENTORY_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitOwnedByTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UnitSaleRentalStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UnitCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOUSING_UNIT_INVENTORY_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "unitOwnedByTypeOtherDescription",
    "unitSaleRentalStatusTypeOtherDescription",
    "unitCommentText"
})
public class HOUSINGUNITINVENTORYCORELOGIC {

    @XmlElement(name = "UnitOwnedByTypeOtherDescription")
    protected MISMOString unitOwnedByTypeOtherDescription;
    @XmlElement(name = "UnitSaleRentalStatusTypeOtherDescription")
    protected MISMOString unitSaleRentalStatusTypeOtherDescription;
    @XmlElement(name = "UnitCommentText")
    protected MISMOString unitCommentText;

    /**
     * Gets the value of the unitOwnedByTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getUnitOwnedByTypeOtherDescription() {
        return unitOwnedByTypeOtherDescription;
    }

    /**
     * Sets the value of the unitOwnedByTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setUnitOwnedByTypeOtherDescription(MISMOString value) {
        this.unitOwnedByTypeOtherDescription = value;
    }

    /**
     * Gets the value of the unitSaleRentalStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getUnitSaleRentalStatusTypeOtherDescription() {
        return unitSaleRentalStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the unitSaleRentalStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setUnitSaleRentalStatusTypeOtherDescription(MISMOString value) {
        this.unitSaleRentalStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the unitCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getUnitCommentText() {
        return unitCommentText;
    }

    /**
     * Sets the value of the unitCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setUnitCommentText(MISMOString value) {
        this.unitCommentText = value;
    }

}