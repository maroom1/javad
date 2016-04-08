/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rainfallapp;
import java.util.Scanner;

 /**
 *
 * @author kcheung
 */
public class RainfallApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sum;      /* Sum of 12 rainfall amountes */
        String response;  /* User response ('y' or 'n') */
        float amount;   /* Rainfall amount for each month */
        int count;      /* Loop control variable */
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            /*  Input 12 monthly rainfall amounts. Verifying that each
                is nonnegative, and calculates the sum.
            */
            sum = 0;
            for (count = 1; count <= 12; count++)
            {
                System.out.print("Enter rainfall amount " + count + ": ");
                /* Inputs one month's rainfall amount. */
                do
                {
                    amount = sc.nextFloat();
                    if (amount < 0.0f)
                        System.out.print("Amount cannot be negative. Enter again: ");
                } while (amount < 0.0f);
                
                sum = sum + amount;
            }
            
            System.out.println();
            System.out.println("Average rainfall is " + sum / 12 + "inches");
            System.out.print("Do you have another recording site? (y or n): ");
            /* Inputs a character from the user and, if necessary,
               repeatedly prints an error message and inputs another
               character if the character isn't 'y' or 'n'.
            */
            do
            {
                response = sc.next();
                if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n"))
                    break;
                System.out.print("Please try y or n: ");
            } while (true);
            
        } while (response.equalsIgnoreCase("y"));
    }
    
}
