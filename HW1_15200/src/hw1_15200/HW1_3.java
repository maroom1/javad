/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1_15200;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class HW1_3 {
    public static void main(String args[])
   {
       System.out.println("=================================");
        System.out.println("Murali Krishna Goduguluri");
        System.out.println("ID : 15200");
        System.out.println("=================================");
        System.out.println("\nHomework 1 output\n");
      String x, y = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a number");
      x = in.nextLine();
 
      int length = x.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         y = y + x.charAt(i);
 
      if (x.equals(y))
         System.out.println("number is a palindrome.");
      else
         System.out.println("number is not a palindrome.");
 
   }
}

