package com.oops;

public class ClassB extends ClassA {
	public void m3()
	{
		System.out.println("Child1 specilized m3");
	}
	
	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.m1();
		b.m2();
		b.m3();
				
	}

}
