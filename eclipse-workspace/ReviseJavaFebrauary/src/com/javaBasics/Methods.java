
package com.javaBasics;

public class Methods {
	public static void main(String[] args) {
		Methods.m1();
		System.out.println();
		Methods.m2("Ramlal");
		System.out.println();
		System.out.println(Methods.m3());
		System.out.println();
		System.out.println(Methods.m4("Ramlal"));
	}
	
//	 Method :- method is a set of instruction or set of code which is perform in specfic task.
//	 1.static methods :-which are declared method signature along with static key word
//	 2.instance methods :- which are declared method signature without any static key word..
	
	public static void m1()
	{
		System.out.println("without parameters and with return type");
		//here input means:- Parameters  output :return type
	}
	
	public static void m2(String name)
	{
		System.out.println("without parameter and without return type..."+name);
	}
	
	public static String m3()
	{
		return"without parameter and with return type..";
	}
	
	public static String m4(String name)
	{
		return "with parameter and with return type...."+name;
	}
	
	
}
