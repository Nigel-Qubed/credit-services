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
 * Information about the estimated cost and accrued depreciation of improvements, land value and other facts used in the cost approach to value.
 * 
 * <p>Java class for COST_APPROACH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COST_APPROACH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COST_APPROACH_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}COST_APPROACH_DETAIL" minOccurs="0"/>
 *         &lt;element name="DEPRECIATION" type="{http://www.mismo.org/residential/2009/schemas}DEPRECIATION" minOccurs="0"/>
 *         &lt;element name="NEW_IMPROVEMENTS" type="{http://www.mismo.org/residential/2009/schemas}NEW_IMPROVEMENTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COST_APPROACH_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COST_APPROACH", propOrder = {
    "costapproachdetail",
    "depreciation",
    "newimprovements",
    "extension"
})
public class COSTAPPROACH {

    @XmlElement(name = "COST_APPROACH_DETAIL")
    protected COSTAPPROACHDETAIL costapproachdetail;
    @XmlElement(name = "DEPRECIATION")
    protected DEPRECIATION depreciation;
    @XmlElement(name = "NEW_IMPROVEMENTS")
    protected NEWIMPROVEMENTS newimprovements;
    @XmlElement(name = "EXTENSION")
    protected COSTAPPROACHEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the costapproachdetail property.
     * 
     * @return
     *     possible object is
     *     {@link COSTAPPROACHDETAIL }
     *     
     */
    public COSTAPPROACHDETAIL getCOSTAPPROACHDETAIL() {
        return costapproachdetail;
    }

    /**
     * Sets the value of the costapproachdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link COSTAPPROACHDETAIL }
     *     
     */
    public void setCOSTAPPROACHDETAIL(COSTAPPROACHDETAIL value) {
        this.costapproachdetail = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link DEPRECIATION }
     *     
     */
    public DEPRECIATION getDEPRECIATION() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEPRECIATION }
     *     
     */
    public void setDEPRECIATION(DEPRECIATION value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the newimprovements property.
     * 
     * @return
     *     possible object is
     *     {@link NEWIMPROVEMENTS }
     *     
     */
    public NEWIMPROVEMENTS getNEWIMPROVEMENTS() {
        return newimprovements;
    }

    /**
     * Sets the value of the newimprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEWIMPROVEMENTS }
     *     
     */
    public void setNEWIMPROVEMENTS(NEWIMPROVEMENTS value) {
        this.newimprovements = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COSTAPPROACHEXTENSION }
     *     
     */
    public COSTAPPROACHEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COSTAPPROACHEXTENSION }
     *     
     */
    public void setEXTENSION(COSTAPPROACHEXTENSION value) {
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
