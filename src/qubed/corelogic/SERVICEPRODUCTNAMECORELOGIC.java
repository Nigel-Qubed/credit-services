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
 * <p>Java class for SERVICE_PRODUCT_NAME_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_PRODUCT_NAME_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBSTATUS" type="{http://globalgateway.corelogic.com/order/2015}SUBSTATUS" minOccurs="0"/>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}FOREIGN_OBJECT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_PRODUCT_NAME_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "substatus",
    "foreignobject"
})
public class SERVICEPRODUCTNAMECORELOGIC {

    @XmlElement(name = "SUBSTATUS")
    protected SUBSTATUS substatus;
    @XmlElement(name = "FOREIGN_OBJECT", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected FOREIGNOBJECT foreignobject;

    /**
     * Gets the value of the substatus property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTATUS }
     *     
     */
    public SUBSTATUS getSUBSTATUS() {
        return substatus;
    }

    /**
     * Sets the value of the substatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTATUS }
     *     
     */
    public void setSUBSTATUS(SUBSTATUS value) {
        this.substatus = value;
    }

    /**
     * Gets the value of the foreignobject property.
     * 
     * @return
     *     possible object is
     *     {@link FOREIGNOBJECT }
     *     
     */
    public FOREIGNOBJECT getFOREIGNOBJECT() {
        return foreignobject;
    }

    /**
     * Sets the value of the foreignobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOREIGNOBJECT }
     *     
     */
    public void setFOREIGNOBJECT(FOREIGNOBJECT value) {
        this.foreignobject = value;
    }

}
