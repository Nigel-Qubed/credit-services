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
 * <p>Java class for ListingStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Leased"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Rented"/>
 *     &lt;enumeration value="SettledSale"/>
 *     &lt;enumeration value="Withdrawn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingStatusBase")
@XmlEnum
public enum ListingStatusBase {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Leased")
    LEASED("Leased"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Rented")
    RENTED("Rented"),
    @XmlEnumValue("SettledSale")
    SETTLED_SALE("SettledSale"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn");
    private final String value;

    ListingStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingStatusBase fromValue(String v) {
        for (ListingStatusBase c: ListingStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
