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
 * <p>Java class for ASSET_HOLDER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSET_HOLDER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element name="CONTACT_POINTS" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINTS" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.mismo.org/residential/2009/schemas}NAME" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ASSET_HOLDER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ASSET_HOLDER", propOrder = {
    "address",
    "contactpoints",
    "name",
    "extension"
})
public class ASSETHOLDER {

    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;
    @XmlElement(name = "CONTACT_POINTS")
    protected CONTACTPOINTS contactpoints;
    @XmlElement(name = "NAME")
    protected NAME name;
    @XmlElement(name = "EXTENSION")
    protected ASSETHOLDEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactpoints property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTS }
     *     
     */
    public CONTACTPOINTS getCONTACTPOINTS() {
        return contactpoints;
    }

    /**
     * Sets the value of the contactpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTS }
     *     
     */
    public void setCONTACTPOINTS(CONTACTPOINTS value) {
        this.contactpoints = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NAME }
     *     
     */
    public NAME getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAME }
     *     
     */
    public void setNAME(NAME value) {
        this.name = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ASSETHOLDEREXTENSION }
     *     
     */
    public ASSETHOLDEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSETHOLDEREXTENSION }
     *     
     */
    public void setEXTENSION(ASSETHOLDEREXTENSION value) {
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
