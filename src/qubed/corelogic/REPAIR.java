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
 * <p>Java class for REPAIR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REPAIR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REPAIR_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}REPAIR_ITEMS" minOccurs="0"/>
 *         &lt;element name="REPAIR_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}REPAIR_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REPAIR_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "REPAIR", propOrder = {
    "repairitems",
    "repairsummary",
    "extension"
})
public class REPAIR {

    @XmlElement(name = "REPAIR_ITEMS")
    protected REPAIRITEMS repairitems;
    @XmlElement(name = "REPAIR_SUMMARY")
    protected REPAIRSUMMARY repairsummary;
    @XmlElement(name = "EXTENSION")
    protected REPAIREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the repairitems property.
     * 
     * @return
     *     possible object is
     *     {@link REPAIRITEMS }
     *     
     */
    public REPAIRITEMS getREPAIRITEMS() {
        return repairitems;
    }

    /**
     * Sets the value of the repairitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPAIRITEMS }
     *     
     */
    public void setREPAIRITEMS(REPAIRITEMS value) {
        this.repairitems = value;
    }

    /**
     * Gets the value of the repairsummary property.
     * 
     * @return
     *     possible object is
     *     {@link REPAIRSUMMARY }
     *     
     */
    public REPAIRSUMMARY getREPAIRSUMMARY() {
        return repairsummary;
    }

    /**
     * Sets the value of the repairsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPAIRSUMMARY }
     *     
     */
    public void setREPAIRSUMMARY(REPAIRSUMMARY value) {
        this.repairsummary = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link REPAIREXTENSION }
     *     
     */
    public REPAIREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPAIREXTENSION }
     *     
     */
    public void setEXTENSION(REPAIREXTENSION value) {
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
