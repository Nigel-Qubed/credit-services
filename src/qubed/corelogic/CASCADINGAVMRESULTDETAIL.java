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
 * <p>Java class for CASCADING_AVM_RESULT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASCADING_AVM_RESULT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVMProductTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVMVendorProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASCADING_AVM_RESULT_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "avmProductTypeDescription",
    "avmVendorProductType",
    "resultReferenceIdentifier"
})
public class CASCADINGAVMRESULTDETAIL {

    @XmlElement(name = "AVMProductTypeDescription")
    protected String avmProductTypeDescription;
    @XmlElement(name = "AVMVendorProductType")
    protected String avmVendorProductType;
    @XmlElement(name = "ResultReferenceIdentifier")
    protected String resultReferenceIdentifier;

    /**
     * Gets the value of the avmProductTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVMProductTypeDescription() {
        return avmProductTypeDescription;
    }

    /**
     * Sets the value of the avmProductTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVMProductTypeDescription(String value) {
        this.avmProductTypeDescription = value;
    }

    /**
     * Gets the value of the avmVendorProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVMVendorProductType() {
        return avmVendorProductType;
    }

    /**
     * Sets the value of the avmVendorProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVMVendorProductType(String value) {
        this.avmVendorProductType = value;
    }

    /**
     * Gets the value of the resultReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultReferenceIdentifier() {
        return resultReferenceIdentifier;
    }

    /**
     * Sets the value of the resultReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultReferenceIdentifier(String value) {
        this.resultReferenceIdentifier = value;
    }

}