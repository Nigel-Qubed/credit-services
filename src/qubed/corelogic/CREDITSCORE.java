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
 * Information specific to a Credit Score that was obtained on one or more borrowers.
 * 
 * <p>Java class for CREDIT_SCORE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_SCORE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CREDIT_SCORE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_DETAIL" minOccurs="0"/>
 *         &lt;element name="CREDIT_SCORE_FACTORS" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_FACTORS" minOccurs="0"/>
 *         &lt;element name="CREDIT_SCORE_PROVIDER" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_PROVIDER" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_SCORE", propOrder = {
    "creditscoredetail",
    "creditscorefactors",
    "creditscoreprovider",
    "extension"
})
public class CREDITSCORE {

    @XmlElement(name = "CREDIT_SCORE_DETAIL")
    protected CREDITSCOREDETAIL creditscoredetail;
    @XmlElement(name = "CREDIT_SCORE_FACTORS")
    protected CREDITSCOREFACTORS creditscorefactors;
    @XmlElement(name = "CREDIT_SCORE_PROVIDER")
    protected CREDITSCOREPROVIDER creditscoreprovider;
    @XmlElement(name = "EXTENSION")
    protected CREDITSCOREEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditscoredetail property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREDETAIL }
     *     
     */
    public CREDITSCOREDETAIL getCREDITSCOREDETAIL() {
        return creditscoredetail;
    }

    /**
     * Sets the value of the creditscoredetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREDETAIL }
     *     
     */
    public void setCREDITSCOREDETAIL(CREDITSCOREDETAIL value) {
        this.creditscoredetail = value;
    }

    /**
     * Gets the value of the creditscorefactors property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREFACTORS }
     *     
     */
    public CREDITSCOREFACTORS getCREDITSCOREFACTORS() {
        return creditscorefactors;
    }

    /**
     * Sets the value of the creditscorefactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREFACTORS }
     *     
     */
    public void setCREDITSCOREFACTORS(CREDITSCOREFACTORS value) {
        this.creditscorefactors = value;
    }

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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREEXTENSION }
     *     
     */
    public CREDITSCOREEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITSCOREEXTENSION value) {
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
