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
 * This container holds data specific to requesting IRS tax documentation as a specific form of income verification.
 * 
 * <p>Java class for REQUEST_FOR_TAX_RETURN_DOCUMENTATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST_FOR_TAX_RETURN_DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESSES" type="{http://www.mismo.org/residential/2009/schemas}ADDRESSES" minOccurs="0"/>
 *         &lt;element name="REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL" minOccurs="0"/>
 *         &lt;element name="TAX_RETURN_DOCUMENTATIONS" type="{http://www.mismo.org/residential/2009/schemas}TAX_RETURN_DOCUMENTATIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REQUEST_FOR_TAX_RETURN_DOCUMENTATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "REQUEST_FOR_TAX_RETURN_DOCUMENTATION", propOrder = {
    "addresses",
    "requestfortaxreturndocumentationdetail",
    "taxreturndocumentations",
    "extension"
})
public class REQUESTFORTAXRETURNDOCUMENTATION {

    @XmlElement(name = "ADDRESSES")
    protected ADDRESSES addresses;
    @XmlElement(name = "REQUEST_FOR_TAX_RETURN_DOCUMENTATION_DETAIL")
    protected REQUESTFORTAXRETURNDOCUMENTATIONDETAIL requestfortaxreturndocumentationdetail;
    @XmlElement(name = "TAX_RETURN_DOCUMENTATIONS")
    protected TAXRETURNDOCUMENTATIONS taxreturndocumentations;
    @XmlElement(name = "EXTENSION")
    protected REQUESTFORTAXRETURNDOCUMENTATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSES }
     *     
     */
    public ADDRESSES getADDRESSES() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSES }
     *     
     */
    public void setADDRESSES(ADDRESSES value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the requestfortaxreturndocumentationdetail property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONDETAIL }
     *     
     */
    public REQUESTFORTAXRETURNDOCUMENTATIONDETAIL getREQUESTFORTAXRETURNDOCUMENTATIONDETAIL() {
        return requestfortaxreturndocumentationdetail;
    }

    /**
     * Sets the value of the requestfortaxreturndocumentationdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONDETAIL }
     *     
     */
    public void setREQUESTFORTAXRETURNDOCUMENTATIONDETAIL(REQUESTFORTAXRETURNDOCUMENTATIONDETAIL value) {
        this.requestfortaxreturndocumentationdetail = value;
    }

    /**
     * Gets the value of the taxreturndocumentations property.
     * 
     * @return
     *     possible object is
     *     {@link TAXRETURNDOCUMENTATIONS }
     *     
     */
    public TAXRETURNDOCUMENTATIONS getTAXRETURNDOCUMENTATIONS() {
        return taxreturndocumentations;
    }

    /**
     * Sets the value of the taxreturndocumentations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXRETURNDOCUMENTATIONS }
     *     
     */
    public void setTAXRETURNDOCUMENTATIONS(TAXRETURNDOCUMENTATIONS value) {
        this.taxreturndocumentations = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONEXTENSION }
     *     
     */
    public REQUESTFORTAXRETURNDOCUMENTATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTFORTAXRETURNDOCUMENTATIONEXTENSION }
     *     
     */
    public void setEXTENSION(REQUESTFORTAXRETURNDOCUMENTATIONEXTENSION value) {
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
