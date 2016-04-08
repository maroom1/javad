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
public class LeapYear {

    public static void main(String[] args) {
// Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
// Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
// Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }

}
