
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class NewClass {
    public static void main(String args[]){}
        
         public ArrayList<String> getBadStudents(HashMap< String, HashMap<String, ArrayList<Integer>>> hm) {
          ArrayList<String> badstudents = new ArrayList<>();
          HashMap<String, ArrayList<Integer>> studendts = new HashMap<>();
          for(Map.Entry<String, HashMap<String, ArrayList<Integer>>> first :hm.entrySet()){
              
              for(Map.Entry<String, ArrayList<Integer>> second:first.getValue().entrySet()){
                  
                  String studentName = second.getKey();
                   ArrayList<Integer> marks = second.getValue();
                   if(studendts.containsKey(studentName)==false){
                    studendts.put(studentName,marks);
                   }else if(studendts.containsKey(studentName)== true){
                     studendts.get(studentName).addAll(marks.size(), marks);
                 }
              }
          }
          for (Map.Entry<String, ArrayList<Integer>> badStudent : studendts.entrySet()) {
            String name = badStudent.getKey();
            ArrayList<Integer> score = badStudent.getValue();
            int sum = 0;
            for (int y : score) {
                sum += y;
            }
            double avgerage = sum / score.size();
            if (avgerage < 50) {
                badstudents.add(name);
            }
        }
         
          
         return badstudents;
         }
    
}
