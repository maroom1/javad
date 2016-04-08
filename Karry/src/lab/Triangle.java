/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author program 1 main class
 */
public class Triangle implements GeometricObject{
    
    private int side1;
    private int side2;
    private int side3;
    private String color;
    private boolean x;

    public Triangle() {
    }
    

    public Triangle(int side1, int side2, int side3, String color, boolean x) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.x = x;
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color=null;
        this.x=false;
    }

    @Override
    public double calculateArea() {
    int s=(side1+side2+side3)/2;
        return  Math.sqrt(s*(s-side1)+(s-side2)*(s-side3));
        
    }

    @Override
    public double calculatePerimeter() {
       
    return (side3+side1+side2); 
    
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + color + ", x=" + x + '}';
    }
    
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
        int a,b,c;
        String z;
        boolean y;
System.out.println("Enter the value of Side 1 :");
a=sc.nextInt();
System.out.println("Enter the value of Side 2 :");
b=sc.nextInt();
System.out.println("Enter the value of Side 3 :");
c=sc.nextInt();
System.out.println("Enter the name of Color :");
z=sc.next();
System.out.println("IS the triangle filled with color  :");
y=sc.nextBoolean();
Triangle t=new Triangle(a, b, c, z, y);
Triangle t1=new Triangle(a, b, c);
System.out.println("for "+t.toString());
System.out.println("Area is "+t.calculateArea());
System.out.println("Perimeter is "+t.calculatePerimeter());
System.out.println("for "+t1.toString());
System.out.println("Area is "+t1.calculateArea());
System.out.println("Perimeter is "+t1.calculatePerimeter());



        
    }
    
    
    
    
}
