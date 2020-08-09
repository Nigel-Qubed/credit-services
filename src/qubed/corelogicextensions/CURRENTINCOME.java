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
 * Information about the borrower's current income, including type, amount, and taxing status.
 * 
 * <p>Java class for CURRENT_INCOME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CURRENT_INCOME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CURRENT_INCOME_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CURRENT_INCOME_DETAIL" minOccurs="0"/>
 *         &lt;element name="CURRENT_INCOME_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}CURRENT_INCOME_ITEMS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CURRENT_INCOME_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CURRENT_INCOME", propOrder = {
    "currentincomedetail",
    "currentincomeitems",
    "extension"
})
public class CURRENTINCOME {

    @XmlElement(name = "CURRENT_INCOME_DETAIL")
    protected CURRENTINCOMEDETAIL currentincomedetail;
    @XmlElement(name = "CURRENT_INCOME_ITEMS")
    protected CURRENTINCOMEITEMS currentincomeitems;
    @XmlElement(name = "EXTENSION")
    protected CURRENTINCOMEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the currentincomedetail property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENTINCOMEDETAIL }
     *     
     */
    public CURRENTINCOMEDETAIL getCURRENTINCOMEDETAIL() {
        return currentincomedetail;
    }

    /**
     * Sets the value of the currentincomedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENTINCOMEDETAIL }
     *     
     */
    public void setCURRENTINCOMEDETAIL(CURRENTINCOMEDETAIL value) {
        this.currentincomedetail = value;
    }

    /**
     * Gets the value of the currentincomeitems property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENTINCOMEITEMS }
     *     
     */
    public CURRENTINCOMEITEMS getCURRENTINCOMEITEMS() {
        return currentincomeitems;
    }

    /**
     * Sets the value of the currentincomeitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENTINCOMEITEMS }
     *     
     */
    public void setCURRENTINCOMEITEMS(CURRENTINCOMEITEMS value) {
        this.currentincomeitems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENTINCOMEEXTENSION }
     *     
     */
    public CURRENTINCOMEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENTINCOMEEXTENSION }
     *     
     */
    public void setEXTENSION(CURRENTINCOMEEXTENSION value) {
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
