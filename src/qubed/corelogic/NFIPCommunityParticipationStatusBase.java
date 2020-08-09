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
 * <p>Java class for NFIPCommunityParticipationStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NFIPCommunityParticipationStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="NonParticipating"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Probation"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NFIPCommunityParticipationStatusBase")
@XmlEnum
public enum NFIPCommunityParticipationStatusBase {

    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),

    /**
     * In the Flood Response DTD this enumerated value is Non-Participating. This is marked for deprecation for 3.x and will be changed to Non Participating at that time.
     * 
     */
    @XmlEnumValue("NonParticipating")
    NON_PARTICIPATING("NonParticipating"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Probation")
    PROBATION("Probation"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    NFIPCommunityParticipationStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NFIPCommunityParticipationStatusBase fromValue(String v) {
        for (NFIPCommunityParticipationStatusBase c: NFIPCommunityParticipationStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
