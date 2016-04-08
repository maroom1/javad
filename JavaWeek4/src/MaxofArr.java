
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
public class MaxofArr {
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Enter the number to find maximum and press 0 to stop");
        Scanner sc=new Scanner(System.in);
     int a=0,temp=0;
    while(true){
     a =sc.nextInt();
     if(a>temp)
         temp=a;
     if(a==0){
         System.out.println("Maximum numbers entered is "+temp+" last entered number is"+0);
           break;
     }
    }
}
}
