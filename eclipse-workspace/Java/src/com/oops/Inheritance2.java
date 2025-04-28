package com.oops;

public class Inheritance2 extends Inheritance1 {
	public void display2()
	{
		System.out.println("parent class method");
	}
	
	public static void main(String[] args) {
		Inheritance2 teja=new Inheritance2();
		teja.display();
		System.out.println("====================");
		teja.display2();
		System.out.println("==========================");
		display3();
		
	}

}
