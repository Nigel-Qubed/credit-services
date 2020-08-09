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
 * <p>Java class for CREDIT_LIABILITY_HIGHEST_ADVERSE_RATING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_LIABILITY_HIGHEST_ADVERSE_RATING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditLiabilityHighestAdverseRatingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityHighestAdverseRatingCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityHighestAdverseRatingDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityHighestAdverseRatingType" type="{http://www.mismo.org/residential/2009/schemas}CreditLiabilityHighestAdverseRatingEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_LIABILITY_HIGHEST_ADVERSE_RATING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_LIABILITY_HIGHEST_ADVERSE_RATING", propOrder = {
    "creditLiabilityHighestAdverseRatingAmount",
    "creditLiabilityHighestAdverseRatingCode",
    "creditLiabilityHighestAdverseRatingDate",
    "creditLiabilityHighestAdverseRatingType",
    "extension"
})
public class CREDITLIABILITYHIGHESTADVERSERATING {

    @XmlElementRef(name = "CreditLiabilityHighestAdverseRatingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityHighestAdverseRatingAmount;
    @XmlElementRef(name = "CreditLiabilityHighestAdverseRatingCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> creditLiabilityHighestAdverseRatingCode;
    @XmlElementRef(name = "CreditLiabilityHighestAdverseRatingDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityHighestAdverseRatingDate;
    @XmlElementRef(name = "CreditLiabilityHighestAdverseRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditLiabilityHighestAdverseRatingEnum> creditLiabilityHighestAdverseRatingType;
    @XmlElement(name = "EXTENSION")
    protected CREDITLIABILITYHIGHESTADVERSERATINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditLiabilityHighestAdverseRatingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityHighestAdverseRatingAmount() {
        return creditLiabilityHighestAdverseRatingAmount;
    }

    /**
     * Sets the value of the creditLiabilityHighestAdverseRatingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCreditLiabilityHighestAdverseRatingAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityHighestAdverseRatingAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityHighestAdverseRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCreditLiabilityHighestAdverseRatingCode() {
        return creditLiabilityHighestAdverseRatingCode;
    }

    /**
     * Sets the value of the creditLiabilityHighestAdverseRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCreditLiabilityHighestAdverseRatingCode(JAXBElement<MISMOCode> value) {
        this.creditLiabilityHighestAdverseRatingCode = value;
    }

    /**
     * Gets the value of the creditLiabilityHighestAdverseRatingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditLiabilityHighestAdverseRatingDate() {
        return creditLiabilityHighestAdverseRatingDate;
    }

    /**
     * Sets the value of the creditLiabilityHighestAdverseRatingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditLiabilityHighestAdverseRatingDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityHighestAdverseRatingDate = value;
    }

    /**
     * Gets the value of the creditLiabilityHighestAdverseRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityHighestAdverseRatingEnum }{@code >}
     *     
     */
    public JAXBElement<CreditLiabilityHighestAdverseRatingEnum> getCreditLiabilityHighestAdverseRatingType() {
        return creditLiabilityHighestAdverseRatingType;
    }

    /**
     * Sets the value of the creditLiabilityHighestAdverseRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityHighestAdverseRatingEnum }{@code >}
     *     
     */
    public void setCreditLiabilityHighestAdverseRatingType(JAXBElement<CreditLiabilityHighestAdverseRatingEnum> value) {
        this.creditLiabilityHighestAdverseRatingType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITLIABILITYHIGHESTADVERSERATINGEXTENSION }
     *     
     */
    public CREDITLIABILITYHIGHESTADVERSERATINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITLIABILITYHIGHESTADVERSERATINGEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITLIABILITYHIGHESTADVERSERATINGEXTENSION value) {
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