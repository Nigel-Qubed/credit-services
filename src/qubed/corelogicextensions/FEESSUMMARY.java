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
 * <p>Java class for FEES_SUMMARY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEES_SUMMARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEE_SUMMARY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}FEE_SUMMARY_DETAIL" minOccurs="0"/>
 *         &lt;element name="FEE_SUMMARY_TOTAL_FEES_PAID_BYS" type="{http://www.mismo.org/residential/2009/schemas}FEE_SUMMARY_TOTAL_FEES_PAID_BYS" minOccurs="0"/>
 *         &lt;element name="FEE_SUMMARY_TOTAL_FEES_PAID_TOS" type="{http://www.mismo.org/residential/2009/schemas}FEE_SUMMARY_TOTAL_FEES_PAID_TOS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FEES_SUMMARY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FEES_SUMMARY", propOrder = {
    "feesummarydetail",
    "feesummarytotalfeespaidbys",
    "feesummarytotalfeespaidtos",
    "extension"
})
public class FEESSUMMARY {

    @XmlElement(name = "FEE_SUMMARY_DETAIL")
    protected FEESUMMARYDETAIL feesummarydetail;
    @XmlElement(name = "FEE_SUMMARY_TOTAL_FEES_PAID_BYS")
    protected FEESUMMARYTOTALFEESPAIDBYS feesummarytotalfeespaidbys;
    @XmlElement(name = "FEE_SUMMARY_TOTAL_FEES_PAID_TOS")
    protected FEESUMMARYTOTALFEESPAIDTOS feesummarytotalfeespaidtos;
    @XmlElement(name = "EXTENSION")
    protected FEESSUMMARYEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the feesummarydetail property.
     * 
     * @return
     *     possible object is
     *     {@link FEESUMMARYDETAIL }
     *     
     */
    public FEESUMMARYDETAIL getFEESUMMARYDETAIL() {
        return feesummarydetail;
    }

    /**
     * Sets the value of the feesummarydetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEESUMMARYDETAIL }
     *     
     */
    public void setFEESUMMARYDETAIL(FEESUMMARYDETAIL value) {
        this.feesummarydetail = value;
    }

    /**
     * Gets the value of the feesummarytotalfeespaidbys property.
     * 
     * @return
     *     possible object is
     *     {@link FEESUMMARYTOTALFEESPAIDBYS }
     *     
     */
    public FEESUMMARYTOTALFEESPAIDBYS getFEESUMMARYTOTALFEESPAIDBYS() {
        return feesummarytotalfeespaidbys;
    }

    /**
     * Sets the value of the feesummarytotalfeespaidbys property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEESUMMARYTOTALFEESPAIDBYS }
     *     
     */
    public void setFEESUMMARYTOTALFEESPAIDBYS(FEESUMMARYTOTALFEESPAIDBYS value) {
        this.feesummarytotalfeespaidbys = value;
    }

    /**
     * Gets the value of the feesummarytotalfeespaidtos property.
     * 
     * @return
     *     possible object is
     *     {@link FEESUMMARYTOTALFEESPAIDTOS }
     *     
     */
    public FEESUMMARYTOTALFEESPAIDTOS getFEESUMMARYTOTALFEESPAIDTOS() {
        return feesummarytotalfeespaidtos;
    }

    /**
     * Sets the value of the feesummarytotalfeespaidtos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEESUMMARYTOTALFEESPAIDTOS }
     *     
     */
    public void setFEESUMMARYTOTALFEESPAIDTOS(FEESUMMARYTOTALFEESPAIDTOS value) {
        this.feesummarytotalfeespaidtos = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FEESSUMMARYEXTENSION }
     *     
     */
    public FEESSUMMARYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEESSUMMARYEXTENSION }
     *     
     */
    public void setEXTENSION(FEESSUMMARYEXTENSION value) {
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