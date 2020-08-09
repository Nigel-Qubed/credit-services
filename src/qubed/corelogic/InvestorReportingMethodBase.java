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
 * <p>Java class for InvestorReportingMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorReportingMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ExceptionReporting"/>
 *     &lt;enumeration value="FullReporting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvestorReportingMethodBase")
@XmlEnum
public enum InvestorReportingMethodBase {


    /**
     * The servicer only reports activity other than the scheduled payment.
     * 
     */
    @XmlEnumValue("ExceptionReporting")
    EXCEPTION_REPORTING("ExceptionReporting"),

    /**
     * The servicer must report on all servicing activity,
     * 
     */
    @XmlEnumValue("FullReporting")
    FULL_REPORTING("FullReporting");
    private final String value;

    InvestorReportingMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorReportingMethodBase fromValue(String v) {
        for (InvestorReportingMethodBase c: InvestorReportingMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
