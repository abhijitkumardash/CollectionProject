package com.java.collection;;

/** this program shows how to create Object Array  */
public class ObjectArray 
{
	public static void main(String[] args) 
	{
		Student [] st = new Student[5];

		st[0] = new Student(100,"Java");
		st[1] = new Student(101,"SQL");
		st[2] = new Student(102,"J2EE");
		st[3] = new Student(103,"Python");
		st[4] = new Student(104,"Frameworks");

		for (int i = 0; i < st.length; i++) 
		{
			System.out.println(st[i]);	//It will give output as we saved
		}
	}

}
