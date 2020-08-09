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
 * Information about an individual claim request for expenses.
 * 
 * <p>Java class for EXPENSE_CLAIM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXPENSE_CLAIM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpenseClaimCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimFormIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimSubmissionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimSubmissionReasonType" type="{http://www.mismo.org/residential/2009/schemas}ExpenseClaimSubmissionReasonEnum" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimSubmissionReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimSubmissionType" type="{http://www.mismo.org/residential/2009/schemas}ExpenseClaimSubmissionEnum" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimSubmissionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimTotalNonReimbursableAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EXPENSE_CLAIM_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "EXPENSE_CLAIM_DETAIL", propOrder = {
    "expenseClaimCommentText",
    "expenseClaimFormIdentifier",
    "expenseClaimIdentifier",
    "expenseClaimSubmissionIdentifier",
    "expenseClaimSubmissionReasonType",
    "expenseClaimSubmissionReasonTypeOtherDescription",
    "expenseClaimSubmissionType",
    "expenseClaimSubmissionTypeOtherDescription",
    "expenseClaimTotalAmount",
    "expenseClaimTotalNonReimbursableAmount",
    "extension"
})
public class EXPENSECLAIMDETAIL {

    @XmlElementRef(name = "ExpenseClaimCommentText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> expenseClaimCommentText;
    @XmlElementRef(name = "ExpenseClaimFormIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimFormIdentifier;
    @XmlElementRef(name = "ExpenseClaimIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimIdentifier;
    @XmlElementRef(name = "ExpenseClaimSubmissionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimSubmissionIdentifier;
    @XmlElementRef(name = "ExpenseClaimSubmissionReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpenseClaimSubmissionReasonEnum> expenseClaimSubmissionReasonType;
    @XmlElementRef(name = "ExpenseClaimSubmissionReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> expenseClaimSubmissionReasonTypeOtherDescription;
    @XmlElementRef(name = "ExpenseClaimSubmissionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpenseClaimSubmissionEnum> expenseClaimSubmissionType;
    @XmlElementRef(name = "ExpenseClaimSubmissionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> expenseClaimSubmissionTypeOtherDescription;
    @XmlElementRef(name = "ExpenseClaimTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> expenseClaimTotalAmount;
    @XmlElementRef(name = "ExpenseClaimTotalNonReimbursableAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> expenseClaimTotalNonReimbursableAmount;
    @XmlElement(name = "EXTENSION")
    protected EXPENSECLAIMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the expenseClaimCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExpenseClaimCommentText() {
        return expenseClaimCommentText;
    }

    /**
     * Sets the value of the expenseClaimCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExpenseClaimCommentText(JAXBElement<MISMOString> value) {
        this.expenseClaimCommentText = value;
    }

    /**
     * Gets the value of the expenseClaimFormIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimFormIdentifier() {
        return expenseClaimFormIdentifier;
    }

    /**
     * Sets the value of the expenseClaimFormIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimFormIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimFormIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimIdentifier() {
        return expenseClaimIdentifier;
    }

    /**
     * Sets the value of the expenseClaimIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimSubmissionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimSubmissionIdentifier() {
        return expenseClaimSubmissionIdentifier;
    }

    /**
     * Sets the value of the expenseClaimSubmissionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimSubmissionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimSubmissionIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimSubmissionReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimSubmissionReasonEnum }{@code >}
     *     
     */
    public JAXBElement<ExpenseClaimSubmissionReasonEnum> getExpenseClaimSubmissionReasonType() {
        return expenseClaimSubmissionReasonType;
    }

    /**
     * Sets the value of the expenseClaimSubmissionReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimSubmissionReasonEnum }{@code >}
     *     
     */
    public void setExpenseClaimSubmissionReasonType(JAXBElement<ExpenseClaimSubmissionReasonEnum> value) {
        this.expenseClaimSubmissionReasonType = value;
    }

    /**
     * Gets the value of the expenseClaimSubmissionReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExpenseClaimSubmissionReasonTypeOtherDescription() {
        return expenseClaimSubmissionReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the expenseClaimSubmissionReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExpenseClaimSubmissionReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.expenseClaimSubmissionReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the expenseClaimSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimSubmissionEnum }{@code >}
     *     
     */
    public JAXBElement<ExpenseClaimSubmissionEnum> getExpenseClaimSubmissionType() {
        return expenseClaimSubmissionType;
    }

    /**
     * Sets the value of the expenseClaimSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimSubmissionEnum }{@code >}
     *     
     */
    public void setExpenseClaimSubmissionType(JAXBElement<ExpenseClaimSubmissionEnum> value) {
        this.expenseClaimSubmissionType = value;
    }

    /**
     * Gets the value of the expenseClaimSubmissionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExpenseClaimSubmissionTypeOtherDescription() {
        return expenseClaimSubmissionTypeOtherDescription;
    }

    /**
     * Sets the value of the expenseClaimSubmissionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExpenseClaimSubmissionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.expenseClaimSubmissionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the expenseClaimTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getExpenseClaimTotalAmount() {
        return expenseClaimTotalAmount;
    }

    /**
     * Sets the value of the expenseClaimTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setExpenseClaimTotalAmount(JAXBElement<MISMOAmount> value) {
        this.expenseClaimTotalAmount = value;
    }

    /**
     * Gets the value of the expenseClaimTotalNonReimbursableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getExpenseClaimTotalNonReimbursableAmount() {
        return expenseClaimTotalNonReimbursableAmount;
    }

    /**
     * Sets the value of the expenseClaimTotalNonReimbursableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setExpenseClaimTotalNonReimbursableAmount(JAXBElement<MISMOAmount> value) {
        this.expenseClaimTotalNonReimbursableAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EXPENSECLAIMDETAILEXTENSION }
     *     
     */
    public EXPENSECLAIMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPENSECLAIMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(EXPENSECLAIMDETAILEXTENSION value) {
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
