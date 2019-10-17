package com.java.collection;

/** this program shows the methods of String class*/
public class StringMethods 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		String s = "DEVELOPER";
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf(3));
		System.out.println(s.indexOf("LO"));
		System.out.println(s.indexOf('P',2));
		System.out.println(s.replace("E",""));
		System.out.println(s.replace('E',' '));
		System.out.println(s.replace('E','O'));
		System.out.println(s.substring(2));
		System.out.println("Main Ends");
	}

}
