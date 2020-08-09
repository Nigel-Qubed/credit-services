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
 * Describes information about a legal contest by judicial process.
 * 
 * <p>Java class for LITIGATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LITIGATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DismissalType" type="{http://www.mismo.org/residential/2009/schemas}DismissalEnum" minOccurs="0"/>
 *         &lt;element name="LitigationAffectsInvestorIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LitigationAffectsTitleIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LitigationClassActionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LitigationEndReasonType" type="{http://www.mismo.org/residential/2009/schemas}LitigationEndReasonEnum" minOccurs="0"/>
 *         &lt;element name="LitigationEndReasonTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LitigationEndReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LitigationFiledDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LitigationProceedingsEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LitigationThreatenedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LitigationType" type="{http://www.mismo.org/residential/2009/schemas}LitigationEnum" minOccurs="0"/>
 *         &lt;element name="LitigationTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LitigationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NonTitleLitigationAffectsPropertyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LITIGATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LITIGATION_DETAIL", propOrder = {
    "dismissalType",
    "litigationAffectsInvestorIndicator",
    "litigationAffectsTitleIndicator",
    "litigationClassActionIndicator",
    "litigationEndReasonType",
    "litigationEndReasonTypeAdditionalDescription",
    "litigationEndReasonTypeOtherDescription",
    "litigationFiledDate",
    "litigationProceedingsEndDate",
    "litigationThreatenedDate",
    "litigationType",
    "litigationTypeAdditionalDescription",
    "litigationTypeOtherDescription",
    "nonTitleLitigationAffectsPropertyIndicator",
    "extension"
})
public class LITIGATIONDETAIL {

