package com.java.collection;

import java.util.ArrayList;

/** this program shows how to retrive data from an Array */
public class RetriveArrayList 
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

		System.out.println("size = "+al.size());

		for (int i = 0; i < al.size(); i++) 
		{
			Object obj = al.get(i);	//obj is Up_casted to Object type

			if (obj instanceof Student) 
			{
				Student stu = (Student)obj;		//obj is Down_casted to Student type
				System.out.println(stu.id);
				System.out.println(stu.name);
			} 
			else if (obj instanceof Employee)
			{
				Employee emp = (Employee)obj;	//obj is Down_casted to Student type
				System.out.println(emp.id);
				System.out.println(emp.name);
				System.out.println(emp.salary);
			}
			else
			{
				Mobile mob = (Mobile)obj;		//obj is Down_casted to Student type
				System.out.println(mob.imei);
				System.out.println(mob.brand);
			}

			System.out.println(obj);
		}
		//it size() will display the no of Object present in the ArrayList
		int a = al.size();	

		System.out.println("size = "+a);
	}

}
