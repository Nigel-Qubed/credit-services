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
 * Recording information for a document returned by the jurisdiction or as previously recorded reference information in a request. Typically this includes document number, recording date/time and other information based on the jurisdiction.
 * 
 * <p>Java class for RECORDING_ENDORSEMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECORDING_ENDORSEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECORDING_ENDORSEMENT_EXEMPTIONS" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_EXEMPTIONS" minOccurs="0"/>
 *         &lt;element name="RECORDING_ENDORSEMENT_FEES" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_FEES" minOccurs="0"/>
 *         &lt;element name="RECORDING_ENDORSEMENT_INFORMATION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_INFORMATION" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RECORDING_ENDORSEMENT", propOrder = {
    "recordingendorsementexemptions",
    "recordingendorsementfees",
    "recordingendorsementinformation",
    "extension"
})
public class RECORDINGENDORSEMENT {

    @XmlElement(name = "RECORDING_ENDORSEMENT_EXEMPTIONS")
    protected RECORDINGENDORSEMENTEXEMPTIONS recordingendorsementexemptions;
    @XmlElement(name = "RECORDING_ENDORSEMENT_FEES")
    protected RECORDINGENDORSEMENTFEES recordingendorsementfees;
    @XmlElement(name = "RECORDING_ENDORSEMENT_INFORMATION")
    protected RECORDINGENDORSEMENTINFORMATION recordingendorsementinformation;
    @XmlElement(name = "EXTENSION")
    protected RECORDINGENDORSEMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the recordingendorsementexemptions property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONS }
     *     
     */
    public RECORDINGENDORSEMENTEXEMPTIONS getRECORDINGENDORSEMENTEXEMPTIONS() {
        return recordingendorsementexemptions;
    }

    /**
     * Sets the value of the recordingendorsementexemptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTEXEMPTIONS }
     *     
     */
    public void setRECORDINGENDORSEMENTEXEMPTIONS(RECORDINGENDORSEMENTEXEMPTIONS value) {
        this.recordingendorsementexemptions = value;
    }

    /**
     * Gets the value of the recordingendorsementfees property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTFEES }
     *     
     */
    public RECORDINGENDORSEMENTFEES getRECORDINGENDORSEMENTFEES() {
        return recordingendorsementfees;
    }

    /**
     * Sets the value of the recordingendorsementfees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTFEES }
     *     
     */
    public void setRECORDINGENDORSEMENTFEES(RECORDINGENDORSEMENTFEES value) {
        this.recordingendorsementfees = value;
    }

    /**
     * Gets the value of the recordingendorsementinformation property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTINFORMATION }
     *     
     */
    public RECORDINGENDORSEMENTINFORMATION getRECORDINGENDORSEMENTINFORMATION() {
        return recordingendorsementinformation;
    }

    /**
     * Sets the value of the recordingendorsementinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTINFORMATION }
     *     
     */
    public void setRECORDINGENDORSEMENTINFORMATION(RECORDINGENDORSEMENTINFORMATION value) {
        this.recordingendorsementinformation = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTEXTENSION }
     *     
     */
    public RECORDINGENDORSEMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTEXTENSION }
     *     
     */
    public void setEXTENSION(RECORDINGENDORSEMENTEXTENSION value) {
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
