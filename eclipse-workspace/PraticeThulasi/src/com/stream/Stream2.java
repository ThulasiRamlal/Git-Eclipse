package com.stream;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Iterator;

public class Stream2 {
	public static void main(String[] args) {
	List<Integer>teja=new ArrayList<Integer>();
	teja.add(10);
	teja.add(29);
	teja.add(11);
	teja.add(12);
	teja.add(30);
	teja.add(40);
	teja.add(50);
	//collect
	List<Integer>teja2=teja.stream().collect(Collectors.toList());
	for(int i:teja2)
	{
		System.out.println(i);
	}
	System.out.println("==========================");
	/*Iterator<Integer>teja3=teja.iterator();
	{
	 while(teja3.hasNext())
	 {
		 System.out.println(teja3.next());
	 }
	}*/
	//count
	long teja4=teja.stream().count();
	System.out.println(teja4);
	System.out.println("========================");
	
	//Reduce
	Integer teja5=teja.stream().reduce(0,(a,b)->a+b);
	System.out.println(teja5);
	}
}
