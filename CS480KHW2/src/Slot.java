/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW2_Summer_2015
 * Author: Goduguluri 
 * Filename: Slot.java 
 * Date and Time: Jun 16, 2015 7:50:55 PM 
 * Project Name: CS480KHW2 
 */

/**
 *
 * @author Goduguluri
 */
public class Slot {
	
	private String slotName;
	private int slotNo;
	private Driver driver;
	
	public Slot()
	{
		driver = new Driver();
	}
	
	public Slot(String slotName, int slotNo, Driver driver) {
		super();
		this.slotName = slotName;
		this.slotNo = slotNo;
		this.driver = driver;
	}

	public String getSlotName() {
		return slotName;
	}
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public int getSlotNo() {
		return slotNo;
	}
	
	@Override
	public String toString() {
		return "Slot [slotName=" + slotName + ", slotNo=" + slotNo
				+ ", driver=" + driver + "]";
	}
	
}
