
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
public class SwitchEx {
    
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pizza Menu");
        System.out.println("1.Spinach & Feta Pizza");  
        System.out.println("2.Wisconsin 6 Cheese Pizza");
        System.out.println("3.Honolulu Hawaiian Pizza");
        System.out.println("4.Desi HooT Pizza");
        System.out.println("Select any pizza : ");
       Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        
        switch(c) {
               case 1:
                System.out.println("Classic tomato. Robustly seasoned with garlic, black pepper and Italian herbs. ");
                break;
            
            case 2:
                System.out.println("Bright and slightly sweet. 100% vine-ripened California-grown tomatoes crushed and lightly seasoned with garlic and onion.");
                break;
             
            case 3:
                System.out.println("Creamy and white. Combines Parmesan and Romano cheeses, butter and a hint of garlic.");
                break;
            
            case 4:
                System.out.println("Spicy and bold.Sweet and smoky. Made with real honey and molasses.Sweet heat. A fusion of real honey with intense red chilies.");
                break;
          
           
            default: 
                System.out.println("Select Correct Pizza");
                     break;    
        }
    }
 
}
