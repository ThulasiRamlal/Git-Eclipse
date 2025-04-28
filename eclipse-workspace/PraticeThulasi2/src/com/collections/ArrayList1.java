package com.collections;
import java.util.Collections;
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
	
		
	//Array list
	List<Integer>teja=new ArrayList<Integer>();
	teja.add(10);
	teja.add(20);
	teja.add(30);
	//Linked list==========================
	List<Integer>teja2=new LinkedList<Integer>();
	teja2.add(40);
	teja2.add(50);
	teja2.add(60);
	teja2.addAll(teja);
	Stack<Integer>teja10=new Stack<Integer>();
	teja10.add(100);
	teja10.add(200);
	teja10.add(300);
	for(int i:teja2)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("--------------------------");
	Iterator<Integer>i=teja10.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	/*for(int i:teja2)
	{
		System.out.println(i);
	}
	System.out.println("==================================");
	//Iterator
	Iterator<Integer>teja3=teja2.iterator();
	while(teja3.hasNext())
	{
		System.out.println(teja3.next());
	}
	System.out.println("===============================");
	//ListIterator
	ListIterator<Integer>teja4=teja2.listIterator();
	while(teja4.hasNext())
	{
		System.out.println(teja4.next());
		
	}
	System.out.println("===========================");
	while(teja4.hasPrevious())
	{
		System.out.println(teja4.previous());
	}
	*/
	
	//System.out.println("=============================================");
	
	System.out.println(teja10);
	System.out.println(teja10.push(400));
	System.out.println(teja10.peek());
	teja10.pop();
	System.out.println(teja10);
	
	}
}
	
	

