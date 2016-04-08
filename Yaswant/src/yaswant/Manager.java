/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaswant;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Goduguluri
 */
public class Manager implements ActionListener {
     private JLabel firstname,res;
  private JLabel experience,age,title,salary,increment;
  private JTextField jft1,jft2,jft3,jft4,jft5,jft6;
  private JButton jb;
  private JFrame jf;
  private JPanel jp1,jp2;
 
  public Manager()
  {
  firstname=new JLabel("First Name");
  experience=new JLabel("Experience");
  age=new JLabel("Age");
  title=new JLabel("Title");
  salary=new JLabel("Salary");
  increment=new JLabel("Increment");
  jp1=new JPanel();
jp2=new JPanel();
jp1.setSize(250,300);
jp1.setVisible(true);
jp2.setSize(250,100);
jp2.setVisible(true);
jft1=new JTextField();
  jft2=new JTextField();
  jft3=new JTextField();
  jft4=new JTextField();
  jft5=new JTextField();
  jft6=new JTextField();
  res=new JLabel("Please submit salary and increment");
  jf=new JFrame("Manager");
  jb=new JButton("Submit");
  jp1.setLayout(new GridLayout(7,2));
  jp2.setLayout(new BorderLayout());
  jf.setLayout(new GridLayout(2,1));
  jp1.add(firstname);jp1.add(jft1);jp1.add(experience);jp1.add(jft2);jp1.add(age);jp1.add(jft3);
  jp1.add(title);jp1.add(jft4);
  jp1.add(salary);jp1.add(jft5);jp1.add(increment);jp1.add(jft6);
  jp1.add(new JLabel(""));
  jp1.add(jb);
  jp2.add(new JLabel("          "),BorderLayout.WEST);
  jp2.add(res,BorderLayout.CENTER);
  jf.getContentPane().add(jp1);
  jf.getContentPane().add(jp2);
  jb.addActionListener(this);
  jf.setSize(300,400);
  jf.setVisible(true);
  
    
  }
  

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       int k=((Integer.parseInt(jft5.getText())*Integer.parseInt(jft6.getText()))/100)+Integer.parseInt(jft5.getText());
       res.setText("Incremented sal "+String.valueOf(k));
       
       }
       catch(NumberFormatException k){
           JOptionPane.showMessageDialog(new JFrame(),"salary and increment should be number...");
       }
 }

   }
  
 
    }

