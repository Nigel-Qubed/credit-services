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
 * <p>Java class for BathEquipmentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BathEquipmentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AutomaticVentSystem"/>
 *     &lt;enumeration value="DualSinks"/>
 *     &lt;enumeration value="GardenTub"/>
 *     &lt;enumeration value="HeatedFloors"/>
 *     &lt;enumeration value="HeatLamps"/>
 *     &lt;enumeration value="LowFlowShowerheads"/>
 *     &lt;enumeration value="LowFlushToliet"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RomanShower"/>
 *     &lt;enumeration value="SingleSink"/>
 *     &lt;enumeration value="SolidSurfaceManmadeCountertop"/>
 *     &lt;enumeration value="SolidSurfaceNaturalCountertop"/>
 *     &lt;enumeration value="StallShower"/>
 *     &lt;enumeration value="SteamShower"/>
 *     &lt;enumeration value="TubShower"/>
 *     &lt;enumeration value="Vanity"/>
 *     &lt;enumeration value="WaterEffecientFaucet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BathEquipmentBase")
@XmlEnum
public enum BathEquipmentBase {

    @XmlEnumValue("AutomaticVentSystem")
    AUTOMATIC_VENT_SYSTEM("AutomaticVentSystem"),
    @XmlEnumValue("DualSinks")
    DUAL_SINKS("DualSinks"),
    @XmlEnumValue("GardenTub")
    GARDEN_TUB("GardenTub"),
    @XmlEnumValue("HeatedFloors")
    HEATED_FLOORS("HeatedFloors"),
    @XmlEnumValue("HeatLamps")
    HEAT_LAMPS("HeatLamps"),
    @XmlEnumValue("LowFlowShowerheads")
    LOW_FLOW_SHOWERHEADS("LowFlowShowerheads"),
    @XmlEnumValue("LowFlushToliet")
    LOW_FLUSH_TOLIET("LowFlushToliet"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("RomanShower")
    ROMAN_SHOWER("RomanShower"),
    @XmlEnumValue("SingleSink")
    SINGLE_SINK("SingleSink"),
    @XmlEnumValue("SolidSurfaceManmadeCountertop")
    SOLID_SURFACE_MANMADE_COUNTERTOP("SolidSurfaceManmadeCountertop"),
    @XmlEnumValue("SolidSurfaceNaturalCountertop")
    SOLID_SURFACE_NATURAL_COUNTERTOP("SolidSurfaceNaturalCountertop"),
    @XmlEnumValue("StallShower")
    STALL_SHOWER("StallShower"),
    @XmlEnumValue("SteamShower")
    STEAM_SHOWER("SteamShower"),
    @XmlEnumValue("TubShower")
    TUB_SHOWER("TubShower"),
    @XmlEnumValue("Vanity")
    VANITY("Vanity"),
    @XmlEnumValue("WaterEffecientFaucet")
    WATER_EFFECIENT_FAUCET("WaterEffecientFaucet");
    private final String value;

    BathEquipmentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BathEquipmentBase fromValue(String v) {
        for (BathEquipmentBase c: BathEquipmentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}