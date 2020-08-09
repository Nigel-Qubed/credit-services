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
 * <p>Java class for MeasurementUnitBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementUnitBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Centimeters"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Pixels"/>
 *     &lt;enumeration value="Points"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementUnitBase")
@XmlEnum
public enum MeasurementUnitBase {

    @XmlEnumValue("Centimeters")
    CENTIMETERS("Centimeters"),
    @XmlEnumValue("Inches")
    INCHES("Inches"),
    @XmlEnumValue("Pixels")
    PIXELS("Pixels"),

    /**
     *  1/72 of an inch.
     * 
     */
    @XmlEnumValue("Points")
    POINTS("Points");
    private final String value;

    MeasurementUnitBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementUnitBase fromValue(String v) {
        for (MeasurementUnitBase c: MeasurementUnitBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
