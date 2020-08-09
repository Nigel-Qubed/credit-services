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
 * <p>Java class for MIRenewalCalculationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIRenewalCalculationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AverageAnnualScheduledUnpaidPrincipalBalance"/>
 *     &lt;enumeration value="Constant"/>
 *     &lt;enumeration value="Declining"/>
 *     &lt;enumeration value="NoRenewals"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIRenewalCalculationBase")
@XmlEnum
public enum MIRenewalCalculationBase {

    @XmlEnumValue("AverageAnnualScheduledUnpaidPrincipalBalance")
    AVERAGE_ANNUAL_SCHEDULED_UNPAID_PRINCIPAL_BALANCE("AverageAnnualScheduledUnpaidPrincipalBalance"),
    @XmlEnumValue("Constant")
    CONSTANT("Constant"),
    @XmlEnumValue("Declining")
    DECLINING("Declining"),
    @XmlEnumValue("NoRenewals")
    NO_RENEWALS("NoRenewals"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MIRenewalCalculationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIRenewalCalculationBase fromValue(String v) {
        for (MIRenewalCalculationBase c: MIRenewalCalculationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
