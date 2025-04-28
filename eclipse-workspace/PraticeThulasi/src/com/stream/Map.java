package com.stream;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer,String>teja=new HashMap<Integer,String>();
		teja.put(1, "Thulasi");
		teja.put(2, null);
		teja.put(3, null);
		teja.put(3, "teja");
		teja.put(5, "Thulasi");
		teja.put(null, null);
		System.out.println(teja);
		//HashMap is a class which extends by Map Interface
		//hashMap doenot allow any duplicate key but alloe the values
		//hash map allow the null key only once but values is allowed
		//hashmap doesnot follow insertion order
		//it is non-Sysnchronized
		//it is thread safe
		//it's process fast
	}

}
