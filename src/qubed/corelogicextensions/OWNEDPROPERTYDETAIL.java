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
 * Information regarding the lien amounts, rental income, maintenance expenses, disposition status and other facts about an owned property.
 * 
 * <p>Java class for OWNED_PROPERTY_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OWNED_PROPERTY_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnedPropertyDispositionStatusType" type="{http://www.mismo.org/residential/2009/schemas}OwnedPropertyDispositionStatusEnum" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyLienInstallmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyLienUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyMaintenanceExpenseAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyOwnedUnitCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyRentalIncomeGrossAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertyRentalIncomeNetAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OwnedPropertySubjectIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}OWNED_PROPERTY_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "OWNED_PROPERTY_DETAIL", propOrder = {
    "ownedPropertyDispositionStatusType",
    "ownedPropertyLienInstallmentAmount",
    "ownedPropertyLienUPBAmount",
    "ownedPropertyMaintenanceExpenseAmount",
    "ownedPropertyOwnedUnitCount",
    "ownedPropertyRentalIncomeGrossAmount",
    "ownedPropertyRentalIncomeNetAmount",
    "ownedPropertySubjectIndicator",
    "extension"
})
public class OWNEDPROPERTYDETAIL {

    @XmlElementRef(name = "OwnedPropertyDispositionStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnedPropertyDispositionStatusEnum> ownedPropertyDispositionStatusType;
    @XmlElementRef(name = "OwnedPropertyLienInstallmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> ownedPropertyLienInstallmentAmount;
    @XmlElementRef(name = "OwnedPropertyLienUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> ownedPropertyLienUPBAmount;
    @XmlElementRef(name = "OwnedPropertyMaintenanceExpenseAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> ownedPropertyMaintenanceExpenseAmount;
    @XmlElementRef(name = "OwnedPropertyOwnedUnitCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> ownedPropertyOwnedUnitCount;
    @XmlElementRef(name = "OwnedPropertyRentalIncomeGrossAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> ownedPropertyRentalIncomeGrossAmount;
    @XmlElementRef(name = "OwnedPropertyRentalIncomeNetAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> ownedPropertyRentalIncomeNetAmount;
    @XmlElementRef(name = "OwnedPropertySubjectIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> ownedPropertySubjectIndicator;
    @XmlElement(name = "EXTENSION")
    protected OWNEDPROPERTYDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ownedPropertyDispositionStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OwnedPropertyDispositionStatusEnum }{@code >}
     *     
     */
    public JAXBElement<OwnedPropertyDispositionStatusEnum> getOwnedPropertyDispositionStatusType() {
        return ownedPropertyDispositionStatusType;
    }

    /**
     * Sets the value of the ownedPropertyDispositionStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OwnedPropertyDispositionStatusEnum }{@code >}
     *     
     */
    public void setOwnedPropertyDispositionStatusType(JAXBElement<OwnedPropertyDispositionStatusEnum> value) {
        this.ownedPropertyDispositionStatusType = value;
    }

    /**
     * Gets the value of the ownedPropertyLienInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getOwnedPropertyLienInstallmentAmount() {
        return ownedPropertyLienInstallmentAmount;
    }

    /**
     * Sets the value of the ownedPropertyLienInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setOwnedPropertyLienInstallmentAmount(JAXBElement<MISMOAmount> value) {
        this.ownedPropertyLienInstallmentAmount = value;
    }

    /**
     * Gets the value of the ownedPropertyLienUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getOwnedPropertyLienUPBAmount() {
        return ownedPropertyLienUPBAmount;
    }

    /**
     * Sets the value of the ownedPropertyLienUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setOwnedPropertyLienUPBAmount(JAXBElement<MISMOAmount> value) {
        this.ownedPropertyLienUPBAmount = value;
    }

    /**
     * Gets the value of the ownedPropertyMaintenanceExpenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getOwnedPropertyMaintenanceExpenseAmount() {
        return ownedPropertyMaintenanceExpenseAmount;
    }

    /**
     * Sets the value of the ownedPropertyMaintenanceExpenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setOwnedPropertyMaintenanceExpenseAmount(JAXBElement<MISMOAmount> value) {
        this.ownedPropertyMaintenanceExpenseAmount = value;
    }

    /**
     * Gets the value of the ownedPropertyOwnedUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getOwnedPropertyOwnedUnitCount() {
        return ownedPropertyOwnedUnitCount;
    }

    /**
     * Sets the value of the ownedPropertyOwnedUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setOwnedPropertyOwnedUnitCount(JAXBElement<MISMOCount> value) {
        this.ownedPropertyOwnedUnitCount = value;
    }

    /**
     * Gets the value of the ownedPropertyRentalIncomeGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getOwnedPropertyRentalIncomeGrossAmount() {
        return ownedPropertyRentalIncomeGrossAmount;
    }

    /**
     * Sets the value of the ownedPropertyRentalIncomeGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setOwnedPropertyRentalIncomeGrossAmount(JAXBElement<MISMOAmount> value) {
        this.ownedPropertyRentalIncomeGrossAmount = value;
    }

    /**
     * Gets the value of the ownedPropertyRentalIncomeNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getOwnedPropertyRentalIncomeNetAmount() {
        return ownedPropertyRentalIncomeNetAmount;
    }

    /**
     * Sets the value of the ownedPropertyRentalIncomeNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setOwnedPropertyRentalIncomeNetAmount(JAXBElement<MISMOAmount> value) {
        this.ownedPropertyRentalIncomeNetAmount = value;
    }

    /**
     * Gets the value of the ownedPropertySubjectIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getOwnedPropertySubjectIndicator() {
        return ownedPropertySubjectIndicator;
    }

    /**
     * Sets the value of the ownedPropertySubjectIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setOwnedPropertySubjectIndicator(JAXBElement<MISMOIndicator> value) {
        this.ownedPropertySubjectIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OWNEDPROPERTYDETAILEXTENSION }
     *     
     */
    public OWNEDPROPERTYDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OWNEDPROPERTYDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(OWNEDPROPERTYDETAILEXTENSION value) {
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