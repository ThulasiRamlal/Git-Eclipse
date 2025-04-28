package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {	
	Map<String,Integer> r=new HashMap<String,Integer>(4);
	r.put("Thulasi", null);
	r.put("Kaveri", null);
	r.put("teja", null);
	r.put("Thulasi", null);
	r.put("Thulasi", null);
	String a="Thulasi";
	int bucketLocation=a.hashCode();
	int bucketLocation1=bucketLocation/16;
	System.out.println(bucketLocation1);
	
	
	
	
	
	
	
	}

}
