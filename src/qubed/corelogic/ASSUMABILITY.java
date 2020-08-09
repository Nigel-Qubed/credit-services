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
 * <p>Java class for ASSUMABILITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSUMABILITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSUMABILITY_OCCURRENCES" type="{http://www.mismo.org/residential/2009/schemas}ASSUMABILITY_OCCURRENCES" minOccurs="0"/>
 *         &lt;element name="ASSUMABILITY_RULE" type="{http://www.mismo.org/residential/2009/schemas}ASSUMABILITY_RULE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ASSUMABILITY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ASSUMABILITY", propOrder = {
    "assumabilityoccurrences",
    "assumabilityrule",
    "extension"
})
public class ASSUMABILITY {

    @XmlElement(name = "ASSUMABILITY_OCCURRENCES")
    protected ASSUMABILITYOCCURRENCES assumabilityoccurrences;
    @XmlElement(name = "ASSUMABILITY_RULE")
    protected ASSUMABILITYRULE assumabilityrule;
    @XmlElement(name = "EXTENSION")
    protected ASSUMABILITYEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the assumabilityoccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ASSUMABILITYOCCURRENCES }
     *     
     */
    public ASSUMABILITYOCCURRENCES getASSUMABILITYOCCURRENCES() {
        return assumabilityoccurrences;
    }

    /**
     * Sets the value of the assumabilityoccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSUMABILITYOCCURRENCES }
     *     
     */
    public void setASSUMABILITYOCCURRENCES(ASSUMABILITYOCCURRENCES value) {
        this.assumabilityoccurrences = value;
    }

    /**
     * Gets the value of the assumabilityrule property.
     * 
     * @return
     *     possible object is
     *     {@link ASSUMABILITYRULE }
     *     
     */
    public ASSUMABILITYRULE getASSUMABILITYRULE() {
        return assumabilityrule;
    }

    /**
     * Sets the value of the assumabilityrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSUMABILITYRULE }
     *     
     */
    public void setASSUMABILITYRULE(ASSUMABILITYRULE value) {
        this.assumabilityrule = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ASSUMABILITYEXTENSION }
     *     
     */
    public ASSUMABILITYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSUMABILITYEXTENSION }
     *     
     */
    public void setEXTENSION(ASSUMABILITYEXTENSION value) {
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
