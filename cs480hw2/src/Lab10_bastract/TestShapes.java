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

public class TestShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("red",2.0,3.0);
        Circle c = new Circle("blue", 4.5);
        Square s = new Square("green", 5.5);
    
        System.out.println("Area of rectangle: " + r.calculateArea());
        System.out.println("Perimeter of rectangle: " + r.calculatePerimeter());
        
        System.out.println("Area of circle: " +c.calculateArea());
        System.out.println("Perimeter of circle: " +c.calculatePerimeter());
        
        System.out.println("Area of square: " +s.calculateArea());
        System.out.println("Perimeter of square: " + s.calculatePerimeter());
               
    }
    
    
    
    
    
}