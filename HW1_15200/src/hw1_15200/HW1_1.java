/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1_15200;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class HW1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================");
        System.out.println("Murali Krishna Goduguluri");
        System.out.println("ID : 15200");
        System.out.println("=================================");
        System.out.println("\nHomework 1 output\n");
        System.out.println("Enter any alphabet");
       Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String c = s.toLowerCase();
        
        switch(c) {
            case "b":
                    case "c":
            case "a":
                System.out.println("1 corresponds to "+s);
                break;
                case "d":
                    case "e":
            case "f":
                System.out.println("2 corresponds to "+s);
                break;
                case "g":
                    case "h":
            case "i":
                System.out.println("3 corresponds to "+s);
                break;
                case "j":
                    case "k":
            case "l":
                System.out.println("4 corresponds to "+s);
                break;
                case "m":
                    case "n":
            case "o":
                System.out.println("7 corresponds to "+s);
                break;
                case "p":
                    case "r":
            case "s":
                System.out.println("7 corresponds to "+s);
                break;
                case "t":
                    case "u":
            case "v":
                System.out.println("8 corresponds to "+s);
                break;
                case "w":
                    case "x":
            case "y":
                System.out.println("9 corresponds to "+s);
                break;
            default: 
                System.out.println("There is no digit on the telephone that corresponds to "+s);
                     break;    
        }
    }
    
}
