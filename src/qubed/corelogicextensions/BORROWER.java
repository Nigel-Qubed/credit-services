//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information specific to the person making the loan; also known as the mortgagor or obligor.
 * 
 * <p>Java class for BORROWER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BORROWER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANKRUPTCIES" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCIES" minOccurs="0"/>
 *         &lt;element name="BORROWER_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}BORROWER_DETAIL" minOccurs="0"/>
 *         &lt;element name="COUNSELING" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING" minOccurs="0"/>
 *         &lt;element name="CREDIT_SCORES" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORES" minOccurs="0"/>
 *         &lt;element name="CURRENT_INCOME" type="{http://www.mismo.org/residential/2009/schemas}CURRENT_INCOME" minOccurs="0"/>
 *         &lt;element name="DECLARATION" type="{http://www.mismo.org/residential/2009/schemas}DECLARATION" minOccurs="0"/>
 *         &lt;element name="DEPENDENTS" type="{http://www.mismo.org/residential/2009/schemas}DEPENDENTS" minOccurs="0"/>
 *         &lt;element name="EMPLOYERS" type="{http://www.mismo.org/residential/2009/schemas}EMPLOYERS" minOccurs="0"/>
 *         &lt;element name="GOVERNMENT_BORROWER" type="{http://www.mismo.org/residential/2009/schemas}GOVERNMENT_BORROWER" minOccurs="0"/>
 *         &lt;element name="GOVERNMENT_MONITORING" type="{http://www.mismo.org/residential/2009/schemas}GOVERNMENT_MONITORING" minOccurs="0"/>
 *         &lt;element name="HARDSHIP_DECLARATION" type="{http://www.mismo.org/residential/2009/schemas}HARDSHIP_DECLARATION" minOccurs="0"/>
 *         &lt;element name="HOUSING_EXPENSES" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_EXPENSES" minOccurs="0"/>
 *         &lt;element name="MILITARY_SERVICES" type="{http://www.mismo.org/residential/2009/schemas}MILITARY_SERVICES" minOccurs="0"/>
 *         &lt;element name="NEAREST_LIVING_RELATIVE" type="{http://www.mismo.org/residential/2009/schemas}NEAREST_LIVING_RELATIVE" minOccurs="0"/>
 *         &lt;element name="RESIDENCES" type="{http://www.mismo.org/residential/2009/schemas}RESIDENCES" minOccurs="0"/>
 *         &lt;element name="SOLICITATION_PREFERENCE" type="{http://www.mismo.org/residential/2009/schemas}SOLICITATION_PREFERENCE" minOccurs="0"/>
 *         &lt;element name="SUMMARIES" type="{http://www.mismo.org/residential/2009/schemas}SUMMARIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BORROWER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BORROWER", propOrder = {
    "bankruptcies",
    "borrowerdetail",
    "counseling",
    "creditscores",
    "currentincome",
    "declaration",
    "dependents",
    "employers",
    "governmentborrower",
    "governmentmonitoring",
    "hardshipdeclaration",
    "housingexpenses",
    "militaryservices",
    "nearestlivingrelative",
    "residences",
    "solicitationpreference",
    "summaries",
    "extension"
})
public class BORROWER {

