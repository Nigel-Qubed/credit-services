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
 * <p>Java class for FRAUD_ALERT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRAUD_ALERT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSubSectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSubSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertQuestionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertQuestionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertQuestionAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRAUD_ALERT", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "alertId",
    "alertExternalId",
    "alertActive",
    "alertSeverity",
    "alertMessage",
    "alertRecommendation",
    "alertCategory",
    "alertTypeDescription",
    "alertSectionId",
    "alertSectionName",
    "alertSubSectionId",
    "alertSubSectionName",
    "alertQuestionId",
    "alertQuestionDescription",
    "alertQuestionAnswer"
})
public class FRAUDALERT {

    @XmlElement(name = "AlertId")
    protected String alertId;
    @XmlElement(name = "AlertExternalId")
    protected String alertExternalId;
    @XmlElement(name = "AlertActive")
    protected String alertActive;
    @XmlElement(name = "AlertSeverity")
    protected String alertSeverity;
    @XmlElement(name = "AlertMessage")
    protected String alertMessage;
    @XmlElement(name = "AlertRecommendation")
    protected String alertRecommendation;
    @XmlElement(name = "AlertCategory")
    protected String alertCategory;
    @XmlElement(name = "AlertTypeDescription")
    protected String alertTypeDescription;
    @XmlElement(name = "AlertSectionId")
    protected String alertSectionId;
    @XmlElement(name = "AlertSectionName")
    protected String alertSectionName;
    @XmlElement(name = "AlertSubSectionId")
    protected String alertSubSectionId;
    @XmlElement(name = "AlertSubSectionName")
    protected String alertSubSectionName;
    @XmlElement(name = "AlertQuestionId")
    protected String alertQuestionId;
    @XmlElement(name = "AlertQuestionDescription")
    protected String alertQuestionDescription;
    @XmlElement(name = "AlertQuestionAnswer")
    protected String alertQuestionAnswer;

    /**
     * Gets the value of the alertId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertId() {
        return alertId;
    }

    /**
     * Sets the value of the alertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertId(String value) {
        this.alertId = value;
    }

    /**
     * Gets the value of the alertExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertExternalId() {
        return alertExternalId;
    }

    /**
     * Sets the value of the alertExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertExternalId(String value) {
        this.alertExternalId = value;
    }

    /**
     * Gets the value of the alertActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertActive() {
        return alertActive;
    }

    /**
     * Sets the value of the alertActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertActive(String value) {
        this.alertActive = value;
    }

    /**
     * Gets the value of the alertSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSeverity() {
        return alertSeverity;
    }

    /**
     * Sets the value of the alertSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSeverity(String value) {
        this.alertSeverity = value;
    }

    /**
     * Gets the value of the alertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertMessage() {
        return alertMessage;
    }

    /**
     * Sets the value of the alertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertMessage(String value) {
        this.alertMessage = value;
    }

    /**
     * Gets the value of the alertRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertRecommendation() {
        return alertRecommendation;
    }

    /**
     * Sets the value of the alertRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertRecommendation(String value) {
        this.alertRecommendation = value;
    }

    /**
     * Gets the value of the alertCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCategory() {
        return alertCategory;
    }

    /**
     * Sets the value of the alertCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCategory(String value) {
        this.alertCategory = value;
    }

    /**
     * Gets the value of the alertTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertTypeDescription() {
        return alertTypeDescription;
    }

    /**
     * Sets the value of the alertTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertTypeDescription(String value) {
        this.alertTypeDescription = value;
    }

    /**
     * Gets the value of the alertSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSectionId() {
        return alertSectionId;
    }

    /**
     * Sets the value of the alertSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSectionId(String value) {
        this.alertSectionId = value;
    }

    /**
     * Gets the value of the alertSectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSectionName() {
        return alertSectionName;
    }

    /**
     * Sets the value of the alertSectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSectionName(String value) {
        this.alertSectionName = value;
    }

    /**
     * Gets the value of the alertSubSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSubSectionId() {
        return alertSubSectionId;
    }

    /**
     * Sets the value of the alertSubSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSubSectionId(String value) {
        this.alertSubSectionId = value;
    }

    /**
     * Gets the value of the alertSubSectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSubSectionName() {
        return alertSubSectionName;
    }

    /**
     * Sets the value of the alertSubSectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSubSectionName(String value) {
        this.alertSubSectionName = value;
    }

    /**
     * Gets the value of the alertQuestionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertQuestionId() {
        return alertQuestionId;
    }

    /**
     * Sets the value of the alertQuestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertQuestionId(String value) {
        this.alertQuestionId = value;
    }

    /**
     * Gets the value of the alertQuestionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertQuestionDescription() {
        return alertQuestionDescription;
    }

    /**
     * Sets the value of the alertQuestionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertQuestionDescription(String value) {
        this.alertQuestionDescription = value;
    }

    /**
     * Gets the value of the alertQuestionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertQuestionAnswer() {
        return alertQuestionAnswer;
    }

    /**
     * Sets the value of the alertQuestionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertQuestionAnswer(String value) {
        this.alertQuestionAnswer = value;
    }

}