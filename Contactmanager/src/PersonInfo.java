/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goduguluri
 */

public class PersonInfo
{
	private String name,address;
	private int id, phone,phone2;

      // default constructor
      public PersonInfo()
      {       
         name = "";
         address = "";
         phone2 =0;

         id = 0;  
         phone = 0;
      }

	public PersonInfo(int id, String name, String address, int phone, int phone2)
	{
        this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.phone2 = phone2;
	}
 
      // param construcrtor with 4 values 
	public PersonInfo(String name, String address, int phone, int phone2)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.phone2 = phone2;
	}

      // setters
	public void setId(int i)
	{
		id = i;
	}

	public void setName(String n)
	{
		name=n;		
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public void setPhone(int ph)
	{
		phone=ph;
	}
	public void setEmail(int e)
	{
		phone2=e;
	}

      // getters
	public int getId( )
	{
		return id;
      }

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public int getPhone()
	{
		return phone;
	}

	public int getPhone2()
	{
		return phone2;
	}

}