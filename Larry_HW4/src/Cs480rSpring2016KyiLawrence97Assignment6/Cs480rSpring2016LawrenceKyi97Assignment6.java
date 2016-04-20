/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cs480rSpring2016KyiLawrence97Assignment6;

import java.util.Scanner;

/**
 *
 * @author Kyi
 */

public class Cs480rSpring2016LawrenceKyi97Assignment6 {

    private Pointkyi point;

    public static void main(String[] args) {
        Cs480rSpring2016LawrenceKyi97Assignment6 test = new Cs480rSpring2016LawrenceKyi97Assignment6();
        test.start();
    }
	//Assumptions

	//Moving -4 steps for MoveBy(int iOld)
    //Execution Order should be maintain for proper results.
    private void start() {
        System.out.println(" CS 480J – Java Programming ");
        System.out.println(" NPU ");
        System.out.println(" Kyi, Lawrence ");
        System.out.println(" Last 2 Digit of Student ID: dd : 97 ");
        System.out.println("**************************************");
        System.out.println(" Assignment Number: 06, ");
        System.out.println(" Coding Assignment ");
        System.out.println(" Written by: Kyi, Lawrence");
        System.out.println(" Submitted Date: 4/20/2016");
        System.out.println(" Due Date: 4/23/2016");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mainMenu();
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("Initializing Option --");
                FractionKyi fx = new FractionKyi();
                fx.setNum(4);
                fx.setDenom(1);
                FractionKyi fy = new FractionKyi();
                fy.setNum(3);
                fy.setDenom(1);
                point = new Pointkyi(fx, fy);
                System.out.println(point.toString());
            } else if (n == 2) {
                System.out.println("Moving Option --");
                if (point == null) {
                    System.out.println("Not a proper call as no Points are available!");
                    continue;
                }
                handleMovingMenu(scanner);
            } else if (n == 3) {
                System.out.println("Flipping Option --");
                if (point == null) {
                    System.out.println("Not a proper call as no Points are available!");
                    continue;
                }
                handleFlippingMenu(scanner);
            } else if (n == 4) {
                System.out.println("Printing Option --");
                if (point == null) {
                    System.out.println("Not a proper call as no Points are available!");
                    continue;
                }
                point.print();
            } else if (n == 5) {
                scanner.close();
                System.out.println("Having Fun ...");
                break;
            }
        }
    }

    private void handleMovingMenu(Scanner scanner) {
        while (true) {
            movingMenu();
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("MENU MovingPoint: By (frX, frY) --");
                FractionKyi delX = new FractionKyi(-4, 1);
                FractionKyi delY = new FractionKyi(5, 1);
                point.moveBy(delX, delY);
                //System.out.println("Moved By ("+point.getFx().toString()+", "+ point.getFy().toString()+")");
            } else if (n == 2) {
                //ambiguous requirement
                System.out.println("MENU MovingPoint: By fr --");
                int iOld = -4;
                System.out.println("Moving by (" + iOld + ")");
                point.moveBy(iOld);
            } else if (n == 3) {
                System.out.println("MENU MovingPoint: Printing --");
                if (point == null) {
                    System.out.println("Not a proper call as no Points are available!");
                    continue;
                }
                point.print();
            } else if (n == 4) {
                System.out.println("Returning to \"MENU Point\"");
                break;
            }
        }
    }

    private void handleFlippingMenu(Scanner scanner) {
        while (true) {
            flippingMenu();
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("MENU FlippingPoint: By Y --");
                point.flipByY();
                System.out.println(point.getFy().getNum() + "Flipped by Y: ");
            } else if (n == 2) {
                System.out.println("MENU FlippingPoint: By X --");
                point.flipByX();
                System.out.println(point.getFx().getNum() + "Flipped by X: ");
            } else if (n == 3) {
                System.out.println("MENU FlippingPoint: By Origin --");
                point.flipThroughOrigin();
                System.out.println(point.getFy().getNum() + point.getFx().getNum() + "Flipped thru origin: " + ",");
            } else if (n == 4) {
                System.out.println("MENU FlippingPoint: Printing --");
                if (point == null) {
                    System.out.println("Not a proper call as no Points are available!");
                    continue;
                }
                point.print();
            } else if (n == 5) {
                System.out.println("Returning to \"MENU Point\"");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println();
        System.out.println("*************************");
        System.out.println("*	MENU Point	*");
        System.out.println("*	1. Initializing *");
        System.out.println("*	2. Moving	*");
        System.out.println("*	3. Flipping	*");
        System.out.println("*	4. Printing	*");
        System.out.println("*	5. Quitting	*");
        System.out.println("*************************");
        System.out.print("Select an option (use integer value only): ");
    }

    private static void movingMenu() {
        System.out.println();
        System.out.println("*************************");
        System.out.println("*	MENU MovingPoint	*");
        System.out.println("*	1. By ( frx, fry) *");
        System.out.println("*	2. BY fr*");
        System.out.println("*	3. Printing	   *");
        System.out.println("*	4. Returning	*");
        System.out.println("*************************");
        System.out.print("Select an option (use integer value only): ");
    }

    private static void flippingMenu() {

        System.out.println();
        System.out.println("*************************");
        System.out.println("*	MENU FlipingPoint	*");
        System.out.println("*	1. By Y     *");
        System.out.println("*	2. BY X     *");
        System.out.println("*	3. By Origin	   *");
        System.out.println("*	4. Printing	*");
        System.out.println("*	5. Returning	 *");
        System.out.println("*************************");
        System.out.print("Select an option (use integer value only): ");

    }
}


