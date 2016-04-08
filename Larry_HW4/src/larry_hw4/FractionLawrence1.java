/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Larry_hw4;


/**
 *
 * @author Kyi
 */

import java.util.*;

public class FractionLawrence1 {

    public static void main(String[] args) {
        System.out.println(" CS 480J – Java Programming ");
        System.out.println(" NPU ");
        System.out.println(" Kyi, Lawrence ");
        System.out.println(" Last 2 Digit of Student ID: dd : 97 ");
        System.out.println("**************************************");
        System.out.println(" Assignment Number: 04, ");
        System.out.println(" Coding Assignment ");
        System.out.println(" Written by: Kyi, Lawrence");
        System.out.println(" Submitted Date: 4/4/2016");

        menu();
    }

    //stand-alone methods
    public static void menu() {
        Scanner input = new Scanner(System.in);
        String operation = null;
        FractionLarry fr1 = null;
        FractionLarry fr2 = null;
        FractionLarry resultFr = null;
        int option;

        do {
            int option1;
            System.out.println("*********************");
            System.out.println("* MENU Fraction     *");
            System.out.println("* 1. Initializing   *");
            System.out.println("* 2. Adding         *");
            System.out.println("* 3. Subtracting    *");
            System.out.println("* 4. Multiplying    *");
            System.out.println("* 5. Dividing       *");
            System.out.println("* 6. Printing       *");
            System.out.println("* 7. Quit           *");
            System.out.println("*********************");
            System.out.println("Select an option (use integer value only): ");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("Initialising the values.... ");
                Scanner sc = new Scanner(System.in);
                int k = 0;
                while (true) {

                    System.out.println("   ****************************************");
                    System.out.println("     * PRINTING MENU *");
                    System.out.println("     * 1. Default initialisation *");
                    System.out.println("     * 2. Do you want to enter the values and initilaise *");
                    System.out.println("     * 3. Return to Previous MENU *");
                    System.out.println("   ****************************************");
                    System.out.println("   Select an option (1, 2, or 3): ");
                    int b = sc.nextInt();
                    switch (b) {

                        case 1:

                            fr1 = initLarry(1, 2);
                            fr2 = initLarry(3, 4);

                            break;
                        case 2:
                            System.out.println(" Enter the numerator and denominator of fraction one: ");
                            fr1 = initLarry(sc.nextInt(), sc.nextInt());
                            System.out.println(" Enter the numerator and denominator of fraction two: ");
                            fr2 = initLarry(sc.nextInt(), sc.nextInt());

                            break;
                        case 3:
                            k = 1;
                            break;

                        default:
                            System.out.println(" You Entered wrong option...! ");
                            break;

                    }

                    if (k == 1) {
                        break;
                    }
                }

            } else if (option == 2) {
                System.out.println("ADDING option...");
                if (fr1 != null && fr2 != null) {
                    do {
                        System.out.println("***************************************");
                        System.out.println("* ADDING MENU                         *");
                        System.out.println("* 1. add() - Member                   *");
                        System.out.println("* 2. addLarry() – Stand Alone      *");
                        System.out.println("* 3. Return to Previous MENU          *");
                        System.out.println("***************************************");
                        System.out.println("Select an option (1, 2, or 3): ");
                        option1 = input.nextInt();
                        if (option1 == 1) {
                            resultFr = fr1.add(fr2);
                            operation = "+";
                            fr1.print(fr2, resultFr);
                        } else if (option1 == 2) {
                            resultFr = addLarry(fr1, fr2);
                            operation = "+";
                            printLarry(operation, fr1, fr2, resultFr);
                        } else if (option1 == 3) {
                            //do nothing and return to previous menu
                        } else {
                            System.out.println("WRONG OPTION...");
                            option1 = 0;
                        }
                    } while (option1 != 3);
                } else {
                    System.out.println("Not a proper call as "
                            + "no Fractions are available!\n\n");
                }
            } else if (option == 3) {
                System.out.println("SUBTRACTING option...");
                if (fr1 != null && fr2 != null) {
                    do {
                        System.out.println("***************************************");
                        System.out.println("* SUBTRACTING MENU                    *");
                        System.out.println("* 1. subtract() - Member              *");
                        System.out.println("* 2. subtractLarry() – Stand Alone *");
                        System.out.println("* 3. Return to Previous MENU          *");
                        System.out.println("***************************************");
                        System.out.println("Select an option (1, 2, or 3): ");
                        option1 = input.nextInt();
                        if (option1 == 1) {
                            resultFr = fr1.subtract(fr2);
                            operation = "-";
                            fr1.print(fr2, resultFr);
                        } else if (option1 == 2) {
                            resultFr = subtractLarry(fr1, fr2);
                            operation = "-";
                            printLarry(operation, fr1, fr2, resultFr);
                        } else if (option1 == 3) {
                            //do nothing and return to previous menu
                        } else {
                            System.out.println("WRONG OPTION...");
                            option1 = 0;
                        }
                    } while (option1 != 3);
                } else {
                    System.out.println("Not a proper call as "
                            + "no Fractions are available!\n\n");
                }
            } else if (option == 4) {
                System.out.println("MULTIPLYING option...");
                if (fr1 != null && fr2 != null) {
                    do {
                        System.out.println("***************************************");
                        System.out.println("* MULIPLYING MENU                     *");
                        System.out.println("* 1. multiply() - Member              *");
                        System.out.println("* 2. multiplyLarry() – Stand Alone *");
                        System.out.println("* 3. Return to Previous MENU          *");
                        System.out.println("***************************************");
                        System.out.println("Select an option (1, 2, or 3): ");
                        option1 = input.nextInt();
                        if (option1 == 1) {
                            resultFr = fr1.multiply(fr2);
                            operation = "x";
                            fr1.print(fr2, resultFr);
                        } else if (option1 == 2) {
                            resultFr = multiplyLarry(fr1, fr2);
                            operation = "x";
                            printLarry(operation, fr1, fr2, resultFr);
                        } else if (option1 == 3) {

                        } else {
                            System.out.println("WRONG OPTION...");
                            option1 = 0;
                        }
                    } while (option1 != 3);
                } else {
                    System.out.println("Not a proper call as "
                            + "no Fractions are available!\n\n");
                }
            } else if (option == 5) {
                System.out.println("DIVIDING option...");
                if (fr1 != null && fr2 != null) {
                    do {
                        System.out.println("***************************************");
                        System.out.println("* DIVIDING MENU                       *");
                        System.out.println("* 1. divide() - Member                *");
                        System.out.println("* 2. divideLarry() – Stand Alone   *");
                        System.out.println("* 3. Return to Previous MENU          *");
                        System.out.println("***************************************");
                        System.out.println("Select an option (1, 2, or 3): ");
                        option1 = input.nextInt();
                        if (option1 == 1) {
                            resultFr = fr1.divide(fr2);
                            operation = "/";
                            fr1.print(fr2, resultFr);
                        } else if (option1 == 2) {
                            resultFr = divideLarry(fr1, fr2);
                            operation = "/";
                            printLarry(operation, fr1, fr2, resultFr);
                        } else if (option1 == 3) {
                            //do nothing and return to previous menu
                        } else {
                            System.out.println("WRONG OPTION...");
                            option1 = 0;
                        }
                    } while (option1 != 3);
                } else {
                    System.out.println("Not a proper call as "
                            + "no Fractions are available!\n\n");
                }
            } else if (option == 6) {
                System.out.println("PRINTING option...");
                if (fr1 != null && fr2 != null) {
                    do {

                        System.out.println("***************************************");
                        System.out.println("* PRINTING MENU                       *");
                        System.out.println("* 1. print() - Member                 *");
                        System.out.println("* 2. printLarry() – Stand Alone    *");
                        System.out.println("* 3. Return to Previous MENU          *");
                        System.out.println("***************************************");
                        System.out.println("Select an option (1, 2, or 3): ");
                        option1 = input.nextInt();

                        if (option1 == 1) {
                            fr1.print(fr2, resultFr);
                        } else if (option1 == 2) {
                            printLarry(operation, fr1, fr2, resultFr);
                        } else if (option1 == 3) {
                            //do nothing and return to previous menu
                        } else {
                            System.out.println("WRONG OPTION...");
                            option1 = 0;
                        }
                    } while (option1 != 3);
                } else {
                    System.out.println("Not a proper call as "
                            + "no Fractions are available!\n\n");
                }
            } else if (option == 7) {
                System.out.println("Having fun...!");
            } else {
                System.out.println("Wrong option...");
            }
        } while (option != 7);
    }

    public static FractionLarry initLarry(int n, int d) {
        FractionLarry fr = new FractionLarry(n, d);
        return fr;
    }

    public static FractionLarry subtractLarry(FractionLarry fr1,
            FractionLarry fr2) {
        return new FractionLarry(fr1.getNum() * fr2.getDenom()
                + -fr1.getDenom() * fr2.getNum(),
                fr1.getDenom() * fr2.getDenom());
    }

    public static FractionLarry addLarry(FractionLarry fr1, FractionLarry fr2) {
        return new FractionLarry(fr1.getNum() * fr2.getDenom()
                + fr1.getDenom() * fr2.getNum(),
                fr1.getDenom() * fr2.getDenom());
    }

    public static FractionLarry multiplyLarry(FractionLarry fr1,
            FractionLarry fr2) {
        return new FractionLarry(fr1.getNum() * fr2.getNum(),
                fr1.getDenom() * fr2.getDenom());
    }

    public static FractionLarry divideLarry(FractionLarry fr1,
            FractionLarry fr2) {
        return new FractionLarry(fr1.getNum() * fr2.getDenom(),
                fr1.getDenom() * fr2.getNum());
    }

    public static void printLarry(String operation, FractionLarry fr1,
            FractionLarry fr2, FractionLarry resultFr) {
        System.out.print("Fraction 1: ");
        System.out.println("\n    Object: " + fr1.toString() + "\n    Num: "
                + fr1.getNum() + "\n    Denom: " + fr1.getDenom());
        System.out.print("Fraction 2: ");
        System.out.println("\n    Object: " + fr2.toString() + "\n    Num: "
                + fr2.getNum() + "\n    Denom: " + fr2.getDenom());
        System.out.println("Operation performed: " + operation);
        System.out.print("Result: ");
        if (resultFr != null) {
            System.out.println("\n    Object: " + resultFr.toString()
                    + "\n    Num: " + resultFr.getNum() + "\n    Denom: "
                    + resultFr.getDenom());
        } else {
            System.out.println("Result is null. No operation "
                    + "performed");
        }
    }
}
//FractionLarry is the class in which Fraction objects can be instantiated

