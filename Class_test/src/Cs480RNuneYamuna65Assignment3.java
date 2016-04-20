
import java.util.Scanner;


public class Cs480RNuneYamuna65Assignment3 {
    
    public static void main(String[] args) {
        int option;
           display();
do {
            option = menu();
            switch(option) {
                case 1:
                    Scanner input=new Scanner(System.in);
                    int integer[];
                    System.out.print("\n\t How many integers : ");
                    int countInt=input.nextInt();
                    integer = new int[countInt];
                    for(int i = 0; i < countInt; i++)   {
                        System.out.print("\t\t Enter integer " + (i + 1) +  ": ");
                        integer[i] =input.nextInt();
                    }
                    System.out.println(" The original array : ");
                    displayAry(integer);
                    int[] uncommonDigitAry;
                    uncommonDigitAry =  getUncommonDigit(integer, countInt);
                    System.out.println("Calling getLargest UncommonDigit() –\n" +
                              "The call to method was completed.\n" +
                              "Displaying after getting the returned array –");
                    System.out.println(" The array : ");
                    
                    displayAry(uncommonDigitAry);
                    break;                
                case 2:
                    System.out.println (" Fun ... ");
                    break;                    
                default:
                    System.out.println (" WRONG OPTION! ");
                    break;
            }          
        } while (option != 2);                    
    }
   public static void display() {
       System.out.println ("CS 480R – Java Programming \n " +
            " NPU \n " +
            " Name: Nune, Yamuna Venkata Sri Lakshmi \n" +
            " Last 2 Digit of Student ID: 65 \n");
       System.out.println ("Assignment Information -- \n " +
            " \tAssignment Number: \t 01, Coding Assignment \n " +
            " \tWritten by: \t\t Nune, Yamuna Venkata Sri Lakshmi \n " +
            " \tSubmitted Date: \t Monday, March 07, 2016 \n ");
    }    

    public static int menu() {
        int option;
        System.out.println ("\n**********************************************"
                + "\n*                   MENU                     *"
                + "\n*  1. Calling getLargestUncommonDigit()      *"
                + "\n*  2. Quit                                   *"
                + "\n**********************************************");           
            Scanner input = new Scanner (System.in);
            System.out.print ("Enter your option (1 or 2): ");
            option = input.nextInt();
        return option;
    }
    public static int[] getUncommonDigit(int[] integer, int countInt) {
        Scanner input = new Scanner(System.in);
        int[][] multiDigitAry = new int[countInt][10];
        int[] digitAry;
        digitAry = new int[10];
        int[] digitCount = new int[10];
        int[] uncommonDigitAry = new int[10];
        int count = 0;
        for(int i = 0; i < countInt; i++){
            while(integer[i] != 0){
                if(integer[i] < 0)
                    integer[i] = -integer[i];
                int digit = integer[i]%10;
                integer[i] = integer[i]/10;
                if(multiDigitAry[i][digit] == 0)
                    multiDigitAry[i][digit]++;
                digitCount[digit]++;               
            }
        }
        for(int i = 0; i < countInt; i++) {
            for(int j = 0; j < 10; j++) {
                digitAry[j] += multiDigitAry[i][j];
            }
        }
        for(int i = 0; i < 10; i++){
            if(digitAry[i] == 1)
                uncommonDigitAry[count] = i;
                count++;    
        }
        int[] largestUncommonDigitAry;
        if  (uncommonDigitAry == null) {
            largestUncommonDigitAry = new int[1];
            largestUncommonDigitAry[0] = 0;
        }
        else {
          int max = uncommonDigitAry[0];
          for(int i = 0; i < uncommonDigitAry.length; i++) {
              if (max < uncommonDigitAry[i])
                  max = uncommonDigitAry[i];
          }
          largestUncommonDigitAry = new int[2];
          largestUncommonDigitAry[0] = digitCount[max];
          largestUncommonDigitAry[1] = max;
        }
        return largestUncommonDigitAry;
    }
    public static void displayAry(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j]!= 0) {
                System.out.print("\t" + array[j] + "\n");
            }
        }
    }
}