package com.java.collection;

import java.sql.SQLException;

public class ThrowsKyword 
{
	/** "throws" keyword id used to propagate "Chaecked" Exception from calling method to called method */ 

	public static void connection(String user,String pass) throws SQLException 
	{
		if (user.equals("java") && pass == "123") 
		{
			System.out.println("Connect to Database");
		} 
		else 
		{
			//to generate Exception explicitly
			throw new SQLException();
		}
	}
}
