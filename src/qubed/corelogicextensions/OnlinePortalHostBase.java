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
 * <p>Java class for OnlinePortalHostBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnlinePortalHostBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="CFPB"/>
 *     &lt;enumeration value="HomeownersProtectionOffice"/>
 *     &lt;enumeration value="LoanInvestor"/>
 *     &lt;enumeration value="LoanOriginator"/>
 *     &lt;enumeration value="LoanServicer"/>
 *     &lt;enumeration value="OCC"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OwnerAssignee"/>
 *     &lt;enumeration value="ServiceProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnlinePortalHostBase")
@XmlEnum
public enum OnlinePortalHostBase {


    /**
     * Governmental regulatory authority other than the CFPB or Homeowners Protection Office.
     * 
     */
    @XmlEnumValue("Agency")
    AGENCY("Agency"),

    /**
     * Consumer Financial Protection Bureau
     * 
     */
    CFPB("CFPB"),

    /**
     * The Department of Treasury office responsible for the administration of HAMP, HARP, HAFA and other making home affordable programs.
     * 
     */
    @XmlEnumValue("HomeownersProtectionOffice")
    HOMEOWNERS_PROTECTION_OFFICE("HomeownersProtectionOffice"),

    /**
     * A party that holds a beneficial interest in a loan.
     * 
     */
    @XmlEnumValue("LoanInvestor")
    LOAN_INVESTOR("LoanInvestor"),

    /**
     * An individual or institution that worked with a borrower to complete a mortgage transaction.
     * 
     */
    @XmlEnumValue("LoanOriginator")
    LOAN_ORIGINATOR("LoanOriginator"),

    /**
     * An organization that handles the administration aspect of a loan from the time proceeds are disbursed until it is paid off.
     * 
     */
    @XmlEnumValue("LoanServicer")
    LOAN_SERVICER("LoanServicer"),

    /**
     * Office of the Comptroller of the Currency
     * 
     */
    OCC("OCC"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * An organization or trust that owns the beneficial interest in a loan.
     * 
     */
    @XmlEnumValue("OwnerAssignee")
    OWNER_ASSIGNEE("OwnerAssignee"),

    /**
     * An entity that performs any service related to the origination or servicing of a loan.
     * 
     */
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider");
    private final String value;

    OnlinePortalHostBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlinePortalHostBase fromValue(String v) {
        for (OnlinePortalHostBase c: OnlinePortalHostBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
