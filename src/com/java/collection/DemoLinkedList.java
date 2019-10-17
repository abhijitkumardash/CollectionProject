package com.java.collection;

import java.util.LinkedList;

/** this program is to display the objects present in the ArrayList */
public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Object> li = new LinkedList<Object>();
		Student s1 = new Student(2, "Jeet");
		Student s2 = new Student(22, "Abhi");
		Employee e1 = new Employee(101, "Abhijit", 25000);
		Employee e2 = new Employee(100, "Debasish",20000);
		Mobile m1 = new Mobile(1519, "Nokia");
		li.add(s1);
		li.add(s2);
		li.add(e1);
		li.add(e2);
		li.add(e2);
		li.add(m1);
		li.add(null);
	
		System.out.println("size = "+li.size());
		
		for (int i = 0; i < li.size(); i++) 
		{
			Object obj = li.get(i);
			System.out.println(obj);
		}
		//it size() will display the no of Object present in the ArrayList
		int a = li.size();	
		System.out.println("size = "+a);
	}

}
