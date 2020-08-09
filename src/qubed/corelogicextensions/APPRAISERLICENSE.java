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
 * Information about a specific type of license of an appraisal practitioner. An appraiser license or certification is issued by a lawful authority and provides permission to perform professional appraisal services in the jurisdiction of the authority.
 * 
 * <p>Java class for APPRAISER_LICENSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPRAISER_LICENSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraiserLicenseType" type="{http://www.mismo.org/residential/2009/schemas}AppraiserLicenseEnum" minOccurs="0"/>
 *         &lt;element name="AppraiserLicenseTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}APPRAISER_LICENSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "APPRAISER_LICENSE", propOrder = {
    "appraiserLicenseType",
    "appraiserLicenseTypeOtherDescription",
    "extension"
})
public class APPRAISERLICENSE {

    @XmlElementRef(name = "AppraiserLicenseType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AppraiserLicenseEnum> appraiserLicenseType;
    @XmlElementRef(name = "AppraiserLicenseTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraiserLicenseTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected APPRAISERLICENSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraiserLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppraiserLicenseEnum }{@code >}
     *     
     */
    public JAXBElement<AppraiserLicenseEnum> getAppraiserLicenseType() {
        return appraiserLicenseType;
    }

    /**
     * Sets the value of the appraiserLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppraiserLicenseEnum }{@code >}
     *     
     */
    public void setAppraiserLicenseType(JAXBElement<AppraiserLicenseEnum> value) {
        this.appraiserLicenseType = value;
    }

    /**
     * Gets the value of the appraiserLicenseTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraiserLicenseTypeOtherDescription() {
        return appraiserLicenseTypeOtherDescription;
    }

    /**
     * Sets the value of the appraiserLicenseTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraiserLicenseTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.appraiserLicenseTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISERLICENSEEXTENSION }
     *     
     */
    public APPRAISERLICENSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISERLICENSEEXTENSION }
     *     
     */
    public void setEXTENSION(APPRAISERLICENSEEXTENSION value) {
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
