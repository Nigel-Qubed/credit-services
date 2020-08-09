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
 * <p>Java class for DATA_ITEM_CHANGE_CONTEXT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATA_ITEM_CHANGE_CONTEXT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataItemChangeContextDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DataItemChangeContextXPath" type="{http://www.mismo.org/residential/2009/schemas}MISMOXPath" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DATA_ITEM_CHANGE_CONTEXT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DATA_ITEM_CHANGE_CONTEXT_DETAIL", propOrder = {
    "dataItemChangeContextDescription",
    "dataItemChangeContextXPath",
    "extension"
})
public class DATAITEMCHANGECONTEXTDETAIL {

    @XmlElementRef(name = "DataItemChangeContextDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> dataItemChangeContextDescription;
    @XmlElementRef(name = "DataItemChangeContextXPath", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOXPath> dataItemChangeContextXPath;
    @XmlElement(name = "EXTENSION")
    protected DATAITEMCHANGECONTEXTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataItemChangeContextDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDataItemChangeContextDescription() {
        return dataItemChangeContextDescription;
    }

    /**
     * Sets the value of the dataItemChangeContextDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDataItemChangeContextDescription(JAXBElement<MISMOString> value) {
        this.dataItemChangeContextDescription = value;
    }

    /**
     * Gets the value of the dataItemChangeContextXPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOXPath }{@code >}
     *     
     */
    public JAXBElement<MISMOXPath> getDataItemChangeContextXPath() {
        return dataItemChangeContextXPath;
    }

    /**
     * Sets the value of the dataItemChangeContextXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOXPath }{@code >}
     *     
     */
    public void setDataItemChangeContextXPath(JAXBElement<MISMOXPath> value) {
        this.dataItemChangeContextXPath = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DATAITEMCHANGECONTEXTDETAILEXTENSION }
     *     
     */
    public DATAITEMCHANGECONTEXTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAITEMCHANGECONTEXTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(DATAITEMCHANGECONTEXTDETAILEXTENSION value) {
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
