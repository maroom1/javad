/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larry_hw4;

//import static Cs480rSpring2016AkilaDuraiswamyKanagasabapathy71Assignment5.FractionAkilaDUtility.reducedFractionAkilaD;
import java.util.Scanner;

/**
 *
 * @author akila
 */

public class FractionAkilaD {
    private int num;
    private int denom;
    
    public FractionAkilaD(){//default constructor
        denom = 0;
        
    }
    public FractionAkilaD(int n){// constructor
        denom = 1;
        num = n;
    }
    public FractionAkilaD(FractionAkilaD fr){//copy constructor
        num = fr.num;
        denom = fr.denom;
    }
    public FractionAkilaD(int n,int d){// convert taking on int constructor
        if(d>0){
            num =n;
            denom = d;
        }
        else if(d<0){
            num = n;
            denom = -d;
        }
        else{
           Scanner scanner = new Scanner(System.in);     
           System.out.println("\nD is 0:not accepted:re enter the value");
           d = scanner.nextInt();
           num =n;
           denom =d;
        }
        
    }
    public void setNum(int n){
        num = n;
    }
    public int getNum(){
        return num;
    }
    public void setDenom(int d){
        denom = d;
    }
    
    
    public int getDenom(){
        return denom;
    }
    private static int gcdFractionAkilaD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return gcdFractionAkilaD(number2, number1%number2);
    }
    public void reducedFractionAkilaD(){
        int gcd;
        int absnum = Math.abs(num);
        if(absnum != 1 && denom != 1) { 
            gcd = gcdFractionAkilaD(absnum, denom); 
            if(gcd > 1) { 
                denom = denom / gcd;
                absnum = absnum / gcd;
            } 
        }
        if (num < 0 ){
                num = (0-absnum);
        } else {
               num = absnum;
        }
              
    }
    
    public FractionAkilaD printAdd(FractionAkilaD that){
      FractionAkilaD ret = new FractionAkilaD();
      ret.num = num*that.denom + denom*that.num;
      ret.denom = denom*that.denom;
      ret.reducedFractionAkilaD();
      System.out.println(ret.num+"/" 
                +ret.denom);
      return ret;   
              
    }
    public FractionAkilaD printSubtraction(FractionAkilaD that){
        FractionAkilaD ret = new FractionAkilaD();
        ret.num = num*that.denom - denom*that.num;
        ret.denom = denom*that.denom;
        ret.reducedFractionAkilaD();
        System.out.println(ret.num+"/" 
                +ret.denom);
        return ret;
        
    }
    public FractionAkilaD printMultiply(FractionAkilaD that){
        FractionAkilaD ret = new FractionAkilaD();
        ret.num = num*that.num;
        ret.denom = denom*that.denom;
        ret.reducedFractionAkilaD();
        System.out.println(ret.num+"/" 
                +ret.denom);
        return ret;
        
    }
    public FractionAkilaD printDivide(FractionAkilaD that){
        FractionAkilaD ret = new FractionAkilaD();
        ret.num = num*that.denom;
        ret.denom = denom*that.num;
        ret.reducedFractionAkilaD();
       System.out.println(ret.num+"/" 
              +ret.denom);
       return ret;
          
    }
   
    public void print(){
        reducedFractionAkilaD();
        System.out.print("\nnum:"+ num+"\ndenom:"+denom);//this or tostring obj.ref
    }
   
    public void update(int n, int d){
        num =n;
        denom = d;
        if(denom<0){
            num = -num;
        }
        reducedFractionAkilaD();
    }
    
   
}

   