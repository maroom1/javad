/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class euler {
public static void main(String arg[]) {
int N = 5;
double h = 0.05;
double x0 = 1;
double y0 = 1;
double x = x0, y = y0;
int k=0;
System.out.println("x"+k+", y"+k+" = " + x + ", " + y);
for (int i=0;i < N;i++) {
y += h*f(x, y);
x += h;
k++;
System.out.println("x"+k+", y"+k+" = " + x + ", " + y);
}
}
static double f(double t, double y) {
return( 0.2*y*t);
}
}