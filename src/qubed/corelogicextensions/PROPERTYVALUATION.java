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
 * Information regarding the type and result of a valuation ordered and/or received on the property, both original and current. A given result may be from either an automated or traditional valuation method.
 * 
 * <p>Java class for PROPERTY_VALUATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_VALUATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVMS" type="{http://www.mismo.org/residential/2009/schemas}AVMS" minOccurs="0"/>
 *         &lt;element name="PROPERTY_VALUATION_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_VALUATION_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_VALUATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROPERTY_VALUATION", propOrder = {
    "avms",
    "propertyvaluationdetail",
    "extension"
})
public class PROPERTYVALUATION {

    @XmlElement(name = "AVMS")
    protected AVMS avms;
    @XmlElement(name = "PROPERTY_VALUATION_DETAIL")
    protected PROPERTYVALUATIONDETAIL propertyvaluationdetail;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYVALUATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the avms property.
     * 
     * @return
     *     possible object is
     *     {@link AVMS }
     *     
     */
    public AVMS getAVMS() {
        return avms;
    }

    /**
     * Sets the value of the avms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVMS }
     *     
     */
    public void setAVMS(AVMS value) {
        this.avms = value;
    }

    /**
     * Gets the value of the propertyvaluationdetail property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYVALUATIONDETAIL }
     *     
     */
    public PROPERTYVALUATIONDETAIL getPROPERTYVALUATIONDETAIL() {
        return propertyvaluationdetail;
    }

    /**
     * Sets the value of the propertyvaluationdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYVALUATIONDETAIL }
     *     
     */
    public void setPROPERTYVALUATIONDETAIL(PROPERTYVALUATIONDETAIL value) {
        this.propertyvaluationdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYVALUATIONEXTENSION }
     *     
     */
    public PROPERTYVALUATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYVALUATIONEXTENSION }
     *     
     */
    public void setEXTENSION(PROPERTYVALUATIONEXTENSION value) {
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
