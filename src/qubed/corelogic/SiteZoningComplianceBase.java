//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteZoningComplianceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteZoningComplianceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Illegal"/>
 *     &lt;enumeration value="Legal"/>
 *     &lt;enumeration value="LegalNonConforming"/>
 *     &lt;enumeration value="NoZoning"/>
 *     &lt;enumeration value="Undetermined"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteZoningComplianceBase")
@XmlEnum
public enum SiteZoningComplianceBase {

    @XmlEnumValue("Illegal")
    ILLEGAL("Illegal"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("LegalNonConforming")
    LEGAL_NON_CONFORMING("LegalNonConforming"),
    @XmlEnumValue("NoZoning")
    NO_ZONING("NoZoning"),
    @XmlEnumValue("Undetermined")
    UNDETERMINED("Undetermined"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SiteZoningComplianceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteZoningComplianceBase fromValue(String v) {
        for (SiteZoningComplianceBase c: SiteZoningComplianceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
