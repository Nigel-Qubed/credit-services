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
 * Additional information about the borrowers declarations.
 * 
 * 
 * <p>Java class for DECLARATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DECLARATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlimonyChildSupportObligationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="BankruptcyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="BorrowerFirstTimeHomebuyerIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="BorrowerHousingCounselorConsentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CitizenshipResidencyType" type="{http://www.mismo.org/residential/2009/schemas}CitizenshipResidencyEnum" minOccurs="0"/>
 *         &lt;element name="CoMakerEndorserOfNoteIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHASecondaryResidenceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HomeownerPastThreeYearsType" type="{http://www.mismo.org/residential/2009/schemas}HomeownerPastThreeYearsEnum" minOccurs="0"/>
 *         &lt;element name="IntentToOccupyType" type="{http://www.mismo.org/residential/2009/schemas}IntentToOccupyEnum" minOccurs="0"/>
 *         &lt;element name="LoanForeclosureOrJudgmentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="OutstandingJudgmentsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PartyToLawsuitIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PresentlyDelinquentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PriorPropertyDeedInLieuConveyedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PriorPropertyForeclosureCompletedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PriorPropertyShortSaleCompletedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PriorPropertyTitleType" type="{http://www.mismo.org/residential/2009/schemas}PriorPropertyTitleEnum" minOccurs="0"/>
 *         &lt;element name="PriorPropertyUsageType" type="{http://www.mismo.org/residential/2009/schemas}PriorPropertyUsageEnum" minOccurs="0"/>
 *         &lt;element name="PropertyProposedCleanEnergyLienIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="UndisclosedBorrowedFundsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UndisclosedBorrowedFundsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="UndisclosedComakerOfNoteIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="UndisclosedCreditApplicationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="UndisclosedMortgageApplicationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DECLARATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DECLARATION_DETAIL", propOrder = {
    "alimonyChildSupportObligationIndicator",
    "bankruptcyIndicator",
    "borrowerFirstTimeHomebuyerIndicator",
    "borrowerHousingCounselorConsentIndicator",
    "citizenshipResidencyType",
    "coMakerEndorserOfNoteIndicator",
    "fhaSecondaryResidenceIndicator",
    "homeownerPastThreeYearsType",
    "intentToOccupyType",
    "loanForeclosureOrJudgmentIndicator",
    "outstandingJudgmentsIndicator",
    "partyToLawsuitIndicator",
    "presentlyDelinquentIndicator",
    "priorPropertyDeedInLieuConveyedIndicator",
    "priorPropertyForeclosureCompletedIndicator",
    "priorPropertyShortSaleCompletedIndicator",
    "priorPropertyTitleType",
    "priorPropertyUsageType",
    "propertyProposedCleanEnergyLienIndicator",
    "undisclosedBorrowedFundsAmount",
    "undisclosedBorrowedFundsIndicator",
    "undisclosedComakerOfNoteIndicator",
    "undisclosedCreditApplicationIndicator",
    "undisclosedMortgageApplicationIndicator",
    "extension"
})
public class DECLARATIONDETAIL {

