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
public class Methods3 {
    public static void print1to100(int a, int b){ //2 parameters
     for (int i=a;i<=b;i++){
         System.out.print(i+" ");
     }
    }
   
    public static void main(String args[]){
// printing 100 values by passing a parameter
        
     System.out.println("Printing 1-1000 numbers ");
    //calling statement // 2 parameters
     int a=1,b=100;
     for(int i=0;i<10;i++){
                print1to100(a,b); 
                a=a+100;//101//101+100
                b=b+100;//200//200+100
       System.out.println();
     }
     
        
    }
    
}
