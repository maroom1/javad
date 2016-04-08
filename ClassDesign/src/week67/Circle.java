/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Circle {
    private int id;
    private double radius;
    private String s;
    Circle()
    {
       
    }
    Circle(int id,double r,String s)
    {
        this.id =id;
        this.radius=r;
        this.s=s;
     
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
     
    public void display1()
    {
   
    System.out.println(id+"--------" +radius+"-------"+getArea (radius)+"--------"+s);
    
    
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }
     
}