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
 * <p>Java class for ConversionOptionPeriodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionOptionPeriodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="OnDemand"/>
 *     &lt;enumeration value="OnDemandAtInterestRateChangeDates"/>
 *     &lt;enumeration value="OnDemandMonthly"/>
 *     &lt;enumeration value="Scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionOptionPeriodBase")
@XmlEnum
public enum ConversionOptionPeriodBase {


    /**
     * The borrower must request the conversion.
     * 
     */
    @XmlEnumValue("OnDemand")
    ON_DEMAND("OnDemand"),
    @XmlEnumValue("OnDemandAtInterestRateChangeDates")
    ON_DEMAND_AT_INTEREST_RATE_CHANGE_DATES("OnDemandAtInterestRateChangeDates"),
    @XmlEnumValue("OnDemandMonthly")
    ON_DEMAND_MONTHLY("OnDemandMonthly"),

    /**
     * The conversion option is available to the borrower on a regularly scheduled basis.
     * 
     */
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled");
    private final String value;

    ConversionOptionPeriodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionOptionPeriodBase fromValue(String v) {
        for (ConversionOptionPeriodBase c: ConversionOptionPeriodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}