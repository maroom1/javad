/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrelationship;

/**
 *
 * @author YalamandaRao
 */
public class Station {
    
    private String stationName;
            private String modelType;
            private double price;
                    private Slot[] slots;

    /**
     * @return the stationName
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * @param stationName the stationName to set
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * @return the modelType
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * @param modelType the modelType to set
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the slots
     */
    public Slot[] getSlots() {
        return slots;
    }

    /**
     * @param slots the slots to set
     */
    public void setSlots(Slot[] slots) {
        this.slots = slots;
    }
            
    
}
