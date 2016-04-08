package binaryfile;
import java.io.*;
import java.util.*;
import filesdemo.*;

public class BinaryFileDemo {
    public static void main(String[] args) {
        try {
            // Connect to a file with buffer
            DataOutputStream out = new DataOutputStream(
                               new BufferedOutputStream(
                                new FileOutputStream("computers.bin")
                                ));
            
            // Create computer objects
            ArrayList<Computer> al = new ArrayList<>();
            al.add(new Computer("1000", "Desktop", 12500));
            al.add(new Computer("2000", "Laptop", 1500));
            al.add(new Computer("3000", "Tablet", 500));
            
            // Write the Computer objects to the file.
            for(Computer c : al) {
                out.writeUTF(c.getPartnumber());
                out.writeUTF(c.getDescription());
                out.writeDouble(c.getPrice());
            }
            // Close the output stream
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            // Connect to a file with buffer
            DataInputStream in = new DataInputStream(
                               new BufferedInputStream(
                                new FileInputStream("computers.bin")
                                ));
            
            // Create computer objects
            ArrayList<Computer> al = new ArrayList<>();
                 
            // Read the Computer objects from the file
            while (in.available() > 0) {
                String partnum = in.readUTF();
                String description = in.readUTF();
                double price = in.readDouble();
                
                al.add(new Computer(partnum, description, price));
            }
            // Close the intput stream
            in.close();
            
            // Print all computer objects
            for(Computer c : al) {
                System.out.println(c.getPartnumber() + ", " 
                                   + c.getDescription() + ", " 
                                   + c.getFormattedPrice() );
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
    }
}
