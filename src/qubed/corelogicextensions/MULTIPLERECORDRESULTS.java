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
 * <p>Java class for MULTIPLE_RECORD_RESULTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MULTIPLE_RECORD_RESULTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MULTIPLE_RECORD_RESULT" type="{http://globalgateway.corelogic.com/order/2015}MULTIPLE_RECORD_RESULT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIPLE_RECORD_RESULTS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "multiplerecordresult"
})
public class MULTIPLERECORDRESULTS {

    @XmlElement(name = "MULTIPLE_RECORD_RESULT")
    protected List<MULTIPLERECORDRESULT> multiplerecordresult;

    /**
     * Gets the value of the multiplerecordresult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiplerecordresult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMULTIPLERECORDRESULT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MULTIPLERECORDRESULT }
     * 
     * 
     */
    public List<MULTIPLERECORDRESULT> getMULTIPLERECORDRESULT() {
        if (multiplerecordresult == null) {
            multiplerecordresult = new ArrayList<MULTIPLERECORDRESULT>();
        }
        return this.multiplerecordresult;
    }

}
