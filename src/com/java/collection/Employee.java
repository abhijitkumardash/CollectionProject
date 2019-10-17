package com.java.collection;

@SuppressWarnings("rawtypes")
public class Employee implements Comparable	//implementing Comparable interface
{
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public int hashCode()					//hashCode() overridden
	{
		System.out.println("Calling hashCode()");
		
		return this.id;
		
		//return this.name;
		//return this.salary;
	}
	
	@Override
	public boolean equals(Object obj)		//equals() overridden
	{
		System.out.println("Calling equals()");
		Employee e = (Employee) obj;
		
		return this.id == e.id;
		
		//return this.name == e.name;
		//return this.salary == e.salary;
	}
	
	@Override
	public String toString()				//toString() overridden
	{
		return "Employee [id = "+id+",name = "+name+",salary = "+salary+"]";
	}
	
	public int compareTo(Object obj)		//compareTo() overridden
	{
		Employee emp = (Employee)obj;
		
		//return emp.id-this.id;
		
		return this.id-emp.id;
		
		//return this.name-emp.name;
		//return emp.salary-this.salary;

	}
}
