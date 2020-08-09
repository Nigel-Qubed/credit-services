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
 * <p>Java class for VERIFICATION_DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VERIFICATION_DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VERIFICATION_DATA_INVESTOR" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA_INVESTOR" minOccurs="0"/>
 *         &lt;element name="VERIFICATION_DATA_LOAN" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA_LOAN" minOccurs="0"/>
 *         &lt;element name="VERIFICATION_DATA_PAYEE" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA_PAYEE" minOccurs="0"/>
 *         &lt;element name="VERIFICATION_DATA_POOL" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA_POOL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VERIFICATION_DATA", propOrder = {
    "verificationdatainvestor",
    "verificationdataloan",
    "verificationdatapayee",
    "verificationdatapool",
    "extension"
})
public class VERIFICATIONDATA {

    @XmlElement(name = "VERIFICATION_DATA_INVESTOR")
    protected VERIFICATIONDATAINVESTOR verificationdatainvestor;
    @XmlElement(name = "VERIFICATION_DATA_LOAN")
    protected VERIFICATIONDATALOAN verificationdataloan;
    @XmlElement(name = "VERIFICATION_DATA_PAYEE")
    protected VERIFICATIONDATAPAYEE verificationdatapayee;
    @XmlElement(name = "VERIFICATION_DATA_POOL")
    protected VERIFICATIONDATAPOOL verificationdatapool;
    @XmlElement(name = "EXTENSION")
    protected VERIFICATIONDATAEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the verificationdatainvestor property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATAINVESTOR }
     *     
     */
    public VERIFICATIONDATAINVESTOR getVERIFICATIONDATAINVESTOR() {
        return verificationdatainvestor;
    }

    /**
     * Sets the value of the verificationdatainvestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATAINVESTOR }
     *     
     */
    public void setVERIFICATIONDATAINVESTOR(VERIFICATIONDATAINVESTOR value) {
        this.verificationdatainvestor = value;
    }

    /**
     * Gets the value of the verificationdataloan property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATALOAN }
     *     
     */
    public VERIFICATIONDATALOAN getVERIFICATIONDATALOAN() {
        return verificationdataloan;
    }

    /**
     * Sets the value of the verificationdataloan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATALOAN }
     *     
     */
    public void setVERIFICATIONDATALOAN(VERIFICATIONDATALOAN value) {
        this.verificationdataloan = value;
    }

    /**
     * Gets the value of the verificationdatapayee property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATAPAYEE }
     *     
     */
    public VERIFICATIONDATAPAYEE getVERIFICATIONDATAPAYEE() {
        return verificationdatapayee;
    }

    /**
     * Sets the value of the verificationdatapayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATAPAYEE }
     *     
     */
    public void setVERIFICATIONDATAPAYEE(VERIFICATIONDATAPAYEE value) {
        this.verificationdatapayee = value;
    }

    /**
     * Gets the value of the verificationdatapool property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATAPOOL }
     *     
     */
    public VERIFICATIONDATAPOOL getVERIFICATIONDATAPOOL() {
        return verificationdatapool;
    }

    /**
     * Sets the value of the verificationdatapool property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATAPOOL }
     *     
     */
    public void setVERIFICATIONDATAPOOL(VERIFICATIONDATAPOOL value) {
        this.verificationdatapool = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATAEXTENSION }
     *     
     */
    public VERIFICATIONDATAEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATAEXTENSION }
     *     
     */
    public void setEXTENSION(VERIFICATIONDATAEXTENSION value) {
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
