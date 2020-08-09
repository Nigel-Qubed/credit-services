//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

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
 * Information regarding one or more types of housing expense. Holds all occurrences of HOUSING_EXPENSE.
 * 
 * <p>Java class for HOUSING_EXPENSES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOUSING_EXPENSES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HOUSING_EXPENSE" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_EXPENSE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HOUSING_EXPENSE_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_EXPENSE_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_EXPENSES_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HOUSING_EXPENSES", propOrder = {
    "housingexpense",
    "housingexpensesummary",
    "extension"
})
public class HOUSINGEXPENSES {

    @XmlElement(name = "HOUSING_EXPENSE")
    protected List<HOUSINGEXPENSE> housingexpense;
    @XmlElement(name = "HOUSING_EXPENSE_SUMMARY")
    protected HOUSINGEXPENSESUMMARY housingexpensesummary;
    @XmlElement(name = "EXTENSION")
    protected HOUSINGEXPENSESEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the housingexpense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the housingexpense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHOUSINGEXPENSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOUSINGEXPENSE }
     * 
     * 
     */
    public List<HOUSINGEXPENSE> getHOUSINGEXPENSE() {
        if (housingexpense == null) {
            housingexpense = new ArrayList<HOUSINGEXPENSE>();
        }
        return this.housingexpense;
    }

    /**
     * Gets the value of the housingexpensesummary property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSINGEXPENSESUMMARY }
     *     
     */
    public HOUSINGEXPENSESUMMARY getHOUSINGEXPENSESUMMARY() {
        return housingexpensesummary;
    }

    /**
     * Sets the value of the housingexpensesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSINGEXPENSESUMMARY }
     *     
     */
    public void setHOUSINGEXPENSESUMMARY(HOUSINGEXPENSESUMMARY value) {
        this.housingexpensesummary = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSINGEXPENSESEXTENSION }
     *     
     */
    public HOUSINGEXPENSESEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSINGEXPENSESEXTENSION }
     *     
     */
    public void setEXTENSION(HOUSINGEXPENSESEXTENSION value) {
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
