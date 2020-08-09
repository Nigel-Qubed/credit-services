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
 * <p>Java class for BuildingPermitStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingPermitStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Applied"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Voided"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingPermitStatusBase")
@XmlEnum
public enum BuildingPermitStatusBase {


    /**
     * The permit has been applied for, but has not yet been issued.
     * 
     */
    @XmlEnumValue("Applied")
    APPLIED("Applied"),

    /**
     * The permit is no longer active because it was cancelled.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * All work on the permit has been completed, and all inspections have passed.
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * The permit is no longer active because its timeframe has expired.
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * The permit has been issued, and work on it is ongoing.
     * 
     */
    @XmlEnumValue("Issued")
    ISSUED("Issued"),

    /**
     * The permit has been issued, but has subsequently been put on hold, and no work can be done on the permit until one or more issues have been resolved.
     * 
     */
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The permit is no longer active because it  was voided.
     * 
     */
    @XmlEnumValue("Voided")
    VOIDED("Voided");
    private final String value;

    BuildingPermitStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildingPermitStatusBase fromValue(String v) {
        for (BuildingPermitStatusBase c: BuildingPermitStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
