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
 * <p>Java class for DOCUMENTATION_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTATION_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualDocumentationLevelType" type="{http://globalgateway.corelogic.com/order/2015}ActualDocumentationLevelEnum" minOccurs="0"/>
 *         &lt;element name="ActualDocumentationLevelTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTATION_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "actualDocumentationLevelType",
    "actualDocumentationLevelTypeOtherDescription"
})
public class DOCUMENTATIONCORELOGIC {

    @XmlElement(name = "ActualDocumentationLevelType")
    protected ActualDocumentationLevelEnum actualDocumentationLevelType;
    @XmlElement(name = "ActualDocumentationLevelTypeOtherDescription")
    protected String actualDocumentationLevelTypeOtherDescription;

    /**
     * Gets the value of the actualDocumentationLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDocumentationLevelEnum }
     *     
     */
    public ActualDocumentationLevelEnum getActualDocumentationLevelType() {
        return actualDocumentationLevelType;
    }

    /**
     * Sets the value of the actualDocumentationLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDocumentationLevelEnum }
     *     
     */
    public void setActualDocumentationLevelType(ActualDocumentationLevelEnum value) {
        this.actualDocumentationLevelType = value;
    }

    /**
     * Gets the value of the actualDocumentationLevelTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDocumentationLevelTypeOtherDescription() {
        return actualDocumentationLevelTypeOtherDescription;
    }

    /**
     * Sets the value of the actualDocumentationLevelTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDocumentationLevelTypeOtherDescription(String value) {
        this.actualDocumentationLevelTypeOtherDescription = value;
    }

}
