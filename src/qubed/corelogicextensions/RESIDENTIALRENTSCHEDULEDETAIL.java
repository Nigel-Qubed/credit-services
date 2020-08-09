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
 * <p>Java class for RESIDENTIAL_RENT_SCHEDULE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESIDENTIAL_RENT_SCHEDULE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedMarketMonthlyRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EstimatedMarketMonthlyRentEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MarketRentalDataCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MarketRentReconciliationCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENT_SCHEDULE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RESIDENTIAL_RENT_SCHEDULE_DETAIL", propOrder = {
    "estimatedMarketMonthlyRentAmount",
    "estimatedMarketMonthlyRentEffectiveDate",
    "marketRentalDataCommentDescription",
    "marketRentReconciliationCommentDescription",
    "extension"
})
public class RESIDENTIALRENTSCHEDULEDETAIL {

    @XmlElementRef(name = "EstimatedMarketMonthlyRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> estimatedMarketMonthlyRentAmount;
    @XmlElementRef(name = "EstimatedMarketMonthlyRentEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> estimatedMarketMonthlyRentEffectiveDate;
    @XmlElementRef(name = "MarketRentalDataCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> marketRentalDataCommentDescription;
    @XmlElementRef(name = "MarketRentReconciliationCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> marketRentReconciliationCommentDescription;
    @XmlElement(name = "EXTENSION")
    protected RESIDENTIALRENTSCHEDULEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the estimatedMarketMonthlyRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEstimatedMarketMonthlyRentAmount() {
        return estimatedMarketMonthlyRentAmount;
    }

    /**
     * Sets the value of the estimatedMarketMonthlyRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEstimatedMarketMonthlyRentAmount(JAXBElement<MISMOAmount> value) {
        this.estimatedMarketMonthlyRentAmount = value;
    }

    /**
     * Gets the value of the estimatedMarketMonthlyRentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEstimatedMarketMonthlyRentEffectiveDate() {
        return estimatedMarketMonthlyRentEffectiveDate;
    }

    /**
     * Sets the value of the estimatedMarketMonthlyRentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEstimatedMarketMonthlyRentEffectiveDate(JAXBElement<MISMODate> value) {
        this.estimatedMarketMonthlyRentEffectiveDate = value;
    }

    /**
     * Gets the value of the marketRentalDataCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMarketRentalDataCommentDescription() {
        return marketRentalDataCommentDescription;
    }

    /**
     * Sets the value of the marketRentalDataCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMarketRentalDataCommentDescription(JAXBElement<MISMOString> value) {
        this.marketRentalDataCommentDescription = value;
    }

    /**
     * Gets the value of the marketRentReconciliationCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMarketRentReconciliationCommentDescription() {
        return marketRentReconciliationCommentDescription;
    }

    /**
     * Sets the value of the marketRentReconciliationCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMarketRentReconciliationCommentDescription(JAXBElement<MISMOString> value) {
        this.marketRentReconciliationCommentDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTSCHEDULEDETAILEXTENSION }
     *     
     */
    public RESIDENTIALRENTSCHEDULEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTSCHEDULEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(RESIDENTIALRENTSCHEDULEDETAILEXTENSION value) {
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
