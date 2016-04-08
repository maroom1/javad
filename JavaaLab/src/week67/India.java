/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

/**
 *
 * @author YalamandaRao
 */
public class India {
     public static void main(String[] args) {
     
     Employee e=new Employee(9876,35,"Krishna","Yenkaipalem","510999007");
     Student s=new Student(2001,"MSCS","Krishna","Yenkaipalem","510999007");
    System.out.println("====Employee Profile====");
     e.displayEmployee();
     System.out.println("====Student profile=====");
     s.getStudent();
     
     }
}
