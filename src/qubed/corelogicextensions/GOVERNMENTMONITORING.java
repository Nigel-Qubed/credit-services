//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information about the HMDA data that is collected about the borrower including the race of the borrower.
 * 
 * <p>Java class for GOVERNMENT_MONITORING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GOVERNMENT_MONITORING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GOVERNMENT_MONITORING_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}GOVERNMENT_MONITORING_DETAIL" minOccurs="0"/>
 *         &lt;element name="HMDA_ETHNICITY_ORIGINS" type="{http://www.mismo.org/residential/2009/schemas}HMDA_ETHNICITY_ORIGINS" minOccurs="0"/>
 *         &lt;element name="HMDA_RACES" type="{http://www.mismo.org/residential/2009/schemas}HMDA_RACES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}GOVERNMENT_MONITORING_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GOVERNMENT_MONITORING", propOrder = {
    "governmentmonitoringdetail",
    "hmdaethnicityorigins",
    "hmdaraces",
    "extension"
})
public class GOVERNMENTMONITORING {

    @XmlElement(name = "GOVERNMENT_MONITORING_DETAIL")
    protected GOVERNMENTMONITORINGDETAIL governmentmonitoringdetail;
    @XmlElement(name = "HMDA_ETHNICITY_ORIGINS")
    protected HMDAETHNICITYORIGINS hmdaethnicityorigins;
    @XmlElement(name = "HMDA_RACES")
    protected HMDARACES hmdaraces;
    @XmlElement(name = "EXTENSION")
    protected GOVERNMENTMONITORINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the governmentmonitoringdetail property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTMONITORINGDETAIL }
     *     
     */
    public GOVERNMENTMONITORINGDETAIL getGOVERNMENTMONITORINGDETAIL() {
        return governmentmonitoringdetail;
    }

    /**
     * Sets the value of the governmentmonitoringdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTMONITORINGDETAIL }
     *     
     */
    public void setGOVERNMENTMONITORINGDETAIL(GOVERNMENTMONITORINGDETAIL value) {
        this.governmentmonitoringdetail = value;
    }

    /**
     * Gets the value of the hmdaethnicityorigins property.
     * 
     * @return
     *     possible object is
     *     {@link HMDAETHNICITYORIGINS }
     *     
     */
    public HMDAETHNICITYORIGINS getHMDAETHNICITYORIGINS() {
        return hmdaethnicityorigins;
    }

    /**
     * Sets the value of the hmdaethnicityorigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMDAETHNICITYORIGINS }
     *     
     */
    public void setHMDAETHNICITYORIGINS(HMDAETHNICITYORIGINS value) {
        this.hmdaethnicityorigins = value;
    }

    /**
     * Gets the value of the hmdaraces property.
     * 
     * @return
     *     possible object is
     *     {@link HMDARACES }
     *     
     */
    public HMDARACES getHMDARACES() {
        return hmdaraces;
    }

    /**
     * Sets the value of the hmdaraces property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMDARACES }
     *     
     */
    public void setHMDARACES(HMDARACES value) {
        this.hmdaraces = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTMONITORINGEXTENSION }
     *     
     */
    public GOVERNMENTMONITORINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTMONITORINGEXTENSION }
     *     
     */
    public void setEXTENSION(GOVERNMENTMONITORINGEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
