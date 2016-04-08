package week2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class DisEx {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the driving distance");
    double a=sc.nextFloat();
    System.out.println("Enter miles per gallon");
    double b=sc.nextFloat();
    System.out.println("Enter price per gallon");
    double c=sc.nextFloat();
    double x=(c*a)/b;
    System.out.println("The cost of driving is "+x);
    }  
}
