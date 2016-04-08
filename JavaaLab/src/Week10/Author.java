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
public class Author implements Displayable,Inputable {

    private String name;
    private int numOfPub;

    public Author(String name, int numOfPub) {
        this.name = name;
        this.numOfPub = numOfPub;
    }

    Author() {
     getInput(); }
    
    
    @Override
    public void display() {
        System.out.println("Name of Author:"+this.name);
        System.out.println("Number of publications:"+this.numOfPub);
    }

    @Override
    public void getInput() {
         Scanner sc=new Scanner(System.in);
        System.out.println("Name of Author:");
        this.name=sc.next();
        System.out.println("Number of publications:");
        this.numOfPub=sc.nextInt();
        
    }
    
}
