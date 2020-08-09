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
 * <p>Java class for AppurtenanceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppurtenanceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BoatSlip"/>
 *     &lt;enumeration value="GarageSpace"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ParkingSpace"/>
 *     &lt;enumeration value="StorageUnit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppurtenanceBase")
@XmlEnum
public enum AppurtenanceBase {

    @XmlEnumValue("BoatSlip")
    BOAT_SLIP("BoatSlip"),
    @XmlEnumValue("GarageSpace")
    GARAGE_SPACE("GarageSpace"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ParkingSpace")
    PARKING_SPACE("ParkingSpace"),
    @XmlEnumValue("StorageUnit")
    STORAGE_UNIT("StorageUnit");
    private final String value;

    AppurtenanceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppurtenanceBase fromValue(String v) {
        for (AppurtenanceBase c: AppurtenanceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
