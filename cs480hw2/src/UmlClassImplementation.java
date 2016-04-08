public class UmlClassImplementation {
    
    public static void main(String args[])
    {
        System.out.println("Student ID:15063as Name:Srilekha Adluru \n");
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