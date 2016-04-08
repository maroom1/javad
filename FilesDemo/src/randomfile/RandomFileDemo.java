package randomfile;
import binaryfile.*;
import java.io.*;
import java.util.*;
import filesdemo.*;

public class RandomFileDemo {
    public static void main(String[] args) {
        final int PARTNUM_SIZE = 4;
        final int DESC_SIZE = 6;
        final int PRICE_SIZE = 8;
        
        
        try {
            // Connect to a file
            RandomAccessFile out = new RandomAccessFile("computers.ran", "rw");
            
            // Create computer objects
            ArrayList<Computer> al = new ArrayList<>();
            al.add(new Computer("1000", "Dektop", 12500));
            al.add(new Computer("2000", "Laptop", 1500));
            al.add(new Computer("3000", "Tablet", 500));
            
            // Write the Computer objects to the file.
            for(Computer c : al) {
                out.writeChars(c.getPartnumber());
                out.writeChars(c.getDescription());
                out.writeDouble(c.getPrice());
            }
            // Close the output stream
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            final int RECORD_LEN = PARTNUM_SIZE * 2 + DESC_SIZE * 2 + PRICE_SIZE;
            // Connect to a file
            RandomAccessFile in = new RandomAccessFile("computers.ran", "r");
            
               
            // move the cursor to the third record
            int recordnum = 3;
            in.seek((recordnum - 1) * RECORD_LEN);
           
            // Read the third record
            String partnum = "";
            for (int i = 0; i < PARTNUM_SIZE; i++)
                partnum += in.readChar();
            
            String description = "";
            for (int i = 0; i < DESC_SIZE; i++)
                description += in.readChar();
            
            double price = in.readDouble();
                
            Computer c = new Computer(partnum, description, price);
            
            // Close the intput stream
            in.close();
            
            // Print the computer object
            System.out.println(c.getPartnumber() + ", " 
                                   + c.getDescription() + ", " 
                                   + c.getFormattedPrice() );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
    }
}
