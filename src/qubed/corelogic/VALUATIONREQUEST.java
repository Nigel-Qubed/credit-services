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
 * <p>Java class for VALUATION_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSIGNMENT_PARAMETERS" type="{http://www.mismo.org/residential/2009/schemas}ASSIGNMENT_PARAMETERS" minOccurs="0"/>
 *         &lt;element name="SCOPE_OF_WORK" type="{http://www.mismo.org/residential/2009/schemas}SCOPE_OF_WORK" minOccurs="0"/>
 *         &lt;element name="VALUATION_REQUEST_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REQUEST_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REQUEST_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_REQUEST", propOrder = {
    "assignmentparameters",
    "scopeofwork",
    "valuationrequestdetail",
    "extension"
})
public class VALUATIONREQUEST {

    @XmlElement(name = "ASSIGNMENT_PARAMETERS")
    protected ASSIGNMENTPARAMETERS assignmentparameters;
    @XmlElement(name = "SCOPE_OF_WORK")
    protected SCOPEOFWORK scopeofwork;
    @XmlElement(name = "VALUATION_REQUEST_DETAIL")
    protected VALUATIONREQUESTDETAIL valuationrequestdetail;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONREQUESTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the assignmentparameters property.
     * 
     * @return
     *     possible object is
     *     {@link ASSIGNMENTPARAMETERS }
     *     
     */
    public ASSIGNMENTPARAMETERS getASSIGNMENTPARAMETERS() {
        return assignmentparameters;
    }

    /**
     * Sets the value of the assignmentparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSIGNMENTPARAMETERS }
     *     
     */
    public void setASSIGNMENTPARAMETERS(ASSIGNMENTPARAMETERS value) {
        this.assignmentparameters = value;
    }

    /**
     * Gets the value of the scopeofwork property.
     * 
     * @return
     *     possible object is
     *     {@link SCOPEOFWORK }
     *     
     */
    public SCOPEOFWORK getSCOPEOFWORK() {
        return scopeofwork;
    }

    /**
     * Sets the value of the scopeofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCOPEOFWORK }
     *     
     */
    public void setSCOPEOFWORK(SCOPEOFWORK value) {
        this.scopeofwork = value;
    }

    /**
     * Gets the value of the valuationrequestdetail property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTDETAIL }
     *     
     */
    public VALUATIONREQUESTDETAIL getVALUATIONREQUESTDETAIL() {
        return valuationrequestdetail;
    }

    /**
     * Sets the value of the valuationrequestdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTDETAIL }
     *     
     */
    public void setVALUATIONREQUESTDETAIL(VALUATIONREQUESTDETAIL value) {
        this.valuationrequestdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTEXTENSION }
     *     
     */
    public VALUATIONREQUESTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTEXTENSION }
     *     
     */
    public void setEXTENSION(VALUATIONREQUESTEXTENSION value) {
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
