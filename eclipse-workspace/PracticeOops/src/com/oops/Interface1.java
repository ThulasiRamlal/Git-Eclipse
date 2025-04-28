package com.oops;

public interface Interface1 {
	public void method();
	public static void method2()
	{
		System.out.println("Interface method 2");
	}
	
	default void method3()
	{
		System.out.println("Interface method 3");
	}

}
