/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Goduguluri
 */
public class Employee extends Person {
    
private int empid;
private double sal;

    public Employee(int empid, String name,double sal, int br, double wt,double siz,Address ad) {
        super(name,br,wt,siz,ad);
        this.empid = empid;
        this.sal = sal;
    }
public void display(){
System.out.println("Employee id = "+this.empid);
super.displayemp();
System.out.println("Employee Sal = "+this.sal);

}

}
