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
 * <p>Java class for HazardInsuranceCoverageBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HazardInsuranceCoverageBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Earthquake"/>
 *     &lt;enumeration value="FireAndExtendedCoverage"/>
 *     &lt;enumeration value="Flood"/>
 *     &lt;enumeration value="Hazard"/>
 *     &lt;enumeration value="Homeowners"/>
 *     &lt;enumeration value="Hurricane"/>
 *     &lt;enumeration value="InsectInfestation"/>
 *     &lt;enumeration value="Leasehold"/>
 *     &lt;enumeration value="MineSubsidence"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PersonalProperty"/>
 *     &lt;enumeration value="Storm"/>
 *     &lt;enumeration value="Tornado"/>
 *     &lt;enumeration value="Volcano"/>
 *     &lt;enumeration value="Wind"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardInsuranceCoverageBase")
@XmlEnum
public enum HazardInsuranceCoverageBase {

    @XmlEnumValue("Earthquake")
    EARTHQUAKE("Earthquake"),
    @XmlEnumValue("FireAndExtendedCoverage")
    FIRE_AND_EXTENDED_COVERAGE("FireAndExtendedCoverage"),
    @XmlEnumValue("Flood")
    FLOOD("Flood"),
    @XmlEnumValue("Hazard")
    HAZARD("Hazard"),
    @XmlEnumValue("Homeowners")
    HOMEOWNERS("Homeowners"),
    @XmlEnumValue("Hurricane")
    HURRICANE("Hurricane"),
    @XmlEnumValue("InsectInfestation")
    INSECT_INFESTATION("InsectInfestation"),
    @XmlEnumValue("Leasehold")
    LEASEHOLD("Leasehold"),
    @XmlEnumValue("MineSubsidence")
    MINE_SUBSIDENCE("MineSubsidence"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PersonalProperty")
    PERSONAL_PROPERTY("PersonalProperty"),
    @XmlEnumValue("Storm")
    STORM("Storm"),
    @XmlEnumValue("Tornado")
    TORNADO("Tornado"),
    @XmlEnumValue("Volcano")
    VOLCANO("Volcano"),
    @XmlEnumValue("Wind")
    WIND("Wind");
    private final String value;

    HazardInsuranceCoverageBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazardInsuranceCoverageBase fromValue(String v) {
        for (HazardInsuranceCoverageBase c: HazardInsuranceCoverageBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}