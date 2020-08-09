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
 * <p>Java class for AUTOMATED_UNDERWRITING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUTOMATED_UNDERWRITING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutomatedUnderwritingCaseIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingDecisionDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingEvaluationStatusDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingMethodVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingProcessDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingRecommendationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingSystemDocumentWaiverIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingSystemResultValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingSystemType" type="{http://www.mismo.org/residential/2009/schemas}AutomatedUnderwritingSystemEnum" minOccurs="0"/>
 *         &lt;element name="AutomatedUnderwritingSystemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DesktopUnderwriterRecommendationType" type="{http://www.mismo.org/residential/2009/schemas}DesktopUnderwriterRecommendationEnum" minOccurs="0"/>
 *         &lt;element name="FHAPreReviewResultsValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FREPurchaseEligibilityType" type="{http://www.mismo.org/residential/2009/schemas}FREPurchaseEligibilityEnum" minOccurs="0"/>
 *         &lt;element name="LoanProspectorCreditRiskClassificationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanProspectorDocumentationClassificationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AUTOMATED_UNDERWRITING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AUTOMATED_UNDERWRITING", propOrder = {
    "automatedUnderwritingCaseIdentifier",
    "automatedUnderwritingDecisionDatetime",
    "automatedUnderwritingEvaluationStatusDescription",
    "automatedUnderwritingMethodVersionIdentifier",
    "automatedUnderwritingProcessDescription",
    "automatedUnderwritingRecommendationDescription",
    "automatedUnderwritingSystemDocumentWaiverIndicator",
    "automatedUnderwritingSystemResultValue",
    "automatedUnderwritingSystemType",
    "automatedUnderwritingSystemTypeOtherDescription",
    "desktopUnderwriterRecommendationType",
    "fhaPreReviewResultsValue",
    "frePurchaseEligibilityType",
    "loanProspectorCreditRiskClassificationDescription",
    "loanProspectorDocumentationClassificationDescription",
    "extension"
})
public class AUTOMATEDUNDERWRITING {

