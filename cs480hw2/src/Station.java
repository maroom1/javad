/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
import java.util.*;
import java.lang.*;
//Question#1:Implementation of the class diagram
class Station
{
    //datatypes
    private String StationName;
    private String ModelType;
    private double Price;
    private Slot[] slot;
    //Methods & Constructors
    
    public Station()
    {
        
    }
        
    public Station(String stationName,String Modtyp,double p,int numslots)
    {
        this.StationName = stationName;
        this.ModelType = Modtyp;
        this.Price = p;
        //Composition Relation between Station and Slot
        slot = new Slot[numslots];
    }
    public void setStationName(String stname)
    {
        this.StationName = stname;
    }
    public String getStationName()
    {
        return StationName;
    }
    public void setPrice(double p)
    {
        this.Price = p;
    }
    public double getPrice()
    {
        return Price;
    }
    /**
     * @return the ModelType
     */
    public String getModelType() {
        return ModelType;
    }
    //Question 2: getslot(int slotindex) in Station Class
    public Slot getSlot(int slotindex)
    {
        return slot[slotindex];
    }
    //Question 3: getSlot(String slotName) in station class
    public Slot getSlot(String slotName)
    {
        return slot[0];
    }
    /*Qusetion 4:which returns an array of slotobjects which have no driver
    objects
    */
    public Slot[] getSlotNoDriver()
    {
        //Aggregation Relationship
        int l = slot.length;
        Slot[] s = new Slot[l];
        for(int i =0;i<l;i++)
        {
            if (slot[i].getDriver()== null)
                s[i]=slot[i];
        }
        return s;
    }
    /*Question 5:which returns an array of objects for which the drivers the
    voltages is above 10v
    */
    public Slot[] getSlotWithHighVlot()
    {   
        Driver d = new Driver();
        int l = slot.length;
        Slot[] v = new Slot[l];
        for(int j=0;j<l;j++)
        {
            d = slot[j].getDriver();
            if(d.getVoltage() > 10)
                v[j] = slot[j];
        }
        return v;
    }
    /*Qusetion 6:which returns the driver which has the highest Voltage */
    public Driver getDriverWithHighVolt()
    {
        Driver d = new Driver();
        double max = d.getVoltage();
        return d;
                
    }
    /*Qusetion 7:Printing all the station Objects including all the
    slot objects and all associated driver objects
    */
    public void printEntireStation(Driver d,Slot[] s1)
    {
        System.out.println("Print all Station details\n");
        System.out.println("StationName "+StationName+" ModelType "+ModelType+"\n");
        int l = s1.length;
        System.out.println(" Price "+Price+"Slots "+l+"\n");
        System.out.println("Number of slots:"+l);
        for(int i=0;i<l;i++)
            System.out.println("Associated Slots Details Slot No:"+i+" "+s1[i].getSlotName()+" "+s1[i].getSlotNo()+"\n");
        System.out.println("Associated Driver Details :"+d.getDriverSn()+" "+d.getDriverType()+" "+d.getVoltage()+"\n");
    }
    /*Ouestion 8: Comparing the current Object with instance Object of the station
    Comparing the slots and voltage of the driver
    */
    public boolean isStation(Station st)
    {
        boolean isstat =false;
        if(this == st )
        {
            isstat = true;
        }
        return isstat;
    }
}