class FractionLarry {

    private int num; //data or attribute or field member
    private int denom;
    private String operation = null;

    //default constructor
    public FractionLarry() {
        denom = 1;
    }

    //constructor with one parameter
    public FractionLarry(int n) {
        this.num = n; //has 1 argument
        this.denom = 1;
    }

    //constructor with two parameters
    public FractionLarry(int n, int d) {
        if (d > 0) {
            num = n;
            denom = d;
        } else if (d < 0) {
            num = -n;
            denom = -d;
        } else {
            while (d == 0) {
                Scanner input = new Scanner(System.in);
                System.out.println("\n d is 0:  not accepted: "
                        + "Re-enter value for d: ");
                d = input.nextInt();
                if (d < 0) {
                    num = -n;
                    denom = -d;
                } else {
                    denom = d;

                }
            }
        }
        //find GCD and reduce fraction to simpler form
        int GCD = findGCD(num, denom);
        num = num / GCD;
        denom = denom / GCD;

    }

    //getter methods
    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    //setter methods
    public void setNum(int n) {
        num = n;
    }

    public void setDenom(int d) {
        denom = d;
    }

    //arithmetic operations methods
    public FractionLarry add(FractionLarry that) {
        operation = "+";
        return new FractionLarry(num * that.denom + denom * that.num,
                denom * that.denom);
    }

