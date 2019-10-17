package com.java.collection;

/** this program shows how to override the hashCode, equals, toString methods */
public class Game implements Comparable<Object>
{
	String name;
	String type;
	int players;

	public Game(String name,String type,int players) 
	{
		this.name=name;
		this.type=type;
		this.players=players;
	}

	@Override
	public int hashCode()					//hashCode() overridden
	{
		System.out.println("Calling hashCode()");
		return this.players;
	}

	@Override
	public boolean equals(Object obj)		//equals() overridden
	{
		System.out.println("Calling equals()");
		Game g = (Game) obj;
		return this.type == g.type;
	}

	@Override
	public String toString()				//toString() overridden
	{
		return "Game [Name = "+name+", Type = "+type+", Players = "+players+"]";
	}

	public int compareTo(Object obj)		//compareTo() overridden
	{
		Game gm = (Game)obj;
		return this.players - gm.players;
	}
}
