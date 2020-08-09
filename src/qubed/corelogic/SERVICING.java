//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

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
 * Loan level information on the servicing of the loan.
 * 
 * <p>Java class for SERVICING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADVANCES" type="{http://www.mismo.org/residential/2009/schemas}ADVANCES" minOccurs="0"/>
 *         &lt;element name="CREDIT_BUREAU_REPORTING" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_BUREAU_REPORTING" minOccurs="0"/>
 *         &lt;element name="DELINQUENCIES" type="{http://www.mismo.org/residential/2009/schemas}DELINQUENCIES" minOccurs="0"/>
 *         &lt;element name="DISCLOSURE_ON_SERVICER" type="{http://www.mismo.org/residential/2009/schemas}DISCLOSURE_ON_SERVICER" minOccurs="0"/>
 *         &lt;element name="MONETARY_EVENT_SUMMARIES" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENT_SUMMARIES" minOccurs="0"/>
 *         &lt;element name="MONETARY_EVENTS" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENTS" minOccurs="0"/>
 *         &lt;element name="SERVICER_QUALIFIED_WRITTEN_REQUEST_MAIL_TO" type="{http://www.mismo.org/residential/2009/schemas}SERVICER_QUALIFIED_WRITTEN_REQUEST_MAIL_TO" minOccurs="0"/>
 *         &lt;element name="SERVICING_COMMENTS" type="{http://www.mismo.org/residential/2009/schemas}SERVICING_COMMENTS" minOccurs="0"/>
 *         &lt;element name="SERVICING_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SERVICING_DETAIL" minOccurs="0"/>
 *         &lt;element name="STOP_CODES" type="{http://www.mismo.org/residential/2009/schemas}STOP_CODES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVICING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVICING", propOrder = {
    "advances",
    "creditbureaureporting",
    "delinquencies",
    "disclosureonservicer",
    "monetaryeventsummaries",
    "monetaryevents",
    "servicerqualifiedwrittenrequestmailto",
    "servicingcomments",
    "servicingdetail",
    "stopcodes",
    "extension"
})
public class SERVICING {

    @XmlElement(name = "ADVANCES")
    protected ADVANCES advances;
    @XmlElement(name = "CREDIT_BUREAU_REPORTING")
    protected CREDITBUREAUREPORTING creditbureaureporting;
    @XmlElement(name = "DELINQUENCIES")
    protected DELINQUENCIES delinquencies;
    @XmlElement(name = "DISCLOSURE_ON_SERVICER")
    protected DISCLOSUREONSERVICER disclosureonservicer;
    @XmlElement(name = "MONETARY_EVENT_SUMMARIES")
    protected MONETARYEVENTSUMMARIES monetaryeventsummaries;
    @XmlElement(name = "MONETARY_EVENTS")
    protected MONETARYEVENTS monetaryevents;
    @XmlElement(name = "SERVICER_QUALIFIED_WRITTEN_REQUEST_MAIL_TO")
    protected SERVICERQUALIFIEDWRITTENREQUESTMAILTO servicerqualifiedwrittenrequestmailto;
    @XmlElement(name = "SERVICING_COMMENTS")
    protected SERVICINGCOMMENTS servicingcomments;
    @XmlElement(name = "SERVICING_DETAIL")
    protected SERVICINGDETAIL servicingdetail;
    @XmlElement(name = "STOP_CODES")
    protected STOPCODES stopcodes;
    @XmlElement(name = "EXTENSION")
    protected SERVICINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the advances property.
     * 
     * @return
     *     possible object is
     *     {@link ADVANCES }
     *     
     */
    public ADVANCES getADVANCES() {
        return advances;
    }

    /**
     * Sets the value of the advances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVANCES }
     *     
     */
    public void setADVANCES(ADVANCES value) {
        this.advances = value;
    }

    /**
     * Gets the value of the creditbureaureporting property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITBUREAUREPORTING }
     *     
     */
    public CREDITBUREAUREPORTING getCREDITBUREAUREPORTING() {
        return creditbureaureporting;
    }

    /**
     * Sets the value of the creditbureaureporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITBUREAUREPORTING }
     *     
     */
    public void setCREDITBUREAUREPORTING(CREDITBUREAUREPORTING value) {
        this.creditbureaureporting = value;
    }

