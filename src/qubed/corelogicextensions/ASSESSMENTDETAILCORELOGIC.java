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
 * Information about the parcel assessment. 
 * 
 * <p>Java class for ASSESSMENT_DETAIL_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSESSMENT_DETAIL_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessedValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AssessedValueCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="AssessedValueDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASSESSMENT_DETAIL_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "assessedValueAmount",
    "assessedValueCode",
    "assessedValueDescription"
})
public class ASSESSMENTDETAILCORELOGIC {

    @XmlElement(name = "AssessedValueAmount")
    protected MISMOAmount assessedValueAmount;
    @XmlElement(name = "AssessedValueCode")
    protected MISMOCode assessedValueCode;
    @XmlElement(name = "AssessedValueDescription")
    protected MISMOString assessedValueDescription;

    /**
     * Gets the value of the assessedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOAmount }
     *     
     */
    public MISMOAmount getAssessedValueAmount() {
        return assessedValueAmount;
    }

    /**
     * Sets the value of the assessedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOAmount }
     *     
     */
    public void setAssessedValueAmount(MISMOAmount value) {
        this.assessedValueAmount = value;
    }

    /**
     * Gets the value of the assessedValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOCode }
     *     
     */
    public MISMOCode getAssessedValueCode() {
        return assessedValueCode;
    }

    /**
     * Sets the value of the assessedValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOCode }
     *     
     */
    public void setAssessedValueCode(MISMOCode value) {
        this.assessedValueCode = value;
    }

    /**
     * Gets the value of the assessedValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getAssessedValueDescription() {
        return assessedValueDescription;
    }

    /**
     * Sets the value of the assessedValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setAssessedValueDescription(MISMOString value) {
        this.assessedValueDescription = value;
    }

}
