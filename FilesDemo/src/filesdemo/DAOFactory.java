/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesdemo;

public class DAOFactory {
    // this method maps the ComputerDAO interface
    // to the appropriate data storage mechanism
    public static ComputerDAO getComputerDAO(String type)
    {
        ComputerDAO pDAO = null;
        
        if (type.equalsIgnoreCase("textfile")) {
            pDAO = new ComputerTextFile();
        }
        else if (type.equalsIgnoreCase("randomfile")) {
            pDAO = new ComputerRandomFile();
        }
        
        return pDAO;
    }
}
