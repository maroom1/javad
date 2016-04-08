/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW2_Summer_2015
 * Author: Goduguluri 
 * Filename: Driver.java 
 * Date and Time: Jun 16, 2015 7:22:56 PM 
 * Project Name: CS480KHW2 
 */

/**
 *
 * @author Goduguluri
 */
public class Driver {

	private int driverSn;
	private String driverType;
	private double voltage;
	
	public Driver(){}
	
	public Driver(int driverSn, String driverType, double voltage) {
		super();
		this.driverSn = driverSn;
		this.driverType = driverType;
		this.voltage = voltage;
	}

	public String getDriverType() {
		return driverType;
	}
	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}
	public double getVoltage() {
		return voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	public int getDriverSn() {
		return driverSn;
	}

	@Override
	public String toString() {
		return "Driver [driverSn=" + driverSn + ", driverType=" + driverType
				+ ", voltage=" + voltage + "]";
	}
}
