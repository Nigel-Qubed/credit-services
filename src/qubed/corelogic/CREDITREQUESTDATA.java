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
 * <p>Java class for CREDIT_REQUEST_DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_REQUEST_DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDITIONAL_END_USERS" type="{http://www.mismo.org/residential/2009/schemas}ADDITIONAL_END_USERS" minOccurs="0"/>
 *         &lt;element name="CREDIT_FREEZE_PINS" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_FREEZE_PINS" minOccurs="0"/>
 *         &lt;element name="CREDIT_REPOSITORY_INCLUDED" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_REPOSITORY_INCLUDED" minOccurs="0"/>
 *         &lt;element name="CREDIT_REQUEST_DATA_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_REQUEST_DATA_DETAIL" minOccurs="0"/>
 *         &lt;element name="CREDIT_SCORE_MODELS" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_MODELS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_REQUEST_DATA_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDIT_REQUEST_DATA", propOrder = {
    "additionalendusers",
    "creditfreezepins",
    "creditrepositoryincluded",
    "creditrequestdatadetail",
    "creditscoremodels",
    "extension"
})
public class CREDITREQUESTDATA {

    @XmlElement(name = "ADDITIONAL_END_USERS")
    protected ADDITIONALENDUSERS additionalendusers;
    @XmlElement(name = "CREDIT_FREEZE_PINS")
    protected CREDITFREEZEPINS creditfreezepins;
    @XmlElement(name = "CREDIT_REPOSITORY_INCLUDED")
    protected CREDITREPOSITORYINCLUDED creditrepositoryincluded;
    @XmlElement(name = "CREDIT_REQUEST_DATA_DETAIL")
    protected CREDITREQUESTDATADETAIL creditrequestdatadetail;
    @XmlElement(name = "CREDIT_SCORE_MODELS")
    protected CREDITSCOREMODELS creditscoremodels;
    @XmlElement(name = "EXTENSION")
    protected CREDITREQUESTDATAEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the additionalendusers property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALENDUSERS }
     *     
     */
    public ADDITIONALENDUSERS getADDITIONALENDUSERS() {
        return additionalendusers;
    }

    /**
     * Sets the value of the additionalendusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALENDUSERS }
     *     
     */
    public void setADDITIONALENDUSERS(ADDITIONALENDUSERS value) {
        this.additionalendusers = value;
    }

    /**
     * Gets the value of the creditfreezepins property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITFREEZEPINS }
     *     
     */
    public CREDITFREEZEPINS getCREDITFREEZEPINS() {
        return creditfreezepins;
    }

    /**
     * Sets the value of the creditfreezepins property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITFREEZEPINS }
     *     
     */
    public void setCREDITFREEZEPINS(CREDITFREEZEPINS value) {
        this.creditfreezepins = value;
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
     * Gets the value of the creditrequestdatadetail property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITREQUESTDATADETAIL }
     *     
     */
    public CREDITREQUESTDATADETAIL getCREDITREQUESTDATADETAIL() {
        return creditrequestdatadetail;
    }

    /**
     * Sets the value of the creditrequestdatadetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITREQUESTDATADETAIL }
     *     
     */
    public void setCREDITREQUESTDATADETAIL(CREDITREQUESTDATADETAIL value) {
        this.creditrequestdatadetail = value;
    }

    /**
     * Gets the value of the creditscoremodels property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREMODELS }
     *     
     */
    public CREDITSCOREMODELS getCREDITSCOREMODELS() {
        return creditscoremodels;
    }

    /**
     * Sets the value of the creditscoremodels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREMODELS }
     *     
     */
    public void setCREDITSCOREMODELS(CREDITSCOREMODELS value) {
        this.creditscoremodels = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITREQUESTDATAEXTENSION }
     *     
     */
    public CREDITREQUESTDATAEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITREQUESTDATAEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITREQUESTDATAEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
