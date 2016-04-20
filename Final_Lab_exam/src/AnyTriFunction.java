/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class AnyTriFunction implements SVFunction{
    
    private double amplitude;
    private double period;
    
    public AnyTriFunction (double x, double y){
        System.out.println("Constructor of AnyTriFunction");
    
    }
    public double getAmplitude (){
         System.out.println("getAmplitude of AnyTriFunction");
        
        return 0;
    }
    public double getperiod (){
         System.out.println("getperiod of AnyTriFunction");
        return 0;
    }

   
    public double yValue(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
