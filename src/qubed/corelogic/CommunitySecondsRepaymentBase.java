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
 * <p>Java class for CommunitySecondsRepaymentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunitySecondsRepaymentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="DeferredFullyForgiven"/>
 *     &lt;enumeration value="DeferredNotFullyForgiven"/>
 *     &lt;enumeration value="NonDeferred"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunitySecondsRepaymentBase")
@XmlEnum
public enum CommunitySecondsRepaymentBase {


    /**
     * A type of community second for which the repayment of the subordinate mortgage by the mortgagee is deferred for five years or more and the debt is forgiven.
     * 
     */
    @XmlEnumValue("DeferredFullyForgiven")
    DEFERRED_FULLY_FORGIVEN("DeferredFullyForgiven"),

    /**
     * A type of community second for which the repayment of the subordinate mortgage by the mortgagee is deferred for five years or more and the debt is not forgiven.
     * 
     */
    @XmlEnumValue("DeferredNotFullyForgiven")
    DEFERRED_NOT_FULLY_FORGIVEN("DeferredNotFullyForgiven"),

    /**
     * A type of community second for which the repayment of the subordinate mortgage by the mortgagee is required to begin after closing of the mortgage loan.
     * 
     */
    @XmlEnumValue("NonDeferred")
    NON_DEFERRED("NonDeferred"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CommunitySecondsRepaymentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunitySecondsRepaymentBase fromValue(String v) {
        for (CommunitySecondsRepaymentBase c: CommunitySecondsRepaymentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}