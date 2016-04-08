package binaryfile;
import java.io.*;
import java.util.*;

public class WriteBinaryStrings {
    public static void main(String[] args) {
        try {
            String test = "You love NPU";
            
            // Connect to a file with buffer
            DataOutputStream out = new DataOutputStream(
                               new BufferedOutputStream(
                                new FileOutputStream("strings.bin")
                                ));
            
            // use the writeUTF method
            out.writeUTF(test);
            int size1 = out.size();
            
            // use the writeChars method
            out.writeChars(test);
            int size2 = out.size() - size1;
            
            // Compare sizes
            System.out.println("writeUTF wrote " + size1 
                    + ", writeChars wrote " + size2 );
            
            // Close the output stream
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            DataInputStream in = new DataInputStream(
                               new BufferedInputStream(
                                new FileInputStream("strings.bin")
                                ));
            
           // get total bytes
            int total = in.available();
            
            // use readUTF method
            String str1 = in.readUTF();
            int size1 = total - in.available();
            
            // use readChars method
            String str2 = "";
            int size2 = 0;
            int count = in.available() / 2;
            for (int i = 0; i < count; i++) {
                str2 += in.readChar();
                size2 += 2;
            }
            
            // Compare sizes
            System.out.println("readUTF read " + size1 
                    + ", readChar read " + size2 );
            // Close the input stream
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
}}
