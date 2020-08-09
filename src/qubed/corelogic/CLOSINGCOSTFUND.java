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
 * Information on the amount, type and source of funds needed to close the real estate transaction.
 * 
 * <p>Java class for CLOSING_COST_FUND complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_COST_FUND">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosingCostFundAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="FundsSourceType" type="{http://www.mismo.org/residential/2009/schemas}FundsSourceEnum" minOccurs="0"/>
 *         &lt;element name="FundsSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FundsType" type="{http://www.mismo.org/residential/2009/schemas}FundsEnum" minOccurs="0"/>
 *         &lt;element name="FundsTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureLineNumberValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_COST_FUND_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CLOSING_COST_FUND", propOrder = {
    "closingCostFundAmount",
    "fundsSourceType",
    "fundsSourceTypeOtherDescription",
    "fundsType",
    "fundsTypeOtherDescription",
    "integratedDisclosureLineNumberValue",
    "integratedDisclosureSectionType",
    "integratedDisclosureSectionTypeOtherDescription",
    "extension"
})
public class CLOSINGCOSTFUND {

    @XmlElementRef(name = "ClosingCostFundAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> closingCostFundAmount;
    @XmlElementRef(name = "FundsSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FundsSourceEnum> fundsSourceType;
    @XmlElementRef(name = "FundsSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fundsSourceTypeOtherDescription;
    @XmlElementRef(name = "FundsType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FundsEnum> fundsType;
    @XmlElementRef(name = "FundsTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fundsTypeOtherDescription;
    @XmlElementRef(name = "IntegratedDisclosureLineNumberValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> integratedDisclosureLineNumberValue;
    @XmlElementRef(name = "IntegratedDisclosureSectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSectionEnum> integratedDisclosureSectionType;
    @XmlElementRef(name = "IntegratedDisclosureSectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSectionTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGCOSTFUNDEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingCostFundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getClosingCostFundAmount() {
        return closingCostFundAmount;
    }

    /**
     * Sets the value of the closingCostFundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setClosingCostFundAmount(JAXBElement<MISMOAmount> value) {
        this.closingCostFundAmount = value;
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
     * Gets the value of the fundsType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundsEnum }{@code >}
     *     
     */
    public JAXBElement<FundsEnum> getFundsType() {
        return fundsType;
    }

    /**
     * Sets the value of the fundsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundsEnum }{@code >}
     *     
     */
    public void setFundsType(JAXBElement<FundsEnum> value) {
        this.fundsType = value;
    }

    /**
     * Gets the value of the fundsTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getFundsTypeOtherDescription() {
        return fundsTypeOtherDescription;
    }

    /**
     * Sets the value of the fundsTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setFundsTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.fundsTypeOtherDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getIntegratedDisclosureLineNumberValue() {
        return integratedDisclosureLineNumberValue;
    }

    /**
     * Sets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setIntegratedDisclosureLineNumberValue(JAXBElement<MISMOValue> value) {
        this.integratedDisclosureLineNumberValue = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSectionEnum> getIntegratedDisclosureSectionType() {
        return integratedDisclosureSectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionType(JAXBElement<IntegratedDisclosureSectionEnum> value) {
        this.integratedDisclosureSectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSectionTypeOtherDescription() {
        return integratedDisclosureSectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGCOSTFUNDEXTENSION }
     *     
     */
    public CLOSINGCOSTFUNDEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGCOSTFUNDEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGCOSTFUNDEXTENSION value) {
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
