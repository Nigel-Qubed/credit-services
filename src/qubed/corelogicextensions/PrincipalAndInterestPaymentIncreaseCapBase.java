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
 * <p>Java class for PrincipalAndInterestPaymentIncreaseCapBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrincipalAndInterestPaymentIncreaseCapBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Mandatory"/>
 *     &lt;enumeration value="Optional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrincipalAndInterestPaymentIncreaseCapBase")
@XmlEnum
public enum PrincipalAndInterestPaymentIncreaseCapBase {

    @XmlEnumValue("Mandatory")
    MANDATORY("Mandatory"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional");
    private final String value;

    PrincipalAndInterestPaymentIncreaseCapBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrincipalAndInterestPaymentIncreaseCapBase fromValue(String v) {
        for (PrincipalAndInterestPaymentIncreaseCapBase c: PrincipalAndInterestPaymentIncreaseCapBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
