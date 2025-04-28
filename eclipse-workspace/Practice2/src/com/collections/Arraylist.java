package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> teja = new ArrayList<Integer>();
		teja.add(1);
		teja.add(2);
		teja.add(3);
		teja.add(4);
		teja.add(5);
		teja.add(6);
		teja.add(7);
		teja.add(8);
		teja.add(9);
		teja.add(10);
		
		//Printing normal statement
		
		System.out.println(teja);
		System.out.println("------------Using ForEach loop---------");
		for(int i:teja)
		{
			System.out.println(i+" ");
		}
		
		
		System.out.println("------------Using Iterator--------------");
		Iterator<Integer> teja2=teja.iterator();
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
		}
		System.out.println("------------------------------------------");
		Iterator <Integer> teja3=teja.iterator();	
		while(teja3.hasNext())
		{
			System.out.println(teja3.next());
		}
		System.out.println(teja.contains(9));	
	}
	}
