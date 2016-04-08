/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Goduguluri
 */
public class Address {
    private String city;
    private int zip;
    private String st;

    public Address(String city, int zip, String st) {
        this.city = city;
        this.zip = zip;
        this.st = st;
    }
    
    public void display(){
    System.out.println("city = "+this.city+"\n"+"Zip code = "+
        this.zip+"\n"+ "Street = "+this.st);
    
    }
}
