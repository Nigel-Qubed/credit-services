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
 * <p>Java class for PayeeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayeeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Appraiser"/>
 *     &lt;enumeration value="Attorney"/>
 *     &lt;enumeration value="CityTaxAuthority"/>
 *     &lt;enumeration value="CountyTaxAuthority"/>
 *     &lt;enumeration value="DocumentCustodian"/>
 *     &lt;enumeration value="HazardInsuranceAgent"/>
 *     &lt;enumeration value="HazardInsuranceCompany"/>
 *     &lt;enumeration value="MortgageInsuranceCompany"/>
 *     &lt;enumeration value="OptionalProductProvider"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherTaxAuthority"/>
 *     &lt;enumeration value="PoolCertificateHolder"/>
 *     &lt;enumeration value="PropertyInspectionService"/>
 *     &lt;enumeration value="PropertyManagementCompany"/>
 *     &lt;enumeration value="RealEstateBroker"/>
 *     &lt;enumeration value="TaxServiceProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayeeBase")
@XmlEnum
public enum PayeeBase {

    @XmlEnumValue("Appraiser")
    APPRAISER("Appraiser"),
    @XmlEnumValue("Attorney")
    ATTORNEY("Attorney"),
    @XmlEnumValue("CityTaxAuthority")
    CITY_TAX_AUTHORITY("CityTaxAuthority"),
    @XmlEnumValue("CountyTaxAuthority")
    COUNTY_TAX_AUTHORITY("CountyTaxAuthority"),
    @XmlEnumValue("DocumentCustodian")
    DOCUMENT_CUSTODIAN("DocumentCustodian"),
    @XmlEnumValue("HazardInsuranceAgent")
    HAZARD_INSURANCE_AGENT("HazardInsuranceAgent"),
    @XmlEnumValue("HazardInsuranceCompany")
    HAZARD_INSURANCE_COMPANY("HazardInsuranceCompany"),
    @XmlEnumValue("MortgageInsuranceCompany")
    MORTGAGE_INSURANCE_COMPANY("MortgageInsuranceCompany"),
    @XmlEnumValue("OptionalProductProvider")
    OPTIONAL_PRODUCT_PROVIDER("OptionalProductProvider"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherTaxAuthority")
    OTHER_TAX_AUTHORITY("OtherTaxAuthority"),
    @XmlEnumValue("PoolCertificateHolder")
    POOL_CERTIFICATE_HOLDER("PoolCertificateHolder"),
    @XmlEnumValue("PropertyInspectionService")
    PROPERTY_INSPECTION_SERVICE("PropertyInspectionService"),
    @XmlEnumValue("PropertyManagementCompany")
    PROPERTY_MANAGEMENT_COMPANY("PropertyManagementCompany"),
    @XmlEnumValue("RealEstateBroker")
    REAL_ESTATE_BROKER("RealEstateBroker"),
    @XmlEnumValue("TaxServiceProvider")
    TAX_SERVICE_PROVIDER("TaxServiceProvider");
    private final String value;

    PayeeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayeeBase fromValue(String v) {
        for (PayeeBase c: PayeeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}