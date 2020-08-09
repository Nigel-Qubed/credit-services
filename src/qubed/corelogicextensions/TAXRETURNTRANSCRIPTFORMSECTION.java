//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAX_RETURN_TRANSCRIPT_FORM_SECTION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_RETURN_TRANSCRIPT_FORM_SECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAX_RETURN_TRANSCRIPT_FORM_SECTION_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}TAX_RETURN_TRANSCRIPT_FORM_SECTION_DETAIL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TAX_RETURN_TRANSCRIPT_FORM_SECTION_FIELDS" type="{http://globalgateway.corelogic.com/order/2015}TAX_RETURN_TRANSCRIPT_FORM_SECTION_FIELDS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_RETURN_TRANSCRIPT_FORM_SECTION", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "taxreturntranscriptformsectiondetail",
    "taxreturntranscriptformsectionfields"
})
public class TAXRETURNTRANSCRIPTFORMSECTION {

    @XmlElement(name = "TAX_RETURN_TRANSCRIPT_FORM_SECTION_DETAIL")
    protected List<TAXRETURNTRANSCRIPTFORMSECTIONDETAIL> taxreturntranscriptformsectiondetail;
    @XmlElement(name = "TAX_RETURN_TRANSCRIPT_FORM_SECTION_FIELDS")
    protected TAXRETURNTRANSCRIPTFORMSECTIONFIELDS taxreturntranscriptformsectionfields;
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;

    /**
     * Gets the value of the taxreturntranscriptformsectiondetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxreturntranscriptformsectiondetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAXRETURNTRANSCRIPTFORMSECTIONDETAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXRETURNTRANSCRIPTFORMSECTIONDETAIL }
     * 
     * 
     */
    public List<TAXRETURNTRANSCRIPTFORMSECTIONDETAIL> getTAXRETURNTRANSCRIPTFORMSECTIONDETAIL() {
        if (taxreturntranscriptformsectiondetail == null) {
            taxreturntranscriptformsectiondetail = new ArrayList<TAXRETURNTRANSCRIPTFORMSECTIONDETAIL>();
        }
        return this.taxreturntranscriptformsectiondetail;
    }

    /**
     * Gets the value of the taxreturntranscriptformsectionfields property.
     * 
     * @return
     *     possible object is
     *     {@link TAXRETURNTRANSCRIPTFORMSECTIONFIELDS }
     *     
     */
    public TAXRETURNTRANSCRIPTFORMSECTIONFIELDS getTAXRETURNTRANSCRIPTFORMSECTIONFIELDS() {
        return taxreturntranscriptformsectionfields;
    }

    /**
     * Sets the value of the taxreturntranscriptformsectionfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXRETURNTRANSCRIPTFORMSECTIONFIELDS }
     *     
     */
    public void setTAXRETURNTRANSCRIPTFORMSECTIONFIELDS(TAXRETURNTRANSCRIPTFORMSECTIONFIELDS value) {
        this.taxreturntranscriptformsectionfields = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

}