    public FractionLarry subtract(FractionLarry that) {
        operation = "-";
        return new FractionLarry(num * that.denom - denom * that.num,
                denom * that.denom);
    }

    public FractionLarry multiply(FractionLarry that) {
        operation = "x";
        return new FractionLarry(num * that.num,
                denom * that.denom);
    }

    public FractionLarry divide(FractionLarry that) {
        operation = "/";
        if (that.num == 0) {
            return null;
        }
        return new FractionLarry(num * that.denom,
                denom * that.num);
    }

    //print method
    public void print(FractionLarry fr, FractionLarry resultFr) {
        System.out.print("Fraction 1: ");
        System.out.println("\n    Object: " + this + "\n    Num: "
                + this.num + "\n    Denom: " + this.denom);
        System.out.print("Fraction 2: ");
        System.out.println("\n    Object: " + fr.toString() + "\n    Num: "
                + fr.getNum() + "\n    Denom: " + fr.getDenom());
        System.out.println("Operation performed: " + operation);
        System.out.print("Result: ");
        if (resultFr != null) {
            System.out.println("\n    Object: " + resultFr.toString()
                    + "\n    Num: " + resultFr.getNum() + "\n    Denom: "
                    + resultFr.getDenom());
        } else {
            System.out.println("Result is null. No operation "
                    + "performed");
        }
    }

    //GCD method
    private static int findGCD(int number1, int number2) {
        //base case 
        number1 = (number1 < 0) ? -number1 : number1;
        number2 = (number2 < 0) ? -number2 : number2;
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
}
