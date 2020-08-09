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
 * Information about the current residence of the borrower, including the address, length of time there and other information about the residency status. If the residence is rented, this also includes information about the landlord.
 * 
 * <p>Java class for RESIDENCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESIDENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element name="LANDLORD" type="{http://www.mismo.org/residential/2009/schemas}LANDLORD" minOccurs="0"/>
 *         &lt;element name="RESIDENCE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}RESIDENCE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RESIDENCE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESIDENCE", propOrder = {
    "address",
    "landlord",
    "residencedetail",
    "extension"
})
public class RESIDENCE {

    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;
    @XmlElement(name = "LANDLORD")
    protected LANDLORD landlord;
    @XmlElement(name = "RESIDENCE_DETAIL")
    protected RESIDENCEDETAIL residencedetail;
    @XmlElement(name = "EXTENSION")
    protected RESIDENCEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the landlord property.
     * 
     * @return
     *     possible object is
     *     {@link LANDLORD }
     *     
     */
    public LANDLORD getLANDLORD() {
        return landlord;
    }

    /**
     * Sets the value of the landlord property.
     * 
     * @param value
     *     allowed object is
     *     {@link LANDLORD }
     *     
     */
    public void setLANDLORD(LANDLORD value) {
        this.landlord = value;
    }

    /**
     * Gets the value of the residencedetail property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCEDETAIL }
     *     
     */
    public RESIDENCEDETAIL getRESIDENCEDETAIL() {
        return residencedetail;
    }

    /**
     * Sets the value of the residencedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCEDETAIL }
     *     
     */
    public void setRESIDENCEDETAIL(RESIDENCEDETAIL value) {
        this.residencedetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCEEXTENSION }
     *     
     */
    public RESIDENCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCEEXTENSION }
     *     
     */
    public void setEXTENSION(RESIDENCEEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
