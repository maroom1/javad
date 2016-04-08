package Week12;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;

public class DrawingLines extends JFrame {
  public DrawingLines() {
    add(new NewPanel1());
  }

  public static void main(String[] args) {
    DrawingLines frame = new DrawingLines();
    frame.setTitle("Program2");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); // Center the frame   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);    
  }
}

class NewPanel1 extends JPanel { 
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.red);
    g.drawLine(0, 50, 300, 50);
   g.drawLine(0, 100, 300, 100);
    g.setColor(Color.BLUE);
    g.drawLine(90,0, 90, 200);
   g.drawLine(182, 0, 182, 200);
    
  }
}