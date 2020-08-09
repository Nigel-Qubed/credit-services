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
 * <p>Java class for ContractVarianceCodeIssuerBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractVarianceCodeIssuerBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FHA"/>
 *     &lt;enumeration value="Investor"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="VA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractVarianceCodeIssuerBase")
@XmlEnum
public enum ContractVarianceCodeIssuerBase {


    /**
     * Federal Housing Administration 
     * 
     */
    FHA("FHA"),
    @XmlEnumValue("Investor")
    INVESTOR("Investor"),
    MI("MI"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * Department of Veteran Affairs
     * 
     */
    VA("VA");
    private final String value;

    ContractVarianceCodeIssuerBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractVarianceCodeIssuerBase fromValue(String v) {
        for (ContractVarianceCodeIssuerBase c: ContractVarianceCodeIssuerBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}