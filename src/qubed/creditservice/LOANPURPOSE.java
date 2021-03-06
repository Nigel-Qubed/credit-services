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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "constructionrefinancedata"
})
@XmlRootElement(name = "LOAN_PURPOSE")
public class LOANPURPOSE {

    @XmlAttribute(name = "GSETitleMannerHeldDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gseTitleMannerHeldDescription;
    @XmlAttribute(name = "_Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "OtherLoanPurposeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String otherLoanPurposeDescription;
    @XmlAttribute(name = "PropertyLeaseholdExpirationDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String propertyLeaseholdExpirationDate;
    @XmlAttribute(name = "PropertyRightsType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String propertyRightsType;
    @XmlAttribute(name = "PropertyUsageType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String propertyUsageType;
    @XmlElement(name = "CONSTRUCTION_REFINANCE_DATA")
    protected CONSTRUCTIONREFINANCEDATA constructionrefinancedata;

    /**
     * Gets the value of the gseTitleMannerHeldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSETitleMannerHeldDescription() {
        return gseTitleMannerHeldDescription;
    }

    /**
     * Sets the value of the gseTitleMannerHeldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSETitleMannerHeldDescription(String value) {
        this.gseTitleMannerHeldDescription = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherLoanPurposeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLoanPurposeDescription() {
        return otherLoanPurposeDescription;
    }

    /**
     * Sets the value of the otherLoanPurposeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLoanPurposeDescription(String value) {
        this.otherLoanPurposeDescription = value;
    }

    /**
     * Gets the value of the propertyLeaseholdExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyLeaseholdExpirationDate() {
        return propertyLeaseholdExpirationDate;
    }

    /**
     * Sets the value of the propertyLeaseholdExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyLeaseholdExpirationDate(String value) {
        this.propertyLeaseholdExpirationDate = value;
    }

    /**
     * Gets the value of the propertyRightsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRightsType() {
        return propertyRightsType;
    }

    /**
     * Sets the value of the propertyRightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRightsType(String value) {
        this.propertyRightsType = value;
    }

    /**
     * Gets the value of the propertyUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyUsageType() {
        return propertyUsageType;
    }

    /**
     * Sets the value of the propertyUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyUsageType(String value) {
        this.propertyUsageType = value;
    }

    /**
     * Gets the value of the constructionrefinancedata property.
     * 
     * @return
     *     possible object is
     *     {@link CONSTRUCTIONREFINANCEDATA }
     *     
     */
    public CONSTRUCTIONREFINANCEDATA getCONSTRUCTIONREFINANCEDATA() {
        return constructionrefinancedata;
    }

    /**
     * Sets the value of the constructionrefinancedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTRUCTIONREFINANCEDATA }
     *     
     */
    public void setCONSTRUCTIONREFINANCEDATA(CONSTRUCTIONREFINANCEDATA value) {
        this.constructionrefinancedata = value;
    }

}
