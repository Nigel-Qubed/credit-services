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
 * <p>Java class for AssetDocumentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetDocumentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BankStatement"/>
 *     &lt;enumeration value="FinancialStatement"/>
 *     &lt;enumeration value="InvestmentAccountStatement"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Receipt"/>
 *     &lt;enumeration value="RelocationBuyoutAgreement"/>
 *     &lt;enumeration value="RetirementAccountStatement"/>
 *     &lt;enumeration value="SettlementStatement"/>
 *     &lt;enumeration value="VerbalStatement"/>
 *     &lt;enumeration value="VerificationOfDeposit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetDocumentBase")
@XmlEnum
public enum AssetDocumentBase {


    /**
     * Evidences transactions recorded and account balances for a depository account of an individual or business during a specified period.
     * 
     */
    @XmlEnumValue("BankStatement")
    BANK_STATEMENT("BankStatement"),

    /**
     * Evidences financial position of an individual or business for a specified period.
     * 
     */
    @XmlEnumValue("FinancialStatement")
    FINANCIAL_STATEMENT("FinancialStatement"),

    /**
     * Evidences transactions recorded and account balances for an unrestricted individual or business investment account during a specified period.
     * 
     */
    @XmlEnumValue("InvestmentAccountStatement")
    INVESTMENT_ACCOUNT_STATEMENT("InvestmentAccountStatement"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     *  Evidences the payment in exchange for a good or service.
     * 
     */
    @XmlEnumValue("Receipt")
    RECEIPT("Receipt"),

    /**
     * Evidences the terms between a relocation company/employer and an employee to purchase a home based on an agreed upon value, or takes responsibility for outstanding mortgages.
     * 
     */
    @XmlEnumValue("RelocationBuyoutAgreement")
    RELOCATION_BUYOUT_AGREEMENT("RelocationBuyoutAgreement"),

    /**
     * Evidences transactions recorded and account balances for a restricted individual investment account during a specified period.
     * 
     */
    @XmlEnumValue("RetirementAccountStatement")
    RETIREMENT_ACCOUNT_STATEMENT("RetirementAccountStatement"),

    /**
     * Evidences the funds exchanged in a real property sale transaction. HUD-1 is one example.
     * 
     */
    @XmlEnumValue("SettlementStatement")
    SETTLEMENT_STATEMENT("SettlementStatement"),

    /**
     * When verbal verification is allowed. This may be a written statement by the lender that information was collected verbally. Might include the name of the person making the contact, the name of the entity contacted, the name and title of the individual at the entity who provided the information, date of the contact and information that was collected.
     * 
     */
    @XmlEnumValue("VerbalStatement")
    VERBAL_STATEMENT("VerbalStatement"),

    /**
     * Used to verify accounts and balance amounts at depository institutions.
     * 
     */
    @XmlEnumValue("VerificationOfDeposit")
    VERIFICATION_OF_DEPOSIT("VerificationOfDeposit");
    private final String value;

    AssetDocumentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetDocumentBase fromValue(String v) {
        for (AssetDocumentBase c: AssetDocumentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
