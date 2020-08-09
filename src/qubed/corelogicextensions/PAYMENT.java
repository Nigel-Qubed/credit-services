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
 * <p>Java class for PAYMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARREARAGE" type="{http://www.mismo.org/residential/2009/schemas}ARREARAGE" minOccurs="0"/>
 *         &lt;element name="PARTIAL_PAYMENTS" type="{http://www.mismo.org/residential/2009/schemas}PARTIAL_PAYMENTS" minOccurs="0"/>
 *         &lt;element name="PAYMENT_COMPONENT_BREAKOUTS" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_COMPONENT_BREAKOUTS" minOccurs="0"/>
 *         &lt;element name="PAYMENT_RULE" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_RULE" minOccurs="0"/>
 *         &lt;element name="PAYMENT_SCHEDULE_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_SCHEDULE_ITEMS" minOccurs="0"/>
 *         &lt;element name="PAYMENT_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_SUMMARY" minOccurs="0"/>
 *         &lt;element name="PERIODIC_LATE_COUNTS" type="{http://www.mismo.org/residential/2009/schemas}PERIODIC_LATE_COUNTS" minOccurs="0"/>
 *         &lt;element name="SKIP_PAYMENT" type="{http://www.mismo.org/residential/2009/schemas}SKIP_PAYMENT" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PAYMENT", propOrder = {
    "arrearage",
    "partialpayments",
    "paymentcomponentbreakouts",
    "paymentrule",
    "paymentscheduleitems",
    "paymentsummary",
    "periodiclatecounts",
    "skippayment",
    "extension"
})
public class PAYMENT {

    @XmlElement(name = "ARREARAGE")
    protected ARREARAGE arrearage;
    @XmlElement(name = "PARTIAL_PAYMENTS")
    protected PARTIALPAYMENTS partialpayments;
    @XmlElement(name = "PAYMENT_COMPONENT_BREAKOUTS")
    protected PAYMENTCOMPONENTBREAKOUTS paymentcomponentbreakouts;
    @XmlElement(name = "PAYMENT_RULE")
    protected PAYMENTRULE paymentrule;
    @XmlElement(name = "PAYMENT_SCHEDULE_ITEMS")
    protected PAYMENTSCHEDULEITEMS paymentscheduleitems;
    @XmlElement(name = "PAYMENT_SUMMARY")
    protected PAYMENTSUMMARY paymentsummary;
    @XmlElement(name = "PERIODIC_LATE_COUNTS")
    protected PERIODICLATECOUNTS periodiclatecounts;
    @XmlElement(name = "SKIP_PAYMENT")
    protected SKIPPAYMENT skippayment;
    @XmlElement(name = "EXTENSION")
    protected PAYMENTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the arrearage property.
     * 
     * @return
     *     possible object is
     *     {@link ARREARAGE }
     *     
     */
    public ARREARAGE getARREARAGE() {
        return arrearage;
    }

    /**
     * Sets the value of the arrearage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARREARAGE }
     *     
     */
    public void setARREARAGE(ARREARAGE value) {
        this.arrearage = value;
    }

    /**
     * Gets the value of the partialpayments property.
     * 
     * @return
     *     possible object is
     *     {@link PARTIALPAYMENTS }
     *     
     */
    public PARTIALPAYMENTS getPARTIALPAYMENTS() {
        return partialpayments;
    }

    /**
     * Sets the value of the partialpayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTIALPAYMENTS }
     *     
     */
    public void setPARTIALPAYMENTS(PARTIALPAYMENTS value) {
        this.partialpayments = value;
    }

    /**
     * Gets the value of the paymentcomponentbreakouts property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTCOMPONENTBREAKOUTS }
     *     
     */
    public PAYMENTCOMPONENTBREAKOUTS getPAYMENTCOMPONENTBREAKOUTS() {
        return paymentcomponentbreakouts;
    }

    /**
     * Sets the value of the paymentcomponentbreakouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTCOMPONENTBREAKOUTS }
     *     
     */
    public void setPAYMENTCOMPONENTBREAKOUTS(PAYMENTCOMPONENTBREAKOUTS value) {
        this.paymentcomponentbreakouts = value;
    }

    /**
     * Gets the value of the paymentrule property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTRULE }
     *     
     */
    public PAYMENTRULE getPAYMENTRULE() {
        return paymentrule;
    }

    /**
     * Sets the value of the paymentrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTRULE }
     *     
     */
    public void setPAYMENTRULE(PAYMENTRULE value) {
        this.paymentrule = value;
    }

    /**
     * Gets the value of the paymentscheduleitems property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSCHEDULEITEMS }
     *     
     */
    public PAYMENTSCHEDULEITEMS getPAYMENTSCHEDULEITEMS() {
        return paymentscheduleitems;
    }

    /**
     * Sets the value of the paymentscheduleitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSCHEDULEITEMS }
     *     
     */
    public void setPAYMENTSCHEDULEITEMS(PAYMENTSCHEDULEITEMS value) {
        this.paymentscheduleitems = value;
    }

    /**
     * Gets the value of the paymentsummary property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSUMMARY }
     *     
     */
    public PAYMENTSUMMARY getPAYMENTSUMMARY() {
        return paymentsummary;
    }

    /**
     * Sets the value of the paymentsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSUMMARY }
     *     
     */
    public void setPAYMENTSUMMARY(PAYMENTSUMMARY value) {
        this.paymentsummary = value;
    }

    /**
     * Gets the value of the periodiclatecounts property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODICLATECOUNTS }
     *     
     */
    public PERIODICLATECOUNTS getPERIODICLATECOUNTS() {
        return periodiclatecounts;
    }

    /**
     * Sets the value of the periodiclatecounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODICLATECOUNTS }
     *     
     */
    public void setPERIODICLATECOUNTS(PERIODICLATECOUNTS value) {
        this.periodiclatecounts = value;
    }

    /**
     * Gets the value of the skippayment property.
     * 
     * @return
     *     possible object is
     *     {@link SKIPPAYMENT }
     *     
     */
    public SKIPPAYMENT getSKIPPAYMENT() {
        return skippayment;
    }

    /**
     * Sets the value of the skippayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKIPPAYMENT }
     *     
     */
    public void setSKIPPAYMENT(SKIPPAYMENT value) {
        this.skippayment = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTEXTENSION }
     *     
     */
    public PAYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTEXTENSION }
     *     
     */
    public void setEXTENSION(PAYMENTEXTENSION value) {
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
