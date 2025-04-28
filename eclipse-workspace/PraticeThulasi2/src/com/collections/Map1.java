package com.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String,Integer>teja=new HashMap<String,Integer>();
		teja.put("Thulasi", 1);
		teja.put("Teja", 1);
		teja.put(null, null);
		//System.out.println(teja);
		LinkedHashMap<String,Integer>teja2=new LinkedHashMap<String,Integer>();
		teja2.put("Thulasi", 1);
		teja2.put("Thulasi", 2);
		teja2.put(null,10);
		//System.out.println(teja2);
		TreeMap<String,Integer>teja3=new TreeMap<String,Integer>();
		teja3.put("Thulasi", 1);
		teja3.put("Teja", 1);
		teja3.put("kaveri", null);
		System.out.println(teja3);
	
	
	
	
	
	
	}

}
