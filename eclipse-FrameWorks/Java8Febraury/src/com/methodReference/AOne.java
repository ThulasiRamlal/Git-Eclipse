package com.methodReference;

public class AOne {
	public static void main(String[] args) {
		
		
		A a=AOne::m2;
		a.m1();
		
		
	}
	
	public static void m2()
	{
		System.out.println("This method from Aone in M2 method give body to  A interface m1 methods");
	}

}
