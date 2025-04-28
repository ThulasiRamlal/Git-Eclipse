package com.map;

import java.util.LinkedHashMap;

public class LinkedHashmap1 {
	public static void main(String[] args) {
		//it does not allow any duplicate values
	  //it follows any insertion order
	//it allow null value only once
		LinkedHashMap<Integer,String> teja = new LinkedHashMap<>();
		teja.put(1, null);
		teja.put(2, "Thulasi");
		teja.put(null, null);
		teja.put(0, null);
		teja.put(null, null);
		teja.put(1, "thulasi");
		System.out.println(teja);
	}

}
