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
 * <p>Java class for SYSTEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYSTEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COOLING_SYSTEMS" type="{http://www.mismo.org/residential/2009/schemas}COOLING_SYSTEMS" minOccurs="0"/>
 *         &lt;element name="HEATING_SYSTEMS" type="{http://www.mismo.org/residential/2009/schemas}HEATING_SYSTEMS" minOccurs="0"/>
 *         &lt;element name="SECURITY_SYSTEMS" type="{http://www.mismo.org/residential/2009/schemas}SECURITY_SYSTEMS" minOccurs="0"/>
 *         &lt;element name="SOLAR_PANEL_ARRAYS" type="{http://www.mismo.org/residential/2009/schemas}SOLAR_PANEL_ARRAYS" minOccurs="0"/>
 *         &lt;element name="SYSTEM_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SYSTEM_DETAIL" minOccurs="0"/>
 *         &lt;element name="WATER_SYSTEMS" type="{http://www.mismo.org/residential/2009/schemas}WATER_SYSTEMS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SYSTEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SYSTEM", propOrder = {
    "coolingsystems",
    "heatingsystems",
    "securitysystems",
    "solarpanelarrays",
    "systemdetail",
    "watersystems",
    "extension"
})
public class SYSTEM {

    @XmlElement(name = "COOLING_SYSTEMS")
    protected COOLINGSYSTEMS coolingsystems;
    @XmlElement(name = "HEATING_SYSTEMS")
    protected HEATINGSYSTEMS heatingsystems;
    @XmlElement(name = "SECURITY_SYSTEMS")
    protected SECURITYSYSTEMS securitysystems;
    @XmlElement(name = "SOLAR_PANEL_ARRAYS")
    protected SOLARPANELARRAYS solarpanelarrays;
    @XmlElement(name = "SYSTEM_DETAIL")
    protected SYSTEMDETAIL systemdetail;
    @XmlElement(name = "WATER_SYSTEMS")
    protected WATERSYSTEMS watersystems;
    @XmlElement(name = "EXTENSION")
    protected SYSTEMEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the coolingsystems property.
     * 
     * @return
     *     possible object is
     *     {@link COOLINGSYSTEMS }
     *     
     */
    public COOLINGSYSTEMS getCOOLINGSYSTEMS() {
        return coolingsystems;
    }

    /**
     * Sets the value of the coolingsystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link COOLINGSYSTEMS }
     *     
     */
    public void setCOOLINGSYSTEMS(COOLINGSYSTEMS value) {
        this.coolingsystems = value;
    }

    /**
     * Gets the value of the heatingsystems property.
     * 
     * @return
     *     possible object is
     *     {@link HEATINGSYSTEMS }
     *     
     */
    public HEATINGSYSTEMS getHEATINGSYSTEMS() {
        return heatingsystems;
    }

    /**
     * Sets the value of the heatingsystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEATINGSYSTEMS }
     *     
     */
    public void setHEATINGSYSTEMS(HEATINGSYSTEMS value) {
        this.heatingsystems = value;
    }

    /**
     * Gets the value of the securitysystems property.
     * 
     * @return
     *     possible object is
     *     {@link SECURITYSYSTEMS }
     *     
     */
    public SECURITYSYSTEMS getSECURITYSYSTEMS() {
        return securitysystems;
    }

    /**
     * Sets the value of the securitysystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECURITYSYSTEMS }
     *     
     */
    public void setSECURITYSYSTEMS(SECURITYSYSTEMS value) {
        this.securitysystems = value;
    }

    /**
     * Gets the value of the solarpanelarrays property.
     * 
     * @return
     *     possible object is
     *     {@link SOLARPANELARRAYS }
     *     
     */
    public SOLARPANELARRAYS getSOLARPANELARRAYS() {
        return solarpanelarrays;
    }

    /**
     * Sets the value of the solarpanelarrays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLARPANELARRAYS }
     *     
     */
    public void setSOLARPANELARRAYS(SOLARPANELARRAYS value) {
        this.solarpanelarrays = value;
    }

    /**
     * Gets the value of the systemdetail property.
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMDETAIL }
     *     
     */
    public SYSTEMDETAIL getSYSTEMDETAIL() {
        return systemdetail;
    }

    /**
     * Sets the value of the systemdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMDETAIL }
     *     
     */
    public void setSYSTEMDETAIL(SYSTEMDETAIL value) {
        this.systemdetail = value;
    }

    /**
     * Gets the value of the watersystems property.
     * 
     * @return
     *     possible object is
     *     {@link WATERSYSTEMS }
     *     
     */
    public WATERSYSTEMS getWATERSYSTEMS() {
        return watersystems;
    }

    /**
     * Sets the value of the watersystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link WATERSYSTEMS }
     *     
     */
    public void setWATERSYSTEMS(WATERSYSTEMS value) {
        this.watersystems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMEXTENSION }
     *     
     */
    public SYSTEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMEXTENSION }
     *     
     */
    public void setEXTENSION(SYSTEMEXTENSION value) {
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
