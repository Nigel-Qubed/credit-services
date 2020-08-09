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
 * <p>Java class for GENERAL_IDENTIFIER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENERAL_IDENTIFIER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CongressionalDistrictIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="CoreBasedStatisticalAreaCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CoreBasedStatisticalAreaDivisionCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="JudicialDistrictName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="JudicialDivisionName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MapReferenceIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MapReferenceSecondIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MetropolitanDivisionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MSAIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MunicipalityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RecordingJurisdictionName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RecordingJurisdictionType" type="{http://www.mismo.org/residential/2009/schemas}RecordingJurisdictionEnum" minOccurs="0"/>
 *         &lt;element name="RecordingJurisdictionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SchoolDistrictName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UnincorporatedAreaName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}GENERAL_IDENTIFIER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "GENERAL_IDENTIFIER", propOrder = {
    "congressionalDistrictIdentifier",
    "coreBasedStatisticalAreaCode",
    "coreBasedStatisticalAreaDivisionCode",
    "judicialDistrictName",
    "judicialDivisionName",
    "mapReferenceIdentifier",
    "mapReferenceSecondIdentifier",
    "metropolitanDivisionIdentifier",
    "msaIdentifier",
    "municipalityName",
    "recordingJurisdictionName",
    "recordingJurisdictionType",
    "recordingJurisdictionTypeOtherDescription",
    "schoolDistrictName",
    "unincorporatedAreaName",
    "extension"
})
public class GENERALIDENTIFIER {

