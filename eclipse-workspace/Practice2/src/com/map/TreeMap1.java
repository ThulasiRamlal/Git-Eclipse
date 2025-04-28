package com.map;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		//it does not allow any duplicate values
	  //it follows natural order
		//it allow null value only once
		TreeMap <Integer,String> teja = new TreeMap<>();
		teja.put(1, "Thulasi");
		teja.put(2, "Thulasi");
		teja.put(5, null);
		teja.put(0, null);
		teja.put(7, null);
		teja.put(8, "thulasi");
		System.out.println(teja);
		
	}

}
