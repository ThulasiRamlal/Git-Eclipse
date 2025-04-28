package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayList1 {
	public static void main(String[] args) {
		
//	1.Array list is a interface which is implements List interface
//	2.Array list is uses Dynamic Array for storing elements.
//  3.it is mainly used to Searching purposes
//	4.Array List can allow duplicate values
//	5.It can allow null vaues
//	6.it can follow a insertion order
//	7.Array list intial Capacity is 0 and Default Capacity is 10
//	8.it is non-synchronized
//	9.it is process fast and time consumption is less and thread safe
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		System.out.println("==================================");
		
		
		//fetching the data by using foreach loop
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===================================");
		
		
		//fetching by using Iterator
		
	Iterator<Integer> b=a.iterator();
	while(b.hasNext())
	{
		System.out.print(b.next()+", ");
	}
	System.out.println();
	System.out.println("=============================================");
	
	
	
	
	
	System.out.println("===========List Iterator Forward Direction====================");
	ListIterator<Integer> c=a.listIterator();
	while(c.hasNext())
	{
		System.out.print(c.next()+", ");
	}
	System.out.println();
	System.out.println("=============ListIterator backward direction======================");
	while(c.hasPrevious())
	{
		System.out.print(c.previous()+", ");
	}
	

	
	
	
	
	
	
	
	
	
	}

}
