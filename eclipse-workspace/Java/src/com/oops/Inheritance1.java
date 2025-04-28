package com.oops;

public class Inheritance1 {
	String name;
	int age;
	String degree;
	{
		name="thulasi";
		age=22;
		degree="B.tech";
	}
	public void display()
	{
		System.out.println(" grand parent method");
		System.out.println("name: "+name+" age: "+age+" degree: "+degree);
	}
	public static void display3()
	{
		System.out.println("this is static method");
	}

}
