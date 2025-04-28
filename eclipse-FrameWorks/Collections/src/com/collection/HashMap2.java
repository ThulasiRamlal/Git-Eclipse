package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		System.out.println(hm);
		
		 for (Map.Entry<Integer, String> e : hm.entrySet())
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
		
		 
		 for(Map.Entry<Integer, String> h:hm.entrySet())
		 {
			 System.out.println(h.getKey());
		 }
		
		 
	}
}
