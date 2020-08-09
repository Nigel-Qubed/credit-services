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
 * <p>Java class for ConstructionLoanBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionLoanBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ConstructionOnly"/>
 *     &lt;enumeration value="ConstructionToPermanent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionLoanBase")
@XmlEnum
public enum ConstructionLoanBase {


    /**
     * A short term, interim loan for financing the cost of construction. The lender advances funds to the builder at periodic intervals as work progresses.
     * 
     */
    @XmlEnumValue("ConstructionOnly")
    CONSTRUCTION_ONLY("ConstructionOnly"),

    /**
     * The subject loan will be used for construction financing and then be converted to permanent financing.
     * 
     */
    @XmlEnumValue("ConstructionToPermanent")
    CONSTRUCTION_TO_PERMANENT("ConstructionToPermanent");
    private final String value;

    ConstructionLoanBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionLoanBase fromValue(String v) {
        for (ConstructionLoanBase c: ConstructionLoanBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
