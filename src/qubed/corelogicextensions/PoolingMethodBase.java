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
 * <p>Java class for PoolingMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoolingMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ConcurrentDate"/>
 *     &lt;enumeration value="InternalReserve"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoolingMethodBase")
@XmlEnum
public enum PoolingMethodBase {


    /**
     * Payments are remitted to investors 15 days after the loan scheduled due date.
     * 
     */
    @XmlEnumValue("ConcurrentDate")
    CONCURRENT_DATE("ConcurrentDate"),

    /**
     * Payments are remitted to investors 45 days after due date.
     * 
     */
    @XmlEnumValue("InternalReserve")
    INTERNAL_RESERVE("InternalReserve"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PoolingMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoolingMethodBase fromValue(String v) {
        for (PoolingMethodBase c: PoolingMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
