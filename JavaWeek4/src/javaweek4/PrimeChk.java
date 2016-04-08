/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek4;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class PrimeChk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
    int a =sc.nextInt();
    int c=0;
    for (int i=1;i<=a;i++)
        if(a%i==0)
            c++;
   if(c==2)
       System.out.println("It is Prime");
   else
   System.out.println("Not Prime");
    }
    
}
