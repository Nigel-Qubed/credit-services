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
 * <p>Java class for EXEMPTION_DETAIL_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXEMPTION_DETAIL_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxExemptionAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TaxExemptionAppliedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TaxExemptionCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="TaxExemptionDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXEMPTION_DETAIL_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxExemptionAmount",
    "taxExemptionAppliedIndicator",
    "taxExemptionCode",
    "taxExemptionDescription"
})
public class EXEMPTIONDETAILCORELOGIC {

    @XmlElement(name = "TaxExemptionAmount")
    protected MISMOAmount taxExemptionAmount;
    @XmlElement(name = "TaxExemptionAppliedIndicator")
    protected MISMOIndicator taxExemptionAppliedIndicator;
    @XmlElement(name = "TaxExemptionCode")
    protected MISMOCode taxExemptionCode;
    @XmlElement(name = "TaxExemptionDescription")
    protected MISMOString taxExemptionDescription;

    /**
     * Gets the value of the taxExemptionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOAmount }
     *     
     */
    public MISMOAmount getTaxExemptionAmount() {
        return taxExemptionAmount;
    }

    /**
     * Sets the value of the taxExemptionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOAmount }
     *     
     */
    public void setTaxExemptionAmount(MISMOAmount value) {
        this.taxExemptionAmount = value;
    }

    /**
     * Gets the value of the taxExemptionAppliedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getTaxExemptionAppliedIndicator() {
        return taxExemptionAppliedIndicator;
    }

    /**
     * Sets the value of the taxExemptionAppliedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setTaxExemptionAppliedIndicator(MISMOIndicator value) {
        this.taxExemptionAppliedIndicator = value;
    }

    /**
     * Gets the value of the taxExemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOCode }
     *     
     */
    public MISMOCode getTaxExemptionCode() {
        return taxExemptionCode;
    }

    /**
     * Sets the value of the taxExemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOCode }
     *     
     */
    public void setTaxExemptionCode(MISMOCode value) {
        this.taxExemptionCode = value;
    }

    /**
     * Gets the value of the taxExemptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getTaxExemptionDescription() {
        return taxExemptionDescription;
    }

    /**
     * Sets the value of the taxExemptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setTaxExemptionDescription(MISMOString value) {
        this.taxExemptionDescription = value;
    }

}
