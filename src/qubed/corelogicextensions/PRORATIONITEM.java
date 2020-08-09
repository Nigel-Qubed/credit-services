//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

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
 * Information regarding the type of prorated item and the associated per diem amounts.
 * 
 * <p>Java class for PRORATION_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRORATION_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegratedDisclosureLineNumberValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSubsectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProrationItemAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProrationItemPaidFromDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ProrationItemPaidThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ProrationItemType" type="{http://www.mismo.org/residential/2009/schemas}ProrationItemEnum" minOccurs="0"/>
 *         &lt;element name="ProrationItemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRORATION_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PRORATION_ITEM", propOrder = {
    "integratedDisclosureLineNumberValue",
    "integratedDisclosureSectionType",
    "integratedDisclosureSectionTypeOtherDescription",
    "integratedDisclosureSubsectionType",
    "integratedDisclosureSubsectionTypeOtherDescription",
    "prorationItemAmount",
    "prorationItemPaidFromDate",
    "prorationItemPaidThroughDate",
    "prorationItemType",
    "prorationItemTypeOtherDescription",
    "extension"
})
public class PRORATIONITEM {

    @XmlElementRef(name = "IntegratedDisclosureLineNumberValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> integratedDisclosureLineNumberValue;
    @XmlElementRef(name = "IntegratedDisclosureSectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSectionEnum> integratedDisclosureSectionType;
    @XmlElementRef(name = "IntegratedDisclosureSectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSectionTypeOtherDescription;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSubsectionEnum> integratedDisclosureSubsectionType;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSubsectionTypeOtherDescription;
    @XmlElementRef(name = "ProrationItemAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prorationItemAmount;
    @XmlElementRef(name = "ProrationItemPaidFromDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> prorationItemPaidFromDate;
    @XmlElementRef(name = "ProrationItemPaidThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> prorationItemPaidThroughDate;
    @XmlElementRef(name = "ProrationItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProrationItemEnum> prorationItemType;
    @XmlElementRef(name = "ProrationItemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> prorationItemTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PRORATIONITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getIntegratedDisclosureLineNumberValue() {
        return integratedDisclosureLineNumberValue;
    }

    /**
     * Sets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setIntegratedDisclosureLineNumberValue(JAXBElement<MISMOValue> value) {
        this.integratedDisclosureLineNumberValue = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSectionEnum> getIntegratedDisclosureSectionType() {
        return integratedDisclosureSectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionType(JAXBElement<IntegratedDisclosureSectionEnum> value) {
        this.integratedDisclosureSectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSectionTypeOtherDescription() {
        return integratedDisclosureSectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSubsectionEnum> getIntegratedDisclosureSubsectionType() {
        return integratedDisclosureSubsectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionType(JAXBElement<IntegratedDisclosureSubsectionEnum> value) {
        this.integratedDisclosureSubsectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSubsectionTypeOtherDescription() {
        return integratedDisclosureSubsectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSubsectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the prorationItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProrationItemAmount() {
        return prorationItemAmount;
    }

    /**
     * Sets the value of the prorationItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProrationItemAmount(JAXBElement<MISMOAmount> value) {
        this.prorationItemAmount = value;
    }

    /**
     * Gets the value of the prorationItemPaidFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getProrationItemPaidFromDate() {
        return prorationItemPaidFromDate;
    }

    /**
     * Sets the value of the prorationItemPaidFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setProrationItemPaidFromDate(JAXBElement<MISMODate> value) {
        this.prorationItemPaidFromDate = value;
    }

    /**
     * Gets the value of the prorationItemPaidThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getProrationItemPaidThroughDate() {
        return prorationItemPaidThroughDate;
    }

    /**
     * Sets the value of the prorationItemPaidThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setProrationItemPaidThroughDate(JAXBElement<MISMODate> value) {
        this.prorationItemPaidThroughDate = value;
    }

    /**
     * Gets the value of the prorationItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProrationItemEnum }{@code >}
     *     
     */
    public JAXBElement<ProrationItemEnum> getProrationItemType() {
        return prorationItemType;
    }

    /**
     * Sets the value of the prorationItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProrationItemEnum }{@code >}
     *     
     */
    public void setProrationItemType(JAXBElement<ProrationItemEnum> value) {
        this.prorationItemType = value;
    }

    /**
     * Gets the value of the prorationItemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProrationItemTypeOtherDescription() {
        return prorationItemTypeOtherDescription;
    }

    /**
     * Sets the value of the prorationItemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProrationItemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.prorationItemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PRORATIONITEMEXTENSION }
     *     
     */
    public PRORATIONITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRORATIONITEMEXTENSION }
     *     
     */
    public void setEXTENSION(PRORATIONITEMEXTENSION value) {
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
