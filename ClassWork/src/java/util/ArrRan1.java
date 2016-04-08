
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Goduguluri
 */
public class ArrRan1 {
    
    public static void main(String args[])
    {

   int a[] = new int[15];
   
            
for(int k=0;k<15;k++){
    a[k]=(int) (Math.random() * 20+15);
}
int[] f=new int[21];
    Arrays.fill(f,0);
for(int x:a)
            {
    //System.out.println(x);
    f[35-x]++;
            }
/*int i=35;
for(int x:f)
            {
    System.out.println(x+" -->  "+ i);
    i--;
            }*/
System.out.println("Enter the number to display");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int t=35-y;
        System.out.println(y+" occured "+f[t]+" times ");
    
    }
    }
    

