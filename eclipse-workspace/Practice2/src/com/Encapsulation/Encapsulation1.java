package com.Encapsulation;

public class Encapsulation1 { 
private int id; //POjO class-->>plane old java object
private String name;
public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
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
public static void main(String [] args)
{
	Encapsulation1 teja = new Encapsulation1();
	teja.setId(1);
	teja.setName("Thulasi");
	System.out.println(teja.getId());
	System.out.println(teja.getName());
}
}

