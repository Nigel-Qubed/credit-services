//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBSTATUSES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBSTATUSES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBSTATUS" type="{http://globalgateway.corelogic.com/order/2015}SUBSTATUS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBSTATUSES", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "substatus"
})
public class SUBSTATUSES {

    @XmlElement(name = "SUBSTATUS")
    protected List<SUBSTATUS> substatus;

    /**
     * Gets the value of the substatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUBSTATUS }
     * 
     * 
     */
    public List<SUBSTATUS> getSUBSTATUS() {
        if (substatus == null) {
            substatus = new ArrayList<SUBSTATUS>();
        }
        return this.substatus;
    }

}
