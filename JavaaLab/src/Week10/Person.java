/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Person implements Displayable,Inputable {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    Person(){
    //getInput();
    }
    

    @Override
    public void display() {
    System.out.println("Person name: "+this.name);
     System.out.println("Person address: "+this.address);
        }

    @Override
    public void getInput() {
         Scanner sc=new Scanner(System.in);
       System.out.println("Person name: ");
       this.name=sc.next();
     System.out.println("Person address: ");
     this.address=sc.next();
   }
    
    
    
}
