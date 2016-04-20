/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logindbfiles;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class LoginDBFiles extends JFrame implements ActionListener {

    private HashMap<String, String> hm;
    private JButton jb1, jb2;
    private JTextField jtf1, jtf2, jtf3;
    private JLabel jl1;
    private Date dt;

    public LoginDBFiles() {

        dt = new Date();
        System.out.println(dt.toString() + ":" + "Initiating the Database HashMap");

        hm = new HashMap();

        System.out.println(dt.toString() + ":" + "Reading and updating the Initial DB");
        readDatabase();

        JPanel p = new JPanel(new GridLayout(4, 3, 3, 6));
        jb1 = new JButton("Login");
        jb2 = new JButton("Sign up");
        p.add(new JLabel("Name"));
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        int k=hm.size();
        String s="Signup total #" + k;
        if(k==0)
        jl1 = new JLabel("Its a New App");
        else
        jl1 = new JLabel(s);            
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
        System.out.println(dt.toString() + ":" + "Processing the application.....Done");
        jb1.addActionListener(this);
        jb2.addActionListener(this);

    }

    public static void main(String[] args) {
 JOptionPane.showMessageDialog(null, "Logging has started please check in output console!");
        
        System.out.println(new Date().toString() + ":" + "Initiating the application");
        LoginDBFiles frame = new LoginDBFiles();
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
                        String s = jtf1.getText() + "," + jtf2.getText();
                        System.out.println(dt.toString() + ":" + "updating Database started");
                        createOrAppendFile(s);

                        System.out.println(dt.toString() + ":" + "Database updated successfully");

                        JOptionPane.showMessageDialog(null, "Sign UP Successful...!");
                        System.out.println(dt.toString() + ":" + "verify and updating the total count");
                        jl1.setText("Signup total #" + hm.size());
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

    public void createOrAppendFile(String text) {

        File computersFile = new File("LoginDB.txt");
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(computersFile, true));
             System.out.println(dt.toString()+":Writing to DB file @"+computersFile.getAbsolutePath());
               
            bw.write(text);
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(LoginDBFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void readDatabase() {
        BufferedReader in = null;
           File computersFile;
            
        try {
           
            computersFile = new File("LoginDB.txt");
            if(!computersFile.exists())
            try {
                System.out.println(dt.toString()+":No DB Creating a new DB file");
                 computersFile.createNewFile();
                 System.out.println(dt.toString()+":Created file @"+computersFile.getAbsolutePath());
               
            } catch (IOException ex1) {
                Logger.getLogger(LoginDBFiles.class.getName()).log(Level.SEVERE, null, ex1);
            }

            in = new BufferedReader(
                    new FileReader(computersFile));
             System.out.println(dt.toString()+":Reading DB file @"+computersFile.getAbsolutePath());
             
            String ar = in.readLine();
            int c = 0;
            while (ar != null) {
                String[] lr = ar.split(",");
                hm.put(lr[0], lr[1]);
                ar = in.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception");
               } catch (IOException ex) {
            Logger.getLogger(LoginDBFiles.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LoginDBFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
