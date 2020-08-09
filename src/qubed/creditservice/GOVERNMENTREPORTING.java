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
@XmlRootElement(name = "GOVERNMENT_REPORTING")
public class GOVERNMENTREPORTING {

    @XmlAttribute(name = "HMDAPurposeOfLoanType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hmdaPurposeOfLoanType;
    @XmlAttribute(name = "HMDAPreapprovalType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hmdaPreapprovalType;
    @XmlAttribute(name = "HMDA_HOEPALoanStatusIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hmdahoepaLoanStatusIndicator;
    @XmlAttribute(name = "HMDARateSpreadPercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hmdaRateSpreadPercent;

    /**
     * Gets the value of the hmdaPurposeOfLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMDAPurposeOfLoanType() {
        return hmdaPurposeOfLoanType;
    }

    /**
     * Sets the value of the hmdaPurposeOfLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMDAPurposeOfLoanType(String value) {
        this.hmdaPurposeOfLoanType = value;
    }

    /**
     * Gets the value of the hmdaPreapprovalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMDAPreapprovalType() {
        return hmdaPreapprovalType;
    }

    /**
     * Sets the value of the hmdaPreapprovalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMDAPreapprovalType(String value) {
        this.hmdaPreapprovalType = value;
    }

    /**
     * Gets the value of the hmdahoepaLoanStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMDAHOEPALoanStatusIndicator() {
        return hmdahoepaLoanStatusIndicator;
    }

    /**
     * Sets the value of the hmdahoepaLoanStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMDAHOEPALoanStatusIndicator(String value) {
        this.hmdahoepaLoanStatusIndicator = value;
    }

    /**
     * Gets the value of the hmdaRateSpreadPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMDARateSpreadPercent() {
        return hmdaRateSpreadPercent;
    }

    /**
     * Sets the value of the hmdaRateSpreadPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMDARateSpreadPercent(String value) {
        this.hmdaRateSpreadPercent = value;
    }

}
