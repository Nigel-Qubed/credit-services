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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * A data type of String SHOULD identify a data point that is either a text value consisting of a word, phrase, sentence, paragraph, or formatted (TAB, CR, LF) character content depending on its purpose or a numeric value with a maximum of 16383 characters and MAY have the lang attribute. There is no list of valid values provided.
 * EXAMPLE: A Disqualificaton Reason Text for excluding a product from those offered to a borrower could be expressed as "Does not meet income to indebtedness guidelines for down payment support.".
 * 
 * <p>Java class for MISMOString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISMOString">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.mismo.org/residential/2009/schemas>MISMOString_Base">
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="DataNotSuppliedReasonType" type="{http://www.mismo.org/residential/2009/schemas}DataNotSuppliedReasonBase" />
 *       &lt;attribute name="DataNotSuppliedReasonTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString_Base" />
 *       &lt;attribute name="DataNotSuppliedReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString_Base" />
 *       &lt;attribute name="SensitiveIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator_Base" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MISMOString", propOrder = {
    "value"
})
public class MISMOString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DataNotSuppliedReasonType")
    protected DataNotSuppliedReasonBase dataNotSuppliedReasonType;
    @XmlAttribute(name = "DataNotSuppliedReasonTypeAdditionalDescription")
    protected String dataNotSuppliedReasonTypeAdditionalDescription;
    @XmlAttribute(name = "DataNotSuppliedReasonTypeOtherDescription")
    protected String dataNotSuppliedReasonTypeOtherDescription;
    @XmlAttribute(name = "SensitiveIndicator")
    protected Boolean sensitiveIndicator;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dataNotSuppliedReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link DataNotSuppliedReasonBase }
     *     
     */
    public DataNotSuppliedReasonBase getDataNotSuppliedReasonType() {
        return dataNotSuppliedReasonType;
    }

    /**
     * Sets the value of the dataNotSuppliedReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNotSuppliedReasonBase }
     *     
     */
    public void setDataNotSuppliedReasonType(DataNotSuppliedReasonBase value) {
        this.dataNotSuppliedReasonType = value;
    }

    /**
     * Gets the value of the dataNotSuppliedReasonTypeAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNotSuppliedReasonTypeAdditionalDescription() {
        return dataNotSuppliedReasonTypeAdditionalDescription;
    }

    /**
     * Sets the value of the dataNotSuppliedReasonTypeAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNotSuppliedReasonTypeAdditionalDescription(String value) {
        this.dataNotSuppliedReasonTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the dataNotSuppliedReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNotSuppliedReasonTypeOtherDescription() {
        return dataNotSuppliedReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the dataNotSuppliedReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNotSuppliedReasonTypeOtherDescription(String value) {
        this.dataNotSuppliedReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the sensitiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensitiveIndicator() {
        return sensitiveIndicator;
    }

    /**
     * Sets the value of the sensitiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensitiveIndicator(Boolean value) {
        this.sensitiveIndicator = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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