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
public class Square extends Shape implements Permiteter,Area,Display {
    
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public Square(double side,String color) {
        this.side = side;
    this.setColor(color);
    }
    
    

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    


    @Override
    public void abstractPeriMeter() {
  System.out.println(4*side);  }

    @Override
    public void abstractArea() {
 System.out.println(side*side);   }

    @Override
    public void abstractDisplay() {
    System.out.println(" Side is "+side+ " and color is "+
            this.getColor());
    
    
    }
    
    
    
}
