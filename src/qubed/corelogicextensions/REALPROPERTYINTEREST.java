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
 * Contains the details of a particular topic that will need research during the course of the collateral valuation assignment.
 * 
 * <p>Java class for REAL_PROPERTY_INTEREST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REAL_PROPERTY_INTEREST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraisedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CooperativeUnitSharesCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PropertyInterestRightsAppraisedType" type="{http://www.mismo.org/residential/2009/schemas}PropertyInterestRightsAppraisedEnum" minOccurs="0"/>
 *         &lt;element name="PropertyInterestRightsAppraisedTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyPartialInterestType" type="{http://www.mismo.org/residential/2009/schemas}PropertyPartialInterestEnum" minOccurs="0"/>
 *         &lt;element name="PropertyPartialInterestTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UnitIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REAL_PROPERTY_INTEREST_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "REAL_PROPERTY_INTEREST", propOrder = {
    "appraisedIndicator",
    "cooperativeUnitSharesCount",
    "propertyInterestRightsAppraisedType",
    "propertyInterestRightsAppraisedTypeOtherDescription",
    "propertyPartialInterestType",
    "propertyPartialInterestTypeOtherDescription",
    "unitIdentifier",
    "extension"
})
public class REALPROPERTYINTEREST {

    @XmlElementRef(name = "AppraisedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> appraisedIndicator;
    @XmlElementRef(name = "CooperativeUnitSharesCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> cooperativeUnitSharesCount;
    @XmlElementRef(name = "PropertyInterestRightsAppraisedType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyInterestRightsAppraisedEnum> propertyInterestRightsAppraisedType;
    @XmlElementRef(name = "PropertyInterestRightsAppraisedTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInterestRightsAppraisedTypeOtherDescription;
    @XmlElementRef(name = "PropertyPartialInterestType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyPartialInterestEnum> propertyPartialInterestType;
    @XmlElementRef(name = "PropertyPartialInterestTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyPartialInterestTypeOtherDescription;
    @XmlElementRef(name = "UnitIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> unitIdentifier;
    @XmlElement(name = "EXTENSION")
    protected REALPROPERTYINTERESTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraisedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAppraisedIndicator() {
        return appraisedIndicator;
    }

    /**
     * Sets the value of the appraisedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAppraisedIndicator(JAXBElement<MISMOIndicator> value) {
        this.appraisedIndicator = value;
    }

    /**
     * Gets the value of the cooperativeUnitSharesCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getCooperativeUnitSharesCount() {
        return cooperativeUnitSharesCount;
    }

    /**
     * Sets the value of the cooperativeUnitSharesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setCooperativeUnitSharesCount(JAXBElement<MISMOCount> value) {
        this.cooperativeUnitSharesCount = value;
    }

    /**
     * Gets the value of the propertyInterestRightsAppraisedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyInterestRightsAppraisedEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyInterestRightsAppraisedEnum> getPropertyInterestRightsAppraisedType() {
        return propertyInterestRightsAppraisedType;
    }

    /**
     * Sets the value of the propertyInterestRightsAppraisedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyInterestRightsAppraisedEnum }{@code >}
     *     
     */
    public void setPropertyInterestRightsAppraisedType(JAXBElement<PropertyInterestRightsAppraisedEnum> value) {
        this.propertyInterestRightsAppraisedType = value;
    }

    /**
     * Gets the value of the propertyInterestRightsAppraisedTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyInterestRightsAppraisedTypeOtherDescription() {
        return propertyInterestRightsAppraisedTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyInterestRightsAppraisedTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyInterestRightsAppraisedTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyInterestRightsAppraisedTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyPartialInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyPartialInterestEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyPartialInterestEnum> getPropertyPartialInterestType() {
        return propertyPartialInterestType;
    }

    /**
     * Sets the value of the propertyPartialInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyPartialInterestEnum }{@code >}
     *     
     */
    public void setPropertyPartialInterestType(JAXBElement<PropertyPartialInterestEnum> value) {
        this.propertyPartialInterestType = value;
    }

    /**
     * Gets the value of the propertyPartialInterestTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyPartialInterestTypeOtherDescription() {
        return propertyPartialInterestTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyPartialInterestTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyPartialInterestTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyPartialInterestTypeOtherDescription = value;
    }

    /**
     * Gets the value of the unitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getUnitIdentifier() {
        return unitIdentifier;
    }

    /**
     * Sets the value of the unitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setUnitIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.unitIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link REALPROPERTYINTERESTEXTENSION }
     *     
     */
    public REALPROPERTYINTERESTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REALPROPERTYINTERESTEXTENSION }
     *     
     */
    public void setEXTENSION(REALPROPERTYINTERESTEXTENSION value) {
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
