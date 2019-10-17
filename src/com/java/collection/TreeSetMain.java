package com.java.collection;

import java.util.TreeSet;

/** this program shows how to add elements in a TreeSet*/
public class TreeSetMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(19, "Abhijit", 3000);
		Employee e2 = new Employee(18, "Sritam", 3000);
		Employee e3 = new Employee(16, "Abhijit", 3000);
		Employee e4 = new Employee(17, "Nidhi", 3000);
		Employee e5 = new Employee(12, "Kumar", 3000);
		Employee e6 = new Employee(23, "Harshi", 3000);
		Employee e7 = new Employee(13, "Champak", 3000);
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		
		for (Object obj : ts) 
		{
			System.out.println(obj);
		}
		
	}

}
