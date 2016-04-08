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
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame  {
    //Constructor
    public ShowGridLayout() {
        // 3 rows 2 column and 5 pixel gap between each
        setLayout(new GridLayout(3, 2, 5, 5));
    
        //Add labels and text fields to the frame
    add(new JLabel("First name"));
    add(new JTextField(8));
    add(new JLabel("MI"));
    add(new JTextField(1));

    add(new JLabel("Last name"));
    add(new JTextField(8));
   
    }
       public static void main(String[] args) {
        // TODO code application logic here
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}

