/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */
public class Project {
    private String projectName;
    private double budget;
    public Project(String projectName,double budget){
        this.projectName=projectName;
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }
   public void display(){
       System.out.println("Project.Name: "+projectName);
       System.out.println("Project.Budget: "+budget);
   } 
}
