/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

import lab.*;
import java.util.Scanner;

/**
 *
 * @author program 1 main class
 */
public class Triangle extends Shape implements Permiteter,Area,Display{
    
    private int side1;
    private int side2;
    private int side3;
    

    public Triangle() {
    }
    

    public Triangle(int side1, int side2, int side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
       this.setColor(null);
    }

    @Override
    
    public void abstractDisplay(){
    
       System.out.println("Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + this.getColor() + '}');
     
    
    }
    
    
    @Override
    public void abstractArea() {
    int s=(side1+side2+side3)/2;
          System.out.println(Math.sqrt(s*(s-side1)+(s-side2)*(s-side3)));
       
    }

    @Override
    public void abstractPeriMeter()
       {
         System.out.println(side3+side1+side2); 
       }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + this.getColor() + '}';
    }
    
  
    
    
    
    
}
