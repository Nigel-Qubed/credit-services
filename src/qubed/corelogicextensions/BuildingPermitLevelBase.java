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
 * <p>Java class for BuildingPermitLevelBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingPermitLevelBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Maintenance"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Recurring"/>
 *     &lt;enumeration value="SubWork"/>
 *     &lt;enumeration value="Temporary"/>
 *     &lt;enumeration value="Transitional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingPermitLevelBase")
@XmlEnum
public enum BuildingPermitLevelBase {

    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("SubWork")
    SUB_WORK("SubWork"),
    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary"),
    @XmlEnumValue("Transitional")
    TRANSITIONAL("Transitional");
    private final String value;

    BuildingPermitLevelBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildingPermitLevelBase fromValue(String v) {
        for (BuildingPermitLevelBase c: BuildingPermitLevelBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