    @XmlElement(name = "BANKRUPTCIES")
    protected BANKRUPTCIES bankruptcies;
    @XmlElement(name = "BORROWER_DETAIL")
    protected BORROWERDETAIL borrowerdetail;
    @XmlElement(name = "COUNSELING")
    protected COUNSELING counseling;
    @XmlElement(name = "CREDIT_SCORES")
    protected CREDITSCORES creditscores;
    @XmlElement(name = "CURRENT_INCOME")
    protected CURRENTINCOME currentincome;
    @XmlElement(name = "DECLARATION")
    protected DECLARATION declaration;
    @XmlElement(name = "DEPENDENTS")
    protected DEPENDENTS dependents;
    @XmlElement(name = "EMPLOYERS")
    protected EMPLOYERS employers;
    @XmlElement(name = "GOVERNMENT_BORROWER")
    protected GOVERNMENTBORROWER governmentborrower;
    @XmlElement(name = "GOVERNMENT_MONITORING")
    protected GOVERNMENTMONITORING governmentmonitoring;
    @XmlElement(name = "HARDSHIP_DECLARATION")
    protected HARDSHIPDECLARATION hardshipdeclaration;
    @XmlElement(name = "HOUSING_EXPENSES")
    protected HOUSINGEXPENSES housingexpenses;
    @XmlElement(name = "MILITARY_SERVICES")
    protected MILITARYSERVICES militaryservices;
    @XmlElement(name = "NEAREST_LIVING_RELATIVE")
    protected NEARESTLIVINGRELATIVE nearestlivingrelative;
    @XmlElement(name = "RESIDENCES")
    protected RESIDENCES residences;
    @XmlElement(name = "SOLICITATION_PREFERENCE")
    protected SOLICITATIONPREFERENCE solicitationpreference;
    @XmlElement(name = "SUMMARIES")
    protected SUMMARIES summaries;
    @XmlElement(name = "EXTENSION")
    protected BORROWEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the bankruptcies property.
     * 
     * @return
     *     possible object is
     *     {@link BANKRUPTCIES }
     *     
     */
    public BANKRUPTCIES getBANKRUPTCIES() {
        return bankruptcies;
    }

    /**
     * Sets the value of the bankruptcies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCIES }
     *     
     */
    public void setBANKRUPTCIES(BANKRUPTCIES value) {
        this.bankruptcies = value;
    }

    /**
     * Gets the value of the borrowerdetail property.
     * 
     * @return
     *     possible object is
     *     {@link BORROWERDETAIL }
     *     
     */
    public BORROWERDETAIL getBORROWERDETAIL() {
        return borrowerdetail;
    }

    /**
     * Sets the value of the borrowerdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BORROWERDETAIL }
     *     
     */
    public void setBORROWERDETAIL(BORROWERDETAIL value) {
        this.borrowerdetail = value;
    }

    /**
     * Gets the value of the counseling property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELING }
     *     
     */
    public COUNSELING getCOUNSELING() {
        return counseling;
    }

    /**
     * Sets the value of the counseling property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELING }
     *     
     */
    public void setCOUNSELING(COUNSELING value) {
        this.counseling = value;
    }

    /**
     * Gets the value of the creditscores property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCORES }
     *     
     */
    public CREDITSCORES getCREDITSCORES() {
        return creditscores;
    }

    /**
     * Sets the value of the creditscores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCORES }
     *     
     */
    public void setCREDITSCORES(CREDITSCORES value) {
        this.creditscores = value;
    }

    /**
     * Gets the value of the currentincome property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENTINCOME }
     *     
     */
    public CURRENTINCOME getCURRENTINCOME() {
        return currentincome;
    }

    /**
     * Sets the value of the currentincome property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENTINCOME }
     *     
     */
    public void setCURRENTINCOME(CURRENTINCOME value) {
        this.currentincome = value;
    }

    /**
     * Gets the value of the declaration property.
     * 
     * @return
     *     possible object is
     *     {@link DECLARATION }
     *     
     */
    public DECLARATION getDECLARATION() {
        return declaration;
    }

