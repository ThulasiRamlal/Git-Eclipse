package com.collection4;
import java.util.HashSet;

public class HashSet2 {
	public static void main(String[]args)
	{
	HashSet<String>teja=new HashSet<String>();
	teja.add("Thulasi");
	teja.add("Ramlal");
	teja.add("kaveri");
	teja.add("teja");
	teja.add("Suguna");
	teja.add("Pichaiah");
	System.out.println(teja);
	System.out.println("========================");
	teja.add("Thulasi");
	teja.add(null);
	teja.add(null);
	System.out.println(teja);
	}
}
