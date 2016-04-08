/* 
 * Student Info: Name=MuraliKrishnaGoduguluri, ID=15200
 * Subject: CS480k_HW4_Summer_2015
 * Author: Goduguluri 
 * Filename: SearchEvent.java 
 * Date and Time: Aug 20, 2015 8:59:54 AM 
 * Project Name: Week13_HW4_15200 
 */
package BusinessLogic;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class SearchEvent {
    private String[] lr;
    JFrame jf;
    JTextField jtf1,jtf2,jtf3,jtf4;
    public SearchEvent(String[] lr)
    {
        this.lr=lr;
    
    jf=new JFrame("Search Result");
      jf.setLayout(new GridLayout(4,2,10,10));
      jtf1= new JTextField();
      jtf2= new JTextField();
      jtf3= new JTextField(); jtf4= new JTextField();
     
     
      jf.add(new JLabel("Event Date"));jf.add(jtf1);
      jf.add(new JLabel("Event Time"));jf.add(jtf2);
      jf.add(new JLabel("Description"));jf.add(jtf3);
      jf.add(new JLabel("Event Status"));jf.add(jtf4);
      jtf1.setText(lr[0]);jtf2.setText(lr[1]);jtf3.setText(lr[2]);jtf4.setText(lr[3]);
      jtf1.setEnabled(false);jtf2.setEnabled(false);jtf3.setEnabled(false);jtf4.setEnabled(false);
      jf.setVisible(true);
      jf.setSize(300,200);
      
    
    
    }
    
}
