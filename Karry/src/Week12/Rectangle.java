/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

/**
 *
 * @author Goduguluri
 */
public class Rectangle extends Shape implements Permiteter,Area,Display {
    
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth,String color) {
        this.length = length;
        this.breadth = breadth;
        this.setColor(color);
    }

    
    
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public void abstractPeriMeter() {
        System.out.println(length+breadth);   }

    @Override
    public void abstractArea() {
        System.out.println(length*breadth);
    }

    @Override
    public void abstractDisplay() {
    
        System.out.println(" Lenght :"+length+" Breadth :"+
                breadth+" color :"+getColor());
    
    }
    
    
    
}
