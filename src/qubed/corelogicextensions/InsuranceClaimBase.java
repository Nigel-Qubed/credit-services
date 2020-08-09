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
 * <p>Java class for InsuranceClaimBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceClaimBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Hazard"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceClaimBase")
@XmlEnum
public enum InsuranceClaimBase {


    /**
     * Includes all types of hazard insurance.
     * 
     */
    @XmlEnumValue("Hazard")
    HAZARD("Hazard"),
    MI("MI"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    InsuranceClaimBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceClaimBase fromValue(String v) {
        for (InsuranceClaimBase c: InsuranceClaimBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
