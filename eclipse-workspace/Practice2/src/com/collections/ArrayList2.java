package com.collections;
import java.util.*;

public class ArrayList2 {
	public static void main(String[] args) {
		List<String> teja = new ArrayList<>();
		teja.add("Thulasi");
		teja.add("Ramlal");
		teja.add("teja");
		teja.add("kaveri");
		teja.add("Suguna");
		for(String i:teja)
		{
			System.out.println(i);
			
		}
		System.out.println("-----------------------");
		System.out.println(teja);
		System.out.println("-----------------------");
		Iterator <String> teja2=teja.iterator();
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
			
		}
		System.out.println("-------------------");
		System.out.println(teja.getFirst());
		System.out.println(teja.get(1));
		System.out.println(teja.isEmpty());
		System.out.println(teja.size());
		System.out.println(teja.getLast());
		System.out.println(teja.getFirst());
		System.out.println(teja.set(1, "Thulasi"));
		
	}

}
