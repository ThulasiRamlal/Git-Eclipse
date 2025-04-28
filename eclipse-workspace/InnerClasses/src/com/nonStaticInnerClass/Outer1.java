package com.nonStaticInnerClass;

public class Outer1 {
	
	//Inner CLass
	class Inner1
	{
		
		//InnerClass Method
		public void innerMethod()
		{
			System.out.println("Inner CLass method...");
		}
	
	}
	
	
	//outer class method
	public void outerMethod()
	{
		System.out.println("Outer Class Method....");
	}
	
	//mainMethod
	public static void main(String[] args) {
		
		Outer1 o =new Outer1();
		o.outerMethod();
		
		Outer1.Inner1 i=new Outer1().new Inner1();
		i.innerMethod();
	
		
	}
	
	
	
}
