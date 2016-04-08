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
public class Driver {
    
    private int driverSn;
            private String driverType;
            private double  voltage;

    /**
     * @return the driverSn
     */
    public int getDriverSn() {
        return driverSn;
    }

    /**
     * @param driverSn the driverSn to set
     */
    public void setDriverSn(int driverSn) {
        this.driverSn = driverSn;
    }

    /**
     * @return the driverType
     */
    public String getDriverType() {
        return driverType;
    }

    /**
     * @param driverType the driverType to set
     */
    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    /**
     * @return the voltage
     */
    public double getVoltage() {
        return voltage;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
            
}
