package com.csassign;

import class_relation.Driver;

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
