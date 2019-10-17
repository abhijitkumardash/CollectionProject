package com.java.collection;

import java.util.*;

/** this program shows how to add elements to a HashSet */
public class HashSetMain 
{
	public static void main(String[] args) 
	{
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e1 = new Employee(19, "Abhijit", 3000);
		Employee e2 = new Employee(18, "Sritam", 3000);
		Employee e3 = new Employee(16, "Abhijit", 3000);
		Employee e4 = new Employee(17, "Nidhi", 3000);
		Employee e5 = new Employee(12, "Kumar", 3000);
		Employee e6 = new Employee(23, "Harshi", 3000);
		Employee e7 = new Employee(13, "Champak", 3000);
		Employee e8 = new Employee(16, "Abhijit", 3000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		hs.add(e7);
		hs.add(e8);
		
		for (Object obj : hs) 
		{
			System.out.println(obj);
		}
	}

}
