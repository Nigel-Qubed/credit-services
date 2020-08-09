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
 * Defines the name, address, and contact information for the borrower's nearest living relative and defines the relationship of that person to the borrower.
 * 
 * <p>Java class for NEAREST_LIVING_RELATIVE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NEAREST_LIVING_RELATIVE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element name="CONTACT_POINTS" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINTS" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.mismo.org/residential/2009/schemas}NAME" minOccurs="0"/>
 *         &lt;element name="NEAREST_LIVING_RELATIVE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}NEAREST_LIVING_RELATIVE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}NEAREST_LIVING_RELATIVE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "NEAREST_LIVING_RELATIVE", propOrder = {
    "address",
    "contactpoints",
    "name",
    "nearestlivingrelativedetail",
    "extension"
})
public class NEARESTLIVINGRELATIVE {

    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;
    @XmlElement(name = "CONTACT_POINTS")
    protected CONTACTPOINTS contactpoints;
    @XmlElement(name = "NAME")
    protected NAME name;
    @XmlElement(name = "NEAREST_LIVING_RELATIVE_DETAIL")
    protected NEARESTLIVINGRELATIVEDETAIL nearestlivingrelativedetail;
    @XmlElement(name = "EXTENSION")
    protected NEARESTLIVINGRELATIVEEXTENSION extension;
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
     * Gets the value of the nearestlivingrelativedetail property.
     * 
     * @return
     *     possible object is
     *     {@link NEARESTLIVINGRELATIVEDETAIL }
     *     
     */
    public NEARESTLIVINGRELATIVEDETAIL getNEARESTLIVINGRELATIVEDETAIL() {
        return nearestlivingrelativedetail;
    }

    /**
     * Sets the value of the nearestlivingrelativedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEARESTLIVINGRELATIVEDETAIL }
     *     
     */
    public void setNEARESTLIVINGRELATIVEDETAIL(NEARESTLIVINGRELATIVEDETAIL value) {
        this.nearestlivingrelativedetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NEARESTLIVINGRELATIVEEXTENSION }
     *     
     */
    public NEARESTLIVINGRELATIVEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEARESTLIVINGRELATIVEEXTENSION }
     *     
     */
    public void setEXTENSION(NEARESTLIVINGRELATIVEEXTENSION value) {
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
