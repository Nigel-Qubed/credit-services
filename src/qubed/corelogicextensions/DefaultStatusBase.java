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
 * <p>Java class for DefaultStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DefaultStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="DefaultImminent"/>
 *     &lt;enumeration value="Forbearance"/>
 *     &lt;enumeration value="Foreclosure"/>
 *     &lt;enumeration value="InDefault"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DefaultStatusBase")
@XmlEnum
public enum DefaultStatusBase {

    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),
    @XmlEnumValue("DefaultImminent")
    DEFAULT_IMMINENT("DefaultImminent"),
    @XmlEnumValue("Forbearance")
    FORBEARANCE("Forbearance"),
    @XmlEnumValue("Foreclosure")
    FORECLOSURE("Foreclosure"),
    @XmlEnumValue("InDefault")
    IN_DEFAULT("InDefault"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DefaultStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultStatusBase fromValue(String v) {
        for (DefaultStatusBase c: DefaultStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
