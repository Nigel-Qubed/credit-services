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
 * Information on the type, name, identification and other facts about the data source. The data source is the origin of a fact, detail or piece of information.
 * 
 * <p>Java class for DATA_SOURCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATA_SOURCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSourceDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DataSourceEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DataSourceName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DataSourceType" type="{http://www.mismo.org/residential/2009/schemas}DataSourceEnum" minOccurs="0"/>
 *         &lt;element name="DataSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DataSourceURL" type="{http://www.mismo.org/residential/2009/schemas}MISMOURL" minOccurs="0"/>
 *         &lt;element name="DataSourceVerificationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DataSourceVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DATA_SOURCE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DATA_SOURCE", propOrder = {
    "dataSourceDescription",
    "dataSourceEffectiveDate",
    "dataSourceName",
    "dataSourceType",
    "dataSourceTypeOtherDescription",
    "dataSourceURL",
    "dataSourceVerificationDescription",
    "dataSourceVersionIdentifier",
    "extension"
})
public class DATASOURCE {

    @XmlElementRef(name = "DataSourceDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> dataSourceDescription;
    @XmlElementRef(name = "DataSourceEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> dataSourceEffectiveDate;
    @XmlElementRef(name = "DataSourceName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> dataSourceName;
    @XmlElementRef(name = "DataSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DataSourceEnum> dataSourceType;
    @XmlElementRef(name = "DataSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> dataSourceTypeOtherDescription;
    @XmlElementRef(name = "DataSourceURL", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOURL> dataSourceURL;
    @XmlElementRef(name = "DataSourceVerificationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> dataSourceVerificationDescription;
    @XmlElementRef(name = "DataSourceVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> dataSourceVersionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected DATASOURCEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataSourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDataSourceDescription() {
        return dataSourceDescription;
    }

    /**
     * Sets the value of the dataSourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDataSourceDescription(JAXBElement<MISMOString> value) {
        this.dataSourceDescription = value;
    }

    /**
     * Gets the value of the dataSourceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getDataSourceEffectiveDate() {
        return dataSourceEffectiveDate;
    }

    /**
     * Sets the value of the dataSourceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setDataSourceEffectiveDate(JAXBElement<MISMODate> value) {
        this.dataSourceEffectiveDate = value;
    }

    /**
     * Gets the value of the dataSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDataSourceName() {
        return dataSourceName;
    }

    /**
     * Sets the value of the dataSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDataSourceName(JAXBElement<MISMOString> value) {
        this.dataSourceName = value;
    }

    /**
     * Gets the value of the dataSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataSourceEnum }{@code >}
     *     
     */
    public JAXBElement<DataSourceEnum> getDataSourceType() {
        return dataSourceType;
    }

    /**
     * Sets the value of the dataSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataSourceEnum }{@code >}
     *     
     */
    public void setDataSourceType(JAXBElement<DataSourceEnum> value) {
        this.dataSourceType = value;
    }

    /**
     * Gets the value of the dataSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDataSourceTypeOtherDescription() {
        return dataSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the dataSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDataSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.dataSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the dataSourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public JAXBElement<MISMOURL> getDataSourceURL() {
        return dataSourceURL;
    }

    /**
     * Sets the value of the dataSourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public void setDataSourceURL(JAXBElement<MISMOURL> value) {
        this.dataSourceURL = value;
    }

    /**
     * Gets the value of the dataSourceVerificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDataSourceVerificationDescription() {
        return dataSourceVerificationDescription;
    }

    /**
     * Sets the value of the dataSourceVerificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDataSourceVerificationDescription(JAXBElement<MISMOString> value) {
        this.dataSourceVerificationDescription = value;
    }

    /**
     * Gets the value of the dataSourceVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDataSourceVersionIdentifier() {
        return dataSourceVersionIdentifier;
    }

    /**
     * Sets the value of the dataSourceVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDataSourceVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.dataSourceVersionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DATASOURCEEXTENSION }
     *     
     */
    public DATASOURCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATASOURCEEXTENSION }
     *     
     */
    public void setEXTENSION(DATASOURCEEXTENSION value) {
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
