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
 * <p>Java class for NativeAmericanLandsBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NativeAmericanLandsBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FeeSimple"/>
 *     &lt;enumeration value="HawaiianHomeLands"/>
 *     &lt;enumeration value="IndividualTrustLand"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TribalTrustLand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NativeAmericanLandsBase")
@XmlEnum
public enum NativeAmericanLandsBase {


    /**
     * Land held by an individual within the boundaries of an Indian reservation. Use is  subject to the tribal sovereignty.
     * 
     */
    @XmlEnumValue("FeeSimple")
    FEE_SIMPLE("FeeSimple"),

    /**
     * Public land held in trust by the State of Hawaii, Department of Hawaiian Home Lands for native Hawaiians.
     * 
     */
    @XmlEnumValue("HawaiianHomeLands")
    HAWAIIAN_HOME_LANDS("HawaiianHomeLands"),

    /**
     * Land that either can be vested in the individual tribal member but in restricted status in favor of the United States, or title is held by the United States in trust for the named individual tribal member.
     * 
     */
    @XmlEnumValue("IndividualTrustLand")
    INDIVIDUAL_TRUST_LAND("IndividualTrustLand"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Land held in trust by the United States government for the benefit of the particular tribe. This type of land may not be mortgaged. The tribe executes a lease (approved by HUD/BIA) with the tribal member. The collateral for loans on these types of lands is improvements on the land and the lease. The title to the structure and leasehold estate is conveyed but not title to the land itself (it would remain in trust for the tribe).
     * 
     */
    @XmlEnumValue("TribalTrustLand")
    TRIBAL_TRUST_LAND("TribalTrustLand");
    private final String value;

    NativeAmericanLandsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NativeAmericanLandsBase fromValue(String v) {
        for (NativeAmericanLandsBase c: NativeAmericanLandsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
