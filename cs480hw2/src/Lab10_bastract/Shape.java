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
abstract class Shape {
    protected String color;
    
    protected Shape() {}
            
    abstract public double calculateArea();
    abstract public double calculatePerimeter();
}
