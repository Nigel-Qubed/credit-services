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
 * Information regarding the terms and conditions on which the title company is willing to issue its policy.
 * 
 * <p>Java class for TITLE_COMMITMENT_PROPOSED_POLICY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TITLE_COMMITMENT_PROPOSED_POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamedInsuredDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NamedInsuredType" type="{http://www.mismo.org/residential/2009/schemas}NamedInsuredEnum" minOccurs="0"/>
 *         &lt;element name="TitleInsuranceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TitlePolicyFormDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_COMMITMENT_PROPOSED_POLICY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_COMMITMENT_PROPOSED_POLICY", propOrder = {
    "namedInsuredDescription",
    "namedInsuredType",
    "titleInsuranceAmount",
    "titlePolicyFormDescription",
    "extension"
})
public class TITLECOMMITMENTPROPOSEDPOLICY {

    @XmlElementRef(name = "NamedInsuredDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> namedInsuredDescription;
    @XmlElementRef(name = "NamedInsuredType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedInsuredEnum> namedInsuredType;
    @XmlElementRef(name = "TitleInsuranceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> titleInsuranceAmount;
    @XmlElementRef(name = "TitlePolicyFormDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> titlePolicyFormDescription;
    @XmlElement(name = "EXTENSION")
    protected TITLECOMMITMENTPROPOSEDPOLICYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the namedInsuredDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNamedInsuredDescription() {
        return namedInsuredDescription;
    }

    /**
     * Sets the value of the namedInsuredDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNamedInsuredDescription(JAXBElement<MISMOString> value) {
        this.namedInsuredDescription = value;
    }

    /**
     * Gets the value of the namedInsuredType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedInsuredEnum }{@code >}
     *     
     */
    public JAXBElement<NamedInsuredEnum> getNamedInsuredType() {
        return namedInsuredType;
    }

    /**
     * Sets the value of the namedInsuredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedInsuredEnum }{@code >}
     *     
     */
    public void setNamedInsuredType(JAXBElement<NamedInsuredEnum> value) {
        this.namedInsuredType = value;
    }

    /**
     * Gets the value of the titleInsuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTitleInsuranceAmount() {
        return titleInsuranceAmount;
    }

    /**
     * Sets the value of the titleInsuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTitleInsuranceAmount(JAXBElement<MISMOAmount> value) {
        this.titleInsuranceAmount = value;
    }

    /**
     * Gets the value of the titlePolicyFormDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTitlePolicyFormDescription() {
        return titlePolicyFormDescription;
    }

    /**
     * Sets the value of the titlePolicyFormDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTitlePolicyFormDescription(JAXBElement<MISMOString> value) {
        this.titlePolicyFormDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TITLECOMMITMENTPROPOSEDPOLICYEXTENSION }
     *     
     */
    public TITLECOMMITMENTPROPOSEDPOLICYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLECOMMITMENTPROPOSEDPOLICYEXTENSION }
     *     
     */
    public void setEXTENSION(TITLECOMMITMENTPROPOSEDPOLICYEXTENSION value) {
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
