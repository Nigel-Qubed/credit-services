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
 * <p>Java class for FloodRequestActionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FloodRequestActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Dispute"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Reissue"/>
 *     &lt;enumeration value="StatusQuery"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="Upgrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FloodRequestActionBase")
@XmlEnum
public enum FloodRequestActionBase {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Dispute")
    DISPUTE("Dispute"),
    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Reissue")
    REISSUE("Reissue"),
    @XmlEnumValue("StatusQuery")
    STATUS_QUERY("StatusQuery"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    FloodRequestActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FloodRequestActionBase fromValue(String v) {
        for (FloodRequestActionBase c: FloodRequestActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
