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
 * Contains information from a document used for individual identity evidence.
 * 
 * <p>Java class for IDENTITY_DOCUMENTATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTITY_DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityDocumentExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByCountryName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByStateCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByStateProvinceName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByType" type="{http://www.mismo.org/residential/2009/schemas}IdentityDocumentIssuedByEnum" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedByTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentIssuedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentType" type="{http://www.mismo.org/residential/2009/schemas}IdentityDocumentEnum" minOccurs="0"/>
 *         &lt;element name="IdentityDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}IDENTITY_DOCUMENTATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "IDENTITY_DOCUMENTATION", propOrder = {
    "identityDocumentExpirationDate",
    "identityDocumentIdentifier",
    "identityDocumentIssuedByCountryName",
    "identityDocumentIssuedByName",
    "identityDocumentIssuedByStateCode",
    "identityDocumentIssuedByStateProvinceName",
    "identityDocumentIssuedByType",
    "identityDocumentIssuedByTypeOtherDescription",
    "identityDocumentIssuedDate",
    "identityDocumentType",
    "identityDocumentTypeOtherDescription",
    "extension"
})
public class IDENTITYDOCUMENTATION {

    @XmlElementRef(name = "IdentityDocumentExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> identityDocumentExpirationDate;
    @XmlElementRef(name = "IdentityDocumentIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> identityDocumentIdentifier;
    @XmlElementRef(name = "IdentityDocumentIssuedByCountryName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> identityDocumentIssuedByCountryName;
    @XmlElementRef(name = "IdentityDocumentIssuedByName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> identityDocumentIssuedByName;
    @XmlElementRef(name = "IdentityDocumentIssuedByStateCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> identityDocumentIssuedByStateCode;
    @XmlElementRef(name = "IdentityDocumentIssuedByStateProvinceName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> identityDocumentIssuedByStateProvinceName;
    @XmlElementRef(name = "IdentityDocumentIssuedByType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentityDocumentIssuedByEnum> identityDocumentIssuedByType;
    @XmlElementRef(name = "IdentityDocumentIssuedByTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> identityDocumentIssuedByTypeOtherDescription;
    @XmlElementRef(name = "IdentityDocumentIssuedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> identityDocumentIssuedDate;
    @XmlElementRef(name = "IdentityDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentityDocumentEnum> identityDocumentType;
    @XmlElementRef(name = "IdentityDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> identityDocumentTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected IDENTITYDOCUMENTATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the identityDocumentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getIdentityDocumentExpirationDate() {
        return identityDocumentExpirationDate;
    }

    /**
     * Sets the value of the identityDocumentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setIdentityDocumentExpirationDate(JAXBElement<MISMODate> value) {
        this.identityDocumentExpirationDate = value;
    }

    /**
     * Gets the value of the identityDocumentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getIdentityDocumentIdentifier() {
        return identityDocumentIdentifier;
    }

    /**
     * Sets the value of the identityDocumentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setIdentityDocumentIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.identityDocumentIdentifier = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIdentityDocumentIssuedByCountryName() {
        return identityDocumentIssuedByCountryName;
    }

    /**
     * Sets the value of the identityDocumentIssuedByCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByCountryName(JAXBElement<MISMOString> value) {
        this.identityDocumentIssuedByCountryName = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIdentityDocumentIssuedByName() {
        return identityDocumentIssuedByName;
    }

    /**
     * Sets the value of the identityDocumentIssuedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByName(JAXBElement<MISMOString> value) {
        this.identityDocumentIssuedByName = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getIdentityDocumentIssuedByStateCode() {
        return identityDocumentIssuedByStateCode;
    }

    /**
     * Sets the value of the identityDocumentIssuedByStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByStateCode(JAXBElement<MISMOCode> value) {
        this.identityDocumentIssuedByStateCode = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByStateProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIdentityDocumentIssuedByStateProvinceName() {
        return identityDocumentIssuedByStateProvinceName;
    }

    /**
     * Sets the value of the identityDocumentIssuedByStateProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByStateProvinceName(JAXBElement<MISMOString> value) {
        this.identityDocumentIssuedByStateProvinceName = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentityDocumentIssuedByEnum }{@code >}
     *     
     */
    public JAXBElement<IdentityDocumentIssuedByEnum> getIdentityDocumentIssuedByType() {
        return identityDocumentIssuedByType;
    }

    /**
     * Sets the value of the identityDocumentIssuedByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentityDocumentIssuedByEnum }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByType(JAXBElement<IdentityDocumentIssuedByEnum> value) {
        this.identityDocumentIssuedByType = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedByTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIdentityDocumentIssuedByTypeOtherDescription() {
        return identityDocumentIssuedByTypeOtherDescription;
    }

    /**
     * Sets the value of the identityDocumentIssuedByTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedByTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.identityDocumentIssuedByTypeOtherDescription = value;
    }

    /**
     * Gets the value of the identityDocumentIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getIdentityDocumentIssuedDate() {
        return identityDocumentIssuedDate;
    }

    /**
     * Sets the value of the identityDocumentIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setIdentityDocumentIssuedDate(JAXBElement<MISMODate> value) {
        this.identityDocumentIssuedDate = value;
    }

    /**
     * Gets the value of the identityDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentityDocumentEnum }{@code >}
     *     
     */
    public JAXBElement<IdentityDocumentEnum> getIdentityDocumentType() {
        return identityDocumentType;
    }

    /**
     * Sets the value of the identityDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentityDocumentEnum }{@code >}
     *     
     */
    public void setIdentityDocumentType(JAXBElement<IdentityDocumentEnum> value) {
        this.identityDocumentType = value;
    }

    /**
     * Gets the value of the identityDocumentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIdentityDocumentTypeOtherDescription() {
        return identityDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the identityDocumentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIdentityDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.identityDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYDOCUMENTATIONEXTENSION }
     *     
     */
    public IDENTITYDOCUMENTATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYDOCUMENTATIONEXTENSION }
     *     
     */
    public void setEXTENSION(IDENTITYDOCUMENTATIONEXTENSION value) {
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
