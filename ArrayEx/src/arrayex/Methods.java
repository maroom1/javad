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
public class Methods {
    public static void print1to100(){
     for (int i=1;i<=100;i++){
         System.out.print(i+" ");
     }
    }
   
    public static void main(String args[]){

     System.out.println("Printing 1-100 numbers ");
     print1to100(); //calling statement
     System.out.println();
     System.out.println("Printing secocnd time 1-100 numbers ");
     print1to100();
     System.out.println();
     System.out.println("Printing third time 1-100 numbers ");
     print1to100();     
     System.out.println();
     System.out.println("Printing fourth time 1-100 numbers ");
     print1to100();
     
        
    }
    
}
