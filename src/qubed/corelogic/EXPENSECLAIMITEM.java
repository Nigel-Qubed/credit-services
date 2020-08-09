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
 * Information about one or more expense items included on an expense claim.
 * 
 * <p>Java class for EXPENSE_CLAIM_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXPENSE_CLAIM_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPENSE_CLAIM_ITEM_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}EXPENSE_CLAIM_ITEM_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXPENSE_CLAIM_ITEM_OCCURRENCES" type="{http://www.mismo.org/residential/2009/schemas}EXPENSE_CLAIM_ITEM_OCCURRENCES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EXPENSE_CLAIM_ITEM_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "EXPENSE_CLAIM_ITEM", propOrder = {
    "expenseclaimitemdetail",
    "expenseclaimitemoccurrences",
    "extension"
})
public class EXPENSECLAIMITEM {

    @XmlElement(name = "EXPENSE_CLAIM_ITEM_DETAIL")
    protected EXPENSECLAIMITEMDETAIL expenseclaimitemdetail;
    @XmlElement(name = "EXPENSE_CLAIM_ITEM_OCCURRENCES")
    protected EXPENSECLAIMITEMOCCURRENCES expenseclaimitemoccurrences;
    @XmlElement(name = "EXTENSION")
    protected EXPENSECLAIMITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the expenseclaimitemdetail property.
     * 
     * @return
     *     possible object is
     *     {@link EXPENSECLAIMITEMDETAIL }
     *     
     */
    public EXPENSECLAIMITEMDETAIL getEXPENSECLAIMITEMDETAIL() {
        return expenseclaimitemdetail;
    }

    /**
     * Sets the value of the expenseclaimitemdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPENSECLAIMITEMDETAIL }
     *     
     */
    public void setEXPENSECLAIMITEMDETAIL(EXPENSECLAIMITEMDETAIL value) {
        this.expenseclaimitemdetail = value;
    }

    /**
     * Gets the value of the expenseclaimitemoccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link EXPENSECLAIMITEMOCCURRENCES }
     *     
     */
    public EXPENSECLAIMITEMOCCURRENCES getEXPENSECLAIMITEMOCCURRENCES() {
        return expenseclaimitemoccurrences;
    }

    /**
     * Sets the value of the expenseclaimitemoccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPENSECLAIMITEMOCCURRENCES }
     *     
     */
    public void setEXPENSECLAIMITEMOCCURRENCES(EXPENSECLAIMITEMOCCURRENCES value) {
        this.expenseclaimitemoccurrences = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EXPENSECLAIMITEMEXTENSION }
     *     
     */
    public EXPENSECLAIMITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPENSECLAIMITEMEXTENSION }
     *     
     */
    public void setEXTENSION(EXPENSECLAIMITEMEXTENSION value) {
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
