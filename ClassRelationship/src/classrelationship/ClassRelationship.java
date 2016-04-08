/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrelationship;

/**
 *
 * @author YalamandaRao
 */
public class ClassRelationship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Station st1 = new Station("st123","MTC123",23.35,2);
        Driver d = new Driver(123,"DR145",20);
        Slot[] s1 = new Slot[2];
        s1[0] = new Slot("Slot1",123,d);
        s1[1] = new Slot("Slot2",456,d);
        //printing all the fields in the Station
        st1.printEntireStation(d,s1);
        //Comparing the Station
        boolean b1 = st1.isStation(st1);
        System.out.println("the Station Object is equivalent to current Object "+b1+"\n");
    }
    
}
