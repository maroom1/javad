/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesdemo;
import java.util.ArrayList;

/**
 *
 * @author ken
 */
public interface ComputerDAO {
    // static constants
    int PARTNUM_SIZE = 4;
    int DESCRIPTION_SIZE = 40;
    
    // Reader interface
    Computer getComputer(String partnumber);
    ArrayList<Computer> getComputers();
    
    // Writer interfaces
    boolean addComputer(Computer c);
    boolean updateComputer(Computer c);
    boolean deleteComputer(Computer c);
}
