package com.java.collection;

/** this program defines the Wrapper class overriden methods*/
public class WrapperClasses 
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("a="+a);
		
		Integer ref = new Integer(a);	//Boxing manually done here
		
		System.out.println(ref.toString());
		System.out.println(ref.hashCode());
		
		Integer ref1 = 20;	//AutoBoxing - implicity (From version 1.5)
		System.out.println(ref1.toString());
		System.out.println(ref1.hashCode());
		
		Double du = 2.4;	//AutoBoxing - implicity (From version 1.5)
		System.out.println(du.toString());
		System.out.println(du.hashCode());
		
		int c = ref;
		System.out.println("c="+c);	//Auto-Unboxing
		int d = ref1;
		System.out.println("d="+d);	//Auto-Unboxing 
		int e = ref1;
		System.out.println("e="+e);	//Auto-Unboxing
		
		String s1 = "1234";
		//String s1 = "12r34";
		int a1 = Integer.parseInt(s1);
		System.out.println(a1);
		
	}
}
