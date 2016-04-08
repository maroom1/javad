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
public class GradeEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter your grade");
    int s=sc.nextInt();
    if(s>=90)
        System.out.println("Congrats you have awarded A");
   else if(s>=80&&s<90)
        System.out.println("Congrats you have awarded B");
   else  if(s>=70&&s<80)
        System.out.println("Congrats you have awarded C");
   else if(s>=60&&s<70)
        System.out.println("Congrats you have awarded D");
   else 
       System.out.println("you have awarded E");
    }
}
