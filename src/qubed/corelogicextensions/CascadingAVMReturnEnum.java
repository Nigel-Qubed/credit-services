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
 * <p>Java class for CascadingAVMReturnEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CascadingAVMReturnEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllAVMs"/>
 *     &lt;enumeration value="SingleAVM"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CascadingAVMReturnEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum CascadingAVMReturnEnum {

    @XmlEnumValue("AllAVMs")
    ALL_AV_MS("AllAVMs"),
    @XmlEnumValue("SingleAVM")
    SINGLE_AVM("SingleAVM"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CascadingAVMReturnEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CascadingAVMReturnEnum fromValue(String v) {
        for (CascadingAVMReturnEnum c: CascadingAVMReturnEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
