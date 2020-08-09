//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONVERSION_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONVERSION_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionFullRehabilitationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyStructureBuiltYear" type="{http://www.mismo.org/residential/2009/schemas}MISMOYear" minOccurs="0"/>
 *         &lt;element name="ProjectStructureConditionSufficientIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectSafetyRepairsCompleteIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectReplacementReservesAllocatedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectReplacementReservesSufficientIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONVERSION_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "conversionFullRehabilitationIndicator",
    "propertyStructureBuiltYear",
    "projectStructureConditionSufficientIndicator",
    "projectSafetyRepairsCompleteIndicator",
    "projectReplacementReservesAllocatedIndicator",
    "projectReplacementReservesSufficientIndicator"
})
public class CONVERSIONCORELOGIC {

    @XmlElement(name = "ConversionFullRehabilitationIndicator")
    protected MISMOIndicator conversionFullRehabilitationIndicator;
    @XmlElement(name = "PropertyStructureBuiltYear")
    protected MISMOYear propertyStructureBuiltYear;
    @XmlElement(name = "ProjectStructureConditionSufficientIndicator")
    protected MISMOIndicator projectStructureConditionSufficientIndicator;
    @XmlElement(name = "ProjectSafetyRepairsCompleteIndicator")
    protected MISMOIndicator projectSafetyRepairsCompleteIndicator;
    @XmlElement(name = "ProjectReplacementReservesAllocatedIndicator")
    protected MISMOIndicator projectReplacementReservesAllocatedIndicator;
    @XmlElement(name = "ProjectReplacementReservesSufficientIndicator")
    protected MISMOIndicator projectReplacementReservesSufficientIndicator;

    /**
     * Gets the value of the conversionFullRehabilitationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getConversionFullRehabilitationIndicator() {
        return conversionFullRehabilitationIndicator;
    }

    /**
     * Sets the value of the conversionFullRehabilitationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setConversionFullRehabilitationIndicator(MISMOIndicator value) {
        this.conversionFullRehabilitationIndicator = value;
    }

    /**
     * Gets the value of the propertyStructureBuiltYear property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOYear }
     *     
     */
    public MISMOYear getPropertyStructureBuiltYear() {
        return propertyStructureBuiltYear;
    }

    /**
     * Sets the value of the propertyStructureBuiltYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOYear }
     *     
     */
    public void setPropertyStructureBuiltYear(MISMOYear value) {
        this.propertyStructureBuiltYear = value;
    }

    /**
     * Gets the value of the projectStructureConditionSufficientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getProjectStructureConditionSufficientIndicator() {
        return projectStructureConditionSufficientIndicator;
    }

    /**
     * Sets the value of the projectStructureConditionSufficientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setProjectStructureConditionSufficientIndicator(MISMOIndicator value) {
        this.projectStructureConditionSufficientIndicator = value;
    }

    /**
     * Gets the value of the projectSafetyRepairsCompleteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getProjectSafetyRepairsCompleteIndicator() {
        return projectSafetyRepairsCompleteIndicator;
    }

    /**
     * Sets the value of the projectSafetyRepairsCompleteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setProjectSafetyRepairsCompleteIndicator(MISMOIndicator value) {
        this.projectSafetyRepairsCompleteIndicator = value;
    }

    /**
     * Gets the value of the projectReplacementReservesAllocatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getProjectReplacementReservesAllocatedIndicator() {
        return projectReplacementReservesAllocatedIndicator;
    }

    /**
     * Sets the value of the projectReplacementReservesAllocatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setProjectReplacementReservesAllocatedIndicator(MISMOIndicator value) {
        this.projectReplacementReservesAllocatedIndicator = value;
    }

    /**
     * Gets the value of the projectReplacementReservesSufficientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MISMOIndicator }
     *     
     */
    public MISMOIndicator getProjectReplacementReservesSufficientIndicator() {
        return projectReplacementReservesSufficientIndicator;
    }

    /**
     * Sets the value of the projectReplacementReservesSufficientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMOIndicator }
     *     
     */
    public void setProjectReplacementReservesSufficientIndicator(MISMOIndicator value) {
        this.projectReplacementReservesSufficientIndicator = value;
    }

}
