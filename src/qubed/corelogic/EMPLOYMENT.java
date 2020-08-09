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
 * Additional information about the employer.
 * 
 * 
 * <p>Java class for EMPLOYMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMPLOYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployedAbroadIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EmploymentBorrowerHomeOfficeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EmploymentBorrowerSelfEmployedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EmploymentClassificationType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentClassificationEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EmploymentMonthlyIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EmploymentMonthsOnJobCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EmploymentPositionDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentReportedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EmploymentSelfOwnedBusinessOperationsEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EmploymentSelfOwnedBusinessOperationsStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EmploymentStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EmploymentStatusType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentStatusEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentTimeInLineOfWorkMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EmploymentTimeInLineOfWorkYearsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EmploymentTypeOfBusinessDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentYearsOnJobCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="OwnershipInterestType" type="{http://www.mismo.org/residential/2009/schemas}OwnershipInterestEnum" minOccurs="0"/>
 *         &lt;element name="OwnershipInterestTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SpecialBorrowerEmployerRelationshipIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SpecialBorrowerEmployerRelationshipType" type="{http://www.mismo.org/residential/2009/schemas}SpecialBorrowerEmployerRelationshipEnum" minOccurs="0"/>
 *         &lt;element name="SpecialBorrowerEmployerRelationshipTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EMPLOYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "EMPLOYMENT", propOrder = {
    "employedAbroadIndicator",
    "employmentBorrowerHomeOfficeIndicator",
    "employmentBorrowerSelfEmployedIndicator",
    "employmentClassificationType",
    "employmentEndDate",
    "employmentMonthlyIncomeAmount",
    "employmentMonthsOnJobCount",
    "employmentPositionDescription",
    "employmentReportedDate",
    "employmentSelfOwnedBusinessOperationsEndDate",
    "employmentSelfOwnedBusinessOperationsStartDate",
    "employmentStartDate",
    "employmentStatusType",
    "employmentTimeInLineOfWorkMonthsCount",
    "employmentTimeInLineOfWorkYearsCount",
    "employmentTypeOfBusinessDescription",
    "employmentYearsOnJobCount",
    "ownershipInterestType",
    "ownershipInterestTypeOtherDescription",
    "specialBorrowerEmployerRelationshipIndicator",
    "specialBorrowerEmployerRelationshipType",
    "specialBorrowerEmployerRelationshipTypeOtherDescription",
    "extension"
})
public class EMPLOYMENT {

