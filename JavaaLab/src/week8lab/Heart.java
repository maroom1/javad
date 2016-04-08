/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8lab;

/**
 *
 * @author Goduguluri
 */
public class Heart {
    private int bitrate;
    private double wt;
    private double siz;

    public Heart(int bitrate, double wt, double siz) {
        this.bitrate = bitrate;
        this.wt = wt;
        this.siz = siz;
    }

    
    public void display()
    {
    
    System.out.println("Heart Values = "+this.bitrate+","+this.wt+","+this.siz);
    }
    
    
    
    
}
