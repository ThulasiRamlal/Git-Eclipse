package com.acessModifier;

public class Demo {
	public int a=10;
	protected int b=20;
	 int c=30;
	 private int d=40;
	 void display()
	 {
		 Demo d=new Demo();
		 System.out.println(a);
		 System.out.println("protected"+b);
		 System.out.println(c);
		 System.out.println(d);
	 }

}
