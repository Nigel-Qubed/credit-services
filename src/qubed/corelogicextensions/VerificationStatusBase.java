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
 * <p>Java class for VerificationStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NotVerified"/>
 *     &lt;enumeration value="ToBeVerified"/>
 *     &lt;enumeration value="Verified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerificationStatusBase")
@XmlEnum
public enum VerificationStatusBase {

    @XmlEnumValue("NotVerified")
    NOT_VERIFIED("NotVerified"),
    @XmlEnumValue("ToBeVerified")
    TO_BE_VERIFIED("ToBeVerified"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified");
    private final String value;

    VerificationStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatusBase fromValue(String v) {
        for (VerificationStatusBase c: VerificationStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
