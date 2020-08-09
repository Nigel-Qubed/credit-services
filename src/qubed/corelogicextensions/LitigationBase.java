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
 * <p>Java class for LitigationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LitigationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Foreclosure"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Probate"/>
 *     &lt;enumeration value="Tort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LitigationBase")
@XmlEnum
public enum LitigationBase {


    /**
     * One or more of the borrowers on the underlying obligation has filed for bankruptcy protection.
     * 
     */
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),

    /**
     * An obligation between two or more parties is the subject of an asserted claim.
     * 
     */
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),

    /**
     * The servicer and or investor has filed a foreclosure action against the borrower or borrowers.
     * 
     */
    @XmlEnumValue("Foreclosure")
    FORECLOSURE("Foreclosure"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The death of one or more parties has subjected the debt to a claim by a probate court.
     * 
     */
    @XmlEnumValue("Probate")
    PROBATE("Probate"),

    /**
     * An interested party has filed a claim asserting a harm for which they believe a court may provide a remedy.
     * 
     */
    @XmlEnumValue("Tort")
    TORT("Tort");
    private final String value;

    LitigationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LitigationBase fromValue(String v) {
        for (LitigationBase c: LitigationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
