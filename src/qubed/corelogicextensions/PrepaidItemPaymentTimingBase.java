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
 * <p>Java class for PrepaidItemPaymentTimingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidItemPaymentTimingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AtClosing"/>
 *     &lt;enumeration value="BeforeClosing"/>
 *     &lt;enumeration value="FirstPayment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaidItemPaymentTimingBase")
@XmlEnum
public enum PrepaidItemPaymentTimingBase {

    @XmlEnumValue("AtClosing")
    AT_CLOSING("AtClosing"),
    @XmlEnumValue("BeforeClosing")
    BEFORE_CLOSING("BeforeClosing"),
    @XmlEnumValue("FirstPayment")
    FIRST_PAYMENT("FirstPayment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PrepaidItemPaymentTimingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidItemPaymentTimingBase fromValue(String v) {
        for (PrepaidItemPaymentTimingBase c: PrepaidItemPaymentTimingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
