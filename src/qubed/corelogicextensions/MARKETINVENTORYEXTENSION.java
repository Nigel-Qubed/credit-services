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
 * <p>Java class for MARKET_INVENTORY_EXTENSION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARKET_INVENTORY_EXTENSION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISMO" type="{http://www.mismo.org/residential/2009/schemas}MISMO_BASE" minOccurs="0"/>
 *         &lt;element name="OTHER" type="{http://globalgateway.corelogic.com/order/2015}MARKET_INVENTORY_OTHER" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARKET_INVENTORY_EXTENSION", propOrder = {
    "mismo",
    "other"
})
public class MARKETINVENTORYEXTENSION {

    @XmlElement(name = "MISMO")
    protected MISMOBASE mismo;
    @XmlElement(name = "OTHER")
    protected MARKETINVENTORYOTHER other;

    /**
     * Gets the value of the mismo property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOBASE }
     *     
     */
    public MISMOBASE getMISMO() {
        return mismo;
    }

    /**
     * Sets the value of the mismo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOBASE }
     *     
     */
    public void setMISMO(MISMOBASE value) {
        this.mismo = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link MARKETINVENTORYOTHER }
     *     
     */
    public MARKETINVENTORYOTHER getOTHER() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKETINVENTORYOTHER }
     *     
     */
    public void setOTHER(MARKETINVENTORYOTHER value) {
        this.other = value;
    }

}
