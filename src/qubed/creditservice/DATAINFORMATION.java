//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import java.util.ArrayList;
import java.util.List;
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
    "dataversion"
})
@XmlRootElement(name = "_DATA_INFORMATION")
public class DATAINFORMATION {

    @XmlElement(name = "DATA_VERSION", required = true)
    protected List<DATAVERSION> dataversion;

    /**
     * Gets the value of the dataversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATAVERSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DATAVERSION }
     * 
     * 
     */
    public List<DATAVERSION> getDATAVERSION() {
        if (dataversion == null) {
            dataversion = new ArrayList<DATAVERSION>();
        }
        return this.dataversion;
    }

}
