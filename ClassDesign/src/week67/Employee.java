/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

/**
 *
 * @author YalamandaRao
 */
public class Employee extends Person{

    private int num;
    private double sal;

    public Employee(int num, double sal,String name,String Address,String Phone) {
      this.setNum(num);
      this.setSal(sal);
      this.setName(name);
   this.setAddress(Address);
   this.setPhone(Phone);
    }

    public Employee() {
         this.num = 0000;
        this.sal = 0.0; 
    }
    
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the sal
     */
    public double getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(double sal) {
        this.sal = sal;
    }
    
    public void displayEmployee()
    {
        this.displayPerson();
        System.out.println(this.getNum());
        System.out.println(this.getSal());
    
    
    }
}
