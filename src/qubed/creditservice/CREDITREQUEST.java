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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datainformation",
    "creditrequestdata",
    "servicepayment",
    "creditinquiry",
    "creditliability",
    "creditpublicrecord",
    "loanapplication"
})
@XmlRootElement(name = "CREDIT_REQUEST")
public class CREDITREQUEST {

    @XmlAttribute(name = "MISMOVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mismoVersionID;
    @XmlAttribute(name = "LenderCaseIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lenderCaseIdentifier;
    @XmlAttribute(name = "RequestingPartyRequestedByName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String requestingPartyRequestedByName;
    @XmlElement(name = "_DATA_INFORMATION")
    protected DATAINFORMATION datainformation;
    @XmlElement(name = "CREDIT_REQUEST_DATA")
    protected List<CREDITREQUESTDATA> creditrequestdata;
    @XmlElement(name = "SERVICE_PAYMENT")
    protected List<SERVICEPAYMENT> servicepayment;
    @XmlElement(name = "CREDIT_INQUIRY")
    protected List<CREDITINQUIRY> creditinquiry;
    @XmlElement(name = "CREDIT_LIABILITY")
    protected List<CREDITLIABILITY> creditliability;
    @XmlElement(name = "CREDIT_PUBLIC_RECORD")
    protected List<CREDITPUBLICRECORD> creditpublicrecord;
    @XmlElement(name = "LOAN_APPLICATION")
    protected LOANAPPLICATION loanapplication;

    /**
     * Gets the value of the mismoVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISMOVersionID() {
        if (mismoVersionID == null) {
            return "2.3.1";
        } else {
            return mismoVersionID;
        }
    }

    /**
     * Sets the value of the mismoVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISMOVersionID(String value) {
        this.mismoVersionID = value;
    }

    /**
     * Gets the value of the lenderCaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderCaseIdentifier() {
        return lenderCaseIdentifier;
    }

    /**
     * Sets the value of the lenderCaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderCaseIdentifier(String value) {
        this.lenderCaseIdentifier = value;
    }

    /**
     * Gets the value of the requestingPartyRequestedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingPartyRequestedByName() {
        return requestingPartyRequestedByName;
    }

    /**
     * Sets the value of the requestingPartyRequestedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingPartyRequestedByName(String value) {
        this.requestingPartyRequestedByName = value;
    }

    /**
     * Gets the value of the datainformation property.
     * 
     * @return
     *     possible object is
     *     {@link DATAINFORMATION }
     *     
     */
    public DATAINFORMATION getDATAINFORMATION() {
        return datainformation;
    }

    /**
     * Sets the value of the datainformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAINFORMATION }
     *     
     */
    public void setDATAINFORMATION(DATAINFORMATION value) {
        this.datainformation = value;
    }

    /**
     * Gets the value of the creditrequestdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditrequestdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITREQUESTDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITREQUESTDATA }
     * 
     * 
     */
    public List<CREDITREQUESTDATA> getCREDITREQUESTDATA() {
        if (creditrequestdata == null) {
            creditrequestdata = new ArrayList<CREDITREQUESTDATA>();
        }
        return this.creditrequestdata;
    }

    /**
     * Gets the value of the servicepayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicepayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICEPAYMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICEPAYMENT }
     * 
     * 
     */
    public List<SERVICEPAYMENT> getSERVICEPAYMENT() {
        if (servicepayment == null) {
            servicepayment = new ArrayList<SERVICEPAYMENT>();
        }
        return this.servicepayment;
    }

    /**
     * Gets the value of the creditinquiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditinquiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITINQUIRY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITINQUIRY }
     * 
     * 
     */
    public List<CREDITINQUIRY> getCREDITINQUIRY() {
        if (creditinquiry == null) {
            creditinquiry = new ArrayList<CREDITINQUIRY>();
        }
        return this.creditinquiry;
    }

    /**
     * Gets the value of the creditliability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditliability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITLIABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITLIABILITY }
     * 
     * 
     */
    public List<CREDITLIABILITY> getCREDITLIABILITY() {
        if (creditliability == null) {
            creditliability = new ArrayList<CREDITLIABILITY>();
        }
        return this.creditliability;
    }

    /**
     * Gets the value of the creditpublicrecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditpublicrecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITPUBLICRECORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITPUBLICRECORD }
     * 
     * 
     */
    public List<CREDITPUBLICRECORD> getCREDITPUBLICRECORD() {
        if (creditpublicrecord == null) {
            creditpublicrecord = new ArrayList<CREDITPUBLICRECORD>();
        }
        return this.creditpublicrecord;
    }

    /**
     * Gets the value of the loanapplication property.
     * 
     * @return
     *     possible object is
     *     {@link LOANAPPLICATION }
     *     
     */
    public LOANAPPLICATION getLOANAPPLICATION() {
        return loanapplication;
    }

    /**
     * Sets the value of the loanapplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANAPPLICATION }
     *     
     */
    public void setLOANAPPLICATION(LOANAPPLICATION value) {
        this.loanapplication = value;
    }

}
