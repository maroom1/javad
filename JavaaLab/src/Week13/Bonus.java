/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week13;

/**
 *
 * @author Goduguluri
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bonus extends JFrame implements ActionListener {
    HashMap<String, Integer> hash;
    JButton save;
   JButton update;
   JTextField jt1,jt2;
    public Bonus() {
        this.hash = new HashMap<>();
        hash.put("a",1);
        hash.put("b",2);
        hash.put("c",3);
        // 3 rows 2 column and 5 pixel gap between each
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2, 5, 5));
    jt1=new JTextField(5);
    jt2=new JTextField(5);    //Add labels and text fields to the frame
    p1.add(new JLabel("Name"));
    p1.add(jt1);
    p1.add(new JLabel("Score"));
    p1.add(jt2);
   JPanel p2 = new JPanel();
   p2.setLayout(new GridLayout(1, 3,50,50));
   p2.add(new JLabel("Operations"));
   save=new JButton("Get Score");
   update=new JButton("UPDATE");
   p2.add(save);
   p2.add(update);
  JPanel p3 = new JPanel();
  p3.setLayout(new GridLayout(2, 1, 20,20)); 
  p3.add(p1);
  p3.add(p2);
  add(p3, BorderLayout.CENTER);
  save.addActionListener(this);
  update.addActionListener(this);
  
    }
       public static void main(String[] args) {
        // TODO code application logic here
        Bonus frame = new Bonus();
        
        frame.setTitle("ShowFlowLayout");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==save){
        
    jt2.setText(""+hash.get(jt1.getText()));
         System.out.println("saved");
    }else if(e.getSource()==update){
    hash.put(jt1.getText(),Integer.parseInt(jt2.getText()));
   
    }
        
    }
    
}