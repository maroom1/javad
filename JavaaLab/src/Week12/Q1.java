/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

/**
 *
 * @author Goduguluri
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q1 extends JFrame {
    //Constructor
    public Q1() {
        // 3 rows 2 column and 5 pixel gap between each
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2, 5, 5));
    
        //Add labels and text fields to the frame
    p1.add(new JLabel("Name"));
    p1.add(new JTextField(5));
    p1.add(new JLabel("Score"));
    p1.add(new JTextField(5));
   JPanel p2 = new JPanel();
   p2.setLayout(new GridLayout(1, 2, 20,20));
   p2.add(new JButton("Get Score"));
   p2.add(new JButton("Save Student"));
  JPanel p3 = new JPanel();
  p3.setLayout(new GridLayout(2, 1, 20,20)); 
  p3.add(p1);
  p3.add(p2);
  add(p3, BorderLayout.CENTER);
    }
       public static void main(String[] args) {
        // TODO code application logic here
        Q1 frame = new Q1();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}