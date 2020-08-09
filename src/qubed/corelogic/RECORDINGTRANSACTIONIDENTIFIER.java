//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Uniquely identifies this transaction and other information to be used in subsequent requests and responses.
 * 
 * <p>Java class for RECORDING_TRANSACTION_IDENTIFIER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECORDING_TRANSACTION_IDENTIFIER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordingTransactionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="RecordingTransactionIdentifierType" type="{http://www.mismo.org/residential/2009/schemas}RecordingTransactionIdentifierEnum" minOccurs="0"/>
 *         &lt;element name="RecordingTransactionIdentifierTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_TRANSACTION_IDENTIFIER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RECORDING_TRANSACTION_IDENTIFIER", propOrder = {
    "recordingTransactionIdentifier",
    "recordingTransactionIdentifierType",
    "recordingTransactionIdentifierTypeOtherDescription",
    "extension"
})
public class RECORDINGTRANSACTIONIDENTIFIER {

    @XmlElementRef(name = "RecordingTransactionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> recordingTransactionIdentifier;
    @XmlElementRef(name = "RecordingTransactionIdentifierType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RecordingTransactionIdentifierEnum> recordingTransactionIdentifierType;
    @XmlElementRef(name = "RecordingTransactionIdentifierTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> recordingTransactionIdentifierTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected RECORDINGTRANSACTIONIDENTIFIEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the recordingTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getRecordingTransactionIdentifier() {
        return recordingTransactionIdentifier;
    }

    /**
     * Sets the value of the recordingTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setRecordingTransactionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.recordingTransactionIdentifier = value;
    }

    /**
     * Gets the value of the recordingTransactionIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecordingTransactionIdentifierEnum }{@code >}
     *     
     */
    public JAXBElement<RecordingTransactionIdentifierEnum> getRecordingTransactionIdentifierType() {
        return recordingTransactionIdentifierType;
    }

    /**
     * Sets the value of the recordingTransactionIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecordingTransactionIdentifierEnum }{@code >}
     *     
     */
    public void setRecordingTransactionIdentifierType(JAXBElement<RecordingTransactionIdentifierEnum> value) {
        this.recordingTransactionIdentifierType = value;
    }

    /**
     * Gets the value of the recordingTransactionIdentifierTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRecordingTransactionIdentifierTypeOtherDescription() {
        return recordingTransactionIdentifierTypeOtherDescription;
    }

    /**
     * Sets the value of the recordingTransactionIdentifierTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRecordingTransactionIdentifierTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.recordingTransactionIdentifierTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGTRANSACTIONIDENTIFIEREXTENSION }
     *     
     */
    public RECORDINGTRANSACTIONIDENTIFIEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGTRANSACTIONIDENTIFIEREXTENSION }
     *     
     */
    public void setEXTENSION(RECORDINGTRANSACTIONIDENTIFIEREXTENSION value) {
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
