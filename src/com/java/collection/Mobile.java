package com.java.collection;

public class Mobile 
{
	int imei;
	String brand;
	
	public Mobile(int imei,String brand) 
	{
		this.imei = imei;
		this.brand = brand;
	}
	
	@Override
	public String toString() 
	{
		return "Mobile[imei = "+imei+",brand = "+brand+"]";
	}

}
