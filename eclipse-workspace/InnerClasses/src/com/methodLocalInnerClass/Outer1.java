package com.methodLocalInnerClass;

public class Outer1 {
	
	public void outerMethod()
	{
		String friut="apple";
		
		class Inner1
		{
			public  void innerMethod()
			{
				System.out.println("Friut name is: "+friut);
			}
			
		}
		
		Inner1 i=new Inner1();
		i.innerMethod();
				
	}
	
	public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.outerMethod();
		
		
	}

}
