//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information specific to a real estate in terms of land structure, location and market.
 * 
 * <p>Java class for PROPERTY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element name="BUILDING_PERMITS" type="{http://www.mismo.org/residential/2009/schemas}BUILDING_PERMITS" minOccurs="0"/>
 *         &lt;element name="CERTIFICATES" type="{http://www.mismo.org/residential/2009/schemas}CERTIFICATES" minOccurs="0"/>
 *         &lt;element name="COMPARABLE" type="{http://www.mismo.org/residential/2009/schemas}COMPARABLE" minOccurs="0"/>
 *         &lt;element name="DATA_SOURCES" type="{http://www.mismo.org/residential/2009/schemas}DATA_SOURCES" minOccurs="0"/>
 *         &lt;element name="DISASTERS" type="{http://www.mismo.org/residential/2009/schemas}DISASTERS" minOccurs="0"/>
 *         &lt;element name="ENCUMBRANCES" type="{http://www.mismo.org/residential/2009/schemas}ENCUMBRANCES" minOccurs="0"/>
 *         &lt;element name="ENVIRONMENTAL_CONDITIONS" type="{http://www.mismo.org/residential/2009/schemas}ENVIRONMENTAL_CONDITIONS" minOccurs="0"/>
 *         &lt;element name="FLOOD_DETERMINATION" type="{http://www.mismo.org/residential/2009/schemas}FLOOD_DETERMINATION" minOccurs="0"/>
 *         &lt;element name="HAZARD_INSURANCES" type="{http://www.mismo.org/residential/2009/schemas}HAZARD_INSURANCES" minOccurs="0"/>
 *         &lt;element name="HOMEOWNERS_ASSOCIATIONS" type="{http://www.mismo.org/residential/2009/schemas}HOMEOWNERS_ASSOCIATIONS" minOccurs="0"/>
 *         &lt;element name="IMPROVEMENT" type="{http://www.mismo.org/residential/2009/schemas}IMPROVEMENT" minOccurs="0"/>
 *         &lt;element name="INSPECTIONS" type="{http://www.mismo.org/residential/2009/schemas}INSPECTIONS" minOccurs="0"/>
 *         &lt;element name="LEGAL_DESCRIPTIONS" type="{http://www.mismo.org/residential/2009/schemas}LEGAL_DESCRIPTIONS" minOccurs="0"/>
 *         &lt;element name="LICENSES" type="{http://www.mismo.org/residential/2009/schemas}LICENSES" minOccurs="0"/>
 *         &lt;element name="LISTING_INFORMATIONS" type="{http://www.mismo.org/residential/2009/schemas}LISTING_INFORMATIONS" minOccurs="0"/>
 *         &lt;element name="LOCATION_IDENTIFIER" type="{http://www.mismo.org/residential/2009/schemas}LOCATION_IDENTIFIER" minOccurs="0"/>
 *         &lt;element name="MANUFACTURED_HOME" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME" minOccurs="0"/>
 *         &lt;element name="MARKET" type="{http://www.mismo.org/residential/2009/schemas}MARKET" minOccurs="0"/>
 *         &lt;element name="NEIGHBORHOOD" type="{http://www.mismo.org/residential/2009/schemas}NEIGHBORHOOD" minOccurs="0"/>
 *         &lt;element name="PROJECT" type="{http://www.mismo.org/residential/2009/schemas}PROJECT" minOccurs="0"/>
 *         &lt;element name="PROPERTY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_DETAIL" minOccurs="0"/>
 *         &lt;element name="PROPERTY_TAXES" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TAXES" minOccurs="0"/>
 *         &lt;element name="PROPERTY_TITLE" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TITLE" minOccurs="0"/>
 *         &lt;element name="PROPERTY_UNITS" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_UNITS" minOccurs="0"/>
 *         &lt;element name="PROPERTY_VALUATIONS" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_VALUATIONS" minOccurs="0"/>
 *         &lt;element name="REPAIR" type="{http://www.mismo.org/residential/2009/schemas}REPAIR" minOccurs="0"/>
 *         &lt;element name="SALES_CONTRACTS" type="{http://www.mismo.org/residential/2009/schemas}SALES_CONTRACTS" minOccurs="0"/>
 *         &lt;element name="SALES_HISTORIES" type="{http://www.mismo.org/residential/2009/schemas}SALES_HISTORIES" minOccurs="0"/>
 *         &lt;element name="SERVITUDES" type="{http://www.mismo.org/residential/2009/schemas}SERVITUDES" minOccurs="0"/>
 *         &lt;element name="SITE" type="{http://www.mismo.org/residential/2009/schemas}SITE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;attribute name="ValuationUseType" type="{http://www.mismo.org/residential/2009/schemas}ValuationUseBase" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROPERTY", propOrder = {
    "address",
    "buildingpermits",
    "certificates",
    "comparable",
    "datasources",
    "disasters",
    "encumbrances",
    "environmentalconditions",
    "flooddetermination",
    "hazardinsurances",
    "homeownersassociations",
    "improvement",
    "inspections",
    "legaldescriptions",
    "licenses",
    "listinginformations",
    "locationidentifier",
    "manufacturedhome",
    "market",
    "neighborhood",
    "project",
    "propertydetail",
    "propertytaxes",
    "propertytitle",
    "propertyunits",
    "propertyvaluations",
    "repair",
    "salescontracts",
    "saleshistories",
    "servitudes",
    "site",
    "extension"
})
public class PROPERTY {

    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;
    @XmlElement(name = "BUILDING_PERMITS")
    protected BUILDINGPERMITS buildingpermits;
    @XmlElement(name = "CERTIFICATES")
    protected CERTIFICATES certificates;
    @XmlElement(name = "COMPARABLE")
    protected COMPARABLE comparable;
    @XmlElement(name = "DATA_SOURCES")
    protected DATASOURCES datasources;
    @XmlElement(name = "DISASTERS")
    protected DISASTERS disasters;
    @XmlElement(name = "ENCUMBRANCES")
    protected ENCUMBRANCES encumbrances;
    @XmlElement(name = "ENVIRONMENTAL_CONDITIONS")
    protected ENVIRONMENTALCONDITIONS environmentalconditions;
    @XmlElement(name = "FLOOD_DETERMINATION")
    protected FLOODDETERMINATION flooddetermination;
    @XmlElement(name = "HAZARD_INSURANCES")
    protected HAZARDINSURANCES hazardinsurances;
    @XmlElement(name = "HOMEOWNERS_ASSOCIATIONS")
    protected HOMEOWNERSASSOCIATIONS homeownersassociations;
    @XmlElement(name = "IMPROVEMENT")
    protected IMPROVEMENT improvement;
    @XmlElement(name = "INSPECTIONS")
    protected INSPECTIONS inspections;
    @XmlElement(name = "LEGAL_DESCRIPTIONS")
    protected LEGALDESCRIPTIONS legaldescriptions;
    @XmlElement(name = "LICENSES")
    protected LICENSES licenses;
    @XmlElement(name = "LISTING_INFORMATIONS")
    protected LISTINGINFORMATIONS listinginformations;
    @XmlElement(name = "LOCATION_IDENTIFIER")
    protected LOCATIONIDENTIFIER locationidentifier;
    @XmlElement(name = "MANUFACTURED_HOME")
    protected MANUFACTUREDHOME manufacturedhome;
    @XmlElement(name = "MARKET")
    protected MARKET market;
    @XmlElement(name = "NEIGHBORHOOD")
    protected NEIGHBORHOOD neighborhood;
    @XmlElement(name = "PROJECT")
    protected PROJECT project;
    @XmlElement(name = "PROPERTY_DETAIL")
    protected PROPERTYDETAIL propertydetail;
    @XmlElement(name = "PROPERTY_TAXES")
    protected PROPERTYTAXES propertytaxes;
    @XmlElement(name = "PROPERTY_TITLE")
    protected PROPERTYTITLE propertytitle;
    @XmlElement(name = "PROPERTY_UNITS")
    protected PROPERTYUNITS propertyunits;
    @XmlElement(name = "PROPERTY_VALUATIONS")
    protected PROPERTYVALUATIONS propertyvaluations;
    @XmlElement(name = "REPAIR")
    protected REPAIR repair;
    @XmlElement(name = "SALES_CONTRACTS")
    protected SALESCONTRACTS salescontracts;
    @XmlElement(name = "SALES_HISTORIES")
    protected SALESHISTORIES saleshistories;
    @XmlElement(name = "SERVITUDES")
    protected SERVITUDES servitudes;
    @XmlElement(name = "SITE")
    protected SITE site;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "ValuationUseType")
    protected ValuationUseBase valuationUseType;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the buildingpermits property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDINGPERMITS }
     *     
     */
    public BUILDINGPERMITS getBUILDINGPERMITS() {
        return buildingpermits;
    }

    /**
     * Sets the value of the buildingpermits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDINGPERMITS }
     *     
     */
    public void setBUILDINGPERMITS(BUILDINGPERMITS value) {
        this.buildingpermits = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATES }
     *     
     */
    public CERTIFICATES getCERTIFICATES() {
        return certificates;
    }

    /**
     * Sets the value of the certificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATES }
     *     
     */
    public void setCERTIFICATES(CERTIFICATES value) {
        this.certificates = value;
    }

    /**
     * Gets the value of the comparable property.
     * 
     * @return
     *     possible object is
     *     {@link COMPARABLE }
     *     
     */
    public COMPARABLE getCOMPARABLE() {
        return comparable;
    }

    /**
     * Sets the value of the comparable property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPARABLE }
     *     
     */
    public void setCOMPARABLE(COMPARABLE value) {
        this.comparable = value;
    }

    /**
     * Gets the value of the datasources property.
     * 
     * @return
     *     possible object is
     *     {@link DATASOURCES }
     *     
     */
    public DATASOURCES getDATASOURCES() {
        return datasources;
    }

    /**
     * Sets the value of the datasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATASOURCES }
     *     
     */
    public void setDATASOURCES(DATASOURCES value) {
        this.datasources = value;
    }

    /**
     * Gets the value of the disasters property.
     * 
     * @return
     *     possible object is
     *     {@link DISASTERS }
     *     
     */
    public DISASTERS getDISASTERS() {
        return disasters;
    }

    /**
     * Sets the value of the disasters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISASTERS }
     *     
     */
    public void setDISASTERS(DISASTERS value) {
        this.disasters = value;
    }

    /**
     * Gets the value of the encumbrances property.
     * 
     * @return
     *     possible object is
     *     {@link ENCUMBRANCES }
     *     
     */
    public ENCUMBRANCES getENCUMBRANCES() {
        return encumbrances;
    }

    /**
     * Sets the value of the encumbrances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCUMBRANCES }
     *     
     */
    public void setENCUMBRANCES(ENCUMBRANCES value) {
        this.encumbrances = value;
    }

    /**
     * Gets the value of the environmentalconditions property.
     * 
     * @return
     *     possible object is
     *     {@link ENVIRONMENTALCONDITIONS }
     *     
     */
    public ENVIRONMENTALCONDITIONS getENVIRONMENTALCONDITIONS() {
        return environmentalconditions;
    }

    /**
     * Sets the value of the environmentalconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENVIRONMENTALCONDITIONS }
     *     
     */
    public void setENVIRONMENTALCONDITIONS(ENVIRONMENTALCONDITIONS value) {
        this.environmentalconditions = value;
    }

    /**
     * Gets the value of the flooddetermination property.
     * 
     * @return
     *     possible object is
     *     {@link FLOODDETERMINATION }
     *     
     */
    public FLOODDETERMINATION getFLOODDETERMINATION() {
        return flooddetermination;
    }

    /**
     * Sets the value of the flooddetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOODDETERMINATION }
     *     
     */
    public void setFLOODDETERMINATION(FLOODDETERMINATION value) {
        this.flooddetermination = value;
    }

    /**
     * Gets the value of the hazardinsurances property.
     * 
     * @return
     *     possible object is
     *     {@link HAZARDINSURANCES }
     *     
     */
    public HAZARDINSURANCES getHAZARDINSURANCES() {
        return hazardinsurances;
    }

    /**
     * Sets the value of the hazardinsurances property.
     * 
     * @param value
     *     allowed object is
     *     {@link HAZARDINSURANCES }
     *     
     */
    public void setHAZARDINSURANCES(HAZARDINSURANCES value) {
        this.hazardinsurances = value;
    }

    /**
     * Gets the value of the homeownersassociations property.
     * 
     * @return
     *     possible object is
     *     {@link HOMEOWNERSASSOCIATIONS }
     *     
     */
    public HOMEOWNERSASSOCIATIONS getHOMEOWNERSASSOCIATIONS() {
        return homeownersassociations;
    }

    /**
     * Sets the value of the homeownersassociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOMEOWNERSASSOCIATIONS }
     *     
     */
    public void setHOMEOWNERSASSOCIATIONS(HOMEOWNERSASSOCIATIONS value) {
        this.homeownersassociations = value;
    }

    /**
     * Gets the value of the improvement property.
     * 
     * @return
     *     possible object is
     *     {@link IMPROVEMENT }
     *     
     */
    public IMPROVEMENT getIMPROVEMENT() {
        return improvement;
    }

    /**
     * Sets the value of the improvement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPROVEMENT }
     *     
     */
    public void setIMPROVEMENT(IMPROVEMENT value) {
        this.improvement = value;
    }

    /**
     * Gets the value of the inspections property.
     * 
     * @return
     *     possible object is
     *     {@link INSPECTIONS }
     *     
     */
    public INSPECTIONS getINSPECTIONS() {
        return inspections;
    }

    /**
     * Sets the value of the inspections property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSPECTIONS }
     *     
     */
    public void setINSPECTIONS(INSPECTIONS value) {
        this.inspections = value;
    }

    /**
     * Gets the value of the legaldescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALDESCRIPTIONS }
     *     
     */
    public LEGALDESCRIPTIONS getLEGALDESCRIPTIONS() {
        return legaldescriptions;
    }

    /**
     * Sets the value of the legaldescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALDESCRIPTIONS }
     *     
     */
    public void setLEGALDESCRIPTIONS(LEGALDESCRIPTIONS value) {
        this.legaldescriptions = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link LICENSES }
     *     
     */
    public LICENSES getLICENSES() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LICENSES }
     *     
     */
    public void setLICENSES(LICENSES value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the listinginformations property.
     * 
     * @return
     *     possible object is
     *     {@link LISTINGINFORMATIONS }
     *     
     */
    public LISTINGINFORMATIONS getLISTINGINFORMATIONS() {
        return listinginformations;
    }

    /**
     * Sets the value of the listinginformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTINGINFORMATIONS }
     *     
     */
    public void setLISTINGINFORMATIONS(LISTINGINFORMATIONS value) {
        this.listinginformations = value;
    }

    /**
     * Gets the value of the locationidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATIONIDENTIFIER }
     *     
     */
    public LOCATIONIDENTIFIER getLOCATIONIDENTIFIER() {
        return locationidentifier;
    }

    /**
     * Sets the value of the locationidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATIONIDENTIFIER }
     *     
     */
    public void setLOCATIONIDENTIFIER(LOCATIONIDENTIFIER value) {
        this.locationidentifier = value;
    }

    /**
     * Gets the value of the manufacturedhome property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOME }
     *     
     */
    public MANUFACTUREDHOME getMANUFACTUREDHOME() {
        return manufacturedhome;
    }

    /**
     * Sets the value of the manufacturedhome property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOME }
     *     
     */
    public void setMANUFACTUREDHOME(MANUFACTUREDHOME value) {
        this.manufacturedhome = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link MARKET }
     *     
     */
    public MARKET getMARKET() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKET }
     *     
     */
    public void setMARKET(MARKET value) {
        this.market = value;
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link NEIGHBORHOOD }
     *     
     */
    public NEIGHBORHOOD getNEIGHBORHOOD() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEIGHBORHOOD }
     *     
     */
    public void setNEIGHBORHOOD(NEIGHBORHOOD value) {
        this.neighborhood = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECT }
     *     
     */
    public PROJECT getPROJECT() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECT }
     *     
     */
    public void setPROJECT(PROJECT value) {
        this.project = value;
    }

    /**
     * Gets the value of the propertydetail property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYDETAIL }
     *     
     */
    public PROPERTYDETAIL getPROPERTYDETAIL() {
        return propertydetail;
    }

    /**
     * Sets the value of the propertydetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYDETAIL }
     *     
     */
    public void setPROPERTYDETAIL(PROPERTYDETAIL value) {
        this.propertydetail = value;
    }

    /**
     * Gets the value of the propertytaxes property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTAXES }
     *     
     */
    public PROPERTYTAXES getPROPERTYTAXES() {
        return propertytaxes;
    }

    /**
     * Sets the value of the propertytaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTAXES }
     *     
     */
    public void setPROPERTYTAXES(PROPERTYTAXES value) {
        this.propertytaxes = value;
    }

    /**
     * Gets the value of the propertytitle property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTITLE }
     *     
     */
    public PROPERTYTITLE getPROPERTYTITLE() {
        return propertytitle;
    }

    /**
     * Sets the value of the propertytitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTITLE }
     *     
     */
    public void setPROPERTYTITLE(PROPERTYTITLE value) {
        this.propertytitle = value;
    }

    /**
     * Gets the value of the propertyunits property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYUNITS }
     *     
     */
    public PROPERTYUNITS getPROPERTYUNITS() {
        return propertyunits;
    }

    /**
     * Sets the value of the propertyunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYUNITS }
     *     
     */
    public void setPROPERTYUNITS(PROPERTYUNITS value) {
        this.propertyunits = value;
    }

    /**
     * Gets the value of the propertyvaluations property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYVALUATIONS }
     *     
     */
    public PROPERTYVALUATIONS getPROPERTYVALUATIONS() {
        return propertyvaluations;
    }

    /**
     * Sets the value of the propertyvaluations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYVALUATIONS }
     *     
     */
    public void setPROPERTYVALUATIONS(PROPERTYVALUATIONS value) {
        this.propertyvaluations = value;
    }

    /**
     * Gets the value of the repair property.
     * 
     * @return
     *     possible object is
     *     {@link REPAIR }
     *     
     */
    public REPAIR getREPAIR() {
        return repair;
    }

    /**
     * Sets the value of the repair property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPAIR }
     *     
     */
    public void setREPAIR(REPAIR value) {
        this.repair = value;
    }

    /**
     * Gets the value of the salescontracts property.
     * 
     * @return
     *     possible object is
     *     {@link SALESCONTRACTS }
     *     
     */
    public SALESCONTRACTS getSALESCONTRACTS() {
        return salescontracts;
    }

    /**
     * Sets the value of the salescontracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALESCONTRACTS }
     *     
     */
    public void setSALESCONTRACTS(SALESCONTRACTS value) {
        this.salescontracts = value;
    }

    /**
     * Gets the value of the saleshistories property.
     * 
     * @return
     *     possible object is
     *     {@link SALESHISTORIES }
     *     
     */
    public SALESHISTORIES getSALESHISTORIES() {
        return saleshistories;
    }

    /**
     * Sets the value of the saleshistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALESHISTORIES }
     *     
     */
    public void setSALESHISTORIES(SALESHISTORIES value) {
        this.saleshistories = value;
    }

    /**
     * Gets the value of the servitudes property.
     * 
     * @return
     *     possible object is
     *     {@link SERVITUDES }
     *     
     */
    public SERVITUDES getSERVITUDES() {
        return servitudes;
    }

    /**
     * Sets the value of the servitudes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVITUDES }
     *     
     */
    public void setSERVITUDES(SERVITUDES value) {
        this.servitudes = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SITE }
     *     
     */
    public SITE getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITE }
     *     
     */
    public void setSITE(SITE value) {
        this.site = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYEXTENSION }
     *     
     */
    public PROPERTYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYEXTENSION }
     *     
     */
    public void setEXTENSION(PROPERTYEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the valuationUseType property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationUseBase }
     *     
     */
    public ValuationUseBase getValuationUseType() {
        return valuationUseType;
    }

    /**
     * Sets the value of the valuationUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationUseBase }
     *     
     */
    public void setValuationUseType(ValuationUseBase value) {
        this.valuationUseType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
