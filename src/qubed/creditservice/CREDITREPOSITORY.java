//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CREDIT_REPOSITORY")
public class CREDITREPOSITORY {

    @XmlAttribute(name = "_SourceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sourceType;
    @XmlAttribute(name = "_SourceTypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourceTypeOtherDescription;
    @XmlAttribute(name = "_SubscriberCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subscriberCode;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTypeOtherDescription() {
        return sourceTypeOtherDescription;
    }

    /**
     * Sets the value of the sourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTypeOtherDescription(String value) {
        this.sourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the subscriberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberCode() {
        return subscriberCode;
    }

    /**
     * Sets the value of the subscriberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberCode(String value) {
        this.subscriberCode = value;
    }

}