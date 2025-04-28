package com.oops;

public class Inheritance3 extends Inheritance2 {
	public void display4(String name)
	{
		System.out.println(name+" class method");
	}
	public static void main(String[] args) {
		Inheritance3 teja=new Inheritance3();
		teja.display();
		Inheritance2.display3();
		System.out.println("==================");
teja.display2();
System.out.println("==============================");
teja.display4("child");
	}

}
