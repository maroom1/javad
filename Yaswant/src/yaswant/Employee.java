/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaswant;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class Employee implements ActionListener{
  private JLabel firstname,res;
  private JLabel age,title,salary,increment;
  private JTextField jft1,jft3,jft4,jft5,jft6;
  private JButton jb;
  private JFrame jf;
 
  public Employee()
  {
  firstname=new JLabel("Name");

  age=new JLabel("Age");
  title=new JLabel("Title");
  salary=new JLabel("Salary");
  res=new JLabel("");
  increment=new JLabel("% Increment");
  jft1=new JTextField();

  jft3=new JTextField();
  jft4=new JTextField();
  jft5=new JTextField();
  jft6=new JTextField();
  jf=new JFrame("Employee");
  jb=new JButton("Submit");
  jf.setLayout(new GridLayout(7,2));
  jf.add(firstname);jf.add(jft1);jf.add(age);jf.add(jft3);
  jf.add(title);jf.add(jft4);
  jf.add(salary);jf.add(jft5);jf.add(increment);jf.add(jft6);
  jf.add(res);
  jf.add(jb);
  jb.addActionListener(this);
  jf.setSize(250,300);
  jf.setVisible(true);
   
  }
  
 


    @Override
    public void actionPerformed(ActionEvent e){
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   if(e.getSource()==jb){
       try{
       int o=Integer.parseInt(jft3.getText());
       if(o>60){
       JOptionPane.showMessageDialog(new JFrame(),"you need to retire ...");
       }
       }
       catch(NumberFormatException k){
        JOptionPane.showMessageDialog(new JFrame(),"Age should be number...");
       
       }
       
       try{       
       int k=(Integer.parseInt(jft5.getText())*Integer.parseInt(jft6.getText()))/100;
       res.setText("Incremented sal "+String.valueOf(k));
       
       }
       catch(NumberFormatException k){
           JOptionPane.showMessageDialog(new JFrame(),"salary and increment should be number...");
       }
   

   }
    
  
   
    }
  
     public void disablebutton(){
   jft1.setEnabled(false);jft3.setEnabled(false);
jft4.setEnabled(false);jft5.setEnabled(false);jft6.setEnabled(false);
jb.setEnabled(false);
   
   }
    
}
