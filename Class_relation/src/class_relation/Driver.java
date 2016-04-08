


package class_relation;

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
