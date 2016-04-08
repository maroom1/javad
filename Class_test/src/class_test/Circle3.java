/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_test;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Circle3 {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        
        private double radius;
    Circle3()
    {
       
    }
    Circle3(double r)
    {
        this.radius =r;
    }
 
    public double getRadius() {
        return radius;
    }
 
   
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    public double getArea(double radius)
    {
        double a = 3.14*radius*radius;
        return a;
    }
 
    public double getPerimeter(double radius)
    {
        double p = 2*3.14*radius;
        return p;
    }
     public void display()
    {
        System.out.println("the radius of the circle : " + radius + " \n ");
        System.out.println("the Area of the circle : " + getArea (radius) + " \n ");
        System.out.println("the Perimeter of the circle : " + getPerimeter (radius) + " \n ");
    }
    
        
    
    
public static void main(String[]  args){
 Circle3 C = new Circle3();
         System.out.println("Please enter the radius : \n ");
         Scanner sc= new Scanner(System.in);
         double r = sc.nextDouble();
         if(r<0)
         {
             System.out.println("Enter a valid radius : \n ");
         }
         else
         {
         C.setRadius(r);
         C.display();
         }
}

}

