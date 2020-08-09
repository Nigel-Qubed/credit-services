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
 * The FIELD_REFERENCE type is a group of XML fields used for identifying the area of the view described by a VIEW_FIELD element. The preferred method is to use the FieldPlaceHolderIdentifier. When that is not supported by the view format, then the field is identified by its XY coordinates using the other elements in this XML type.
 * 
 * <p>Java class for FIELD_REFERENCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIELD_REFERENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldHeightNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="FieldPlaceholderIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="FieldWidthNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="MeasurementUnitType" type="{http://www.mismo.org/residential/2009/schemas}MeasurementUnitEnum" minOccurs="0"/>
 *         &lt;element name="OffsetFromLeftNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="OffsetFromTopNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="PageNumberValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FIELD_REFERENCE", propOrder = {
    "fieldHeightNumber",
    "fieldPlaceholderIdentifier",
    "fieldWidthNumber",
    "measurementUnitType",
    "offsetFromLeftNumber",
    "offsetFromTopNumber",
    "pageNumberValue",
    "extension"
})
public class FIELDREFERENCE {

    @XmlElementRef(name = "FieldHeightNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> fieldHeightNumber;
    @XmlElementRef(name = "FieldPlaceholderIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> fieldPlaceholderIdentifier;
    @XmlElementRef(name = "FieldWidthNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> fieldWidthNumber;
    @XmlElementRef(name = "MeasurementUnitType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementUnitEnum> measurementUnitType;
    @XmlElementRef(name = "OffsetFromLeftNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> offsetFromLeftNumber;
    @XmlElementRef(name = "OffsetFromTopNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> offsetFromTopNumber;
    @XmlElementRef(name = "PageNumberValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> pageNumberValue;
    @XmlElement(name = "EXTENSION")
    protected FIELDREFERENCEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the fieldHeightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getFieldHeightNumber() {
        return fieldHeightNumber;
    }

    /**
     * Sets the value of the fieldHeightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setFieldHeightNumber(JAXBElement<MISMONumeric> value) {
        this.fieldHeightNumber = value;
    }

    /**
     * Gets the value of the fieldPlaceholderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getFieldPlaceholderIdentifier() {
        return fieldPlaceholderIdentifier;
    }

    /**
     * Sets the value of the fieldPlaceholderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setFieldPlaceholderIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.fieldPlaceholderIdentifier = value;
    }

    /**
     * Gets the value of the fieldWidthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getFieldWidthNumber() {
        return fieldWidthNumber;
    }

    /**
     * Sets the value of the fieldWidthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setFieldWidthNumber(JAXBElement<MISMONumeric> value) {
        this.fieldWidthNumber = value;
    }

    /**
     * Gets the value of the measurementUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasurementUnitEnum }{@code >}
     *     
     */
    public JAXBElement<MeasurementUnitEnum> getMeasurementUnitType() {
        return measurementUnitType;
    }

    /**
     * Sets the value of the measurementUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasurementUnitEnum }{@code >}
     *     
     */
    public void setMeasurementUnitType(JAXBElement<MeasurementUnitEnum> value) {
        this.measurementUnitType = value;
    }

    /**
     * Gets the value of the offsetFromLeftNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getOffsetFromLeftNumber() {
        return offsetFromLeftNumber;
    }

    /**
     * Sets the value of the offsetFromLeftNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setOffsetFromLeftNumber(JAXBElement<MISMONumeric> value) {
        this.offsetFromLeftNumber = value;
    }

    /**
     * Gets the value of the offsetFromTopNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getOffsetFromTopNumber() {
        return offsetFromTopNumber;
    }

    /**
     * Sets the value of the offsetFromTopNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setOffsetFromTopNumber(JAXBElement<MISMONumeric> value) {
        this.offsetFromTopNumber = value;
    }

    /**
     * Gets the value of the pageNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getPageNumberValue() {
        return pageNumberValue;
    }

    /**
     * Sets the value of the pageNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setPageNumberValue(JAXBElement<MISMOValue> value) {
        this.pageNumberValue = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCEEXTENSION }
     *     
     */
    public FIELDREFERENCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCEEXTENSION }
     *     
     */
    public void setEXTENSION(FIELDREFERENCEEXTENSION value) {
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