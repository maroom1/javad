/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10_bastract;

/**
 *
 * @author Goduguluri
 */

public class Circle extends Shape{
    protected double radius;
   private final static double PI = 3.14;
    
    public Circle() {}
    
    public Circle(String color, double radius) {
        super();
        this.color = color;
        this.radius= radius; 
    }
    public double calculateArea() {
        return PI*radius*radius;
    }
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
