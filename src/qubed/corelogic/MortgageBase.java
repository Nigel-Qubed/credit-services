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
 * <p>Java class for MortgageBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MortgageBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Conventional"/>
 *     &lt;enumeration value="FHA"/>
 *     &lt;enumeration value="LocalAgency"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PublicAndIndianHousing"/>
 *     &lt;enumeration value="StateAgency"/>
 *     &lt;enumeration value="USDARuralDevelopment"/>
 *     &lt;enumeration value="VA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MortgageBase")
@XmlEnum
public enum MortgageBase {


    /**
     * Mortgage financing which is not insured or guaranteed by a government agency.
     * 
     */
    @XmlEnumValue("Conventional")
    CONVENTIONAL("Conventional"),

    /**
     * A loan originated in accordance with the guidelines of HUD's Federal Housing Administration, a federal agency that provides mortgage insurance on single-family, multifamily, manufactured homes and hospital loans made by FHA-approved lenders throughout the United States and its territories.
     * 
     */
    FHA("FHA"),

    /**
     * A loan originated in accordance with the guidelines of an agency governed by a municipal jurisdiction.
     * 
     */
    @XmlEnumValue("LocalAgency")
    LOCAL_AGENCY("LocalAgency"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A loan originated in accordance with the guidelines of HUD's Office of Native American Programs, which provides safe and affordable housing for lower-income Native American, Alaska Native and Native Hawaiian families.
     * 
     */
    @XmlEnumValue("PublicAndIndianHousing")
    PUBLIC_AND_INDIAN_HOUSING("PublicAndIndianHousing"),

    /**
     * A loan originated in accordance with the guidelines of an agency governed by a state jurisdiction.
     * 
     */
    @XmlEnumValue("StateAgency")
    STATE_AGENCY("StateAgency"),

    /**
     * A  loan originated in accordance with the guidelines of the USDA Rural Development Agency's Housing and Community Facilities Program, which provides funding for single family homes in rural communities.
     * 
     */
    @XmlEnumValue("USDARuralDevelopment")
    USDA_RURAL_DEVELOPMENT("USDARuralDevelopment"),

    /**
     * A loan originated in accordance with the guidelines of the Department of Veterans Affairs�  Loan Guaranty Home Loan Program, which guarantees loans made by private lenders, such as banks, savings & loans, or mortgage companies to eligible veterans for the purchase of a home which must be for their own personal occupancy.
     * 
     */
    VA("VA");
    private final String value;

    MortgageBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MortgageBase fromValue(String v) {
        for (MortgageBase c: MortgageBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}