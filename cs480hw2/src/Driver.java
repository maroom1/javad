
class Driver
{
   //datatypes
    private int driverSn;
    private String driverType;
    private double voltage;
    
    //methods & constructors
    public Driver()
    {
        
    }
    public Driver(int drivSn,String drivtyp,double vlot)
    {
        this.driverSn = drivSn;
        this.driverType = drivtyp;
        this.voltage = vlot;
    }
    public void setDriverType(String driverTy)
    {
        this.driverType = driverTy;
    }
    public String getDriverType()
    {
        return driverType;
    }
    public int getDriverSn()
    {
        return driverSn;
    }
    public void setVoltage(double v)
    {
        this.voltage = v;
    }
    public double getVoltage()
    {
        return voltage;
    }
}