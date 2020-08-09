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
 * <p>Java class for MI_VALIDATION_RESPONSE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_VALIDATION_RESPONSE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MICancellationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MICertificateIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MIPolicyStatusType" type="{http://www.mismo.org/residential/2009/schemas}MIPolicyStatusEnum" minOccurs="0"/>
 *         &lt;element name="MIPolicyStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumFinancedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReasonForMIPolicyCancellationType" type="{http://www.mismo.org/residential/2009/schemas}ReasonForMIPolicyCancellationEnum" minOccurs="0"/>
 *         &lt;element name="ReasonForMIPolicyCancellationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_VALIDATION_RESPONSE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_VALIDATION_RESPONSE_DETAIL", propOrder = {
    "miCancellationDate",
    "miCertificateIdentifier",
    "miPolicyStatusType",
    "miPolicyStatusTypeOtherDescription",
    "miPremiumFinancedAmount",
    "reasonForMIPolicyCancellationType",
    "reasonForMIPolicyCancellationTypeOtherDescription",
    "extension"
})
public class MIVALIDATIONRESPONSEDETAIL {

    @XmlElementRef(name = "MICancellationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> miCancellationDate;
    @XmlElementRef(name = "MICertificateIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miCertificateIdentifier;
    @XmlElementRef(name = "MIPolicyStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPolicyStatusEnum> miPolicyStatusType;
    @XmlElementRef(name = "MIPolicyStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPolicyStatusTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumFinancedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miPremiumFinancedAmount;
    @XmlElementRef(name = "ReasonForMIPolicyCancellationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ReasonForMIPolicyCancellationEnum> reasonForMIPolicyCancellationType;
    @XmlElementRef(name = "ReasonForMIPolicyCancellationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> reasonForMIPolicyCancellationTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected MIVALIDATIONRESPONSEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miCancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMICancellationDate() {
        return miCancellationDate;
    }

    /**
     * Sets the value of the miCancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMICancellationDate(JAXBElement<MISMODate> value) {
        this.miCancellationDate = value;
    }

    /**
     * Gets the value of the miCertificateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMICertificateIdentifier() {
        return miCertificateIdentifier;
    }

    /**
     * Sets the value of the miCertificateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMICertificateIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miCertificateIdentifier = value;
    }

    /**
     * Gets the value of the miPolicyStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPolicyStatusEnum }{@code >}
     *     
     */
    public JAXBElement<MIPolicyStatusEnum> getMIPolicyStatusType() {
        return miPolicyStatusType;
    }

    /**
     * Sets the value of the miPolicyStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPolicyStatusEnum }{@code >}
     *     
     */
    public void setMIPolicyStatusType(JAXBElement<MIPolicyStatusEnum> value) {
        this.miPolicyStatusType = value;
    }

    /**
     * Gets the value of the miPolicyStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPolicyStatusTypeOtherDescription() {
        return miPolicyStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the miPolicyStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPolicyStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPolicyStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumFinancedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIPremiumFinancedAmount() {
        return miPremiumFinancedAmount;
    }

    /**
     * Sets the value of the miPremiumFinancedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIPremiumFinancedAmount(JAXBElement<MISMOAmount> value) {
        this.miPremiumFinancedAmount = value;
    }

    /**
     * Gets the value of the reasonForMIPolicyCancellationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReasonForMIPolicyCancellationEnum }{@code >}
     *     
     */
    public JAXBElement<ReasonForMIPolicyCancellationEnum> getReasonForMIPolicyCancellationType() {
        return reasonForMIPolicyCancellationType;
    }

    /**
     * Sets the value of the reasonForMIPolicyCancellationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReasonForMIPolicyCancellationEnum }{@code >}
     *     
     */
    public void setReasonForMIPolicyCancellationType(JAXBElement<ReasonForMIPolicyCancellationEnum> value) {
        this.reasonForMIPolicyCancellationType = value;
    }

    /**
     * Gets the value of the reasonForMIPolicyCancellationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getReasonForMIPolicyCancellationTypeOtherDescription() {
        return reasonForMIPolicyCancellationTypeOtherDescription;
    }

    /**
     * Sets the value of the reasonForMIPolicyCancellationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setReasonForMIPolicyCancellationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.reasonForMIPolicyCancellationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIVALIDATIONRESPONSEDETAILEXTENSION }
     *     
     */
    public MIVALIDATIONRESPONSEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIVALIDATIONRESPONSEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MIVALIDATIONRESPONSEDETAILEXTENSION value) {
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