    @XmlElementRef(name = "EmployedAbroadIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> employedAbroadIndicator;
    @XmlElementRef(name = "EmploymentBorrowerHomeOfficeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> employmentBorrowerHomeOfficeIndicator;
    @XmlElementRef(name = "EmploymentBorrowerSelfEmployedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> employmentBorrowerSelfEmployedIndicator;
    @XmlElementRef(name = "EmploymentClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentClassificationEnum> employmentClassificationType;
    @XmlElementRef(name = "EmploymentEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> employmentEndDate;
    @XmlElementRef(name = "EmploymentMonthlyIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> employmentMonthlyIncomeAmount;
    @XmlElementRef(name = "EmploymentMonthsOnJobCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> employmentMonthsOnJobCount;
    @XmlElementRef(name = "EmploymentPositionDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> employmentPositionDescription;
    @XmlElementRef(name = "EmploymentReportedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> employmentReportedDate;
    @XmlElementRef(name = "EmploymentSelfOwnedBusinessOperationsEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> employmentSelfOwnedBusinessOperationsEndDate;
    @XmlElementRef(name = "EmploymentSelfOwnedBusinessOperationsStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> employmentSelfOwnedBusinessOperationsStartDate;
    @XmlElementRef(name = "EmploymentStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> employmentStartDate;
    @XmlElementRef(name = "EmploymentStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentStatusEnum> employmentStatusType;
    @XmlElementRef(name = "EmploymentTimeInLineOfWorkMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> employmentTimeInLineOfWorkMonthsCount;
    @XmlElementRef(name = "EmploymentTimeInLineOfWorkYearsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> employmentTimeInLineOfWorkYearsCount;
    @XmlElementRef(name = "EmploymentTypeOfBusinessDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> employmentTypeOfBusinessDescription;
    @XmlElementRef(name = "EmploymentYearsOnJobCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> employmentYearsOnJobCount;
    @XmlElementRef(name = "OwnershipInterestType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnershipInterestEnum> ownershipInterestType;
    @XmlElementRef(name = "OwnershipInterestTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> ownershipInterestTypeOtherDescription;
    @XmlElementRef(name = "SpecialBorrowerEmployerRelationshipIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> specialBorrowerEmployerRelationshipIndicator;
    @XmlElementRef(name = "SpecialBorrowerEmployerRelationshipType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialBorrowerEmployerRelationshipEnum> specialBorrowerEmployerRelationshipType;
    @XmlElementRef(name = "SpecialBorrowerEmployerRelationshipTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> specialBorrowerEmployerRelationshipTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected EMPLOYMENTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the employedAbroadIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getEmployedAbroadIndicator() {
        return employedAbroadIndicator;
    }

    /**
     * Sets the value of the employedAbroadIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setEmployedAbroadIndicator(JAXBElement<MISMOIndicator> value) {
        this.employedAbroadIndicator = value;
    }

    /**
     * Gets the value of the employmentBorrowerHomeOfficeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getEmploymentBorrowerHomeOfficeIndicator() {
        return employmentBorrowerHomeOfficeIndicator;
    }

    /**
     * Sets the value of the employmentBorrowerHomeOfficeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setEmploymentBorrowerHomeOfficeIndicator(JAXBElement<MISMOIndicator> value) {
        this.employmentBorrowerHomeOfficeIndicator = value;
    }

    /**
     * Gets the value of the employmentBorrowerSelfEmployedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getEmploymentBorrowerSelfEmployedIndicator() {
        return employmentBorrowerSelfEmployedIndicator;
    }

    /**
     * Sets the value of the employmentBorrowerSelfEmployedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setEmploymentBorrowerSelfEmployedIndicator(JAXBElement<MISMOIndicator> value) {
        this.employmentBorrowerSelfEmployedIndicator = value;
    }

    /**
     * Gets the value of the employmentClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentClassificationEnum }{@code >}
     *     
     */
    public JAXBElement<EmploymentClassificationEnum> getEmploymentClassificationType() {
        return employmentClassificationType;
    }

    /**
     * Sets the value of the employmentClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentClassificationEnum }{@code >}
     *     
     */
    public void setEmploymentClassificationType(JAXBElement<EmploymentClassificationEnum> value) {
        this.employmentClassificationType = value;
    }

    /**
     * Gets the value of the employmentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEmploymentEndDate() {
        return employmentEndDate;
    }

    /**
     * Sets the value of the employmentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEmploymentEndDate(JAXBElement<MISMODate> value) {
        this.employmentEndDate = value;
    }

    /**
     * Gets the value of the employmentMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEmploymentMonthlyIncomeAmount() {
        return employmentMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the employmentMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEmploymentMonthlyIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.employmentMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the employmentMonthsOnJobCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEmploymentMonthsOnJobCount() {
        return employmentMonthsOnJobCount;
    }

    /**
     * Sets the value of the employmentMonthsOnJobCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEmploymentMonthsOnJobCount(JAXBElement<MISMOCount> value) {
        this.employmentMonthsOnJobCount = value;
    }

    /**
     * Gets the value of the employmentPositionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEmploymentPositionDescription() {
        return employmentPositionDescription;
    }

    /**
     * Sets the value of the employmentPositionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEmploymentPositionDescription(JAXBElement<MISMOString> value) {
        this.employmentPositionDescription = value;
    }

    /**
     * Gets the value of the employmentReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEmploymentReportedDate() {
        return employmentReportedDate;
    }

    /**
     * Sets the value of the employmentReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEmploymentReportedDate(JAXBElement<MISMODate> value) {
        this.employmentReportedDate = value;
    }

    /**
     * Gets the value of the employmentSelfOwnedBusinessOperationsEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEmploymentSelfOwnedBusinessOperationsEndDate() {
        return employmentSelfOwnedBusinessOperationsEndDate;
    }

    /**
     * Sets the value of the employmentSelfOwnedBusinessOperationsEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEmploymentSelfOwnedBusinessOperationsEndDate(JAXBElement<MISMODate> value) {
        this.employmentSelfOwnedBusinessOperationsEndDate = value;
    }

    /**
     * Gets the value of the employmentSelfOwnedBusinessOperationsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEmploymentSelfOwnedBusinessOperationsStartDate() {
        return employmentSelfOwnedBusinessOperationsStartDate;
    }

    /**
     * Sets the value of the employmentSelfOwnedBusinessOperationsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEmploymentSelfOwnedBusinessOperationsStartDate(JAXBElement<MISMODate> value) {
        this.employmentSelfOwnedBusinessOperationsStartDate = value;
    }

    /**
     * Gets the value of the employmentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getEmploymentStartDate() {
        return employmentStartDate;
    }

    /**
     * Sets the value of the employmentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setEmploymentStartDate(JAXBElement<MISMODate> value) {
        this.employmentStartDate = value;
    }

    /**
     * Gets the value of the employmentStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentStatusEnum }{@code >}
     *     
     */
    public JAXBElement<EmploymentStatusEnum> getEmploymentStatusType() {
        return employmentStatusType;
    }

    /**
     * Sets the value of the employmentStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentStatusEnum }{@code >}
     *     
     */
    public void setEmploymentStatusType(JAXBElement<EmploymentStatusEnum> value) {
        this.employmentStatusType = value;
    }

    /**
     * Gets the value of the employmentTimeInLineOfWorkMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEmploymentTimeInLineOfWorkMonthsCount() {
        return employmentTimeInLineOfWorkMonthsCount;
    }

    /**
     * Sets the value of the employmentTimeInLineOfWorkMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEmploymentTimeInLineOfWorkMonthsCount(JAXBElement<MISMOCount> value) {
        this.employmentTimeInLineOfWorkMonthsCount = value;
    }

    /**
     * Gets the value of the employmentTimeInLineOfWorkYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEmploymentTimeInLineOfWorkYearsCount() {
        return employmentTimeInLineOfWorkYearsCount;
    }

    /**
     * Sets the value of the employmentTimeInLineOfWorkYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEmploymentTimeInLineOfWorkYearsCount(JAXBElement<MISMOCount> value) {
        this.employmentTimeInLineOfWorkYearsCount = value;
    }

    /**
     * Gets the value of the employmentTypeOfBusinessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEmploymentTypeOfBusinessDescription() {
        return employmentTypeOfBusinessDescription;
    }

    /**
     * Sets the value of the employmentTypeOfBusinessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEmploymentTypeOfBusinessDescription(JAXBElement<MISMOString> value) {
        this.employmentTypeOfBusinessDescription = value;
    }

    /**
     * Gets the value of the employmentYearsOnJobCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEmploymentYearsOnJobCount() {
        return employmentYearsOnJobCount;
    }

    /**
     * Sets the value of the employmentYearsOnJobCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEmploymentYearsOnJobCount(JAXBElement<MISMOCount> value) {
        this.employmentYearsOnJobCount = value;
    }

    /**
     * Gets the value of the ownershipInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OwnershipInterestEnum }{@code >}
     *     
     */
    public JAXBElement<OwnershipInterestEnum> getOwnershipInterestType() {
        return ownershipInterestType;
    }

    /**
     * Sets the value of the ownershipInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OwnershipInterestEnum }{@code >}
     *     
     */
    public void setOwnershipInterestType(JAXBElement<OwnershipInterestEnum> value) {
        this.ownershipInterestType = value;
    }

    /**
     * Gets the value of the ownershipInterestTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getOwnershipInterestTypeOtherDescription() {
        return ownershipInterestTypeOtherDescription;
    }

    /**
     * Sets the value of the ownershipInterestTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setOwnershipInterestTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.ownershipInterestTypeOtherDescription = value;
    }

    /**
     * Gets the value of the specialBorrowerEmployerRelationshipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSpecialBorrowerEmployerRelationshipIndicator() {
        return specialBorrowerEmployerRelationshipIndicator;
    }

    /**
     * Sets the value of the specialBorrowerEmployerRelationshipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSpecialBorrowerEmployerRelationshipIndicator(JAXBElement<MISMOIndicator> value) {
        this.specialBorrowerEmployerRelationshipIndicator = value;
    }

    /**
     * Gets the value of the specialBorrowerEmployerRelationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialBorrowerEmployerRelationshipEnum }{@code >}
     *     
     */
    public JAXBElement<SpecialBorrowerEmployerRelationshipEnum> getSpecialBorrowerEmployerRelationshipType() {
        return specialBorrowerEmployerRelationshipType;
    }

    /**
     * Sets the value of the specialBorrowerEmployerRelationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialBorrowerEmployerRelationshipEnum }{@code >}
     *     
     */
    public void setSpecialBorrowerEmployerRelationshipType(JAXBElement<SpecialBorrowerEmployerRelationshipEnum> value) {
        this.specialBorrowerEmployerRelationshipType = value;
    }

    /**
     * Gets the value of the specialBorrowerEmployerRelationshipTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSpecialBorrowerEmployerRelationshipTypeOtherDescription() {
        return specialBorrowerEmployerRelationshipTypeOtherDescription;
    }

    /**
     * Sets the value of the specialBorrowerEmployerRelationshipTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSpecialBorrowerEmployerRelationshipTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.specialBorrowerEmployerRelationshipTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYMENTEXTENSION }
     *     
     */
    public EMPLOYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYMENTEXTENSION }
     *     
     */
    public void setEXTENSION(EMPLOYMENTEXTENSION value) {
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