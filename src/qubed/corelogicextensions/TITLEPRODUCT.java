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
 * A collection of values that specify the Title Product.
 * 
 * <p>Java class for TITLE_PRODUCT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TITLE_PRODUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CLOSING_PROTECTION_LETTER" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_PROTECTION_LETTER" minOccurs="0"/>
 *           &lt;element name="TITLE_COMMITMENT" type="{http://www.mismo.org/residential/2009/schemas}TITLE_COMMITMENT" minOccurs="0"/>
 *           &lt;element name="TITLE_POLICIES" type="{http://www.mismo.org/residential/2009/schemas}TITLE_POLICIES" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="PROPERTY" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY" minOccurs="0"/>
 *         &lt;element name="TITLE_PRODUCT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}TITLE_PRODUCT_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_PRODUCT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_PRODUCT", propOrder = {
    "closingprotectionletter",
    "titlecommitment",
    "titlepolicies",
    "property",
    "titleproductdetail",
    "extension"
})
public class TITLEPRODUCT {

    @XmlElement(name = "CLOSING_PROTECTION_LETTER")
    protected CLOSINGPROTECTIONLETTER closingprotectionletter;
    @XmlElement(name = "TITLE_COMMITMENT")
    protected TITLECOMMITMENT titlecommitment;
    @XmlElement(name = "TITLE_POLICIES")
    protected TITLEPOLICIES titlepolicies;
    @XmlElement(name = "PROPERTY")
    protected PROPERTY property;
    @XmlElement(name = "TITLE_PRODUCT_DETAIL")
    protected TITLEPRODUCTDETAIL titleproductdetail;
    @XmlElement(name = "EXTENSION")
    protected TITLEPRODUCTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingprotectionletter property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGPROTECTIONLETTER }
     *     
     */
    public CLOSINGPROTECTIONLETTER getCLOSINGPROTECTIONLETTER() {
        return closingprotectionletter;
    }

    /**
     * Sets the value of the closingprotectionletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGPROTECTIONLETTER }
     *     
     */
    public void setCLOSINGPROTECTIONLETTER(CLOSINGPROTECTIONLETTER value) {
        this.closingprotectionletter = value;
    }

    /**
     * Gets the value of the titlecommitment property.
     * 
     * @return
     *     possible object is
     *     {@link TITLECOMMITMENT }
     *     
     */
    public TITLECOMMITMENT getTITLECOMMITMENT() {
        return titlecommitment;
    }

    /**
     * Sets the value of the titlecommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLECOMMITMENT }
     *     
     */
    public void setTITLECOMMITMENT(TITLECOMMITMENT value) {
        this.titlecommitment = value;
    }

    /**
     * Gets the value of the titlepolicies property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEPOLICIES }
     *     
     */
    public TITLEPOLICIES getTITLEPOLICIES() {
        return titlepolicies;
    }

    /**
     * Sets the value of the titlepolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEPOLICIES }
     *     
     */
    public void setTITLEPOLICIES(TITLEPOLICIES value) {
        this.titlepolicies = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTY }
     *     
     */
    public PROPERTY getPROPERTY() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTY }
     *     
     */
    public void setPROPERTY(PROPERTY value) {
        this.property = value;
    }

    /**
     * Gets the value of the titleproductdetail property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEPRODUCTDETAIL }
     *     
     */
    public TITLEPRODUCTDETAIL getTITLEPRODUCTDETAIL() {
        return titleproductdetail;
    }

    /**
     * Sets the value of the titleproductdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEPRODUCTDETAIL }
     *     
     */
    public void setTITLEPRODUCTDETAIL(TITLEPRODUCTDETAIL value) {
        this.titleproductdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEPRODUCTEXTENSION }
     *     
     */
    public TITLEPRODUCTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEPRODUCTEXTENSION }
     *     
     */
    public void setEXTENSION(TITLEPRODUCTEXTENSION value) {
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