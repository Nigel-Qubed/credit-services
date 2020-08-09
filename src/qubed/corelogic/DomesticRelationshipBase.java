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
 * <p>Java class for DomesticRelationshipBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomesticRelationshipBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CivilUnion"/>
 *     &lt;enumeration value="DomesticPartnership"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RegisteredReciprocalBeneficiaryRelationship"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomesticRelationshipBase")
@XmlEnum
public enum DomesticRelationshipBase {


    /**
     * A relationship as defined by the state or other jurisdiction in which the civil union was formed.
     * 
     */
    @XmlEnumValue("CivilUnion")
    CIVIL_UNION("CivilUnion"),

    /**
     * A relationship as defined by the state or other jurisdiction in which the domestic partnership was formed.
     * 
     */
    @XmlEnumValue("DomesticPartnership")
    DOMESTIC_PARTNERSHIP("DomesticPartnership"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A relationship as defined by the state or other jurisdiction in which the reciprocal beneficiary was registered.
     * 
     */
    @XmlEnumValue("RegisteredReciprocalBeneficiaryRelationship")
    REGISTERED_RECIPROCAL_BENEFICIARY_RELATIONSHIP("RegisteredReciprocalBeneficiaryRelationship");
    private final String value;

    DomesticRelationshipBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomesticRelationshipBase fromValue(String v) {
        for (DomesticRelationshipBase c: DomesticRelationshipBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
