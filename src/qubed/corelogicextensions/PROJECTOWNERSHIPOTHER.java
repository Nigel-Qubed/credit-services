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
 * <p>Java class for PROJECT_OWNERSHIP_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_OWNERSHIP_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROJECT_OWNERSHIP" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_OWNERSHIP_CORELOGIC" minOccurs="0"/>
 *         &lt;element name="PROJECT_OWNERSHIP_ENTITIES" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_OWNERSHIP_ENTITIES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_OWNERSHIP_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "projectownership",
    "projectownershipentities"
})
public class PROJECTOWNERSHIPOTHER {

    @XmlElement(name = "PROJECT_OWNERSHIP")
    protected PROJECTOWNERSHIPCORELOGIC projectownership;
    @XmlElement(name = "PROJECT_OWNERSHIP_ENTITIES")
    protected PROJECTOWNERSHIPENTITIES projectownershipentities;

    /**
     * Gets the value of the projectownership property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTOWNERSHIPCORELOGIC }
     *     
     */
    public PROJECTOWNERSHIPCORELOGIC getPROJECTOWNERSHIP() {
        return projectownership;
    }

    /**
     * Sets the value of the projectownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTOWNERSHIPCORELOGIC }
     *     
     */
    public void setPROJECTOWNERSHIP(PROJECTOWNERSHIPCORELOGIC value) {
        this.projectownership = value;
    }

    /**
     * Gets the value of the projectownershipentities property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTOWNERSHIPENTITIES }
     *     
     */
    public PROJECTOWNERSHIPENTITIES getPROJECTOWNERSHIPENTITIES() {
        return projectownershipentities;
    }

    /**
     * Sets the value of the projectownershipentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTOWNERSHIPENTITIES }
     *     
     */
    public void setPROJECTOWNERSHIPENTITIES(PROJECTOWNERSHIPENTITIES value) {
        this.projectownershipentities = value;
    }

}
