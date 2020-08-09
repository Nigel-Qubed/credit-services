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
 * <p>Java class for PrepaymentPenaltyPrincipalBalanceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaymentPenaltyPrincipalBalanceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CurrentPrincipalBalance"/>
 *     &lt;enumeration value="ExcessPrincipal"/>
 *     &lt;enumeration value="OriginalPrincipalBalance"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaymentPenaltyPrincipalBalanceBase")
@XmlEnum
public enum PrepaymentPenaltyPrincipalBalanceBase {


    /**
     * The unpaid principal balance at the time the prepayment penalty is triggered.
     * 
     */
    @XmlEnumValue("CurrentPrincipalBalance")
    CURRENT_PRINCIPAL_BALANCE("CurrentPrincipalBalance"),

    /**
     * The difference between the scheduled amortized principal balance and the principal balance after curtailment.
     * 
     */
    @XmlEnumValue("ExcessPrincipal")
    EXCESS_PRINCIPAL("ExcessPrincipal"),

    /**
     * The note amount.
     * 
     */
    @XmlEnumValue("OriginalPrincipalBalance")
    ORIGINAL_PRINCIPAL_BALANCE("OriginalPrincipalBalance"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PrepaymentPenaltyPrincipalBalanceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaymentPenaltyPrincipalBalanceBase fromValue(String v) {
        for (PrepaymentPenaltyPrincipalBalanceBase c: PrepaymentPenaltyPrincipalBalanceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}