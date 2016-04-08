/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW4_Summer_2015
 * Author: Goduguluri 
 * Filename: ScheduleData.java 
 * Date and Time: Aug 19, 2015 6:57:53 PM 
 * Project Name: Week13_HW4_15200 
 */
package BusinessLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.in;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Goduguluri
 */
public class ScheduleData implements ScheduleReader {
 private File computersFile;
 @Override
    public String[] showEvents() {
        String[] events=null;
   computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
  try{
         BufferedReader in=new BufferedReader(
                 new FileReader(computersFile));
   Schedule s; 
 
  String ar=in.readLine();
  int c=0;
  while(ar!=null){
      events[c]=ar;
      String[] lr=ar.split(",");
          System.out.println(lr.length);
       s = new Schedule(lr[0],lr[1],lr[2],Integer.parseInt(lr[3]));
       s.display();
       ar=in.readLine();
 }
  }catch (Exception e){
System.out.println("Error");
  }
  return events;
    }

}