    /**
     * Sets the value of the declaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECLARATION }
     *     
     */
    public void setDECLARATION(DECLARATION value) {
        this.declaration = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link DEPENDENTS }
     *     
     */
    public DEPENDENTS getDEPENDENTS() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEPENDENTS }
     *     
     */
    public void setDEPENDENTS(DEPENDENTS value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the employers property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYERS }
     *     
     */
    public EMPLOYERS getEMPLOYERS() {
        return employers;
    }

    /**
     * Sets the value of the employers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYERS }
     *     
     */
    public void setEMPLOYERS(EMPLOYERS value) {
        this.employers = value;
    }

    /**
     * Gets the value of the governmentborrower property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTBORROWER }
     *     
     */
    public GOVERNMENTBORROWER getGOVERNMENTBORROWER() {
        return governmentborrower;
    }

    /**
     * Sets the value of the governmentborrower property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTBORROWER }
     *     
     */
    public void setGOVERNMENTBORROWER(GOVERNMENTBORROWER value) {
        this.governmentborrower = value;
    }

    /**
     * Gets the value of the governmentmonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTMONITORING }
     *     
     */
    public GOVERNMENTMONITORING getGOVERNMENTMONITORING() {
        return governmentmonitoring;
    }

    /**
     * Sets the value of the governmentmonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTMONITORING }
     *     
     */
    public void setGOVERNMENTMONITORING(GOVERNMENTMONITORING value) {
        this.governmentmonitoring = value;
    }

    /**
     * Gets the value of the hardshipdeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link HARDSHIPDECLARATION }
     *     
     */
    public HARDSHIPDECLARATION getHARDSHIPDECLARATION() {
        return hardshipdeclaration;
    }

    /**
     * Sets the value of the hardshipdeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link HARDSHIPDECLARATION }
     *     
     */
    public void setHARDSHIPDECLARATION(HARDSHIPDECLARATION value) {
        this.hardshipdeclaration = value;
    }

    /**
     * Gets the value of the housingexpenses property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSINGEXPENSES }
     *     
     */
    public HOUSINGEXPENSES getHOUSINGEXPENSES() {
        return housingexpenses;
    }

    /**
     * Sets the value of the housingexpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSINGEXPENSES }
     *     
     */
    public void setHOUSINGEXPENSES(HOUSINGEXPENSES value) {
        this.housingexpenses = value;
    }

    /**
     * Gets the value of the militaryservices property.
     * 
     * @return
     *     possible object is
     *     {@link MILITARYSERVICES }
     *     
     */
    public MILITARYSERVICES getMILITARYSERVICES() {
        return militaryservices;
    }

    /**
     * Sets the value of the militaryservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILITARYSERVICES }
     *     
     */
    public void setMILITARYSERVICES(MILITARYSERVICES value) {
        this.militaryservices = value;
    }

    /**
     * Gets the value of the nearestlivingrelative property.
     * 
     * @return
     *     possible object is
     *     {@link NEARESTLIVINGRELATIVE }
     *     
     */
    public NEARESTLIVINGRELATIVE getNEARESTLIVINGRELATIVE() {
        return nearestlivingrelative;
    }

    /**
     * Sets the value of the nearestlivingrelative property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEARESTLIVINGRELATIVE }
     *     
     */
    public void setNEARESTLIVINGRELATIVE(NEARESTLIVINGRELATIVE value) {
        this.nearestlivingrelative = value;
    }

    /**
     * Gets the value of the residences property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCES }
     *     
     */
    public RESIDENCES getRESIDENCES() {
        return residences;
    }

    /**
     * Sets the value of the residences property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCES }
     *     
     */
    public void setRESIDENCES(RESIDENCES value) {
        this.residences = value;
    }

    /**
     * Gets the value of the solicitationpreference property.
     * 
     * @return
     *     possible object is
     *     {@link SOLICITATIONPREFERENCE }
     *     
     */
    public SOLICITATIONPREFERENCE getSOLICITATIONPREFERENCE() {
        return solicitationpreference;
    }

    /**
     * Sets the value of the solicitationpreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLICITATIONPREFERENCE }
     *     
     */
    public void setSOLICITATIONPREFERENCE(SOLICITATIONPREFERENCE value) {
        this.solicitationpreference = value;
    }

    /**
     * Gets the value of the summaries property.
     * 
     * @return
     *     possible object is
     *     {@link SUMMARIES }
     *     
     */
    public SUMMARIES getSUMMARIES() {
        return summaries;
    }

    /**
     * Sets the value of the summaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUMMARIES }
     *     
     */
    public void setSUMMARIES(SUMMARIES value) {
        this.summaries = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BORROWEREXTENSION }
     *     
     */
    public BORROWEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BORROWEREXTENSION }
     *     
     */
    public void setEXTENSION(BORROWEREXTENSION value) {
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
