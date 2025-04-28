package com.oops;

public class ClassC extends ClassB {
	
	public void m4()
	{
		System.out.println("child2 m4");
	}
	public static void main(String[] args) {
		ClassC c=new ClassC();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
	

}
