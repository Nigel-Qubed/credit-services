//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hmdarace"
})
@XmlRootElement(name = "GOVERNMENT_MONITORING")
public class GOVERNMENTMONITORING {

    @XmlAttribute(name = "GenderType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String genderType;
    @XmlAttribute(name = "OtherRaceNationalOriginDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String otherRaceNationalOriginDescription;
    @XmlAttribute(name = "RaceNationalOriginRefusalIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String raceNationalOriginRefusalIndicator;
    @XmlAttribute(name = "RaceNationalOriginType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String raceNationalOriginType;
    @XmlAttribute(name = "HMDAEthnicityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hmdaEthnicityType;
    @XmlElement(name = "HMDA_RACE")
    protected List<HMDARACE> hmdarace;

    /**
     * Gets the value of the genderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderType() {
        return genderType;
    }

    /**
     * Sets the value of the genderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderType(String value) {
        this.genderType = value;
    }

    /**
     * Gets the value of the otherRaceNationalOriginDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRaceNationalOriginDescription() {
        return otherRaceNationalOriginDescription;
    }

    /**
     * Sets the value of the otherRaceNationalOriginDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRaceNationalOriginDescription(String value) {
        this.otherRaceNationalOriginDescription = value;
    }

    /**
     * Gets the value of the raceNationalOriginRefusalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceNationalOriginRefusalIndicator() {
        return raceNationalOriginRefusalIndicator;
    }

    /**
     * Sets the value of the raceNationalOriginRefusalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceNationalOriginRefusalIndicator(String value) {
        this.raceNationalOriginRefusalIndicator = value;
    }

    /**
     * Gets the value of the raceNationalOriginType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceNationalOriginType() {
        return raceNationalOriginType;
    }

    /**
     * Sets the value of the raceNationalOriginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceNationalOriginType(String value) {
        this.raceNationalOriginType = value;
    }

    /**
     * Gets the value of the hmdaEthnicityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMDAEthnicityType() {
        return hmdaEthnicityType;
    }

    /**
     * Sets the value of the hmdaEthnicityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMDAEthnicityType(String value) {
        this.hmdaEthnicityType = value;
    }

    /**
     * Gets the value of the hmdarace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hmdarace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHMDARACE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HMDARACE }
     * 
     * 
     */
    public List<HMDARACE> getHMDARACE() {
        if (hmdarace == null) {
            hmdarace = new ArrayList<HMDARACE>();
        }
        return this.hmdarace;
    }

}
