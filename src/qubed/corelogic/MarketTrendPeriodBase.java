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
 * <p>Java class for MarketTrendPeriodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketTrendPeriodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FutureEighteenMonths"/>
 *     &lt;enumeration value="FutureSixMonths"/>
 *     &lt;enumeration value="FutureThreeMonths"/>
 *     &lt;enumeration value="FutureTwelveMonths"/>
 *     &lt;enumeration value="PriorEighteenMonths"/>
 *     &lt;enumeration value="PriorSixMonths"/>
 *     &lt;enumeration value="PriorThreeMonths"/>
 *     &lt;enumeration value="PriorTwelveMonths"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketTrendPeriodBase")
@XmlEnum
public enum MarketTrendPeriodBase {

    @XmlEnumValue("FutureEighteenMonths")
    FUTURE_EIGHTEEN_MONTHS("FutureEighteenMonths"),
    @XmlEnumValue("FutureSixMonths")
    FUTURE_SIX_MONTHS("FutureSixMonths"),
    @XmlEnumValue("FutureThreeMonths")
    FUTURE_THREE_MONTHS("FutureThreeMonths"),
    @XmlEnumValue("FutureTwelveMonths")
    FUTURE_TWELVE_MONTHS("FutureTwelveMonths"),
    @XmlEnumValue("PriorEighteenMonths")
    PRIOR_EIGHTEEN_MONTHS("PriorEighteenMonths"),
    @XmlEnumValue("PriorSixMonths")
    PRIOR_SIX_MONTHS("PriorSixMonths"),
    @XmlEnumValue("PriorThreeMonths")
    PRIOR_THREE_MONTHS("PriorThreeMonths"),
    @XmlEnumValue("PriorTwelveMonths")
    PRIOR_TWELVE_MONTHS("PriorTwelveMonths");
    private final String value;

    MarketTrendPeriodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketTrendPeriodBase fromValue(String v) {
        for (MarketTrendPeriodBase c: MarketTrendPeriodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
