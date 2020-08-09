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
 * <p>Java class for ProjectAspectBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectAspectBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AmenityAndRecreationalFacilities"/>
 *     &lt;enumeration value="AppealToMarket"/>
 *     &lt;enumeration value="ConditionOfExterior"/>
 *     &lt;enumeration value="ConditionOfInterior"/>
 *     &lt;enumeration value="Density"/>
 *     &lt;enumeration value="GeneralAppearance"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="QualityOfConstruction"/>
 *     &lt;enumeration value="UnitMix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectAspectBase")
@XmlEnum
public enum ProjectAspectBase {

    @XmlEnumValue("AmenityAndRecreationalFacilities")
    AMENITY_AND_RECREATIONAL_FACILITIES("AmenityAndRecreationalFacilities"),

    /**
     * subjective judgment of enhanced or adverse marketability factors.
     * 
     */
    @XmlEnumValue("AppealToMarket")
    APPEAL_TO_MARKET("AppealToMarket"),

    /**
     * refers to the outside of walls and roofs of the project buildings.
     * 
     */
    @XmlEnumValue("ConditionOfExterior")
    CONDITION_OF_EXTERIOR("ConditionOfExterior"),

    /**
     * refers to the inside of walls, ceilings, floors of the project buildings.
     * 
     */
    @XmlEnumValue("ConditionOfInterior")
    CONDITION_OF_INTERIOR("ConditionOfInterior"),

    /**
     * e.g. dwellings per acre.
     * 
     */
    @XmlEnumValue("Density")
    DENSITY("Density"),

    /**
     * condition overall project including common areas (vs. Condition Of Exterior).
     * 
     */
    @XmlEnumValue("GeneralAppearance")
    GENERAL_APPEARANCE("GeneralAppearance"),

    /**
     * the time/distance relationships or linkages between a project and all other possible origins and destinations of people going to or coming from the project.
     * 
     */
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("QualityOfConstruction")
    QUALITY_OF_CONSTRUCTION("QualityOfConstruction"),

    /**
     * A detailed breakdown of the various types of units within the project.
     * 
     */
    @XmlEnumValue("UnitMix")
    UNIT_MIX("UnitMix");
    private final String value;

    ProjectAspectBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectAspectBase fromValue(String v) {
        for (ProjectAspectBase c: ProjectAspectBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
