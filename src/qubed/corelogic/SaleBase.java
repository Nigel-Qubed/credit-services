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
 * <p>Java class for SaleBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CourtOrderedNonForeclosureSale"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ProbateSale"/>
 *     &lt;enumeration value="RelocationSale"/>
 *     &lt;enumeration value="REOPostForeclosureSale"/>
 *     &lt;enumeration value="ShortSale"/>
 *     &lt;enumeration value="TrusteeJudicialForeclosureSale"/>
 *     &lt;enumeration value="TrusteeNonJudicialForeclosureSale"/>
 *     &lt;enumeration value="TypicallyMotivated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SaleBase")
@XmlEnum
public enum SaleBase {


    /**
     * A sale in which a judge has ordered the sale of the property as a dispute resolution. Usually two people own it, one wants to sell, the other does not. The one wanting to sell always wins if the other refuses to buy them out. This could be a divorce or it could be an inherited property with multiple siblings.
     * 
     */
    @XmlEnumValue("CourtOrderedNonForeclosureSale")
    COURT_ORDERED_NON_FORECLOSURE_SALE("CourtOrderedNonForeclosureSale"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Property sold as a result of disposition of assets of a deceased person. Also termed Estate Sale in some areas of the US.
     * 
     */
    @XmlEnumValue("ProbateSale")
    PROBATE_SALE("ProbateSale"),

    /**
     * A property being sold as a part of an relocation program paid by an employer to assist an employee in liquidating a home.
     * 
     */
    @XmlEnumValue("RelocationSale")
    RELOCATION_SALE("RelocationSale"),

    /**
     * The sale of a property from inventory that has been foreclosed and taken possession of by the lien holder.
     * 
     */
    @XmlEnumValue("REOPostForeclosureSale")
    REO_POST_FORECLOSURE_SALE("REOPostForeclosureSale"),

    /**
     * A sale of property in which the lien holder accepts less than the debt or obligation against the property.
     * 
     */
    @XmlEnumValue("ShortSale")
    SHORT_SALE("ShortSale"),

    /**
     * A judicial foreclosure process using a trustee. A Trustee Sale is a public auction that is open to all bidders and the property is usually awarded to the highest bidder who meets all the criteria set by the Trustee. A trustee is an entity or company chosen to administer the assets  of the beneficiary and facilitate the foreclosure process. Once underway, a judicial foreclosure can only be stopped by payment in full.
     * 
     */
    @XmlEnumValue("TrusteeJudicialForeclosureSale")
    TRUSTEE_JUDICIAL_FORECLOSURE_SALE("TrusteeJudicialForeclosureSale"),

    /**
     * A non-judicial foreclosure process. In a trustee sale, the lender files a Notice of Default and a notice is posted on the property indicating a trustee sale will be held at least 90 days later, generally but not always at the county courthouse steps. Unlike a foreclosure where the homeowners lone recourse is to redeem the full amount of the loan, an owner can stop a trustee sale simply by getting current on his or her mortgage payments plus any interest and fees that have been added along the way. A homeowner can do this at any time up to the posted time of the trustee sale and the entire process comes to a halt.
     * 
     */
    @XmlEnumValue("TrusteeNonJudicialForeclosureSale")
    TRUSTEE_NON_JUDICIAL_FORECLOSURE_SALE("TrusteeNonJudicialForeclosureSale"),

    /**
     * A sale that is not under distress and aligns with the defintion of Market Value.
     * 
     */
    @XmlEnumValue("TypicallyMotivated")
    TYPICALLY_MOTIVATED("TypicallyMotivated");
    private final String value;

    SaleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaleBase fromValue(String v) {
        for (SaleBase c: SaleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
