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
 * Past due principal, interest and other monthly mortgage obligations.
 * 
 * <p>Java class for ARREARAGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARREARAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARREARAGE_COMPONENTS" type="{http://www.mismo.org/residential/2009/schemas}ARREARAGE_COMPONENTS" minOccurs="0"/>
 *         &lt;element name="ARREARAGE_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}ARREARAGE_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ARREARAGE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ARREARAGE", propOrder = {
    "arrearagecomponents",
    "arrearagesummary",
    "extension"
})
public class ARREARAGE {

    @XmlElement(name = "ARREARAGE_COMPONENTS")
    protected ARREARAGECOMPONENTS arrearagecomponents;
    @XmlElement(name = "ARREARAGE_SUMMARY")
    protected ARREARAGESUMMARY arrearagesummary;
    @XmlElement(name = "EXTENSION")
    protected ARREARAGEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the arrearagecomponents property.
     * 
     * @return
     *     possible object is
     *     {@link ARREARAGECOMPONENTS }
     *     
     */
    public ARREARAGECOMPONENTS getARREARAGECOMPONENTS() {
        return arrearagecomponents;
    }

    /**
     * Sets the value of the arrearagecomponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARREARAGECOMPONENTS }
     *     
     */
    public void setARREARAGECOMPONENTS(ARREARAGECOMPONENTS value) {
        this.arrearagecomponents = value;
    }

    /**
     * Gets the value of the arrearagesummary property.
     * 
     * @return
     *     possible object is
     *     {@link ARREARAGESUMMARY }
     *     
     */
    public ARREARAGESUMMARY getARREARAGESUMMARY() {
        return arrearagesummary;
    }

    /**
     * Sets the value of the arrearagesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARREARAGESUMMARY }
     *     
     */
    public void setARREARAGESUMMARY(ARREARAGESUMMARY value) {
        this.arrearagesummary = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ARREARAGEEXTENSION }
     *     
     */
    public ARREARAGEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARREARAGEEXTENSION }
     *     
     */
    public void setEXTENSION(ARREARAGEEXTENSION value) {
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
