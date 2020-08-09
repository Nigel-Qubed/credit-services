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
 * <p>Java class for DirectFormReturnInstruction4506TEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectFormReturnInstruction4506TEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Coversheet"/>
 *     &lt;enumeration value="CoversheetAnd4506T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectFormReturnInstruction4506TEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum DirectFormReturnInstruction4506TEnum {

    @XmlEnumValue("Coversheet")
    COVERSHEET("Coversheet"),
    @XmlEnumValue("CoversheetAnd4506T")
    COVERSHEET_AND_4506_T("CoversheetAnd4506T");
    private final String value;

    DirectFormReturnInstruction4506TEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectFormReturnInstruction4506TEnum fromValue(String v) {
        for (DirectFormReturnInstruction4506TEnum c: DirectFormReturnInstruction4506TEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}