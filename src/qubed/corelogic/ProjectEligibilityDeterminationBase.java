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
 * <p>Java class for ProjectEligibilityDeterminationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectEligibilityDeterminationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FullReview"/>
 *     &lt;enumeration value="LimitedReview"/>
 *     &lt;enumeration value="ProjectEligibilityReviewService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectEligibilityDeterminationBase")
@XmlEnum
public enum ProjectEligibilityDeterminationBase {

    @XmlEnumValue("FullReview")
    FULL_REVIEW("FullReview"),
    @XmlEnumValue("LimitedReview")
    LIMITED_REVIEW("LimitedReview"),

    /**
     * Fannie Mae Project Eligibility Review Service, aka PERS
     * 
     */
    @XmlEnumValue("ProjectEligibilityReviewService")
    PROJECT_ELIGIBILITY_REVIEW_SERVICE("ProjectEligibilityReviewService");
    private final String value;

    ProjectEligibilityDeterminationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectEligibilityDeterminationBase fromValue(String v) {
        for (ProjectEligibilityDeterminationBase c: ProjectEligibilityDeterminationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}