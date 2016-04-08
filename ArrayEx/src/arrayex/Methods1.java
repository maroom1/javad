/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

/**
 *
 * @author Goduguluri
 */
public class Methods1 {
    public static void print1to100(int a){
     for (int i=1;i<=a;i++){
         System.out.print(i+" ");
     }
    }
   
    public static void main(String args[]){
// printing 100 values by passing a parameter
     System.out.println("Printing 1-100 numbers ");
     print1to100(100); //calling statement
     System.out.println();
    
     
        
    }
    
}
