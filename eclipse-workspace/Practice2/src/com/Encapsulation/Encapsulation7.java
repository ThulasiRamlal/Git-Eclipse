package com.Encapsulation;

public class Encapsulation7 {
	//Pojo class
	private int id;
	private String name;
	Encapsulation7(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()
	{
		return id;	
	}
	public String getName()
	{
		return name;	
	}
	public static void main(String[] args) {
		Encapsulation7 teja= new Encapsulation7(12,"Tulasi");
		
		System.out.println(teja.getId());
		System.out.println(teja.getName());
	}

}