    @XmlElementRef(name = "AutomatedUnderwritingCaseIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> automatedUnderwritingCaseIdentifier;
    @XmlElementRef(name = "AutomatedUnderwritingDecisionDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> automatedUnderwritingDecisionDatetime;
    @XmlElementRef(name = "AutomatedUnderwritingEvaluationStatusDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> automatedUnderwritingEvaluationStatusDescription;
    @XmlElementRef(name = "AutomatedUnderwritingMethodVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> automatedUnderwritingMethodVersionIdentifier;
    @XmlElementRef(name = "AutomatedUnderwritingProcessDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> automatedUnderwritingProcessDescription;
    @XmlElementRef(name = "AutomatedUnderwritingRecommendationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> automatedUnderwritingRecommendationDescription;
    @XmlElementRef(name = "AutomatedUnderwritingSystemDocumentWaiverIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> automatedUnderwritingSystemDocumentWaiverIndicator;
    @XmlElementRef(name = "AutomatedUnderwritingSystemResultValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> automatedUnderwritingSystemResultValue;
    @XmlElementRef(name = "AutomatedUnderwritingSystemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AutomatedUnderwritingSystemEnum> automatedUnderwritingSystemType;
    @XmlElementRef(name = "AutomatedUnderwritingSystemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> automatedUnderwritingSystemTypeOtherDescription;
    @XmlElementRef(name = "DesktopUnderwriterRecommendationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DesktopUnderwriterRecommendationEnum> desktopUnderwriterRecommendationType;
    @XmlElementRef(name = "FHAPreReviewResultsValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fhaPreReviewResultsValue;
    @XmlElementRef(name = "FREPurchaseEligibilityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FREPurchaseEligibilityEnum> frePurchaseEligibilityType;
    @XmlElementRef(name = "LoanProspectorCreditRiskClassificationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanProspectorCreditRiskClassificationDescription;
    @XmlElementRef(name = "LoanProspectorDocumentationClassificationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanProspectorDocumentationClassificationDescription;
    @XmlElement(name = "EXTENSION")
    protected AUTOMATEDUNDERWRITINGEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the automatedUnderwritingCaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAutomatedUnderwritingCaseIdentifier() {
        return automatedUnderwritingCaseIdentifier;
    }

    /**
     * Sets the value of the automatedUnderwritingCaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAutomatedUnderwritingCaseIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.automatedUnderwritingCaseIdentifier = value;
    }

    /**
     * Gets the value of the automatedUnderwritingDecisionDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public JAXBElement<MISMODatetime> getAutomatedUnderwritingDecisionDatetime() {
        return automatedUnderwritingDecisionDatetime;
    }

    /**
     * Sets the value of the automatedUnderwritingDecisionDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public void setAutomatedUnderwritingDecisionDatetime(JAXBElement<MISMODatetime> value) {
        this.automatedUnderwritingDecisionDatetime = value;
    }

    /**
     * Gets the value of the automatedUnderwritingEvaluationStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAutomatedUnderwritingEvaluationStatusDescription() {
        return automatedUnderwritingEvaluationStatusDescription;
    }

    /**
     * Sets the value of the automatedUnderwritingEvaluationStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAutomatedUnderwritingEvaluationStatusDescription(JAXBElement<MISMOString> value) {
        this.automatedUnderwritingEvaluationStatusDescription = value;
    }

    /**
     * Gets the value of the automatedUnderwritingMethodVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAutomatedUnderwritingMethodVersionIdentifier() {
        return automatedUnderwritingMethodVersionIdentifier;
    }

    /**
     * Sets the value of the automatedUnderwritingMethodVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAutomatedUnderwritingMethodVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.automatedUnderwritingMethodVersionIdentifier = value;
    }

    /**
     * Gets the value of the automatedUnderwritingProcessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAutomatedUnderwritingProcessDescription() {
        return automatedUnderwritingProcessDescription;
    }

    /**
     * Sets the value of the automatedUnderwritingProcessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAutomatedUnderwritingProcessDescription(JAXBElement<MISMOString> value) {
        this.automatedUnderwritingProcessDescription = value;
    }

    /**
     * Gets the value of the automatedUnderwritingRecommendationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAutomatedUnderwritingRecommendationDescription() {
        return automatedUnderwritingRecommendationDescription;
    }

    /**
     * Sets the value of the automatedUnderwritingRecommendationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAutomatedUnderwritingRecommendationDescription(JAXBElement<MISMOString> value) {
        this.automatedUnderwritingRecommendationDescription = value;
    }

    /**
     * Gets the value of the automatedUnderwritingSystemDocumentWaiverIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAutomatedUnderwritingSystemDocumentWaiverIndicator() {
        return automatedUnderwritingSystemDocumentWaiverIndicator;
    }

    /**
     * Sets the value of the automatedUnderwritingSystemDocumentWaiverIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAutomatedUnderwritingSystemDocumentWaiverIndicator(JAXBElement<MISMOIndicator> value) {
        this.automatedUnderwritingSystemDocumentWaiverIndicator = value;
    }

    /**
     * Gets the value of the automatedUnderwritingSystemResultValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getAutomatedUnderwritingSystemResultValue() {
        return automatedUnderwritingSystemResultValue;
    }

    /**
     * Sets the value of the automatedUnderwritingSystemResultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setAutomatedUnderwritingSystemResultValue(JAXBElement<MISMOValue> value) {
        this.automatedUnderwritingSystemResultValue = value;
    }

    /**
     * Gets the value of the automatedUnderwritingSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutomatedUnderwritingSystemEnum }{@code >}
     *     
     */
    public JAXBElement<AutomatedUnderwritingSystemEnum> getAutomatedUnderwritingSystemType() {
        return automatedUnderwritingSystemType;
    }

    /**
     * Sets the value of the automatedUnderwritingSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutomatedUnderwritingSystemEnum }{@code >}
     *     
     */
    public void setAutomatedUnderwritingSystemType(JAXBElement<AutomatedUnderwritingSystemEnum> value) {
        this.automatedUnderwritingSystemType = value;
    }

    /**
     * Gets the value of the automatedUnderwritingSystemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAutomatedUnderwritingSystemTypeOtherDescription() {
        return automatedUnderwritingSystemTypeOtherDescription;
    }

    /**
     * Sets the value of the automatedUnderwritingSystemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAutomatedUnderwritingSystemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.automatedUnderwritingSystemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the desktopUnderwriterRecommendationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesktopUnderwriterRecommendationEnum }{@code >}
     *     
     */
    public JAXBElement<DesktopUnderwriterRecommendationEnum> getDesktopUnderwriterRecommendationType() {
        return desktopUnderwriterRecommendationType;
    }

    /**
     * Sets the value of the desktopUnderwriterRecommendationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesktopUnderwriterRecommendationEnum }{@code >}
     *     
     */
    public void setDesktopUnderwriterRecommendationType(JAXBElement<DesktopUnderwriterRecommendationEnum> value) {
        this.desktopUnderwriterRecommendationType = value;
    }

    /**
     * Gets the value of the fhaPreReviewResultsValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getFHAPreReviewResultsValue() {
        return fhaPreReviewResultsValue;
    }

    /**
     * Sets the value of the fhaPreReviewResultsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setFHAPreReviewResultsValue(JAXBElement<MISMOString> value) {
        this.fhaPreReviewResultsValue = value;
    }

    /**
     * Gets the value of the frePurchaseEligibilityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FREPurchaseEligibilityEnum }{@code >}
     *     
     */
    public JAXBElement<FREPurchaseEligibilityEnum> getFREPurchaseEligibilityType() {
        return frePurchaseEligibilityType;
    }

    /**
     * Sets the value of the frePurchaseEligibilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FREPurchaseEligibilityEnum }{@code >}
     *     
     */
    public void setFREPurchaseEligibilityType(JAXBElement<FREPurchaseEligibilityEnum> value) {
        this.frePurchaseEligibilityType = value;
    }

    /**
     * Gets the value of the loanProspectorCreditRiskClassificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanProspectorCreditRiskClassificationDescription() {
        return loanProspectorCreditRiskClassificationDescription;
    }

    /**
     * Sets the value of the loanProspectorCreditRiskClassificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanProspectorCreditRiskClassificationDescription(JAXBElement<MISMOString> value) {
        this.loanProspectorCreditRiskClassificationDescription = value;
    }

    /**
     * Gets the value of the loanProspectorDocumentationClassificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanProspectorDocumentationClassificationDescription() {
        return loanProspectorDocumentationClassificationDescription;
    }

    /**
     * Sets the value of the loanProspectorDocumentationClassificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanProspectorDocumentationClassificationDescription(JAXBElement<MISMOString> value) {
        this.loanProspectorDocumentationClassificationDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AUTOMATEDUNDERWRITINGEXTENSION }
     *     
     */
    public AUTOMATEDUNDERWRITINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOMATEDUNDERWRITINGEXTENSION }
     *     
     */
    public void setEXTENSION(AUTOMATEDUNDERWRITINGEXTENSION value) {
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
