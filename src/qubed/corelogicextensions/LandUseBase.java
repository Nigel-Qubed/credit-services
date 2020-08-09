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
 * <p>Java class for LandUseBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LandUseBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Agricultural"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="Income"/>
 *     &lt;enumeration value="Industrial"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PublicAndSemipublic"/>
 *     &lt;enumeration value="Recreational"/>
 *     &lt;enumeration value="Residential"/>
 *     &lt;enumeration value="TransportationAndUtility"/>
 *     &lt;enumeration value="Vacant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LandUseBase")
@XmlEnum
public enum LandUseBase {

    @XmlEnumValue("Agricultural")
    AGRICULTURAL("Agricultural"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),
    @XmlEnumValue("Income")
    INCOME("Income"),
    @XmlEnumValue("Industrial")
    INDUSTRIAL("Industrial"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PublicAndSemipublic")
    PUBLIC_AND_SEMIPUBLIC("PublicAndSemipublic"),
    @XmlEnumValue("Recreational")
    RECREATIONAL("Recreational"),
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),
    @XmlEnumValue("TransportationAndUtility")
    TRANSPORTATION_AND_UTILITY("TransportationAndUtility"),
    @XmlEnumValue("Vacant")
    VACANT("Vacant");
    private final String value;

    LandUseBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandUseBase fromValue(String v) {
        for (LandUseBase c: LandUseBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
