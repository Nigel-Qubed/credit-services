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
 * Information about or associated with a delay in the bankruptcy process.
 * 
 * <p>Java class for BANKRUPTCY_DELAY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BANKRUPTCY_DELAY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankruptcyDelayCategoryType" type="{http://www.mismo.org/residential/2009/schemas}BankruptcyDelayCategoryEnum" minOccurs="0"/>
 *         &lt;element name="BankruptcyDelayCategoryTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BankruptcyDelayCategoryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BankruptcyDelayEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BankruptcyDelayStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_DELAY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BANKRUPTCY_DELAY", propOrder = {
    "bankruptcyDelayCategoryType",
    "bankruptcyDelayCategoryTypeAdditionalDescription",
    "bankruptcyDelayCategoryTypeOtherDescription",
    "bankruptcyDelayEndDate",
    "bankruptcyDelayStartDate",
    "extension"
})
public class BANKRUPTCYDELAY {

    @XmlElementRef(name = "BankruptcyDelayCategoryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BankruptcyDelayCategoryEnum> bankruptcyDelayCategoryType;
    @XmlElementRef(name = "BankruptcyDelayCategoryTypeAdditionalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> bankruptcyDelayCategoryTypeAdditionalDescription;
    @XmlElementRef(name = "BankruptcyDelayCategoryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> bankruptcyDelayCategoryTypeOtherDescription;
    @XmlElementRef(name = "BankruptcyDelayEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> bankruptcyDelayEndDate;
    @XmlElementRef(name = "BankruptcyDelayStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> bankruptcyDelayStartDate;
    @XmlElement(name = "EXTENSION")
    protected BANKRUPTCYDELAYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the bankruptcyDelayCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyDelayCategoryEnum }{@code >}
     *     
     */
    public JAXBElement<BankruptcyDelayCategoryEnum> getBankruptcyDelayCategoryType() {
        return bankruptcyDelayCategoryType;
    }

    /**
     * Sets the value of the bankruptcyDelayCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyDelayCategoryEnum }{@code >}
     *     
     */
    public void setBankruptcyDelayCategoryType(JAXBElement<BankruptcyDelayCategoryEnum> value) {
        this.bankruptcyDelayCategoryType = value;
    }

    /**
     * Gets the value of the bankruptcyDelayCategoryTypeAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBankruptcyDelayCategoryTypeAdditionalDescription() {
        return bankruptcyDelayCategoryTypeAdditionalDescription;
    }

    /**
     * Sets the value of the bankruptcyDelayCategoryTypeAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBankruptcyDelayCategoryTypeAdditionalDescription(JAXBElement<MISMOString> value) {
        this.bankruptcyDelayCategoryTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the bankruptcyDelayCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBankruptcyDelayCategoryTypeOtherDescription() {
        return bankruptcyDelayCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the bankruptcyDelayCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBankruptcyDelayCategoryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.bankruptcyDelayCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the bankruptcyDelayEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBankruptcyDelayEndDate() {
        return bankruptcyDelayEndDate;
    }

    /**
     * Sets the value of the bankruptcyDelayEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBankruptcyDelayEndDate(JAXBElement<MISMODate> value) {
        this.bankruptcyDelayEndDate = value;
    }

    /**
     * Gets the value of the bankruptcyDelayStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBankruptcyDelayStartDate() {
        return bankruptcyDelayStartDate;
    }

    /**
     * Sets the value of the bankruptcyDelayStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBankruptcyDelayStartDate(JAXBElement<MISMODate> value) {
        this.bankruptcyDelayStartDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BANKRUPTCYDELAYEXTENSION }
     *     
     */
    public BANKRUPTCYDELAYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYDELAYEXTENSION }
     *     
     */
    public void setEXTENSION(BANKRUPTCYDELAYEXTENSION value) {
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
