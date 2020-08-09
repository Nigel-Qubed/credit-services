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
 * <p>Java class for SITE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SITE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OFF_SITE_IMPROVEMENTS" type="{http://www.mismo.org/residential/2009/schemas}OFF_SITE_IMPROVEMENTS" minOccurs="0"/>
 *         &lt;element name="SITE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SITE_DETAIL" minOccurs="0"/>
 *         &lt;element name="SITE_FEATURES" type="{http://www.mismo.org/residential/2009/schemas}SITE_FEATURES" minOccurs="0"/>
 *         &lt;element name="SITE_INFLUENCES" type="{http://www.mismo.org/residential/2009/schemas}SITE_INFLUENCES" minOccurs="0"/>
 *         &lt;element name="SITE_LOCATIONS" type="{http://www.mismo.org/residential/2009/schemas}SITE_LOCATIONS" minOccurs="0"/>
 *         &lt;element name="SITE_SIZE_LAYOUT" type="{http://www.mismo.org/residential/2009/schemas}SITE_SIZE_LAYOUT" minOccurs="0"/>
 *         &lt;element name="SITE_UTILITIES" type="{http://www.mismo.org/residential/2009/schemas}SITE_UTILITIES" minOccurs="0"/>
 *         &lt;element name="SITE_VIEWS" type="{http://www.mismo.org/residential/2009/schemas}SITE_VIEWS" minOccurs="0"/>
 *         &lt;element name="SITE_ZONING" type="{http://www.mismo.org/residential/2009/schemas}SITE_ZONING" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SITE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SITE", propOrder = {
    "offsiteimprovements",
    "sitedetail",
    "sitefeatures",
    "siteinfluences",
    "sitelocations",
    "sitesizelayout",
    "siteutilities",
    "siteviews",
    "sitezoning",
    "extension"
})
public class SITE {

    @XmlElement(name = "OFF_SITE_IMPROVEMENTS")
    protected OFFSITEIMPROVEMENTS offsiteimprovements;
    @XmlElement(name = "SITE_DETAIL")
    protected SITEDETAIL sitedetail;
    @XmlElement(name = "SITE_FEATURES")
    protected SITEFEATURES sitefeatures;
    @XmlElement(name = "SITE_INFLUENCES")
    protected SITEINFLUENCES siteinfluences;
    @XmlElement(name = "SITE_LOCATIONS")
    protected SITELOCATIONS sitelocations;
    @XmlElement(name = "SITE_SIZE_LAYOUT")
    protected SITESIZELAYOUT sitesizelayout;
    @XmlElement(name = "SITE_UTILITIES")
    protected SITEUTILITIES siteutilities;
    @XmlElement(name = "SITE_VIEWS")
    protected SITEVIEWS siteviews;
    @XmlElement(name = "SITE_ZONING")
    protected SITEZONING sitezoning;
    @XmlElement(name = "EXTENSION")
    protected SITEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the offsiteimprovements property.
     * 
     * @return
     *     possible object is
     *     {@link OFFSITEIMPROVEMENTS }
     *     
     */
    public OFFSITEIMPROVEMENTS getOFFSITEIMPROVEMENTS() {
        return offsiteimprovements;
    }

    /**
     * Sets the value of the offsiteimprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFSITEIMPROVEMENTS }
     *     
     */
    public void setOFFSITEIMPROVEMENTS(OFFSITEIMPROVEMENTS value) {
        this.offsiteimprovements = value;
    }

    /**
     * Gets the value of the sitedetail property.
     * 
     * @return
     *     possible object is
     *     {@link SITEDETAIL }
     *     
     */
    public SITEDETAIL getSITEDETAIL() {
        return sitedetail;
    }

    /**
     * Sets the value of the sitedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEDETAIL }
     *     
     */
    public void setSITEDETAIL(SITEDETAIL value) {
        this.sitedetail = value;
    }

    /**
     * Gets the value of the sitefeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SITEFEATURES }
     *     
     */
    public SITEFEATURES getSITEFEATURES() {
        return sitefeatures;
    }

    /**
     * Sets the value of the sitefeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEFEATURES }
     *     
     */
    public void setSITEFEATURES(SITEFEATURES value) {
        this.sitefeatures = value;
    }

    /**
     * Gets the value of the siteinfluences property.
     * 
     * @return
     *     possible object is
     *     {@link SITEINFLUENCES }
     *     
     */
    public SITEINFLUENCES getSITEINFLUENCES() {
        return siteinfluences;
    }

    /**
     * Sets the value of the siteinfluences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEINFLUENCES }
     *     
     */
    public void setSITEINFLUENCES(SITEINFLUENCES value) {
        this.siteinfluences = value;
    }

    /**
     * Gets the value of the sitelocations property.
     * 
     * @return
     *     possible object is
     *     {@link SITELOCATIONS }
     *     
     */
    public SITELOCATIONS getSITELOCATIONS() {
        return sitelocations;
    }

    /**
     * Sets the value of the sitelocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITELOCATIONS }
     *     
     */
    public void setSITELOCATIONS(SITELOCATIONS value) {
        this.sitelocations = value;
    }

    /**
     * Gets the value of the sitesizelayout property.
     * 
     * @return
     *     possible object is
     *     {@link SITESIZELAYOUT }
     *     
     */
    public SITESIZELAYOUT getSITESIZELAYOUT() {
        return sitesizelayout;
    }

    /**
     * Sets the value of the sitesizelayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITESIZELAYOUT }
     *     
     */
    public void setSITESIZELAYOUT(SITESIZELAYOUT value) {
        this.sitesizelayout = value;
    }

    /**
     * Gets the value of the siteutilities property.
     * 
     * @return
     *     possible object is
     *     {@link SITEUTILITIES }
     *     
     */
    public SITEUTILITIES getSITEUTILITIES() {
        return siteutilities;
    }

    /**
     * Sets the value of the siteutilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEUTILITIES }
     *     
     */
    public void setSITEUTILITIES(SITEUTILITIES value) {
        this.siteutilities = value;
    }

    /**
     * Gets the value of the siteviews property.
     * 
     * @return
     *     possible object is
     *     {@link SITEVIEWS }
     *     
     */
    public SITEVIEWS getSITEVIEWS() {
        return siteviews;
    }

    /**
     * Sets the value of the siteviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEVIEWS }
     *     
     */
    public void setSITEVIEWS(SITEVIEWS value) {
        this.siteviews = value;
    }

    /**
     * Gets the value of the sitezoning property.
     * 
     * @return
     *     possible object is
     *     {@link SITEZONING }
     *     
     */
    public SITEZONING getSITEZONING() {
        return sitezoning;
    }

    /**
     * Sets the value of the sitezoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEZONING }
     *     
     */
    public void setSITEZONING(SITEZONING value) {
        this.sitezoning = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SITEEXTENSION }
     *     
     */
    public SITEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEEXTENSION }
     *     
     */
    public void setEXTENSION(SITEEXTENSION value) {
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
