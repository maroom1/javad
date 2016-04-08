 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Goduguluri
 */
public class FreqArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    // TODO code application logic here
   
        int a[] = new int[15];
   
            
for(int k=0;k<15;k++){
    a[k]=(int) (Math.random() * 20+15);
}
int[] f=new int[21];
    Arrays.fill(f,0);
for(int x:a)
            {
    f[35-x]++;
            }

int i=35;
for(int x:f)
            {
    System.out.println(x+" -->  "+ i);
    i--;
            }
int[] p=new int[36];
int temp=0,temp1=0;
Arrays.fill(p,0);
for(int z=15;z<=35;z++){
p[z]=f[35-z];
if(temp<p[z]){
    temp=p[z];
temp1=z;}
}

System.out.println(temp1+" occured "+temp+" times ");
System.out.println("Enter the number to display");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int t=35-y;
        System.out.println(y+" occured "+f[t]+" times ");
    
    }
    }
    

