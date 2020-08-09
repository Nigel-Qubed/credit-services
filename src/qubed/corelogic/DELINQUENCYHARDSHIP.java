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
 * Information about hardship reasons associated with a delinquency.
 * 
 * <p>Java class for DELINQUENCY_HARDSHIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELINQUENCY_HARDSHIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HardshipContactDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HardshipDurationType" type="{http://www.mismo.org/residential/2009/schemas}HardshipDurationEnum" minOccurs="0"/>
 *         &lt;element name="HardshipDurationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HardshipEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HardshipReasonCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HardshipResolvedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HardshipStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyReasonType" type="{http://www.mismo.org/residential/2009/schemas}LoanDelinquencyReasonEnum" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DELINQUENCY_HARDSHIP_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DELINQUENCY_HARDSHIP", propOrder = {
    "hardshipContactDate",
    "hardshipDurationType",
    "hardshipDurationTypeOtherDescription",
    "hardshipEndDate",
    "hardshipReasonCommentText",
    "hardshipResolvedIndicator",
    "hardshipStartDate",
    "loanDelinquencyReasonType",
    "loanDelinquencyReasonTypeOtherDescription",
    "extension"
})
public class DELINQUENCYHARDSHIP {

    @XmlElementRef(name = "HardshipContactDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hardshipContactDate;
    @XmlElementRef(name = "HardshipDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HardshipDurationEnum> hardshipDurationType;
    @XmlElementRef(name = "HardshipDurationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hardshipDurationTypeOtherDescription;
    @XmlElementRef(name = "HardshipEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hardshipEndDate;
    @XmlElementRef(name = "HardshipReasonCommentText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hardshipReasonCommentText;
    @XmlElementRef(name = "HardshipResolvedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hardshipResolvedIndicator;
    @XmlElementRef(name = "HardshipStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hardshipStartDate;
    @XmlElementRef(name = "LoanDelinquencyReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanDelinquencyReasonEnum> loanDelinquencyReasonType;
    @XmlElementRef(name = "LoanDelinquencyReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanDelinquencyReasonTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected DELINQUENCYHARDSHIPEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the hardshipContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHardshipContactDate() {
        return hardshipContactDate;
    }

    /**
     * Sets the value of the hardshipContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHardshipContactDate(JAXBElement<MISMODate> value) {
        this.hardshipContactDate = value;
    }

    /**
     * Gets the value of the hardshipDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HardshipDurationEnum }{@code >}
     *     
     */
    public JAXBElement<HardshipDurationEnum> getHardshipDurationType() {
        return hardshipDurationType;
    }

    /**
     * Sets the value of the hardshipDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HardshipDurationEnum }{@code >}
     *     
     */
    public void setHardshipDurationType(JAXBElement<HardshipDurationEnum> value) {
        this.hardshipDurationType = value;
    }

    /**
     * Gets the value of the hardshipDurationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHardshipDurationTypeOtherDescription() {
        return hardshipDurationTypeOtherDescription;
    }

    /**
     * Sets the value of the hardshipDurationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHardshipDurationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hardshipDurationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hardshipEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHardshipEndDate() {
        return hardshipEndDate;
    }

    /**
     * Sets the value of the hardshipEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHardshipEndDate(JAXBElement<MISMODate> value) {
        this.hardshipEndDate = value;
    }

    /**
     * Gets the value of the hardshipReasonCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHardshipReasonCommentText() {
        return hardshipReasonCommentText;
    }

    /**
     * Sets the value of the hardshipReasonCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHardshipReasonCommentText(JAXBElement<MISMOString> value) {
        this.hardshipReasonCommentText = value;
    }

    /**
     * Gets the value of the hardshipResolvedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHardshipResolvedIndicator() {
        return hardshipResolvedIndicator;
    }

    /**
     * Sets the value of the hardshipResolvedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHardshipResolvedIndicator(JAXBElement<MISMOIndicator> value) {
        this.hardshipResolvedIndicator = value;
    }

    /**
     * Gets the value of the hardshipStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHardshipStartDate() {
        return hardshipStartDate;
    }

    /**
     * Sets the value of the hardshipStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHardshipStartDate(JAXBElement<MISMODate> value) {
        this.hardshipStartDate = value;
    }

    /**
     * Gets the value of the loanDelinquencyReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanDelinquencyReasonEnum }{@code >}
     *     
     */
    public JAXBElement<LoanDelinquencyReasonEnum> getLoanDelinquencyReasonType() {
        return loanDelinquencyReasonType;
    }

    /**
     * Sets the value of the loanDelinquencyReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanDelinquencyReasonEnum }{@code >}
     *     
     */
    public void setLoanDelinquencyReasonType(JAXBElement<LoanDelinquencyReasonEnum> value) {
        this.loanDelinquencyReasonType = value;
    }

    /**
     * Gets the value of the loanDelinquencyReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanDelinquencyReasonTypeOtherDescription() {
        return loanDelinquencyReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the loanDelinquencyReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanDelinquencyReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanDelinquencyReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DELINQUENCYHARDSHIPEXTENSION }
     *     
     */
    public DELINQUENCYHARDSHIPEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELINQUENCYHARDSHIPEXTENSION }
     *     
     */
    public void setEXTENSION(DELINQUENCYHARDSHIPEXTENSION value) {
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
