/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import java.io.Console;

/**
 *
 * @author Goduguluri
 */
public class MainClass {
    
    public static void main(String args[]){
//    Book b=new Book("java", 20, "Richi Rich", 10);
//    Student s=new Student(10001,7, b,"Murali","Fremont");
//    s.display();
      Book b1=new Book();
//    b1.display();
      Student s1=new Student(b1);
      System.out.println("=======Out Put==========");
      s1.display();
 
   
    }
}
