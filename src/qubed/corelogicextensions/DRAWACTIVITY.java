//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for DRAW_ACTIVITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DRAW_ACTIVITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialDrawIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LoanDrawAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanDrawDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanTotalDrawAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DRAW_ACTIVITY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DRAW_ACTIVITY", propOrder = {
    "initialDrawIndicator",
    "loanDrawAmount",
    "loanDrawDate",
    "loanTotalDrawAmount",
    "extension"
})
public class DRAWACTIVITY {

    @XmlElementRef(name = "InitialDrawIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> initialDrawIndicator;
    @XmlElementRef(name = "LoanDrawAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanDrawAmount;
    @XmlElementRef(name = "LoanDrawDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanDrawDate;
    @XmlElementRef(name = "LoanTotalDrawAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanTotalDrawAmount;
    @XmlElement(name = "EXTENSION")
    protected DRAWACTIVITYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the initialDrawIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInitialDrawIndicator() {
        return initialDrawIndicator;
    }

    /**
     * Sets the value of the initialDrawIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInitialDrawIndicator(JAXBElement<MISMOIndicator> value) {
        this.initialDrawIndicator = value;
    }

    /**
     * Gets the value of the loanDrawAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLoanDrawAmount() {
        return loanDrawAmount;
    }

    /**
     * Sets the value of the loanDrawAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLoanDrawAmount(JAXBElement<MISMOAmount> value) {
        this.loanDrawAmount = value;
    }

    /**
     * Gets the value of the loanDrawDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanDrawDate() {
        return loanDrawDate;
    }

    /**
     * Sets the value of the loanDrawDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanDrawDate(JAXBElement<MISMODate> value) {
        this.loanDrawDate = value;
    }

    /**
     * Gets the value of the loanTotalDrawAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLoanTotalDrawAmount() {
        return loanTotalDrawAmount;
    }

    /**
     * Sets the value of the loanTotalDrawAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLoanTotalDrawAmount(JAXBElement<MISMOAmount> value) {
        this.loanTotalDrawAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DRAWACTIVITYEXTENSION }
     *     
     */
    public DRAWACTIVITYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRAWACTIVITYEXTENSION }
     *     
     */
    public void setEXTENSION(DRAWACTIVITYEXTENSION value) {
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
