/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

/**
 *
 * @author YalamandaRao
 */
public class Rectangle {
    
    private double ht;
    private double wd;
    public Rectangle()
    {
    this.ht=1;
    this.wd=1;
        }


    public Rectangle( double ht,double wd)
    {
    this.ht=ht;
    this.wd=wd;
        }
    
    public double getArea(){
    return this.ht*this.wd;
        }
public double getPeri(){
    return 2*(this.ht+this.wd);
        }

    
}
