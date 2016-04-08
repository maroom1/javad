/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek2;

/**
 *
 * @author kcheung
 */
public class FutureTuition {

    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in "
                + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years\n",
                tuition, year);
    }
}
