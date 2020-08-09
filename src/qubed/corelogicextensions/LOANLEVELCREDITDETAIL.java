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
 * <p>Java class for LOAN_LEVEL_CREDIT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOAN_LEVEL_CREDIT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditReferenceType" type="{http://www.mismo.org/residential/2009/schemas}CreditReferenceEnum" minOccurs="0"/>
 *         &lt;element name="CreditReferenceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreCategoryEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryVersionType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreCategoryVersionEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryVersionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreImpairmentType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreImpairmentEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreImpairmentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreModelNameEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanCreditHistoryAgeType" type="{http://www.mismo.org/residential/2009/schemas}LoanCreditHistoryAgeEnum" minOccurs="0"/>
 *         &lt;element name="LoanCreditHistoryAgeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanLevelCreditScoreSelectionMethodType" type="{http://www.mismo.org/residential/2009/schemas}LoanLevelCreditScoreSelectionMethodEnum" minOccurs="0"/>
 *         &lt;element name="LoanLevelCreditScoreSelectionMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanLevelCreditScoreValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="RiskUpgradeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LOAN_LEVEL_CREDIT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LOAN_LEVEL_CREDIT_DETAIL", propOrder = {
    "creditReferenceType",
    "creditReferenceTypeOtherDescription",
    "creditScoreCategoryType",
    "creditScoreCategoryTypeOtherDescription",
    "creditScoreCategoryVersionType",
    "creditScoreCategoryVersionTypeOtherDescription",
    "creditScoreImpairmentType",
    "creditScoreImpairmentTypeOtherDescription",
    "creditScoreModelNameType",
    "creditScoreModelNameTypeOtherDescription",
    "loanCreditHistoryAgeType",
    "loanCreditHistoryAgeTypeOtherDescription",
    "loanLevelCreditScoreSelectionMethodType",
    "loanLevelCreditScoreSelectionMethodTypeOtherDescription",
    "loanLevelCreditScoreValue",
    "riskUpgradeIndicator",
    "extension"
})
public class LOANLEVELCREDITDETAIL {

