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
 * <p>Java class for CreditScoreCategoryVersionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditScoreCategoryVersionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FICO4"/>
 *     &lt;enumeration value="FICO8"/>
 *     &lt;enumeration value="FICO9"/>
 *     &lt;enumeration value="FICO98"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Vantage2"/>
 *     &lt;enumeration value="Vantage3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditScoreCategoryVersionBase")
@XmlEnum
public enum CreditScoreCategoryVersionBase {


    /**
     * A credit score model released in 2004 that was developed by Fair Isaac Corporation, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("FICO4")
    FICO_4("FICO4"),

    /**
     * A credit score model released in 2008 that was developed by Fair Isaac Corporation, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("FICO8")
    FICO_8("FICO8"),

    /**
     * A credit score model released in 2014 that was developed by Fair Isaac Corporation, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("FICO9")
    FICO_9("FICO9"),

    /**
     * A credit score model released in 1998 that was developed by Fair Isaac Corporation, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("FICO98")
    FICO_98("FICO98"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A credit score model released in 2011 that was developed by VantageScore, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("Vantage2")
    VANTAGE_2("Vantage2"),

    /**
     * A credit score model released in 2013 that was developed by VantageScore, representing the financial credit worthiness of an individual.
     * 
     */
    @XmlEnumValue("Vantage3")
    VANTAGE_3("Vantage3");
    private final String value;

    CreditScoreCategoryVersionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditScoreCategoryVersionBase fromValue(String v) {
        for (CreditScoreCategoryVersionBase c: CreditScoreCategoryVersionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}