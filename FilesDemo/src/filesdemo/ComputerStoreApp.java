/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesdemo;
import java.util.*;

public class ComputerStoreApp {
    // declare two class variables
    private static ComputerDAO computerDAO = null;
    private static Scanner sc = null;
    
    public static void main(String[] args) {
        // TODO partnum application logic here
        // display a welcome message
        System.out.println("Welcome to the Computer Maintenance application\n");

        // set the class variables
        sc = new Scanner(System.in);
        System.out.println("Specify the file format (textfile or randomfile): ");
        String fileType = sc.next();
        computerDAO = DAOFactory.getComputerDAO(fileType);
        if (computerDAO == null) {
            System.out.println("Invalid file type.\n");
            return;
        }
        // display the command menu
        displayMenu();

        // perform 1 or more actions
        String action = "";
        while (!action.equalsIgnoreCase("exit"))
        {
            // get the input from the user
            System.out.print("Enter a command: ");
            action = sc.next();
            System.out.println();

            if (action.equalsIgnoreCase("list"))
                displayAllComputers();
            else if (action.equalsIgnoreCase("add"))
                addComputer();
            else if (action.equalsIgnoreCase("del") || action.equalsIgnoreCase("delete"))
                deleteComputer();
            else if (action.equalsIgnoreCase("help") || action.equalsIgnoreCase("menu"))
                displayMenu();
            else if (action.equalsIgnoreCase("exit") || action.equalsIgnoreCase("quit"))
                System.out.println("Bye.\n");
            else
                System.out.println("Error! Not a valid command.\n");
        }
    }
    
    public static void displayMenu()
    {
        System.out.println("COMMAND MENU");
        System.out.println("list    - List all computers");
        System.out.println("add     - Add a computer");
        System.out.println("del     - Delete a computer");
        System.out.println("help    - Show this menu");
        System.out.println("exit    - Exit this application\n");
    }

    public static void displayAllComputers()
    {
        System.out.println("COMPUTER LIST");

        ArrayList<Computer> computers = computerDAO.getComputers();
        Computer c = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < computers.size(); i++)
        {
            c = computers.get(i);
            sb.append(c.getPartnumber() + "\t");
            sb.append(c.getDescription() + "\t");
            sb.append(c.getFormattedPrice() + "\t");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void addComputer()
    {
        System.out.print("Enter computer partnum: ");
        String partnum = sc.next();
        System.out.print("Enter computer description: ");
        String description = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
   
        Computer computer = new Computer();
        computer.setPartnumber(partnum);
        computer.setDescription(description);
        computer.setPrice(price);
        computerDAO.addComputer(computer);

        System.out.println();
        System.out.println(description 
                + " has been added.\n");
    }

    public static void deleteComputer()
    {
        System.out.print("Enter computer partnum to delete: ");
        String partnum = sc.next();

        Computer p = computerDAO.getComputer(partnum);

        System.out.println();
        if (p != null)
        {
            computerDAO.deleteComputer(p);
            System.out.println(p.getDescription()
                    + " has been deleted.\n");
        }
        else
        {
            System.out.println("No computer matches that partnum.\n");
        }
    }
}
