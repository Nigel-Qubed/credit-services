//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QUESTION_CHOICE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUESTION_CHOICE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChoiceIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ChoiceDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ChoiceSelectedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUESTION_CHOICE", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "choiceIdentifier",
    "choiceDescription",
    "choiceSelectedIndicator"
})
public class QUESTIONCHOICE {

    @XmlElement(name = "ChoiceIdentifier")
    protected MISMOString choiceIdentifier;
    @XmlElement(name = "ChoiceDescription")
    protected MISMOString choiceDescription;
    @XmlElement(name = "ChoiceSelectedIndicator")
    protected MISMOString choiceSelectedIndicator;

    /**
     * Gets the value of the choiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getChoiceIdentifier() {
        return choiceIdentifier;
    }

    /**
     * Sets the value of the choiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setChoiceIdentifier(MISMOString value) {
        this.choiceIdentifier = value;
    }

    /**
     * Gets the value of the choiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getChoiceDescription() {
        return choiceDescription;
    }

    /**
     * Sets the value of the choiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setChoiceDescription(MISMOString value) {
        this.choiceDescription = value;
    }

    /**
     * Gets the value of the choiceSelectedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOString }
     *     
     */
    public MISMOString getChoiceSelectedIndicator() {
        return choiceSelectedIndicator;
    }

    /**
     * Sets the value of the choiceSelectedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOString }
     *     
     */
    public void setChoiceSelectedIndicator(MISMOString value) {
        this.choiceSelectedIndicator = value;
    }

}
