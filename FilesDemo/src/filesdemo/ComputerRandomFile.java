package filesdemo;
import java.io.*;
import java.util.*;

public class ComputerRandomFile implements ComputerDAO {
    private RandomAccessFile computersFile = null;
    private ArrayList<String> computerPartnums = null;

    private final int PRICE_SIZE = 8;  // doubles are 8 bytes
    private final int RECORD_SIZE =
        PARTNUM_SIZE * 2 +          // from the ComputerDAO interface
        DESCRIPTION_SIZE * 2 +   // from the ComputerDAO interface
        PRICE_SIZE;
    private final String DELETION_PARTNUM = "    ";
    
    public ComputerRandomFile()
    {
        try
        {
            computersFile = new RandomAccessFile("computers.ran", "rw");
            computerPartnums = this.getPartnums();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    //*************************************************
    // Private methods for reading computers
    //*************************************************
    private int getRecordCount() throws IOException
    {
        int recordCount = (int) computersFile.length() / RECORD_SIZE;
        return recordCount;
    }

    private int getRecordNumber(String computerPartnum)
    {
        for (int i = 0; i < computerPartnums.size(); i++)
        {
            String partnum = computerPartnums.get(i);
            if (computerPartnum.equals(partnum))
                return i;
        }
        return -1;  // no record matches the computer partnum
    }

    private Computer getRecord(int recordNumber) throws IOException
    {
        if (recordNumber >= 0 && recordNumber < this.getRecordCount())
        {
            computersFile.seek(recordNumber * RECORD_SIZE);

            String partnum = IOFixedStrings.readFixedString(
                computersFile, PARTNUM_SIZE);
            String description = IOFixedStrings.readFixedString(
                computersFile, DESCRIPTION_SIZE);
            double price = computersFile.readDouble();

            Computer computer = new Computer(partnum, description, price);
            return computer;
        }
        else
        {
            return null;
        }
    }

    private ArrayList<String> getPartnums()
    {
        try
        {
            ArrayList<String> partnums = new ArrayList<>();
            for (int i = 0; i < getRecordCount(); i++)
            {
                computersFile.seek(i * RECORD_SIZE);
                partnums.add(IOFixedStrings.readFixedString(
                    computersFile, PARTNUM_SIZE));
            }
            return partnums;
        }
        catch(IOException e)
        {
            System.out.println(e);
            return null;
        }
    }

    //*********************************************************
    // Public methods for reading computers
    //*********************************************************
    public ArrayList<Computer> getComputers()
    {
        ArrayList<Computer> computers = new ArrayList<>();
        try
        {
            for (int i = 0; i < computerPartnums.size(); i++)
            {
                // if record has been marked for deletion,
                // don't add to computers array list
                if (!computerPartnums.get(i).equals(DELETION_PARTNUM))
                {
                    Computer computer = this.getRecord(i);
                    computers.add(computer);
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
            return null;
        }
        return computers;
    }

    public Computer getComputer(String computerPartnum)
    {
        try
        {
            int recordNumber = this.getRecordNumber(computerPartnum);
            Computer computer = this.getRecord(recordNumber);
            return computer;
        }
        catch(IOException e)
        {
            System.out.println(e);
            return null;
        }
    }

    //*************************************************
    //* Private methods for writing computers
    //*************************************************
    private boolean writeComputer(Computer computer, int recordNumber)
    {
        try
        {
            computersFile.seek(recordNumber * RECORD_SIZE);
            IOFixedStrings.writeFixedString(
                computersFile, PARTNUM_SIZE, computer.getPartnumber());
            IOFixedStrings.writeFixedString(
                computersFile, DESCRIPTION_SIZE, computer.getDescription());
            computersFile.writeDouble(computer.getPrice());
            return true;
        }
        catch(IOException e)
        {
            System.out.println(e);
            return false;
        }
    }

    //*************************************************
    //* Public methods for writing computers
    //*************************************************

    public boolean addComputer(Computer computer)
    {
        computerPartnums.add(computer.getPartnumber());
        int recordNumber = getRecordNumber(computer.getPartnumber());
        return writeComputer(computer, recordNumber);
    }

    public boolean updateComputer(Computer computer)
    {
        int recordNumber = getRecordNumber(computer.getPartnumber());
        if (recordNumber != -1)
            return writeComputer(computer, recordNumber);
        else
            return false;
    }

    public boolean deleteComputer(Computer computer)
    {
        int recordNumber = getRecordNumber(computer.getPartnumber());
        if (recordNumber != -1)
        {
            computerPartnums.set(recordNumber, DELETION_PARTNUM);
            computer.setPartnumber(DELETION_PARTNUM);  // mark record for deletion
            return writeComputer(computer, recordNumber);
        }
        else
        {
            return false;
        }
    }
}