    @XmlElementRef(name = "DismissalType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DismissalEnum> dismissalType;
    @XmlElementRef(name = "LitigationAffectsInvestorIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> litigationAffectsInvestorIndicator;
    @XmlElementRef(name = "LitigationAffectsTitleIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> litigationAffectsTitleIndicator;
    @XmlElementRef(name = "LitigationClassActionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> litigationClassActionIndicator;
    @XmlElementRef(name = "LitigationEndReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LitigationEndReasonEnum> litigationEndReasonType;
    @XmlElementRef(name = "LitigationEndReasonTypeAdditionalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> litigationEndReasonTypeAdditionalDescription;
    @XmlElementRef(name = "LitigationEndReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> litigationEndReasonTypeOtherDescription;
    @XmlElementRef(name = "LitigationFiledDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> litigationFiledDate;
    @XmlElementRef(name = "LitigationProceedingsEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> litigationProceedingsEndDate;
    @XmlElementRef(name = "LitigationThreatenedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> litigationThreatenedDate;
    @XmlElementRef(name = "LitigationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LitigationEnum> litigationType;
    @XmlElementRef(name = "LitigationTypeAdditionalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> litigationTypeAdditionalDescription;
    @XmlElementRef(name = "LitigationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> litigationTypeOtherDescription;
    @XmlElementRef(name = "NonTitleLitigationAffectsPropertyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> nonTitleLitigationAffectsPropertyIndicator;
    @XmlElement(name = "EXTENSION")
    protected LITIGATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dismissalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DismissalEnum }{@code >}
     *     
     */
    public JAXBElement<DismissalEnum> getDismissalType() {
        return dismissalType;
    }

    /**
     * Sets the value of the dismissalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DismissalEnum }{@code >}
     *     
     */
    public void setDismissalType(JAXBElement<DismissalEnum> value) {
        this.dismissalType = value;
    }

    /**
     * Gets the value of the litigationAffectsInvestorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLitigationAffectsInvestorIndicator() {
        return litigationAffectsInvestorIndicator;
    }

    /**
     * Sets the value of the litigationAffectsInvestorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLitigationAffectsInvestorIndicator(JAXBElement<MISMOIndicator> value) {
        this.litigationAffectsInvestorIndicator = value;
    }

    /**
     * Gets the value of the litigationAffectsTitleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLitigationAffectsTitleIndicator() {
        return litigationAffectsTitleIndicator;
    }

    /**
     * Sets the value of the litigationAffectsTitleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLitigationAffectsTitleIndicator(JAXBElement<MISMOIndicator> value) {
        this.litigationAffectsTitleIndicator = value;
    }

    /**
     * Gets the value of the litigationClassActionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLitigationClassActionIndicator() {
        return litigationClassActionIndicator;
    }

    /**
     * Sets the value of the litigationClassActionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLitigationClassActionIndicator(JAXBElement<MISMOIndicator> value) {
        this.litigationClassActionIndicator = value;
    }

    /**
     * Gets the value of the litigationEndReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LitigationEndReasonEnum }{@code >}
     *     
     */
    public JAXBElement<LitigationEndReasonEnum> getLitigationEndReasonType() {
        return litigationEndReasonType;
    }

    /**
     * Sets the value of the litigationEndReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LitigationEndReasonEnum }{@code >}
     *     
     */
    public void setLitigationEndReasonType(JAXBElement<LitigationEndReasonEnum> value) {
        this.litigationEndReasonType = value;
    }

    /**
     * Gets the value of the litigationEndReasonTypeAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLitigationEndReasonTypeAdditionalDescription() {
        return litigationEndReasonTypeAdditionalDescription;
    }

    /**
     * Sets the value of the litigationEndReasonTypeAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLitigationEndReasonTypeAdditionalDescription(JAXBElement<MISMOString> value) {
        this.litigationEndReasonTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the litigationEndReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLitigationEndReasonTypeOtherDescription() {
        return litigationEndReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the litigationEndReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLitigationEndReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.litigationEndReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the litigationFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLitigationFiledDate() {
        return litigationFiledDate;
    }

    /**
     * Sets the value of the litigationFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLitigationFiledDate(JAXBElement<MISMODate> value) {
        this.litigationFiledDate = value;
    }

    /**
     * Gets the value of the litigationProceedingsEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLitigationProceedingsEndDate() {
        return litigationProceedingsEndDate;
    }

    /**
     * Sets the value of the litigationProceedingsEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLitigationProceedingsEndDate(JAXBElement<MISMODate> value) {
        this.litigationProceedingsEndDate = value;
    }

    /**
     * Gets the value of the litigationThreatenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLitigationThreatenedDate() {
        return litigationThreatenedDate;
    }

    /**
     * Sets the value of the litigationThreatenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLitigationThreatenedDate(JAXBElement<MISMODate> value) {
        this.litigationThreatenedDate = value;
    }

    /**
     * Gets the value of the litigationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LitigationEnum }{@code >}
     *     
     */
    public JAXBElement<LitigationEnum> getLitigationType() {
        return litigationType;
    }

    /**
     * Sets the value of the litigationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LitigationEnum }{@code >}
     *     
     */
    public void setLitigationType(JAXBElement<LitigationEnum> value) {
        this.litigationType = value;
    }

    /**
     * Gets the value of the litigationTypeAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLitigationTypeAdditionalDescription() {
        return litigationTypeAdditionalDescription;
    }

    /**
     * Sets the value of the litigationTypeAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLitigationTypeAdditionalDescription(JAXBElement<MISMOString> value) {
        this.litigationTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the litigationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLitigationTypeOtherDescription() {
        return litigationTypeOtherDescription;
    }

    /**
     * Sets the value of the litigationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLitigationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.litigationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the nonTitleLitigationAffectsPropertyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getNonTitleLitigationAffectsPropertyIndicator() {
        return nonTitleLitigationAffectsPropertyIndicator;
    }

    /**
     * Sets the value of the nonTitleLitigationAffectsPropertyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setNonTitleLitigationAffectsPropertyIndicator(JAXBElement<MISMOIndicator> value) {
        this.nonTitleLitigationAffectsPropertyIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LITIGATIONDETAILEXTENSION }
     *     
     */
    public LITIGATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LITIGATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(LITIGATIONDETAILEXTENSION value) {
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
