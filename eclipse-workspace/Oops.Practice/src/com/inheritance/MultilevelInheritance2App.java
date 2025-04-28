package com.inheritance;

public class MultilevelInheritance2App {
	public static void main(String[] args) {
		MultilevelInheritance2 teja = new MultilevelInheritance2();	
		System.out.println("Inherited methods..........");
		teja.display1();
		teja.dispaly2();
		System.out.println("Overidden methods...........");
		teja.display4();
		/*
		 * System.out.println(" "); teja.display3();
		 */
		System.out.println("Child Specific methods........");
		teja.display5();
		
	}

}
