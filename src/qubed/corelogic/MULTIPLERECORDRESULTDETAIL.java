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
 * <p>Java class for MULTIPLE_RECORD_RESULT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MULTIPLE_RECORD_RESULT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalMultipleRecordCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIPLE_RECORD_RESULT_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "totalMultipleRecordCount"
})
public class MULTIPLERECORDRESULTDETAIL {

    @XmlElement(name = "TotalMultipleRecordCount")
    protected String totalMultipleRecordCount;

    /**
     * Gets the value of the totalMultipleRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMultipleRecordCount() {
        return totalMultipleRecordCount;
    }

    /**
     * Sets the value of the totalMultipleRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMultipleRecordCount(String value) {
        this.totalMultipleRecordCount = value;
    }

}
