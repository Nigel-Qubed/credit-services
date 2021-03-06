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
 * <p>Java class for MIApplicationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIApplicationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Delegated"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIApplicationBase")
@XmlEnum
public enum MIApplicationBase {

    @XmlEnumValue("Delegated")
    DELEGATED("Delegated"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    MIApplicationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIApplicationBase fromValue(String v) {
        for (MIApplicationBase c: MIApplicationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
