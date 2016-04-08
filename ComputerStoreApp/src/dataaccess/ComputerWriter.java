package dataaccess;

import business.*;

public interface ComputerWriter
{
    boolean addComputer(Computer c);
    boolean updateComputer(Computer c);
    boolean deleteComputer(Computer c);
}