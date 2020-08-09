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
 * <p>Java class for AVMIndexBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AVMIndexBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CoreLogic"/>
 *     &lt;enumeration value="FederalHousingFinanceAdministration"/>
 *     &lt;enumeration value="LenderProcessingServices"/>
 *     &lt;enumeration value="NationalAssociationRealtorsPendingHomeSale"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="StandardsPoorCaseShiller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AVMIndexBase")
@XmlEnum
public enum AVMIndexBase {

    @XmlEnumValue("CoreLogic")
    CORE_LOGIC("CoreLogic"),
    @XmlEnumValue("FederalHousingFinanceAdministration")
    FEDERAL_HOUSING_FINANCE_ADMINISTRATION("FederalHousingFinanceAdministration"),
    @XmlEnumValue("LenderProcessingServices")
    LENDER_PROCESSING_SERVICES("LenderProcessingServices"),
    @XmlEnumValue("NationalAssociationRealtorsPendingHomeSale")
    NATIONAL_ASSOCIATION_REALTORS_PENDING_HOME_SALE("NationalAssociationRealtorsPendingHomeSale"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("StandardsPoorCaseShiller")
    STANDARDS_POOR_CASE_SHILLER("StandardsPoorCaseShiller");
    private final String value;

    AVMIndexBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AVMIndexBase fromValue(String v) {
        for (AVMIndexBase c: AVMIndexBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
