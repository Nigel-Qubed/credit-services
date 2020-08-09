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
 * <p>Java class for SiteViewBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteViewBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CityStreet"/>
 *     &lt;enumeration value="GolfCourse"/>
 *     &lt;enumeration value="Industrial"/>
 *     &lt;enumeration value="LimitedSight"/>
 *     &lt;enumeration value="MountainView"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Park"/>
 *     &lt;enumeration value="Pastoral"/>
 *     &lt;enumeration value="PowerLines"/>
 *     &lt;enumeration value="Residential"/>
 *     &lt;enumeration value="Skyline"/>
 *     &lt;enumeration value="Traffic"/>
 *     &lt;enumeration value="WaterView"/>
 *     &lt;enumeration value="Woods"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteViewBase")
@XmlEnum
public enum SiteViewBase {

    @XmlEnumValue("CityStreet")
    CITY_STREET("CityStreet"),
    @XmlEnumValue("GolfCourse")
    GOLF_COURSE("GolfCourse"),
    @XmlEnumValue("Industrial")
    INDUSTRIAL("Industrial"),
    @XmlEnumValue("LimitedSight")
    LIMITED_SIGHT("LimitedSight"),
    @XmlEnumValue("MountainView")
    MOUNTAIN_VIEW("MountainView"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Park")
    PARK("Park"),
    @XmlEnumValue("Pastoral")
    PASTORAL("Pastoral"),
    @XmlEnumValue("PowerLines")
    POWER_LINES("PowerLines"),
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),
    @XmlEnumValue("Skyline")
    SKYLINE("Skyline"),
    @XmlEnumValue("Traffic")
    TRAFFIC("Traffic"),
    @XmlEnumValue("WaterView")
    WATER_VIEW("WaterView"),
    @XmlEnumValue("Woods")
    WOODS("Woods");
    private final String value;

    SiteViewBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteViewBase fromValue(String v) {
        for (SiteViewBase c: SiteViewBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
