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
 * <p>Java class for InterestAccrualBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestAccrualBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AverageDailyInterestAccrual"/>
 *     &lt;enumeration value="DailyInterestAccrual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestAccrualBase")
@XmlEnum
public enum InterestAccrualBase {

    @XmlEnumValue("AverageDailyInterestAccrual")
    AVERAGE_DAILY_INTEREST_ACCRUAL("AverageDailyInterestAccrual"),
    @XmlEnumValue("DailyInterestAccrual")
    DAILY_INTEREST_ACCRUAL("DailyInterestAccrual");
    private final String value;

    InterestAccrualBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestAccrualBase fromValue(String v) {
        for (InterestAccrualBase c: InterestAccrualBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
