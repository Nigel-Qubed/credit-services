//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

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
 * The AUDIT_TRAIL_ENTRY_DETAIL element contains data that describes an action performed on the document that affects its state.
 * 
 * <p>Java class for AUDIT_TRAIL_ENTRY_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUDIT_TRAIL_ENTRY_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="EntryDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.mismo.org/residential/2009/schemas}EventEnum" minOccurs="0"/>
 *         &lt;element name="EventTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PerformedByOrganizationName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PerformedBySystemEntryIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PerformedBySystemName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AUDIT_TRAIL_ENTRY_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AUDIT_TRAIL_ENTRY_DETAIL", propOrder = {
    "entryDatetime",
    "entryDescription",
    "eventType",
    "eventTypeOtherDescription",
    "performedByOrganizationName",
    "performedBySystemEntryIdentifier",
    "performedBySystemName",
    "extension"
})
public class AUDITTRAILENTRYDETAIL {

    @XmlElementRef(name = "EntryDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> entryDatetime;
    @XmlElementRef(name = "EntryDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> entryDescription;
    @XmlElementRef(name = "EventType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EventEnum> eventType;
    @XmlElementRef(name = "EventTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> eventTypeOtherDescription;
    @XmlElementRef(name = "PerformedByOrganizationName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> performedByOrganizationName;
    @XmlElementRef(name = "PerformedBySystemEntryIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> performedBySystemEntryIdentifier;
    @XmlElementRef(name = "PerformedBySystemName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> performedBySystemName;
    @XmlElement(name = "EXTENSION")
    protected AUDITTRAILENTRYDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the entryDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public JAXBElement<MISMODatetime> getEntryDatetime() {
        return entryDatetime;
    }

    /**
     * Sets the value of the entryDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public void setEntryDatetime(JAXBElement<MISMODatetime> value) {
        this.entryDatetime = value;
    }

    /**
     * Gets the value of the entryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEntryDescription() {
        return entryDescription;
    }

    /**
     * Sets the value of the entryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEntryDescription(JAXBElement<MISMOString> value) {
        this.entryDescription = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventEnum }{@code >}
     *     
     */
    public JAXBElement<EventEnum> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventEnum }{@code >}
     *     
     */
    public void setEventType(JAXBElement<EventEnum> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEventTypeOtherDescription() {
        return eventTypeOtherDescription;
    }

    /**
     * Sets the value of the eventTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEventTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.eventTypeOtherDescription = value;
    }

    /**
     * Gets the value of the performedByOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPerformedByOrganizationName() {
        return performedByOrganizationName;
    }

    /**
     * Sets the value of the performedByOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPerformedByOrganizationName(JAXBElement<MISMOString> value) {
        this.performedByOrganizationName = value;
    }

    /**
     * Gets the value of the performedBySystemEntryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPerformedBySystemEntryIdentifier() {
        return performedBySystemEntryIdentifier;
    }

    /**
     * Sets the value of the performedBySystemEntryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPerformedBySystemEntryIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.performedBySystemEntryIdentifier = value;
    }

    /**
     * Gets the value of the performedBySystemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPerformedBySystemName() {
        return performedBySystemName;
    }

    /**
     * Sets the value of the performedBySystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPerformedBySystemName(JAXBElement<MISMOString> value) {
        this.performedBySystemName = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AUDITTRAILENTRYDETAILEXTENSION }
     *     
     */
    public AUDITTRAILENTRYDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUDITTRAILENTRYDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(AUDITTRAILENTRYDETAILEXTENSION value) {
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
