/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaswant;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Goduguluri
 */
public class Mainwindow implements ActionListener  {

   private JButton employee ;
    private JButton manager ;
    private JFrame jf;
    public Mainwindow(){
   employee =new JButton("Employee");
    manager =new JButton("Manager");
     jf=new JFrame("Selection Window");
     jf.setLayout(new FlowLayout());
     jf.add(employee);
     jf.add(manager);
     employee.addActionListener(this);
     manager.addActionListener(this);
     jf.setSize(200,75);
      jf.setVisible(true);
      jf.setResizable(false);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
    
    public static void main(String args[]){
    Mainwindow mw=new Mainwindow();
    
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==employee){
        new Employee();
    }
    if(e.getSource()==manager){
        new Manager();
    
    }
    
    }
    
}
