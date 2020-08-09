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
 * <p>Java class for PayoffRequestedByBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoffRequestedByBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ServiceProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayoffRequestedByBase")
@XmlEnum
public enum PayoffRequestedByBase {

    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider");
    private final String value;

    PayoffRequestedByBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayoffRequestedByBase fromValue(String v) {
        for (PayoffRequestedByBase c: PayoffRequestedByBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
