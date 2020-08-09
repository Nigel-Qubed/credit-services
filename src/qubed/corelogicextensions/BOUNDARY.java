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
 * Describes the closed area of a location, neighborhood or market with definitive demarcation.
 * 
 * <p>Java class for BOUNDARY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOUNDARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundaryDirectionType" type="{http://www.mismo.org/residential/2009/schemas}BoundaryDirectionEnum" minOccurs="0"/>
 *         &lt;element name="BoundaryDirectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BoundaryGeospatialCoordinatesDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BoundaryType" type="{http://www.mismo.org/residential/2009/schemas}BoundaryEnum" minOccurs="0"/>
 *         &lt;element name="BoundaryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BOUNDARY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BOUNDARY", propOrder = {
    "boundaryDirectionType",
    "boundaryDirectionTypeOtherDescription",
    "boundaryGeospatialCoordinatesDescription",
    "boundaryType",
    "boundaryTypeOtherDescription",
    "extension"
})
public class BOUNDARY {

    @XmlElementRef(name = "BoundaryDirectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BoundaryDirectionEnum> boundaryDirectionType;
    @XmlElementRef(name = "BoundaryDirectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> boundaryDirectionTypeOtherDescription;
    @XmlElementRef(name = "BoundaryGeospatialCoordinatesDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> boundaryGeospatialCoordinatesDescription;
    @XmlElementRef(name = "BoundaryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BoundaryEnum> boundaryType;
    @XmlElementRef(name = "BoundaryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> boundaryTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected BOUNDARYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the boundaryDirectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BoundaryDirectionEnum }{@code >}
     *     
     */
    public JAXBElement<BoundaryDirectionEnum> getBoundaryDirectionType() {
        return boundaryDirectionType;
    }

    /**
     * Sets the value of the boundaryDirectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BoundaryDirectionEnum }{@code >}
     *     
     */
    public void setBoundaryDirectionType(JAXBElement<BoundaryDirectionEnum> value) {
        this.boundaryDirectionType = value;
    }

    /**
     * Gets the value of the boundaryDirectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBoundaryDirectionTypeOtherDescription() {
        return boundaryDirectionTypeOtherDescription;
    }

    /**
     * Sets the value of the boundaryDirectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBoundaryDirectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.boundaryDirectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the boundaryGeospatialCoordinatesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBoundaryGeospatialCoordinatesDescription() {
        return boundaryGeospatialCoordinatesDescription;
    }

    /**
     * Sets the value of the boundaryGeospatialCoordinatesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBoundaryGeospatialCoordinatesDescription(JAXBElement<MISMOString> value) {
        this.boundaryGeospatialCoordinatesDescription = value;
    }

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BoundaryEnum }{@code >}
     *     
     */
    public JAXBElement<BoundaryEnum> getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BoundaryEnum }{@code >}
     *     
     */
    public void setBoundaryType(JAXBElement<BoundaryEnum> value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the boundaryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBoundaryTypeOtherDescription() {
        return boundaryTypeOtherDescription;
    }

    /**
     * Sets the value of the boundaryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBoundaryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.boundaryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BOUNDARYEXTENSION }
     *     
     */
    public BOUNDARYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOUNDARYEXTENSION }
     *     
     */
    public void setEXTENSION(BOUNDARYEXTENSION value) {
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
