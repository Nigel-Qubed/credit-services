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
 * <p>Java class for TAX_RETURN_DOCUMENTATION_PAYMENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_RETURN_DOCUMENTATION_PAYMENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedicalPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_RETURN_DOCUMENTATION_PAYMENTS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "medicalPayments",
    "totalPayments"
})
public class TAXRETURNDOCUMENTATIONPAYMENTS {

    @XmlElement(name = "MedicalPayments")
    protected String medicalPayments;
    @XmlElement(name = "TotalPayments")
    protected String totalPayments;

    /**
     * Gets the value of the medicalPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalPayments() {
        return medicalPayments;
    }

    /**
     * Sets the value of the medicalPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalPayments(String value) {
        this.medicalPayments = value;
    }

    /**
     * Gets the value of the totalPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPayments() {
        return totalPayments;
    }

    /**
     * Sets the value of the totalPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPayments(String value) {
        this.totalPayments = value;
    }

}
