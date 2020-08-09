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
 * <p>Java class for UniqueDwellingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UniqueDwellingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EarthShelterHome"/>
 *     &lt;enumeration value="GeodesicDome"/>
 *     &lt;enumeration value="Houseboat"/>
 *     &lt;enumeration value="LogHome"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UniqueDwellingBase")
@XmlEnum
public enum UniqueDwellingBase {


    /**
     * A dwelling built with mounds of dirt (earth) covering one or more exterior walls and/or roof.
     * 
     */
    @XmlEnumValue("EarthShelterHome")
    EARTH_SHELTER_HOME("EarthShelterHome"),

    /**
     * A spherical structure designed as a dwelling unit.
     * 
     */
    @XmlEnumValue("GeodesicDome")
    GEODESIC_DOME("GeodesicDome"),

    /**
     * A boat that has been designed or modified to be used primarily as a dwelling unit.
     * 
     */
    @XmlEnumValue("Houseboat")
    HOUSEBOAT("Houseboat"),

    /**
     * A dwelling made from logs that have not been milled in to conventional lumber.
     * 
     */
    @XmlEnumValue("LogHome")
    LOG_HOME("LogHome"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UniqueDwellingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UniqueDwellingBase fromValue(String v) {
        for (UniqueDwellingBase c: UniqueDwellingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
