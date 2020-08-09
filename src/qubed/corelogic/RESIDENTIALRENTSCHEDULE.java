//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

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
 * <p>Java class for RESIDENTIAL_RENT_SCHEDULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESIDENTIAL_RENT_SCHEDULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESIDENTIAL_RENT_SCHEDULE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENT_SCHEDULE_DETAIL" minOccurs="0"/>
 *         &lt;element name="RESIDENTIAL_RENTAL" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENTAL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENT_SCHEDULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RESIDENTIAL_RENT_SCHEDULE", propOrder = {
    "residentialrentscheduledetail",
    "residentialrental",
    "extension"
})
public class RESIDENTIALRENTSCHEDULE {

    @XmlElement(name = "RESIDENTIAL_RENT_SCHEDULE_DETAIL")
    protected RESIDENTIALRENTSCHEDULEDETAIL residentialrentscheduledetail;
    @XmlElement(name = "RESIDENTIAL_RENTAL")
    protected RESIDENTIALRENTAL residentialrental;
    @XmlElement(name = "EXTENSION")
    protected RESIDENTIALRENTSCHEDULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the residentialrentscheduledetail property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTSCHEDULEDETAIL }
     *     
     */
    public RESIDENTIALRENTSCHEDULEDETAIL getRESIDENTIALRENTSCHEDULEDETAIL() {
        return residentialrentscheduledetail;
    }

    /**
     * Sets the value of the residentialrentscheduledetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTSCHEDULEDETAIL }
     *     
     */
    public void setRESIDENTIALRENTSCHEDULEDETAIL(RESIDENTIALRENTSCHEDULEDETAIL value) {
        this.residentialrentscheduledetail = value;
    }

    /**
     * Gets the value of the residentialrental property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTAL }
     *     
     */
    public RESIDENTIALRENTAL getRESIDENTIALRENTAL() {
        return residentialrental;
    }

    /**
     * Sets the value of the residentialrental property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTAL }
     *     
     */
    public void setRESIDENTIALRENTAL(RESIDENTIALRENTAL value) {
        this.residentialrental = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTSCHEDULEEXTENSION }
     *     
     */
    public RESIDENTIALRENTSCHEDULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTSCHEDULEEXTENSION }
     *     
     */
    public void setEXTENSION(RESIDENTIALRENTSCHEDULEEXTENSION value) {
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
