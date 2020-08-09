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
 * <p>Java class for LoanIdentifierBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanIdentifierBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AgencyCase"/>
 *     &lt;enumeration value="InvestorCommitment"/>
 *     &lt;enumeration value="InvestorContract"/>
 *     &lt;enumeration value="InvestorLoan"/>
 *     &lt;enumeration value="InvestorWorkoutCase"/>
 *     &lt;enumeration value="LenderCase"/>
 *     &lt;enumeration value="LenderLoan"/>
 *     &lt;enumeration value="LoanPriceQuote"/>
 *     &lt;enumeration value="MERS_MIN"/>
 *     &lt;enumeration value="MIRateQuote"/>
 *     &lt;enumeration value="NewServicerLoan"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PoolIssuerLoan"/>
 *     &lt;enumeration value="PriceResponse"/>
 *     &lt;enumeration value="SellerLoan"/>
 *     &lt;enumeration value="ServicerLoan"/>
 *     &lt;enumeration value="ServicerWorkoutCase"/>
 *     &lt;enumeration value="SubservicerLoan"/>
 *     &lt;enumeration value="UniversalLoan"/>
 *     &lt;enumeration value="WholesaleLenderLoan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanIdentifierBase")
@XmlEnum
public enum LoanIdentifierBase {


    /**
     * An identifier assigned by a government agency (for example FHA Case Number, VA Case Number). The identifier is used by the agency to identify a loan.
     * 
     */
    @XmlEnumValue("AgencyCase")
    AGENCY_CASE("AgencyCase"),

    /**
     * The unique identifier of the commitment that states the terms under which a loan seller and an investor agree to exchange loans for funds, securities, or other assets.
     * 
     */
    @XmlEnumValue("InvestorCommitment")
    INVESTOR_COMMITMENT("InvestorCommitment"),

    /**
     * A unique identifier for a group of loans identified as part of a cash pool or a security pool.
     * 
     */
    @XmlEnumValue("InvestorContract")
    INVESTOR_CONTRACT("InvestorContract"),

    /**
     * Account number assigned by the investor used for tracking on the investors systems.
     * 
     */
    @XmlEnumValue("InvestorLoan")
    INVESTOR_LOAN("InvestorLoan"),

    /**
     * A unique identifier of a workout assigned by the investor associated with a loan that has been evaluated for a workout.
     * 
     */
    @XmlEnumValue("InvestorWorkoutCase")
    INVESTOR_WORKOUT_CASE("InvestorWorkoutCase"),

    /**
     * Number used by the Lender to identify a loan.
     * 
     */
    @XmlEnumValue("LenderCase")
    LENDER_CASE("LenderCase"),

    /**
     * The identifier assigned by the originating Lender to be referenced as the Loan ID/Number on all settlement documents, notes, riders, etc.
     * 
     */
    @XmlEnumValue("LenderLoan")
    LENDER_LOAN("LenderLoan"),

    /**
     * A unique identifier for a loan price quote, assigned by the party that makes the price quote for tracking purposes.
     * 
     */
    @XmlEnumValue("LoanPriceQuote")
    LOAN_PRICE_QUOTE("LoanPriceQuote"),

    /**
     * Number used by MERS to identify loans. Referred to as the MIN, Mortgage Identification Number.
     * 
     */
    MERS_MIN("MERS_MIN"),

    /**
     * A unique identifier for a MI rate quote, assigned by the party that makes the rate quote, used to track or refer to the rate quote.
     * 
     */
    @XmlEnumValue("MIRateQuote")
    MI_RATE_QUOTE("MIRateQuote"),

    /**
     * Account number assigned by the servicer used for tracking on the servicer systems. For servicing transfer purposes the servicer would be the Transferee.
     * 
     */
    @XmlEnumValue("NewServicerLoan")
    NEW_SERVICER_LOAN("NewServicerLoan"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A unique identifier assigned by the Pool Issuer
     * 
     */
    @XmlEnumValue("PoolIssuerLoan")
    POOL_ISSUER_LOAN("PoolIssuerLoan"),

    /**
     * A unique identifier for a price response, assigned by the responder, used to track or refer to the price response.
     * 
     */
    @XmlEnumValue("PriceResponse")
    PRICE_RESPONSE("PriceResponse"),

    /**
     * A unique identifier assigned by the seller to the loan.
     * 
     */
    @XmlEnumValue("SellerLoan")
    SELLER_LOAN("SellerLoan"),

    /**
     * A unique identifier assigned by the servicer to identify the loan. For servicing transfer purposes the servicer would be the Transferor.
     * 
     */
    @XmlEnumValue("ServicerLoan")
    SERVICER_LOAN("ServicerLoan"),

    /**
     * A unique identifier of a workout assigned by the servicer associated with a loan that has been evaluated for a workout.
     * 
     */
    @XmlEnumValue("ServicerWorkoutCase")
    SERVICER_WORKOUT_CASE("ServicerWorkoutCase"),
    @XmlEnumValue("SubservicerLoan")
    SUBSERVICER_LOAN("SubservicerLoan"),

    /**
     * A unique identifier associated with the loan throughout the life of the loan transaction starting at submission of the loan application (aka Universal Loan Identifier).
     * 
     */
    @XmlEnumValue("UniversalLoan")
    UNIVERSAL_LOAN("UniversalLoan"),

    /**
     * A tracking number assigned by the wholesale lender to identify the loan for pipeline management.
     * 
     */
    @XmlEnumValue("WholesaleLenderLoan")
    WHOLESALE_LENDER_LOAN("WholesaleLenderLoan");
    private final String value;

    LoanIdentifierBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanIdentifierBase fromValue(String v) {
        for (LoanIdentifierBase c: LoanIdentifierBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
