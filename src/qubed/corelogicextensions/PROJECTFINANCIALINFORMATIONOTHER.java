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
 * <p>Java class for PROJECT_FINANCIAL_INFORMATION_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_FINANCIAL_INFORMATION_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROJECT_FINANCIAL_INFORMATION" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_FINANCIAL_INFORMATION_CORELOGIC" minOccurs="0"/>
 *         &lt;element name="PROJECT_FINANCIAL_INFORMATION_SPECIAL_ASSESSMENTS" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_FINANCIAL_INFORMATION_SPECIAL_ASSESSMENTS" minOccurs="0"/>
 *         &lt;element name="PROJECT_FINANCIAL_INFORMATION_LITIGATIONS" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_FINANCIAL_INFORMATION_LITIGATIONS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_FINANCIAL_INFORMATION_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "projectfinancialinformation",
    "projectfinancialinformationspecialassessments",
    "projectfinancialinformationlitigations"
})
public class PROJECTFINANCIALINFORMATIONOTHER {

    @XmlElement(name = "PROJECT_FINANCIAL_INFORMATION")
    protected PROJECTFINANCIALINFORMATIONCORELOGIC projectfinancialinformation;
    @XmlElement(name = "PROJECT_FINANCIAL_INFORMATION_SPECIAL_ASSESSMENTS")
    protected PROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS projectfinancialinformationspecialassessments;
    @XmlElement(name = "PROJECT_FINANCIAL_INFORMATION_LITIGATIONS")
    protected PROJECTFINANCIALINFORMATIONLITIGATIONS projectfinancialinformationlitigations;

    /**
     * Gets the value of the projectfinancialinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTFINANCIALINFORMATIONCORELOGIC }
     *     
     */
    public PROJECTFINANCIALINFORMATIONCORELOGIC getPROJECTFINANCIALINFORMATION() {
        return projectfinancialinformation;
    }

    /**
     * Sets the value of the projectfinancialinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTFINANCIALINFORMATIONCORELOGIC }
     *     
     */
    public void setPROJECTFINANCIALINFORMATION(PROJECTFINANCIALINFORMATIONCORELOGIC value) {
        this.projectfinancialinformation = value;
    }

    /**
     * Gets the value of the projectfinancialinformationspecialassessments property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS }
     *     
     */
    public PROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS getPROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS() {
        return projectfinancialinformationspecialassessments;
    }

    /**
     * Sets the value of the projectfinancialinformationspecialassessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS }
     *     
     */
    public void setPROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS(PROJECTFINANCIALINFORMATIONSPECIALASSESSMENTS value) {
        this.projectfinancialinformationspecialassessments = value;
    }

    /**
     * Gets the value of the projectfinancialinformationlitigations property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTFINANCIALINFORMATIONLITIGATIONS }
     *     
     */
    public PROJECTFINANCIALINFORMATIONLITIGATIONS getPROJECTFINANCIALINFORMATIONLITIGATIONS() {
        return projectfinancialinformationlitigations;
    }

    /**
     * Sets the value of the projectfinancialinformationlitigations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTFINANCIALINFORMATIONLITIGATIONS }
     *     
     */
    public void setPROJECTFINANCIALINFORMATIONLITIGATIONS(PROJECTFINANCIALINFORMATIONLITIGATIONS value) {
        this.projectfinancialinformationlitigations = value;
    }

}
