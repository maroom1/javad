/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Larry;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class PrintingNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Printing 1 to 10 numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Value a :"+a+" :"+b+" :"+c);
        // we have 3 main loops  " while loop ",  "for loop ",  " do while loop " 
        System.out.println(" printing through while loop :");
        int i=0;
        while(i<=10) { // when the condition is true we will go inside and run it.
            System.out.println(" Enter the value :");
                i=sc.nextInt();
        System.out.println("Value entered :" +i);
            
        }
        
        System.out.println(" printing through for loop :");
        //for( intiliaizer ; condition ; incrementer ){
     //}
        for(int j=1;j<=10;j++){
            System.out.println("Value of J :" + j);
        }
        
        //"j++" =  "J=J+1" 
        
        System.out.println(" printing through do while loop :");
        
        //do {
//   
// }while(consdition);
         int k=0;
        do{
         System.out.println(" Enter the value :");
                k=sc.nextInt();
        System.out.println("Value entered :" +i);
        }while(k<=10);
        
        
    }
    
}
