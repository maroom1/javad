/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_hw4;



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
