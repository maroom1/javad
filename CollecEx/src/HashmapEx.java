
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class HashmapEx {
 
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(121,"Class");
        hm.put(122,"work");
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.err.println(hm.entrySet());
        System.err.println(hm.get(121));
        
    }
}
