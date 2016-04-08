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
import javax.swing.JFrame;
import javax.swing.JButton;

public class ShowBorderLayout extends JFrame {

    //Constructor
    public ShowBorderLayout() {
        // 3 rows 2 column and 5 pixel gap between each
        setLayout(new BorderLayout(5,10));
    
    //Add Buttons to the frame
    add(new JButton("East"), BorderLayout.EAST);
    add(new JButton("West"), BorderLayout.WEST);
    add(new JButton("North"), BorderLayout.NORTH);
    add(new JButton("South"), BorderLayout.SOUTH);
    add(new JButton("Center"), BorderLayout.CENTER);    
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
    
}
