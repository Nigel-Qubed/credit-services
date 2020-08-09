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
 * <p>Java class for CreditBusinessBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditBusinessBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Advertising"/>
 *     &lt;enumeration value="Automotive"/>
 *     &lt;enumeration value="Banking"/>
 *     &lt;enumeration value="Clothing"/>
 *     &lt;enumeration value="CollectionServices"/>
 *     &lt;enumeration value="Contractors"/>
 *     &lt;enumeration value="DepartmentAndMailOrder"/>
 *     &lt;enumeration value="Employment"/>
 *     &lt;enumeration value="FarmAndGardenSupplies"/>
 *     &lt;enumeration value="Finance"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Grocery"/>
 *     &lt;enumeration value="HomeFurnishing"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="JewelryAndCamera"/>
 *     &lt;enumeration value="LumberAndHardware"/>
 *     &lt;enumeration value="MedicalAndHealth"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="OilAndNationalCreditCards"/>
 *     &lt;enumeration value="PersonalServicesNotMedical"/>
 *     &lt;enumeration value="RealEstateAndPublicAccommodation"/>
 *     &lt;enumeration value="SportingGoods"/>
 *     &lt;enumeration value="UtilitiesAndFuel"/>
 *     &lt;enumeration value="Wholesale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditBusinessBase")
@XmlEnum
public enum CreditBusinessBase {

    @XmlEnumValue("Advertising")
    ADVERTISING("Advertising"),
    @XmlEnumValue("Automotive")
    AUTOMOTIVE("Automotive"),
    @XmlEnumValue("Banking")
    BANKING("Banking"),
    @XmlEnumValue("Clothing")
    CLOTHING("Clothing"),
    @XmlEnumValue("CollectionServices")
    COLLECTION_SERVICES("CollectionServices"),
    @XmlEnumValue("Contractors")
    CONTRACTORS("Contractors"),
    @XmlEnumValue("DepartmentAndMailOrder")
    DEPARTMENT_AND_MAIL_ORDER("DepartmentAndMailOrder"),
    @XmlEnumValue("Employment")
    EMPLOYMENT("Employment"),
    @XmlEnumValue("FarmAndGardenSupplies")
    FARM_AND_GARDEN_SUPPLIES("FarmAndGardenSupplies"),
    @XmlEnumValue("Finance")
    FINANCE("Finance"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Grocery")
    GROCERY("Grocery"),
    @XmlEnumValue("HomeFurnishing")
    HOME_FURNISHING("HomeFurnishing"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("JewelryAndCamera")
    JEWELRY_AND_CAMERA("JewelryAndCamera"),
    @XmlEnumValue("LumberAndHardware")
    LUMBER_AND_HARDWARE("LumberAndHardware"),
    @XmlEnumValue("MedicalAndHealth")
    MEDICAL_AND_HEALTH("MedicalAndHealth"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("OilAndNationalCreditCards")
    OIL_AND_NATIONAL_CREDIT_CARDS("OilAndNationalCreditCards"),
    @XmlEnumValue("PersonalServicesNotMedical")
    PERSONAL_SERVICES_NOT_MEDICAL("PersonalServicesNotMedical"),
    @XmlEnumValue("RealEstateAndPublicAccommodation")
    REAL_ESTATE_AND_PUBLIC_ACCOMMODATION("RealEstateAndPublicAccommodation"),
    @XmlEnumValue("SportingGoods")
    SPORTING_GOODS("SportingGoods"),
    @XmlEnumValue("UtilitiesAndFuel")
    UTILITIES_AND_FUEL("UtilitiesAndFuel"),
    @XmlEnumValue("Wholesale")
    WHOLESALE("Wholesale");
    private final String value;

    CreditBusinessBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditBusinessBase fromValue(String v) {
        for (CreditBusinessBase c: CreditBusinessBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
