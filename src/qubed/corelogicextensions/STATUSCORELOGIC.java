//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for STATUS_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STATUS_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusCommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STATUS_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "statusCreatedDatetime",
    "statusCommentText"
})
public class STATUSCORELOGIC {

    @XmlElement(name = "StatusCreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusCreatedDatetime;
    @XmlElement(name = "StatusCommentText")
    protected String statusCommentText;

    /**
     * Gets the value of the statusCreatedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusCreatedDatetime() {
        return statusCreatedDatetime;
    }

    /**
     * Sets the value of the statusCreatedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusCreatedDatetime(XMLGregorianCalendar value) {
        this.statusCreatedDatetime = value;
    }

    /**
     * Gets the value of the statusCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCommentText() {
        return statusCommentText;
    }

    /**
     * Sets the value of the statusCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCommentText(String value) {
        this.statusCommentText = value;
    }

}
