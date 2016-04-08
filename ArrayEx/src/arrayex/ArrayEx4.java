/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Goduguluri
 */
public class ArrayEx4 {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Building the first array :");
        System.out.println("Enter array size :");
        
        int a[]=new int[sc.nextInt()];
        System.out.println("Enter array element values :");
        for(int i=0;i<a.length;i++){
        System.out.println(" index "+i+":");
            
            a[i]=sc.nextInt();
        
        }
        
       System.out.println("Array Size is :"+a.length);
        
       System.out.println("Entered array element values :");
         
       for(int j=0;j<a.length;j++){ 
       System.out.println(a[j]);
       }
        
        
        
        System.out.println("Building the second array :");
        System.out.println("Enter array size :");
        
        int b[]=new int[sc.nextInt()];
        System.out.println("Enter array element values :");
        for(int k=0;k<b.length;k++){
        System.out.println(" index "+k+":");
            
            b[k]=sc.nextInt();
        
        }
        
       System.out.println("Array 2 Size is :"+b.length);
        
       System.out.println("Entered array element values :");
         
       for(int l=0;l<b.length;l++){ 
       System.out.println(b[l]);
       }
        
        
        
    
    }
    
}
