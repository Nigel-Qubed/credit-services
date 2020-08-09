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
 * <p>Java class for ServitudeSignificanceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServitudeSignificanceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Affirmative"/>
 *     &lt;enumeration value="Negative"/>
 *     &lt;enumeration value="Neutral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServitudeSignificanceBase")
@XmlEnum
public enum ServitudeSignificanceBase {


    /**
     * Benefit runs with the land requires the encumbered to do something or refrain from doing something.
     * 
     */
    @XmlEnumValue("Affirmative")
    AFFIRMATIVE("Affirmative"),

    /**
     * Burden runs with the land and requires the encumbered to do something or refrain from doing something.
     * 
     */
    @XmlEnumValue("Negative")
    NEGATIVE("Negative"),

    /**
     * Minimal or no impact.
     * 
     */
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral");
    private final String value;

    ServitudeSignificanceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServitudeSignificanceBase fromValue(String v) {
        for (ServitudeSignificanceBase c: ServitudeSignificanceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
