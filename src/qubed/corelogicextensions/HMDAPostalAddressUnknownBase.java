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
 * <p>Java class for HMDAPostalAddressUnknownBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HMDAPostalAddressUnknownBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CityName"/>
 *     &lt;enumeration value="EntireAddress"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PostalCode"/>
 *     &lt;enumeration value="StreetAddress"/>
 *     &lt;enumeration value="StreetAddressAndCityName"/>
 *     &lt;enumeration value="StreetAddressAndPostalCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HMDAPostalAddressUnknownBase")
@XmlEnum
public enum HMDAPostalAddressUnknownBase {


    /**
     * The city name is unknown.
     * 
     */
    @XmlEnumValue("CityName")
    CITY_NAME("CityName"),

    /**
     * The entire address is unknown.
     * 
     */
    @XmlEnumValue("EntireAddress")
    ENTIRE_ADDRESS("EntireAddress"),

    /**
     * All parts of the address are known.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * The postal code is unknown.
     * 
     */
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode"),

    /**
     * The street address is unknown.
     * 
     */
    @XmlEnumValue("StreetAddress")
    STREET_ADDRESS("StreetAddress"),

    /**
     * The street address and city name are unknown.
     * 
     */
    @XmlEnumValue("StreetAddressAndCityName")
    STREET_ADDRESS_AND_CITY_NAME("StreetAddressAndCityName"),

    /**
     * The street address and postal code are unknown.
     * 
     */
    @XmlEnumValue("StreetAddressAndPostalCode")
    STREET_ADDRESS_AND_POSTAL_CODE("StreetAddressAndPostalCode");
    private final String value;

    HMDAPostalAddressUnknownBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HMDAPostalAddressUnknownBase fromValue(String v) {
        for (HMDAPostalAddressUnknownBase c: HMDAPostalAddressUnknownBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
