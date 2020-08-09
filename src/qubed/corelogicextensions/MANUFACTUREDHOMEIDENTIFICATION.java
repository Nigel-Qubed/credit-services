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
 * Information regarding the source of identification, identification numbers and other facts about the manufactured home identification.
 * 
 * <p>Java class for MANUFACTURED_HOME_IDENTIFICATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MANUFACTURED_HOME_IDENTIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManufacturedHomeBuiltStateName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ManufacturedHomeCostDataCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ManufacturedHomeRegionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideBlackPageIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideConversionChartPageIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideEditionMonth" type="{http://www.mismo.org/residential/2009/schemas}MISMOMonth" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideEditionYear" type="{http://www.mismo.org/residential/2009/schemas}MISMOYear" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideGreyPageIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideWhitePageIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="NADAManufacturedHousingGuideYellowPageIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME_IDENTIFICATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MANUFACTURED_HOME_IDENTIFICATION", propOrder = {
    "manufacturedHomeBuiltStateName",
    "manufacturedHomeCostDataCommentDescription",
    "manufacturedHomeRegionIdentifier",
    "nadaManufacturedHousingGuideBlackPageIdentifier",
    "nadaManufacturedHousingGuideConversionChartPageIdentifier",
    "nadaManufacturedHousingGuideEditionMonth",
    "nadaManufacturedHousingGuideEditionYear",
    "nadaManufacturedHousingGuideGreyPageIdentifier",
    "nadaManufacturedHousingGuideWhitePageIdentifier",
    "nadaManufacturedHousingGuideYellowPageIdentifier",
    "extension"
})
public class MANUFACTUREDHOMEIDENTIFICATION {

    @XmlElementRef(name = "ManufacturedHomeBuiltStateName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> manufacturedHomeBuiltStateName;
    @XmlElementRef(name = "ManufacturedHomeCostDataCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> manufacturedHomeCostDataCommentDescription;
    @XmlElementRef(name = "ManufacturedHomeRegionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> manufacturedHomeRegionIdentifier;
    @XmlElementRef(name = "NADAManufacturedHousingGuideBlackPageIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> nadaManufacturedHousingGuideBlackPageIdentifier;
    @XmlElementRef(name = "NADAManufacturedHousingGuideConversionChartPageIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> nadaManufacturedHousingGuideConversionChartPageIdentifier;
    @XmlElementRef(name = "NADAManufacturedHousingGuideEditionMonth", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOMonth> nadaManufacturedHousingGuideEditionMonth;
    @XmlElementRef(name = "NADAManufacturedHousingGuideEditionYear", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOYear> nadaManufacturedHousingGuideEditionYear;
    @XmlElementRef(name = "NADAManufacturedHousingGuideGreyPageIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> nadaManufacturedHousingGuideGreyPageIdentifier;
    @XmlElementRef(name = "NADAManufacturedHousingGuideWhitePageIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> nadaManufacturedHousingGuideWhitePageIdentifier;
    @XmlElementRef(name = "NADAManufacturedHousingGuideYellowPageIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> nadaManufacturedHousingGuideYellowPageIdentifier;
    @XmlElement(name = "EXTENSION")
    protected MANUFACTUREDHOMEIDENTIFICATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the manufacturedHomeBuiltStateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getManufacturedHomeBuiltStateName() {
        return manufacturedHomeBuiltStateName;
    }

    /**
     * Sets the value of the manufacturedHomeBuiltStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setManufacturedHomeBuiltStateName(JAXBElement<MISMOString> value) {
        this.manufacturedHomeBuiltStateName = value;
    }

    /**
     * Gets the value of the manufacturedHomeCostDataCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getManufacturedHomeCostDataCommentDescription() {
        return manufacturedHomeCostDataCommentDescription;
    }

    /**
     * Sets the value of the manufacturedHomeCostDataCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setManufacturedHomeCostDataCommentDescription(JAXBElement<MISMOString> value) {
        this.manufacturedHomeCostDataCommentDescription = value;
    }

    /**
     * Gets the value of the manufacturedHomeRegionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getManufacturedHomeRegionIdentifier() {
        return manufacturedHomeRegionIdentifier;
    }

    /**
     * Sets the value of the manufacturedHomeRegionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setManufacturedHomeRegionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.manufacturedHomeRegionIdentifier = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideBlackPageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getNADAManufacturedHousingGuideBlackPageIdentifier() {
        return nadaManufacturedHousingGuideBlackPageIdentifier;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideBlackPageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideBlackPageIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.nadaManufacturedHousingGuideBlackPageIdentifier = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideConversionChartPageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getNADAManufacturedHousingGuideConversionChartPageIdentifier() {
        return nadaManufacturedHousingGuideConversionChartPageIdentifier;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideConversionChartPageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideConversionChartPageIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.nadaManufacturedHousingGuideConversionChartPageIdentifier = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideEditionMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOMonth }{@code >}
     *     
     */
    public JAXBElement<MISMOMonth> getNADAManufacturedHousingGuideEditionMonth() {
        return nadaManufacturedHousingGuideEditionMonth;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideEditionMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOMonth }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideEditionMonth(JAXBElement<MISMOMonth> value) {
        this.nadaManufacturedHousingGuideEditionMonth = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideEditionYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOYear }{@code >}
     *     
     */
    public JAXBElement<MISMOYear> getNADAManufacturedHousingGuideEditionYear() {
        return nadaManufacturedHousingGuideEditionYear;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideEditionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOYear }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideEditionYear(JAXBElement<MISMOYear> value) {
        this.nadaManufacturedHousingGuideEditionYear = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideGreyPageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getNADAManufacturedHousingGuideGreyPageIdentifier() {
        return nadaManufacturedHousingGuideGreyPageIdentifier;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideGreyPageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideGreyPageIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.nadaManufacturedHousingGuideGreyPageIdentifier = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideWhitePageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getNADAManufacturedHousingGuideWhitePageIdentifier() {
        return nadaManufacturedHousingGuideWhitePageIdentifier;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideWhitePageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideWhitePageIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.nadaManufacturedHousingGuideWhitePageIdentifier = value;
    }

    /**
     * Gets the value of the nadaManufacturedHousingGuideYellowPageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getNADAManufacturedHousingGuideYellowPageIdentifier() {
        return nadaManufacturedHousingGuideYellowPageIdentifier;
    }

    /**
     * Sets the value of the nadaManufacturedHousingGuideYellowPageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setNADAManufacturedHousingGuideYellowPageIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.nadaManufacturedHousingGuideYellowPageIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOMEIDENTIFICATIONEXTENSION }
     *     
     */
    public MANUFACTUREDHOMEIDENTIFICATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOMEIDENTIFICATIONEXTENSION }
     *     
     */
    public void setEXTENSION(MANUFACTUREDHOMEIDENTIFICATIONEXTENSION value) {
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
