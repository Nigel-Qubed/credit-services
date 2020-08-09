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
 * <p>Java class for CONVERSION_ADJUSTMENT_LIFETIME_ADJUSTMENT_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONVERSION_ADJUSTMENT_LIFETIME_ADJUSTMENT_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionDateMaximumExtensionMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ConversionMaximumAllowedCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ConversionOptionDurationMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ConversionOptionMarginRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConversionOptionMaximumRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConversionOptionMinimumRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConversionOptionNoteTermLessThanFifteenYearsAdditionalPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ConversionScheduleType" type="{http://www.mismo.org/residential/2009/schemas}ConversionScheduleEnum" minOccurs="0"/>
 *         &lt;element name="ConversionScheduleTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConversionType" type="{http://www.mismo.org/residential/2009/schemas}ConversionEnum" minOccurs="0"/>
 *         &lt;element name="ConversionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CONVERSION_ADJUSTMENT_LIFETIME_ADJUSTMENT_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CONVERSION_ADJUSTMENT_LIFETIME_ADJUSTMENT_RULE", propOrder = {
    "conversionDateMaximumExtensionMonthsCount",
    "conversionMaximumAllowedCount",
    "conversionOptionDurationMonthsCount",
    "conversionOptionMarginRatePercent",
    "conversionOptionMaximumRatePercent",
    "conversionOptionMinimumRatePercent",
    "conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent",
    "conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent",
    "conversionScheduleType",
    "conversionScheduleTypeOtherDescription",
    "conversionType",
    "conversionTypeOtherDescription",
    "extension"
})
public class CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULE {

    @XmlElementRef(name = "ConversionDateMaximumExtensionMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> conversionDateMaximumExtensionMonthsCount;
    @XmlElementRef(name = "ConversionMaximumAllowedCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> conversionMaximumAllowedCount;
    @XmlElementRef(name = "ConversionOptionDurationMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> conversionOptionDurationMonthsCount;
    @XmlElementRef(name = "ConversionOptionMarginRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> conversionOptionMarginRatePercent;
    @XmlElementRef(name = "ConversionOptionMaximumRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> conversionOptionMaximumRatePercent;
    @XmlElementRef(name = "ConversionOptionMinimumRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> conversionOptionMinimumRatePercent;
    @XmlElementRef(name = "ConversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent;
    @XmlElementRef(name = "ConversionOptionNoteTermLessThanFifteenYearsAdditionalPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent;
    @XmlElementRef(name = "ConversionScheduleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConversionScheduleEnum> conversionScheduleType;
    @XmlElementRef(name = "ConversionScheduleTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conversionScheduleTypeOtherDescription;
    @XmlElementRef(name = "ConversionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConversionEnum> conversionType;
    @XmlElementRef(name = "ConversionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conversionTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the conversionDateMaximumExtensionMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getConversionDateMaximumExtensionMonthsCount() {
        return conversionDateMaximumExtensionMonthsCount;
    }

    /**
     * Sets the value of the conversionDateMaximumExtensionMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setConversionDateMaximumExtensionMonthsCount(JAXBElement<MISMOCount> value) {
        this.conversionDateMaximumExtensionMonthsCount = value;
    }

    /**
     * Gets the value of the conversionMaximumAllowedCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getConversionMaximumAllowedCount() {
        return conversionMaximumAllowedCount;
    }

    /**
     * Sets the value of the conversionMaximumAllowedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setConversionMaximumAllowedCount(JAXBElement<MISMOCount> value) {
        this.conversionMaximumAllowedCount = value;
    }

    /**
     * Gets the value of the conversionOptionDurationMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getConversionOptionDurationMonthsCount() {
        return conversionOptionDurationMonthsCount;
    }

    /**
     * Sets the value of the conversionOptionDurationMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setConversionOptionDurationMonthsCount(JAXBElement<MISMOCount> value) {
        this.conversionOptionDurationMonthsCount = value;
    }

    /**
     * Gets the value of the conversionOptionMarginRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConversionOptionMarginRatePercent() {
        return conversionOptionMarginRatePercent;
    }

    /**
     * Sets the value of the conversionOptionMarginRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConversionOptionMarginRatePercent(JAXBElement<MISMOPercent> value) {
        this.conversionOptionMarginRatePercent = value;
    }

    /**
     * Gets the value of the conversionOptionMaximumRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConversionOptionMaximumRatePercent() {
        return conversionOptionMaximumRatePercent;
    }

    /**
     * Sets the value of the conversionOptionMaximumRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConversionOptionMaximumRatePercent(JAXBElement<MISMOPercent> value) {
        this.conversionOptionMaximumRatePercent = value;
    }

    /**
     * Gets the value of the conversionOptionMinimumRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConversionOptionMinimumRatePercent() {
        return conversionOptionMinimumRatePercent;
    }

    /**
     * Sets the value of the conversionOptionMinimumRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConversionOptionMinimumRatePercent(JAXBElement<MISMOPercent> value) {
        this.conversionOptionMinimumRatePercent = value;
    }

    /**
     * Gets the value of the conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent() {
        return conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent;
    }

    /**
     * Sets the value of the conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent(JAXBElement<MISMOPercent> value) {
        this.conversionOptionNoteTermGreaterThanFifteenYearsAdditionalPercent = value;
    }

    /**
     * Gets the value of the conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getConversionOptionNoteTermLessThanFifteenYearsAdditionalPercent() {
        return conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent;
    }

    /**
     * Sets the value of the conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setConversionOptionNoteTermLessThanFifteenYearsAdditionalPercent(JAXBElement<MISMOPercent> value) {
        this.conversionOptionNoteTermLessThanFifteenYearsAdditionalPercent = value;
    }

    /**
     * Gets the value of the conversionScheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConversionScheduleEnum }{@code >}
     *     
     */
    public JAXBElement<ConversionScheduleEnum> getConversionScheduleType() {
        return conversionScheduleType;
    }

    /**
     * Sets the value of the conversionScheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConversionScheduleEnum }{@code >}
     *     
     */
    public void setConversionScheduleType(JAXBElement<ConversionScheduleEnum> value) {
        this.conversionScheduleType = value;
    }

    /**
     * Gets the value of the conversionScheduleTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConversionScheduleTypeOtherDescription() {
        return conversionScheduleTypeOtherDescription;
    }

    /**
     * Sets the value of the conversionScheduleTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConversionScheduleTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.conversionScheduleTypeOtherDescription = value;
    }

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConversionEnum }{@code >}
     *     
     */
    public JAXBElement<ConversionEnum> getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConversionEnum }{@code >}
     *     
     */
    public void setConversionType(JAXBElement<ConversionEnum> value) {
        this.conversionType = value;
    }

    /**
     * Gets the value of the conversionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConversionTypeOtherDescription() {
        return conversionTypeOtherDescription;
    }

    /**
     * Sets the value of the conversionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConversionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.conversionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULEEXTENSION }
     *     
     */
    public CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULEEXTENSION }
     *     
     */
    public void setEXTENSION(CONVERSIONADJUSTMENTLIFETIMEADJUSTMENTRULEEXTENSION value) {
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
