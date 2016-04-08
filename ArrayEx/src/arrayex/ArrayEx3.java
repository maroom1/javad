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
public class ArrayEx3 {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        
        int a[]=new int[sc.nextInt()];
        System.out.println("Enter array element values :");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        a[5]=sc.nextInt();
       System.out.println("Array Size is :"+a.length);
        
       System.out.println("Entered array element values :");
         
        System.out.println(a[0]);
        
        System.out.println(a[1]);
        
        System.out.println(a[2]);
        
        System.out.println(a[3]);
        
        System.out.println(a[4]);
        
        System.out.println(a[5]);
        
        
    
    }
    
}
