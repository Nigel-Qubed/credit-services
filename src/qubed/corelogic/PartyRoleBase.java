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
 * <p>Java class for PartyRoleBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyRoleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Appraiser"/>
 *     &lt;enumeration value="AppraiserSupervisor"/>
 *     &lt;enumeration value="AssignFrom"/>
 *     &lt;enumeration value="AssignTo"/>
 *     &lt;enumeration value="Attorney"/>
 *     &lt;enumeration value="AttorneyInFact"/>
 *     &lt;enumeration value="AuthorizedRepresentative"/>
 *     &lt;enumeration value="AuthorizedThirdParty"/>
 *     &lt;enumeration value="BankruptcyFiler"/>
 *     &lt;enumeration value="BankruptcyTrustee"/>
 *     &lt;enumeration value="BeneficialInterestParty"/>
 *     &lt;enumeration value="BillToParty"/>
 *     &lt;enumeration value="Borrower"/>
 *     &lt;enumeration value="Builder"/>
 *     &lt;enumeration value="Client"/>
 *     &lt;enumeration value="ClosingAgent"/>
 *     &lt;enumeration value="Conservator"/>
 *     &lt;enumeration value="ConsumerReportingAgency"/>
 *     &lt;enumeration value="CooperativeCompany"/>
 *     &lt;enumeration value="CorrespondentLender"/>
 *     &lt;enumeration value="Cosigner"/>
 *     &lt;enumeration value="CreditCounselingAgent"/>
 *     &lt;enumeration value="CreditEnhancementRiskHolder"/>
 *     &lt;enumeration value="CustodianNotePayTo"/>
 *     &lt;enumeration value="Defendant"/>
 *     &lt;enumeration value="DeliverRescissionTo"/>
 *     &lt;enumeration value="DesignatedContact"/>
 *     &lt;enumeration value="DocumentCustodian"/>
 *     &lt;enumeration value="ENoteController"/>
 *     &lt;enumeration value="ENoteControllerTransferee"/>
 *     &lt;enumeration value="ENoteCustodian"/>
 *     &lt;enumeration value="ENoteCustodianTransferee"/>
 *     &lt;enumeration value="ENoteDelegateeForTransfers"/>
 *     &lt;enumeration value="ENoteRegisteringParty"/>
 *     &lt;enumeration value="ENoteServicer"/>
 *     &lt;enumeration value="ENoteServicerTransferee"/>
 *     &lt;enumeration value="ENoteTransferInitiator"/>
 *     &lt;enumeration value="Executor"/>
 *     &lt;enumeration value="FHASponsor"/>
 *     &lt;enumeration value="FloodCertificateProvider"/>
 *     &lt;enumeration value="FulfillmentParty"/>
 *     &lt;enumeration value="GiftDonor"/>
 *     &lt;enumeration value="Grantee"/>
 *     &lt;enumeration value="Grantor"/>
 *     &lt;enumeration value="HazardInsuranceAgent"/>
 *     &lt;enumeration value="HazardInsuranceCompany"/>
 *     &lt;enumeration value="HomeownersAssociation"/>
 *     &lt;enumeration value="HousingCounselingAgency"/>
 *     &lt;enumeration value="HousingCounselingAgent"/>
 *     &lt;enumeration value="HUD1SettlementAgent"/>
 *     &lt;enumeration value="Interviewer"/>
 *     &lt;enumeration value="InterviewerEmployer"/>
 *     &lt;enumeration value="Investor"/>
 *     &lt;enumeration value="IRSTaxFormThirdParty"/>
 *     &lt;enumeration value="LawFirm"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="LenderBranch"/>
 *     &lt;enumeration value="LienHolder"/>
 *     &lt;enumeration value="LoanCloser"/>
 *     &lt;enumeration value="LoanDeliveryFilePreparer"/>
 *     &lt;enumeration value="LoanFunder"/>
 *     &lt;enumeration value="LoanOfficer"/>
 *     &lt;enumeration value="LoanOriginationCompany"/>
 *     &lt;enumeration value="LoanOriginator"/>
 *     &lt;enumeration value="LoanProcessor"/>
 *     &lt;enumeration value="LoanSeller"/>
 *     &lt;enumeration value="LoanUnderwriter"/>
 *     &lt;enumeration value="LossPayee"/>
 *     &lt;enumeration value="ManagementCompany"/>
 *     &lt;enumeration value="MICompany"/>
 *     &lt;enumeration value="MortgageBroker"/>
 *     &lt;enumeration value="NonTitleNonSpouseOwnershipInterest"/>
 *     &lt;enumeration value="NonTitleSpouse"/>
 *     &lt;enumeration value="Notary"/>
 *     &lt;enumeration value="NotePayTo"/>
 *     &lt;enumeration value="NotePayToRecipient"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Payee"/>
 *     &lt;enumeration value="Plaintiff"/>
 *     &lt;enumeration value="PoolInsurer"/>
 *     &lt;enumeration value="PoolIssuer"/>
 *     &lt;enumeration value="PoolIssuerTransferee"/>
 *     &lt;enumeration value="PreparedBy"/>
 *     &lt;enumeration value="ProjectDeveloper"/>
 *     &lt;enumeration value="ProjectManagementAgent"/>
 *     &lt;enumeration value="PropertyAccessContact"/>
 *     &lt;enumeration value="PropertyJurisdictionalAuthority"/>
 *     &lt;enumeration value="PropertyOwner"/>
 *     &lt;enumeration value="PropertyPreservationAgent"/>
 *     &lt;enumeration value="PropertyPurchaser"/>
 *     &lt;enumeration value="PropertySeller"/>
 *     &lt;enumeration value="RealEstateAgent"/>
 *     &lt;enumeration value="ReceivingParty"/>
 *     &lt;enumeration value="RegistryOperator"/>
 *     &lt;enumeration value="RegulatoryAgency"/>
 *     &lt;enumeration value="RequestingParty"/>
 *     &lt;enumeration value="RespondingParty"/>
 *     &lt;enumeration value="RespondToParty"/>
 *     &lt;enumeration value="ReturnTo"/>
 *     &lt;enumeration value="ReviewAppraiser"/>
 *     &lt;enumeration value="SecurityIssuer"/>
 *     &lt;enumeration value="ServiceBureau"/>
 *     &lt;enumeration value="ServiceProvider"/>
 *     &lt;enumeration value="Servicer"/>
 *     &lt;enumeration value="ServicerPaymentCollection"/>
 *     &lt;enumeration value="Settlor"/>
 *     &lt;enumeration value="Spouse"/>
 *     &lt;enumeration value="SubmittingParty"/>
 *     &lt;enumeration value="TaxableParty"/>
 *     &lt;enumeration value="TaxAssessor"/>
 *     &lt;enumeration value="TaxCollector"/>
 *     &lt;enumeration value="Taxpayer"/>
 *     &lt;enumeration value="TaxServiceProvider"/>
 *     &lt;enumeration value="TaxServicer"/>
 *     &lt;enumeration value="ThirdPartyInvestor"/>
 *     &lt;enumeration value="ThirdPartyOriginator"/>
 *     &lt;enumeration value="TitleCompany"/>
 *     &lt;enumeration value="TitleHolder"/>
 *     &lt;enumeration value="TitleUnderwriter"/>
 *     &lt;enumeration value="Trust"/>
 *     &lt;enumeration value="TrustBeneficiary"/>
 *     &lt;enumeration value="Trustee"/>
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="WarehouseLender"/>
 *     &lt;enumeration value="Witness"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartyRoleBase")
