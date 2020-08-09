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
 * Information about mortgage counseling or education delivered to the borrower.
 * 
 * <p>Java class for COUNSELING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUNSELING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COUNSELING_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING_DETAIL" minOccurs="0"/>
 *         &lt;element name="COUNSELING_EVENTS" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING_EVENTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COUNSELING", propOrder = {
    "counselingdetail",
    "counselingevents",
    "extension"
})
public class COUNSELING {

    @XmlElement(name = "COUNSELING_DETAIL")
    protected COUNSELINGDETAIL counselingdetail;
    @XmlElement(name = "COUNSELING_EVENTS")
    protected COUNSELINGEVENTS counselingevents;
    @XmlElement(name = "EXTENSION")
    protected COUNSELINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the counselingdetail property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELINGDETAIL }
     *     
     */
    public COUNSELINGDETAIL getCOUNSELINGDETAIL() {
        return counselingdetail;
    }

    /**
     * Sets the value of the counselingdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELINGDETAIL }
     *     
     */
    public void setCOUNSELINGDETAIL(COUNSELINGDETAIL value) {
        this.counselingdetail = value;
    }

    /**
     * Gets the value of the counselingevents property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELINGEVENTS }
     *     
     */
    public COUNSELINGEVENTS getCOUNSELINGEVENTS() {
        return counselingevents;
    }

    /**
     * Sets the value of the counselingevents property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELINGEVENTS }
     *     
     */
    public void setCOUNSELINGEVENTS(COUNSELINGEVENTS value) {
        this.counselingevents = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELINGEXTENSION }
     *     
     */
    public COUNSELINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELINGEXTENSION }
     *     
     */
    public void setEXTENSION(COUNSELINGEXTENSION value) {
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
