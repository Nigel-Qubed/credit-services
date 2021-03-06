//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VA_BORROWER")
public class VABORROWER {

    @XmlAttribute(name = "VACoBorrowerNonTaxableIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaCoBorrowerNonTaxableIncomeAmount;
    @XmlAttribute(name = "VACoBorrowerTaxableIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaCoBorrowerTaxableIncomeAmount;
    @XmlAttribute(name = "VAFederalTaxAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaFederalTaxAmount;
    @XmlAttribute(name = "VALocalTaxAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaLocalTaxAmount;
    @XmlAttribute(name = "VAPrimaryBorrowerNonTaxableIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaPrimaryBorrowerNonTaxableIncomeAmount;
    @XmlAttribute(name = "VAPrimaryBorrowerTaxableIncomeAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaPrimaryBorrowerTaxableIncomeAmount;
    @XmlAttribute(name = "VASocialSecurityTaxAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaSocialSecurityTaxAmount;
    @XmlAttribute(name = "VAStateTaxAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vaStateTaxAmount;

    /**
     * Gets the value of the vaCoBorrowerNonTaxableIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVACoBorrowerNonTaxableIncomeAmount() {
        return vaCoBorrowerNonTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaCoBorrowerNonTaxableIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVACoBorrowerNonTaxableIncomeAmount(String value) {
        this.vaCoBorrowerNonTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaCoBorrowerTaxableIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVACoBorrowerTaxableIncomeAmount() {
        return vaCoBorrowerTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaCoBorrowerTaxableIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVACoBorrowerTaxableIncomeAmount(String value) {
        this.vaCoBorrowerTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaFederalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAFederalTaxAmount() {
        return vaFederalTaxAmount;
    }

    /**
     * Sets the value of the vaFederalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAFederalTaxAmount(String value) {
        this.vaFederalTaxAmount = value;
    }

    /**
     * Gets the value of the vaLocalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALocalTaxAmount() {
        return vaLocalTaxAmount;
    }

    /**
     * Sets the value of the vaLocalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALocalTaxAmount(String value) {
        this.vaLocalTaxAmount = value;
    }

    /**
     * Gets the value of the vaPrimaryBorrowerNonTaxableIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAPrimaryBorrowerNonTaxableIncomeAmount() {
        return vaPrimaryBorrowerNonTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaPrimaryBorrowerNonTaxableIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAPrimaryBorrowerNonTaxableIncomeAmount(String value) {
        this.vaPrimaryBorrowerNonTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaPrimaryBorrowerTaxableIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAPrimaryBorrowerTaxableIncomeAmount() {
        return vaPrimaryBorrowerTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaPrimaryBorrowerTaxableIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAPrimaryBorrowerTaxableIncomeAmount(String value) {
        this.vaPrimaryBorrowerTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaSocialSecurityTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVASocialSecurityTaxAmount() {
        return vaSocialSecurityTaxAmount;
    }

    /**
     * Sets the value of the vaSocialSecurityTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVASocialSecurityTaxAmount(String value) {
        this.vaSocialSecurityTaxAmount = value;
    }

    /**
     * Gets the value of the vaStateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAStateTaxAmount() {
        return vaStateTaxAmount;
    }

    /**
     * Sets the value of the vaStateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAStateTaxAmount(String value) {
        this.vaStateTaxAmount = value;
    }

}
