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
 * <p>Java class for UnitOccupancyBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOccupancyBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="OwnerOccupied"/>
 *     &lt;enumeration value="Tenant"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Vacant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOccupancyBase")
@XmlEnum
public enum UnitOccupancyBase {

    @XmlEnumValue("OwnerOccupied")
    OWNER_OCCUPIED("OwnerOccupied"),
    @XmlEnumValue("Tenant")
    TENANT("Tenant"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Vacant")
    VACANT("Vacant");
    private final String value;

    UnitOccupancyBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOccupancyBase fromValue(String v) {
        for (UnitOccupancyBase c: UnitOccupancyBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
