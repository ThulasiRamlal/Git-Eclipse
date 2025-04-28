package com.Encapsulation;

public class Encapsulations6 {
	private int id;
	private String name;
	Encapsulations6(int id)
	{
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//fetching the data by predefined method
	public String toString()
	{
		return ("id : "+id+" name: "+name);
		
	}
	//fetching the data by user-defined method
	public void display()
	{
		System.out.println("id : "+id+" name :"+name);
	}
	public static void main(String[] args) {
		Encapsulations6 teja = new Encapsulations6(180434);
		teja.setName("Thulasi");
		System.out.println(teja.id);
		System.out.println(teja.getName());
		System.out.println("---------------------------------");
		System.out.println(teja.toString());
		System.out.println("----------------------------------");
		teja.display();
		
		
		
	}
	
	

}
