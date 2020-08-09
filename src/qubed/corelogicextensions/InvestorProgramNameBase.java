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
 * <p>Java class for InvestorProgramNameBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorProgramNameBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Calpers"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaymentPower"/>
 *     &lt;enumeration value="PrimeRatePlus"/>
 *     &lt;enumeration value="SettleAmerica"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvestorProgramNameBase")
@XmlEnum
public enum InvestorProgramNameBase {


    /**
     * California Public Employees Retirement System
     * 
     */
    @XmlEnumValue("Calpers")
    CALPERS("Calpers"),

    /**
     * Other Investor Program name.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Loan program where qualified borrowers can skip up to 2 mortgage payments a year and 10 payments over the life of the loan.
     * 
     */
    @XmlEnumValue("PaymentPower")
    PAYMENT_POWER("PaymentPower"),

    /**
     * Loan program from Countrywide that relates to construction lending with ARM pricing.
     * 
     */
    @XmlEnumValue("PrimeRatePlus")
    PRIME_RATE_PLUS("PrimeRatePlus"),

    /**
     * Loan program designed to qualify immigrant families for home loans.
     * 
     */
    @XmlEnumValue("SettleAmerica")
    SETTLE_AMERICA("SettleAmerica");
    private final String value;

    InvestorProgramNameBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorProgramNameBase fromValue(String v) {
        for (InvestorProgramNameBase c: InvestorProgramNameBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
