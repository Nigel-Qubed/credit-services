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
 * <p>Java class for FRAUD_ALERT_RECOMMENDATIONS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRAUD_ALERT_RECOMMENDATIONS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FRAUD_ALERT_RECOMMENDATION" type="{http://globalgateway.corelogic.com/order/2015}FRAUD_ALERT_RECOMMENDATION" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRAUD_ALERT_RECOMMENDATIONS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "fraudalertrecommendation"
})
public class FRAUDALERTRECOMMENDATIONS {

    @XmlElement(name = "FRAUD_ALERT_RECOMMENDATION", required = true)
    protected List<FRAUDALERTRECOMMENDATION> fraudalertrecommendation;

    /**
     * Gets the value of the fraudalertrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fraudalertrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRAUDALERTRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRAUDALERTRECOMMENDATION }
     * 
     * 
     */
    public List<FRAUDALERTRECOMMENDATION> getFRAUDALERTRECOMMENDATION() {
        if (fraudalertrecommendation == null) {
            fraudalertrecommendation = new ArrayList<FRAUDALERTRECOMMENDATION>();
        }
        return this.fraudalertrecommendation;
    }

}
