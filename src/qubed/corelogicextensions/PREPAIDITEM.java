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
 * Information regarding the prepaid item.
 * 
 * <p>Java class for PREPAID_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREPAID_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREPAID_ITEM_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PREPAID_ITEM_DETAIL" minOccurs="0"/>
 *         &lt;element name="PREPAID_ITEM_PAID_TO" type="{http://www.mismo.org/residential/2009/schemas}PAID_TO" minOccurs="0"/>
 *         &lt;element name="PREPAID_ITEM_PAYMENTS" type="{http://www.mismo.org/residential/2009/schemas}PREPAID_ITEM_PAYMENTS" minOccurs="0"/>
 *         &lt;element name="SELECTED_SERVICE_PROVIDER" type="{http://www.mismo.org/residential/2009/schemas}SELECTED_SERVICE_PROVIDER" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PREPAID_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PREPAID_ITEM", propOrder = {
    "prepaiditemdetail",
    "prepaiditempaidto",
    "prepaiditempayments",
    "selectedserviceprovider",
    "extension"
})
public class PREPAIDITEM {

    @XmlElement(name = "PREPAID_ITEM_DETAIL")
    protected PREPAIDITEMDETAIL prepaiditemdetail;
    @XmlElement(name = "PREPAID_ITEM_PAID_TO")
    protected PAIDTO prepaiditempaidto;
    @XmlElement(name = "PREPAID_ITEM_PAYMENTS")
    protected PREPAIDITEMPAYMENTS prepaiditempayments;
    @XmlElement(name = "SELECTED_SERVICE_PROVIDER")
    protected SELECTEDSERVICEPROVIDER selectedserviceprovider;
    @XmlElement(name = "EXTENSION")
    protected PREPAIDITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the prepaiditemdetail property.
     * 
     * @return
     *     possible object is
     *     {@link PREPAIDITEMDETAIL }
     *     
     */
    public PREPAIDITEMDETAIL getPREPAIDITEMDETAIL() {
        return prepaiditemdetail;
    }

    /**
     * Sets the value of the prepaiditemdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPAIDITEMDETAIL }
     *     
     */
    public void setPREPAIDITEMDETAIL(PREPAIDITEMDETAIL value) {
        this.prepaiditemdetail = value;
    }

    /**
     * Gets the value of the prepaiditempaidto property.
     * 
     * @return
     *     possible object is
     *     {@link PAIDTO }
     *     
     */
    public PAIDTO getPREPAIDITEMPAIDTO() {
        return prepaiditempaidto;
    }

    /**
     * Sets the value of the prepaiditempaidto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAIDTO }
     *     
     */
    public void setPREPAIDITEMPAIDTO(PAIDTO value) {
        this.prepaiditempaidto = value;
    }

    /**
     * Gets the value of the prepaiditempayments property.
     * 
     * @return
     *     possible object is
     *     {@link PREPAIDITEMPAYMENTS }
     *     
     */
    public PREPAIDITEMPAYMENTS getPREPAIDITEMPAYMENTS() {
        return prepaiditempayments;
    }

    /**
     * Sets the value of the prepaiditempayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPAIDITEMPAYMENTS }
     *     
     */
    public void setPREPAIDITEMPAYMENTS(PREPAIDITEMPAYMENTS value) {
        this.prepaiditempayments = value;
    }

    /**
     * Gets the value of the selectedserviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link SELECTEDSERVICEPROVIDER }
     *     
     */
    public SELECTEDSERVICEPROVIDER getSELECTEDSERVICEPROVIDER() {
        return selectedserviceprovider;
    }

    /**
     * Sets the value of the selectedserviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SELECTEDSERVICEPROVIDER }
     *     
     */
    public void setSELECTEDSERVICEPROVIDER(SELECTEDSERVICEPROVIDER value) {
        this.selectedserviceprovider = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PREPAIDITEMEXTENSION }
     *     
     */
    public PREPAIDITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPAIDITEMEXTENSION }
     *     
     */
    public void setEXTENSION(PREPAIDITEMEXTENSION value) {
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
