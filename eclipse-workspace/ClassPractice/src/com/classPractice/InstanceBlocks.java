package com.classPractice;

public class InstanceBlocks {
	String a="Thulasi";
	{
		System.out.println("My name is: "+a);
	}
	public void display()
	{
		System.out.println("Instance method1 Executed.");
	}
	static String b="Ramlal";
	static
	{
		System.out.println("my nmae is: "+b);
	}
	public static void display1()
	{
		System.out.println("Static method executed");
	}
	InstanceBlocks()

	{
		System.out.println("Constructor executed");
	}
	
	public static void main(String[] args) {
		InstanceBlocks teja = new InstanceBlocks();
		teja.display();
		teja.display1();
	}

}
