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
 * <p>Java class for QUARTER_STATISTIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUARTER_STATISTIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuarterForeClosureCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterSaleCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUARTER_STATISTIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "quarterForeClosureCount",
    "quarterDescription",
    "quarterNumber",
    "quarterSaleCount",
    "quarterYear"
})
public class QUARTERSTATISTIC {

    @XmlElement(name = "QuarterForeClosureCount")
    protected String quarterForeClosureCount;
    @XmlElement(name = "QuarterDescription")
    protected String quarterDescription;
    @XmlElement(name = "QuarterNumber")
    protected String quarterNumber;
    @XmlElement(name = "QuarterSaleCount")
    protected String quarterSaleCount;
    @XmlElement(name = "QuarterYear")
    protected String quarterYear;

    /**
     * Gets the value of the quarterForeClosureCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterForeClosureCount() {
        return quarterForeClosureCount;
    }

    /**
     * Sets the value of the quarterForeClosureCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterForeClosureCount(String value) {
        this.quarterForeClosureCount = value;
    }

    /**
     * Gets the value of the quarterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterDescription() {
        return quarterDescription;
    }

    /**
     * Sets the value of the quarterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterDescription(String value) {
        this.quarterDescription = value;
    }

    /**
     * Gets the value of the quarterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterNumber() {
        return quarterNumber;
    }

    /**
     * Sets the value of the quarterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterNumber(String value) {
        this.quarterNumber = value;
    }

    /**
     * Gets the value of the quarterSaleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterSaleCount() {
        return quarterSaleCount;
    }

    /**
     * Sets the value of the quarterSaleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterSaleCount(String value) {
        this.quarterSaleCount = value;
    }

    /**
     * Gets the value of the quarterYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterYear() {
        return quarterYear;
    }

    /**
     * Sets the value of the quarterYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterYear(String value) {
        this.quarterYear = value;
    }

}
