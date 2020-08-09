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
 * Declarations that the borrower makes on the Uniform Residential Loan Application in section VIII.
 * 
 * <p>Java class for DECLARATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DECLARATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DECLARATION_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}DECLARATION_DETAIL" minOccurs="0"/>
 *         &lt;element name="DECLARATION_EXPLANATIONS" type="{http://www.mismo.org/residential/2009/schemas}DECLARATION_EXPLANATIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DECLARATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DECLARATION", propOrder = {
    "declarationdetail",
    "declarationexplanations",
    "extension"
})
public class DECLARATION {

    @XmlElement(name = "DECLARATION_DETAIL")
    protected DECLARATIONDETAIL declarationdetail;
    @XmlElement(name = "DECLARATION_EXPLANATIONS")
    protected DECLARATIONEXPLANATIONS declarationexplanations;
    @XmlElement(name = "EXTENSION")
    protected DECLARATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the declarationdetail property.
     * 
     * @return
     *     possible object is
     *     {@link DECLARATIONDETAIL }
     *     
     */
    public DECLARATIONDETAIL getDECLARATIONDETAIL() {
        return declarationdetail;
    }

    /**
     * Sets the value of the declarationdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECLARATIONDETAIL }
     *     
     */
    public void setDECLARATIONDETAIL(DECLARATIONDETAIL value) {
        this.declarationdetail = value;
    }

    /**
     * Gets the value of the declarationexplanations property.
     * 
     * @return
     *     possible object is
     *     {@link DECLARATIONEXPLANATIONS }
     *     
     */
    public DECLARATIONEXPLANATIONS getDECLARATIONEXPLANATIONS() {
        return declarationexplanations;
    }

    /**
     * Sets the value of the declarationexplanations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECLARATIONEXPLANATIONS }
     *     
     */
    public void setDECLARATIONEXPLANATIONS(DECLARATIONEXPLANATIONS value) {
        this.declarationexplanations = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DECLARATIONEXTENSION }
     *     
     */
    public DECLARATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECLARATIONEXTENSION }
     *     
     */
    public void setEXTENSION(DECLARATIONEXTENSION value) {
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
