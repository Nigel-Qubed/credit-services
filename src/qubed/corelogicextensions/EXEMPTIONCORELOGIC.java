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
 * <p>Java class for EXEMPTION_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXEMPTION_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXEMPTION_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}EXEMPTION_DETAIL_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXEMPTION_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "exemptiondetail"
})
public class EXEMPTIONCORELOGIC {

    @XmlElement(name = "EXEMPTION_DETAIL")
    protected EXEMPTIONDETAILCORELOGIC exemptiondetail;

    /**
     * Gets the value of the exemptiondetail property.
     * 
     * @return
     *     possible object is
     *     {@link EXEMPTIONDETAILCORELOGIC }
     *     
     */
    public EXEMPTIONDETAILCORELOGIC getEXEMPTIONDETAIL() {
        return exemptiondetail;
    }

    /**
     * Sets the value of the exemptiondetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXEMPTIONDETAILCORELOGIC }
     *     
     */
    public void setEXEMPTIONDETAIL(EXEMPTIONDETAILCORELOGIC value) {
        this.exemptiondetail = value;
    }

}
