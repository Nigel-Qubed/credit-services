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
@XmlRootElement(name = "CREDIT_SCORE_MODEL_NAME")
public class CREDITSCOREMODELNAME {

    @XmlAttribute(name = "_Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "_TypeOtherDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeOtherDescription;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOtherDescription() {
        return typeOtherDescription;
    }

    /**
     * Sets the value of the typeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOtherDescription(String value) {
        this.typeOtherDescription = value;
    }

}