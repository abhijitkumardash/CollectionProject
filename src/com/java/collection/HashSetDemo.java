package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

/** this program shows how to Iterate elements from a HashSet */
public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Capgemini");
		set1.add(null);
		set1.add("Java");
		set1.add("j2ee");
		set1.add("java");
		set1.add("SQL");
		set1.add("Capgemini");
		set1.add("Java");
		
		Iterator<String> it = set1.iterator();
		while (it.hasNext()) 
		{
			//Object obj = (Object) it.next();
			System.out.println(it.next());
		}
	
		
	}
}
