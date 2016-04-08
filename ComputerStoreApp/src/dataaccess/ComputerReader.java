package dataaccess;

import java.util.ArrayList;
import business.*;

public interface ComputerReader
{
    Computer getComputer(String partnumber);
    ArrayList<Computer> getComputers();
}