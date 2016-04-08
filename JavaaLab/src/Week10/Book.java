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
public class Book implements Displayable,Inputable {
    private String title;
    private float price;
    private Author author;

    public Book(String title, float price,String aName, int numOfPub) {
        this.title = title;
        this.price = price;
        author=new Author(aName,numOfPub);
           }

    Book() {
        author=new Author();
        getInput();
    }

    @Override
    public void display() {
    System.out.println("Book title :"+this.title);
    System.out.println("Number of price :"+this.price);
    this.author.display();
        }

    @Override
    public void getInput() {
         Scanner sc=new Scanner(System.in);
    System.out.println("Book title :");
    this.title=sc.next();
    System.out.println("Number of price :");
    this.price=sc.nextFloat();
  
    }
    
    
    
}
