package com.inheritance;

public class SinglelevelInheritance1App {
	public static void main(String[] args) {
		SinglelevelInheritance1 teja = new SinglelevelInheritance1();	
		System.out.println("Inherited methods..........");
		teja.display1();
		teja.dispaly2();
		System.out.println("Overidden methods...........");
		teja.display4();
		System.out.println("Child Specific methods........");
		teja.display3();
	}

}
