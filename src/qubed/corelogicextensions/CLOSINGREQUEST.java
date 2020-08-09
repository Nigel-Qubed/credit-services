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
 * Information necessary to make a request for a closing service.
 * 
 * <p>Java class for CLOSING_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLOSING_REQUEST_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_REQUEST_DETAIL" minOccurs="0"/>
 *         &lt;element name="CLOSING_REVISIONS" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_REVISIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_REQUEST_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CLOSING_REQUEST", propOrder = {
    "closingrequestdetail",
    "closingrevisions",
    "extension"
})
public class CLOSINGREQUEST {

    @XmlElement(name = "CLOSING_REQUEST_DETAIL")
    protected CLOSINGREQUESTDETAIL closingrequestdetail;
    @XmlElement(name = "CLOSING_REVISIONS")
    protected CLOSINGREVISIONS closingrevisions;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGREQUESTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingrequestdetail property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGREQUESTDETAIL }
     *     
     */
    public CLOSINGREQUESTDETAIL getCLOSINGREQUESTDETAIL() {
        return closingrequestdetail;
    }

    /**
     * Sets the value of the closingrequestdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGREQUESTDETAIL }
     *     
     */
    public void setCLOSINGREQUESTDETAIL(CLOSINGREQUESTDETAIL value) {
        this.closingrequestdetail = value;
    }

    /**
     * Gets the value of the closingrevisions property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGREVISIONS }
     *     
     */
    public CLOSINGREVISIONS getCLOSINGREVISIONS() {
        return closingrevisions;
    }

    /**
     * Sets the value of the closingrevisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGREVISIONS }
     *     
     */
    public void setCLOSINGREVISIONS(CLOSINGREVISIONS value) {
        this.closingrevisions = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGREQUESTEXTENSION }
     *     
     */
    public CLOSINGREQUESTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGREQUESTEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGREQUESTEXTENSION value) {
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