    @XmlElementRef(name = "CreditReferenceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditReferenceEnum> creditReferenceType;
    @XmlElementRef(name = "CreditReferenceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditReferenceTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreCategoryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreCategoryEnum> creditScoreCategoryType;
    @XmlElementRef(name = "CreditScoreCategoryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreCategoryTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreCategoryVersionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreCategoryVersionEnum> creditScoreCategoryVersionType;
    @XmlElementRef(name = "CreditScoreCategoryVersionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreCategoryVersionTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreImpairmentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreImpairmentEnum> creditScoreImpairmentType;
    @XmlElementRef(name = "CreditScoreImpairmentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreImpairmentTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreModelNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreModelNameEnum> creditScoreModelNameType;
    @XmlElementRef(name = "CreditScoreModelNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreModelNameTypeOtherDescription;
    @XmlElementRef(name = "LoanCreditHistoryAgeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanCreditHistoryAgeEnum> loanCreditHistoryAgeType;
    @XmlElementRef(name = "LoanCreditHistoryAgeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanCreditHistoryAgeTypeOtherDescription;
    @XmlElementRef(name = "LoanLevelCreditScoreSelectionMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanLevelCreditScoreSelectionMethodEnum> loanLevelCreditScoreSelectionMethodType;
    @XmlElementRef(name = "LoanLevelCreditScoreSelectionMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanLevelCreditScoreSelectionMethodTypeOtherDescription;
    @XmlElementRef(name = "LoanLevelCreditScoreValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> loanLevelCreditScoreValue;
    @XmlElementRef(name = "RiskUpgradeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> riskUpgradeIndicator;
    @XmlElement(name = "EXTENSION")
    protected LOANLEVELCREDITDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditReferenceEnum }{@code >}
     *     
     */
    public JAXBElement<CreditReferenceEnum> getCreditReferenceType() {
        return creditReferenceType;
    }

    /**
     * Sets the value of the creditReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditReferenceEnum }{@code >}
     *     
     */
    public void setCreditReferenceType(JAXBElement<CreditReferenceEnum> value) {
        this.creditReferenceType = value;
    }

    /**
     * Gets the value of the creditReferenceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditReferenceTypeOtherDescription() {
        return creditReferenceTypeOtherDescription;
    }

    /**
     * Sets the value of the creditReferenceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditReferenceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditReferenceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreCategoryEnum> getCreditScoreCategoryType() {
        return creditScoreCategoryType;
    }

    /**
     * Sets the value of the creditScoreCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public void setCreditScoreCategoryType(JAXBElement<CreditScoreCategoryEnum> value) {
        this.creditScoreCategoryType = value;
    }

    /**
     * Gets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreCategoryTypeOtherDescription() {
        return creditScoreCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreCategoryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreCategoryVersionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryVersionEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreCategoryVersionEnum> getCreditScoreCategoryVersionType() {
        return creditScoreCategoryVersionType;
    }

    /**
     * Sets the value of the creditScoreCategoryVersionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryVersionEnum }{@code >}
     *     
     */
    public void setCreditScoreCategoryVersionType(JAXBElement<CreditScoreCategoryVersionEnum> value) {
        this.creditScoreCategoryVersionType = value;
    }

    /**
     * Gets the value of the creditScoreCategoryVersionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreCategoryVersionTypeOtherDescription() {
        return creditScoreCategoryVersionTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreCategoryVersionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreCategoryVersionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreCategoryVersionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreImpairmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreImpairmentEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreImpairmentEnum> getCreditScoreImpairmentType() {
        return creditScoreImpairmentType;
    }

    /**
     * Sets the value of the creditScoreImpairmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreImpairmentEnum }{@code >}
     *     
     */
    public void setCreditScoreImpairmentType(JAXBElement<CreditScoreImpairmentEnum> value) {
        this.creditScoreImpairmentType = value;
    }

    /**
     * Gets the value of the creditScoreImpairmentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreImpairmentTypeOtherDescription() {
        return creditScoreImpairmentTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreImpairmentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreImpairmentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreImpairmentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreModelNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreModelNameEnum> getCreditScoreModelNameType() {
        return creditScoreModelNameType;
    }

    /**
     * Sets the value of the creditScoreModelNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public void setCreditScoreModelNameType(JAXBElement<CreditScoreModelNameEnum> value) {
        this.creditScoreModelNameType = value;
    }

    /**
     * Gets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreModelNameTypeOtherDescription() {
        return creditScoreModelNameTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreModelNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreModelNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanCreditHistoryAgeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanCreditHistoryAgeEnum }{@code >}
     *     
     */
    public JAXBElement<LoanCreditHistoryAgeEnum> getLoanCreditHistoryAgeType() {
        return loanCreditHistoryAgeType;
    }

    /**
     * Sets the value of the loanCreditHistoryAgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanCreditHistoryAgeEnum }{@code >}
     *     
     */
    public void setLoanCreditHistoryAgeType(JAXBElement<LoanCreditHistoryAgeEnum> value) {
        this.loanCreditHistoryAgeType = value;
    }

    /**
     * Gets the value of the loanCreditHistoryAgeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanCreditHistoryAgeTypeOtherDescription() {
        return loanCreditHistoryAgeTypeOtherDescription;
    }

    /**
     * Sets the value of the loanCreditHistoryAgeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanCreditHistoryAgeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanCreditHistoryAgeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanLevelCreditScoreSelectionMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanLevelCreditScoreSelectionMethodEnum }{@code >}
     *     
     */
    public JAXBElement<LoanLevelCreditScoreSelectionMethodEnum> getLoanLevelCreditScoreSelectionMethodType() {
        return loanLevelCreditScoreSelectionMethodType;
    }

    /**
     * Sets the value of the loanLevelCreditScoreSelectionMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanLevelCreditScoreSelectionMethodEnum }{@code >}
     *     
     */
    public void setLoanLevelCreditScoreSelectionMethodType(JAXBElement<LoanLevelCreditScoreSelectionMethodEnum> value) {
        this.loanLevelCreditScoreSelectionMethodType = value;
    }

    /**
     * Gets the value of the loanLevelCreditScoreSelectionMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanLevelCreditScoreSelectionMethodTypeOtherDescription() {
        return loanLevelCreditScoreSelectionMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the loanLevelCreditScoreSelectionMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanLevelCreditScoreSelectionMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanLevelCreditScoreSelectionMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanLevelCreditScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getLoanLevelCreditScoreValue() {
        return loanLevelCreditScoreValue;
    }

    /**
     * Sets the value of the loanLevelCreditScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setLoanLevelCreditScoreValue(JAXBElement<MISMOValue> value) {
        this.loanLevelCreditScoreValue = value;
    }

    /**
     * Gets the value of the riskUpgradeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRiskUpgradeIndicator() {
        return riskUpgradeIndicator;
    }

    /**
     * Sets the value of the riskUpgradeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRiskUpgradeIndicator(JAXBElement<MISMOIndicator> value) {
        this.riskUpgradeIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LOANLEVELCREDITDETAILEXTENSION }
     *     
     */
    public LOANLEVELCREDITDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANLEVELCREDITDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(LOANLEVELCREDITDETAILEXTENSION value) {
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
