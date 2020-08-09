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
 * Container that holds the details of the returned agent information validated by the provider.
 * 
 * <p>Java class for AGENT_VALIDATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGENT_VALIDATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentValidationAffiliatedWithTitleCompanyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AgentValidationAgentFoundIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AgentValidationAuthorizedForTransactionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="TitleAgentValidationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="TitleAgentValidationReasonType" type="{http://www.mismo.org/residential/2009/schemas}TitleAgentValidationReasonEnum" minOccurs="0"/>
 *         &lt;element name="TitleAgentValidationReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AGENT_VALIDATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AGENT_VALIDATION", propOrder = {
    "agentValidationAffiliatedWithTitleCompanyIndicator",
    "agentValidationAgentFoundIndicator",
    "agentValidationAuthorizedForTransactionIndicator",
    "titleAgentValidationDescription",
    "titleAgentValidationReasonType",
    "titleAgentValidationReasonTypeOtherDescription",
    "extension"
})
public class AGENTVALIDATION {

    @XmlElementRef(name = "AgentValidationAffiliatedWithTitleCompanyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> agentValidationAffiliatedWithTitleCompanyIndicator;
    @XmlElementRef(name = "AgentValidationAgentFoundIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> agentValidationAgentFoundIndicator;
    @XmlElementRef(name = "AgentValidationAuthorizedForTransactionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> agentValidationAuthorizedForTransactionIndicator;
    @XmlElementRef(name = "TitleAgentValidationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> titleAgentValidationDescription;
    @XmlElementRef(name = "TitleAgentValidationReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<TitleAgentValidationReasonEnum> titleAgentValidationReasonType;
    @XmlElementRef(name = "TitleAgentValidationReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> titleAgentValidationReasonTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected AGENTVALIDATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the agentValidationAffiliatedWithTitleCompanyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAgentValidationAffiliatedWithTitleCompanyIndicator() {
        return agentValidationAffiliatedWithTitleCompanyIndicator;
    }

    /**
     * Sets the value of the agentValidationAffiliatedWithTitleCompanyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAgentValidationAffiliatedWithTitleCompanyIndicator(JAXBElement<MISMOIndicator> value) {
        this.agentValidationAffiliatedWithTitleCompanyIndicator = value;
    }

    /**
     * Gets the value of the agentValidationAgentFoundIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAgentValidationAgentFoundIndicator() {
        return agentValidationAgentFoundIndicator;
    }

    /**
     * Sets the value of the agentValidationAgentFoundIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAgentValidationAgentFoundIndicator(JAXBElement<MISMOIndicator> value) {
        this.agentValidationAgentFoundIndicator = value;
    }

    /**
     * Gets the value of the agentValidationAuthorizedForTransactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAgentValidationAuthorizedForTransactionIndicator() {
        return agentValidationAuthorizedForTransactionIndicator;
    }

    /**
     * Sets the value of the agentValidationAuthorizedForTransactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAgentValidationAuthorizedForTransactionIndicator(JAXBElement<MISMOIndicator> value) {
        this.agentValidationAuthorizedForTransactionIndicator = value;
    }

    /**
     * Gets the value of the titleAgentValidationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTitleAgentValidationDescription() {
        return titleAgentValidationDescription;
    }

    /**
     * Sets the value of the titleAgentValidationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTitleAgentValidationDescription(JAXBElement<MISMOString> value) {
        this.titleAgentValidationDescription = value;
    }

    /**
     * Gets the value of the titleAgentValidationReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitleAgentValidationReasonEnum }{@code >}
     *     
     */
    public JAXBElement<TitleAgentValidationReasonEnum> getTitleAgentValidationReasonType() {
        return titleAgentValidationReasonType;
    }

    /**
     * Sets the value of the titleAgentValidationReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitleAgentValidationReasonEnum }{@code >}
     *     
     */
    public void setTitleAgentValidationReasonType(JAXBElement<TitleAgentValidationReasonEnum> value) {
        this.titleAgentValidationReasonType = value;
    }

    /**
     * Gets the value of the titleAgentValidationReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTitleAgentValidationReasonTypeOtherDescription() {
        return titleAgentValidationReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the titleAgentValidationReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTitleAgentValidationReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.titleAgentValidationReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AGENTVALIDATIONEXTENSION }
     *     
     */
    public AGENTVALIDATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGENTVALIDATIONEXTENSION }
     *     
     */
    public void setEXTENSION(AGENTVALIDATIONEXTENSION value) {
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
