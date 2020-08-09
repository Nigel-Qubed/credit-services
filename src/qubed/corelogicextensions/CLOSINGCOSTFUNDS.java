//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Information about one or more types of closing cost funds. Holds all occurrences of CLOSING_COST_FUND.
 * 
 * <p>Java class for CLOSING_COST_FUNDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_COST_FUNDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLOSING_COST_FUND" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_COST_FUND" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CLOSING_COST_FUND_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_COST_FUND_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_COST_FUNDS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CLOSING_COST_FUNDS", propOrder = {
    "closingcostfund",
    "closingcostfundsummary",
    "extension"
})
public class CLOSINGCOSTFUNDS {

    @XmlElement(name = "CLOSING_COST_FUND")
    protected List<CLOSINGCOSTFUND> closingcostfund;
    @XmlElement(name = "CLOSING_COST_FUND_SUMMARY")
    protected CLOSINGCOSTFUNDSUMMARY closingcostfundsummary;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGCOSTFUNDSEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingcostfund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closingcostfund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCLOSINGCOSTFUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLOSINGCOSTFUND }
     * 
     * 
     */
    public List<CLOSINGCOSTFUND> getCLOSINGCOSTFUND() {
        if (closingcostfund == null) {
            closingcostfund = new ArrayList<CLOSINGCOSTFUND>();
        }
        return this.closingcostfund;
    }

    /**
     * Gets the value of the closingcostfundsummary property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGCOSTFUNDSUMMARY }
     *     
     */
    public CLOSINGCOSTFUNDSUMMARY getCLOSINGCOSTFUNDSUMMARY() {
        return closingcostfundsummary;
    }

    /**
     * Sets the value of the closingcostfundsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGCOSTFUNDSUMMARY }
     *     
     */
    public void setCLOSINGCOSTFUNDSUMMARY(CLOSINGCOSTFUNDSUMMARY value) {
        this.closingcostfundsummary = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGCOSTFUNDSEXTENSION }
     *     
     */
    public CLOSINGCOSTFUNDSEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGCOSTFUNDSEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGCOSTFUNDSEXTENSION value) {
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
