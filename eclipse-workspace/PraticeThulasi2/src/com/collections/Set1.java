package com.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet<Integer>teja=new HashSet<Integer>();
		teja.add(100);
		teja.add(90);
		teja.add(80);
		teja.add(70);
		teja.add(60);
		teja.add(null);
		teja.add(100);
		//System.out.println(teja);
		LinkedHashSet<Integer>teja2=new LinkedHashSet<Integer>();
		teja2.add(100);
		teja2.add(90);
		teja2.add(80);
		teja2.add(70);
		teja2.add(60);
		teja2.add(null);
		teja2.add(null);
		teja2.add(100);
		//System.out.println(teja2);
		TreeSet<Integer>teja3=new TreeSet<Integer>();
		teja3.add(100);
		teja3.add(90);
		teja3.add(80);
		teja3.add(70);
		teja3.add(60);
		teja3.add(100);
		//teja3.add(null);
		//System.out.println(teja3);
		for(int i:teja3)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
