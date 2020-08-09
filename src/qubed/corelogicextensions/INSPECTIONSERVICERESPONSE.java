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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Data specific to the response for an inspection of a property.
 * 
 * <p>Java class for INSPECTION_SERVICE_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSPECTION_SERVICE_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSPECTION_SERVICE_RESPONSE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}INSPECTION_SERVICE_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="PROPERTIES" type="{http://www.mismo.org/residential/2009/schemas}PROPERTIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INSPECTION_SERVICE_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INSPECTION_SERVICE_RESPONSE", propOrder = {
    "inspectionserviceresponsedetail",
    "properties",
    "extension"
})
public class INSPECTIONSERVICERESPONSE {

    @XmlElement(name = "INSPECTION_SERVICE_RESPONSE_DETAIL")
    protected INSPECTIONSERVICERESPONSEDETAIL inspectionserviceresponsedetail;
    @XmlElement(name = "PROPERTIES")
    protected PROPERTIES properties;
    @XmlElement(name = "EXTENSION")
    protected INSPECTIONSERVICERESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the inspectionserviceresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link INSPECTIONSERVICERESPONSEDETAIL }
     *     
     */
    public INSPECTIONSERVICERESPONSEDETAIL getINSPECTIONSERVICERESPONSEDETAIL() {
        return inspectionserviceresponsedetail;
    }

    /**
     * Sets the value of the inspectionserviceresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSPECTIONSERVICERESPONSEDETAIL }
     *     
     */
    public void setINSPECTIONSERVICERESPONSEDETAIL(INSPECTIONSERVICERESPONSEDETAIL value) {
        this.inspectionserviceresponsedetail = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTIES }
     *     
     */
    public PROPERTIES getPROPERTIES() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTIES }
     *     
     */
    public void setPROPERTIES(PROPERTIES value) {
        this.properties = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INSPECTIONSERVICERESPONSEEXTENSION }
     *     
     */
    public INSPECTIONSERVICERESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSPECTIONSERVICERESPONSEEXTENSION }
     *     
     */
    public void setEXTENSION(INSPECTIONSERVICERESPONSEEXTENSION value) {
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
