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
@XmlRootElement(name = "FHA_VA_BORROWER")
public class FHAVABORROWER {

    @XmlAttribute(name = "CAIVRSIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String caivrsIdentifier;
    @XmlAttribute(name = "FNMBankruptcyCount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmBankruptcyCount;
    @XmlAttribute(name = "FNMBorrowerCreditRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmBorrowerCreditRating;
    @XmlAttribute(name = "FNMCreditReportScoreType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fnmCreditReportScoreType;
    @XmlAttribute(name = "FNMForeclosureCount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fnmForeclosureCount;
    @XmlAttribute(name = "VeteranStatusIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String veteranStatusIndicator;

    /**
     * Gets the value of the caivrsIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAIVRSIdentifier() {
        return caivrsIdentifier;
    }

    /**
     * Sets the value of the caivrsIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAIVRSIdentifier(String value) {
        this.caivrsIdentifier = value;
    }

    /**
     * Gets the value of the fnmBankruptcyCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMBankruptcyCount() {
        return fnmBankruptcyCount;
    }

    /**
     * Sets the value of the fnmBankruptcyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMBankruptcyCount(String value) {
        this.fnmBankruptcyCount = value;
    }

    /**
     * Gets the value of the fnmBorrowerCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMBorrowerCreditRating() {
        return fnmBorrowerCreditRating;
    }

    /**
     * Sets the value of the fnmBorrowerCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMBorrowerCreditRating(String value) {
        this.fnmBorrowerCreditRating = value;
    }

    /**
     * Gets the value of the fnmCreditReportScoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMCreditReportScoreType() {
        return fnmCreditReportScoreType;
    }

    /**
     * Sets the value of the fnmCreditReportScoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMCreditReportScoreType(String value) {
        this.fnmCreditReportScoreType = value;
    }

    /**
     * Gets the value of the fnmForeclosureCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMForeclosureCount() {
        return fnmForeclosureCount;
    }

    /**
     * Sets the value of the fnmForeclosureCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMForeclosureCount(String value) {
        this.fnmForeclosureCount = value;
    }

    /**
     * Gets the value of the veteranStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranStatusIndicator() {
        return veteranStatusIndicator;
    }

    /**
     * Sets the value of the veteranStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranStatusIndicator(String value) {
        this.veteranStatusIndicator = value;
    }

}
