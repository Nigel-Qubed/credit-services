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
 * <p>Java class for UnitChargeUtilityBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitChargeUtilityBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Cable"/>
 *     &lt;enumeration value="Cooling"/>
 *     &lt;enumeration value="Electricity"/>
 *     &lt;enumeration value="Garbage"/>
 *     &lt;enumeration value="Gas"/>
 *     &lt;enumeration value="Heating"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Sewer"/>
 *     &lt;enumeration value="Water"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitChargeUtilityBase")
@XmlEnum
public enum UnitChargeUtilityBase {

    @XmlEnumValue("Cable")
    CABLE("Cable"),
    @XmlEnumValue("Cooling")
    COOLING("Cooling"),
    @XmlEnumValue("Electricity")
    ELECTRICITY("Electricity"),
    @XmlEnumValue("Garbage")
    GARBAGE("Garbage"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("Heating")
    HEATING("Heating"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Sewer")
    SEWER("Sewer"),
    @XmlEnumValue("Water")
    WATER("Water");
    private final String value;

    UnitChargeUtilityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitChargeUtilityBase fromValue(String v) {
        for (UnitChargeUtilityBase c: UnitChargeUtilityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
