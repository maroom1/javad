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
public class Rectangle extends Shape{
    protected double width;
    protected double height;
    
    //public Rectangle() {}
    
    public Rectangle(String color, double width, double height) {
        super();
        this.color = color;
        this.width = width;
        this.height = height;  
    }
    
    public double calculateArea() {
        return width*height;
    }
    public double calculatePerimeter() {
        return 2*(width + height);
    }
}
