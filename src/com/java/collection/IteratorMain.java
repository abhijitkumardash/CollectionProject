package com.java.collection;

import java.util.*;

/** this program shows the use of Iterator */
public class IteratorMain 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();

		Student s1 = new Student(2, "Jeet");
		Student s2 = new Student(22, "Abhi");
		Employee e1 = new Employee(101, "Abhijit", 25000);
		Employee e2 = new Employee(100, "Debasish",20000);
		Mobile m1 = new Mobile(1519, "Nokia");

		al.add(s1);
		al.add(s2);
		al.add(e1);
		al.add(e2);
		al.add(e2);
		al.add(m1);
		al.add(null);

		Iterator<Object> it = al.iterator();	//here we are achieving 100% abstraction

		//it.hasNext();
		//it.next();
		//it.remove();

		while (it.hasNext()) 
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
