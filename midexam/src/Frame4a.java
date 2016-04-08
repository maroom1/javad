
import java.awt.*;
import javax.swing.*;

public class Frame4a
{  
   public static void main(String[] args)
   {  
      JFrame f = new JFrame("JFrame with a JPanel");

      JLabel L = new JLabel("Hello World !");   // Make a JLabel;
      JLabel L1 = new JLabel("Hello World !");  
      JTextField jft=new JTextField(null);
      JPanel P = new JPanel(new GridLayout(1, 2)); 
     // Make a JPanel;
      
      
      P.add(L);P.add(jft);//P.add(L);P.add(L);                   // Add L to JPanel P

      f.getContentPane().add(P);  // Add P to JFrame f

      f.setSize(400,300);
      f.setVisible(true);
   }
}