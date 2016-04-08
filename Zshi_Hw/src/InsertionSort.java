import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] A = new int[1000000];

		List<Integer> numberList = new ArrayList<Integer>();
		List<Integer> numberList1 = new ArrayList<Integer>();
		int j = 0;
		for (int i = 1000000; i > 0; i--, j++) {
			A[j] = i;
			numberList.add(i);
			}

		Collections.shuffle(numberList);
		int[] B = new int[numberList.size()];
		for (int counter = 0; counter < numberList.size(); counter++) {
			B[counter] = numberList.get(counter);
		}
		
		long start = System.currentTimeMillis();
		sorting(A, 0, A.length);
		long end = System.currentTimeMillis();
	 
		long diff = start - end;
		System.out.println("Array A Execution time:"+ diff);
		
		 start = System.currentTimeMillis();
		 sorting(B, 0, B.length);
		 end = System.currentTimeMillis();
	 
		 diff = start - end;
		 System.out.println("Array B Execution time:"+ diff);
		
		
		 System.out.println("Sorted Array A:");
		 for(int count = 0;count < 1000000;count++)
		 {
			 System.out.print(A[count]+"--");
		 }
		 System.out.println("Sorted Array B:");
		 for(int count = 0;count < 1000000;count++)
		 {
			 System.out.print(B[count]+"--");
		 }
		 
		 

	}
	/**
     * Swaps x[a] with x[b].
     */
    private static void swap(int temp1[], int x, int y) {
        int t = temp1[x];
        temp1[x] = temp1[y];
        temp1[y] = t;
    }
     private static void vswap(int x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }
    
    private static int test(int x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }
    
	public static void sorting(int array[], int initial, int length) {
        
        if (length < 7) {
            for (int counter=initial; counter<length+initial; counter++)
                for (int counter1=counter; counter1>initial && array[counter1-1]>array[counter1]; counter1--)
                    swap(array, counter1, counter1-1);
            return;
        }

        
        int midd = initial + (length >> 1);       
        if (length > 7) {
            int first = initial;
            int last = initial + length - 1;
            if (length > 40) {        
                int s = length/8;
                first = test(array, first,first+s, first+2*s);
                midd = test(array, midd-s,   midd,   midd+s);
                last = test(array, last-2*s, last-s, last);
            }
            midd = test(array, first, midd, last); 
        }
        int tempv = array[midd];

        int init = initial, b = init, las = initial + length - 1, d = las;
        while(true) {
            while (b <= las && array[b] <= tempv) {
                if (array[b] == tempv)
                    swap(array, init++, b);
                b++;
            }
            while (las >= b && array[las] >= tempv) {
                if (array[las] == tempv)
                    swap(array, las, d--);
                las--;
            }
            if (b > las)
                break;
            swap(array, b++, las--);
        }

        int s, n = initial + length;
        s = Math.min(init-initial, b-init  );  vswap(array, initial, b-s, s);
        s = Math.min(d-las,   n-d-1);  vswap(array, b,   n-s, s);

        if ((s = b-init) > 1)
            sorting(array, initial, s);
        if ((s = d-las) > 1)
        	sorting(array, n-s, s);
    }

	
	
}
