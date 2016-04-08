package MainRun;

/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW3_Summer_2015
 * Author: Goduguluri 
 * Filename: class1.java 
 * Date and Time: Jul 24, 2015 10:28:46 AM 
 * Project Name: Week12_HW_15200 
 */

/**
 *
 * @author Goduguluri
 */
import BusinessLogic.PersonInfo;
import BusinessLogic.PersonLogic;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class YellowBook implements ActionListener
{
	ArrayList<PersonInfo> personsList;
   	PersonLogic pl;
   	JFrame appFrame;
   	JLabel jlbName, jlbAddress, jlbPhone, jlbPhone2;
   	JTextField jtfName, jtfAddress, jtfPhone, jtfPhone2;
   	JButton jbbSave, jbnDelete, jbnClear, jbnFirst,jbnLast, jbnSearch,
   					jbnForward, jbnBack, jbnExit;
  	String name, address;
   	int phone,phone2;
   	int recordNumber;	 // used to naviagate using >> and << buttons 
   	Container cPane;
   public static void main(String args[]){
      new YellowBook(); 
   }

   public YellowBook()
   { 	
	    name    = "";
	    address = "";
	    phone2  = -1;
	    phone   = -1 ;		//Stores 0 to indicate no Phone Number
	    recordNumber = -1;
	
	    createGUI();
	
	    personsList = new ArrayList();
	
	    // creating PersonLogic object
	    pl = new PersonLogic();	

   }

   	public void createGUI(){

   		/*Create a frame, get its contentpane and set layout*/
   		appFrame = new JFrame("Yellow  Directory");

   		cPane = appFrame.getContentPane();
   		cPane.setLayout(new GridBagLayout());
   		
   		//Arrange components on contentPane and set Action Listeners to each JButton
   		arrangeComponents();
   		
   		appFrame.setSize(500,300);
   		appFrame.setResizable(false);
   		appFrame.setVisible(true);
   		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   	}
   	
   	public void arrangeComponents(){
   		jlbName = new JLabel("Name");
   		jlbAddress = new JLabel("Address");
   		jlbPhone = new JLabel("Phone");
   		jlbPhone2 = new JLabel("Phone2");

   		jtfName    = new JTextField(20);
   		jtfAddress = new JTextField(20);
   		jtfPhone   = new JTextField(20);
   		jtfPhone2   = new JTextField(20);

   		jbbSave   = new JButton("Save");
   		jbnDelete = new JButton("Delete");
   		jbnClear  = new JButton("Clear");
   		jbnSearch = new JButton("Search");

   		jbnFirst = new JButton("First");
                jbnForward = new JButton("Next");
   		jbnBack    = new JButton("Previous");
   		jbnLast = new JButton("Last");
   		jbnExit    = new JButton("Exit");

   		/*add all initialized components to the container*/
        GridBagConstraints gridBagConstraintsx01 = new GridBagConstraints();
        gridBagConstraintsx01.gridx = 0;
        gridBagConstraintsx01.gridy = 0;
        gridBagConstraintsx01.insets = new Insets(5,5,5,5); 
        cPane.add(jlbName, gridBagConstraintsx01);
        
        GridBagConstraints gridBagConstraintsx02 = new GridBagConstraints();
        gridBagConstraintsx02.gridx = 1;
        gridBagConstraintsx02.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx02.gridy = 0;
        gridBagConstraintsx02.gridwidth = 2;
        gridBagConstraintsx02.fill = GridBagConstraints.BOTH;
        cPane.add(jtfName, gridBagConstraintsx02);
        
        GridBagConstraints gridBagConstraintsx03 = new GridBagConstraints();
        gridBagConstraintsx03.gridx = 0;
        gridBagConstraintsx03.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx03.gridy = 1;
        cPane.add(jlbAddress, gridBagConstraintsx03);
        
        GridBagConstraints gridBagConstraintsx04 = new GridBagConstraints();
        gridBagConstraintsx04.gridx = 1;
        gridBagConstraintsx04.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx04.gridy = 1;
        gridBagConstraintsx04.gridwidth = 2;
        gridBagConstraintsx04.fill = GridBagConstraints.BOTH;
        cPane.add(jtfAddress, gridBagConstraintsx04);
        
        GridBagConstraints gridBagConstraintsx05 = new GridBagConstraints();
        gridBagConstraintsx05.gridx = 0;
        gridBagConstraintsx05.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx05.gridy = 2;
        cPane.add(jlbPhone, gridBagConstraintsx05);
        
        GridBagConstraints gridBagConstraintsx06 = new GridBagConstraints();
        gridBagConstraintsx06.gridx = 1;
        gridBagConstraintsx06.gridy = 2;
        gridBagConstraintsx06.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx06.gridwidth = 2;
        gridBagConstraintsx06.fill = GridBagConstraints.BOTH;
        cPane.add(jtfPhone, gridBagConstraintsx06);
        
        GridBagConstraints gridBagConstraintsx07 = new GridBagConstraints();
        gridBagConstraintsx07.gridx = 0;
        gridBagConstraintsx07.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx07.gridy = 3;
        cPane.add(jlbPhone2, gridBagConstraintsx07);
        
        GridBagConstraints gridBagConstraintsx08 = new GridBagConstraints();
        gridBagConstraintsx08.gridx = 1;
        gridBagConstraintsx08.gridy = 3;
        gridBagConstraintsx08.gridwidth = 2;
        gridBagConstraintsx08.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx08.fill = GridBagConstraints.BOTH;
        cPane.add(jtfPhone2, gridBagConstraintsx08);
        
        GridBagConstraints gridBagConstraintsx09 = new GridBagConstraints();
        gridBagConstraintsx09.gridx = 3;//0
        gridBagConstraintsx09.gridy = 0;//4
        gridBagConstraintsx09.insets = new Insets(5,5,5,5); 
        cPane.add(jbbSave, gridBagConstraintsx09);
        
        GridBagConstraints gridBagConstraintsx10 = new GridBagConstraints();
        gridBagConstraintsx10.gridx = 3;//1
        gridBagConstraintsx10.gridy = 1;//4
        gridBagConstraintsx10.insets = new Insets(5,5,5,5); 
        cPane.add(jbnDelete, gridBagConstraintsx10);
        
        GridBagConstraints gridBagConstraintsx13 = new GridBagConstraints();
        gridBagConstraintsx13.gridx = 3;//2
        gridBagConstraintsx13.gridy = 2;//4
        gridBagConstraintsx13.insets = new Insets(5,5,5,5); 
        cPane.add(jbnSearch, gridBagConstraintsx13);
        
        
        
        GridBagConstraints gridBagConstraintsx11 = new GridBagConstraints();
        gridBagConstraintsx11.gridx = 0;
        gridBagConstraintsx11.gridy = 5;
        gridBagConstraintsx11.insets = new Insets(5,5,5,5); 
        cPane.add(jbnFirst, gridBagConstraintsx11);
        
        GridBagConstraints gridBagConstraintsx12 = new GridBagConstraints();
        gridBagConstraintsx12.gridx = 1;
        gridBagConstraintsx12.gridy = 5;
        gridBagConstraintsx12.insets = new Insets(5,5,5,5);
        cPane.add(jbnBack, gridBagConstraintsx12);
        
        
        GridBagConstraints gridBagConstraintsx14 = new GridBagConstraints();
        gridBagConstraintsx14.gridx = 2;
        gridBagConstraintsx14.gridy = 5;
        gridBagConstraintsx14.insets = new Insets(5,5,5,5); 
        cPane.add(jbnForward, gridBagConstraintsx14);
        
        GridBagConstraints gridBagConstraintsx17 = new GridBagConstraints();
        gridBagConstraintsx17.gridx = 3;
        gridBagConstraintsx17.gridy = 5;
        gridBagConstraintsx17.insets = new Insets(5,5,5,5); 
        cPane.add(jbnLast, gridBagConstraintsx17);
        
        
        GridBagConstraints gridBagConstraintsx15 = new GridBagConstraints();
        gridBagConstraintsx15.gridx = 3;//1
        gridBagConstraintsx15.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx15.gridy = 3;//6
        cPane.add(jbnClear, gridBagConstraintsx15);
        

   		
   		jbbSave.addActionListener(this);
   		jbnDelete.addActionListener(this);
   		jbnClear.addActionListener(this);
   		jbnFirst.addActionListener(this);
   		jbnLast.addActionListener(this);
   		jbnSearch.addActionListener(this);
   		jbnForward.addActionListener(this);
   		jbnBack.addActionListener(this);
   		
   	}

   	public void actionPerformed (ActionEvent e){
   		
   		if (e.getSource () == jbbSave){
             savePerson();
             clear(); 
        }

   		else if (e.getSource() == jbnDelete){
             deletePerson(searchPerson1());
             clear();
        }

   		else if (e.getSource() == jbnFirst){
             displayFirstRecord();
                
        }
                
   		else if (e.getSource() == jbnLast){
             displayLastRecord();
           
        }

   		else if (e.getSource() == jbnSearch){
             searchPerson(searchPerson1());
        } 

   		else if (e.getSource() == jbnForward){
             displayNextRecord(); 
        }

  		else if (e.getSource() == jbnBack){
            displayPreviousRecord();
        }

   		else if (e.getSource() == jbnClear){
            clear();
        }

   	}
        
 public String searchPerson1() {
    return  JOptionPane.showInputDialog(this, "");
   
}       
     // Save the Person into the Address Book 
     public void savePerson(){  
	   	name    = jtfName.getText();
	   	name = name.toUpperCase();	//Save all names in Uppercase
	   	address = jtfAddress.getText();
                int pass=0;
	   	try{
	   		phone = Integer.parseInt(""+jtfPhone.getText());
	   	}catch(Exception e){
	   		System.out.print("Input is a string");
	   		JOptionPane.showMessageDialog(null, "Please enter Phone Number");
                        pass=1;
	   	}
	   	try{
	   		phone2 = Integer.parseInt(""+jtfPhone2.getText());
	   	}catch(Exception e){
	   		System.out.print("Input is a string");
	   		JOptionPane.showMessageDialog(null, "Please enter Phone Number");
                        pass=1;
	   	}
	   	
	
	   	if(name.equals("")){
	   		JOptionPane.showMessageDialog(null, "Please enter person name.");
	   	}
                
                if(pass==0){
		   	  //create a PersonInfo object and pass it to PersonLogic to save it
		   	  PersonInfo person = new PersonInfo(name, address, phone, phone2);
		   	  pl.savePerson(person);
		   	  JOptionPane.showMessageDialog(null, "Person Saved count ="+pl.getpersonsList().size());
	      }else{
             JOptionPane.showMessageDialog(null, "Try Again....");
	        
                }
              System.out.println("Saved = "+pl.getpersonsList().size());
     }

     public void deletePerson(String name1){

	   	name = name1;
	   	name = name.toUpperCase();
	   	if(name.equals("")){
	   		JOptionPane.showMessageDialog(null,"Please enter person name to delete.");
	   	}
	   	else{
	   		//remove Person of the given name from the Address Book database
	   	int numberOfDeleted = pl.removePerson(name);
	   	JOptionPane.showMessageDialog(null, numberOfDeleted + " Record(s) deleted.");
	   	System.out.println("Number of records left :"+pl.getpersonsList().size());
                }
     }



      public void searchPerson(String name1) {
    
	   	name = name1;
	   	name = name.toUpperCase();
	   	/*clear contents of arraylist if there are any from previous search*/
	   	personsList.clear();

	   	
	
	   	if(name.equals("")){
	   		JOptionPane.showMessageDialog(null,"Please enter person name to search.");
	   	}
	   	else{
	   		/*get an array list of searched persons using PersonLogic*/
	   		personsList = pl.searchPerson(name);
	
	   		if(personsList.size() == 0){
	   			JOptionPane.showMessageDialog(null, "No records found.");
	   			//Perform a clear if no records are found.
	   			clear();
	   		}
	   		else
	   		{
	   			/*downcast the object from array list to PersonInfo*/
	   			PersonInfo person = (PersonInfo) personsList.get(0);
	
	             // displaying search record in text fields 
	   			jtfName.setText(person.getName());
	   			jtfAddress.setText(person.getAddress());
	   			jtfPhone.setText(""+person.getPhone());
	   			jtfPhone2.setText(""+person.getPhone2());
	   		}
	   	}

     }

   public void displayNextRecord(){

    // inc in recordNumber to display next person info, already stored in 
	//  personsList during search     
       System.out.println(recordNumber);
   	recordNumber++;
         System.out.println(recordNumber);

   	if(recordNumber >= pl.getpersonsList().size()){
        JOptionPane.showMessageDialog(null, "You have reached end of " +
        		"search results"); 

   		/*if user has reached the end of results, disable forward button*/
   		jbnForward.setEnabled(false);
   		jbnBack.setEnabled(true);

       // dec by one to counter last inc
       recordNumber -- ; 
   	}
   	else{
   		jbnBack.setEnabled(true);
   		PersonInfo person = (PersonInfo) pl.getpersonsList().get(recordNumber);

       // displaying search record in text fields 
   		jtfName.setText(person.getName());
   		jtfAddress.setText(person.getAddress());
   		jtfPhone.setText(""+person.getPhone());
   		jtfPhone2.setText(""+person.getPhone2());
   	}
   }


     public void displayPreviousRecord(){

         // dec in recordNumber to display previous person info, already 
    	 //stored in personsList during search                  
	   	recordNumber--;
	
	   	if(recordNumber < 0 ){
	        JOptionPane.showMessageDialog(null, "You have reached begining " +
	        		"of search results"); 
	
	   		/*if user has reached the begining of results, disable back button*/
	   		jbnForward.setEnabled(true);
	   		jbnBack.setEnabled(false);
	
             // inc by one to counter last dec
               recordNumber++;
	   	}else{
	   		jbnForward.setEnabled(true);
	   		PersonInfo person = (PersonInfo) pl.getpersonsList().get(recordNumber);
	
	        // displaying search record in text fields 
	   		jtfName.setText(person.getName());
	   		jtfAddress.setText(person.getAddress());
	   		jtfPhone.setText(""+person.getPhone());
	   		jtfPhone2.setText(""+person.getPhone2());
	   	}

     }
public void displayFirstRecord(){

         // dec in recordNumber to display previous person info, already 
    	 //stored in personsList during search                  
	   	
	
	   	if(pl.getpersonsList().size() == 0 ){
	        JOptionPane.showMessageDialog(null, "There are no records"); 
	
	   		/*if user has reached the begining of results, disable back button*/
	   		jbnForward.setEnabled(true);
	   		jbnBack.setEnabled(false);
	
             // inc by one to counter last dec
               
	   	}else{
                    
                        System.out.println(pl.getpersonsList().size());
	   personsList = pl.getpersonsList();
	 PersonInfo person=(PersonInfo)personsList.get(0);
	        // displaying search record in text fields 
	   		jtfName.setText(person.getName());
	   		jtfAddress.setText(person.getAddress());
	   		jtfPhone.setText(""+person.getPhone());
	   		jtfPhone2.setText(""+person.getPhone2());
                        //jbnFirst.setEnabled(false);
	   	}

     }

public void displayLastRecord(){

         // dec in recordNumber to display previous person info, already 
    	 //stored in personsList during search                  
	   	
	
	   	if(pl.getpersonsList().size()== 0 ){
	        JOptionPane.showMessageDialog(null, "There are no records"); 
	
	   		/*if user has reached the begining of results, disable back button*/
	   		jbnForward.setEnabled(true);
	   		jbnBack.setEnabled(false);
	
             // inc by one to counter last dec
               	   	}else{
	   		jbnForward.setEnabled(true);
	   		PersonInfo person = (PersonInfo) pl.getpersonsList().get(pl.getpersonsList().size()-1);
	
	        // displaying search record in text fields 
	   		jtfName.setText(person.getName());
	   		jtfAddress.setText(person.getAddress());
	   		jtfPhone.setText(""+person.getPhone());
	   		jtfPhone2.setText(""+person.getPhone2());
	   	}

     }
     
public void clear(){
    
	   	jtfName.setText("");
	   	jtfAddress.setText("");
	   	jtfPhone.setText("");
	   	jtfPhone2.setText("");
	   	
	   	/*clear contents of arraylist*/
	          recordNumber = -1;
	   //	personsList.clear();
	   	jbnForward.setEnabled(true);
	   	jbnBack.setEnabled(true);
     }


   }
