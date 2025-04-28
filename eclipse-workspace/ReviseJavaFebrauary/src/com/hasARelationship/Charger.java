package com.hasARelationship;

public class Charger {
	
	//Aggregation example class :-it is loosely bounded class
	String watt;
	String type;
	
	//INSTANCE BLOCK
	{
		watt="20 watt";
		type="c type";
	}
	

	@Override
	public String toString() {
		return "Charger [watt=" + watt + ", type=" + type + "]";
	}
	
	
	

}
