package com.java.collection;

import java.util.ArrayList;

public class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list1 = new ArrayList<Object>();
		Student s1 = new Student(2, "Jeet");
		Student s2 = new Student(22, "Abhi");
		Employee e1 = new Employee(101, "Abhijit", 25000);
		Employee e2 = new Employee(100, "Debasish",20000);
		Mobile m1 = new Mobile(1519, "Nokia");
		list1.add(s1);
		list1.add(s2);
		list1.add(e1);
		list1.add(e2);
		list1.add(e2);
		list1.add(m1);
		list1.add(null);
	
		System.out.println("size = "+list1.size());
		
		for (int i = 0; i < list1.size(); i++) 
		{
			Object obj = list1.get(i);
			System.out.println(obj);
		}
		//it size() will display the no of Object present in the ArrayList
		int a = list1.size();	
		System.out.println("size = "+a);
	}
}
