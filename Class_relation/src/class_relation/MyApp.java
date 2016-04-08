package com.csassign;

import class_relation.Driver;

public class MyApp {

	public static void main(String[] args) {
		
		Slot[] slots = new Slot[10];
		
		//Station 1
		Station stationGnt = new Station("Guntur","SuperLuxary",2000,10);
		
		//Station 1 --> Slot 1
		Slot slotObj1 = stationGnt.getSlot(1);
		Driver driver1 = slotObj1.getDriver();
		driver1.setDriverType("Gold");
		driver1.setVoltage(10);
		slotObj1.setDriver(driver1);
		slotObj1.setSlotName("DayShift");
		
		//Station 1 --> Slot 2
		Slot slotObj2 = stationGnt.getSlot(2);
		Driver driver2 = slotObj2.getDriver();
		driver2.setDriverType("Silver");
		driver2.setVoltage(20);
		slotObj2.setDriver(driver2);
		slotObj2.setSlotName("AfterNoonShift");
		
		//Station 1 --> Slot 3
		Slot slotObj3 = stationGnt.getSlot(3);
		Driver driver3 = slotObj3.getDriver();
		driver3.setDriverType("Platinum");
		driver3.setVoltage(50);
		slotObj3.setDriver(driver3);
		slotObj3.setSlotName("NightShift");
		
		//Station 1 --> Slot 3
		Slot slotObj4 = stationGnt.getSlot(4);
		/*Driver driver4 = slotObj3.getDriver();
		driver4.setDriverType("Platinum");
		driver4.setVoltage(1000);
		slotObj4.setDriver(driver4);*/
		slotObj4.setSlotName("WeekendShift");
		
		//Staion 2
		Station stationBza = new Station("Vijawada","Delux",2000,10);
		
		//Question-2
		System.out.println(stationGnt.getSlot(2).toString());
		//Question-3
		System.out.println(stationGnt.getSlot("NightShift"));
		
		//Question-4
		slots= stationGnt.getSlotNoDriver();
		System.out.println("\nSlots Having No Driver:");
		for(int i=0;i<slots.length;i++)
		{
			if(slots[i] != null)
				System.out.println(slots[i]);
		}
		
		//Question-5
		slots= stationGnt.getSlotHighVolt();
		System.out.println("\nSlots Having Driver Voltage > 10:");
		for(int i=0;i<slots.length;i++)
		{
			if(slots[i] != null)
				System.out.println(slots[i]);
		}
		
		//Question-6
		Driver driver = stationGnt.getDriverWithHighestVolt();
		System.out.println("\nDriver with Highest Voltage:" + driver);
		
		//Question-7
		System.out.println("\nEntire Station Information:" + driver);
		stationGnt.printEntireStation();
		
		//Question-8
		System.out.println("\nCheck Duplicate Station Exist or not :" + stationGnt.isSameStation(stationGnt));
	}

}
