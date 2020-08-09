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
 * <p>Java class for DeedInLieuTransitionDurationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeedInLieuTransitionDurationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LongTerm"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ShortTerm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeedInLieuTransitionDurationBase")
@XmlEnum
public enum DeedInLieuTransitionDurationBase {

    @XmlEnumValue("LongTerm")
    LONG_TERM("LongTerm"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ShortTerm")
    SHORT_TERM("ShortTerm");
    private final String value;

    DeedInLieuTransitionDurationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeedInLieuTransitionDurationBase fromValue(String v) {
        for (DeedInLieuTransitionDurationBase c: DeedInLieuTransitionDurationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
