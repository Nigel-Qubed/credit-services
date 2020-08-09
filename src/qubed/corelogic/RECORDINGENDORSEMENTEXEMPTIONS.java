//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Information about one or more types of recording endorsement exemptions. Holds all occurrences of RECORDING_ENDORSEMENT_EXEMPTION.
 * 
 * <p>Java class for RECORDING_ENDORSEMENT_EXEMPTIONS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECORDING_ENDORSEMENT_EXEMPTIONS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECORDING_ENDORSEMENT_EXEMPTION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_EXEMPTION" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RECORDING_ENDORSEMENT_EXEMPTIONS_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_EXEMPTIONS_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_EXEMPTIONS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RECORDING_ENDORSEMENT_EXEMPTIONS", propOrder = {
    "recordingendorsementexemption",
    "recordingendorsementexemptionssummary",
    "extension"
})
public class RECORDINGENDORSEMENTEXEMPTIONS {

    @XmlElement(name = "RECORDING_ENDORSEMENT_EXEMPTION")
    protected List<RECORDINGENDORSEMENTEXEMPTION> recordingendorsementexemption;
    @XmlElement(name = "RECORDING_ENDORSEMENT_EXEMPTIONS_SUMMARY")
    protected RECORDINGENDORSEMENTEXEMPTIONSSUMMARY recordingendorsementexemptionssummary;
    @XmlElement(name = "EXTENSION")
    protected RECORDINGENDORSEMENTEXEMPTIONSEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the recordingendorsementexemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordingendorsementexemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECORDINGENDORSEMENTEXEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECORDINGENDORSEMENTEXEMPTION }
     * 
     * 
     */
    public List<RECORDINGENDORSEMENTEXEMPTION> getRECORDINGENDORSEMENTEXEMPTION() {
        if (recordingendorsementexemption == null) {
            recordingendorsementexemption = new ArrayList<RECORDINGENDORSEMENTEXEMPTION>();
        }
        return this.recordingendorsementexemption;
    }

    /**
     * Gets the value of the recordingendorsementexemptionssummary property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONSSUMMARY }
     *     
     */
    public RECORDINGENDORSEMENTEXEMPTIONSSUMMARY getRECORDINGENDORSEMENTEXEMPTIONSSUMMARY() {
        return recordingendorsementexemptionssummary;
    }

    /**
     * Sets the value of the recordingendorsementexemptionssummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONSSUMMARY }
     *     
     */
    public void setRECORDINGENDORSEMENTEXEMPTIONSSUMMARY(RECORDINGENDORSEMENTEXEMPTIONSSUMMARY value) {
        this.recordingendorsementexemptionssummary = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONSEXTENSION }
     *     
     */
    public RECORDINGENDORSEMENTEXEMPTIONSEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONSEXTENSION }
     *     
     */
    public void setEXTENSION(RECORDINGENDORSEMENTEXEMPTIONSEXTENSION value) {
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