@XmlEnum
public enum PartyRoleBase {

    @XmlEnumValue("Appraiser")
    APPRAISER("Appraiser"),
    @XmlEnumValue("AppraiserSupervisor")
    APPRAISER_SUPERVISOR("AppraiserSupervisor"),
    @XmlEnumValue("AssignFrom")
    ASSIGN_FROM("AssignFrom"),
    @XmlEnumValue("AssignTo")
    ASSIGN_TO("AssignTo"),

    /**
     * A person admitted to practice law in at least one jurisdiction and authorized to perform criminal and civil legal functions on behalf of clients.
     * 
     */
    @XmlEnumValue("Attorney")
    ATTORNEY("Attorney"),

    /**
     * A person who is authorized to act as agent or attorney on behalf of another person.
     * 
     */
    @XmlEnumValue("AttorneyInFact")
    ATTORNEY_IN_FACT("AttorneyInFact"),

    /**
     * A party that acts as an intermediary or representative for another party.
     * 
     */
    @XmlEnumValue("AuthorizedRepresentative")
    AUTHORIZED_REPRESENTATIVE("AuthorizedRepresentative"),

    /**
     * A individual or legal entity that has been authorized by the borrower to speak on their behalf in matters concerning the loan.
     * 
     */
    @XmlEnumValue("AuthorizedThirdParty")
    AUTHORIZED_THIRD_PARTY("AuthorizedThirdParty"),

