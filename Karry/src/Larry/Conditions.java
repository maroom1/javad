/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Larry;

/**
 *
 * @author Goduguluri
 */
public class Conditions {
    public static void main(String []args){
        
        // we have 3 types of conditions if . if else . switch
    
     System.out.println(" printing through while loop  excluding 5:");
        int i=0;
        while(i<100){ 
                 i++; 
                 //if(condition) {
                 //run
        //}
                 if(i!=5){
            System.out.print(i+" "); 
                 }
        
        }
        // exited the while when i value is 10
        System.out.println();
        
    
         System.out.println(" printing through while loop exclding values which are divisible by 5 :");
        int j=0,x;
        while(j<100){ 
                 j++; 
                 //if(condition) {
                 //run
        //}
                 x=j%5; // reminder is passed into x 
                 
                 if(x!=0){ // check the values
                System.out.print(j+" "); 
                 }
        
        }
        // exited the while when i value is 10
        System.out.println();
        
    
    
    }
    
}
