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
 * <p>Java class for BORROWER_DETAIL_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BORROWER_DETAIL_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BORROWER_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}BORROWER_DETAIL_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BORROWER_DETAIL_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "borrowerdetail"
})
public class BORROWERDETAILOTHER {

    @XmlElement(name = "BORROWER_DETAIL")
    protected BORROWERDETAILCORELOGIC borrowerdetail;

    /**
     * Gets the value of the borrowerdetail property.
     * 
     * @return
     *     possible object is
     *     {@link BORROWERDETAILCORELOGIC }
     *     
     */
    public BORROWERDETAILCORELOGIC getBORROWERDETAIL() {
        return borrowerdetail;
    }

    /**
     * Sets the value of the borrowerdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BORROWERDETAILCORELOGIC }
     *     
     */
    public void setBORROWERDETAIL(BORROWERDETAILCORELOGIC value) {
        this.borrowerdetail = value;
    }

}