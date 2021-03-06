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
 * <p>Java class for BuydownBaseDateBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuydownBaseDateBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FirstPaymentDate"/>
 *     &lt;enumeration value="LastPaymentDate"/>
 *     &lt;enumeration value="NoteDate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuydownBaseDateBase")
@XmlEnum
public enum BuydownBaseDateBase {

    @XmlEnumValue("FirstPaymentDate")
    FIRST_PAYMENT_DATE("FirstPaymentDate"),
    @XmlEnumValue("LastPaymentDate")
    LAST_PAYMENT_DATE("LastPaymentDate"),
    @XmlEnumValue("NoteDate")
    NOTE_DATE("NoteDate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BuydownBaseDateBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuydownBaseDateBase fromValue(String v) {
        for (BuydownBaseDateBase c: BuydownBaseDateBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
