package com.java.collection;

import java.util.LinkedList;

/** this program shows how to add elements to LinkedList */
public class GameMain 
{
	public static void main(String[] args) 
	{
		// HashSet hs = new HashSet();
		LinkedList<Game> list1 = new LinkedList<Game>();

		Game g1 = new Game("Ludo","Indoor",4);
		Game g2 = new Game("Chess","Indoor",2);
		Game g3 = new Game("Cricket","Outdoor",11);
		Game g4 = new Game("FoootBalist1","Outdoor",11);
		Game g5 = new Game("Tik-Tok-To","Indoor",2);
		Game g6 = new Game("PUBG","Indoor",4);

		/*hs.add(g1);
		hs.add(g2);
		hs.add(g3);
		hs.add(g4);
		hs.add(g5);
		hs.add(g6);*/

		list1.add(g1);
		list1.add(g2);
		list1.add(g3);
		list1.add(g4);
		list1.add(g5);
		list1.add(g6);

		for (Object obj : list1) 
		{
			System.out.println(obj);
		}
	}

}
