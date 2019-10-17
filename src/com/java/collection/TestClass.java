package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass 
{	
	public static void main(String[] args) 
	{
		   
		User u1=new User();
		u1.setId(1);
		u1.setName("Abhijit");
		u1.setEmail("Abhijit@gmail.com");
		
		User u2=new User();
		u2.setId(1);
		u2.setName("Kumar");
		u2.setEmail("kumar@gmail.com");
		
		User u3=new User();
		u3.setId(2);
		u3.setName("Dash");
		u3.setEmail("Dash@gmail.com");
		
		
		HashSet<User> hs=new HashSet<User>();
		
		hs.add(u1);
		hs.add(u2);
		hs.add(u3);
		
		Iterator<User> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
