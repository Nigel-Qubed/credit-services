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
 * A collection of values that specify Title existing loans and liabilities. Intended to identify any loans and liabilities associated with the property to be covered by the Title Commitment.
 * 
 * <p>Java class for TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIABILITIES" type="{http://www.mismo.org/residential/2009/schemas}LIABILITIES" minOccurs="0"/>
 *         &lt;element name="LOANS" type="{http://www.mismo.org/residential/2009/schemas}LOANS" minOccurs="0"/>
 *         &lt;element name="RELATIONSHIPS" type="{http://www.mismo.org/residential/2009/schemas}RELATIONSHIPS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION", propOrder = {
    "liabilities",
    "loans",
    "relationships",
    "extension"
})
public class TITLEEXISTINGLOANSANDLIABILITIESINFORMATION {

    @XmlElement(name = "LIABILITIES")
    protected LIABILITIES liabilities;
    @XmlElement(name = "LOANS")
    protected LOANS loans;
    @XmlElement(name = "RELATIONSHIPS")
    protected RELATIONSHIPS relationships;
    @XmlElement(name = "EXTENSION")
    protected TITLEEXISTINGLOANSANDLIABILITIESINFORMATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link LIABILITIES }
     *     
     */
    public LIABILITIES getLIABILITIES() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIABILITIES }
     *     
     */
    public void setLIABILITIES(LIABILITIES value) {
        this.liabilities = value;
    }

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link LOANS }
     *     
     */
    public LOANS getLOANS() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANS }
     *     
     */
    public void setLOANS(LOANS value) {
        this.loans = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public RELATIONSHIPS getRELATIONSHIPS() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public void setRELATIONSHIPS(RELATIONSHIPS value) {
        this.relationships = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEEXISTINGLOANSANDLIABILITIESINFORMATIONEXTENSION }
     *     
     */
    public TITLEEXISTINGLOANSANDLIABILITIESINFORMATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEEXISTINGLOANSANDLIABILITIESINFORMATIONEXTENSION }
     *     
     */
    public void setEXTENSION(TITLEEXISTINGLOANSANDLIABILITIESINFORMATIONEXTENSION value) {
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
