/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Goduguluri
 */
public class Login extends JFrame implements ActionListener {

    private HashMap<String, String> hm;
    private JButton jb1, jb2;
    private JTextField jtf1, jtf2, jtf3;
    private JLabel jl1;

    public Login() {

        JPanel p = new JPanel(new GridLayout(4, 3, 3, 6));
        jb1 = new JButton("Login");
        jb2 = new JButton("Sign up");
        p.add(new JLabel("Name"));
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jl1=new JLabel("");
        p.add(jtf1);
        p.add(new JLabel(""));
        p.add(new JLabel("password"));
        p.add(jtf2);
        p.add(jb1);
        p.add(new JLabel("Again Password"));
        p.add(jtf3);
        p.add(new JLabel(""));
        p.add(new JLabel(""));
        p.add(jb2);
        p.add(jl1);
        add(p);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        hm = new HashMap();

    }

    public static void main(String[] args) {
        Login frame = new Login();
        frame.setTitle("Singup and Login Pane");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action event initiated");
        if (e.getSource() == jb2) {
            System.out.println("Singup button varied");
            if (jtf2.getText().equals(jtf3.getText())) {
                System.out.println("tesfields varified");
                hm.put(jtf1.getText(), jtf2.getText());
                JOptionPane.showMessageDialog(null, "Sign UP Successful...!");
            } else {
                JOptionPane.showMessageDialog(null, "Sign UP Failed...!");
            }
        }
        if (e.getSource() == jb1) {
            System.out.println("Login button varified");
            if (!hm.isEmpty()) {
                if(hm.containsKey(jtf1.getText())){
                if (hm.get(jtf1.getText()).equals(jtf2.getText())) {
                    System.out.println("Textfields verified");
                    JOptionPane.showMessageDialog(null, "Login Successful...!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed...!");
                }
                
                } else {
                
                 JOptionPane.showMessageDialog(null, "There is no login Name...!");
                
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please sign up to login...!");
            }
        }

        jtf1.setText(null);
        jtf2.setText(null);
        jtf3.setText(null);
        
        jl1.setName("total #"+hm.size());
    }

}
