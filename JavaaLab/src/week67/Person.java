package week67;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YalamandaRao
 */
public class Person {
    private String name;
    private String Address;
    private String Phone;
    
    public Person()
    {
        this.setName("Hello");
        this.setAddress("world");
        this.setPhone("123");    
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
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public void displayPerson(){
    System.out.println(this.getName());
    System.out.println(this.getAddress());
    System.out.println(this.getPhone());
       
    }
    
}