//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

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
 * Contains or points to an unpopulated version of the view which has all VIEW_FIELDS marked and identified so that it can be run through a TRANSFORM to populate those fields with data. When the TEMPLATE element is present, then a TRANSFORM element must also be provided. If a TEMPLATE element is not provided, then TRANSFORMS must contain both the boiler plate of the view as well as the code for populating its VIEW_FIELDS. A TEMPLATE element may contain either TEMPLATE_PAGES or TEMPLATE_FILES. Use TEMPLATE_PAGES for page-based file formats and TEMPLATE_FILES when all pages are contained in a single object.
 * 
 * <p>Java class for TEMPLATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEMPLATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="TEMPLATE_FILES" type="{http://www.mismo.org/residential/2009/schemas}TEMPLATE_FILES" minOccurs="0"/>
 *           &lt;element name="TEMPLATE_PAGES" type="{http://www.mismo.org/residential/2009/schemas}TEMPLATE_PAGES" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TEMPLATE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TEMPLATE", propOrder = {
    "templatefiles",
    "templatepages",
    "extension"
})
public class TEMPLATE {

    @XmlElement(name = "TEMPLATE_FILES")
    protected TEMPLATEFILES templatefiles;
    @XmlElement(name = "TEMPLATE_PAGES")
    protected TEMPLATEPAGES templatepages;
    @XmlElement(name = "EXTENSION")
    protected TEMPLATEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the templatefiles property.
     * 
     * @return
     *     possible object is
     *     {@link TEMPLATEFILES }
     *     
     */
    public TEMPLATEFILES getTEMPLATEFILES() {
        return templatefiles;
    }

    /**
     * Sets the value of the templatefiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEMPLATEFILES }
     *     
     */
    public void setTEMPLATEFILES(TEMPLATEFILES value) {
        this.templatefiles = value;
    }

    /**
     * Gets the value of the templatepages property.
     * 
     * @return
     *     possible object is
     *     {@link TEMPLATEPAGES }
     *     
     */
    public TEMPLATEPAGES getTEMPLATEPAGES() {
        return templatepages;
    }

    /**
     * Sets the value of the templatepages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEMPLATEPAGES }
     *     
     */
    public void setTEMPLATEPAGES(TEMPLATEPAGES value) {
        this.templatepages = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TEMPLATEEXTENSION }
     *     
     */
    public TEMPLATEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEMPLATEEXTENSION }
     *     
     */
    public void setEXTENSION(TEMPLATEEXTENSION value) {
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
