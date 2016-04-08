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
public class HW1_2 {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Murali Krishna Goduguluri");
        System.out.println("ID : 15200");
        System.out.println("=================================");
        System.out.println("\nHomework 1 output\n");
       
        int a;
        a = (int) (Math.random() * 21);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("I am think of a number between 1 and 20. \n" +
"\n" +
"Can you guess what it is? ");
        int g = input.nextInt();
         while(true)
        {
        if (g==a){
            System.out.print("Congratulations! You did it. \n");
        break;
        }
        if (g>a){
            System.out.print("Your guess is high. Try again:");
     g = input.nextInt();
        }
        if (g<a){
            System.out.print("Your guess is low. Try again:");
         g = input.nextInt();
        }
    }
}
}