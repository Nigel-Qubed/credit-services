//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteInfluenceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteInfluenceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Easements"/>
 *     &lt;enumeration value="Encroachments"/>
 *     &lt;enumeration value="EnvironmentalConditions"/>
 *     &lt;enumeration value="LandUses"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="View"/>
 *     &lt;enumeration value="WaterRights"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteInfluenceBase")
@XmlEnum
public enum SiteInfluenceBase {

    @XmlEnumValue("Easements")
    EASEMENTS("Easements"),
    @XmlEnumValue("Encroachments")
    ENCROACHMENTS("Encroachments"),
    @XmlEnumValue("EnvironmentalConditions")
    ENVIRONMENTAL_CONDITIONS("EnvironmentalConditions"),
    @XmlEnumValue("LandUses")
    LAND_USES("LandUses"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("View")
    VIEW("View"),
    @XmlEnumValue("WaterRights")
    WATER_RIGHTS("WaterRights");
    private final String value;

    SiteInfluenceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteInfluenceBase fromValue(String v) {
        for (SiteInfluenceBase c: SiteInfluenceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
