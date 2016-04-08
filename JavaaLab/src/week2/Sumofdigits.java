/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Sumofdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
            int n;
            System.out.print("Enter a  integer: ");
            n = x.nextInt();
           
                  int sum = 0;
                  while (n != 0) {
                  sum += n % 10;
                    n /= 10;
                  }
                  System.out.println("Sum of digits: " + sum);
            
    }
    
}
