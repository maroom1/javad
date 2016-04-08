package filesdemo;

import java.io.*;
import java.util.*;

public class ComputerTextFile implements ComputerDAO
{
    private ArrayList<Computer> computers = null;
    private File computersFile = null;

    private final String FIELD_SEP = "\t";

    public ComputerTextFile()
    {
        computersFile = new File("computers.txt");
        computers = this.getComputers();
    }

    private void checkFile() throws IOException
    {
        // if the file doesn't exist, create it
        if (!computersFile.exists())
            computersFile.createNewFile();
    }

    private boolean saveComputers()
    {
        PrintWriter out = null;
        try
        {
            this.checkFile();

            // open output stream for overwriting
            out = new PrintWriter(
                  new BufferedWriter(
                  new FileWriter(computersFile)));

            // write all computers in the array list
            // to the file
            for (Computer c : computers)
            {
                out.print(c.getPartnumber() + FIELD_SEP);
                out.print(c.getDescription() + FIELD_SEP);
                out.println(c.getPrice());
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return false;
        }
        finally
        {
            this.close(out);
        }
        return true;
    }

    private void close(Closeable stream)
    {
        try
        {
            if (stream != null)
                stream.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public ArrayList<Computer> getComputers()
    {
        // if the computers array has been created, don't create it again
        if (computers != null)
            return copyComputers();

        BufferedReader in = null;
        try
        {
            this.checkFile();

            in = new BufferedReader(
                 new FileReader(computersFile));

            computers = new ArrayList<Computer>();

            // read all computers stored in the file
            // into the array list
            String line = in.readLine();
            while(line != null)
            {
                String[] columns = line.split(FIELD_SEP);
                String partnum = columns[0];
                String description = columns[1];
                String price = columns[2];

                Computer c = new Computer(
                    partnum, description, Double.parseDouble(price));
                computers.add(c);

                line = in.readLine();
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        finally
        {
            this.close(in);
        }
        ArrayList<Computer> computersCopy = new ArrayList<Computer>();
        for (Computer c : computers)
            computersCopy.add(c);
        return copyComputers();
    }

    private ArrayList<Computer> copyComputers()
    {
        ArrayList<Computer> computersCopy = new ArrayList<Computer>();
        for (Computer c : computers)
            computersCopy.add(c);
        return computersCopy;
    }

    public Computer getComputer(String partnum)
    {
        for (Computer c : computers)
        {
            if (c.getPartnumber().equals(partnum))
                return c;
        }
        return null;
    }

    public boolean addComputer(Computer c)
    {
         computers.add(c);
        return this.saveComputers();
    }

    public boolean deleteComputer(Computer c)
    {
        computers.remove(c);
        return this.saveComputers();
    }

    public boolean updateComputer(Computer newComputer)
    {
        // get the old computer and remove it
        Computer oldComputer = this.getComputer(newComputer.getPartnumber());
        int i = computers.indexOf(oldComputer);
        computers.remove(i);

        // add the updated computer
        computers.add(i, newComputer);

        return this.saveComputers();
    }
}
