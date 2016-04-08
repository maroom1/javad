/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW4_Summer_2015
 * Author: Goduguluri 
 * Filename: Schedule.java 
 * Date and Time: Aug 19, 2015 7:15:17 PM 
 * Project Name: Week13_HW4_15200 
 */
package BusinessLogic;



/**
 *
 * @author Goduguluri
 */
public class Schedule {
    private String eventdt;
    private String eventtm;
    private String descp;
    private int status;

    public Schedule(String eventdt, String eventtm, String descp, int status) {
        this.eventdt = eventdt;
        this.eventtm = eventtm;
        this.descp = descp;
        this.status = status;
    }
    public void display(){
    System.out.println(this.eventdt+this.eventtm+this.descp+this.status);
    }
    
    
}
