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
 * <p>Java class for CREDIT_LIABILITY_MOST_RECENT_ADVERSE_RATING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_LIABILITY_MOST_RECENT_ADVERSE_RATING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditLiabilityMostRecentAdverseRatingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityMostRecentAdverseRatingCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityMostRecentAdverseRatingDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityMostRecentAdverseRatingType" type="{http://www.mismo.org/residential/2009/schemas}CreditLiabilityMostRecentAdverseRatingEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_LIABILITY_MOST_RECENT_ADVERSE_RATING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_LIABILITY_MOST_RECENT_ADVERSE_RATING", propOrder = {
    "creditLiabilityMostRecentAdverseRatingAmount",
    "creditLiabilityMostRecentAdverseRatingCode",
    "creditLiabilityMostRecentAdverseRatingDate",
    "creditLiabilityMostRecentAdverseRatingType",
    "extension"
})
public class CREDITLIABILITYMOSTRECENTADVERSERATING {

    @XmlElementRef(name = "CreditLiabilityMostRecentAdverseRatingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityMostRecentAdverseRatingAmount;
    @XmlElementRef(name = "CreditLiabilityMostRecentAdverseRatingCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> creditLiabilityMostRecentAdverseRatingCode;
    @XmlElementRef(name = "CreditLiabilityMostRecentAdverseRatingDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityMostRecentAdverseRatingDate;
    @XmlElementRef(name = "CreditLiabilityMostRecentAdverseRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditLiabilityMostRecentAdverseRatingEnum> creditLiabilityMostRecentAdverseRatingType;
    @XmlElement(name = "EXTENSION")
    protected CREDITLIABILITYMOSTRECENTADVERSERATINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditLiabilityMostRecentAdverseRatingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityMostRecentAdverseRatingAmount() {
        return creditLiabilityMostRecentAdverseRatingAmount;
    }

    /**
     * Sets the value of the creditLiabilityMostRecentAdverseRatingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCreditLiabilityMostRecentAdverseRatingAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityMostRecentAdverseRatingAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityMostRecentAdverseRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCreditLiabilityMostRecentAdverseRatingCode() {
        return creditLiabilityMostRecentAdverseRatingCode;
    }

    /**
     * Sets the value of the creditLiabilityMostRecentAdverseRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCreditLiabilityMostRecentAdverseRatingCode(JAXBElement<MISMOCode> value) {
        this.creditLiabilityMostRecentAdverseRatingCode = value;
    }

    /**
     * Gets the value of the creditLiabilityMostRecentAdverseRatingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditLiabilityMostRecentAdverseRatingDate() {
        return creditLiabilityMostRecentAdverseRatingDate;
    }

    /**
     * Sets the value of the creditLiabilityMostRecentAdverseRatingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditLiabilityMostRecentAdverseRatingDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityMostRecentAdverseRatingDate = value;
    }

    /**
     * Gets the value of the creditLiabilityMostRecentAdverseRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityMostRecentAdverseRatingEnum }{@code >}
     *     
     */
    public JAXBElement<CreditLiabilityMostRecentAdverseRatingEnum> getCreditLiabilityMostRecentAdverseRatingType() {
        return creditLiabilityMostRecentAdverseRatingType;
    }

    /**
     * Sets the value of the creditLiabilityMostRecentAdverseRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityMostRecentAdverseRatingEnum }{@code >}
     *     
     */
    public void setCreditLiabilityMostRecentAdverseRatingType(JAXBElement<CreditLiabilityMostRecentAdverseRatingEnum> value) {
        this.creditLiabilityMostRecentAdverseRatingType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITLIABILITYMOSTRECENTADVERSERATINGEXTENSION }
     *     
     */
    public CREDITLIABILITYMOSTRECENTADVERSERATINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITLIABILITYMOSTRECENTADVERSERATINGEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITLIABILITYMOSTRECENTADVERSERATINGEXTENSION value) {
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
