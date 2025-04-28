package com.groupingBy;

public class Employee8 {
	public static void main(String[] args) {
		Employee8 teja= new Employee8();
		teja.display();
		//System.out.println("Local v);
		System.out.println("Instance variable: "+teja.a);
		System.out.println("Static variable:"+Employee8.name);
		System.out.println(teja.name);
	}
	public void display()
	{
		int a=10;
		System.out.println("Local variable:"+a);
	}
	int a=20;
	static String name="thulasi";

}
