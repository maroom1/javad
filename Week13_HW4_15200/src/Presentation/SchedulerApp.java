/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW4_Summer_2015
 * Author: Goduguluri 
 * Filename: SchedulerApp.java 
 * Date and Time: Aug 19, 2015 6:56:54 PM 
 * Project Name: Week13_HW4_15200 
 */
package Presentation;

import BusinessLogic.AddEvent;
import BusinessLogic.EditEvent;
import BusinessLogic.Schedule;
import BusinessLogic.SearchEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class SchedulerApp extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public JFrame jf1, jf2;
    public JLabel jl1;
    public JButton add, search, delete, edit;
    public JTextField jtf;
    public JPanel jp1, jp2;
    public JList jl;  
    private File computersFile;
   private String[] events;
    JScrollPane scrollPane_1;
    public  DefaultListModel model;

    public SchedulerApp() {
        design();
    }

    public void design() {
        //jf1 = new JFrame("Scheduler App");
        //jf2 = new JFrame("Add Schedule");
        
        add = new JButton("Add");
        search = new JButton("Search");
        delete = new JButton("Delete");
        edit = new JButton("Edit");
        jtf=new JTextField(20);
        System.out.println("11");
        jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1, 1));
        jp2 = new JPanel();
        jp2.setLayout(new GridLayout(5, 1));
        events=showEvents();
        model = new DefaultListModel();
         for(String sl:events)
             model.addElement(sl);
        jl = new JList(model);
      scrollPane_1 = new JScrollPane(jl);
scrollPane_1.setMaximumSize(new Dimension(200, 200));
scrollPane_1.setMinimumSize (new Dimension (200,200));


         //jp1.add(jl);
        jp2.add(jtf);
        jp2.add(search);
        jp2.add(add);
        jp2.add(edit);
        jp2.add(delete);
        add(scrollPane_1 , BorderLayout.CENTER);
        add(jp2,BorderLayout.WEST);
search.addActionListener(this);
edit.addActionListener(this);
add.addActionListener(this);
delete.addActionListener(this);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        SchedulerApp sa = new SchedulerApp();
        sa.setLocationRelativeTo(null);
        sa.setSize(400,400);
        sa.setVisible(true);
        sa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==add){
       AddEvent ae=new AddEvent(this);
                   
   }else if(e.getSource()==edit){
       try {
           editEvent();
       } catch (IOException ex) {
           Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }else if(e.getSource()==delete){
       try {
           deleteEvent();
       } catch (IOException ex) {
           Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
       }
   }else if(e.getSource()==search){try {
       searchEvent();
       } catch (IOException ex) {
           Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
       }
}
    }
public String[] showEvents(){
    BufferedReader in=null;
    String[] linesArray=null;
        try {
            File computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
            in = new BufferedReader(
                    new FileReader(computersFile));
            Schedule s;
            ArrayList<String> lines = new ArrayList<String>();
            String ar=in.readLine();
            int c=0;
            while(ar!=null){
                lines.add(ar);
                String[] lr=ar.split(",");
                System.out.println(lr.length);
                s = new Schedule(lr[0],lr[1],lr[2],Integer.parseInt(lr[3]));
                s.display();
                ar=in.readLine();
            }          linesArray = lines.toArray(new String[lines.size()]);
            for(String z:linesArray){
            System.out.println("line "+z);
                }        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(SchedulerApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }return linesArray;   
}

public void searchEvent() throws IOException{
String sdt=jtf.getText();
File computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
  BufferedReader in=new BufferedReader(
                 new FileReader(computersFile));

 ArrayList<String> lines = new ArrayList<String>();
  String ar=in.readLine();
  int c=0;
  while(ar!=null){
      
    String[] lr=ar.split(",");
//    !lr[0].equalsIgnoreCase(sdt[0]) && !lr[1].equalsIgnoreCase(sdt[1])
        if(lr[0].equalsIgnoreCase(sdt)){
            System.out.println("I am searching");
      SearchEvent se=new SearchEvent(lr);
        jtf.setText("");
        }
       ar=in.readLine();
 }

  in.close();
   

}
 

public void deleteEvent() throws FileNotFoundException, IOException{
    
     File computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
  BufferedReader in=new BufferedReader(
                 new FileReader(computersFile));
  File computersFile1=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\temp.txt");
             PrintWriter pw = new PrintWriter(new BufferedWriter(
                    new FileWriter(computersFile1,true)));
 Schedule s; 
 System.out.println(jl.getName());
 System.out.println(jl.getSelectedValue().toString());
 String sdt1= jtf.getText();
String[] sdt=jl.getSelectedValue().toString().split(",");
 ArrayList<String> lines = new ArrayList<String>();
  String ar=in.readLine();
  int c=0;
  while(ar!=null){
      
    String[] lr=ar.split(",");
//    !lr[0].equalsIgnoreCase(sdt[0]) && !lr[1].equalsIgnoreCase(sdt[1])
        if(lr.equals(sdt) ){
            System.out.println("I am writing");
                    pw.println(ar);}else{System.out.println("Deleted the Item");
         model.removeElement(ar);
        jtf.setText("");
        }
       ar=in.readLine();
     }

  in.close();pw.close();
  computersFile.delete();
   File rem=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
    computersFile1.renameTo(rem);
   

}

public void editEvent() throws FileNotFoundException, IOException{
String sdt=jtf.getText();
File computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
  BufferedReader in=new BufferedReader(
                 new FileReader(computersFile));

 ArrayList<String> lines = new ArrayList<String>();
  String ar=in.readLine();
  int c=0;
  while(ar!=null){
      
    String[] lr=ar.split(",");
//    !lr[0].equalsIgnoreCase(sdt[0]) && !lr[1].equalsIgnoreCase(sdt[1])
        if(lr[0].equalsIgnoreCase(sdt)){
            System.out.println("I am editing");
      EditEvent se=new EditEvent(lr);
        jtf.setText("");
        }
       ar=in.readLine();
 }

  in.close();
   


}
}
