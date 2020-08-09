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
 * <p>Java class for CollectedOtherFundPurposeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectedOtherFundPurposeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdvancePITIPayment"/>
 *     &lt;enumeration value="EscrowFunds"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrincipalCurtailment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CollectedOtherFundPurposeBase")
@XmlEnum
public enum CollectedOtherFundPurposeBase {


    /**
     * PITI payment(s) provided prior to the scheduled due date.
     * 
     */
    @XmlEnumValue("AdvancePITIPayment")
    ADVANCE_PITI_PAYMENT("AdvancePITIPayment"),

    /**
     * Provided to fund the escrow account at closing 
     * 
     */
    @XmlEnumValue("EscrowFunds")
    ESCROW_FUNDS("EscrowFunds"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Provided to reduce principal in excess of scheduled payment amount
     * 
     */
    @XmlEnumValue("PrincipalCurtailment")
    PRINCIPAL_CURTAILMENT("PrincipalCurtailment");
    private final String value;

    CollectedOtherFundPurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectedOtherFundPurposeBase fromValue(String v) {
        for (CollectedOtherFundPurposeBase c: CollectedOtherFundPurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
