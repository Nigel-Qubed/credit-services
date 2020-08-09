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
 * <p>Java class for ShortSaleOfferingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShortSaleOfferingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Preapproved"/>
 *     &lt;enumeration value="Requested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShortSaleOfferingBase")
@XmlEnum
public enum ShortSaleOfferingBase {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Preapproved")
    PREAPPROVED("Preapproved"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested");
    private final String value;

    ShortSaleOfferingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShortSaleOfferingBase fromValue(String v) {
        for (ShortSaleOfferingBase c: ShortSaleOfferingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
