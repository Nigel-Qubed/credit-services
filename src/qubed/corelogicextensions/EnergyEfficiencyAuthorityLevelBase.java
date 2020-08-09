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
 * <p>Java class for EnergyEfficiencyAuthorityLevelBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyEfficiencyAuthorityLevelBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="Federal"/>
 *     &lt;enumeration value="Municipality"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="State"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyEfficiencyAuthorityLevelBase")
@XmlEnum
public enum EnergyEfficiencyAuthorityLevelBase {

    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("Federal")
    FEDERAL("Federal"),
    @XmlEnumValue("Municipality")
    MUNICIPALITY("Municipality"),

    /**
     * A non-governmental, private source of funding or financial incentive, rebate or assistance program to support the addition or enhancement of new energy efficiency features.
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("State")
    STATE("State");
    private final String value;

    EnergyEfficiencyAuthorityLevelBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyEfficiencyAuthorityLevelBase fromValue(String v) {
        for (EnergyEfficiencyAuthorityLevelBase c: EnergyEfficiencyAuthorityLevelBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
