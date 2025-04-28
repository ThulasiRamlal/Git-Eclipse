package com.classPractice;

public class Demo {
	//instance variables
	int id;
	String name;
	//Constructor
	public Demo(int id,String name)
	{
		this.id=id;
	
		this.name=name;
	}
	public void display()
	{
		System.out.println("id: "+id+" name: "+name);
		
	}
	public static void main(String[] args) {
		Demo d=new Demo(10,"Anji");
		d.display();
	}
	
	
	

}
