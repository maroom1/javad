/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

	public void updatePerson(PersonInfo person)
	{
		
	}

	public int removePerson(String name){
            for(PersonInfo p:personsList){
                if(p.getName() == null ? name == null : p.getName().equals(name))
                personsList.remove(p);            
            }
	     
            
            return 1;
}// end class PersonLogic
        
}
