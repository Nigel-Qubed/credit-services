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
 * <p>Java class for PHASE_DETAIL_OTHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PHASE_DETAIL_OTHER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PHASE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}PHASE_DETAIL_OTHER_CORELOGIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHASE_DETAIL_OTHER", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "phasedetail"
})
public class PHASEDETAILOTHER {

    @XmlElement(name = "PHASE_DETAIL")
    protected PHASEDETAILOTHERCORELOGIC phasedetail;

    /**
     * Gets the value of the phasedetail property.
     * 
     * @return
     *     possible object is
     *     {@link PHASEDETAILOTHERCORELOGIC }
     *     
     */
    public PHASEDETAILOTHERCORELOGIC getPHASEDETAIL() {
        return phasedetail;
    }

    /**
     * Sets the value of the phasedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHASEDETAILOTHERCORELOGIC }
     *     
     */
    public void setPHASEDETAIL(PHASEDETAILOTHERCORELOGIC value) {
        this.phasedetail = value;
    }

}
