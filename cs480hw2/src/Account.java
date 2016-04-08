
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class Account {
    
    private int id;
    private double balance;
    private double annualinterestrate;
    private Date datecreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualinterestrate = 0;
        this.datecreated = new Date(System.currentTimeMillis());
    }

  

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualinterestrate() {
        return annualinterestrate;
    }

    public void setAnnualinterestrate(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }
    
    public double getMonthlyInterestRate(){
    
       if(getAnnualinterestrate()==0){
           System.out.append("Enter the anual interest rate now for the object :");
          setAnnualinterestrate(new Scanner(System.in).nextDouble());
       }
            return getAnnualinterestrate()/12;
    
    }
    
    public double getMonthlyInterest() {
    
        return getBalance()*getMonthlyInterestRate()/100;
    }
    
    
    public void withdraw(double a){
    
        this.balance=this.balance-a;
    }
    
    public void deposite(double a){
   this.balance=this.balance+a;
    
    }
    
    public void display()
    {
    System.out.println(
    " ID :"+id+"\n"+
    " Balance :"+balance+"\n"+
    " Annual Interest :"+annualinterestrate+"\n"+
    " Date Created :"+datecreated+"\n"
    
    
    );
    }
    public static void main(String args[]){
    
      Scanner sc=new Scanner(System.in);
        Account a=new Account();
        a.setId(123); 
        a.setBalance(500);
         a.setAnnualinterestrate(13.5);
        a.display(); 
        System.out.println("Enter amount to withdraw : ");
        a.withdraw(sc.nextDouble());
        System.out.println("Now the account bal is  : "+a.getBalance());
        
        System.out.println("Enter amount to deposite : ");
        a.deposite(sc.nextDouble());
        
        System.out.println("Now the account bal is  : "+a.getBalance());
        
        System.out.println(" Minthly interest rate :"+a.getMonthlyInterestRate());
        
        System.out.println(" Minthly interest of specified amount :"+a.getMonthlyInterest());
        
        
        
    
    }
    
}
