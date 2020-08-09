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
 * An equitable servitude is a term used in the law of real property to describe a nonpossessory interest in land that operates much like a covenant running with the land. Negative and affirmative servitudes (burden or benefit) are recognized. A covenant can be enforced against the current owner or successors of the burdened land who have notice of the covenant.
 * 
 * <p>Java class for SERVITUDE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVITUDE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONDITION_COVENANT_RESTRICTIONS" type="{http://www.mismo.org/residential/2009/schemas}CONDITION_COVENANT_RESTRICTIONS" minOccurs="0"/>
 *         &lt;element name="SERVITUDE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SERVITUDE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVITUDE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVITUDE", propOrder = {
    "conditioncovenantrestrictions",
    "servitudedetail",
    "extension"
})
public class SERVITUDE {

    @XmlElement(name = "CONDITION_COVENANT_RESTRICTIONS")
    protected CONDITIONCOVENANTRESTRICTIONS conditioncovenantrestrictions;
    @XmlElement(name = "SERVITUDE_DETAIL")
    protected SERVITUDEDETAIL servitudedetail;
    @XmlElement(name = "EXTENSION")
    protected SERVITUDEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the conditioncovenantrestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link CONDITIONCOVENANTRESTRICTIONS }
     *     
     */
    public CONDITIONCOVENANTRESTRICTIONS getCONDITIONCOVENANTRESTRICTIONS() {
        return conditioncovenantrestrictions;
    }

    /**
     * Sets the value of the conditioncovenantrestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONDITIONCOVENANTRESTRICTIONS }
     *     
     */
    public void setCONDITIONCOVENANTRESTRICTIONS(CONDITIONCOVENANTRESTRICTIONS value) {
        this.conditioncovenantrestrictions = value;
    }

    /**
     * Gets the value of the servitudedetail property.
     * 
     * @return
     *     possible object is
     *     {@link SERVITUDEDETAIL }
     *     
     */
    public SERVITUDEDETAIL getSERVITUDEDETAIL() {
        return servitudedetail;
    }

    /**
     * Sets the value of the servitudedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVITUDEDETAIL }
     *     
     */
    public void setSERVITUDEDETAIL(SERVITUDEDETAIL value) {
        this.servitudedetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SERVITUDEEXTENSION }
     *     
     */
    public SERVITUDEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVITUDEEXTENSION }
     *     
     */
    public void setEXTENSION(SERVITUDEEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
