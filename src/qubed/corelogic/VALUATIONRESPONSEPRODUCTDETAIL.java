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
 * <p>Java class for VALUATION_RESPONSE_PRODUCT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_RESPONSE_PRODUCT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CascadingAVMIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CascadingAVMRuleIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CascadingAVMRuleVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeSearchCriteriaIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertySearchCriteriaStrictMatchIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALUATION_RESPONSE_PRODUCT_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "cascadingAVMIndicator",
    "cascadingAVMRuleIdentifier",
    "cascadingAVMRuleVersionIdentifier",
    "includeSearchCriteriaIndicator",
    "propertySearchCriteriaStrictMatchIndicator",
    "reportType",
    "valuationDate"
})
public class VALUATIONRESPONSEPRODUCTDETAIL {

    @XmlElement(name = "CascadingAVMIndicator")
    protected MISMOIndicator cascadingAVMIndicator;
    @XmlElement(name = "CascadingAVMRuleIdentifier")
    protected String cascadingAVMRuleIdentifier;
    @XmlElement(name = "CascadingAVMRuleVersionIdentifier")
    protected String cascadingAVMRuleVersionIdentifier;
    @XmlElement(name = "IncludeSearchCriteriaIndicator")
    protected MISMOIndicator includeSearchCriteriaIndicator;
    @XmlElement(name = "PropertySearchCriteriaStrictMatchIndicator")
    protected MISMOIndicator propertySearchCriteriaStrictMatchIndicator;
    @XmlElement(name = "ReportType")
    protected String reportType;
    @XmlElement(name = "ValuationDate")
    protected String valuationDate;

    /**
     * Gets the value of the cascadingAVMIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getCascadingAVMIndicator() {
        return cascadingAVMIndicator;
    }

    /**
     * Sets the value of the cascadingAVMIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setCascadingAVMIndicator(MISMOIndicator value) {
        this.cascadingAVMIndicator = value;
    }

    /**
     * Gets the value of the cascadingAVMRuleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascadingAVMRuleIdentifier() {
        return cascadingAVMRuleIdentifier;
    }

    /**
     * Sets the value of the cascadingAVMRuleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascadingAVMRuleIdentifier(String value) {
        this.cascadingAVMRuleIdentifier = value;
    }

    /**
     * Gets the value of the cascadingAVMRuleVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascadingAVMRuleVersionIdentifier() {
        return cascadingAVMRuleVersionIdentifier;
    }

    /**
     * Sets the value of the cascadingAVMRuleVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascadingAVMRuleVersionIdentifier(String value) {
        this.cascadingAVMRuleVersionIdentifier = value;
    }

    /**
     * Gets the value of the includeSearchCriteriaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getIncludeSearchCriteriaIndicator() {
        return includeSearchCriteriaIndicator;
    }

    /**
     * Sets the value of the includeSearchCriteriaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setIncludeSearchCriteriaIndicator(MISMOIndicator value) {
        this.includeSearchCriteriaIndicator = value;
    }

    /**
     * Gets the value of the propertySearchCriteriaStrictMatchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getPropertySearchCriteriaStrictMatchIndicator() {
        return propertySearchCriteriaStrictMatchIndicator;
    }

    /**
     * Sets the value of the propertySearchCriteriaStrictMatchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setPropertySearchCriteriaStrictMatchIndicator(MISMOIndicator value) {
        this.propertySearchCriteriaStrictMatchIndicator = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationDate(String value) {
        this.valuationDate = value;
    }

}
