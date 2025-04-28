package com.collection3;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it doesn't allows a duplicate a values
		// it follows insertion order
		//it allows null value only once
		LinkedHashSet<String> teja = new LinkedHashSet<String>();
		teja.add("1");
		teja.add("Thulasi");
		teja.add("2");
		teja.add("kaveri");
		teja.add("3");
		teja.add(null);
		teja.add("4");
		teja.add("Suguna");
		teja.add("5");
		teja.add(null);
		System.out.println(teja);
		teja.add("Thulasi");

	}

}
