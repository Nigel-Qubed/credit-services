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
 * Indicates that the borrower has granted permission to be contacted via specified methods.
 * 
 * <p>Java class for SOLICITATION_PREFERENCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOLICITATION_PREFERENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorporateAffiliateSharingAllowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SolicitationByEmailAllowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SolicitationByTelephoneAllowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SolicitationByUSMailAllowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SOLICITATION_PREFERENCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SOLICITATION_PREFERENCE", propOrder = {
    "corporateAffiliateSharingAllowedIndicator",
    "solicitationByEmailAllowedIndicator",
    "solicitationByTelephoneAllowedIndicator",
    "solicitationByUSMailAllowedIndicator",
    "extension"
})
public class SOLICITATIONPREFERENCE {

    @XmlElementRef(name = "CorporateAffiliateSharingAllowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> corporateAffiliateSharingAllowedIndicator;
    @XmlElementRef(name = "SolicitationByEmailAllowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> solicitationByEmailAllowedIndicator;
    @XmlElementRef(name = "SolicitationByTelephoneAllowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> solicitationByTelephoneAllowedIndicator;
    @XmlElementRef(name = "SolicitationByUSMailAllowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> solicitationByUSMailAllowedIndicator;
    @XmlElement(name = "EXTENSION")
    protected SOLICITATIONPREFERENCEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the corporateAffiliateSharingAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCorporateAffiliateSharingAllowedIndicator() {
        return corporateAffiliateSharingAllowedIndicator;
    }

    /**
     * Sets the value of the corporateAffiliateSharingAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCorporateAffiliateSharingAllowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.corporateAffiliateSharingAllowedIndicator = value;
    }

    /**
     * Gets the value of the solicitationByEmailAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSolicitationByEmailAllowedIndicator() {
        return solicitationByEmailAllowedIndicator;
    }

    /**
     * Sets the value of the solicitationByEmailAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSolicitationByEmailAllowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.solicitationByEmailAllowedIndicator = value;
    }

    /**
     * Gets the value of the solicitationByTelephoneAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSolicitationByTelephoneAllowedIndicator() {
        return solicitationByTelephoneAllowedIndicator;
    }

    /**
     * Sets the value of the solicitationByTelephoneAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSolicitationByTelephoneAllowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.solicitationByTelephoneAllowedIndicator = value;
    }

    /**
     * Gets the value of the solicitationByUSMailAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSolicitationByUSMailAllowedIndicator() {
        return solicitationByUSMailAllowedIndicator;
    }

    /**
     * Sets the value of the solicitationByUSMailAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSolicitationByUSMailAllowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.solicitationByUSMailAllowedIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SOLICITATIONPREFERENCEEXTENSION }
     *     
     */
    public SOLICITATIONPREFERENCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLICITATIONPREFERENCEEXTENSION }
     *     
     */
    public void setEXTENSION(SOLICITATIONPREFERENCEEXTENSION value) {
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
