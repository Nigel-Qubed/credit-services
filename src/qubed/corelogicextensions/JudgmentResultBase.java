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
 * <p>Java class for JudgmentResultBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JudgmentResultBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Interim"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JudgmentResultBase")
@XmlEnum
public enum JudgmentResultBase {


    /**
     * The final outcome of a litigation.
     * 
     */
    @XmlEnumValue("Final")
    FINAL("Final"),

    /**
     * A judgment made on a matter regarding a litigation prior to the final outcome.
     * 
     */
    @XmlEnumValue("Interim")
    INTERIM("Interim");
    private final String value;

    JudgmentResultBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JudgmentResultBase fromValue(String v) {
        for (JudgmentResultBase c: JudgmentResultBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}