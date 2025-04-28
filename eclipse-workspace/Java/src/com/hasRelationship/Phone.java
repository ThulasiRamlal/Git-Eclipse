package com.hasRelationship;

public class Phone {
	String brand="Asus";
	String color="Green";
	int cost=12000;
	Os os=new Os();
	public void brand()
	{
		System.out.println("Phone brand is "+brand);
		
	}
	public void color()
	{
		System.out.println("color is "+color);
		
	}
	public void cost()
	{
		System.out.println("cost is "+cost);
	}
	public static void main(String[]args)
	{
		Phone phone=new Phone();
		phone.brand();
		phone.color();
		phone.cost();
		System.out.println("=================================");
		phone.os.version();
		phone.os.name();
		System.out.println("====================================");
		new Charger().voltage();
		new Charger().length();
		
	}

}
