/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tradeapp;
import java.util.Scanner;

/**
 *
 * @author kcheung
 */
public class TradeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Trade Center");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
         // Perform trading calculations ntil choice isn't equal to y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter trading price:  ");
             double price = sc.nextDouble();
            
            // Calculate the commission amount and total cost
            double commissionPercent = 0.0;
            if (price >= 2000)
                commissionPercent = .2;
             else if (price >= 1000)
                commissionPercent = .1;
            else
                commissionPercent = 0.0;
            
            double commissionAmount = price * commissionPercent;
             double total = price + commissionAmount;
            
            // display the commission amount and total
            String message = "Commission percent: " + commissionPercent + "\n"
                     + "Commission amount: " + commissionAmount + "\n"
                    + "Total amount: " + total + "\n";
            System.out.print(message);
            
             // see if the user wants to comtinue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println(choice);
        }
    }
}
