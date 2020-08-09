//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * A state-licensed or state-certified appraiser who acts as a supervisor and takes responsibility for the work prepared by a named associated apprentice or trainee appraiser.
 * 
 * <p>Java class for APPRAISER_SUPERVISOR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPRAISER_SUPERVISOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPRAISER_SUPERVISOR_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}APPRAISER_SUPERVISOR_DETAIL" minOccurs="0"/>
 *         &lt;element name="DESIGNATIONS" type="{http://www.mismo.org/residential/2009/schemas}DESIGNATIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}APPRAISER_SUPERVISOR_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "APPRAISER_SUPERVISOR", propOrder = {
    "appraisersupervisordetail",
    "designations",
    "extension"
})
public class APPRAISERSUPERVISOR {

    @XmlElement(name = "APPRAISER_SUPERVISOR_DETAIL")
    protected APPRAISERSUPERVISORDETAIL appraisersupervisordetail;
    @XmlElement(name = "DESIGNATIONS")
    protected DESIGNATIONS designations;
    @XmlElement(name = "EXTENSION")
    protected APPRAISERSUPERVISOREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraisersupervisordetail property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISERSUPERVISORDETAIL }
     *     
     */
    public APPRAISERSUPERVISORDETAIL getAPPRAISERSUPERVISORDETAIL() {
        return appraisersupervisordetail;
    }

    /**
     * Sets the value of the appraisersupervisordetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISERSUPERVISORDETAIL }
     *     
     */
    public void setAPPRAISERSUPERVISORDETAIL(APPRAISERSUPERVISORDETAIL value) {
        this.appraisersupervisordetail = value;
    }

    /**
     * Gets the value of the designations property.
     * 
     * @return
     *     possible object is
     *     {@link DESIGNATIONS }
     *     
     */
    public DESIGNATIONS getDESIGNATIONS() {
        return designations;
    }

    /**
     * Sets the value of the designations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESIGNATIONS }
     *     
     */
    public void setDESIGNATIONS(DESIGNATIONS value) {
        this.designations = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISERSUPERVISOREXTENSION }
     *     
     */
    public APPRAISERSUPERVISOREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISERSUPERVISOREXTENSION }
     *     
     */
    public void setEXTENSION(APPRAISERSUPERVISOREXTENSION value) {
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
