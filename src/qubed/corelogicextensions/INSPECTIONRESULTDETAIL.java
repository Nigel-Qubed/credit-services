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
 * <p>Java class for INSPECTION_RESULT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSPECTION_RESULT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FSClientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InspectionRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegativeExternalFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreparationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSPECTION_RESULT_DETAIL", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "clientIdentifier",
    "comments",
    "fsClientIdentifier",
    "inspectionRequestType",
    "negativeExternalFactor",
    "otherDescription",
    "plsCode",
    "preparationDate",
    "priority",
    "processorCode",
    "ratingDescription",
    "ratingScore",
    "reasonCode",
    "successIndicator",
    "transactionIdentifier",
    "workOrderIdentifier"
})
public class INSPECTIONRESULTDETAIL {

    @XmlElement(name = "ClientIdentifier")
    protected String clientIdentifier;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "FSClientIdentifier")
    protected String fsClientIdentifier;
    @XmlElement(name = "InspectionRequestType")
    protected String inspectionRequestType;
    @XmlElement(name = "NegativeExternalFactor")
    protected String negativeExternalFactor;
    @XmlElement(name = "OtherDescription")
    protected String otherDescription;
    @XmlElement(name = "PLSCode")
    protected String plsCode;
    @XmlElement(name = "PreparationDate")
    protected String preparationDate;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "ProcessorCode")
    protected String processorCode;
    @XmlElement(name = "RatingDescription")
    protected String ratingDescription;
    @XmlElement(name = "RatingScore")
    protected String ratingScore;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "SuccessIndicator")
    protected String successIndicator;
    @XmlElement(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlElement(name = "WorkOrderIdentifier")
    protected String workOrderIdentifier;

    /**
     * Gets the value of the clientIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentifier() {
        return clientIdentifier;
    }

    /**
     * Sets the value of the clientIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentifier(String value) {
        this.clientIdentifier = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the fsClientIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSClientIdentifier() {
        return fsClientIdentifier;
    }

    /**
     * Sets the value of the fsClientIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSClientIdentifier(String value) {
        this.fsClientIdentifier = value;
    }

    /**
     * Gets the value of the inspectionRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionRequestType() {
        return inspectionRequestType;
    }

    /**
     * Sets the value of the inspectionRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionRequestType(String value) {
        this.inspectionRequestType = value;
    }

    /**
     * Gets the value of the negativeExternalFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeExternalFactor() {
        return negativeExternalFactor;
    }

    /**
     * Sets the value of the negativeExternalFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeExternalFactor(String value) {
        this.negativeExternalFactor = value;
    }

    /**
     * Gets the value of the otherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    /**
     * Sets the value of the otherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDescription(String value) {
        this.otherDescription = value;
    }

    /**
     * Gets the value of the plsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLSCode() {
        return plsCode;
    }

    /**
     * Sets the value of the plsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLSCode(String value) {
        this.plsCode = value;
    }

    /**
     * Gets the value of the preparationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationDate() {
        return preparationDate;
    }

    /**
     * Sets the value of the preparationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationDate(String value) {
        this.preparationDate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the processorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorCode() {
        return processorCode;
    }

    /**
     * Sets the value of the processorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorCode(String value) {
        this.processorCode = value;
    }

    /**
     * Gets the value of the ratingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDescription() {
        return ratingDescription;
    }

    /**
     * Sets the value of the ratingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDescription(String value) {
        this.ratingDescription = value;
    }

    /**
     * Gets the value of the ratingScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingScore() {
        return ratingScore;
    }

    /**
     * Sets the value of the ratingScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingScore(String value) {
        this.ratingScore = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the successIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Sets the value of the successIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessIndicator(String value) {
        this.successIndicator = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the workOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderIdentifier() {
        return workOrderIdentifier;
    }

    /**
     * Sets the value of the workOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderIdentifier(String value) {
        this.workOrderIdentifier = value;
    }

}
