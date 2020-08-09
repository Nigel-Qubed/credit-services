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
 * <p>Java class for LoanLevelCreditScoreSelectionMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanLevelCreditScoreSelectionMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AverageThenAverage"/>
 *     &lt;enumeration value="MiddleOrLowerThenAverage"/>
 *     &lt;enumeration value="MiddleOrLowerThenLowest"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanLevelCreditScoreSelectionMethodBase")
@XmlEnum
public enum LoanLevelCreditScoreSelectionMethodBase {


    /**
     * The mean value of the average of each borrower.
     * 
     */
    @XmlEnumValue("AverageThenAverage")
    AVERAGE_THEN_AVERAGE("AverageThenAverage"),

    /**
     * Mean value of the middle or lower score per set of borrower scores.
     * 
     */
    @XmlEnumValue("MiddleOrLowerThenAverage")
    MIDDLE_OR_LOWER_THEN_AVERAGE("MiddleOrLowerThenAverage"),

    /**
     * Lowest value of the middle or lower score per set of borrower scores.
     * 
     */
    @XmlEnumValue("MiddleOrLowerThenLowest")
    MIDDLE_OR_LOWER_THEN_LOWEST("MiddleOrLowerThenLowest"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LoanLevelCreditScoreSelectionMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanLevelCreditScoreSelectionMethodBase fromValue(String v) {
        for (LoanLevelCreditScoreSelectionMethodBase c: LoanLevelCreditScoreSelectionMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
