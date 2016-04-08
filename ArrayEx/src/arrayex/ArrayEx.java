/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

import java.util.Scanner;

/**
 *
 * @author YalamandaRao
 */
public class ArrayEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
int[] arr;
        arr = new int[5];
int i=0;
while (i<=4) {
 
        arr[i]=sc.nextInt();
        System.out.println(i+"--->"+arr[i]);
        i++;
 }
System.out.println("------"+i);
i=i-1;
while (i>=0) {
    

        System.out.println(arr[i]);
        i--;
     
  }
   
    
    }
    
}
