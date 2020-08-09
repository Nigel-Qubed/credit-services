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
 * <p>Java class for CounselingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CounselingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Counseling"/>
 *     &lt;enumeration value="Education"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CounselingBase")
@XmlEnum
public enum CounselingBase {


    /**
     * Counselor-to-client assistance that addresses unique financial circumstances and housing issues, and focuses on overcoming specific obstacles to achieving a housing goal such as repairing credit, addressing a rental dispute, purchasing a home, locating cash for a down payment, raising awareness about critical housing topics such as predatory lending practices, fair lending and fair housing requirements, finding units accessible to persons with disabilities, avoiding foreclosure, or resolving a financial crisis.
     * 
     */
    @XmlEnumValue("Counseling")
    COUNSELING("Counseling"),

    /**
     * Education is defined as formal classes, with established curriculum and instructional goals, provided in a group or classroom setting, or other formats approved by HUD, covering topics such as, but not limited to: (1) renter rights; (2) the home buying process; (3) how to maintain a home; (4) budgeting; (5) fair housing; (6) identifying and reporting predatory lending practices; (7) rights for persons with disabilities; (8) and the importance of good credit.
     * 
     */
    @XmlEnumValue("Education")
    EDUCATION("Education");
    private final String value;

    CounselingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CounselingBase fromValue(String v) {
        for (CounselingBase c: CounselingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}