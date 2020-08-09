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
 * <p>Java class for FundingInterestAdjustmentDayMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundingInterestAdjustmentDayMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ActualLastPaidInstallmentDueDate"/>
 *     &lt;enumeration value="FirstOfMonth"/>
 *     &lt;enumeration value="ScheduledLastPaidInstallmentDueDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FundingInterestAdjustmentDayMethodBase")
@XmlEnum
public enum FundingInterestAdjustmentDayMethodBase {

    @XmlEnumValue("ActualLastPaidInstallmentDueDate")
    ACTUAL_LAST_PAID_INSTALLMENT_DUE_DATE("ActualLastPaidInstallmentDueDate"),
    @XmlEnumValue("FirstOfMonth")
    FIRST_OF_MONTH("FirstOfMonth"),
    @XmlEnumValue("ScheduledLastPaidInstallmentDueDate")
    SCHEDULED_LAST_PAID_INSTALLMENT_DUE_DATE("ScheduledLastPaidInstallmentDueDate");
    private final String value;

    FundingInterestAdjustmentDayMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundingInterestAdjustmentDayMethodBase fromValue(String v) {
        for (FundingInterestAdjustmentDayMethodBase c: FundingInterestAdjustmentDayMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