    @XmlElementRef(name = "CongressionalDistrictIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> congressionalDistrictIdentifier;
    @XmlElementRef(name = "CoreBasedStatisticalAreaCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> coreBasedStatisticalAreaCode;
    @XmlElementRef(name = "CoreBasedStatisticalAreaDivisionCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> coreBasedStatisticalAreaDivisionCode;
    @XmlElementRef(name = "JudicialDistrictName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> judicialDistrictName;
    @XmlElementRef(name = "JudicialDivisionName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> judicialDivisionName;
    @XmlElementRef(name = "MapReferenceIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mapReferenceIdentifier;
    @XmlElementRef(name = "MapReferenceSecondIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mapReferenceSecondIdentifier;
    @XmlElementRef(name = "MetropolitanDivisionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> metropolitanDivisionIdentifier;
    @XmlElementRef(name = "MSAIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> msaIdentifier;
    @XmlElementRef(name = "MunicipalityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> municipalityName;
    @XmlElementRef(name = "RecordingJurisdictionName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> recordingJurisdictionName;
    @XmlElementRef(name = "RecordingJurisdictionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RecordingJurisdictionEnum> recordingJurisdictionType;
    @XmlElementRef(name = "RecordingJurisdictionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> recordingJurisdictionTypeOtherDescription;
    @XmlElementRef(name = "SchoolDistrictName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> schoolDistrictName;
    @XmlElementRef(name = "UnincorporatedAreaName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> unincorporatedAreaName;
    @XmlElement(name = "EXTENSION")
    protected GENERALIDENTIFIEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the congressionalDistrictIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getCongressionalDistrictIdentifier() {
        return congressionalDistrictIdentifier;
    }

    /**
     * Sets the value of the congressionalDistrictIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setCongressionalDistrictIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.congressionalDistrictIdentifier = value;
    }

    /**
     * Gets the value of the coreBasedStatisticalAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCoreBasedStatisticalAreaCode() {
        return coreBasedStatisticalAreaCode;
    }

    /**
     * Sets the value of the coreBasedStatisticalAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCoreBasedStatisticalAreaCode(JAXBElement<MISMOCode> value) {
        this.coreBasedStatisticalAreaCode = value;
    }

    /**
     * Gets the value of the coreBasedStatisticalAreaDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCoreBasedStatisticalAreaDivisionCode() {
        return coreBasedStatisticalAreaDivisionCode;
    }

    /**
     * Sets the value of the coreBasedStatisticalAreaDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCoreBasedStatisticalAreaDivisionCode(JAXBElement<MISMOCode> value) {
        this.coreBasedStatisticalAreaDivisionCode = value;
    }

    /**
     * Gets the value of the judicialDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getJudicialDistrictName() {
        return judicialDistrictName;
    }

    /**
     * Sets the value of the judicialDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setJudicialDistrictName(JAXBElement<MISMOString> value) {
        this.judicialDistrictName = value;
    }

    /**
     * Gets the value of the judicialDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getJudicialDivisionName() {
        return judicialDivisionName;
    }

    /**
     * Sets the value of the judicialDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setJudicialDivisionName(JAXBElement<MISMOString> value) {
        this.judicialDivisionName = value;
    }

    /**
     * Gets the value of the mapReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMapReferenceIdentifier() {
        return mapReferenceIdentifier;
    }

    /**
     * Sets the value of the mapReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMapReferenceIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mapReferenceIdentifier = value;
    }

    /**
     * Gets the value of the mapReferenceSecondIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMapReferenceSecondIdentifier() {
        return mapReferenceSecondIdentifier;
    }

    /**
     * Sets the value of the mapReferenceSecondIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMapReferenceSecondIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mapReferenceSecondIdentifier = value;
    }

    /**
     * Gets the value of the metropolitanDivisionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMetropolitanDivisionIdentifier() {
        return metropolitanDivisionIdentifier;
    }

    /**
     * Sets the value of the metropolitanDivisionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMetropolitanDivisionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.metropolitanDivisionIdentifier = value;
    }

    /**
     * Gets the value of the msaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMSAIdentifier() {
        return msaIdentifier;
    }

    /**
     * Sets the value of the msaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMSAIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.msaIdentifier = value;
    }

    /**
     * Gets the value of the municipalityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Sets the value of the municipalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMunicipalityName(JAXBElement<MISMOString> value) {
        this.municipalityName = value;
    }

    /**
     * Gets the value of the recordingJurisdictionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRecordingJurisdictionName() {
        return recordingJurisdictionName;
    }

    /**
     * Sets the value of the recordingJurisdictionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRecordingJurisdictionName(JAXBElement<MISMOString> value) {
        this.recordingJurisdictionName = value;
    }

    /**
     * Gets the value of the recordingJurisdictionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecordingJurisdictionEnum }{@code >}
     *     
     */
    public JAXBElement<RecordingJurisdictionEnum> getRecordingJurisdictionType() {
        return recordingJurisdictionType;
    }

    /**
     * Sets the value of the recordingJurisdictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecordingJurisdictionEnum }{@code >}
     *     
     */
    public void setRecordingJurisdictionType(JAXBElement<RecordingJurisdictionEnum> value) {
        this.recordingJurisdictionType = value;
    }

    /**
     * Gets the value of the recordingJurisdictionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRecordingJurisdictionTypeOtherDescription() {
        return recordingJurisdictionTypeOtherDescription;
    }

    /**
     * Sets the value of the recordingJurisdictionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRecordingJurisdictionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.recordingJurisdictionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the schoolDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSchoolDistrictName() {
        return schoolDistrictName;
    }

    /**
     * Sets the value of the schoolDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSchoolDistrictName(JAXBElement<MISMOString> value) {
        this.schoolDistrictName = value;
    }

    /**
     * Gets the value of the unincorporatedAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getUnincorporatedAreaName() {
        return unincorporatedAreaName;
    }

    /**
     * Sets the value of the unincorporatedAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setUnincorporatedAreaName(JAXBElement<MISMOString> value) {
        this.unincorporatedAreaName = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link GENERALIDENTIFIEREXTENSION }
     *     
     */
    public GENERALIDENTIFIEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GENERALIDENTIFIEREXTENSION }
     *     
     */
    public void setEXTENSION(GENERALIDENTIFIEREXTENSION value) {
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