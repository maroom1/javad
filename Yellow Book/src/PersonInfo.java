

/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW3_Summer_2015
 * Author: Goduguluri 
 * Filename: class3.java 
 * Date and Time: Jul 24, 2015 11:23:32 AM 
 * Project Name: Week12_HW_15200 
 */

/**
 *
 * @author Goduguluri
 */

public class PersonInfo
{
	private String name,address;
	private int home,work,other;

      // default constructor
      public PersonInfo()
      {       
         name = "";
         address = "";
         home =0;

         work = 0;  
         other = 0;
      }

	public PersonInfo( String name, String address,int home,int work, int other)
	{
                this.work = work;
		this.name = name;
		this.address = address;
		this.other = other;
		this.home = home;
	}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the home
     */
    public int getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(int home) {
        this.home = home;
    }

    /**
     * @return the work
     */
    public int getWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(int work) {
        this.work = work;
    }

    /**
     * @return the other
     */
    public int getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(int other) {
        this.other = other;
    }
 
   

   
}

