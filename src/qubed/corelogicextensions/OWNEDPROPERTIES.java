//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OWNED_PROPERTIES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OWNED_PROPERTIES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mismo.org/residential/2009/schemas}OWNED_PROPERTY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OWNED_PROPERTIES", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "ownedproperty"
})
public class OWNEDPROPERTIES {

    @XmlElement(name = "OWNED_PROPERTY", namespace = "http://www.mismo.org/residential/2009/schemas")
    protected List<OWNEDPROPERTY> ownedproperty;

    /**
     * Gets the value of the ownedproperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownedproperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOWNEDPROPERTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OWNEDPROPERTY }
     * 
     * 
     */
    public List<OWNEDPROPERTY> getOWNEDPROPERTY() {
        if (ownedproperty == null) {
            ownedproperty = new ArrayList<OWNEDPROPERTY>();
        }
        return this.ownedproperty;
    }

}
