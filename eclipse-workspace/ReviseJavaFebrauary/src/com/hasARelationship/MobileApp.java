package com.hasARelationship;

public class MobileApp {
	public static void main(String[]args)
	{
		Mobile m=new Mobile(); //Composition
		Charger c=new Charger(); //Aggregation
		
	
		System.out.println("MOBILE PROPERTIES.......");
		System.out.println("Brand: "+m.brand);
		System.out.println("Cost: "+m.cost);
		System.out.println("Color: "+m.color);
		
		System.out.println("OS PROPERTIES......");
		System.out.println("Os: "+m.os.os);
		System.out.println("Version: "+m.os.version);
		
		System.out.println("CHARGER PROPERTIES....");
		System.out.println("Watt: "+c.watt);
		System.out.println("Type: "+c.type);
		
		
		
		
		
	}

}
