
import java.util.Arrays;

/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW2_Summer_2015
 * Author: Goduguluri 
 * Filename: Station.java 
 * Date and Time: Jun 16, 2015 7:58:25 PM 
 * Project Name: CS480KHW2 
 */

/**
 *
 * @author Goduguluri
 */
public class Station {
	
	private String stationName;
	private String modelType;
	private double price;
	private int numSlots = 0;
	private Slot[] slot= new Slot[10];// station having slots 10
	
	public Station(String stationName, String modelType, double price,
			int numSlots) {
		super();
		this.stationName = stationName;
		this.modelType = modelType;
		this.price = price;
		this.numSlots = numSlots;
		init();
	}

	public void init()
	{
		createSlots();
	}
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModelType() {
		return modelType;
	}
	

	public void createSlots()
	{
		for(int i=0;i<numSlots;i++)
		{
			slot[i] = new Slot(); //"dayShift_" + i,i,new Driver(i,"Master_"+i,1000));
		}
	}
/***********************************************
******************Question 4:*******************
***********************************************/        
	
	public Slot getSlot(int slotIndex)
	{
		return slot[slotIndex];
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public Slot getSlot(String slotName)
	{
		Slot slotObj = null;
		for(int i=0;i<numSlots;i++)
		{
			if(slot[i].getSlotName() != null)
				if(slot[i].getSlotName().equals(slotName))
				{ 
					slotObj = slot[i];
					break;
				}
		}
		return slotObj;
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public Slot[] getSlotNoDriver()
	{
		Slot[] slotObj = new Slot[numSlots];
		int index = 0;
		for(int i=0;i<numSlots;i++)
		{
			if(slot[i] != null && slot[i].getSlotName() != null && slot[i].getDriver().getDriverType() == null)
			{
				index++;
				slotObj[index] = slot[i];
			}
		}
		return slotObj;
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public Slot[] getSlotHighVolt()
	{
		Slot[] slotObj = new Slot[numSlots];
		int index = 0;
		for(int i=0;i<numSlots;i++)
		{
			if(slot[i] != null && slot[i].getSlotName() != null && slot[i].getDriver().getVoltage() > 10)
			{
				index++;
				slotObj[index] = slot[i];
			}
		}
		return slotObj;
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public Driver getDriverWithHighestVolt()
	{
		Driver driverObj = slot[1].getDriver();
		
		for(int i=1;i<numSlots;i++)
		{
			if(slot[i] != null && slot[i].getDriver().getVoltage() > 0)
			{
				if(driverObj.getVoltage() < slot[i].getDriver().getVoltage())
					driverObj = slot[i].getDriver();
			}
		}
		return driverObj;
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public void printEntireStation()
	{
		for(int i=1;i<numSlots;i++)
		{
			if(slot[i] != null && slot[i].getSlotName() != null)
			{
				System.out.println(slot[i]);
			}
		}
	}
/***********************************************
******************Question 4:*******************
***********************************************/	
	public boolean isSameStation(Station station)
	{
		boolean isFound = false;
		for(int i=1;i<numSlots;i++)
		{
			if(slot[i] != null && slot[i].getSlotName() != null)
			{
				if(slot[i].getSlotName() == station.getSlot(i).getSlotName() && slot[i].getSlotNo() == station.getSlot(i).getSlotNo() &&
						slot[i].getDriver().getDriverType() == station.getSlot(i).getDriver().getDriverType() &&
						slot[i].getDriver().getVoltage() == station.getSlot(i).getDriver().getVoltage())
				{
					isFound = true;
					break;
				}
				
			}
		}
		return isFound;
	}
	
	@Override
	public String toString() {
		return "Station [stationName=" + stationName + ", modelType="
				+ modelType + ", price=" + price + ", numSlots=" + numSlots
				+ ", slot=" + Arrays.toString(slot) + "]";
	}
	}