    /**
     * The party who initiates a bankruptcy filling.
     * 
     */
    @XmlEnumValue("BankruptcyFiler")
    BANKRUPTCY_FILER("BankruptcyFiler"),

    /**
     * The individual or legal entity that is in charge of administering the bankruptcy case.
     * 
     */
    @XmlEnumValue("BankruptcyTrustee")
    BANKRUPTCY_TRUSTEE("BankruptcyTrustee"),

    /**
     * Person or organization who has the beneficial interest in the deed of trust.
     * 
     */
    @XmlEnumValue("BeneficialInterestParty")
    BENEFICIAL_INTEREST_PARTY("BeneficialInterestParty"),
    @XmlEnumValue("BillToParty")
    BILL_TO_PARTY("BillToParty"),

    /**
     * An individual or entity that has applied for, met specific requirements of, or received a monetary loan from a lender.
     * 
     */
    @XmlEnumValue("Borrower")
    BORROWER("Borrower"),
    @XmlEnumValue("Builder")
    BUILDER("Builder"),
    @XmlEnumValue("Client")
    CLIENT("Client"),

    /**
     * The legal entity  responsible for executing legally binding documents regarding a lien on property that is subject to a mortgage loan. This process may also be called 'closing ', 'escrow' or 'settlement' in different jurisdictions.
     * 
     */
    @XmlEnumValue("ClosingAgent")
    CLOSING_AGENT("ClosingAgent"),

    /**
     * The person or entity who is appointed to manage the financial affairs of someone who is not capable of managing their own affairs, like for a child or mentally incompetent person.
     * 
     */
    @XmlEnumValue("Conservator")
    CONSERVATOR("Conservator"),

    /**
     * A party which, for monetary fees, dues, or on a cooperative nonprofit basis, regularly engages in whole or in part in the practice of assembling or evaluating consumer credit information or other information on consumers for the purpose of furnishing consumer reports to third parties, and which uses any means or facility of interstate commerce for the purpose of preparing or furnishing consumer reports. The consumer reports are used or expected to be used or collected in whole or in part for the purpose of serving as a factor in establishing the consumer's eligibility for: (a) credit or insurance to be used primarily for personal, family, or household purposes; (b) employment purposes; or (c) any other purpose authorized under the Fair Credit Reporting Act (FCRA), section 604 [15 U.S.C. Section 1681b]. (Source: Fair Credit Reporting Act, section 603 [15 U.S.C. Section 1681a])
     * 
     */
    @XmlEnumValue("ConsumerReportingAgency")
    CONSUMER_REPORTING_AGENCY("ConsumerReportingAgency"),

    /**
     * Cooperative Company is the legal entity of the housing cooperative.
     * 
     */
    @XmlEnumValue("CooperativeCompany")
    COOPERATIVE_COMPANY("CooperativeCompany"),
    @XmlEnumValue("CorrespondentLender")
    CORRESPONDENT_LENDER("CorrespondentLender"),
    @XmlEnumValue("Cosigner")
    COSIGNER("Cosigner"),

    /**
     * The individual or legal entity that provides credit counseling.
     * 
     */
    @XmlEnumValue("CreditCounselingAgent")
    CREDIT_COUNSELING_AGENT("CreditCounselingAgent"),

    /**
     * In the provision of credit enhancement, secondary to primary MI, the holder of the loss in accordance with the credit enhancement type.
     * 
     */
    @XmlEnumValue("CreditEnhancementRiskHolder")
    CREDIT_ENHANCEMENT_RISK_HOLDER("CreditEnhancementRiskHolder"),
    @XmlEnumValue("CustodianNotePayTo")
    CUSTODIAN_NOTE_PAY_TO("CustodianNotePayTo"),

