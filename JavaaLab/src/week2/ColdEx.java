package week2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
/**
 *
 * @author Goduguluri
 */
public class ColdEx {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in Fahrenheit b/w -58F and 41F");
    int a=sc.nextInt();
    System.out.println("Enter the wind speed miles per hour");
    int b=sc.nextInt();
    double x=35.74+(0.6215*a)-(35.75*Math.pow(b, 0.16))+(0.4275*Math.pow(b,0.16)*a);
    System.out.println("The wind chill index is "+x);
    }  
}
