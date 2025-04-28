package com.oops;

public class InheritanceTest {
	public static void main(String[] args) {
		System.out.println("SINGLE LEVEL INHERITANCE");
		System.out.println();
		Inheritance2 teja=new Inheritance2();
		teja.display();
		System.out.println();
		teja.display2();
		System.out.println();
		Inheritance1.display3();
		System.out.println("=========================");
		
		System.out.println("MULTILEVEL INHERITANCE");
		
		Inheritance3 teja2=new Inheritance3();
		teja2.display();
		System.out.println();
		teja2.display2();
		System.out.println();
		teja2.display3();
		System.out.println("==============================");
		System.out.println("HIERAECHICAL INHERITANCE");
		Inheritance4 teja3=new Inheritance4();
		System.out.println();
		teja3.display();
		teja3.display3();
		System.out.println();
		System.out.println(teja3.display6("thulasi"));
	}

}
