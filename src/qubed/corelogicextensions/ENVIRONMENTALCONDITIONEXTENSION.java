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
 * <p>Java class for ENVIRONMENTAL_CONDITION_EXTENSION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENVIRONMENTAL_CONDITION_EXTENSION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISMO" type="{http://www.mismo.org/residential/2009/schemas}MISMO_BASE" minOccurs="0"/>
 *         &lt;element name="OTHER" type="{http://www.mismo.org/residential/2009/schemas}OTHER_BASE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENVIRONMENTAL_CONDITION_EXTENSION", propOrder = {
    "mismo",
    "other"
})
public class ENVIRONMENTALCONDITIONEXTENSION {

    @XmlElement(name = "MISMO")
    protected MISMOBASE mismo;
    @XmlElement(name = "OTHER")
    protected OTHERBASE other;

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
     *     {@link OTHERBASE }
     *     
     */
    public OTHERBASE getOTHER() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHERBASE }
     *     
     */
    public void setOTHER(OTHERBASE value) {
        this.other = value;
    }

}
