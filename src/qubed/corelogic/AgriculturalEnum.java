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
 * <p>Java class for AgriculturalEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgriculturalEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllAgriculturalTypes"/>
 *     &lt;enumeration value="Agricultural"/>
 *     &lt;enumeration value="Livestock"/>
 *     &lt;enumeration value="Nursery_Horticulture"/>
 *     &lt;enumeration value="AgriculturalPlant"/>
 *     &lt;enumeration value="AnimalFarm"/>
 *     &lt;enumeration value="Farms"/>
 *     &lt;enumeration value="AvocadoGrove"/>
 *     &lt;enumeration value="CitrusGrove"/>
 *     &lt;enumeration value="DairyFarm"/>
 *     &lt;enumeration value="FallowLand"/>
 *     &lt;enumeration value="FieldAndSeed"/>
 *     &lt;enumeration value="Fisheries"/>
 *     &lt;enumeration value="Forest"/>
 *     &lt;enumeration value="Greenbelt"/>
 *     &lt;enumeration value="Orchard"/>
 *     &lt;enumeration value="Pasture"/>
 *     &lt;enumeration value="PoultryRanch"/>
 *     &lt;enumeration value="TruckCrops"/>
 *     &lt;enumeration value="Vineyard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgriculturalEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum AgriculturalEnum {

    @XmlEnumValue("AllAgriculturalTypes")
    ALL_AGRICULTURAL_TYPES("AllAgriculturalTypes"),
    @XmlEnumValue("Agricultural")
    AGRICULTURAL("Agricultural"),
    @XmlEnumValue("Livestock")
    LIVESTOCK("Livestock"),
    @XmlEnumValue("Nursery_Horticulture")
    NURSERY_HORTICULTURE("Nursery_Horticulture"),
    @XmlEnumValue("AgriculturalPlant")
    AGRICULTURAL_PLANT("AgriculturalPlant"),
    @XmlEnumValue("AnimalFarm")
    ANIMAL_FARM("AnimalFarm"),
    @XmlEnumValue("Farms")
    FARMS("Farms"),
    @XmlEnumValue("AvocadoGrove")
    AVOCADO_GROVE("AvocadoGrove"),
    @XmlEnumValue("CitrusGrove")
    CITRUS_GROVE("CitrusGrove"),
    @XmlEnumValue("DairyFarm")
    DAIRY_FARM("DairyFarm"),
    @XmlEnumValue("FallowLand")
    FALLOW_LAND("FallowLand"),
    @XmlEnumValue("FieldAndSeed")
    FIELD_AND_SEED("FieldAndSeed"),
    @XmlEnumValue("Fisheries")
    FISHERIES("Fisheries"),
    @XmlEnumValue("Forest")
    FOREST("Forest"),
    @XmlEnumValue("Greenbelt")
    GREENBELT("Greenbelt"),
    @XmlEnumValue("Orchard")
    ORCHARD("Orchard"),
    @XmlEnumValue("Pasture")
    PASTURE("Pasture"),
    @XmlEnumValue("PoultryRanch")
    POULTRY_RANCH("PoultryRanch"),
    @XmlEnumValue("TruckCrops")
    TRUCK_CROPS("TruckCrops"),
    @XmlEnumValue("Vineyard")
    VINEYARD("Vineyard");
    private final String value;

    AgriculturalEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgriculturalEnum fromValue(String v) {
        for (AgriculturalEnum c: AgriculturalEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
