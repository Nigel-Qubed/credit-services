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
 * <p>Java class for PROJECT_FINANCIAL_INFORMATION_LITIGATIONS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_FINANCIAL_INFORMATION_LITIGATIONS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROJECT_FINANCIAL_INFORMATION_LITIGATION" type="{http://globalgateway.corelogic.com/order/2015}PROJECT_FINANCIAL_INFORMATION_LITIGATION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_FINANCIAL_INFORMATION_LITIGATIONS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "projectfinancialinformationlitigation"
})
public class PROJECTFINANCIALINFORMATIONLITIGATIONS {

    @XmlElement(name = "PROJECT_FINANCIAL_INFORMATION_LITIGATION")
    protected List<PROJECTFINANCIALINFORMATIONLITIGATION> projectfinancialinformationlitigation;

    /**
     * Gets the value of the projectfinancialinformationlitigation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectfinancialinformationlitigation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROJECTFINANCIALINFORMATIONLITIGATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROJECTFINANCIALINFORMATIONLITIGATION }
     * 
     * 
     */
    public List<PROJECTFINANCIALINFORMATIONLITIGATION> getPROJECTFINANCIALINFORMATIONLITIGATION() {
        if (projectfinancialinformationlitigation == null) {
            projectfinancialinformationlitigation = new ArrayList<PROJECTFINANCIALINFORMATIONLITIGATION>();
        }
        return this.projectfinancialinformationlitigation;
    }

}
