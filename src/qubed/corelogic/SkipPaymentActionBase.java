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
 * <p>Java class for SkipPaymentActionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkipPaymentActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CapitalizeInterest"/>
 *     &lt;enumeration value="CreateSubordinateLoanComponent"/>
 *     &lt;enumeration value="ExtendTerm"/>
 *     &lt;enumeration value="MakeupPayment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkipPaymentActionBase")
@XmlEnum
public enum SkipPaymentActionBase {


    /**
     * Interest from the skipped payment is capitalized into the UPB.
     * 
     */
    @XmlEnumValue("CapitalizeInterest")
    CAPITALIZE_INTEREST("CapitalizeInterest"),

    /**
     * Principal and interest from the skipped payment is used to create a subordinate loan component.
     * 
     */
    @XmlEnumValue("CreateSubordinateLoanComponent")
    CREATE_SUBORDINATE_LOAN_COMPONENT("CreateSubordinateLoanComponent"),

    /**
     * The mortgage term is extended to amortize the skipped payment.
     * 
     */
    @XmlEnumValue("ExtendTerm")
    EXTEND_TERM("ExtendTerm"),

    /**
     * The borrower makes up the skipped payment with an unscheduled payment.
     * 
     */
    @XmlEnumValue("MakeupPayment")
    MAKEUP_PAYMENT("MakeupPayment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SkipPaymentActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkipPaymentActionBase fromValue(String v) {
        for (SkipPaymentActionBase c: SkipPaymentActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
