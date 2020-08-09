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
 * Contains information specific to a particular premium of a mortgage insurance policy.
 * 
 * <p>Java class for MI_PREMIUM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_PREMIUM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MI_PREMIUM_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUM_DETAIL" minOccurs="0"/>
 *         &lt;element name="MI_PREMIUM_PAYMENTS" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUM_PAYMENTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUM_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "MI_PREMIUM", propOrder = {
    "mipremiumdetail",
    "mipremiumpayments",
    "extension"
})
public class MIPREMIUM {

    @XmlElement(name = "MI_PREMIUM_DETAIL")
    protected MIPREMIUMDETAIL mipremiumdetail;
    @XmlElement(name = "MI_PREMIUM_PAYMENTS")
    protected MIPREMIUMPAYMENTS mipremiumpayments;
    @XmlElement(name = "EXTENSION")
    protected MIPREMIUMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mipremiumdetail property.
     * 
     * @return
     *     possible object is
     *     {@link MIPREMIUMDETAIL }
     *     
     */
    public MIPREMIUMDETAIL getMIPREMIUMDETAIL() {
        return mipremiumdetail;
    }

    /**
     * Sets the value of the mipremiumdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMDETAIL }
     *     
     */
    public void setMIPREMIUMDETAIL(MIPREMIUMDETAIL value) {
        this.mipremiumdetail = value;
    }

    /**
     * Gets the value of the mipremiumpayments property.
     * 
     * @return
     *     possible object is
     *     {@link MIPREMIUMPAYMENTS }
     *     
     */
    public MIPREMIUMPAYMENTS getMIPREMIUMPAYMENTS() {
        return mipremiumpayments;
    }

    /**
     * Sets the value of the mipremiumpayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMPAYMENTS }
     *     
     */
    public void setMIPREMIUMPAYMENTS(MIPREMIUMPAYMENTS value) {
        this.mipremiumpayments = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIPREMIUMEXTENSION }
     *     
     */
    public MIPREMIUMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMEXTENSION }
     *     
     */
    public void setEXTENSION(MIPREMIUMEXTENSION value) {
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
