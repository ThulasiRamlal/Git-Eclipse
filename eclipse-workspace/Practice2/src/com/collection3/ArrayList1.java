package com.collection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList1 {
	public static void main(String[]args) {
	List<String>teja = new ArrayList<String>();
	teja.add("thulasi");
	teja.add("kaveri");
	teja.add("teja");
//here we can approach excuted in three ways
	//printing statement
	System.out.println(teja);
	System.out.println("-------------------------");
	
	//ForEach loop
	for(String i:teja)	
	{
		System.out.println(i);
	}
	System.out.println("------------------------------");
	
	// through iterator
	Iterator<String> teja2=teja.iterator();
	
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
		}
		
	
	}

}
