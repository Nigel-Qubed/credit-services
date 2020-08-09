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
 * <p>Java class for MIPremiumPaymentPaidByBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIPremiumPaymentPaidByBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Broker"/>
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Correspondent"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="ThirdParty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIPremiumPaymentPaidByBase")
@XmlEnum
public enum MIPremiumPaymentPaidByBase {

    @XmlEnumValue("Broker")
    BROKER("Broker"),
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),
    @XmlEnumValue("Correspondent")
    CORRESPONDENT("Correspondent"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty");
    private final String value;

    MIPremiumPaymentPaidByBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIPremiumPaymentPaidByBase fromValue(String v) {
        for (MIPremiumPaymentPaidByBase c: MIPremiumPaymentPaidByBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
