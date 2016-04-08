package javaweek2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kcheung
 */
/*
Assume the radius of the circle is 1. Therefore, the circle area is and the square area is 4.
Randomly generate a point in the square. The probability for the point to fall in the circle is
circleArea / squareArea = π / 4.
Write a program that randomly generates 1,000,000 points in the square and let
numberOfHits denote the number of points that fall in the circle. Thus, numberOfHits is
approximately 1000000 * (π / 4). π can be approximated as 4 * numberOfHits /
1000000.
*/
public class MonteCarloSimulation {

    public static void main(String[] args) {
        final int NUMBER_OF_TRIALS = 10000000;
        int numberOfHits = 0;

        for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
            double x = Math.random() * 2.0 - 1;
            double y = Math.random() * 2.0 - 1;

            if (x * x + y * y <= 1) {
                numberOfHits++;
            }
        }
        double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
        System.out.println("PI is " + pi);
    }
}