/*
OUTPUT:

run:
 CS 480J – Java Programming 
 NPU 
 Kyi, Lawrence 
 Last 2 Digit of Student ID: dd : 97 
**************************************
 Assignment Number: 06, 
 Coding Assignment 
 Written by: Kyi, Lawrence
 Submitted Date: 4/20/2016
 Due Date: 4/23/2016


*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 2
Moving Option --
Not a proper call as no Points are available!

*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 1
Initializing Option --
Point(4/1, 3/1)

*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 2
Moving Option --

*************************
*	MENU MovingPoint	*
*	1. By ( frx, fry) *
*	2. BY fr*
*	3. Printing	   *
*	4. Returning	*
*************************
Select an option (use integer value only): 1
MENU MovingPoint: By (frX, frY) --

*************************
*	MENU MovingPoint	*
*	1. By ( frx, fry) *
*	2. BY fr*
*	3. Printing	   *
*	4. Returning	*
*************************
Select an option (use integer value only): 2
MENU MovingPoint: By fr --
Moving by (-4)

*************************
*	MENU MovingPoint	*
*	1. By ( frx, fry) *
*	2. BY fr*
*	3. Printing	   *
*	4. Returning	*
*************************
Select an option (use integer value only): 3
MENU MovingPoint: Printing --
Point(4/1, -6/1)

*************************
*	MENU MovingPoint	*
*	1. By ( frx, fry) *
*	2. BY fr*
*	3. Printing	   *
*	4. Returning	*
*************************
Select an option (use integer value only): 4
Returning to "MENU Point"

*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 3
Flipping Option --

*************************
*	MENU FlipingPoint	*
*	1. By Y     *
*	2. BY X     *
*	3. By Origin	   *
*	4. Printing	*
*	5. Returning	 *
*************************
Select an option (use integer value only): 2
MENU FlippingPoint: By X --
-4Flipped by X: 

*************************
*	MENU FlipingPoint	*
*	1. By Y     *
*	2. BY X     *
*	3. By Origin	   *
*	4. Printing	*
*	5. Returning	 *
*************************
Select an option (use integer value only): 4
MENU FlippingPoint: Printing --
Point(-4/1, -6/1)

*************************
*	MENU FlipingPoint	*
*	1. By Y     *
*	2. BY X     *
*	3. By Origin	   *
*	4. Printing	*
*	5. Returning	 *
*************************
Select an option (use integer value only): 5
Returning to "MENU Point"

*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 4
Printing Option --
Point(-4/1, -6/1)

*************************
*	MENU Point	*
*	1. Initializing *
*	2. Moving	*
*	3. Flipping	*
*	4. Printing	*
*	5. Quitting	*
*************************
Select an option (use integer value only): 5
Having Fun ...
BUILD SUCCESSFUL (total time: 1 minute 18 seconds)



*/