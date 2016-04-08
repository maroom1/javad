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
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_ShowFlowLayout extends JFrame {

    //Constructor
    public Swing_ShowFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        
    //Add labels and text fields to the frame
    add(new JLabel("First name"));
    add(new JTextField(8));
    add(new JLabel("MI"));
    add(new JTextField(5));
    add(new JLabel("Last name"));
    add(new JTextField(8));
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Swing_ShowFlowLayout frame = new Swing_ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
            
    }
    
}

