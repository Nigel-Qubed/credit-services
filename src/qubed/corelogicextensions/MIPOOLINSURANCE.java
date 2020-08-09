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
 * Information specific to private pool mortgage insurance.
 * 
 * <p>Java class for MI_POOL_INSURANCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_POOL_INSURANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MICompanyNameType" type="{http://www.mismo.org/residential/2009/schemas}MICompanyNameEnum" minOccurs="0"/>
 *         &lt;element name="MICompanyNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPoolInsuranceCertificateIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MIPoolInsuranceMasterCommitmentIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_POOL_INSURANCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_POOL_INSURANCE", propOrder = {
    "miCompanyNameType",
    "miCompanyNameTypeOtherDescription",
    "miPoolInsuranceCertificateIdentifier",
    "miPoolInsuranceMasterCommitmentIdentifier",
    "extension"
})
public class MIPOOLINSURANCE {

    @XmlElementRef(name = "MICompanyNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MICompanyNameEnum> miCompanyNameType;
    @XmlElementRef(name = "MICompanyNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miCompanyNameTypeOtherDescription;
    @XmlElementRef(name = "MIPoolInsuranceCertificateIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miPoolInsuranceCertificateIdentifier;
    @XmlElementRef(name = "MIPoolInsuranceMasterCommitmentIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miPoolInsuranceMasterCommitmentIdentifier;
    @XmlElement(name = "EXTENSION")
    protected MIPOOLINSURANCEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miCompanyNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICompanyNameEnum }{@code >}
     *     
     */
    public JAXBElement<MICompanyNameEnum> getMICompanyNameType() {
        return miCompanyNameType;
    }

    /**
     * Sets the value of the miCompanyNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICompanyNameEnum }{@code >}
     *     
     */
    public void setMICompanyNameType(JAXBElement<MICompanyNameEnum> value) {
        this.miCompanyNameType = value;
    }

    /**
     * Gets the value of the miCompanyNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMICompanyNameTypeOtherDescription() {
        return miCompanyNameTypeOtherDescription;
    }

    /**
     * Sets the value of the miCompanyNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMICompanyNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miCompanyNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPoolInsuranceCertificateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMIPoolInsuranceCertificateIdentifier() {
        return miPoolInsuranceCertificateIdentifier;
    }

    /**
     * Sets the value of the miPoolInsuranceCertificateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMIPoolInsuranceCertificateIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miPoolInsuranceCertificateIdentifier = value;
    }

    /**
     * Gets the value of the miPoolInsuranceMasterCommitmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMIPoolInsuranceMasterCommitmentIdentifier() {
        return miPoolInsuranceMasterCommitmentIdentifier;
    }

    /**
     * Sets the value of the miPoolInsuranceMasterCommitmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMIPoolInsuranceMasterCommitmentIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miPoolInsuranceMasterCommitmentIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIPOOLINSURANCEEXTENSION }
     *     
     */
    public MIPOOLINSURANCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPOOLINSURANCEEXTENSION }
     *     
     */
    public void setEXTENSION(MIPOOLINSURANCEEXTENSION value) {
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
