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
 * <p>Java class for BuildingPermitUsageStandardBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingPermitUsageStandardBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="Hazardous"/>
 *     &lt;enumeration value="Industrial"/>
 *     &lt;enumeration value="MultiFamily"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SingleFamily"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingPermitUsageStandardBase")
@XmlEnum
public enum BuildingPermitUsageStandardBase {

    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),
    @XmlEnumValue("Hazardous")
    HAZARDOUS("Hazardous"),
    @XmlEnumValue("Industrial")
    INDUSTRIAL("Industrial"),
    @XmlEnumValue("MultiFamily")
    MULTI_FAMILY("MultiFamily"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SingleFamily")
    SINGLE_FAMILY("SingleFamily");
    private final String value;

    BuildingPermitUsageStandardBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildingPermitUsageStandardBase fromValue(String v) {
        for (BuildingPermitUsageStandardBase c: BuildingPermitUsageStandardBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
