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
 * <p>Java class for DEPRECIATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEPRECIATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepreciationExteriorAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DepreciationExteriorPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="DepreciationFunctionalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DepreciationFunctionalPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="DepreciationPhysicalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DepreciationPhysicalPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="DepreciationTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DEPRECIATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DEPRECIATION", propOrder = {
    "depreciationExteriorAmount",
    "depreciationExteriorPercent",
    "depreciationFunctionalAmount",
    "depreciationFunctionalPercent",
    "depreciationPhysicalAmount",
    "depreciationPhysicalPercent",
    "depreciationTotalAmount",
    "extension"
})
public class DEPRECIATION {

    @XmlElementRef(name = "DepreciationExteriorAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> depreciationExteriorAmount;
    @XmlElementRef(name = "DepreciationExteriorPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> depreciationExteriorPercent;
    @XmlElementRef(name = "DepreciationFunctionalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> depreciationFunctionalAmount;
    @XmlElementRef(name = "DepreciationFunctionalPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> depreciationFunctionalPercent;
    @XmlElementRef(name = "DepreciationPhysicalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> depreciationPhysicalAmount;
    @XmlElementRef(name = "DepreciationPhysicalPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> depreciationPhysicalPercent;
    @XmlElementRef(name = "DepreciationTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> depreciationTotalAmount;
    @XmlElement(name = "EXTENSION")
    protected DEPRECIATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the depreciationExteriorAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getDepreciationExteriorAmount() {
        return depreciationExteriorAmount;
    }

    /**
     * Sets the value of the depreciationExteriorAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setDepreciationExteriorAmount(JAXBElement<MISMOAmount> value) {
        this.depreciationExteriorAmount = value;
    }

    /**
     * Gets the value of the depreciationExteriorPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDepreciationExteriorPercent() {
        return depreciationExteriorPercent;
    }

    /**
     * Sets the value of the depreciationExteriorPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDepreciationExteriorPercent(JAXBElement<MISMOPercent> value) {
        this.depreciationExteriorPercent = value;
    }

    /**
     * Gets the value of the depreciationFunctionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getDepreciationFunctionalAmount() {
        return depreciationFunctionalAmount;
    }

    /**
     * Sets the value of the depreciationFunctionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setDepreciationFunctionalAmount(JAXBElement<MISMOAmount> value) {
        this.depreciationFunctionalAmount = value;
    }

    /**
     * Gets the value of the depreciationFunctionalPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDepreciationFunctionalPercent() {
        return depreciationFunctionalPercent;
    }

    /**
     * Sets the value of the depreciationFunctionalPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDepreciationFunctionalPercent(JAXBElement<MISMOPercent> value) {
        this.depreciationFunctionalPercent = value;
    }

    /**
     * Gets the value of the depreciationPhysicalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getDepreciationPhysicalAmount() {
        return depreciationPhysicalAmount;
    }

    /**
     * Sets the value of the depreciationPhysicalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setDepreciationPhysicalAmount(JAXBElement<MISMOAmount> value) {
        this.depreciationPhysicalAmount = value;
    }

    /**
     * Gets the value of the depreciationPhysicalPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDepreciationPhysicalPercent() {
        return depreciationPhysicalPercent;
    }

    /**
     * Sets the value of the depreciationPhysicalPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDepreciationPhysicalPercent(JAXBElement<MISMOPercent> value) {
        this.depreciationPhysicalPercent = value;
    }

    /**
     * Gets the value of the depreciationTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getDepreciationTotalAmount() {
        return depreciationTotalAmount;
    }

    /**
     * Sets the value of the depreciationTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setDepreciationTotalAmount(JAXBElement<MISMOAmount> value) {
        this.depreciationTotalAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DEPRECIATIONEXTENSION }
     *     
     */
    public DEPRECIATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEPRECIATIONEXTENSION }
     *     
     */
    public void setEXTENSION(DEPRECIATIONEXTENSION value) {
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