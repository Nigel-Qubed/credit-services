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
 * Information about the comparable property such as the description of the facts and analysis for a comparable property in the grid style of reporting under the sales comparison approach valuation method in the context of a valuation report.
 * 
 * <p>Java class for COMPARABLE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPARABLE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedSalesPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustedSalesPricePerBedroomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustedSalesPricePerRoomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AdjustedSalesPricePerUnitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ClosedSaleCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ComparableIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ComparableListingCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ComparablePropertyCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ComparableSaleFurnishedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ComparableType" type="{http://www.mismo.org/residential/2009/schemas}ComparableEnum" minOccurs="0"/>
 *         &lt;element name="ComparableTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CompetitiveListingsCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ContractDateUnknownIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="GrossMonthlyRentMultiplierPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MLSNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MonthlyRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MortgageType" type="{http://www.mismo.org/residential/2009/schemas}MortgageEnum" minOccurs="0"/>
 *         &lt;element name="MortgageTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NoFinancingTransactionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PricePerSquareFootAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProximityToSubjectDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RentControlStatusType" type="{http://www.mismo.org/residential/2009/schemas}RentControlStatusEnum" minOccurs="0"/>
 *         &lt;element name="SalePriceTotalAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalePriceTotalAdjustmentNetPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="SalesPricePerBedroomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPricePerGrossBuildingAreaAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPricePerGrossLivingAreaAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPricePerOwnershipShareAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPricePerRoomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPricePerUnitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesPriceToListPriceRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="SalesPriceTotalAdjustmentGrossPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COMPARABLE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COMPARABLE_DETAIL", propOrder = {
    "adjustedSalesPriceAmount",
    "adjustedSalesPricePerBedroomAmount",
    "adjustedSalesPricePerRoomAmount",
    "adjustedSalesPricePerUnitAmount",
    "closedSaleCommentDescription",
    "comparableIdentifier",
    "comparableListingCommentDescription",
    "comparablePropertyCommentDescription",
    "comparableSaleFurnishedIndicator",
    "comparableType",
    "comparableTypeOtherDescription",
    "competitiveListingsCommentDescription",
    "contractDateUnknownIndicator",
    "grossMonthlyRentMultiplierPercent",
    "mlsNumberIdentifier",
    "monthlyRentAmount",
    "mortgageType",
    "mortgageTypeOtherDescription",
    "noFinancingTransactionIndicator",
    "pricePerSquareFootAmount",
    "proximityToSubjectDescription",
    "rentControlStatusType",
    "salePriceTotalAdjustmentAmount",
    "salePriceTotalAdjustmentNetPercent",
    "salesPricePerBedroomAmount",
    "salesPricePerGrossBuildingAreaAmount",
    "salesPricePerGrossLivingAreaAmount",
    "salesPricePerOwnershipShareAmount",
    "salesPricePerRoomAmount",
    "salesPricePerUnitAmount",
    "salesPriceToListPriceRatePercent",
    "salesPriceTotalAdjustmentGrossPercent",
    "extension"
})
public class COMPARABLEDETAIL {

    @XmlElementRef(name = "AdjustedSalesPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustedSalesPriceAmount;
    @XmlElementRef(name = "AdjustedSalesPricePerBedroomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustedSalesPricePerBedroomAmount;
    @XmlElementRef(name = "AdjustedSalesPricePerRoomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustedSalesPricePerRoomAmount;
    @XmlElementRef(name = "AdjustedSalesPricePerUnitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> adjustedSalesPricePerUnitAmount;
    @XmlElementRef(name = "ClosedSaleCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> closedSaleCommentDescription;
    @XmlElementRef(name = "ComparableIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> comparableIdentifier;
    @XmlElementRef(name = "ComparableListingCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> comparableListingCommentDescription;
    @XmlElementRef(name = "ComparablePropertyCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> comparablePropertyCommentDescription;
    @XmlElementRef(name = "ComparableSaleFurnishedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> comparableSaleFurnishedIndicator;
    @XmlElementRef(name = "ComparableType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ComparableEnum> comparableType;
    @XmlElementRef(name = "ComparableTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> comparableTypeOtherDescription;
    @XmlElementRef(name = "CompetitiveListingsCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> competitiveListingsCommentDescription;
    @XmlElementRef(name = "ContractDateUnknownIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> contractDateUnknownIndicator;
    @XmlElementRef(name = "GrossMonthlyRentMultiplierPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> grossMonthlyRentMultiplierPercent;
    @XmlElementRef(name = "MLSNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mlsNumberIdentifier;
    @XmlElementRef(name = "MonthlyRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monthlyRentAmount;
    @XmlElementRef(name = "MortgageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MortgageEnum> mortgageType;
    @XmlElementRef(name = "MortgageTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> mortgageTypeOtherDescription;
    @XmlElementRef(name = "NoFinancingTransactionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> noFinancingTransactionIndicator;
    @XmlElementRef(name = "PricePerSquareFootAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> pricePerSquareFootAmount;
    @XmlElementRef(name = "ProximityToSubjectDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> proximityToSubjectDescription;
    @XmlElementRef(name = "RentControlStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RentControlStatusEnum> rentControlStatusType;
    @XmlElementRef(name = "SalePriceTotalAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salePriceTotalAdjustmentAmount;
    @XmlElementRef(name = "SalePriceTotalAdjustmentNetPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> salePriceTotalAdjustmentNetPercent;
    @XmlElementRef(name = "SalesPricePerBedroomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerBedroomAmount;
    @XmlElementRef(name = "SalesPricePerGrossBuildingAreaAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerGrossBuildingAreaAmount;
    @XmlElementRef(name = "SalesPricePerGrossLivingAreaAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerGrossLivingAreaAmount;
    @XmlElementRef(name = "SalesPricePerOwnershipShareAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerOwnershipShareAmount;
    @XmlElementRef(name = "SalesPricePerRoomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerRoomAmount;
    @XmlElementRef(name = "SalesPricePerUnitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesPricePerUnitAmount;
    @XmlElementRef(name = "SalesPriceToListPriceRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> salesPriceToListPriceRatePercent;
    @XmlElementRef(name = "SalesPriceTotalAdjustmentGrossPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> salesPriceTotalAdjustmentGrossPercent;
    @XmlElement(name = "EXTENSION")
    protected COMPARABLEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adjustedSalesPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustedSalesPriceAmount() {
        return adjustedSalesPriceAmount;
    }

    /**
     * Sets the value of the adjustedSalesPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustedSalesPriceAmount(JAXBElement<MISMOAmount> value) {
        this.adjustedSalesPriceAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerBedroomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustedSalesPricePerBedroomAmount() {
        return adjustedSalesPricePerBedroomAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerBedroomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustedSalesPricePerBedroomAmount(JAXBElement<MISMOAmount> value) {
        this.adjustedSalesPricePerBedroomAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerRoomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustedSalesPricePerRoomAmount() {
        return adjustedSalesPricePerRoomAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerRoomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustedSalesPricePerRoomAmount(JAXBElement<MISMOAmount> value) {
        this.adjustedSalesPricePerRoomAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAdjustedSalesPricePerUnitAmount() {
        return adjustedSalesPricePerUnitAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAdjustedSalesPricePerUnitAmount(JAXBElement<MISMOAmount> value) {
        this.adjustedSalesPricePerUnitAmount = value;
    }

    /**
     * Gets the value of the closedSaleCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getClosedSaleCommentDescription() {
        return closedSaleCommentDescription;
    }

    /**
     * Sets the value of the closedSaleCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setClosedSaleCommentDescription(JAXBElement<MISMOString> value) {
        this.closedSaleCommentDescription = value;
    }

    /**
     * Gets the value of the comparableIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getComparableIdentifier() {
        return comparableIdentifier;
    }

    /**
     * Sets the value of the comparableIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setComparableIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.comparableIdentifier = value;
    }

    /**
     * Gets the value of the comparableListingCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getComparableListingCommentDescription() {
        return comparableListingCommentDescription;
    }

    /**
     * Sets the value of the comparableListingCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setComparableListingCommentDescription(JAXBElement<MISMOString> value) {
        this.comparableListingCommentDescription = value;
    }

    /**
     * Gets the value of the comparablePropertyCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getComparablePropertyCommentDescription() {
        return comparablePropertyCommentDescription;
    }

    /**
     * Sets the value of the comparablePropertyCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setComparablePropertyCommentDescription(JAXBElement<MISMOString> value) {
        this.comparablePropertyCommentDescription = value;
    }

    /**
     * Gets the value of the comparableSaleFurnishedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getComparableSaleFurnishedIndicator() {
        return comparableSaleFurnishedIndicator;
    }

    /**
     * Sets the value of the comparableSaleFurnishedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setComparableSaleFurnishedIndicator(JAXBElement<MISMOIndicator> value) {
        this.comparableSaleFurnishedIndicator = value;
    }

    /**
     * Gets the value of the comparableType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComparableEnum }{@code >}
     *     
     */
    public JAXBElement<ComparableEnum> getComparableType() {
        return comparableType;
    }

    /**
     * Sets the value of the comparableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComparableEnum }{@code >}
     *     
     */
    public void setComparableType(JAXBElement<ComparableEnum> value) {
        this.comparableType = value;
    }

    /**
     * Gets the value of the comparableTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getComparableTypeOtherDescription() {
        return comparableTypeOtherDescription;
    }

    /**
     * Sets the value of the comparableTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setComparableTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.comparableTypeOtherDescription = value;
    }

    /**
     * Gets the value of the competitiveListingsCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCompetitiveListingsCommentDescription() {
        return competitiveListingsCommentDescription;
    }

    /**
     * Sets the value of the competitiveListingsCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCompetitiveListingsCommentDescription(JAXBElement<MISMOString> value) {
        this.competitiveListingsCommentDescription = value;
    }

    /**
     * Gets the value of the contractDateUnknownIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getContractDateUnknownIndicator() {
        return contractDateUnknownIndicator;
    }

    /**
     * Sets the value of the contractDateUnknownIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setContractDateUnknownIndicator(JAXBElement<MISMOIndicator> value) {
        this.contractDateUnknownIndicator = value;
    }

    /**
     * Gets the value of the grossMonthlyRentMultiplierPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getGrossMonthlyRentMultiplierPercent() {
        return grossMonthlyRentMultiplierPercent;
    }

    /**
     * Sets the value of the grossMonthlyRentMultiplierPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setGrossMonthlyRentMultiplierPercent(JAXBElement<MISMOPercent> value) {
        this.grossMonthlyRentMultiplierPercent = value;
    }

    /**
     * Gets the value of the mlsNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMLSNumberIdentifier() {
        return mlsNumberIdentifier;
    }

    /**
     * Sets the value of the mlsNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMLSNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mlsNumberIdentifier = value;
    }

    /**
     * Gets the value of the monthlyRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonthlyRentAmount() {
        return monthlyRentAmount;
    }

    /**
     * Sets the value of the monthlyRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonthlyRentAmount(JAXBElement<MISMOAmount> value) {
        this.monthlyRentAmount = value;
    }

    /**
     * Gets the value of the mortgageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MortgageEnum }{@code >}
     *     
     */
    public JAXBElement<MortgageEnum> getMortgageType() {
        return mortgageType;
    }

    /**
     * Sets the value of the mortgageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MortgageEnum }{@code >}
     *     
     */
    public void setMortgageType(JAXBElement<MortgageEnum> value) {
        this.mortgageType = value;
    }

    /**
     * Gets the value of the mortgageTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMortgageTypeOtherDescription() {
        return mortgageTypeOtherDescription;
    }

    /**
     * Sets the value of the mortgageTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMortgageTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.mortgageTypeOtherDescription = value;
    }

    /**
     * Gets the value of the noFinancingTransactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getNoFinancingTransactionIndicator() {
        return noFinancingTransactionIndicator;
    }

    /**
     * Sets the value of the noFinancingTransactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setNoFinancingTransactionIndicator(JAXBElement<MISMOIndicator> value) {
        this.noFinancingTransactionIndicator = value;
    }

    /**
     * Gets the value of the pricePerSquareFootAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPricePerSquareFootAmount() {
        return pricePerSquareFootAmount;
    }

    /**
     * Sets the value of the pricePerSquareFootAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPricePerSquareFootAmount(JAXBElement<MISMOAmount> value) {
        this.pricePerSquareFootAmount = value;
    }

    /**
     * Gets the value of the proximityToSubjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProximityToSubjectDescription() {
        return proximityToSubjectDescription;
    }

    /**
     * Sets the value of the proximityToSubjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProximityToSubjectDescription(JAXBElement<MISMOString> value) {
        this.proximityToSubjectDescription = value;
    }

    /**
     * Gets the value of the rentControlStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RentControlStatusEnum }{@code >}
     *     
     */
    public JAXBElement<RentControlStatusEnum> getRentControlStatusType() {
        return rentControlStatusType;
    }

    /**
     * Sets the value of the rentControlStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RentControlStatusEnum }{@code >}
     *     
     */
    public void setRentControlStatusType(JAXBElement<RentControlStatusEnum> value) {
        this.rentControlStatusType = value;
    }

    /**
     * Gets the value of the salePriceTotalAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalePriceTotalAdjustmentAmount() {
        return salePriceTotalAdjustmentAmount;
    }

    /**
     * Sets the value of the salePriceTotalAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalePriceTotalAdjustmentAmount(JAXBElement<MISMOAmount> value) {
        this.salePriceTotalAdjustmentAmount = value;
    }

    /**
     * Gets the value of the salePriceTotalAdjustmentNetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getSalePriceTotalAdjustmentNetPercent() {
        return salePriceTotalAdjustmentNetPercent;
    }

    /**
     * Sets the value of the salePriceTotalAdjustmentNetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setSalePriceTotalAdjustmentNetPercent(JAXBElement<MISMOPercent> value) {
        this.salePriceTotalAdjustmentNetPercent = value;
    }

    /**
     * Gets the value of the salesPricePerBedroomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerBedroomAmount() {
        return salesPricePerBedroomAmount;
    }

    /**
     * Sets the value of the salesPricePerBedroomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerBedroomAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerBedroomAmount = value;
    }

    /**
     * Gets the value of the salesPricePerGrossBuildingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerGrossBuildingAreaAmount() {
        return salesPricePerGrossBuildingAreaAmount;
    }

    /**
     * Sets the value of the salesPricePerGrossBuildingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerGrossBuildingAreaAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerGrossBuildingAreaAmount = value;
    }

    /**
     * Gets the value of the salesPricePerGrossLivingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerGrossLivingAreaAmount() {
        return salesPricePerGrossLivingAreaAmount;
    }

    /**
     * Sets the value of the salesPricePerGrossLivingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerGrossLivingAreaAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerGrossLivingAreaAmount = value;
    }

    /**
     * Gets the value of the salesPricePerOwnershipShareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerOwnershipShareAmount() {
        return salesPricePerOwnershipShareAmount;
    }

    /**
     * Sets the value of the salesPricePerOwnershipShareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerOwnershipShareAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerOwnershipShareAmount = value;
    }

    /**
     * Gets the value of the salesPricePerRoomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerRoomAmount() {
        return salesPricePerRoomAmount;
    }

    /**
     * Sets the value of the salesPricePerRoomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerRoomAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerRoomAmount = value;
    }

    /**
     * Gets the value of the salesPricePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesPricePerUnitAmount() {
        return salesPricePerUnitAmount;
    }

    /**
     * Sets the value of the salesPricePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesPricePerUnitAmount(JAXBElement<MISMOAmount> value) {
        this.salesPricePerUnitAmount = value;
    }

    /**
     * Gets the value of the salesPriceToListPriceRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getSalesPriceToListPriceRatePercent() {
        return salesPriceToListPriceRatePercent;
    }

    /**
     * Sets the value of the salesPriceToListPriceRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setSalesPriceToListPriceRatePercent(JAXBElement<MISMOPercent> value) {
        this.salesPriceToListPriceRatePercent = value;
    }

    /**
     * Gets the value of the salesPriceTotalAdjustmentGrossPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getSalesPriceTotalAdjustmentGrossPercent() {
        return salesPriceTotalAdjustmentGrossPercent;
    }

    /**
     * Sets the value of the salesPriceTotalAdjustmentGrossPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setSalesPriceTotalAdjustmentGrossPercent(JAXBElement<MISMOPercent> value) {
        this.salesPriceTotalAdjustmentGrossPercent = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COMPARABLEDETAILEXTENSION }
     *     
     */
    public COMPARABLEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPARABLEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(COMPARABLEDETAILEXTENSION value) {
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
