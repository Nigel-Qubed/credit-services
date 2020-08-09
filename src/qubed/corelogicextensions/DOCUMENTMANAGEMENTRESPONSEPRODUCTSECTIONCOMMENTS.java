//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInformationSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EstablishedProjectDetailsSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectConversionsSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OwnershipRightsSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CommercialSpaceSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectTypeSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServicesAndFeaturesSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InsuranceInformationSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FinancialSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddendumSectionCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENT_MANAGEMENT_RESPONSE_PRODUCT_SECTION_COMMENTS", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "contactInformationSectionCommentText",
    "projectSectionCommentText",
    "establishedProjectDetailsSectionCommentText",
    "projectConversionsSectionCommentText",
    "ownershipRightsSectionCommentText",
    "commercialSpaceSectionCommentText",
    "projectTypeSectionCommentText",
    "servicesAndFeaturesSectionCommentText",
    "insuranceInformationSectionCommentText",
    "financialSectionCommentText",
    "addendumSectionCommentText"
})
public class DOCUMENTMANAGEMENTRESPONSEPRODUCTSECTIONCOMMENTS {

    @XmlElement(name = "ContactInformationSectionCommentText")
    protected MISMOString contactInformationSectionCommentText;
    @XmlElement(name = "ProjectSectionCommentText")
    protected MISMOString projectSectionCommentText;
    @XmlElement(name = "EstablishedProjectDetailsSectionCommentText")
    protected MISMOString establishedProjectDetailsSectionCommentText;
    @XmlElement(name = "ProjectConversionsSectionCommentText")
    protected MISMOString projectConversionsSectionCommentText;
    @XmlElement(name = "OwnershipRightsSectionCommentText")
    protected MISMOString ownershipRightsSectionCommentText;
    @XmlElement(name = "CommercialSpaceSectionCommentText")
    protected MISMOString commercialSpaceSectionCommentText;
    @XmlElement(name = "ProjectTypeSectionCommentText")
    protected MISMOString projectTypeSectionCommentText;
    @XmlElement(name = "ServicesAndFeaturesSectionCommentText")
    protected MISMOString servicesAndFeaturesSectionCommentText;
    @XmlElement(name = "InsuranceInformationSectionCommentText")
    protected MISMOString insuranceInformationSectionCommentText;
    @XmlElement(name = "FinancialSectionCommentText")
    protected MISMOString financialSectionCommentText;
    @XmlElement(name = "AddendumSectionCommentText")
    protected MISMOString addendumSectionCommentText;

    /**
     * Gets the value of the contactInformationSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getContactInformationSectionCommentText() {
        return contactInformationSectionCommentText;
    }

    /**
     * Sets the value of the contactInformationSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setContactInformationSectionCommentText(MISMOString value) {
        this.contactInformationSectionCommentText = value;
    }

    /**
     * Gets the value of the projectSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getProjectSectionCommentText() {
        return projectSectionCommentText;
    }

    /**
     * Sets the value of the projectSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setProjectSectionCommentText(MISMOString value) {
        this.projectSectionCommentText = value;
    }

    /**
     * Gets the value of the establishedProjectDetailsSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getEstablishedProjectDetailsSectionCommentText() {
        return establishedProjectDetailsSectionCommentText;
    }

    /**
     * Sets the value of the establishedProjectDetailsSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setEstablishedProjectDetailsSectionCommentText(MISMOString value) {
        this.establishedProjectDetailsSectionCommentText = value;
    }

    /**
     * Gets the value of the projectConversionsSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getProjectConversionsSectionCommentText() {
        return projectConversionsSectionCommentText;
    }

    /**
     * Sets the value of the projectConversionsSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setProjectConversionsSectionCommentText(MISMOString value) {
        this.projectConversionsSectionCommentText = value;
    }

    /**
     * Gets the value of the ownershipRightsSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getOwnershipRightsSectionCommentText() {
        return ownershipRightsSectionCommentText;
    }

    /**
     * Sets the value of the ownershipRightsSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setOwnershipRightsSectionCommentText(MISMOString value) {
        this.ownershipRightsSectionCommentText = value;
    }

    /**
     * Gets the value of the commercialSpaceSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getCommercialSpaceSectionCommentText() {
        return commercialSpaceSectionCommentText;
    }

    /**
     * Sets the value of the commercialSpaceSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setCommercialSpaceSectionCommentText(MISMOString value) {
        this.commercialSpaceSectionCommentText = value;
    }

    /**
     * Gets the value of the projectTypeSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getProjectTypeSectionCommentText() {
        return projectTypeSectionCommentText;
    }

    /**
     * Sets the value of the projectTypeSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setProjectTypeSectionCommentText(MISMOString value) {
        this.projectTypeSectionCommentText = value;
    }

    /**
     * Gets the value of the servicesAndFeaturesSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getServicesAndFeaturesSectionCommentText() {
        return servicesAndFeaturesSectionCommentText;
    }

    /**
     * Sets the value of the servicesAndFeaturesSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setServicesAndFeaturesSectionCommentText(MISMOString value) {
        this.servicesAndFeaturesSectionCommentText = value;
    }

    /**
     * Gets the value of the insuranceInformationSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getInsuranceInformationSectionCommentText() {
        return insuranceInformationSectionCommentText;
    }

    /**
     * Sets the value of the insuranceInformationSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setInsuranceInformationSectionCommentText(MISMOString value) {
        this.insuranceInformationSectionCommentText = value;
    }

    /**
     * Gets the value of the financialSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getFinancialSectionCommentText() {
        return financialSectionCommentText;
    }

    /**
     * Sets the value of the financialSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setFinancialSectionCommentText(MISMOString value) {
        this.financialSectionCommentText = value;
    }

    /**
     * Gets the value of the addendumSectionCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getAddendumSectionCommentText() {
        return addendumSectionCommentText;
    }

    /**
     * Sets the value of the addendumSectionCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setAddendumSectionCommentText(MISMOString value) {
        this.addendumSectionCommentText = value;
    }

}
