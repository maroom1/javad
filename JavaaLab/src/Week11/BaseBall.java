/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author Goduguluri
 */
public class BaseBall {
    
    public static void main(String args[]){
    
    ArrayList<String> g = new ArrayList<>();
    ArrayList<String> r = new ArrayList<>();
    g.add("Tom");
    g.add("A");g.add("D");g.add("C");
    g.add("D");
    r.add("Hani");r.add("D");r.add("D");r.add("Y");r.add("Z");
    
    System.out.println("gaints :");
    System.out.println(g);
    
    System.out.println("Royals :");
    System.out.println(r);
    ArrayList<String> copyg = new ArrayList<>();
    ArrayList<String> copyr = new ArrayList<>();
  
    System.out.println("Cloning the gains and royals....");
    copyg.addAll(g);
    copyr.addAll(r);
    System.out.println("Printing the gains and royals....");
    System.out.println(copyg);
    System.out.println(copyr);
    ArrayList<String> union = new ArrayList<>();
    union.addAll(g);
    union.addAll(r);
    System.out.println("Union the gains and royals....");

    System.out.println(union);
    ArrayList<String> intersection = new ArrayList<>();
    intersection.addAll(r);
    intersection.retainAll(g);
    System.out.println("Intersection the gains and royals....");

    System.out.println(intersection);
    ArrayList<String> difference = new ArrayList<>();
    difference.addAll(g);
    difference.removeAll(r);
    System.out.println("Difference the gains and royals....");
    System.out.println(difference);
    System.out.println("replacing Tom the gaints....");

    if(copyg.contains("Tom")){
    int k=copyg.indexOf("Tom");
    copyg.remove("Tom");
    copyg.add(k,"Huan");
     
    }
        System.out.println("The new gaints :");

    System.out.println(copyg);
               
    }
}
