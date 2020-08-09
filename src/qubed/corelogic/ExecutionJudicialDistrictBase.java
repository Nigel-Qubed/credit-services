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
 * <p>Java class for ExecutionJudicialDistrictBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutionJudicialDistrictBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Borough"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="District"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Parish"/>
 *     &lt;enumeration value="Town"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutionJudicialDistrictBase")
@XmlEnum
public enum ExecutionJudicialDistrictBase {

    @XmlEnumValue("Borough")
    BOROUGH("Borough"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Parish")
    PARISH("Parish"),
    @XmlEnumValue("Town")
    TOWN("Town");
    private final String value;

    ExecutionJudicialDistrictBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutionJudicialDistrictBase fromValue(String v) {
        for (ExecutionJudicialDistrictBase c: ExecutionJudicialDistrictBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
