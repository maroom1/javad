/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

import java.util.*;

/**
 *
 * @author Goduguluri
 */
public class SetEx {
    
 public static void main(String args[]) { 
   System.out.println("Enter the count :");
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
    Set<String> words = new HashSet<>();
   int i=0;
    while(words.size()<k){
           words.add(sc.next());
           i++;
    }
    System.out.println(words);
    System.out.println("The numbe of times user entered :"+i);
    System.out.println("Distinct values :"+words.size());

 }

    
}
