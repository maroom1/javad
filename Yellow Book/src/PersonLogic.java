

/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW3_Summer_2015
 * Author: Goduguluri 
 * Filename: class2.java 
 * Date and Time: Jul 24, 2015 11:01:41 AM 
 * Project Name: Week12_HW_15200 
 */

/**
 *
 * @author Goduguluri
 */

import java.util.*;
import java.sql.*;

public class PersonLogic{      
	
	
	private ArrayList<PersonInfo> personsList;
	


     // constructor 
	public PersonLogic(){
		personsList = new ArrayList<>();
				//Create Connection to the Oracle Database
	}

	public ArrayList getpersonsList()
        {
            System.out.println("List returned");
            return this.personsList;
        }

//	public ArrayList searchPerson(String name)
//	{
//            ArrayList<PersonInfo> personsList1=new ArrayList<>();
//            
//            for (PersonInfo personsList2 : personsList) {
//                PersonInfo p = (PersonInfo) personsList2;
//                System.out.println("Searching...");
//                if(p.getName().equals(name)){
//                    personsList1.add(p);
//                    break;
//                }
//            }
//         return personsList1;
//	        } 
        
       public ArrayList searchPerson(String name)
	{
            ArrayList<PersonInfo> personsList1=new ArrayList<>();
            
            for (PersonInfo personsList2 : personsList) {
                PersonInfo p = (PersonInfo) personsList2;
                System.out.println("Searching...");
                if(p.getName().equals(name)){
                    personsList1.add(p);
                    break;
                }
            }
         return personsList1;
	        }  
        
        
        
        
	public void savePerson(PersonInfo person){
            
           personsList.add(person);
           
		
	}

	

	public int removePerson(String name){
            for(int i=0;i<personsList.size();i++){
                if(personsList.get(i).getName().equalsIgnoreCase(name))
                personsList.remove(i);
            }
        
            return 1;
        }
        
}
