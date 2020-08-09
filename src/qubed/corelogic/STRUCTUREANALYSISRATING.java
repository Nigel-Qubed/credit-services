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
 * <p>Java class for STRUCTURE_ANALYSIS_RATING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRUCTURE_ANALYSIS_RATING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="StructureAnalysisRatingCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StructureAnalysisRatingItemType" type="{http://www.mismo.org/residential/2009/schemas}StructureAnalysisRatingItemEnum" minOccurs="0"/>
 *         &lt;element name="StructureAnalysisRatingItemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}STRUCTURE_ANALYSIS_RATING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "STRUCTURE_ANALYSIS_RATING", propOrder = {
    "conditionRatingType",
    "structureAnalysisRatingCommentDescription",
    "structureAnalysisRatingItemType",
    "structureAnalysisRatingItemTypeOtherDescription",
    "extension"
})
public class STRUCTUREANALYSISRATING {

    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "StructureAnalysisRatingCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> structureAnalysisRatingCommentDescription;
    @XmlElementRef(name = "StructureAnalysisRatingItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<StructureAnalysisRatingItemEnum> structureAnalysisRatingItemType;
    @XmlElementRef(name = "StructureAnalysisRatingItemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> structureAnalysisRatingItemTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected STRUCTUREANALYSISRATINGEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the conditionRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public JAXBElement<ConditionRatingEnum> getConditionRatingType() {
        return conditionRatingType;
    }

    /**
     * Sets the value of the conditionRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public void setConditionRatingType(JAXBElement<ConditionRatingEnum> value) {
        this.conditionRatingType = value;
    }

    /**
     * Gets the value of the structureAnalysisRatingCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStructureAnalysisRatingCommentDescription() {
        return structureAnalysisRatingCommentDescription;
    }

    /**
     * Sets the value of the structureAnalysisRatingCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStructureAnalysisRatingCommentDescription(JAXBElement<MISMOString> value) {
        this.structureAnalysisRatingCommentDescription = value;
    }

    /**
     * Gets the value of the structureAnalysisRatingItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StructureAnalysisRatingItemEnum }{@code >}
     *     
     */
    public JAXBElement<StructureAnalysisRatingItemEnum> getStructureAnalysisRatingItemType() {
        return structureAnalysisRatingItemType;
    }

    /**
     * Sets the value of the structureAnalysisRatingItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StructureAnalysisRatingItemEnum }{@code >}
     *     
     */
    public void setStructureAnalysisRatingItemType(JAXBElement<StructureAnalysisRatingItemEnum> value) {
        this.structureAnalysisRatingItemType = value;
    }

    /**
     * Gets the value of the structureAnalysisRatingItemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStructureAnalysisRatingItemTypeOtherDescription() {
        return structureAnalysisRatingItemTypeOtherDescription;
    }

    /**
     * Sets the value of the structureAnalysisRatingItemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStructureAnalysisRatingItemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.structureAnalysisRatingItemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link STRUCTUREANALYSISRATINGEXTENSION }
     *     
     */
    public STRUCTUREANALYSISRATINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTUREANALYSISRATINGEXTENSION }
     *     
     */
    public void setEXTENSION(STRUCTUREANALYSISRATINGEXTENSION value) {
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
