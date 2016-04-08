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

public class Square extends Rectangle{
    protected double side;
   
    
    public Square(String color, double side) {
        super("red", 5.0,6.0);
        this.color = color;
        this.side = side;
    } 
    
    public double calculateArea() {
        return side*side;
    }
    public double calculatePerimeter() {
        return 4*side;
    }
}
