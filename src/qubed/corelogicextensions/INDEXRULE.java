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
 * <p>Java class for INDEX_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INDEX_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndexAveragingIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="IndexAveragingType" type="{http://www.mismo.org/residential/2009/schemas}IndexAveragingEnum" minOccurs="0"/>
 *         &lt;element name="IndexAveragingValueCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="IndexCalculationMethodType" type="{http://www.mismo.org/residential/2009/schemas}IndexCalculationMethodEnum" minOccurs="0"/>
 *         &lt;element name="IndexDesignationType" type="{http://www.mismo.org/residential/2009/schemas}IndexDesignationEnum" minOccurs="0"/>
 *         &lt;element name="IndexLeadMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="IndexLookbackType" type="{http://www.mismo.org/residential/2009/schemas}IndexLookbackEnum" minOccurs="0"/>
 *         &lt;element name="IndexLookbackTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IndexRoundingPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="IndexRoundingTimingType" type="{http://www.mismo.org/residential/2009/schemas}IndexRoundingTimingEnum" minOccurs="0"/>
 *         &lt;element name="IndexRoundingType" type="{http://www.mismo.org/residential/2009/schemas}IndexRoundingEnum" minOccurs="0"/>
 *         &lt;element name="IndexSourceType" type="{http://www.mismo.org/residential/2009/schemas}IndexSourceEnum" minOccurs="0"/>
 *         &lt;element name="IndexSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IndexType" type="{http://www.mismo.org/residential/2009/schemas}IndexEnum" minOccurs="0"/>
 *         &lt;element name="IndexTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InterestAdjustmentIndexLeadDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="InterestAndPaymentAdjustmentIndexLeadDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="MinimumIndexMovementRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="PaymentsBetweenIndexValuesCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PaymentsToFirstIndexValueCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INDEX_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INDEX_RULE", propOrder = {
    "indexAveragingIndicator",
    "indexAveragingType",
    "indexAveragingValueCount",
    "indexCalculationMethodType",
    "indexDesignationType",
    "indexLeadMonthsCount",
    "indexLookbackType",
    "indexLookbackTypeOtherDescription",
    "indexRoundingPercent",
    "indexRoundingTimingType",
    "indexRoundingType",
    "indexSourceType",
    "indexSourceTypeOtherDescription",
    "indexType",
    "indexTypeOtherDescription",
    "interestAdjustmentIndexLeadDaysCount",
    "interestAndPaymentAdjustmentIndexLeadDaysCount",
    "minimumIndexMovementRatePercent",
    "paymentsBetweenIndexValuesCount",
    "paymentsToFirstIndexValueCount",
    "extension"
})
public class INDEXRULE {

    @XmlElementRef(name = "IndexAveragingIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> indexAveragingIndicator;
    @XmlElementRef(name = "IndexAveragingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexAveragingEnum> indexAveragingType;
    @XmlElementRef(name = "IndexAveragingValueCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> indexAveragingValueCount;
    @XmlElementRef(name = "IndexCalculationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexCalculationMethodEnum> indexCalculationMethodType;
    @XmlElementRef(name = "IndexDesignationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexDesignationEnum> indexDesignationType;
    @XmlElementRef(name = "IndexLeadMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> indexLeadMonthsCount;
    @XmlElementRef(name = "IndexLookbackType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexLookbackEnum> indexLookbackType;
    @XmlElementRef(name = "IndexLookbackTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> indexLookbackTypeOtherDescription;
    @XmlElementRef(name = "IndexRoundingPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> indexRoundingPercent;
    @XmlElementRef(name = "IndexRoundingTimingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexRoundingTimingEnum> indexRoundingTimingType;
    @XmlElementRef(name = "IndexRoundingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexRoundingEnum> indexRoundingType;
    @XmlElementRef(name = "IndexSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexSourceEnum> indexSourceType;
    @XmlElementRef(name = "IndexSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> indexSourceTypeOtherDescription;
    @XmlElementRef(name = "IndexType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexEnum> indexType;
    @XmlElementRef(name = "IndexTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> indexTypeOtherDescription;
    @XmlElementRef(name = "InterestAdjustmentIndexLeadDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> interestAdjustmentIndexLeadDaysCount;
    @XmlElementRef(name = "InterestAndPaymentAdjustmentIndexLeadDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> interestAndPaymentAdjustmentIndexLeadDaysCount;
    @XmlElementRef(name = "MinimumIndexMovementRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> minimumIndexMovementRatePercent;
    @XmlElementRef(name = "PaymentsBetweenIndexValuesCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> paymentsBetweenIndexValuesCount;
    @XmlElementRef(name = "PaymentsToFirstIndexValueCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> paymentsToFirstIndexValueCount;
    @XmlElement(name = "EXTENSION")
    protected INDEXRULEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the indexAveragingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getIndexAveragingIndicator() {
        return indexAveragingIndicator;
    }

    /**
     * Sets the value of the indexAveragingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setIndexAveragingIndicator(JAXBElement<MISMOIndicator> value) {
        this.indexAveragingIndicator = value;
    }

    /**
     * Gets the value of the indexAveragingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexAveragingEnum }{@code >}
     *     
     */
    public JAXBElement<IndexAveragingEnum> getIndexAveragingType() {
        return indexAveragingType;
    }

    /**
     * Sets the value of the indexAveragingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexAveragingEnum }{@code >}
     *     
     */
    public void setIndexAveragingType(JAXBElement<IndexAveragingEnum> value) {
        this.indexAveragingType = value;
    }

    /**
     * Gets the value of the indexAveragingValueCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getIndexAveragingValueCount() {
        return indexAveragingValueCount;
    }

    /**
     * Sets the value of the indexAveragingValueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setIndexAveragingValueCount(JAXBElement<MISMOCount> value) {
        this.indexAveragingValueCount = value;
    }

    /**
     * Gets the value of the indexCalculationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexCalculationMethodEnum }{@code >}
     *     
     */
    public JAXBElement<IndexCalculationMethodEnum> getIndexCalculationMethodType() {
        return indexCalculationMethodType;
    }

    /**
     * Sets the value of the indexCalculationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexCalculationMethodEnum }{@code >}
     *     
     */
    public void setIndexCalculationMethodType(JAXBElement<IndexCalculationMethodEnum> value) {
        this.indexCalculationMethodType = value;
    }

    /**
     * Gets the value of the indexDesignationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexDesignationEnum }{@code >}
     *     
     */
    public JAXBElement<IndexDesignationEnum> getIndexDesignationType() {
        return indexDesignationType;
    }

    /**
     * Sets the value of the indexDesignationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexDesignationEnum }{@code >}
     *     
     */
    public void setIndexDesignationType(JAXBElement<IndexDesignationEnum> value) {
        this.indexDesignationType = value;
    }

    /**
     * Gets the value of the indexLeadMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getIndexLeadMonthsCount() {
        return indexLeadMonthsCount;
    }

    /**
     * Sets the value of the indexLeadMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setIndexLeadMonthsCount(JAXBElement<MISMOCount> value) {
        this.indexLeadMonthsCount = value;
    }

    /**
     * Gets the value of the indexLookbackType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexLookbackEnum }{@code >}
     *     
     */
    public JAXBElement<IndexLookbackEnum> getIndexLookbackType() {
        return indexLookbackType;
    }

    /**
     * Sets the value of the indexLookbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexLookbackEnum }{@code >}
     *     
     */
    public void setIndexLookbackType(JAXBElement<IndexLookbackEnum> value) {
        this.indexLookbackType = value;
    }

    /**
     * Gets the value of the indexLookbackTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIndexLookbackTypeOtherDescription() {
        return indexLookbackTypeOtherDescription;
    }

    /**
     * Sets the value of the indexLookbackTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIndexLookbackTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.indexLookbackTypeOtherDescription = value;
    }

    /**
     * Gets the value of the indexRoundingPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getIndexRoundingPercent() {
        return indexRoundingPercent;
    }

    /**
     * Sets the value of the indexRoundingPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setIndexRoundingPercent(JAXBElement<MISMOPercent> value) {
        this.indexRoundingPercent = value;
    }

    /**
     * Gets the value of the indexRoundingTimingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexRoundingTimingEnum }{@code >}
     *     
     */
    public JAXBElement<IndexRoundingTimingEnum> getIndexRoundingTimingType() {
        return indexRoundingTimingType;
    }

    /**
     * Sets the value of the indexRoundingTimingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexRoundingTimingEnum }{@code >}
     *     
     */
    public void setIndexRoundingTimingType(JAXBElement<IndexRoundingTimingEnum> value) {
        this.indexRoundingTimingType = value;
    }

    /**
     * Gets the value of the indexRoundingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexRoundingEnum }{@code >}
     *     
     */
    public JAXBElement<IndexRoundingEnum> getIndexRoundingType() {
        return indexRoundingType;
    }

    /**
     * Sets the value of the indexRoundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexRoundingEnum }{@code >}
     *     
     */
    public void setIndexRoundingType(JAXBElement<IndexRoundingEnum> value) {
        this.indexRoundingType = value;
    }

    /**
     * Gets the value of the indexSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexSourceEnum }{@code >}
     *     
     */
    public JAXBElement<IndexSourceEnum> getIndexSourceType() {
        return indexSourceType;
    }

    /**
     * Sets the value of the indexSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexSourceEnum }{@code >}
     *     
     */
    public void setIndexSourceType(JAXBElement<IndexSourceEnum> value) {
        this.indexSourceType = value;
    }

    /**
     * Gets the value of the indexSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIndexSourceTypeOtherDescription() {
        return indexSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the indexSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIndexSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.indexSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the indexType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexEnum }{@code >}
     *     
     */
    public JAXBElement<IndexEnum> getIndexType() {
        return indexType;
    }

    /**
     * Sets the value of the indexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexEnum }{@code >}
     *     
     */
    public void setIndexType(JAXBElement<IndexEnum> value) {
        this.indexType = value;
    }

    /**
     * Gets the value of the indexTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIndexTypeOtherDescription() {
        return indexTypeOtherDescription;
    }

    /**
     * Sets the value of the indexTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIndexTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.indexTypeOtherDescription = value;
    }

    /**
     * Gets the value of the interestAdjustmentIndexLeadDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getInterestAdjustmentIndexLeadDaysCount() {
        return interestAdjustmentIndexLeadDaysCount;
    }

    /**
     * Sets the value of the interestAdjustmentIndexLeadDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setInterestAdjustmentIndexLeadDaysCount(JAXBElement<MISMOCount> value) {
        this.interestAdjustmentIndexLeadDaysCount = value;
    }

    /**
     * Gets the value of the interestAndPaymentAdjustmentIndexLeadDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getInterestAndPaymentAdjustmentIndexLeadDaysCount() {
        return interestAndPaymentAdjustmentIndexLeadDaysCount;
    }

    /**
     * Sets the value of the interestAndPaymentAdjustmentIndexLeadDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setInterestAndPaymentAdjustmentIndexLeadDaysCount(JAXBElement<MISMOCount> value) {
        this.interestAndPaymentAdjustmentIndexLeadDaysCount = value;
    }

    /**
     * Gets the value of the minimumIndexMovementRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMinimumIndexMovementRatePercent() {
        return minimumIndexMovementRatePercent;
    }

    /**
     * Sets the value of the minimumIndexMovementRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMinimumIndexMovementRatePercent(JAXBElement<MISMOPercent> value) {
        this.minimumIndexMovementRatePercent = value;
    }

    /**
     * Gets the value of the paymentsBetweenIndexValuesCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPaymentsBetweenIndexValuesCount() {
        return paymentsBetweenIndexValuesCount;
    }

    /**
     * Sets the value of the paymentsBetweenIndexValuesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPaymentsBetweenIndexValuesCount(JAXBElement<MISMOCount> value) {
        this.paymentsBetweenIndexValuesCount = value;
    }

    /**
     * Gets the value of the paymentsToFirstIndexValueCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPaymentsToFirstIndexValueCount() {
        return paymentsToFirstIndexValueCount;
    }

    /**
     * Sets the value of the paymentsToFirstIndexValueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPaymentsToFirstIndexValueCount(JAXBElement<MISMOCount> value) {
        this.paymentsToFirstIndexValueCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INDEXRULEEXTENSION }
     *     
     */
    public INDEXRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXRULEEXTENSION }
     *     
     */
    public void setEXTENSION(INDEXRULEEXTENSION value) {
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