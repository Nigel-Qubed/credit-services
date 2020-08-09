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
 * <p>Java class for DisclosureIssuanceTimingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisclosureIssuanceTimingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AtClosing"/>
 *     &lt;enumeration value="PostClosing"/>
 *     &lt;enumeration value="PreClosing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisclosureIssuanceTimingBase")
@XmlEnum
public enum DisclosureIssuanceTimingBase {

    @XmlEnumValue("AtClosing")
    AT_CLOSING("AtClosing"),
    @XmlEnumValue("PostClosing")
    POST_CLOSING("PostClosing"),
    @XmlEnumValue("PreClosing")
    PRE_CLOSING("PreClosing");
    private final String value;

    DisclosureIssuanceTimingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisclosureIssuanceTimingBase fromValue(String v) {
        for (DisclosureIssuanceTimingBase c: DisclosureIssuanceTimingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
