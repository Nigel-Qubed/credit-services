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
 * <p>Java class for PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROJECT_COMMERCIAL_NONRESIDENTIAL_UNIT" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_COMMERCIAL_NONRESIDENTIAL_UNIT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_COMMERCIAL_NONRESIDENTIAL_UNITS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "projectcommercialnonresidentialunit"
})
public class PROJECTCOMMERCIALNONRESIDENTIALUNITS {

    @XmlElement(name = "PROJECT_COMMERCIAL_NONRESIDENTIAL_UNIT")
    protected List<PROJECTCOMMERCIALNONRESIDENTIALUNIT> projectcommercialnonresidentialunit;

    /**
     * Gets the value of the projectcommercialnonresidentialunit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectcommercialnonresidentialunit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROJECTCOMMERCIALNONRESIDENTIALUNIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROJECTCOMMERCIALNONRESIDENTIALUNIT }
     * 
     * 
     */
    public List<PROJECTCOMMERCIALNONRESIDENTIALUNIT> getPROJECTCOMMERCIALNONRESIDENTIALUNIT() {
        if (projectcommercialnonresidentialunit == null) {
            projectcommercialnonresidentialunit = new ArrayList<PROJECTCOMMERCIALNONRESIDENTIALUNIT>();
        }
        return this.projectcommercialnonresidentialunit;
    }

}
