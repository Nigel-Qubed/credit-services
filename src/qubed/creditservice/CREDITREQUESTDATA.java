//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditrepositoryincluded",
    "creditscoremodelname"
})
@XmlRootElement(name = "CREDIT_REQUEST_DATA")
public class CREDITREQUESTDATA {

    @XmlAttribute(name = "CreditRequestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String creditRequestID;
    @XmlAttribute(name = "BorrowerID")
    @XmlIDREF
    protected List<java.lang.Object> borrowerID;
    @XmlAttribute(name = "CreditReportIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditReportIdentifier;
    @XmlAttribute(name = "CreditReportTransactionIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditReportTransactionIdentifier;
    @XmlAttribute(name = "CreditReportProductDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditReportProductDescription;
    @XmlAttribute(name = "CreditReportRequestActionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditReportRequestActionType;
    @XmlAttribute(name = "CreditReportRequestActionTypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditReportRequestActionTypeOtherDescription;
    @XmlAttribute(name = "CreditReportType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditReportType;
    @XmlAttribute(name = "CreditReportTypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditReportTypeOtherDescription;
    @XmlAttribute(name = "CreditRepositoriesSelectedCount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditRepositoriesSelectedCount;
    @XmlAttribute(name = "CreditRequestDateTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditRequestDateTime;
    @XmlAttribute(name = "CreditRequestType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditRequestType;
    @XmlElement(name = "CREDIT_REPOSITORY_INCLUDED")
    protected CREDITREPOSITORYINCLUDED creditrepositoryincluded;
    @XmlElement(name = "CREDIT_SCORE_MODEL_NAME")
    protected List<CREDITSCOREMODELNAME> creditscoremodelname;

    /**
     * Gets the value of the creditRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRequestID() {
        return creditRequestID;
    }

    /**
     * Sets the value of the creditRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRequestID(String value) {
        this.creditRequestID = value;
    }

    /**
     * Gets the value of the borrowerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getBorrowerID() {
        if (borrowerID == null) {
            borrowerID = new ArrayList<java.lang.Object>();
        }
        return this.borrowerID;
    }

    /**
     * Gets the value of the creditReportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportIdentifier() {
        return creditReportIdentifier;
    }

    /**
     * Sets the value of the creditReportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportIdentifier(String value) {
        this.creditReportIdentifier = value;
    }

    /**
     * Gets the value of the creditReportTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportTransactionIdentifier() {
        return creditReportTransactionIdentifier;
    }

    /**
     * Sets the value of the creditReportTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportTransactionIdentifier(String value) {
        this.creditReportTransactionIdentifier = value;
    }

    /**
     * Gets the value of the creditReportProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportProductDescription() {
        return creditReportProductDescription;
    }

    /**
     * Sets the value of the creditReportProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportProductDescription(String value) {
        this.creditReportProductDescription = value;
    }

    /**
     * Gets the value of the creditReportRequestActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportRequestActionType() {
        return creditReportRequestActionType;
    }

    /**
     * Sets the value of the creditReportRequestActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportRequestActionType(String value) {
        this.creditReportRequestActionType = value;
    }

    /**
     * Gets the value of the creditReportRequestActionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportRequestActionTypeOtherDescription() {
        return creditReportRequestActionTypeOtherDescription;
    }

    /**
     * Sets the value of the creditReportRequestActionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportRequestActionTypeOtherDescription(String value) {
        this.creditReportRequestActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportType() {
        return creditReportType;
    }

    /**
     * Sets the value of the creditReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportType(String value) {
        this.creditReportType = value;
    }

    /**
     * Gets the value of the creditReportTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportTypeOtherDescription() {
        return creditReportTypeOtherDescription;
    }

    /**
     * Sets the value of the creditReportTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportTypeOtherDescription(String value) {
        this.creditReportTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditRepositoriesSelectedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRepositoriesSelectedCount() {
        return creditRepositoriesSelectedCount;
    }

    /**
     * Sets the value of the creditRepositoriesSelectedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRepositoriesSelectedCount(String value) {
        this.creditRepositoriesSelectedCount = value;
    }

    /**
     * Gets the value of the creditRequestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRequestDateTime() {
        return creditRequestDateTime;
    }

    /**
     * Sets the value of the creditRequestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRequestDateTime(String value) {
        this.creditRequestDateTime = value;
    }

    /**
     * Gets the value of the creditRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRequestType() {
        return creditRequestType;
    }

    /**
     * Sets the value of the creditRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRequestType(String value) {
        this.creditRequestType = value;
    }

    /**
     * Gets the value of the creditrepositoryincluded property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITREPOSITORYINCLUDED }
     *     
     */
    public CREDITREPOSITORYINCLUDED getCREDITREPOSITORYINCLUDED() {
        return creditrepositoryincluded;
    }

    /**
     * Sets the value of the creditrepositoryincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITREPOSITORYINCLUDED }
     *     
     */
    public void setCREDITREPOSITORYINCLUDED(CREDITREPOSITORYINCLUDED value) {
        this.creditrepositoryincluded = value;
    }

    /**
     * Gets the value of the creditscoremodelname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditscoremodelname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITSCOREMODELNAME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITSCOREMODELNAME }
     * 
     * 
     */
    public List<CREDITSCOREMODELNAME> getCREDITSCOREMODELNAME() {
        if (creditscoremodelname == null) {
            creditscoremodelname = new ArrayList<CREDITSCOREMODELNAME>();
        }
        return this.creditscoremodelname;
    }

}
