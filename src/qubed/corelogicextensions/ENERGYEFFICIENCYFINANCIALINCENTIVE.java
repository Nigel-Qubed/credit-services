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
 * Contains details about each energy efficiency financial incentive.
 * 
 * <p>Java class for ENERGY_EFFICIENCY_FINANCIAL_INCENTIVE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENERGY_EFFICIENCY_FINANCIAL_INCENTIVE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnergyEfficiencyAuthorityIncentiveAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EnergyEfficiencyAuthorityLevelType" type="{http://www.mismo.org/residential/2009/schemas}EnergyEfficiencyAuthorityLevelEnum" minOccurs="0"/>
 *         &lt;element name="EnergyEfficiencyIncentiveCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ENERGY_EFFICIENCY_FINANCIAL_INCENTIVE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ENERGY_EFFICIENCY_FINANCIAL_INCENTIVE", propOrder = {
    "energyEfficiencyAuthorityIncentiveAmount",
    "energyEfficiencyAuthorityLevelType",
    "energyEfficiencyIncentiveCommentDescription",
    "extension"
})
public class ENERGYEFFICIENCYFINANCIALINCENTIVE {

    @XmlElementRef(name = "EnergyEfficiencyAuthorityIncentiveAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> energyEfficiencyAuthorityIncentiveAmount;
    @XmlElementRef(name = "EnergyEfficiencyAuthorityLevelType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EnergyEfficiencyAuthorityLevelEnum> energyEfficiencyAuthorityLevelType;
    @XmlElementRef(name = "EnergyEfficiencyIncentiveCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> energyEfficiencyIncentiveCommentDescription;
    @XmlElement(name = "EXTENSION")
    protected ENERGYEFFICIENCYFINANCIALINCENTIVEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the energyEfficiencyAuthorityIncentiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEnergyEfficiencyAuthorityIncentiveAmount() {
        return energyEfficiencyAuthorityIncentiveAmount;
    }

    /**
     * Sets the value of the energyEfficiencyAuthorityIncentiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEnergyEfficiencyAuthorityIncentiveAmount(JAXBElement<MISMOAmount> value) {
        this.energyEfficiencyAuthorityIncentiveAmount = value;
    }

    /**
     * Gets the value of the energyEfficiencyAuthorityLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnergyEfficiencyAuthorityLevelEnum }{@code >}
     *     
     */
    public JAXBElement<EnergyEfficiencyAuthorityLevelEnum> getEnergyEfficiencyAuthorityLevelType() {
        return energyEfficiencyAuthorityLevelType;
    }

    /**
     * Sets the value of the energyEfficiencyAuthorityLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnergyEfficiencyAuthorityLevelEnum }{@code >}
     *     
     */
    public void setEnergyEfficiencyAuthorityLevelType(JAXBElement<EnergyEfficiencyAuthorityLevelEnum> value) {
        this.energyEfficiencyAuthorityLevelType = value;
    }

    /**
     * Gets the value of the energyEfficiencyIncentiveCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEnergyEfficiencyIncentiveCommentDescription() {
        return energyEfficiencyIncentiveCommentDescription;
    }

    /**
     * Sets the value of the energyEfficiencyIncentiveCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEnergyEfficiencyIncentiveCommentDescription(JAXBElement<MISMOString> value) {
        this.energyEfficiencyIncentiveCommentDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ENERGYEFFICIENCYFINANCIALINCENTIVEEXTENSION }
     *     
     */
    public ENERGYEFFICIENCYFINANCIALINCENTIVEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENERGYEFFICIENCYFINANCIALINCENTIVEEXTENSION }
     *     
     */
    public void setEXTENSION(ENERGYEFFICIENCYFINANCIALINCENTIVEEXTENSION value) {
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
