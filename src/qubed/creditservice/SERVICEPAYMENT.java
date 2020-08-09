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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SERVICE_PAYMENT")
public class SERVICEPAYMENT {

    @XmlAttribute(name = "_AccountIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountIdentifier;
    @XmlAttribute(name = "_AccountHolderName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderName;
    @XmlAttribute(name = "_AccountHolderStreetAddress")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderStreetAddress;
    @XmlAttribute(name = "_AccountHolderStreetAddress2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderStreetAddress2;
    @XmlAttribute(name = "_AccountHolderCity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderCity;
    @XmlAttribute(name = "_AccountHolderState")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderState;
    @XmlAttribute(name = "_AccountHolderPostalCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderPostalCode;
    @XmlAttribute(name = "_AccountHolderTelephoneNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountHolderTelephoneNumber;
    @XmlAttribute(name = "_AccountExpirationDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountExpirationDate;
    @XmlAttribute(name = "_SecondaryAccountIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String secondaryAccountIdentifier;
    @XmlAttribute(name = "_MethodType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String methodType;
    @XmlAttribute(name = "_MethodTypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String methodTypeOtherDescription;

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIdentifier(String value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the accountHolderStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderStreetAddress() {
        return accountHolderStreetAddress;
    }

    /**
     * Sets the value of the accountHolderStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderStreetAddress(String value) {
        this.accountHolderStreetAddress = value;
    }

    /**
     * Gets the value of the accountHolderStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderStreetAddress2() {
        return accountHolderStreetAddress2;
    }

    /**
     * Sets the value of the accountHolderStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderStreetAddress2(String value) {
        this.accountHolderStreetAddress2 = value;
    }

    /**
     * Gets the value of the accountHolderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderCity() {
        return accountHolderCity;
    }

    /**
     * Sets the value of the accountHolderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderCity(String value) {
        this.accountHolderCity = value;
    }

    /**
     * Gets the value of the accountHolderState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderState() {
        return accountHolderState;
    }

    /**
     * Sets the value of the accountHolderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderState(String value) {
        this.accountHolderState = value;
    }

    /**
     * Gets the value of the accountHolderPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderPostalCode() {
        return accountHolderPostalCode;
    }

    /**
     * Sets the value of the accountHolderPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderPostalCode(String value) {
        this.accountHolderPostalCode = value;
    }

    /**
     * Gets the value of the accountHolderTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderTelephoneNumber() {
        return accountHolderTelephoneNumber;
    }

    /**
     * Sets the value of the accountHolderTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderTelephoneNumber(String value) {
        this.accountHolderTelephoneNumber = value;
    }

    /**
     * Gets the value of the accountExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountExpirationDate() {
        return accountExpirationDate;
    }

    /**
     * Sets the value of the accountExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountExpirationDate(String value) {
        this.accountExpirationDate = value;
    }

    /**
     * Gets the value of the secondaryAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryAccountIdentifier() {
        return secondaryAccountIdentifier;
    }

    /**
     * Sets the value of the secondaryAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAccountIdentifier(String value) {
        this.secondaryAccountIdentifier = value;
    }

    /**
     * Gets the value of the methodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodType() {
        return methodType;
    }

    /**
     * Sets the value of the methodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodType(String value) {
        this.methodType = value;
    }

    /**
     * Gets the value of the methodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodTypeOtherDescription() {
        return methodTypeOtherDescription;
    }

    /**
     * Sets the value of the methodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodTypeOtherDescription(String value) {
        this.methodTypeOtherDescription = value;
    }

}