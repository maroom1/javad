/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Maincomp {
    
    public static void main(String[] args){
    //System.out.println("------Composition-----");    
        String name="Java Lab";
        String add="WORLD";
        int br=45;
        double siz=35.25;
        double wt=125.00;
       Person p=new Person(name,add,br,wt,siz);
     //   p.display();
   // System.out.println("----- aggregation----");
    String city="Fremont";
    int zip=94538;
    String st="fremont blvd";
    Address ad=new Address(city,zip,st);
    Person p1=new Person(name,ad);
   // p1.displayag();
    System.out.println("Composition--- aggregation--inheritance");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter employee id");
    int id=sc.nextInt();
    System.out.println("Enter employee Sal");
    double sal=sc.nextInt();
    Employee e=new Employee(id,name,sal,br,wt,siz,ad);
   System.out.println("----------Employee Info-------------");
    e.display();
    
    }
}
