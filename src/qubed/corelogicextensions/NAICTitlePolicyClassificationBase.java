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
 * <p>Java class for NAICTitlePolicyClassificationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAICTitlePolicyClassificationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NonResidential"/>
 *     &lt;enumeration value="Residential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NAICTitlePolicyClassificationBase")
@XmlEnum
public enum NAICTitlePolicyClassificationBase {


    /**
     * Multifamily structures intended for the use of 5 or more families, undeveloped lots, or real estate intended principally for business, commercial, industrial, religious, educational or agricultural purposes even if some portion of the real estate is used for residential purposes.
     * 
     */
    @XmlEnumValue("NonResidential")
    NON_RESIDENTIAL("NonResidential"),

    /**
     * A house, individual condominium unit, mobile home permanently affixed to real estate, or other dwelling unit intended principally for the occupancy of one to four families.
     * 
     */
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential");
    private final String value;

    NAICTitlePolicyClassificationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAICTitlePolicyClassificationBase fromValue(String v) {
        for (NAICTitlePolicyClassificationBase c: NAICTitlePolicyClassificationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
