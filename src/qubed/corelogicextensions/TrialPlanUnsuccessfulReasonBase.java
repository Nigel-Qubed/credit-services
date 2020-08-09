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
 * <p>Java class for TrialPlanUnsuccessfulReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrialPlanUnsuccessfulReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BorrowerWithdrew"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TrialPaymentDefault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrialPlanUnsuccessfulReasonBase")
@XmlEnum
public enum TrialPlanUnsuccessfulReasonBase {


    /**
     * The borrower voluntarily dropped out of the trial plan.
     * 
     */
    @XmlEnumValue("BorrowerWithdrew")
    BORROWER_WITHDREW("BorrowerWithdrew"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The trail payment agreement was not fulfilled.
     * 
     */
    @XmlEnumValue("TrialPaymentDefault")
    TRIAL_PAYMENT_DEFAULT("TrialPaymentDefault");
    private final String value;

    TrialPlanUnsuccessfulReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrialPlanUnsuccessfulReasonBase fromValue(String v) {
        for (TrialPlanUnsuccessfulReasonBase c: TrialPlanUnsuccessfulReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
