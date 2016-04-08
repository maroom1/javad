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
import javax.swing.*;

public class Swing_Button {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My Frame");
        
        //Adding button in to the frame
        JButton jbtOK = new JButton("OK Button");
        
        frame.add(jbtOK);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
  
}
