/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW4_Summer_2015
 * Author: Goduguluri 
 * Filename: EditEvent.java 
 * Date and Time: Aug 20, 2015 9:32:32 AM 
 * Project Name: Week13_HW4_15200 
 */
package BusinessLogic;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class EditEvent implements ActionListener {
    private String[] lr;
    JFrame jf;
    JTextField jtf1,jtf2,jtf3,jtf4;
    JButton jb;
    public EditEvent(String[] lr)
    {
        this.lr=lr;
    
    jf=new JFrame("Search Result");
      jf.setLayout(new GridLayout(5,2,10,10));
      jtf1= new JTextField();
      jtf2= new JTextField();
      jtf3= new JTextField(); jtf4= new JTextField();
     
     
      jf.add(new JLabel("Event Date"));jf.add(jtf1);
      jf.add(new JLabel("Event Time"));jf.add(jtf2);
      jf.add(new JLabel("Description"));jf.add(jtf3);
      jf.add(new JLabel("Event Status"));jf.add(jtf4);
      jb=new JButton("Update");
      jf.add(jb);jf.add(new JLabel(""));
      jtf1.setText(lr[0]);jtf2.setText(lr[1]);jtf3.setText(lr[2]);jtf4.setText(lr[3]);
      jtf1.setEnabled(true);jtf2.setEnabled(true);jtf3.setEnabled(true);jtf4.setEnabled(true);
      jf.setVisible(true);
      jf.setSize(300,200);
      
    jb.addActionListener(this);
    
    }

    public EditEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==jb){
    JOptionPane.showMessageDialog(null,"Updated the event");
    }
    
    
    }
    
}

