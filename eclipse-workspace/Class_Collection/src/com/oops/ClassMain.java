package com.oops;

public class ClassMain {
	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		ClassD d=new ClassD();
		ClassC c=new ClassC();
		
		System.out.println("==============SINGLE LEVEL====================");
		b.m1();
		b.m2();
		b.m3();
		System.out.println("=======================MULTILEVEL=================");
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println("==============HIERACHICHAL===================");
		d.m1();
		d.m2();
		d.m5();
		
	}

}
