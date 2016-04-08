/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Larry;

/**
 *
 * @author Goduguluri
 */
public class printnum1to10withoutkeyboard {
    public static void main(String[] args) {
           System.out.println(" printing through while loop :");
        int i=0;
        while(i<100){ //0<10 ; 1<10 ;2<10 ;3<10 .... ;10<10(flase)
                 i++; //1 //2 //3 //4 .. //10
            System.out.print(i+" "); //1 //2 //3 //4....//10
        
        }
        // exited the while when i value is 10
        System.out.println();
        
         System.out.println(" printing through for loop :");
         int k=0;
         for(int j=0;j<100;j++){ //0<10 J=1;1<10 j=2;2<10 j=3;.....
           k++; //1 //2 //3
           System.out.print(k+" "); //1 //2 //3
         }
         
         System.out.println();
          System.out.println(" printing through for  loop differntly :");
       
         for(int j=1;j<=100;j++){         
           System.out.print(j+" "); 
         }
         System.out.println();
          System.out.println(" printing through do while loop  :");
     int l=0;
          do{
              l++;
              System.out.print(l+" ");
          }while(l<100);
          
          System.out.println();
          
    }
    
}
