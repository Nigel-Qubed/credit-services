//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "spkiSexp"
})
@XmlRootElement(name = "SPKIData")
public class SPKIData {

    @XmlElement(name = "SPKISexp", required = true)
    protected String spkiSexp;

    /**
     * Gets the value of the spkiSexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPKISexp() {
        return spkiSexp;
    }

    /**
     * Sets the value of the spkiSexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPKISexp(String value) {
        this.spkiSexp = value;
    }

}
