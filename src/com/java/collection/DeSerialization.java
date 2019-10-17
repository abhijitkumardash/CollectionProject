package com.java.collection;

import java.io.*;

/** this program shows the process of Deserialization */
public class DeSerialization 
{
	public static void main(String[] args) 
	{
		String path = "Users/abhijitkumar/Desktop/JavaFile/java.txt";
		File f1 = new File(path);

		FileInputStream fin = null;
		ObjectInputStream in= null;

		try 
		{
			//creating an input stream
			fin = new FileInputStream(f1);
			in = new ObjectInputStream(fin);

			//"ob" is Upcasted here to Object type
			Object ob = in.readObject();

			if (ob instanceof Student) 
			{
				//Upcasted "ob" is Downcasted here to Student type
				Student stu = (Student)ob;
				System.out.println(stu.id);
				System.out.println(stu.name);
			} 
			else 
			{
				System.out.println("Improper Casting !!!");
			}
		} 

		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
