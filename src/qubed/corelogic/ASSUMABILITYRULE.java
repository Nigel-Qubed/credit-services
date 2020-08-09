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
 * Collects assumability related information regarding the loan product.
 * 
 * <p>Java class for ASSUMABILITY_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSUMABILITY_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssumabilityBeginDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AssumabilityTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AssumabilityType" type="{http://www.mismo.org/residential/2009/schemas}AssumabilityEnum" minOccurs="0"/>
 *         &lt;element name="AssumabilityTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConditionsToAssumabilityIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ASSUMABILITY_RULE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASSUMABILITY_RULE", propOrder = {
    "assumabilityBeginDate",
    "assumabilityTermMonthsCount",
    "assumabilityType",
    "assumabilityTypeOtherDescription",
    "conditionsToAssumabilityIndicator",
    "extension"
})
public class ASSUMABILITYRULE {

    @XmlElementRef(name = "AssumabilityBeginDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> assumabilityBeginDate;
    @XmlElementRef(name = "AssumabilityTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> assumabilityTermMonthsCount;
    @XmlElementRef(name = "AssumabilityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AssumabilityEnum> assumabilityType;
    @XmlElementRef(name = "AssumabilityTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> assumabilityTypeOtherDescription;
    @XmlElementRef(name = "ConditionsToAssumabilityIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> conditionsToAssumabilityIndicator;
    @XmlElement(name = "EXTENSION")
    protected ASSUMABILITYRULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the assumabilityBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAssumabilityBeginDate() {
        return assumabilityBeginDate;
    }

    /**
     * Sets the value of the assumabilityBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAssumabilityBeginDate(JAXBElement<MISMODate> value) {
        this.assumabilityBeginDate = value;
    }

    /**
     * Gets the value of the assumabilityTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getAssumabilityTermMonthsCount() {
        return assumabilityTermMonthsCount;
    }

    /**
     * Sets the value of the assumabilityTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setAssumabilityTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.assumabilityTermMonthsCount = value;
    }

    /**
     * Gets the value of the assumabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssumabilityEnum }{@code >}
     *     
     */
    public JAXBElement<AssumabilityEnum> getAssumabilityType() {
        return assumabilityType;
    }

    /**
     * Sets the value of the assumabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssumabilityEnum }{@code >}
     *     
     */
    public void setAssumabilityType(JAXBElement<AssumabilityEnum> value) {
        this.assumabilityType = value;
    }

    /**
     * Gets the value of the assumabilityTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAssumabilityTypeOtherDescription() {
        return assumabilityTypeOtherDescription;
    }

    /**
     * Sets the value of the assumabilityTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAssumabilityTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.assumabilityTypeOtherDescription = value;
    }

    /**
     * Gets the value of the conditionsToAssumabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getConditionsToAssumabilityIndicator() {
        return conditionsToAssumabilityIndicator;
    }

    /**
     * Sets the value of the conditionsToAssumabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setConditionsToAssumabilityIndicator(JAXBElement<MISMOIndicator> value) {
        this.conditionsToAssumabilityIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ASSUMABILITYRULEEXTENSION }
     *     
     */
    public ASSUMABILITYRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSUMABILITYRULEEXTENSION }
     *     
     */
    public void setEXTENSION(ASSUMABILITYRULEEXTENSION value) {
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
