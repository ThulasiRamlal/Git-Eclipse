package com.stream;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashset1 {
	public static void main(String[] args) {
	Set<Integer>teja=new TreeSet<Integer>();
	teja.add(2);
	teja.add(4);
	teja.add(1);
	teja.add(0);
	teja.add(5);
	System.out.println(teja);
	System.out.println("==========================");
	Iterator<Integer>teja2=teja.iterator();
	{
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
		}
	}
	}

}
