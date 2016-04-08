public class evenodd {
    
    public static void main(String[] args){
        
        System.out.println("Printing even numbers");
        int i=0,x;
        while(i<100){
        i++;
        x=i%2;
        if(x==0){
        System.out.print(i+" ");
        }
        }
        System.out.println();
          System.out.println("Printing odd numbers");
        int k=0,y;
        while(k<100){
        k++;
        y=k%2;
        if(y!=0){
        System.out.print(k+" ");
        }
        }
        System.out.println();
     }
    }
