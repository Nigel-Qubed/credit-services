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
 * <p>Java class for SERVICE_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SERVICE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}SERVICE_DETAIL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "servicedetail"
})
public class SERVICECORELOGIC {

    @XmlElement(name = "SERVICE_DETAIL")
    protected SERVICEDETAIL servicedetail;

    /**
     * Gets the value of the servicedetail property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEDETAIL }
     *     
     */
    public SERVICEDETAIL getSERVICEDETAIL() {
        return servicedetail;
    }

    /**
     * Sets the value of the servicedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEDETAIL }
     *     
     */
    public void setSERVICEDETAIL(SERVICEDETAIL value) {
        this.servicedetail = value;
    }

}
