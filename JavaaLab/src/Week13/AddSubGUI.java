/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week13;


import java.awt.FlowLayout;
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
public class AddSubGUI implements ActionListener {
    public JButton bt1,bt2;
    public JFrame jf;
    public JTextField jt1,jt2,jt3;
    public JLabel jl1,jl2,jl3,jl4;  
    public GridLayout gl;
  
    public AddSubGUI(){
      
    design1();
    
    }
    public void design1(){
     System.out.println("Creating desing...");
    jf= new JFrame("Calcul Handler");
   // gl=new GridLayout(4,2);
     
   jf.setLayout(new GridLayout(4,2));
   jf.setSize(500,500);
   
    jl1=new JLabel("Number 1");
    jl2=new JLabel("Number 2");
    jl3=new JLabel("Operator");
    jl4=new JLabel("Result");
    bt1=new JButton("ADD");
    bt2=new JButton("SUB");
    jt1=new JTextField();
    jt2=new JTextField();
    jt3=new JTextField();
    jf.add(jl1);
    jf.add(jt1);
    jf.add(jl2);
    jf.add(jt2);
    //jf.add(jl3,0);
    jf.add(bt1);
    jf.add(bt2);
    jf.add(jl4);
    jf.add(jt3);
    System.out.println("Design Created");    
    jf.setResizable(true);
   jf.setVisible(true);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   bt1.addActionListener(this);
   bt2.addActionListener(this);
    }
    public static void main(String args[]){
        AddSubGUI asg =new AddSubGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            System.out.println("Add invoked");
            int a=Integer.parseInt(jt1.getText())+Integer.parseInt(jt2.getText());
            jt3.setText(""+a);
        }
    else if(e.getSource()==bt2){
         int a=Integer.parseInt(jt1.getText())-Integer.parseInt(jt2.getText());
            jt3.setText(""+a);
    }
    
    }
}
