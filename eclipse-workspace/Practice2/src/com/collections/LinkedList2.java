package com.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> teja2 = new LinkedList<>(); //object2
		List <Integer> teja =new LinkedList<Integer>(); //object1
		
		teja.add(10);
		teja.add(20);
		/*
		 * teja.add(30); teja.add(40); teja.add(50); teja.add(60);
		 */
		//System.out.println(teja);
		teja2.add(10);
		teja2.add(20);
		/*
		 * teja2.add(30); teja2.add(40); teja2.add(50);
		 */
		teja2.addAll(teja);
		System.out.println(teja2);
		
		  System.out.println("------------------------"); 
		  for(int i:teja)
		  {
		  System.out.println(i+" ");
		  }
		  System.out.println("--------------------------");
		  
		  Iterator<Integer> it=teja.iterator(); 
		  
		  while(it.hasNext()) 
		  { 
			  System.out.println(it.next());
		}
		  teja2.addFirst(5);
		  System.out.println(teja2);
		  teja2.addLast(30);
		  System.out.println(teja2);
		  teja2.add(1, 6);
		  System.out.println(teja2);
		 
	}

	

			
}
	
