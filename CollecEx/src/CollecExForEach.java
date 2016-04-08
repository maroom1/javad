/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
import java.util.*;  
class CollecExForEach{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
//  al.stream().forEach((obj) -> {
  //    System.out.println(obj);  
 // });
  
  // OR
  for(String obj:al)  
    System.out.println(obj);  
 }  
}  