/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_hw4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class AddEvent implements ActionListener,ScheduleWriter{
    SchedulerApp sa;
    JFrame jfadd;
       JLabel dt;
       JTextField  jftdt;
       JLabel tim;
       JTextField  jfttim;
       JLabel desc;
       JTextField  jftdesc;
       JLabel stat;
       JTextField  jftstat;
       JButton add;
       String k;
       int st=0;
       public AddEvent(String sdt){
       }
    public AddEvent(SchedulerApp sa){
        this.sa=sa;
        jfadd=new JFrame("Add Item");
        dt=new JLabel("Date");
         jftdt=new JTextField();
        tim=new JLabel("Time"); 
         jfttim=new JTextField();
        desc=new JLabel("Description"); 
         jftdesc=new JTextField();
        stat=new JLabel("Status"); 
         jftstat=new JTextField();
        add=new JButton("Add");
       jfadd.setLayout(new GridLayout(5,2));
       jfadd.add(dt);jfadd.add(jftdt);jfadd.add(tim);jfadd.add(jfttim);jfadd.add(desc);jfadd.add(jftdesc);
       jfadd.add(stat);jfadd.add(jftstat);
       jfadd.add(add);
       jfadd.setVisible(true);
       jfadd.setSize(300,200);
       //jfadd.setDefaultCloseOperation(jfadd.EXIT_ON_CLOSE);
       add.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==add){
    System.out.println("Add Event");
    String s;
       
    s=jftdt.getText().concat(",").concat(jfttim.getText()).concat(",").concat(jftdesc.getText()).concat(",").concat(jftstat.getText());
    k=s;
    System.out.println(s);
    //File computersFile=new File("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt");
        try {
          //  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(computersFile,true)));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\YalamandaRao\\Documents\\NetBeansProjects\\Week13_HW4\\src\\week13_hw4\\in.txt", true)));
            
            out.println(s);
             System.out.println("Written buffer");
           
             out.close();
             jfadd.setVisible(false);
             jfadd.dispose();
               sa.model.addElement(s);
               System.out.println("Yellow");
         
        } catch (IOException ex) {
            Logger.getLogger(AddEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    st=1;
    
  
    }

    public String getNewAddedItem()
    {
       
    return k;
    }
}
