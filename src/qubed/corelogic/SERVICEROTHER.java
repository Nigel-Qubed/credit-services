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
 * <p>Java class for SERVICER_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICER_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SERVICER" type="{http://globalgateway.corelogic.com/order/2015}SERVICER_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICER_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "servicer"
})
public class SERVICEROTHER {

    @XmlElement(name = "SERVICER")
    protected SERVICERCORELOGIC servicer;

    /**
     * Gets the value of the servicer property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICERCORELOGIC }
     *     
     */
    public SERVICERCORELOGIC getSERVICER() {
        return servicer;
    }

    /**
     * Sets the value of the servicer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICERCORELOGIC }
     *     
     */
    public void setSERVICER(SERVICERCORELOGIC value) {
        this.servicer = value;
    }

}