    @XmlElementRef(name = "AlimonyChildSupportObligationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> alimonyChildSupportObligationIndicator;
    @XmlElementRef(name = "BankruptcyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> bankruptcyIndicator;
    @XmlElementRef(name = "BorrowerFirstTimeHomebuyerIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> borrowerFirstTimeHomebuyerIndicator;
    @XmlElementRef(name = "BorrowerHousingCounselorConsentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> borrowerHousingCounselorConsentIndicator;
    @XmlElementRef(name = "CitizenshipResidencyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CitizenshipResidencyEnum> citizenshipResidencyType;
    @XmlElementRef(name = "CoMakerEndorserOfNoteIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> coMakerEndorserOfNoteIndicator;
    @XmlElementRef(name = "FHASecondaryResidenceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaSecondaryResidenceIndicator;
    @XmlElementRef(name = "HomeownerPastThreeYearsType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HomeownerPastThreeYearsEnum> homeownerPastThreeYearsType;
    @XmlElementRef(name = "IntentToOccupyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntentToOccupyEnum> intentToOccupyType;
    @XmlElementRef(name = "LoanForeclosureOrJudgmentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> loanForeclosureOrJudgmentIndicator;
    @XmlElementRef(name = "OutstandingJudgmentsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> outstandingJudgmentsIndicator;
    @XmlElementRef(name = "PartyToLawsuitIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> partyToLawsuitIndicator;
    @XmlElementRef(name = "PresentlyDelinquentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> presentlyDelinquentIndicator;
    @XmlElementRef(name = "PriorPropertyDeedInLieuConveyedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> priorPropertyDeedInLieuConveyedIndicator;
    @XmlElementRef(name = "PriorPropertyForeclosureCompletedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> priorPropertyForeclosureCompletedIndicator;
    @XmlElementRef(name = "PriorPropertyShortSaleCompletedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> priorPropertyShortSaleCompletedIndicator;
    @XmlElementRef(name = "PriorPropertyTitleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorPropertyTitleEnum> priorPropertyTitleType;
    @XmlElementRef(name = "PriorPropertyUsageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorPropertyUsageEnum> priorPropertyUsageType;
    @XmlElementRef(name = "PropertyProposedCleanEnergyLienIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyProposedCleanEnergyLienIndicator;
    @XmlElementRef(name = "UndisclosedBorrowedFundsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> undisclosedBorrowedFundsAmount;
    @XmlElementRef(name = "UndisclosedBorrowedFundsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> undisclosedBorrowedFundsIndicator;
    @XmlElementRef(name = "UndisclosedComakerOfNoteIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> undisclosedComakerOfNoteIndicator;
    @XmlElementRef(name = "UndisclosedCreditApplicationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> undisclosedCreditApplicationIndicator;
    @XmlElementRef(name = "UndisclosedMortgageApplicationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> undisclosedMortgageApplicationIndicator;
    @XmlElement(name = "EXTENSION")
    protected DECLARATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the alimonyChildSupportObligationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAlimonyChildSupportObligationIndicator() {
        return alimonyChildSupportObligationIndicator;
    }

    /**
     * Sets the value of the alimonyChildSupportObligationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAlimonyChildSupportObligationIndicator(JAXBElement<MISMOIndicator> value) {
        this.alimonyChildSupportObligationIndicator = value;
    }

    /**
     * Gets the value of the bankruptcyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBankruptcyIndicator() {
        return bankruptcyIndicator;
    }

    /**
     * Sets the value of the bankruptcyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBankruptcyIndicator(JAXBElement<MISMOIndicator> value) {
        this.bankruptcyIndicator = value;
    }

    /**
     * Gets the value of the borrowerFirstTimeHomebuyerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBorrowerFirstTimeHomebuyerIndicator() {
        return borrowerFirstTimeHomebuyerIndicator;
    }

    /**
     * Sets the value of the borrowerFirstTimeHomebuyerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBorrowerFirstTimeHomebuyerIndicator(JAXBElement<MISMOIndicator> value) {
        this.borrowerFirstTimeHomebuyerIndicator = value;
    }

    /**
     * Gets the value of the borrowerHousingCounselorConsentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBorrowerHousingCounselorConsentIndicator() {
        return borrowerHousingCounselorConsentIndicator;
    }

    /**
     * Sets the value of the borrowerHousingCounselorConsentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBorrowerHousingCounselorConsentIndicator(JAXBElement<MISMOIndicator> value) {
        this.borrowerHousingCounselorConsentIndicator = value;
    }

    /**
     * Gets the value of the citizenshipResidencyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CitizenshipResidencyEnum }{@code >}
     *     
     */
    public JAXBElement<CitizenshipResidencyEnum> getCitizenshipResidencyType() {
        return citizenshipResidencyType;
    }

    /**
     * Sets the value of the citizenshipResidencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CitizenshipResidencyEnum }{@code >}
     *     
     */
    public void setCitizenshipResidencyType(JAXBElement<CitizenshipResidencyEnum> value) {
        this.citizenshipResidencyType = value;
    }

    /**
     * Gets the value of the coMakerEndorserOfNoteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCoMakerEndorserOfNoteIndicator() {
        return coMakerEndorserOfNoteIndicator;
    }

    /**
     * Sets the value of the coMakerEndorserOfNoteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCoMakerEndorserOfNoteIndicator(JAXBElement<MISMOIndicator> value) {
        this.coMakerEndorserOfNoteIndicator = value;
    }

    /**
     * Gets the value of the fhaSecondaryResidenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getFHASecondaryResidenceIndicator() {
        return fhaSecondaryResidenceIndicator;
    }

    /**
     * Sets the value of the fhaSecondaryResidenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setFHASecondaryResidenceIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaSecondaryResidenceIndicator = value;
    }

    /**
     * Gets the value of the homeownerPastThreeYearsType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HomeownerPastThreeYearsEnum }{@code >}
     *     
     */
    public JAXBElement<HomeownerPastThreeYearsEnum> getHomeownerPastThreeYearsType() {
        return homeownerPastThreeYearsType;
    }

    /**
     * Sets the value of the homeownerPastThreeYearsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HomeownerPastThreeYearsEnum }{@code >}
     *     
     */
    public void setHomeownerPastThreeYearsType(JAXBElement<HomeownerPastThreeYearsEnum> value) {
        this.homeownerPastThreeYearsType = value;
    }

    /**
     * Gets the value of the intentToOccupyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntentToOccupyEnum }{@code >}
     *     
     */
    public JAXBElement<IntentToOccupyEnum> getIntentToOccupyType() {
        return intentToOccupyType;
    }

    /**
     * Sets the value of the intentToOccupyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntentToOccupyEnum }{@code >}
     *     
     */
    public void setIntentToOccupyType(JAXBElement<IntentToOccupyEnum> value) {
        this.intentToOccupyType = value;
    }

    /**
     * Gets the value of the loanForeclosureOrJudgmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLoanForeclosureOrJudgmentIndicator() {
        return loanForeclosureOrJudgmentIndicator;
    }

    /**
     * Sets the value of the loanForeclosureOrJudgmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLoanForeclosureOrJudgmentIndicator(JAXBElement<MISMOIndicator> value) {
        this.loanForeclosureOrJudgmentIndicator = value;
    }

    /**
     * Gets the value of the outstandingJudgmentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getOutstandingJudgmentsIndicator() {
        return outstandingJudgmentsIndicator;
    }

    /**
     * Sets the value of the outstandingJudgmentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setOutstandingJudgmentsIndicator(JAXBElement<MISMOIndicator> value) {
        this.outstandingJudgmentsIndicator = value;
    }

    /**
     * Gets the value of the partyToLawsuitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPartyToLawsuitIndicator() {
        return partyToLawsuitIndicator;
    }

    /**
     * Sets the value of the partyToLawsuitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPartyToLawsuitIndicator(JAXBElement<MISMOIndicator> value) {
        this.partyToLawsuitIndicator = value;
    }

    /**
     * Gets the value of the presentlyDelinquentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPresentlyDelinquentIndicator() {
        return presentlyDelinquentIndicator;
    }

    /**
     * Sets the value of the presentlyDelinquentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPresentlyDelinquentIndicator(JAXBElement<MISMOIndicator> value) {
        this.presentlyDelinquentIndicator = value;
    }

    /**
     * Gets the value of the priorPropertyDeedInLieuConveyedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPriorPropertyDeedInLieuConveyedIndicator() {
        return priorPropertyDeedInLieuConveyedIndicator;
    }

    /**
     * Sets the value of the priorPropertyDeedInLieuConveyedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPriorPropertyDeedInLieuConveyedIndicator(JAXBElement<MISMOIndicator> value) {
        this.priorPropertyDeedInLieuConveyedIndicator = value;
    }

    /**
     * Gets the value of the priorPropertyForeclosureCompletedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPriorPropertyForeclosureCompletedIndicator() {
        return priorPropertyForeclosureCompletedIndicator;
    }

    /**
     * Sets the value of the priorPropertyForeclosureCompletedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPriorPropertyForeclosureCompletedIndicator(JAXBElement<MISMOIndicator> value) {
        this.priorPropertyForeclosureCompletedIndicator = value;
    }

    /**
     * Gets the value of the priorPropertyShortSaleCompletedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPriorPropertyShortSaleCompletedIndicator() {
        return priorPropertyShortSaleCompletedIndicator;
    }

    /**
     * Sets the value of the priorPropertyShortSaleCompletedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPriorPropertyShortSaleCompletedIndicator(JAXBElement<MISMOIndicator> value) {
        this.priorPropertyShortSaleCompletedIndicator = value;
    }

    /**
     * Gets the value of the priorPropertyTitleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorPropertyTitleEnum }{@code >}
     *     
     */
    public JAXBElement<PriorPropertyTitleEnum> getPriorPropertyTitleType() {
        return priorPropertyTitleType;
    }

    /**
     * Sets the value of the priorPropertyTitleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorPropertyTitleEnum }{@code >}
     *     
     */
    public void setPriorPropertyTitleType(JAXBElement<PriorPropertyTitleEnum> value) {
        this.priorPropertyTitleType = value;
    }

    /**
     * Gets the value of the priorPropertyUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorPropertyUsageEnum }{@code >}
     *     
     */
    public JAXBElement<PriorPropertyUsageEnum> getPriorPropertyUsageType() {
        return priorPropertyUsageType;
    }

    /**
     * Sets the value of the priorPropertyUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorPropertyUsageEnum }{@code >}
     *     
     */
    public void setPriorPropertyUsageType(JAXBElement<PriorPropertyUsageEnum> value) {
        this.priorPropertyUsageType = value;
    }

    /**
     * Gets the value of the propertyProposedCleanEnergyLienIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPropertyProposedCleanEnergyLienIndicator() {
        return propertyProposedCleanEnergyLienIndicator;
    }

    /**
     * Sets the value of the propertyProposedCleanEnergyLienIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPropertyProposedCleanEnergyLienIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyProposedCleanEnergyLienIndicator = value;
    }

    /**
     * Gets the value of the undisclosedBorrowedFundsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUndisclosedBorrowedFundsAmount() {
        return undisclosedBorrowedFundsAmount;
    }

    /**
     * Sets the value of the undisclosedBorrowedFundsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUndisclosedBorrowedFundsAmount(JAXBElement<MISMOAmount> value) {
        this.undisclosedBorrowedFundsAmount = value;
    }

    /**
     * Gets the value of the undisclosedBorrowedFundsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getUndisclosedBorrowedFundsIndicator() {
        return undisclosedBorrowedFundsIndicator;
    }

    /**
     * Sets the value of the undisclosedBorrowedFundsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setUndisclosedBorrowedFundsIndicator(JAXBElement<MISMOIndicator> value) {
        this.undisclosedBorrowedFundsIndicator = value;
    }

    /**
     * Gets the value of the undisclosedComakerOfNoteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getUndisclosedComakerOfNoteIndicator() {
        return undisclosedComakerOfNoteIndicator;
    }

    /**
     * Sets the value of the undisclosedComakerOfNoteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setUndisclosedComakerOfNoteIndicator(JAXBElement<MISMOIndicator> value) {
        this.undisclosedComakerOfNoteIndicator = value;
    }

    /**
     * Gets the value of the undisclosedCreditApplicationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getUndisclosedCreditApplicationIndicator() {
        return undisclosedCreditApplicationIndicator;
    }

    /**
     * Sets the value of the undisclosedCreditApplicationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setUndisclosedCreditApplicationIndicator(JAXBElement<MISMOIndicator> value) {
        this.undisclosedCreditApplicationIndicator = value;
    }

    /**
     * Gets the value of the undisclosedMortgageApplicationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getUndisclosedMortgageApplicationIndicator() {
        return undisclosedMortgageApplicationIndicator;
    }

    /**
     * Sets the value of the undisclosedMortgageApplicationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setUndisclosedMortgageApplicationIndicator(JAXBElement<MISMOIndicator> value) {
        this.undisclosedMortgageApplicationIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DECLARATIONDETAILEXTENSION }
     *     
     */
    public DECLARATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECLARATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(DECLARATIONDETAILEXTENSION value) {
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