    /**
     * Gets the value of the delinquencies property.
     * 
     * @return
     *     possible object is
     *     {@link DELINQUENCIES }
     *     
     */
    public DELINQUENCIES getDELINQUENCIES() {
        return delinquencies;
    }

    /**
     * Sets the value of the delinquencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELINQUENCIES }
     *     
     */
    public void setDELINQUENCIES(DELINQUENCIES value) {
        this.delinquencies = value;
    }

    /**
     * Gets the value of the disclosureonservicer property.
     * 
     * @return
     *     possible object is
     *     {@link DISCLOSUREONSERVICER }
     *     
     */
    public DISCLOSUREONSERVICER getDISCLOSUREONSERVICER() {
        return disclosureonservicer;
    }

    /**
     * Sets the value of the disclosureonservicer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCLOSUREONSERVICER }
     *     
     */
    public void setDISCLOSUREONSERVICER(DISCLOSUREONSERVICER value) {
        this.disclosureonservicer = value;
    }

    /**
     * Gets the value of the monetaryeventsummaries property.
     * 
     * @return
     *     possible object is
     *     {@link MONETARYEVENTSUMMARIES }
     *     
     */
    public MONETARYEVENTSUMMARIES getMONETARYEVENTSUMMARIES() {
        return monetaryeventsummaries;
    }

    /**
     * Sets the value of the monetaryeventsummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTSUMMARIES }
     *     
     */
    public void setMONETARYEVENTSUMMARIES(MONETARYEVENTSUMMARIES value) {
        this.monetaryeventsummaries = value;
    }

    /**
     * Gets the value of the monetaryevents property.
     * 
     * @return
     *     possible object is
     *     {@link MONETARYEVENTS }
     *     
     */
    public MONETARYEVENTS getMONETARYEVENTS() {
        return monetaryevents;
    }

    /**
     * Sets the value of the monetaryevents property.
     * 
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTS }
     *     
     */
    public void setMONETARYEVENTS(MONETARYEVENTS value) {
        this.monetaryevents = value;
    }

    /**
     * Gets the value of the servicerqualifiedwrittenrequestmailto property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICERQUALIFIEDWRITTENREQUESTMAILTO }
     *     
     */
    public SERVICERQUALIFIEDWRITTENREQUESTMAILTO getSERVICERQUALIFIEDWRITTENREQUESTMAILTO() {
        return servicerqualifiedwrittenrequestmailto;
    }

    /**
     * Sets the value of the servicerqualifiedwrittenrequestmailto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICERQUALIFIEDWRITTENREQUESTMAILTO }
     *     
     */
    public void setSERVICERQUALIFIEDWRITTENREQUESTMAILTO(SERVICERQUALIFIEDWRITTENREQUESTMAILTO value) {
        this.servicerqualifiedwrittenrequestmailto = value;
    }

    /**
     * Gets the value of the servicingcomments property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICINGCOMMENTS }
     *     
     */
    public SERVICINGCOMMENTS getSERVICINGCOMMENTS() {
        return servicingcomments;
    }

    /**
     * Sets the value of the servicingcomments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICINGCOMMENTS }
     *     
     */
    public void setSERVICINGCOMMENTS(SERVICINGCOMMENTS value) {
        this.servicingcomments = value;
    }

    /**
     * Gets the value of the servicingdetail property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICINGDETAIL }
     *     
     */
    public SERVICINGDETAIL getSERVICINGDETAIL() {
        return servicingdetail;
    }

    /**
     * Sets the value of the servicingdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICINGDETAIL }
     *     
     */
    public void setSERVICINGDETAIL(SERVICINGDETAIL value) {
        this.servicingdetail = value;
    }

    /**
     * Gets the value of the stopcodes property.
     * 
     * @return
     *     possible object is
     *     {@link STOPCODES }
     *     
     */
    public STOPCODES getSTOPCODES() {
        return stopcodes;
    }

    /**
     * Sets the value of the stopcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPCODES }
     *     
     */
    public void setSTOPCODES(STOPCODES value) {
        this.stopcodes = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICINGEXTENSION }
     *     
     */
    public SERVICINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICINGEXTENSION }
     *     
     */
    public void setEXTENSION(SERVICINGEXTENSION value) {
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
