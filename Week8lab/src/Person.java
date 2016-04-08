/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Goduguluri
 */
public class Person {

    /**
     * @param args the command line arguments
     */
 private String name;
 private String add;
 private Heart hrt;
 private Address ad;
  public Person(String name,String add,int br,double wt,double siz){
this.name=name;
 this.add=add;
 hrt=new Heart(br,wt,siz);
 }
 
 public Person(String name,int br,double wt,double siz,Address ad)
 {
 this.name=name;
 hrt=new Heart(br,wt,siz);
 this.ad=ad;
 
 }
  
 public Person(String name,Address ad)
 {
     this.name=name;
    this.ad=ad;
 }
 public void display()
 {
 System.out.println(this.name+"---"+this.add);
 hrt.display();
 }
    public void displayag()
    {
    System.out.println(this.name);
    ad.display();
    }
public void displayemp(){
System.out.println("Name = "+this.name);
hrt.display();
ad.display();
}
}
