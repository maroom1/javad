/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class Student extends Person {
    
    private int id;
    private float gpa;
    private Book book;

    
    public Student(int id, float gpa, Book book,String name, String address) {
        super(name,address);
        this.id = id;
        this.gpa = gpa;
        this.book = book;
       
    }

    Student(Book b1) {
    //super();
     getInput();
        this.book=b1;
     }

    /**
     *
     */
    @Override
   public void display(){
super.display();    
System.out.println(" Id :"+this.id);
System.out.println("gpa :"+this.gpa);
book.display();
}

  
  
    @Override
  public void getInput(){ 
      super.getInput();
    Scanner sc=new Scanner(System.in);
  System.out.println("Id :");
  this.id=sc.nextInt();
System.out.println("gpa :");
this.gpa=sc.nextFloat();

      
   }

}
