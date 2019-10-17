package com.java.collection;

import java.io.*;

/** this program shows hoe to perform Serialization */
public class Serialization 			
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(10, "Abhijit Kumar Dash");
		
		String path = "Users/abhijitkumar/Desktop/JavaFile/java.txt";
		File f1 = new File(path);
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		
		try 
		{
			f1.createNewFile();
			fout = new FileOutputStream(f1);
			out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			System.out.println("Object Written");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}


}
