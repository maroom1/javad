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
public class MeasureTemp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of water in kilograms");
    int a=sc.nextInt();
    System.out.println("Enter Initial Temperature");
    int b=sc.nextInt();
    System.out.println("Enter final temperature");
    int c=sc.nextInt();
    int x=a*(c-b)*4184;
    System.out.println("The energy needed is "+x);
    }    
}
