package com.methodReferences;
//Static method reference


@FunctionalInterface
public interface ClassA {
	
public void m1(int x,int y);
}
//==================
class ClassB{
	public static void m2(int y,int b)
	{
		System.out.println("Multiplication: "+y*b);
	}
}
