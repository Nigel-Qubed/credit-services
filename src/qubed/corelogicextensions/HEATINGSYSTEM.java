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
 * Information regarding the type, quality, condition, fuel used and other facts about the heating system.
 * 
 * <p>Java class for HEATING_SYSTEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HEATING_SYSTEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ComponentClassificationType" type="{http://www.mismo.org/residential/2009/schemas}ComponentClassificationEnum" minOccurs="0"/>
 *         &lt;element name="ConditionRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="HeatingFuelType" type="{http://www.mismo.org/residential/2009/schemas}HeatingFuelEnum" minOccurs="0"/>
 *         &lt;element name="HeatingFuelTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HeatingSystemDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HeatingSystemPrimaryIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HeatingSystemType" type="{http://www.mismo.org/residential/2009/schemas}HeatingSystemEnum" minOccurs="0"/>
 *         &lt;element name="HeatingSystemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QualityRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QualityRatingType" type="{http://www.mismo.org/residential/2009/schemas}QualityRatingEnum" minOccurs="0"/>
 *         &lt;element name="SystemPermanentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HEATING_SYSTEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HEATING_SYSTEM", propOrder = {
    "componentAdjustmentAmount",
    "componentClassificationType",
    "conditionRatingDescription",
    "conditionRatingType",
    "heatingFuelType",
    "heatingFuelTypeOtherDescription",
    "heatingSystemDescription",
    "heatingSystemPrimaryIndicator",
    "heatingSystemType",
    "heatingSystemTypeOtherDescription",
    "qualityRatingDescription",
    "qualityRatingType",
    "systemPermanentIndicator",
    "extension"
})
public class HEATINGSYSTEM {

    @XmlElementRef(name = "ComponentAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> componentAdjustmentAmount;
    @XmlElementRef(name = "ComponentClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ComponentClassificationEnum> componentClassificationType;
    @XmlElementRef(name = "ConditionRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conditionRatingDescription;
    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "HeatingFuelType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HeatingFuelEnum> heatingFuelType;
    @XmlElementRef(name = "HeatingFuelTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> heatingFuelTypeOtherDescription;
    @XmlElementRef(name = "HeatingSystemDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> heatingSystemDescription;
    @XmlElementRef(name = "HeatingSystemPrimaryIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> heatingSystemPrimaryIndicator;
    @XmlElementRef(name = "HeatingSystemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HeatingSystemEnum> heatingSystemType;
    @XmlElementRef(name = "HeatingSystemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> heatingSystemTypeOtherDescription;
    @XmlElementRef(name = "QualityRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> qualityRatingDescription;
    @XmlElementRef(name = "QualityRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityRatingEnum> qualityRatingType;
    @XmlElementRef(name = "SystemPermanentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> systemPermanentIndicator;
    @XmlElement(name = "EXTENSION")
    protected HEATINGSYSTEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the componentAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getComponentAdjustmentAmount() {
        return componentAdjustmentAmount;
    }

    /**
     * Sets the value of the componentAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setComponentAdjustmentAmount(JAXBElement<MISMOAmount> value) {
        this.componentAdjustmentAmount = value;
    }

    /**
     * Gets the value of the componentClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComponentClassificationEnum }{@code >}
     *     
     */
    public JAXBElement<ComponentClassificationEnum> getComponentClassificationType() {
        return componentClassificationType;
    }

    /**
     * Sets the value of the componentClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComponentClassificationEnum }{@code >}
     *     
     */
    public void setComponentClassificationType(JAXBElement<ComponentClassificationEnum> value) {
        this.componentClassificationType = value;
    }

    /**
     * Gets the value of the conditionRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConditionRatingDescription() {
        return conditionRatingDescription;
    }

    /**
     * Sets the value of the conditionRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConditionRatingDescription(JAXBElement<MISMOString> value) {
        this.conditionRatingDescription = value;
    }

    /**
     * Gets the value of the conditionRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public JAXBElement<ConditionRatingEnum> getConditionRatingType() {
        return conditionRatingType;
    }

    /**
     * Sets the value of the conditionRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public void setConditionRatingType(JAXBElement<ConditionRatingEnum> value) {
        this.conditionRatingType = value;
    }

    /**
     * Gets the value of the heatingFuelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeatingFuelEnum }{@code >}
     *     
     */
    public JAXBElement<HeatingFuelEnum> getHeatingFuelType() {
        return heatingFuelType;
    }

    /**
     * Sets the value of the heatingFuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeatingFuelEnum }{@code >}
     *     
     */
    public void setHeatingFuelType(JAXBElement<HeatingFuelEnum> value) {
        this.heatingFuelType = value;
    }

    /**
     * Gets the value of the heatingFuelTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHeatingFuelTypeOtherDescription() {
        return heatingFuelTypeOtherDescription;
    }

    /**
     * Sets the value of the heatingFuelTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHeatingFuelTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.heatingFuelTypeOtherDescription = value;
    }

    /**
     * Gets the value of the heatingSystemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHeatingSystemDescription() {
        return heatingSystemDescription;
    }

    /**
     * Sets the value of the heatingSystemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHeatingSystemDescription(JAXBElement<MISMOString> value) {
        this.heatingSystemDescription = value;
    }

    /**
     * Gets the value of the heatingSystemPrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHeatingSystemPrimaryIndicator() {
        return heatingSystemPrimaryIndicator;
    }

    /**
     * Sets the value of the heatingSystemPrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHeatingSystemPrimaryIndicator(JAXBElement<MISMOIndicator> value) {
        this.heatingSystemPrimaryIndicator = value;
    }

    /**
     * Gets the value of the heatingSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeatingSystemEnum }{@code >}
     *     
     */
    public JAXBElement<HeatingSystemEnum> getHeatingSystemType() {
        return heatingSystemType;
    }

    /**
     * Sets the value of the heatingSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeatingSystemEnum }{@code >}
     *     
     */
    public void setHeatingSystemType(JAXBElement<HeatingSystemEnum> value) {
        this.heatingSystemType = value;
    }

    /**
     * Gets the value of the heatingSystemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHeatingSystemTypeOtherDescription() {
        return heatingSystemTypeOtherDescription;
    }

    /**
     * Sets the value of the heatingSystemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHeatingSystemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.heatingSystemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the qualityRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getQualityRatingDescription() {
        return qualityRatingDescription;
    }

    /**
     * Sets the value of the qualityRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setQualityRatingDescription(JAXBElement<MISMOString> value) {
        this.qualityRatingDescription = value;
    }

    /**
     * Gets the value of the qualityRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityRatingEnum }{@code >}
     *     
     */
    public JAXBElement<QualityRatingEnum> getQualityRatingType() {
        return qualityRatingType;
    }

    /**
     * Sets the value of the qualityRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityRatingEnum }{@code >}
     *     
     */
    public void setQualityRatingType(JAXBElement<QualityRatingEnum> value) {
        this.qualityRatingType = value;
    }

    /**
     * Gets the value of the systemPermanentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSystemPermanentIndicator() {
        return systemPermanentIndicator;
    }

    /**
     * Sets the value of the systemPermanentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSystemPermanentIndicator(JAXBElement<MISMOIndicator> value) {
        this.systemPermanentIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HEATINGSYSTEMEXTENSION }
     *     
     */
    public HEATINGSYSTEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEATINGSYSTEMEXTENSION }
     *     
     */
    public void setEXTENSION(HEATINGSYSTEMEXTENSION value) {
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