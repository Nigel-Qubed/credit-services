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
 * <p>Java class for EnvironmentalConditionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentalConditionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Asbestos"/>
 *     &lt;enumeration value="EPAFinalSuperfundSiteProximate"/>
 *     &lt;enumeration value="FormerDrugLab"/>
 *     &lt;enumeration value="LandfillProximate"/>
 *     &lt;enumeration value="LeadBasedPaint"/>
 *     &lt;enumeration value="LeakingUndergroundPetroleumStorageTank"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="VaporIntrusion"/>
 *     &lt;enumeration value="WellWaterContamination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalConditionBase")
@XmlEnum
public enum EnvironmentalConditionBase {

    @XmlEnumValue("Asbestos")
    ASBESTOS("Asbestos"),
    @XmlEnumValue("EPAFinalSuperfundSiteProximate")
    EPA_FINAL_SUPERFUND_SITE_PROXIMATE("EPAFinalSuperfundSiteProximate"),
    @XmlEnumValue("FormerDrugLab")
    FORMER_DRUG_LAB("FormerDrugLab"),
    @XmlEnumValue("LandfillProximate")
    LANDFILL_PROXIMATE("LandfillProximate"),
    @XmlEnumValue("LeadBasedPaint")
    LEAD_BASED_PAINT("LeadBasedPaint"),
    @XmlEnumValue("LeakingUndergroundPetroleumStorageTank")
    LEAKING_UNDERGROUND_PETROLEUM_STORAGE_TANK("LeakingUndergroundPetroleumStorageTank"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("VaporIntrusion")
    VAPOR_INTRUSION("VaporIntrusion"),
    @XmlEnumValue("WellWaterContamination")
    WELL_WATER_CONTAMINATION("WellWaterContamination");
    private final String value;

    EnvironmentalConditionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalConditionBase fromValue(String v) {
        for (EnvironmentalConditionBase c: EnvironmentalConditionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
