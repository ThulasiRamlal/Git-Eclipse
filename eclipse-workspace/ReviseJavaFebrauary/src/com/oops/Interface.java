package com.oops;

public interface Interface {
	
	//abstract method :-which is dont have any body of method then it is abstarct method......
	public void m1();
	public static void m2()
	{
		System.out.println("This m2 static method from Interface");
		
	}
	default void defaultMethod()
	{
		System.out.println("This m3 default method from Interface");
	}
	

}
