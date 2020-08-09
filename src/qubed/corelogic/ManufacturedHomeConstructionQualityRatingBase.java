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
 * <p>Java class for ManufacturedHomeConstructionQualityRatingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturedHomeConstructionQualityRatingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Excellent"/>
 *     &lt;enumeration value="Fair"/>
 *     &lt;enumeration value="Poor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManufacturedHomeConstructionQualityRatingBase")
@XmlEnum
public enum ManufacturedHomeConstructionQualityRatingBase {

    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Excellent")
    EXCELLENT("Excellent"),
    @XmlEnumValue("Fair")
    FAIR("Fair"),
    @XmlEnumValue("Poor")
    POOR("Poor");
    private final String value;

    ManufacturedHomeConstructionQualityRatingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturedHomeConstructionQualityRatingBase fromValue(String v) {
        for (ManufacturedHomeConstructionQualityRatingBase c: ManufacturedHomeConstructionQualityRatingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
