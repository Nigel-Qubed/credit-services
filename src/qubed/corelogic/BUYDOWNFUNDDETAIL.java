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
 * <p>Java class for BUYDOWN_FUND_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BUYDOWN_FUND_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuydownAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="BuydownFundingType" type="{http://www.mismo.org/residential/2009/schemas}BuydownFundingEnum" minOccurs="0"/>
 *         &lt;element name="BuydownFundingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuydownPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="FundsSourceType" type="{http://www.mismo.org/residential/2009/schemas}FundsSourceEnum" minOccurs="0"/>
 *         &lt;element name="FundsSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BUYDOWN_FUND_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BUYDOWN_FUND_DETAIL", propOrder = {
    "buydownAmount",
    "buydownFundingType",
    "buydownFundingTypeOtherDescription",
    "buydownPercent",
    "fundsSourceType",
    "fundsSourceTypeOtherDescription",
    "extension"
})
public class BUYDOWNFUNDDETAIL {

    @XmlElementRef(name = "BuydownAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> buydownAmount;
    @XmlElementRef(name = "BuydownFundingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuydownFundingEnum> buydownFundingType;
    @XmlElementRef(name = "BuydownFundingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buydownFundingTypeOtherDescription;
    @XmlElementRef(name = "BuydownPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> buydownPercent;
    @XmlElementRef(name = "FundsSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FundsSourceEnum> fundsSourceType;
    @XmlElementRef(name = "FundsSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fundsSourceTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected BUYDOWNFUNDDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the buydownAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBuydownAmount() {
        return buydownAmount;
    }

    /**
     * Sets the value of the buydownAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBuydownAmount(JAXBElement<MISMOAmount> value) {
        this.buydownAmount = value;
    }

    /**
     * Gets the value of the buydownFundingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuydownFundingEnum }{@code >}
     *     
     */
    public JAXBElement<BuydownFundingEnum> getBuydownFundingType() {
        return buydownFundingType;
    }

    /**
     * Sets the value of the buydownFundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuydownFundingEnum }{@code >}
     *     
     */
    public void setBuydownFundingType(JAXBElement<BuydownFundingEnum> value) {
        this.buydownFundingType = value;
    }

    /**
     * Gets the value of the buydownFundingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuydownFundingTypeOtherDescription() {
        return buydownFundingTypeOtherDescription;
    }

    /**
     * Sets the value of the buydownFundingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuydownFundingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buydownFundingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the buydownPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getBuydownPercent() {
        return buydownPercent;
    }

    /**
     * Sets the value of the buydownPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setBuydownPercent(JAXBElement<MISMOPercent> value) {
        this.buydownPercent = value;
    }

    /**
     * Gets the value of the fundsSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundsSourceEnum }{@code >}
     *     
     */
    public JAXBElement<FundsSourceEnum> getFundsSourceType() {
        return fundsSourceType;
    }

    /**
     * Sets the value of the fundsSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundsSourceEnum }{@code >}
     *     
     */
    public void setFundsSourceType(JAXBElement<FundsSourceEnum> value) {
        this.fundsSourceType = value;
    }

    /**
     * Gets the value of the fundsSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getFundsSourceTypeOtherDescription() {
        return fundsSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the fundsSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setFundsSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.fundsSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BUYDOWNFUNDDETAILEXTENSION }
     *     
     */
    public BUYDOWNFUNDDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYDOWNFUNDDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(BUYDOWNFUNDDETAILEXTENSION value) {
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
