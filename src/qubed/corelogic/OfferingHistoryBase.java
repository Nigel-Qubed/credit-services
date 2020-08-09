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
 * <p>Java class for OfferingHistoryBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfferingHistoryBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="ContingentSale"/>
 *     &lt;enumeration value="ContractOffMarket"/>
 *     &lt;enumeration value="ContractOnMarket"/>
 *     &lt;enumeration value="OfferPending"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="OriginalOffering"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PriceChange"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="TemporaryHold"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfferingHistoryBase")
@XmlEnum
public enum OfferingHistoryBase {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * A status indicating a sale whose excecution is contractually contigent on another transaction.
     * 
     */
    @XmlEnumValue("ContingentSale")
    CONTINGENT_SALE("ContingentSale"),
    @XmlEnumValue("ContractOffMarket")
    CONTRACT_OFF_MARKET("ContractOffMarket"),
    @XmlEnumValue("ContractOnMarket")
    CONTRACT_ON_MARKET("ContractOnMarket"),

    /**
     * Indicates an offer for purchase is pending on the property.
     * 
     */
    @XmlEnumValue("OfferPending")
    OFFER_PENDING("OfferPending"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),

    /**
     * Used to indicate the original offering for sale of the property.
     * 
     */
    @XmlEnumValue("OriginalOffering")
    ORIGINAL_OFFERING("OriginalOffering"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Indicates a price change event on an offering for sale.
     * 
     */
    @XmlEnumValue("PriceChange")
    PRICE_CHANGE("PriceChange"),

    /**
     * Indicates that the offering for sale has ended in a sale, but, may not yet be a settled sale.
     * 
     */
    @XmlEnumValue("Sold")
    SOLD("Sold"),

    /**
     * Indicates the offering has been temporarily placed on hold such as if the seller is on vacation and does not want the property shown.
     * 
     */
    @XmlEnumValue("TemporaryHold")
    TEMPORARY_HOLD("TemporaryHold");
    private final String value;

    OfferingHistoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferingHistoryBase fromValue(String v) {
        for (OfferingHistoryBase c: OfferingHistoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
