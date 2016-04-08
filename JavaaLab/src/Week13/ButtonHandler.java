/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Goduguluri
 */
public class ButtonHandler implements ActionListener {
    
    public JButton bt1,bt2,bt3,bt4;
    public JFrame jf;
    Container cPane;
    GridLayout gl;
    FlowLayout fl;
    public ButtonHandler(){
    design();
    }
    public void design(){
        System.out.println("Design Creating...");
   jf= new JFrame("Button Handler");
        gl=new GridLayout(2,2);
               
     jf.setLayout(gl);
   
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     bt1=new JButton("Button1");
     bt2=new JButton("Button2");
     bt3=new JButton("Button3");
     bt4=new JButton("Button4");
    jf.add(bt1);
    jf.add(bt2);
    jf.add(bt3);
    jf.add(bt4);
      jf.setSize(200,200);
     jf.setResizable(false);
     jf.setVisible(true);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    bt4.addActionListener(this);
     
       
    }
    public static void main (String args[]){
        
        ButtonHandler bh=new ButtonHandler();    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==bt1){JOptionPane.showMessageDialog(null, "Button 1 Clicked");}
    else if(e.getSource()==bt2){JOptionPane.showMessageDialog(null, "Button 2 Clicked");}
    else if(e.getSource()==bt3){JOptionPane.showMessageDialog(null, "Button 3 Clicked");}
    else if(e.getSource()==bt4){JOptionPane.showMessageDialog(null, "Button 4 Clicked");}
    }
    
}
