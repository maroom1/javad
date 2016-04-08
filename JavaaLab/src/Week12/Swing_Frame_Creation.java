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
import javax.swing.JFrame;

public class Swing_Frame_Creation {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("My Frame");
              
        frame.setSize(300, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
}
}
