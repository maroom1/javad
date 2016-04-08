/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author program 2
 */
public class SportsCar extends Car {
   private String model;
     private String year; 
     public double d;
     public int t;
     
  Scanner sc=new Scanner(System.in); 

    public SportsCar() {
        System.out.println("Enter values to : "+this.getClass().getName());
        
        System.out.println("Enter the model of car : ");
        model=sc.next();
        System.out.println("Enter the year of make : ");
        year=sc.next();
        System.out.println("Enter the color of the model : ");
        color=sc.next();
         System.out.println("Enter the distance traveled : ");
         d=sc.nextDouble();
        System.out.println("Enter the time(hours)took to cover the distance :");
         t=sc.nextInt();
    }
   
    
    @Override
    public void calculateAcceleration() {
        double z=(d/(t*t));
         System.out.println("acceleration of the car is :"+z);
    }

    @Override
    public void calculateSpeed() {
        
        System.out.println("Speed of the car is :"+(d/t));
    }

    @Override
    public void display() {
        
       System.out.println("Details of the car : ");
       System.out.println("Car type : "+this.getClass().getName());
       System.out.println("Model : "+model);
       System.out.println("year : "+year);
       System.out.println("color : "+color);
       calculateSpeed();
       calculateAcceleration();
        
          
       
        
       

    }
     
}
