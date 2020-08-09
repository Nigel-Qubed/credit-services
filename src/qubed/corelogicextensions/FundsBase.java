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
 * <p>Java class for FundsBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundsBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BridgeLoan"/>
 *     &lt;enumeration value="CashOnHand"/>
 *     &lt;enumeration value="CashOrOtherEquity"/>
 *     &lt;enumeration value="CheckingSavings"/>
 *     &lt;enumeration value="Contribution"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DepositOnSalesContract"/>
 *     &lt;enumeration value="EquityOnPendingSale"/>
 *     &lt;enumeration value="EquityOnSoldProperty"/>
 *     &lt;enumeration value="EquityOnSubjectProperty"/>
 *     &lt;enumeration value="ExcessDeposit"/>
 *     &lt;enumeration value="ForgivableSecuredLoan"/>
 *     &lt;enumeration value="GiftFunds"/>
 *     &lt;enumeration value="Grant"/>
 *     &lt;enumeration value="HousingRelocation"/>
 *     &lt;enumeration value="LifeInsuranceCashValue"/>
 *     &lt;enumeration value="LotEquity"/>
 *     &lt;enumeration value="MortgageCreditCertificates"/>
 *     &lt;enumeration value="MortgageRevenueBond"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherEquity"/>
 *     &lt;enumeration value="PledgedCollateral"/>
 *     &lt;enumeration value="PremiumFunds"/>
 *     &lt;enumeration value="RentWithOptionToPurchase"/>
 *     &lt;enumeration value="RetirementFunds"/>
 *     &lt;enumeration value="SaleOfChattel"/>
 *     &lt;enumeration value="SalesPriceAdjustment"/>
 *     &lt;enumeration value="SecondaryFinancing"/>
 *     &lt;enumeration value="SecuredLoan"/>
 *     &lt;enumeration value="StocksAndBonds"/>
 *     &lt;enumeration value="SweatEquity"/>
 *     &lt;enumeration value="TradeEquity"/>
 *     &lt;enumeration value="TrustFunds"/>
 *     &lt;enumeration value="UnsecuredBorrowedFunds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FundsBase")
@XmlEnum
public enum FundsBase {

    @XmlEnumValue("BridgeLoan")
    BRIDGE_LOAN("BridgeLoan"),
    @XmlEnumValue("CashOnHand")
    CASH_ON_HAND("CashOnHand"),
    @XmlEnumValue("CashOrOtherEquity")
    CASH_OR_OTHER_EQUITY("CashOrOtherEquity"),
    @XmlEnumValue("CheckingSavings")
    CHECKING_SAVINGS("CheckingSavings"),
    @XmlEnumValue("Contribution")
    CONTRIBUTION("Contribution"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * Amount of money deposited with the property seller or property seller's agent at the time the sales contract is accepted to perfect the sales contract.
     * 
     */
    @XmlEnumValue("DepositOnSalesContract")
    DEPOSIT_ON_SALES_CONTRACT("DepositOnSalesContract"),
    @XmlEnumValue("EquityOnPendingSale")
    EQUITY_ON_PENDING_SALE("EquityOnPendingSale"),
    @XmlEnumValue("EquityOnSoldProperty")
    EQUITY_ON_SOLD_PROPERTY("EquityOnSoldProperty"),
    @XmlEnumValue("EquityOnSubjectProperty")
    EQUITY_ON_SUBJECT_PROPERTY("EquityOnSubjectProperty"),

    /**
     * Amount of any excess deposit retained by the seller at the time of real estate closing. Includes (a) amounts held by seller's real estate broker or other third party (who is not the settlement agent) which exceed the fee or commission owed to that party if the party will provide the excess deposit directly to the seller rather than through the closing agent, and (b) If the deposit or any portion has been distributed to the seller prior to closing, the amount not distributed to seller.
     * 
     */
    @XmlEnumValue("ExcessDeposit")
    EXCESS_DEPOSIT("ExcessDeposit"),
    @XmlEnumValue("ForgivableSecuredLoan")
    FORGIVABLE_SECURED_LOAN("ForgivableSecuredLoan"),
    @XmlEnumValue("GiftFunds")
    GIFT_FUNDS("GiftFunds"),
    @XmlEnumValue("Grant")
    GRANT("Grant"),
    @XmlEnumValue("HousingRelocation")
    HOUSING_RELOCATION("HousingRelocation"),
    @XmlEnumValue("LifeInsuranceCashValue")
    LIFE_INSURANCE_CASH_VALUE("LifeInsuranceCashValue"),
    @XmlEnumValue("LotEquity")
    LOT_EQUITY("LotEquity"),
    @XmlEnumValue("MortgageCreditCertificates")
    MORTGAGE_CREDIT_CERTIFICATES("MortgageCreditCertificates"),
    @XmlEnumValue("MortgageRevenueBond")
    MORTGAGE_REVENUE_BOND("MortgageRevenueBond"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherEquity")
    OTHER_EQUITY("OtherEquity"),
    @XmlEnumValue("PledgedCollateral")
    PLEDGED_COLLATERAL("PledgedCollateral"),
    @XmlEnumValue("PremiumFunds")
    PREMIUM_FUNDS("PremiumFunds"),
    @XmlEnumValue("RentWithOptionToPurchase")
    RENT_WITH_OPTION_TO_PURCHASE("RentWithOptionToPurchase"),
    @XmlEnumValue("RetirementFunds")
    RETIREMENT_FUNDS("RetirementFunds"),
    @XmlEnumValue("SaleOfChattel")
    SALE_OF_CHATTEL("SaleOfChattel"),

    /**
     * Not full market
     * 
     */
    @XmlEnumValue("SalesPriceAdjustment")
    SALES_PRICE_ADJUSTMENT("SalesPriceAdjustment"),
    @XmlEnumValue("SecondaryFinancing")
    SECONDARY_FINANCING("SecondaryFinancing"),
    @XmlEnumValue("SecuredLoan")
    SECURED_LOAN("SecuredLoan"),
    @XmlEnumValue("StocksAndBonds")
    STOCKS_AND_BONDS("StocksAndBonds"),
    @XmlEnumValue("SweatEquity")
    SWEAT_EQUITY("SweatEquity"),
    @XmlEnumValue("TradeEquity")
    TRADE_EQUITY("TradeEquity"),
    @XmlEnumValue("TrustFunds")
    TRUST_FUNDS("TrustFunds"),
    @XmlEnumValue("UnsecuredBorrowedFunds")
    UNSECURED_BORROWED_FUNDS("UnsecuredBorrowedFunds");
    private final String value;

    FundsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundsBase fromValue(String v) {
        for (FundsBase c: FundsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
