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
 * <p>Java class for GRAPH_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRAPH_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GraphYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraphMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraphIsCurrentYearIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraphPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRAPH_ITEM", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "graphYear",
    "graphMonth",
    "graphIsCurrentYearIndicator",
    "graphPercentage"
})
public class GRAPHITEM {

    @XmlElement(name = "GraphYear")
    protected String graphYear;
    @XmlElement(name = "GraphMonth")
    protected String graphMonth;
    @XmlElement(name = "GraphIsCurrentYearIndicator")
    protected String graphIsCurrentYearIndicator;
    @XmlElement(name = "GraphPercentage")
    protected String graphPercentage;

    /**
     * Gets the value of the graphYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphYear() {
        return graphYear;
    }

    /**
     * Sets the value of the graphYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphYear(String value) {
        this.graphYear = value;
    }

    /**
     * Gets the value of the graphMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphMonth() {
        return graphMonth;
    }

    /**
     * Sets the value of the graphMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphMonth(String value) {
        this.graphMonth = value;
    }

    /**
     * Gets the value of the graphIsCurrentYearIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphIsCurrentYearIndicator() {
        return graphIsCurrentYearIndicator;
    }

    /**
     * Sets the value of the graphIsCurrentYearIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphIsCurrentYearIndicator(String value) {
        this.graphIsCurrentYearIndicator = value;
    }

    /**
     * Gets the value of the graphPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphPercentage() {
        return graphPercentage;
    }

    /**
     * Sets the value of the graphPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphPercentage(String value) {
        this.graphPercentage = value;
    }

}
