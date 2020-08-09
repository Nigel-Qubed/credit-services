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
@XmlRootElement(name = "RATE_ADJUSTMENT")
public class RATEADJUSTMENT {

    @XmlAttribute(name = "FirstRateAdjustmentMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String firstRateAdjustmentMonths;
    @XmlAttribute(name = "_CalculationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String calculationType;
    @XmlAttribute(name = "_DurationMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String durationMonths;
    @XmlAttribute(name = "_Percent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String percent;
    @XmlAttribute(name = "_PeriodNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String periodNumber;
    @XmlAttribute(name = "_SubsequentCapPercent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subsequentCapPercent;
    @XmlAttribute(name = "SubsequentRateAdjustmentMonths")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subsequentRateAdjustmentMonths;

    /**
     * Gets the value of the firstRateAdjustmentMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRateAdjustmentMonths() {
        return firstRateAdjustmentMonths;
    }

    /**
     * Sets the value of the firstRateAdjustmentMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRateAdjustmentMonths(String value) {
        this.firstRateAdjustmentMonths = value;
    }

    /**
     * Gets the value of the calculationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationType() {
        return calculationType;
    }

    /**
     * Sets the value of the calculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationType(String value) {
        this.calculationType = value;
    }

    /**
     * Gets the value of the durationMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationMonths() {
        return durationMonths;
    }

    /**
     * Sets the value of the durationMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationMonths(String value) {
        this.durationMonths = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodNumber(String value) {
        this.periodNumber = value;
    }

    /**
     * Gets the value of the subsequentCapPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentCapPercent() {
        return subsequentCapPercent;
    }

    /**
     * Sets the value of the subsequentCapPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentCapPercent(String value) {
        this.subsequentCapPercent = value;
    }

    /**
     * Gets the value of the subsequentRateAdjustmentMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentRateAdjustmentMonths() {
        return subsequentRateAdjustmentMonths;
    }

    /**
     * Sets the value of the subsequentRateAdjustmentMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentRateAdjustmentMonths(String value) {
        this.subsequentRateAdjustmentMonths = value;
    }

}
