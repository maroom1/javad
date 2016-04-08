import java.util.*;  
class RemovAllEx{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
    
  ArrayList<String> al2=new ArrayList<>();  
  al2.add("Ravi");  
  al2.add("Hanumat");  
    
      al.removeAll(al2);  
  
  System.out.println("iterating the elements after removing the elements of al2...");  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  }  
}  