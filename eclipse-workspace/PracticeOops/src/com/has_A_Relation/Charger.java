package com.has_A_Relation;

public class Charger {
	int volt;
	String type;
	{
		volt=65;
		type="C type";
	}
	
	public void charger()
	{
		System.out.println("volt: "+volt+" type: "+type);
	}
}
