/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midreview;

/**
 *
 * @author Goduguluri
 */
public class Test {
    
    public static void main(String[] args) {
        int j=5;
        int z=++j+j*5;//6+5*5
        
        
        System.out.println(z);
        System.out.println(1-1.0-1.0-1.0-1.0-1.0==5.0);
        int[] mylist={1,2,3,4,5,6};
        for (int i=mylist.length-2;i>=0;i--){
        mylist[i+1]=mylist[i];
        }
        for(int e:mylist)
            System.out.print(e+" ");
    }
    
}
