    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class BinToDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter Binary Number(contains only 0  & 1 ) : ");
       Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
    int sum=0,n,p=1;
        while(c>0)
    {
    n=c%10;
    sum+=n*p;
    c=c/10;
    p=2*p;
          
    }
    System.out.println("the binary number is "+sum);
    }
    
}