    /**
     * The party sued or accused in a court of law
     * 
     */
    @XmlEnumValue("Defendant")
    DEFENDANT("Defendant"),
    @XmlEnumValue("DeliverRescissionTo")
    DELIVER_RESCISSION_TO("DeliverRescissionTo"),

    /**
     * An individual designated by a party as their specified contact.
     * 
     */
    @XmlEnumValue("DesignatedContact")
    DESIGNATED_CONTACT("DesignatedContact"),
    @XmlEnumValue("DocumentCustodian")
    DOCUMENT_CUSTODIAN("DocumentCustodian"),

    /**
     * Controller of the enote in the e mortgage registry.
     * 
     */
    @XmlEnumValue("ENoteController")
    E_NOTE_CONTROLLER("ENoteController"),

    /**
     * The party to whom control is being transferred.
     * 
     */
    @XmlEnumValue("ENoteControllerTransferee")
    E_NOTE_CONTROLLER_TRANSFEREE("ENoteControllerTransferee"),

    /**
     * A member of the eRegistry that maintains the Authoritative Copy of the eNote either as Controller or as a custodian on behalf of the Controller.
     * 
     */
    @XmlEnumValue("ENoteCustodian")
    E_NOTE_CUSTODIAN("ENoteCustodian"),

    /**
     * The party to whom custody  is being transferred.
     * 
     */
    @XmlEnumValue("ENoteCustodianTransferee")
    E_NOTE_CUSTODIAN_TRANSFEREE("ENoteCustodianTransferee"),

    /**
     * A member of the eRegistry that is authorized by the Controller to perform certain transfer  transactions on behalf of the Controller.
     * 
     */
    @XmlEnumValue("ENoteDelegateeForTransfers")
    E_NOTE_DELEGATEE_FOR_TRANSFERS("ENoteDelegateeForTransfers"),

    /**
     * The party initiating the registration transaction.
     * 
     */
    @XmlEnumValue("ENoteRegisteringParty")
    E_NOTE_REGISTERING_PARTY("ENoteRegisteringParty"),

    /**
     * A member of the eRegistry that is authorized by the Controller to perform certain MERS eRegistry transactions on the Controller's behalf. The Servicer on an eNote record can submit Change Data and Change Status transactions.
     * 
     */
    @XmlEnumValue("ENoteServicer")
    E_NOTE_SERVICER("ENoteServicer"),

    /**
     * The party to whom servicing  is being transferred.
     * 
     */
    @XmlEnumValue("ENoteServicerTransferee")
    E_NOTE_SERVICER_TRANSFEREE("ENoteServicerTransferee"),

    /**
     * The party initiating the transfer transaction.
     * 
     */
    @XmlEnumValue("ENoteTransferInitiator")
    E_NOTE_TRANSFER_INITIATOR("ENoteTransferInitiator"),

    /**
     * The person or entity named in a will who has the responsibility of carrying out the terms of the will (that is, collecting the will maker's assets, paying the debts, and distributing the remaining assets to the beneficiaries)
     * 
     */
    @XmlEnumValue("Executor")
    EXECUTOR("Executor"),
    @XmlEnumValue("FHASponsor")
    FHA_SPONSOR("FHASponsor"),
    @XmlEnumValue("FloodCertificateProvider")
    FLOOD_CERTIFICATE_PROVIDER("FloodCertificateProvider"),
    @XmlEnumValue("FulfillmentParty")
    FULFILLMENT_PARTY("FulfillmentParty"),

    /**
     * The party who has donated gift(s) that can be used by the loan applicant for down payment or other expenses.
     * 
     */
    @XmlEnumValue("GiftDonor")
    GIFT_DONOR("GiftDonor"),

    /**
     * The party to whom a transfer or conveyance of property is made. The buyer is commonly known as the grantee.
     * 
     */
    @XmlEnumValue("Grantee")
    GRANTEE("Grantee"),

    /**
     * The party who conveys or transfers ownership of property. The seller is commonly known as the grantor.
     * 
     */
    @XmlEnumValue("Grantor")
    GRANTOR("Grantor"),
    @XmlEnumValue("HazardInsuranceAgent")
    HAZARD_INSURANCE_AGENT("HazardInsuranceAgent"),
    @XmlEnumValue("HazardInsuranceCompany")
    HAZARD_INSURANCE_COMPANY("HazardInsuranceCompany"),

