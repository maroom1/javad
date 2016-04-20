/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.org.mozilla.javascript.internal.ScriptRuntime;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author Goduguluri
 */
public class Login extends JFrame implements ActionListener {

    private HashMap<String, String> hm;
    private JButton jb1, jb2;
    private JTextField jtf1, jtf2, jtf3;
    private JLabel jl1;
    private Date dt;

    public Login() {
        hm = new HashMap();
        dt = new Date();
        JPanel p = new JPanel(new GridLayout(4, 3, 3, 6));
        jb1 = new JButton("Login");
        jb2 = new JButton("Sign up");
        p.add(new JLabel("Name"));
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jl1 = new JLabel();
        //jl1.setText(s);
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
        System.out.println(dt.toString() + ":" + "Action event initiated");
        if (e.getSource() == jb2) {
            System.out.println(dt.toString() + ":" + "Singup button varied");
            String s1 = jtf1.getText();
            String s2 = jtf2.getText();
            String s3 = jtf3.getText();
            if (!jtf1.getText().isEmpty() && !jtf2.getText().isEmpty() && !jtf3.getText().isEmpty()) {
                System.out.println(dt.toString() + ":Checking for distinct name");
                if (!hm.containsKey(s1)) {
                    if (jtf2.getText().equals(jtf3.getText())) {
                        System.out.println(dt.toString() + ":" + "tesfields varified");
                        hm.put(jtf1.getText(), jtf2.getText());
                        JOptionPane.showMessageDialog(null, "Sign UP Successful...!");
                        System.out.println(dt.toString() + ":" + "verify and updating the total count");
                        jl1.setText("total #" + hm.size());
                    } else {
                        JOptionPane.showMessageDialog(null, "Sign UP Failed different passwords...!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sign UP name already taken...!");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Sign UP values should not be null...!");
            }
        }
        if (e.getSource() == jb1) {
            System.out.println(dt.toString() + ":" + "Login button varified");
            if (!hm.isEmpty()) {
                if (hm.containsKey(jtf1.getText())) {
                    if (hm.get(jtf1.getText()).equals(jtf2.getText())) {
                        System.out.println(dt.toString() + ":" + "Textfields verified");
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
        
    }

}
