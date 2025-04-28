package com.nonStaticInnerClass;

public class Outer2 {
	
	class Inner2
	{
		public void innerMethod()
		{
			System.out.println("Inner2 CLass method....");
		}
		
		public void innerMethod2()
		{
			
			Inner2 i=new Inner2();
			i.innerMethod();
			System.out.println("Inner2 CLass method2....");
		
			
		}
	
	}
	
	public void outerMethod()
	{
		//Creating object of Inner2 Class
		Inner2 i=new Inner2();
		i.innerMethod2();
		
		System.out.println("===============================");
		System.out.println("Outer2 class method...");
	}
	
	public static void main(String[] args) {
		
		Outer2 o=new Outer2();
		o.outerMethod();
		
		
	}

}
