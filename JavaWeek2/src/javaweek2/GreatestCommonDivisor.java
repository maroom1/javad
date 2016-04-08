/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek2;

import java.util.Scanner;

/**
 *
 * @author kcheung
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        // Initial gcd is 1
        int gcd = 1;
        int k = 2; // Possible gcd
        while (k <= n1 && k <= n2) {
            gcd = k; // Update gcd
            k++;
        }
        System.out.println("The greatest common divisor for " + n1
                + " and " + n2 + " is " + gcd);
    }

}
