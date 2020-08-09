//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Contains information about escrow accounts setup after closing for moneys held back until a specified work item has been completed.
 * 
 * <p>Java class for HOLDBACK_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOLDBACK_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EscrowHoldbackAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowHoldbackType" type="{http://www.mismo.org/residential/2009/schemas}EscrowHoldbackEnum" minOccurs="0"/>
 *         &lt;element name="EscrowHoldbackTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HOLDBACK_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HOLDBACK_ITEM", propOrder = {
    "escrowHoldbackAmount",
    "escrowHoldbackType",
    "escrowHoldbackTypeOtherDescription",
    "extension"
})
public class HOLDBACKITEM {

    @XmlElementRef(name = "EscrowHoldbackAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowHoldbackAmount;
    @XmlElementRef(name = "EscrowHoldbackType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrowHoldbackEnum> escrowHoldbackType;
    @XmlElementRef(name = "EscrowHoldbackTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> escrowHoldbackTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected HOLDBACKITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the escrowHoldbackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowHoldbackAmount() {
        return escrowHoldbackAmount;
    }

    /**
     * Sets the value of the escrowHoldbackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowHoldbackAmount(JAXBElement<MISMOAmount> value) {
        this.escrowHoldbackAmount = value;
    }

    /**
     * Gets the value of the escrowHoldbackType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrowHoldbackEnum }{@code >}
     *     
     */
    public JAXBElement<EscrowHoldbackEnum> getEscrowHoldbackType() {
        return escrowHoldbackType;
    }

    /**
     * Sets the value of the escrowHoldbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrowHoldbackEnum }{@code >}
     *     
     */
    public void setEscrowHoldbackType(JAXBElement<EscrowHoldbackEnum> value) {
        this.escrowHoldbackType = value;
    }

    /**
     * Gets the value of the escrowHoldbackTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEscrowHoldbackTypeOtherDescription() {
        return escrowHoldbackTypeOtherDescription;
    }

    /**
     * Sets the value of the escrowHoldbackTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEscrowHoldbackTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.escrowHoldbackTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HOLDBACKITEMEXTENSION }
     *     
     */
    public HOLDBACKITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOLDBACKITEMEXTENSION }
     *     
     */
    public void setEXTENSION(HOLDBACKITEMEXTENSION value) {
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