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
 * <p>Java class for FHAInsuranceProgramBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FHAInsuranceProgramBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FHAUpfront"/>
 *     &lt;enumeration value="RBP"/>
 *     &lt;enumeration value="Section530"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FHAInsuranceProgramBase")
@XmlEnum
public enum FHAInsuranceProgramBase {

    @XmlEnumValue("FHAUpfront")
    FHA_UPFRONT("FHAUpfront"),
    RBP("RBP"),
    @XmlEnumValue("Section530")
    SECTION_530("Section530");
    private final String value;

    FHAInsuranceProgramBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FHAInsuranceProgramBase fromValue(String v) {
        for (FHAInsuranceProgramBase c: FHAInsuranceProgramBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}