package com.java.collection;

public class User 
{

	private int id;
	private String name;
	private String email;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{	
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	@Override
	public int hashCode() 
	{
	   return this.id;
	}
	@Override
	
	/*Here we are overriding equals method*/
	public boolean equals(Object obj) 
	{ 
		User u=(User)obj;
	   return this.id==u.id;     
	}
	
	/*Here we are overriding tiString method*/
	@Override
	public String toString() 
	{
		return "User [id = " + id + ", name = " + name + ", email = " + email + "]";
	}	
}
