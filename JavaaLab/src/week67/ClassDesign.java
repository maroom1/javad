/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author YalamandaRao
 */
public class ClassDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Rectangle r=new Rectangle();
    Rectangle r1=new Rectangle(4,40);
    Rectangle r2=new Rectangle(3.5,35.9);
    System.out.println(r.getArea());
    System.out.println(r1.getArea());
    System.out.println(r2.getArea());
    System.out.println(r.getPeri());
    System.out.println(r1.getPeri());
    System.out.println(r2.getPeri());    
    
        Circle C = new Circle();
         System.out.println("Please enter the radius : \n ");
         Scanner sc= new Scanner(System.in);
         double k = sc.nextDouble();
         while(k<0)
         {
             System.out.println("Enter a valid radius : \n ");
            k = sc.nextDouble();
         }
            C.setRadius(k);
         C.display();
    Circle[] cr = new Circle[5];
    int p = 0,i=0;
    while(i<5)
    {
    p=p+1;
    System.out.println(" Enter ID of Circle " +p+" : \n ");
    int a = sc.nextInt();
    System.out.println(" Enter Radius: \n ");
    double b=sc.nextDouble();
     Date date = new Date();
    String dt=date.toString();
    cr[i]=new Circle(a,b,dt);
        i=i+1;
    }
    
   
    int j=0;
     System.out.println(" Circle ID-------- radius-------Area--------Date Created");
    while(j<5)
    {
   cr[j].display1();
   j++;
    }
    
    
    }
    
}
