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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "APPRAISER")
public class APPRAISER {

    @XmlAttribute(name = "_Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "_CompanyName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String companyName;
    @XmlAttribute(name = "_LicenseIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String licenseIdentifier;
    @XmlAttribute(name = "_LicenseState")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String licenseState;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the licenseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseIdentifier() {
        return licenseIdentifier;
    }

    /**
     * Sets the value of the licenseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseIdentifier(String value) {
        this.licenseIdentifier = value;
    }

    /**
     * Gets the value of the licenseState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseState() {
        return licenseState;
    }

    /**
     * Sets the value of the licenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseState(String value) {
        this.licenseState = value;
    }

}