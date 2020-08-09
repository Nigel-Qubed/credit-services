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
 * A collection of information pertaining to revisions about the closing event, instructions, or documents.
 * 
 * <p>Java class for CLOSING_INFORMATION_REVISION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_INFORMATION_REVISION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosingInformationRevisionInstructionsText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ClosingInformationRevisionReasonType" type="{http://www.mismo.org/residential/2009/schemas}ClosingInformationRevisionReasonEnum" minOccurs="0"/>
 *         &lt;element name="ClosingInformationRevisionReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_INFORMATION_REVISION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "CLOSING_INFORMATION_REVISION", propOrder = {
    "closingInformationRevisionInstructionsText",
    "closingInformationRevisionReasonType",
    "closingInformationRevisionReasonTypeOtherDescription",
    "extension"
})
public class CLOSINGINFORMATIONREVISION {

    @XmlElementRef(name = "ClosingInformationRevisionInstructionsText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> closingInformationRevisionInstructionsText;
    @XmlElementRef(name = "ClosingInformationRevisionReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosingInformationRevisionReasonEnum> closingInformationRevisionReasonType;
    @XmlElementRef(name = "ClosingInformationRevisionReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> closingInformationRevisionReasonTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGINFORMATIONREVISIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingInformationRevisionInstructionsText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getClosingInformationRevisionInstructionsText() {
        return closingInformationRevisionInstructionsText;
    }

    /**
     * Sets the value of the closingInformationRevisionInstructionsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setClosingInformationRevisionInstructionsText(JAXBElement<MISMOString> value) {
        this.closingInformationRevisionInstructionsText = value;
    }

    /**
     * Gets the value of the closingInformationRevisionReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosingInformationRevisionReasonEnum }{@code >}
     *     
     */
    public JAXBElement<ClosingInformationRevisionReasonEnum> getClosingInformationRevisionReasonType() {
        return closingInformationRevisionReasonType;
    }

    /**
     * Sets the value of the closingInformationRevisionReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosingInformationRevisionReasonEnum }{@code >}
     *     
     */
    public void setClosingInformationRevisionReasonType(JAXBElement<ClosingInformationRevisionReasonEnum> value) {
        this.closingInformationRevisionReasonType = value;
    }

    /**
     * Gets the value of the closingInformationRevisionReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getClosingInformationRevisionReasonTypeOtherDescription() {
        return closingInformationRevisionReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the closingInformationRevisionReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setClosingInformationRevisionReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.closingInformationRevisionReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGINFORMATIONREVISIONEXTENSION }
     *     
     */
    public CLOSINGINFORMATIONREVISIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGINFORMATIONREVISIONEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGINFORMATIONREVISIONEXTENSION value) {
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
