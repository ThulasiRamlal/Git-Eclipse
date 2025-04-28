package com.methodLocalInnerClass;

public class Outer {
	
	public void outerMethod()
	{
		class Inner
		{
			public void innerMethod()
			{
				System.out.println("Inner Method Executed....");
			}
		}
		Inner i=new Inner();
		i.innerMethod();
	}
	
	
	public static void main(String[]args)
	{
	
		Outer o=new Outer();
		o.outerMethod();	
	}

}
