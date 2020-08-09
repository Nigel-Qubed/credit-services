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
 * <p>Java class for InfluenceImpactBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InfluenceImpactBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Adverse"/>
 *     &lt;enumeration value="Beneficial"/>
 *     &lt;enumeration value="Neutral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InfluenceImpactBase")
@XmlEnum
public enum InfluenceImpactBase {

    @XmlEnumValue("Adverse")
    ADVERSE("Adverse"),
    @XmlEnumValue("Beneficial")
    BENEFICIAL("Beneficial"),
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral");
    private final String value;

    InfluenceImpactBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfluenceImpactBase fromValue(String v) {
        for (InfluenceImpactBase c: InfluenceImpactBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
