package com.java.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** this program shows File Reading operation using Java Program */
public class FileReader 
{

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();

		/* Try with Resourses block */
		try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Abhijit Kumar Dash\\Desktop\\Temp.txt"))) 
		{
			// read line by line
			String line;
			while ((line = br.readLine()) != null) 
			{
				sb.append(line).append("\n");
			}
		} 
		catch (IOException e) 
		{
			System.err.format("IOException: %s%n", e);
		}

		System.out.println(sb);
	}
}
/* import java.io.*;

public class FileReader 
{
	public static void main(String[] args) 
	{
		String path = "";
		File fi = new File(path);
		FileReader fr = null;
		BufferedReader br=null;
		try
		{
			fr = new FileReader();
			br = new BufferedReader(fr);
			String s1 = br.readLine();
			while(s1!=null)
			{
				System.out.println(s1);
				s1 = br.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception  handled");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}

	}
}*/