package com.methodReference;

public class InstanceMethodOneImp {
	
	public static void main(String[] args) {
		InstanceMethodOne i= new InstanceMethodOneImp()::m2;
		i.m1();
		
		
	}
	
	public void m2()

	{
		
		System.out.println("This is m2 method body give to M1 method.");
	}
}
