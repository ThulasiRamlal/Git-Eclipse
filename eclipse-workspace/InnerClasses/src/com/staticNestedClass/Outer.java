package com.staticNestedClass;

public class Outer {
	static String fruit="Banana";
	
	static class Inner
	{
		public static void innerMethod()
		{
			
			System.out.println("Fruit name is :"+fruit);
			
		}
	}
	
	public static void main(String[] args) {
		
		Inner i=new Inner();
		i.innerMethod();
		
	
		
		
	}
	

}