    /**
     * A legal entity that manages the common areas of a planned unit development, cooperative or condominium.
     * 
     */
    @XmlEnumValue("HomeownersAssociation")
    HOMEOWNERS_ASSOCIATION("HomeownersAssociation"),

    /**
     * The legal entity who addresses a client's unique financial circumstances or housing issues and focuses on ways of overcoming specific obstacles to achieving a housing goal.
     * 
     */
    @XmlEnumValue("HousingCounselingAgency")
    HOUSING_COUNSELING_AGENCY("HousingCounselingAgency"),

    /**
     * Individual who addresses a client's unique financial circumstances or housing issues and focuses on ways of overcoming specific obstacles to achieving a housing goal.
     * 
     */
    @XmlEnumValue("HousingCounselingAgent")
    HOUSING_COUNSELING_AGENT("HousingCounselingAgent"),

    /**
     * The party specified as the Settlement Agent on the HUD-1.
     * 
     */
    @XmlEnumValue("HUD1SettlementAgent")
    HUD_1_SETTLEMENT_AGENT("HUD1SettlementAgent"),
    @XmlEnumValue("Interviewer")
    INTERVIEWER("Interviewer"),
    @XmlEnumValue("InterviewerEmployer")
    INTERVIEWER_EMPLOYER("InterviewerEmployer"),
    @XmlEnumValue("Investor")
    INVESTOR("Investor"),
    @XmlEnumValue("IRSTaxFormThirdParty")
    IRS_TAX_FORM_THIRD_PARTY("IRSTaxFormThirdParty"),
    @XmlEnumValue("LawFirm")
    LAW_FIRM("LawFirm"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("LenderBranch")
    LENDER_BRANCH("LenderBranch"),
    @XmlEnumValue("LienHolder")
    LIEN_HOLDER("LienHolder"),

    /**
     * A representative of a bank, credit union, or other financial institution who is the primary contact for preparing the closing mortgage documents package.
     * 
     */
    @XmlEnumValue("LoanCloser")
    LOAN_CLOSER("LoanCloser"),

    /**
     * The entity submitting a loan delivery file to an investor
     * 
     */
    @XmlEnumValue("LoanDeliveryFilePreparer")
    LOAN_DELIVERY_FILE_PREPARER("LoanDeliveryFilePreparer"),

    /**
     * A representative of a bank, credit union, or other financial institution who authorizes disbursement of loan funds.
     * 
     */
    @XmlEnumValue("LoanFunder")
    LOAN_FUNDER("LoanFunder"),
    @XmlEnumValue("LoanOfficer")
    LOAN_OFFICER("LoanOfficer"),

    /**
     * The entity that originated the loan.
     * 
     */
    @XmlEnumValue("LoanOriginationCompany")
    LOAN_ORIGINATION_COMPANY("LoanOriginationCompany"),

    /**
     * The individual at the entity  that originated the loan.
     * 
     */
    @XmlEnumValue("LoanOriginator")
    LOAN_ORIGINATOR("LoanOriginator"),

    /**
     * The party who  performs clerical or support duties at the direction of and subject to the supervision and instruction of the loan officers
     * 
     */
    @XmlEnumValue("LoanProcessor")
    LOAN_PROCESSOR("LoanProcessor"),
    @XmlEnumValue("LoanSeller")
    LOAN_SELLER("LoanSeller"),

    /**
     * The party who decides whether to approve or reject the loan application based on a comprehensive review of the loan application and the applicants' credit report.
     * 
     */
    @XmlEnumValue("LoanUnderwriter")
    LOAN_UNDERWRITER("LoanUnderwriter"),
    @XmlEnumValue("LossPayee")
    LOSS_PAYEE("LossPayee"),
    @XmlEnumValue("ManagementCompany")
    MANAGEMENT_COMPANY("ManagementCompany"),
    @XmlEnumValue("MICompany")
    MI_COMPANY("MICompany"),
    @XmlEnumValue("MortgageBroker")
    MORTGAGE_BROKER("MortgageBroker"),

    /**
     * An individual who has a beneficiary or ownership interest in the property but does not hold title and is not a spouse in a legally recognized marriage, such as in states that recognize common law marriage.
     * 
     */
    @XmlEnumValue("NonTitleNonSpouseOwnershipInterest")
    NON_TITLE_NON_SPOUSE_OWNERSHIP_INTEREST("NonTitleNonSpouseOwnershipInterest"),

    /**
     * Individual associated with the borrower, usually the spouse, who is not obligated on the loan nor are they a title holder on the subject property. Nevertheless they have certain rights with regard to the loan and disposition of the property.
     * 
     */
    @XmlEnumValue("NonTitleSpouse")
    NON_TITLE_SPOUSE("NonTitleSpouse"),
    @XmlEnumValue("Notary")
    NOTARY("Notary"),

    /**
     * The individual or legal entity whose name appears on a note to whom the repayment of the obligation is due.
     * 
     */
    @XmlEnumValue("NotePayTo")
    NOTE_PAY_TO("NotePayTo"),
    @XmlEnumValue("NotePayToRecipient")
    NOTE_PAY_TO_RECIPIENT("NotePayToRecipient"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Payee")
    PAYEE("Payee"),

    /**
     * The party who initiated a case against another in a court of law
     * 
     */
    @XmlEnumValue("Plaintiff")
    PLAINTIFF("Plaintiff"),

    /**
     * The legal entity that provides the insurance for the pool.
     * 
     */
    @XmlEnumValue("PoolInsurer")
    POOL_INSURER("PoolInsurer"),

    /**
     * Identifies the role of the organization that created the pool.
     * 
     */
    @XmlEnumValue("PoolIssuer")
    POOL_ISSUER("PoolIssuer"),

    /**
     * Identifies the role of the organization to whom the pool was transferred
     * 
     */
    @XmlEnumValue("PoolIssuerTransferee")
    POOL_ISSUER_TRANSFEREE("PoolIssuerTransferee"),
    @XmlEnumValue("PreparedBy")
    PREPARED_BY("PreparedBy"),
    @XmlEnumValue("ProjectDeveloper")
    PROJECT_DEVELOPER("ProjectDeveloper"),
    @XmlEnumValue("ProjectManagementAgent")
    PROJECT_MANAGEMENT_AGENT("ProjectManagementAgent"),

    /**
     * The individual or legal entity that will allow access to the property.
     * 
     */
    @XmlEnumValue("PropertyAccessContact")
    PROPERTY_ACCESS_CONTACT("PropertyAccessContact"),

    /**
     * Refers to the jurisdictional authority that has dominion over the property.
     * 
     */
    @XmlEnumValue("PropertyJurisdictionalAuthority")
    PROPERTY_JURISDICTIONAL_AUTHORITY("PropertyJurisdictionalAuthority"),

    /**
     * Individual or entity with legal title to a property.
     * 
     */
    @XmlEnumValue("PropertyOwner")
    PROPERTY_OWNER("PropertyOwner"),

    /**
     * A person or legal entity contractually responsible for maintaining, managing and preserving the residential real estate property that is owned by another party or entity. They are typically used by a Servicer when the property is abandoned, vacant or about to be vacated.
     * 
     */
    @XmlEnumValue("PropertyPreservationAgent")
    PROPERTY_PRESERVATION_AGENT("PropertyPreservationAgent"),

    /**
     * The individual or legal entity that will purchase or has purchased the property, and is not a borrower on the subject loan.
     * 
     */
    @XmlEnumValue("PropertyPurchaser")
    PROPERTY_PURCHASER("PropertyPurchaser"),
    @XmlEnumValue("PropertySeller")
    PROPERTY_SELLER("PropertySeller"),
    @XmlEnumValue("RealEstateAgent")
    REAL_ESTATE_AGENT("RealEstateAgent"),
    @XmlEnumValue("ReceivingParty")
    RECEIVING_PARTY("ReceivingParty"),
    @XmlEnumValue("RegistryOperator")
    REGISTRY_OPERATOR("RegistryOperator"),

    /**
     * A party that provides regulatory oversight.
     * 
     */
    @XmlEnumValue("RegulatoryAgency")
    REGULATORY_AGENCY("RegulatoryAgency"),
    @XmlEnumValue("RequestingParty")
    REQUESTING_PARTY("RequestingParty"),
    @XmlEnumValue("RespondingParty")
    RESPONDING_PARTY("RespondingParty"),
    @XmlEnumValue("RespondToParty")
    RESPOND_TO_PARTY("RespondToParty"),
    @XmlEnumValue("ReturnTo")
    RETURN_TO("ReturnTo"),
    @XmlEnumValue("ReviewAppraiser")
    REVIEW_APPRAISER("ReviewAppraiser"),

    /**
     * The entity that creates and issues an asset backed security for sale on the open financial market.
     * 
     */
    @XmlEnumValue("SecurityIssuer")
    SECURITY_ISSUER("SecurityIssuer"),
    @XmlEnumValue("ServiceBureau")
    SERVICE_BUREAU("ServiceBureau"),

    /**
     * An organization, business or individual which offers a service to others in exchange for payment.
     * 
     */
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider"),
    @XmlEnumValue("Servicer")
    SERVICER("Servicer"),
    @XmlEnumValue("ServicerPaymentCollection")
    SERVICER_PAYMENT_COLLECTION("ServicerPaymentCollection"),

    /**
     * The party who establishes the trust and transfers the original assets, such as the subject property, into the trust for the trustee to hold and manage on behalf of the trust. Also referred to as the trustor or grantor of the trust.
     * 
     */
    @XmlEnumValue("Settlor")
    SETTLOR("Settlor"),
    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("SubmittingParty")
    SUBMITTING_PARTY("SubmittingParty"),
    @XmlEnumValue("TaxableParty")
    TAXABLE_PARTY("TaxableParty"),

    /**
     * The authority tasked with assessing value for taxation purposes on behalf of a governmental agency for an area, city, municipality or county that has its own distinct taxing regulations with the power to levy and collect taxes on real property.
     * 
     */
    @XmlEnumValue("TaxAssessor")
    TAX_ASSESSOR("TaxAssessor"),

    /**
     * The authority tasked with collecting taxes on behalf of a governmental agency for an area, city, municipality or county that has its own distinct taxing regulations with the power to collect taxes on real property.
     * 
     */
    @XmlEnumValue("TaxCollector")
    TAX_COLLECTOR("TaxCollector"),
    @XmlEnumValue("Taxpayer")
    TAXPAYER("Taxpayer"),

    /**
     * Aggregator for all taxing authorities associated with the property.
     * 
     */
    @XmlEnumValue("TaxServiceProvider")
    TAX_SERVICE_PROVIDER("TaxServiceProvider"),
    @XmlEnumValue("TaxServicer")
    TAX_SERVICER("TaxServicer"),
    @XmlEnumValue("ThirdPartyInvestor")
    THIRD_PARTY_INVESTOR("ThirdPartyInvestor"),
    @XmlEnumValue("ThirdPartyOriginator")
    THIRD_PARTY_ORIGINATOR("ThirdPartyOriginator"),

    /**
     * The legal entity which is responsible for issuing the title insurance policy on behalf of the title underwriter. This entity may be an individual title agent, a corporate title agency, or a direct operation of a title underwriter.
     * 
     */
    @XmlEnumValue("TitleCompany")
    TITLE_COMPANY("TitleCompany"),
    @XmlEnumValue("TitleHolder")
    TITLE_HOLDER("TitleHolder"),

    /**
     * The legal entity which is the insurance underwriting company assuming coverage risk under the title insurance policy.
     * 
     */
    @XmlEnumValue("TitleUnderwriter")
    TITLE_UNDERWRITER("TitleUnderwriter"),

    /**
     * A legal entity that holds funds, assets or real property for the benefit of another.
     * 
     */
    @XmlEnumValue("Trust")
    TRUST("Trust"),
    @XmlEnumValue("TrustBeneficiary")
    TRUST_BENEFICIARY("TrustBeneficiary"),

    /**
     * The party selected by the beneficiary of the Deed of Trust or the settlor/grantor/trustor/ of a trust to oversee and manage the assets held in trust for the benefit of the named beneficiaries. An individual or a financial institution can serve as trustee.
     * 
     */
    @XmlEnumValue("Trustee")
    TRUSTEE("Trustee"),

    /**
     * An individual or legal entity whose role is not germane or cannot be immediately ascertained with respect to an event.
     * 
     */
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("WarehouseLender")
    WAREHOUSE_LENDER("WarehouseLender"),
    @XmlEnumValue("Witness")
    WITNESS("Witness");
    private final String value;

    PartyRoleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartyRoleBase fromValue(String v) {
        for (PartyRoleBase c: PartyRoleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
