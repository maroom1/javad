class Slot
{
    //datatypes
    private String slotName;
    private int slotNo;
    private Driver driver;
    
    //methods & Constructors
    public Slot()
    {
        
    }
    public Slot(String slotnm,int slotnum,Driver dr)
    {
        this.slotName = slotnm;
        this.slotNo = slotnum;
        //Aggregation Relationship
        this.driver = dr;
        
    }

    /**
     * @return the slotName
     */
    public String getSlotName() {
        return slotName;
    }

    /**
     * @param slotName the slotName to set
     */
    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }
    public int getSlotNo()
    {
        return slotNo;
    }
    public void setDriver(Driver dr)
    {
        this.driver = dr;
    }
    public Driver getDriver()
    {
        return driver;
    }
    
}