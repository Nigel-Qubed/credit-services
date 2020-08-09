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
 * Information about one or more items disclosed in the Calculating Cash to Close section of the integrated disclosure document.
 * 
 * <p>Java class for CASH_TO_CLOSE_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASH_TO_CLOSE_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemAmountChangedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemChangeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemEstimatedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemFinalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemPaymentType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureCashToCloseItemPaymentEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureCashToCloseItemType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureCashToCloseItemEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CASH_TO_CLOSE_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CASH_TO_CLOSE_ITEM", propOrder = {
    "integratedDisclosureCashToCloseItemAmountChangedIndicator",
    "integratedDisclosureCashToCloseItemChangeDescription",
    "integratedDisclosureCashToCloseItemEstimatedAmount",
    "integratedDisclosureCashToCloseItemFinalAmount",
    "integratedDisclosureCashToCloseItemPaymentType",
    "integratedDisclosureCashToCloseItemType",
    "extension"
})
public class CASHTOCLOSEITEM {

    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemAmountChangedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> integratedDisclosureCashToCloseItemAmountChangedIndicator;
    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemChangeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureCashToCloseItemChangeDescription;
    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemEstimatedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> integratedDisclosureCashToCloseItemEstimatedAmount;
    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemFinalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> integratedDisclosureCashToCloseItemFinalAmount;
    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemPaymentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureCashToCloseItemPaymentEnum> integratedDisclosureCashToCloseItemPaymentType;
    @XmlElementRef(name = "IntegratedDisclosureCashToCloseItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureCashToCloseItemEnum> integratedDisclosureCashToCloseItemType;
    @XmlElement(name = "EXTENSION")
    protected CASHTOCLOSEITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemAmountChangedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getIntegratedDisclosureCashToCloseItemAmountChangedIndicator() {
        return integratedDisclosureCashToCloseItemAmountChangedIndicator;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemAmountChangedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemAmountChangedIndicator(JAXBElement<MISMOIndicator> value) {
        this.integratedDisclosureCashToCloseItemAmountChangedIndicator = value;
    }

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemChangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureCashToCloseItemChangeDescription() {
        return integratedDisclosureCashToCloseItemChangeDescription;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemChangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemChangeDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureCashToCloseItemChangeDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemEstimatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getIntegratedDisclosureCashToCloseItemEstimatedAmount() {
        return integratedDisclosureCashToCloseItemEstimatedAmount;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemEstimatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemEstimatedAmount(JAXBElement<MISMOAmount> value) {
        this.integratedDisclosureCashToCloseItemEstimatedAmount = value;
    }

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemFinalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getIntegratedDisclosureCashToCloseItemFinalAmount() {
        return integratedDisclosureCashToCloseItemFinalAmount;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemFinalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemFinalAmount(JAXBElement<MISMOAmount> value) {
        this.integratedDisclosureCashToCloseItemFinalAmount = value;
    }

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureCashToCloseItemPaymentEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureCashToCloseItemPaymentEnum> getIntegratedDisclosureCashToCloseItemPaymentType() {
        return integratedDisclosureCashToCloseItemPaymentType;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureCashToCloseItemPaymentEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemPaymentType(JAXBElement<IntegratedDisclosureCashToCloseItemPaymentEnum> value) {
        this.integratedDisclosureCashToCloseItemPaymentType = value;
    }

    /**
     * Gets the value of the integratedDisclosureCashToCloseItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureCashToCloseItemEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureCashToCloseItemEnum> getIntegratedDisclosureCashToCloseItemType() {
        return integratedDisclosureCashToCloseItemType;
    }

    /**
     * Sets the value of the integratedDisclosureCashToCloseItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureCashToCloseItemEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureCashToCloseItemType(JAXBElement<IntegratedDisclosureCashToCloseItemEnum> value) {
        this.integratedDisclosureCashToCloseItemType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CASHTOCLOSEITEMEXTENSION }
     *     
     */
    public CASHTOCLOSEITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASHTOCLOSEITEMEXTENSION }
     *     
     */
    public void setEXTENSION(CASHTOCLOSEITEMEXTENSION value) {
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
