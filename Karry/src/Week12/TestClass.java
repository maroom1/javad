/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

import java.util.Scanner;

/**
 *
 * @author Goduguluri
 */
public class TestClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String z;
        System.out.println(" Implementing Triangle");
        System.out.println("Enter the value of Side 1 :");
        a = sc.nextInt();
        System.out.println("Enter the value of Side 2 :");
        b = sc.nextInt();
        System.out.println("Enter the value of Side 3 :");
        c = sc.nextInt();
        System.out.println("Enter the name of Color :");
        z = sc.next();
        Triangle t = new Triangle(a, b, c, z);
        System.out.print(" Area :");
        t.abstractArea();
        System.out.print(" Perimeter :");
        t.abstractPeriMeter();
        t.abstractDisplay();
        int e, f;
        String y;
        System.out.println(" Implementing Rectagle");
        System.out.println("Enter the value of lenght :");
        e = sc.nextInt();
        System.out.println("Enter the value of breadth :");
        f = sc.nextInt();
        System.out.println("Enter the name of Color :");
        y = sc.next();
        Rectangle r = new Rectangle(e, f, y);
        System.out.print(" Area :");
        r.abstractArea();
        System.out.print(" Perimeter :");
        r.abstractPeriMeter();
        r.abstractDisplay();
        int g;
        String x;
        System.out.println(" Implementing Square");
        System.out.println("Enter the value of side :");
        g = sc.nextInt();
        System.out.println("Enter the name of Color :");
        x = sc.next();
        Square s = new Square(g, x);
        System.out.print(" Area :");
        s.abstractArea();
        System.out.print(" Perimeter :");
        s.abstractPeriMeter();
        s.abstractDisplay();

    }

}
