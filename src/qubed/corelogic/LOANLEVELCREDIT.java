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
 * <p>Java class for LOAN_LEVEL_CREDIT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOAN_LEVEL_CREDIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CREDIT_SCORE_PROVIDER" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_PROVIDER" minOccurs="0"/>
 *         &lt;element name="LOAN_LEVEL_CREDIT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}LOAN_LEVEL_CREDIT_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LOAN_LEVEL_CREDIT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LOAN_LEVEL_CREDIT", propOrder = {
    "creditscoreprovider",
    "loanlevelcreditdetail",
    "extension"
})
public class LOANLEVELCREDIT {

    @XmlElement(name = "CREDIT_SCORE_PROVIDER")
    protected CREDITSCOREPROVIDER creditscoreprovider;
    @XmlElement(name = "LOAN_LEVEL_CREDIT_DETAIL")
    protected LOANLEVELCREDITDETAIL loanlevelcreditdetail;
    @XmlElement(name = "EXTENSION")
    protected LOANLEVELCREDITEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditscoreprovider property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREPROVIDER }
     *     
     */
    public CREDITSCOREPROVIDER getCREDITSCOREPROVIDER() {
        return creditscoreprovider;
    }

    /**
     * Sets the value of the creditscoreprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREPROVIDER }
     *     
     */
    public void setCREDITSCOREPROVIDER(CREDITSCOREPROVIDER value) {
        this.creditscoreprovider = value;
    }

    /**
     * Gets the value of the loanlevelcreditdetail property.
     * 
     * @return
     *     possible object is
     *     {@link LOANLEVELCREDITDETAIL }
     *     
     */
    public LOANLEVELCREDITDETAIL getLOANLEVELCREDITDETAIL() {
        return loanlevelcreditdetail;
    }

    /**
     * Sets the value of the loanlevelcreditdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANLEVELCREDITDETAIL }
     *     
     */
    public void setLOANLEVELCREDITDETAIL(LOANLEVELCREDITDETAIL value) {
        this.loanlevelcreditdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LOANLEVELCREDITEXTENSION }
     *     
     */
    public LOANLEVELCREDITEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANLEVELCREDITEXTENSION }
     *     
     */
    public void setEXTENSION(LOANLEVELCREDITEXTENSION value) {
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
