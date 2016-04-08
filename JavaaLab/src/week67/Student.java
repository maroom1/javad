/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week67;

/**
 *
 * @author YalamandaRao
 */
public class Student extends Person {
    
    private int id;
    private String major;
   public Student(){
   this.id=1;
   this.major="Null";
   
   } 

    public Student(int id,String major,String name,String Address,String Phone){
   this.setId(id);
   this.setMajor(major);
   this.setName(name);
   this.setAddress(Address);
   this.setPhone(Phone);
   
   }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
          
    public void setStudent(int i,String a){

        setId(i);
        setMajor(a);

    }
public void getStudent(){
this.displayPerson();
      
       System.out.println(getId());
        System.out.println(getMajor());

    }

}
